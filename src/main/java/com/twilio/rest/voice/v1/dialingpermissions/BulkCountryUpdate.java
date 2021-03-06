/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.voice.v1.dialingpermissions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkCountryUpdate extends Resource {
    private static final long serialVersionUID = 82168182663718L;

    /**
     * Create a BulkCountryUpdateCreator to execute create.
     *
     * @param updateRequest URL encoded JSON array of update objects
     * @return BulkCountryUpdateCreator capable of executing the create
     */
    public static BulkCountryUpdateCreator creator(final String updateRequest) {
        return new BulkCountryUpdateCreator(updateRequest);
    }

    /**
     * Converts a JSON String into a BulkCountryUpdate object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return BulkCountryUpdate object represented by the provided JSON
     */
    public static BulkCountryUpdate fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BulkCountryUpdate.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a BulkCountryUpdate object using the
     * provided ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return BulkCountryUpdate object represented by the provided JSON
     */
    public static BulkCountryUpdate fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, BulkCountryUpdate.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final Integer updateCount;
    private final String updateRequest;

    @JsonCreator
    private BulkCountryUpdate(@JsonProperty("update_count")
                              final Integer updateCount,
                              @JsonProperty("update_request")
                              final String updateRequest) {
        this.updateCount = updateCount;
        this.updateRequest = updateRequest;
    }

    /**
     * Returns The number of countries updated.
     *
     * @return The number of countries updated
     */
    public final Integer getUpdateCount() {
        return this.updateCount;
    }

    /**
     * Returns A URL encoded JSON array of update objects.
     *
     * @return A URL encoded JSON array of update objects
     */
    public final String getUpdateRequest() {
        return this.updateRequest;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BulkCountryUpdate other = (BulkCountryUpdate) o;

        return Objects.equals(updateCount, other.updateCount) &&
               Objects.equals(updateRequest, other.updateRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateCount,
                            updateRequest);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("updateCount", updateCount)
                          .add("updateRequest", updateRequest)
                          .toString();
    }
}