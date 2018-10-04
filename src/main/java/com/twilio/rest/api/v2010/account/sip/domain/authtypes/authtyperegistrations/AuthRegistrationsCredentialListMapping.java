/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.sip.domain.authtypes.authtyperegistrations;

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
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthRegistrationsCredentialListMapping extends Resource {
    private static final long serialVersionUID = 271887954844194L;

    /**
     * Create a AuthRegistrationsCredentialListMappingCreator to execute create.
     * 
     * @param pathAccountSid The account_sid
     * @param pathDomainSid The domain_sid
     * @param credentialListSid A string that uniquely identifies credential list
     *                          resource
     * @return AuthRegistrationsCredentialListMappingCreator capable of executing
     *         the create
     */
    public static AuthRegistrationsCredentialListMappingCreator creator(final String pathAccountSid, 
                                                                        final String pathDomainSid, 
                                                                        final String credentialListSid) {
        return new AuthRegistrationsCredentialListMappingCreator(pathAccountSid, pathDomainSid, credentialListSid);
    }

    /**
     * Create a AuthRegistrationsCredentialListMappingCreator to execute create.
     * 
     * @param pathDomainSid The domain_sid
     * @param credentialListSid A string that uniquely identifies credential list
     *                          resource
     * @return AuthRegistrationsCredentialListMappingCreator capable of executing
     *         the create
     */
    public static AuthRegistrationsCredentialListMappingCreator creator(final String pathDomainSid, 
                                                                        final String credentialListSid) {
        return new AuthRegistrationsCredentialListMappingCreator(pathDomainSid, credentialListSid);
    }

    /**
     * Create a AuthRegistrationsCredentialListMappingReader to execute read.
     * 
     * @param pathAccountSid The account_sid
     * @param pathDomainSid The domain_sid
     * @return AuthRegistrationsCredentialListMappingReader capable of executing
     *         the read
     */
    public static AuthRegistrationsCredentialListMappingReader reader(final String pathAccountSid, 
                                                                      final String pathDomainSid) {
        return new AuthRegistrationsCredentialListMappingReader(pathAccountSid, pathDomainSid);
    }

    /**
     * Create a AuthRegistrationsCredentialListMappingReader to execute read.
     * 
     * @param pathDomainSid The domain_sid
     * @return AuthRegistrationsCredentialListMappingReader capable of executing
     *         the read
     */
    public static AuthRegistrationsCredentialListMappingReader reader(final String pathDomainSid) {
        return new AuthRegistrationsCredentialListMappingReader(pathDomainSid);
    }

    /**
     * Create a AuthRegistrationsCredentialListMappingFetcher to execute fetch.
     * 
     * @param pathAccountSid The account_sid
     * @param pathDomainSid The domain_sid
     * @param pathSid Fetch by unique credential list Sid
     * @return AuthRegistrationsCredentialListMappingFetcher capable of executing
     *         the fetch
     */
    public static AuthRegistrationsCredentialListMappingFetcher fetcher(final String pathAccountSid, 
                                                                        final String pathDomainSid, 
                                                                        final String pathSid) {
        return new AuthRegistrationsCredentialListMappingFetcher(pathAccountSid, pathDomainSid, pathSid);
    }

    /**
     * Create a AuthRegistrationsCredentialListMappingFetcher to execute fetch.
     * 
     * @param pathDomainSid The domain_sid
     * @param pathSid Fetch by unique credential list Sid
     * @return AuthRegistrationsCredentialListMappingFetcher capable of executing
     *         the fetch
     */
    public static AuthRegistrationsCredentialListMappingFetcher fetcher(final String pathDomainSid, 
                                                                        final String pathSid) {
        return new AuthRegistrationsCredentialListMappingFetcher(pathDomainSid, pathSid);
    }

    /**
     * Create a AuthRegistrationsCredentialListMappingDeleter to execute delete.
     * 
     * @param pathAccountSid The account_sid
     * @param pathDomainSid The domain_sid
     * @param pathSid Delete by unique credential list Sid
     * @return AuthRegistrationsCredentialListMappingDeleter capable of executing
     *         the delete
     */
    public static AuthRegistrationsCredentialListMappingDeleter deleter(final String pathAccountSid, 
                                                                        final String pathDomainSid, 
                                                                        final String pathSid) {
        return new AuthRegistrationsCredentialListMappingDeleter(pathAccountSid, pathDomainSid, pathSid);
    }

    /**
     * Create a AuthRegistrationsCredentialListMappingDeleter to execute delete.
     * 
     * @param pathDomainSid The domain_sid
     * @param pathSid Delete by unique credential list Sid
     * @return AuthRegistrationsCredentialListMappingDeleter capable of executing
     *         the delete
     */
    public static AuthRegistrationsCredentialListMappingDeleter deleter(final String pathDomainSid, 
                                                                        final String pathSid) {
        return new AuthRegistrationsCredentialListMappingDeleter(pathDomainSid, pathSid);
    }

    /**
     * Converts a JSON String into a AuthRegistrationsCredentialListMapping object
     * using the provided ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return AuthRegistrationsCredentialListMapping object represented by the
     *         provided JSON
     */
    public static AuthRegistrationsCredentialListMapping fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AuthRegistrationsCredentialListMapping.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a AuthRegistrationsCredentialListMapping
     * object using the provided ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return AuthRegistrationsCredentialListMapping object represented by the
     *         provided JSON
     */
    public static AuthRegistrationsCredentialListMapping fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AuthRegistrationsCredentialListMapping.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String friendlyName;
    private final String sid;

    @JsonCreator
    private AuthRegistrationsCredentialListMapping(@JsonProperty("account_sid")
                                                   final String accountSid, 
                                                   @JsonProperty("date_created")
                                                   final String dateCreated, 
                                                   @JsonProperty("date_updated")
                                                   final String dateUpdated, 
                                                   @JsonProperty("friendly_name")
                                                   final String friendlyName, 
                                                   @JsonProperty("sid")
                                                   final String sid) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.sid = sid;
    }

    /**
     * Returns The The unique sid that identifies this account.
     * 
     * @return The unique sid that identifies this account
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The date this resource was created.
     * 
     * @return The date this resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date this resource was last updated.
     * 
     * @return The date this resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The A human readable description of this resource.
     * 
     * @return A human readable description of this resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The A string that uniquely identifies this resource.
     * 
     * @return A string that uniquely identifies this resource
     */
    public final String getSid() {
        return this.sid;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AuthRegistrationsCredentialListMapping other = (AuthRegistrationsCredentialListMapping) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(sid, other.sid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            sid);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("friendlyName", friendlyName)
                          .add("sid", sid)
                          .toString();
    }
}