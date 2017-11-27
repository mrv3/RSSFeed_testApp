package com.vic3e.app.rss_test.m_UI;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.vic3e.app.rss_test.R;

/**
 * Created by Victory on 11/27/2017.
 */

public class PicassoClient {

    public static void downloadImage(Context c, String imageUrl, ImageView img){

        if (imageUrl != null && imageUrl.length()>0){

            Picasso.with(c).load(imageUrl)
                    .placeholder(R.drawable.ic_launcher_background)
                    .resize(150,150)
                    .into(img);
        } else {
            Picasso.with(c)
                    .load(R.drawable.ic_launcher_background)
                    .resize(50,50)
                    .into(img);
        }
    }
}
