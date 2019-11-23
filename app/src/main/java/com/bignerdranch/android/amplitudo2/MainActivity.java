package com.bignerdranch.android.amplitudo2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView articlesRecyclerView;
    TextView title, description, imageUrl;
    Button btnInput;

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

        articles.add(new Article("Ekskluzivno",text,"https://vignette.wikia.nocookie.net/animecross2roblox/images/e/eb/Base_Goku.png"));
        articles.add(new Article("Najnovije", text, "https://vignette.wikia.nocookie.net/animecross2roblox/images/e/eb/Base_Goku.png"));
        articles.add(new Article("Skandal", text, "https://vignette.wikia.nocookie.net/animecross2roblox/images/e/eb/Base_Goku.png"));

        ArticlesAdapter articlesAdapter = new ArticlesAdapter(this, articles);
        articlesRecyclerView.setAdapter(articlesAdapter);

        articles.add(new Article("Test1",text, "test.png"));
        articles.add(new Article("Test2",text));
        articlesAdapter.notifyDataSetChanged();

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                articles.add(new Article(title.toString(), description.toString(), imageUrl.toString()));
            }
        });


    }

    public void findViewsById() {

        title = findViewById(R.id.txt_for_title_input);
        description = findViewById(R.id.txt_for_description_input);
        imageUrl = findViewById(R.id.txt_for_image_url_input);
        btnInput = findViewById(R.id.btn_input);
        articlesRecyclerView = findViewById(R.id.articlesRecyclerView);

    }
}