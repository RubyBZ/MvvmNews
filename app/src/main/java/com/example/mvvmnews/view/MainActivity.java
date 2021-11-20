package com.example.mvvmnews.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.example.mvvmnews.R;
import com.example.mvvmnews.adapter.ArticleAdapter;
import com.example.mvvmnews.model.Article;
import com.example.mvvmnews.viewmodel.ArticleViewModel;

import java.util.ArrayList;
import java.util.List;

//Your API key is: aa57c16029c748d9897fa2a7f3342963

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    private LinearLayoutManager layoutManager;
    private ArrayList<Article> articleArrayList = new ArrayList<>();
    ArticleViewModel articleViewModel;
    private ArticleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getArticles();
    }

    private void getArticles() {

        articleViewModel.getBashboardNewsResponseLiveData().observe(this,articleResponse -> {
            if(articleResponse != null && articleResponse.getArticles()!= null
            && !articleResponse.getArticles().isEmpty()) {
                progressBar.setVisibility(View.GONE);
                List<Article> articleList = articleResponse.getArticles();
                articleArrayList.addAll(articleList);
                adapter.notifyDataSetChanged();
            }
        });

    }


    private void init() {
        progressBar = findViewById(R.id.progressBar);
        recyclerView = findViewById(R.id.recycleView);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);
        adapter = new ArticleAdapter(MainActivity.this,articleArrayList);
        recyclerView.setAdapter(adapter);
        articleViewModel = ViewModelProviders.of(this).get(ArticleViewModel.class);

    }
}