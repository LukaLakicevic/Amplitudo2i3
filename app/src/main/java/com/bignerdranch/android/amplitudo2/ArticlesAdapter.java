package com.bignerdranch.android.amplitudo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ArticleViewHolder> {

    private Context context;
    private ArrayList<Article> articles;

    public ArticlesAdapter(Context context, ArrayList<Article> articles) {
        this.context = context;
        this.articles = articles;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_post_item, parent, false);
        return new ArticleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        final Article article = articles.get(position);

        holder.ArticleTitleTxtView.setText(article.getTitle());
        holder.ArticleDescriptionTxtView.setText(article.getDescription().substring(0, 80));

            Glide.with(context)
                    .load(article.getImage())
                    .into(holder.ArticleImgView);

        if(article.getType() == 0) {
            holder.ArticleDescriptionTxtView.setVisibility(View.VISIBLE);
            holder.ArticleImgView.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
                                                                                                    /* Mogli smo i kreirati jos jednu
                                                                                                    * klasu koja bi se zvala
                                                                                                    * "Article2ViewHolder" i napraviti
                                                                                                    * metode onCreate i onBind
                                                                                                    * za drugacije potrebe holdera ili
                                                                                                    * postaviti pitanje prije inflatera
                                                                                                    * u onCreateViewHolder koji xml da
                                                                                                    * iskoristi (u slucaju da napravimo
                                                                                                    * vise opcija) */
    static class ArticleViewHolder extends ViewHolder {

        TextView ArticleTitleTxtView;
        TextView ArticleDescriptionTxtView;
        ImageView ArticleImgView;

        ArticleViewHolder(@NonNull View itemView) {
            super(itemView);
            ArticleTitleTxtView = itemView.findViewById(R.id.text_title);
            ArticleDescriptionTxtView = itemView.findViewById(R.id.text_description);
            ArticleImgView = itemView.findViewById(R.id.text_img);
        }
    }

}
