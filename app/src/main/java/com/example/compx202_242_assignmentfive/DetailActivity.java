package com.example.compx202_242_assignmentfive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Get the position passed through by the ListActivity
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        //Debugging
        //Toast.makeText(this, position, Toast.LENGTH_SHORT).show();

        //Get Views from the ActivityDetail.XML
        ImageView bannerView = (ImageView) findViewById(R.id.detail_activity_imageview_banner);
        TextView titleView = (TextView) findViewById(R.id.detail_activity_textview_title);
        TextView contentView = (TextView) findViewById(R.id.detail_activity_textview_content);

        //Get the string values of the value (CS, Design, Maths, etc) clicked from the arrays.xml
        String title = getResources().getStringArray(R.array.string_array_titles)[position];
        String content = getResources().getStringArray(R.array.string_array_content)[position];
        String banner = getResources().getStringArray(R.array.string_array_banners)[position];

        //Get the image from the drawables folder
        int res = getResources().getIdentifier(banner, "drawable", this.getPackageName());

        //Set the values in the Detail Activity
        bannerView.setImageResource(res);
        titleView.setText(title);
        contentView.setText(content);



    }
}