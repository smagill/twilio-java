/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.conversation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message extends Resource {
    private static final long serialVersionUID = 205187398023238L;

    public enum WebhookEnabledType {
        TRUE("true"),
        FALSE("false");

        private final String value;

        private WebhookEnabledType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a WebhookEnabledType from a string.
         * @param value string value
         * @return generated WebhookEnabledType
         */
        @JsonCreator
        public static WebhookEnabledType forValue(final String value) {
            return Promoter.enumFromString(value, WebhookEnabledType.values());
        }
    }

    /**
     * Create a MessageCreator to execute create.
     *
     * @param pathConversationSid The unique id of the Conversation for this
     *                            message.
     * @return MessageCreator capable of executing the create
     */
    public static MessageCreator creator(final String pathConversationSid) {
        return new MessageCreator(pathConversationSid);
    }

    /**
     * Create a MessageUpdater to execute update.
     *
     * @param pathConversationSid The unique id of the Conversation for this
     *                            message.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return MessageUpdater capable of executing the update
     */
    public static MessageUpdater updater(final String pathConversationSid,
                                         final String pathSid) {
        return new MessageUpdater(pathConversationSid, pathSid);
    }

    /**
     * Create a MessageDeleter to execute delete.
     *
     * @param pathConversationSid The unique id of the Conversation for this
     *                            message.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return MessageDeleter capable of executing the delete
     */
    public static MessageDeleter deleter(final String pathConversationSid,
                                         final String pathSid) {
        return new MessageDeleter(pathConversationSid, pathSid);
    }

    /**
     * Create a MessageFetcher to execute fetch.
     *
     * @param pathConversationSid The unique id of the Conversation for this
     *                            message.
     * @param pathSid A 34 character string that uniquely identifies this resource.
     * @return MessageFetcher capable of executing the fetch
     */
    public static MessageFetcher fetcher(final String pathConversationSid,
                                         final String pathSid) {
        return new MessageFetcher(pathConversationSid, pathSid);
    }

    /**
     * Create a MessageReader to execute read.
     *
     * @param pathConversationSid The unique id of the Conversation for messages.
     * @return MessageReader capable of executing the read
     */
    public static MessageReader reader(final String pathConversationSid) {
        return new MessageReader(pathConversationSid);
    }

    /**
     * Converts a JSON String into a Message object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Message object represented by the provided JSON
     */
    public static Message fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Message object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Message object represented by the provided JSON
     */
    public static Message fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Message.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String conversationSid;
    private final String sid;
    private final Integer index;
    private final String author;
    private final String body;
    private final List<Map<String, Object>> media;
    private final String attributes;
    private final String participantSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private Message(@JsonProperty("account_sid")
                    final String accountSid,
                    @JsonProperty("conversation_sid")
                    final String conversationSid,
                    @JsonProperty("sid")
                    final String sid,
                    @JsonProperty("index")
                    final Integer index,
                    @JsonProperty("author")
                    final String author,
                    @JsonProperty("body")
                    final String body,
                    @JsonProperty("media")
                    final List<Map<String, Object>> media,
                    @JsonProperty("attributes")
                    final String attributes,
                    @JsonProperty("participant_sid")
                    final String participantSid,
                    @JsonProperty("date_created")
                    final String dateCreated,
                    @JsonProperty("date_updated")
                    final String dateUpdated,
                    @JsonProperty("url")
                    final URI url) {
        this.accountSid = accountSid;
        this.conversationSid = conversationSid;
        this.sid = sid;
        this.index = index;
        this.author = author;
        this.body = body;
        this.media = media;
        this.attributes = attributes;
        this.participantSid = participantSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

    /**
     * Returns The unique id of the Account responsible for this message..
     *
     * @return The unique id of the Account responsible for this message.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The unique id of the Conversation for this message..
     *
     * @return The unique id of the Conversation for this message.
     */
    public final String getConversationSid() {
        return this.conversationSid;
    }

    /**
     * Returns A 34 character string that uniquely identifies this resource..
     *
     * @return A 34 character string that uniquely identifies this resource.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The index of the message within the Conversation..
     *
     * @return The index of the message within the Conversation.
     */
    public final Integer getIndex() {
        return this.index;
    }

    /**
     * Returns The channel specific identifier of the message's author..
     *
     * @return The channel specific identifier of the message's author.
     */
    public final String getAuthor() {
        return this.author;
    }

    /**
     * Returns The content of the message..
     *
     * @return The content of the message.
     */
    public final String getBody() {
        return this.body;
    }

    /**
     * Returns An array of objects that describe the Message's media if attached,
     * otherwise, null..
     *
     * @return An array of objects that describe the Message's media if attached,
     *         otherwise, null.
     */
    public final List<Map<String, Object>> getMedia() {
        return this.media;
    }

    /**
     * Returns A string metadata field you can use to store any data you wish..
     *
     * @return A string metadata field you can use to store any data you wish.
     */
    public final String getAttributes() {
        return this.attributes;
    }

    /**
     * Returns The unique id of messages's author participant..
     *
     * @return The unique id of messages's author participant.
     */
    public final String getParticipantSid() {
        return this.participantSid;
    }

    /**
     * Returns The date that this resource was created..
     *
     * @return The date that this resource was created.
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date that this resource was last updated..
     *
     * @return The date that this resource was last updated.
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns An absolute URL for this message..
     *
     * @return An absolute URL for this message.
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Message other = (Message) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(conversationSid, other.conversationSid) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(index, other.index) &&
               Objects.equals(author, other.author) &&
               Objects.equals(body, other.body) &&
               Objects.equals(media, other.media) &&
               Objects.equals(attributes, other.attributes) &&
               Objects.equals(participantSid, other.participantSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            conversationSid,
                            sid,
                            index,
                            author,
                            body,
                            media,
                            attributes,
                            participantSid,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("conversationSid", conversationSid)
                          .add("sid", sid)
                          .add("index", index)
                          .add("author", author)
                          .add("body", body)
                          .add("media", media)
                          .add("attributes", attributes)
                          .add("participantSid", participantSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}