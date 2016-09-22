package com.vk.api.sdk.queries.friends;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.friends.responses.GetSuggestionsResponse;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Friends.getSuggestions method
 */
public class FriendsGetSuggestionsQuery extends AbstractQueryBuilder<FriendsGetSuggestionsQuery, GetSuggestionsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public FriendsGetSuggestionsQuery(VkApiClient client, Actor actor) {
        super(client, "friends.getSuggestions", GetSuggestionsResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Types of potential friends to return:
     * ''mutual'' - users with many mutual friends
     * ''contacts'' - users found with the account.importContacts]] method
     * ''mutual_contacts'' - users who imported the same contacts as the current user with the [[account.importContacts method
     *
     * @param value value of "filter" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetSuggestionsQuery filter(String... value) {
        return unsafeParam("filter", value);
    }

    /**
     * Number of suggestions to return.
     *
     * @param value value of "count" parameter. Maximum is 500. Minimum is 0. By default 500.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetSuggestionsQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of suggestions.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetSuggestionsQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    /**
     * Profile fields to return. Sample values: ''nickname'', ''screen_name'', ''sex'', ''bdate'' (birthdate), ''city'', ''country'', ''timezone'', ''photo'', ''photo_medium'', ''photo_big'', ''has_mobile'', ''rate'', ''contacts'', ''education'', ''online'', ''counters''.
     *
     * @param value value of "fields" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetSuggestionsQuery fields(UserField... value) {
        return unsafeParam("fields", value);
    }

    /**
     * Case for declension of user name and surname:
     * ''nom'' - nominative (default)
     * ''gen'' - genitive
     * ''dat'' - dative
     * ''acc'' - accusative
     * ''ins'' - instrumental
     * ''abl'' - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public FriendsGetSuggestionsQuery nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected FriendsGetSuggestionsQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
