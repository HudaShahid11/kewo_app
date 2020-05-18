package com.example.kewo;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by Belal on 11/5/2015.
 */
public interface signin_api {
    @FormUrlEncoded
    @POST("/apps/signin")
    public void insertUser(

            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,

            Callback<Response> callback);
}
