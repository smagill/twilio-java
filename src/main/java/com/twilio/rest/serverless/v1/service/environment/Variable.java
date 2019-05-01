/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.serverless.v1.service.environment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
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
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Variable extends Resource {
    private static final long serialVersionUID = 42792745498769L;

    /**
     * Create a VariableReader to execute read.
     * 
     * @param pathServiceSid Service Sid.
     * @param pathEnvironmentSid Environment Sid.
     * @return VariableReader capable of executing the read
     */
    public static VariableReader reader(final String pathServiceSid, 
                                        final String pathEnvironmentSid) {
        return new VariableReader(pathServiceSid, pathEnvironmentSid);
    }

    /**
     * Create a VariableFetcher to execute fetch.
     * 
     * @param pathServiceSid Service Sid.
     * @param pathEnvironmentSid Environment Sid.
     * @param pathSid Variable Sid.
     * @return VariableFetcher capable of executing the fetch
     */
    public static VariableFetcher fetcher(final String pathServiceSid, 
                                          final String pathEnvironmentSid, 
                                          final String pathSid) {
        return new VariableFetcher(pathServiceSid, pathEnvironmentSid, pathSid);
    }

    /**
     * Create a VariableCreator to execute create.
     * 
     * @param pathServiceSid Service Sid.
     * @param pathEnvironmentSid Environment Sid.
     * @param key A string by which this Variable can be referenced.
     * @param value A string that contains the actual value of this Variable.
     * @return VariableCreator capable of executing the create
     */
    public static VariableCreator creator(final String pathServiceSid, 
                                          final String pathEnvironmentSid, 
                                          final String key, 
                                          final String value) {
        return new VariableCreator(pathServiceSid, pathEnvironmentSid, key, value);
    }

    /**
     * Create a VariableUpdater to execute update.
     * 
     * @param pathServiceSid Service Sid.
     * @param pathEnvironmentSid Environment Sid.
     * @param pathSid Variable Sid.
     * @return VariableUpdater capable of executing the update
     */
    public static VariableUpdater updater(final String pathServiceSid, 
                                          final String pathEnvironmentSid, 
                                          final String pathSid) {
        return new VariableUpdater(pathServiceSid, pathEnvironmentSid, pathSid);
    }

    /**
     * Converts a JSON String into a Variable object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Variable object represented by the provided JSON
     */
    public static Variable fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Variable.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Variable object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Variable object represented by the provided JSON
     */
    public static Variable fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Variable.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String serviceSid;
    private final String environmentSid;
    private final String key;
    private final String value;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private Variable(@JsonProperty("sid")
                     final String sid, 
                     @JsonProperty("account_sid")
                     final String accountSid, 
                     @JsonProperty("service_sid")
                     final String serviceSid, 
                     @JsonProperty("environment_sid")
                     final String environmentSid, 
                     @JsonProperty("key")
                     final String key, 
                     @JsonProperty("value")
                     final String value, 
                     @JsonProperty("date_created")
                     final String dateCreated, 
                     @JsonProperty("date_updated")
                     final String dateUpdated, 
                     @JsonProperty("url")
                     final URI url) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.serviceSid = serviceSid;
        this.environmentSid = environmentSid;
        this.key = key;
        this.value = value;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

    /**
     * Returns The Variable Sid..
     * 
     * @return Variable Sid.
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The Account Sid..
     * 
     * @return Account Sid.
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The Service Sid..
     * 
     * @return Service Sid.
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The Environment Sid..
     * 
     * @return Environment Sid.
     */
    public final String getEnvironmentSid() {
        return this.environmentSid;
    }

    /**
     * Returns The A string by which this Variable can be referenced..
     * 
     * @return A string by which this Variable can be referenced.
     */
    public final String getKey() {
        return this.key;
    }

    /**
     * Returns The A string that contains the actual value of this Variable..
     * 
     * @return A string that contains the actual value of this Variable.
     */
    public final String getValue() {
        return this.value;
    }

    /**
     * Returns The The date that this Variable was created..
     * 
     * @return The date that this Variable was created.
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date that this Variable was updated..
     * 
     * @return The date that this Variable was updated.
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The URL of this Variable..
     * 
     * @return The URL of this Variable.
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

        Variable other = (Variable) o;

        return Objects.equals(sid, other.sid) && 
               Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(environmentSid, other.environmentSid) && 
               Objects.equals(key, other.key) && 
               Objects.equals(value, other.value) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            serviceSid,
                            environmentSid,
                            key,
                            value,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("accountSid", accountSid)
                          .add("serviceSid", serviceSid)
                          .add("environmentSid", environmentSid)
                          .add("key", key)
                          .add("value", value)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}