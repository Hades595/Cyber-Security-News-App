package com.example.compx202_242_assignmentfive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Start the list activity
        Intent i = new Intent(this, ListActivity.class);
        startActivity(i);
    }

    //When the user clicks the start button
    public void onClickStart(View v){
        //Debugging
        //Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();


    }

}
