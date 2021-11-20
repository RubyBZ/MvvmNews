package com.example.mvvmnews.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.mvvmnews.Response.ArticleResponse;
import com.example.mvvmnews.model.Article;
import com.example.mvvmnews.repository.ArticleRepository;

public class ArticleViewModel extends AndroidViewModel {

    private ArticleRepository articleRepository;
    private LiveData<ArticleResponse> articleResponseLiveData;

    public ArticleViewModel(@NonNull Application application) {
        super(application);

        articleRepository = new ArticleRepository();
        this.articleResponseLiveData = articleRepository.getDashboardNews();
    }

    public LiveData<ArticleResponse> getBashboardNewsResponseLiveData() {
        return articleResponseLiveData;
    }
}


