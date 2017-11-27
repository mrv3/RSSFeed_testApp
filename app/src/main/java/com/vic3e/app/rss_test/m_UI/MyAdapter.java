package com.vic3e.app.rss_test.m_UI;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vic3e.app.rss_test.R;
import com.vic3e.app.rss_test.mDataObject.Article;
import java.util.ArrayList;

import com.vic3e.app.rss_test.mDataObject.Article;

/**
 * Created by Victory on 11/27/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context c;
    ArrayList<Article> articles;
    Context ctx;

    public View view;
    public ClipData.Item currentItem;

    private CardView cardView;

    public MyAdapter(Context c, ArrayList<Article> articles) {
        this.c = c;
        this.articles = articles;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_view);
        }
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Article article=articles.get(position);
        String title=article.getTitle();
        String desc=article.getDescription();
        String date=article.getDate();
        String weblink =article.getWeblink();
        String imageUrl=article.getImageUrl();//.replace("localhost","10.0.2.2");
        holder.titleTxt.setText(title);
        holder.desctxt.setText(desc.substring(0,130));
        holder.dateTxt.setText(date);

      // // holder.currentItem = items.get(position);
        PicassoClient.downloadImage(c,imageUrl,holder.img);

        holder.titleTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implement onClick
                System.out.println("Clicked");
                Toast.makeText(c, "" + article.getWeblink(), Toast.LENGTH_LONG).show();

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(article.getWeblink()));
                c.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

}