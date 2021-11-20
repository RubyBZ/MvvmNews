package com.example.mvvmnews.retrofit;

import static com.example.mvvmnews.constants.AppConstant.API_KEY;

import com.example.mvvmnews.Response.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("top-headlines?country=us&category=business&apiKey="+API_KEY)
    Call<ArticleResponse> getTopHeadlines();
}
