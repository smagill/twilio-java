/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.twilio.base.Creator;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class TaskCreator extends Creator<Task> {
    private final String pathWorkspaceSid;
    private Integer timeout;
    private Integer priority;
    private String taskChannel;
    private String workflowSid;
    private String attributes;

    /**
     * Construct a new TaskCreator.
     *
     * @param pathWorkspaceSid The SID of the Workspace that the new Task belongs to
     */
    public TaskCreator(final String pathWorkspaceSid) {
        this.pathWorkspaceSid = pathWorkspaceSid;
    }

    /**
     * The amount of time in seconds the new task is allowed to live. Can be up to a
     * maximum of 2 weeks (1,209,600 seconds). The default value is 24 hours (86,400
     * seconds). On timeout, the `task.canceled` event will fire with description
     * `Task TTL Exceeded`..
     *
     * @param timeout The amount of time in seconds the task is allowed to live
     * @return this
     */
    public TaskCreator setTimeout(final Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * The priority to assign the new task and override the default. When supplied,
     * the new Task will have this priority unless it matches a Workflow Target with
     * a Priority set. When not supplied, the new Task will have the priority of the
     * matching Workflow Target. Value can be 0 to 2^31^ (2,147,483,647)..
     *
     * @param priority The priority to assign the new task and override the default
     * @return this
     */
    public TaskCreator setPriority(final Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * When MultiTasking is enabled, specify the TaskChannel by passing either its
     * `unique_name` or `sid`. Default value is `default`..
     *
     * @param taskChannel When MultiTasking is enabled specify the TaskChannel by
     *                    passing either its unique_name or SID
     * @return this
     */
    public TaskCreator setTaskChannel(final String taskChannel) {
        this.taskChannel = taskChannel;
        return this;
    }

    /**
     * The SID of the Workflow that you would like to handle routing for the new
     * Task. If there is only one Workflow defined for the Workspace that you are
     * posting the new task to, this parameter is optional..
     *
     * @param workflowSid The SID of the Workflow that you would like to handle
     *                    routing for the new Task
     * @return this
     */
    public TaskCreator setWorkflowSid(final String workflowSid) {
        this.workflowSid = workflowSid;
        return this;
    }

    /**
     * A URL-encoded JSON string with the attributes of the new task. This value is
     * passed to the Workflow's `assignment_callback_url` when the Task is assigned
     * to a Worker. For example: `{ "task_type": "call", "twilio_call_sid": "CAxxx",
     * "customer_ticket_number": "12345" }`..
     *
     * @param attributes A URL-encoded JSON string describing the attributes of the
     *                   task
     * @return this
     */
    public TaskCreator setAttributes(final String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the create.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Created Task
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Task create(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.TASKROUTER.toString(),
            "/v1/Workspaces/" + this.pathWorkspaceSid + "/Tasks",
            client.getRegion()
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Task creation failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Task.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (timeout != null) {
            request.addPostParam("Timeout", timeout.toString());
        }

        if (priority != null) {
            request.addPostParam("Priority", priority.toString());
        }

        if (taskChannel != null) {
            request.addPostParam("TaskChannel", taskChannel);
        }

        if (workflowSid != null) {
            request.addPostParam("WorkflowSid", workflowSid);
        }

        if (attributes != null) {
            request.addPostParam("Attributes", attributes);
        }
    }
}