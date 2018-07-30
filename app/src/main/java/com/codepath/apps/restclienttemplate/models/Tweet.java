package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Tweet {
    //list out the attributes
    public  String body;
    public long uid; //database id for tweet
    public String createAt;
    public User user;

    //deserialize the JSON
    public static Tweet fromJSON(JSONObject jsonObject)  throws JSONException {
        Tweet tweet= new Tweet();

        tweet.body= jsonObject.getString("text");
        tweet.uid = jsonObject.getLong("id");
        tweet.createAt = jsonObject.getString("created_at");
        tweet.user =User.fromJSON(jsonObject.getJSONObject("user"));
        return tweet;
    }
}

