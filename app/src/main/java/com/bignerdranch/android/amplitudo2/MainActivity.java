package com.bignerdranch.android.amplitudo2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView articlesRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewsById();

        final ArrayList<Article> articles = new ArrayList<>();

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        articlesRecyclerView.setLayoutManager(linearLayoutManager);

        String text;
        text = getString(R.string.template_description);

        articles.add(new Article("Ekskluzivno",text,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEvdpaQv9UqLTUNPNV1SBxZGH_yE_HoFGXLP80sFyvdaDODKkr&s"));
        articles.add(new Article("Najnovije", text));
        articles.add(new Article("Skandal", text, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEvdpaQv9UqLTUNPNV1SBxZGH_yE_HoFGXLP80sFyvdaDODKkr&s"));

        ArticlesAdapter articlesAdapter = new ArticlesAdapter(this, articles);
        articlesRecyclerView.setAdapter(articlesAdapter);

        articles.add(new Article("Test1",text));
        articles.add(new Article("Test2",text));
        articlesAdapter.notifyDataSetChanged();




    }

    public void findViewsById() {

        articlesRecyclerView = findViewById(R.id.articlesRecyclerView);

    }
}