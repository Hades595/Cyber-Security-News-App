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

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        //Toast.makeText(this, position, Toast.LENGTH_SHORT).show();

        ImageView bannerView = (ImageView)findViewById(R.id.detail_activity_imageview_banner);
        TextView titleView = (TextView) findViewById(R.id.detail_activity_textview_title);
        TextView contentView = (TextView) findViewById(R.id.detail_activity_textview_content);

        String title = getResources().getStringArray(R.array.string_array_titles)[position];
        String content = getResources().getStringArray(R.array.string_array_content)[position];
        String banner = getResources().getStringArray(R.array.string_array_banners)[position];

        int res = getResources().getIdentifier(banner, "drawable", this.getPackageName());
        bannerView.setImageResource(res);

        titleView.setText(title);
        contentView.setText(content);



    }
}