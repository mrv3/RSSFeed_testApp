package com.vic3e.app.rss_test.m_UI;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.vic3e.app.rss_test.R;

/**
 * Created by Victory on 11/27/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView titleTxt,desctxt,dateTxt;
    ImageView img;
    Button readmore1;
    //public View cardView;
   // private CardView cardView;
    public View cardView;
    public View readmore;

    public MyViewHolder(View itemView) {
        super(itemView);
        titleTxt= (TextView) itemView.findViewById(R.id.titleTxt);
        desctxt= (TextView) itemView.findViewById(R.id.descTxt);
        dateTxt= (TextView) itemView.findViewById(R.id.dateTxt);
        img= (ImageView) itemView.findViewById(R.id.articleImage);
        readmore1 = (Button)itemView.findViewById(R.id.readMore);
    }
}
