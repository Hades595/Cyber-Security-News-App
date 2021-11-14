package com.example.compx202_242_assignmentfive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        //Get the title array from arrays.xml
        String[] array = getResources().getStringArray(R.array.string_array_titles);
        //Create a array adapter so we can present it to the users
        ArrayAdapter<String> listItems = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);

        //Get the list view from the XML
        ListView listView = (ListView)findViewById(R.id.listview_articles);
        //Fill the values into the listview with the adapter
        listView.setAdapter(listItems);

        //Whenever the user clicks a value in the listview
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //Debugging
                //Toast.makeText(view.getContext(), position, Toast.LENGTH_SHORT).show();
                //Create a new detail activity
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                //Pass the position of item that the user clicked
                intent.putExtra("position", position);
                //Start the detail activtiy
                startActivity(intent);
            }
        };

        //Start the onClickListener for the listView
        listView.setOnItemClickListener(onItemClickListener);

    }


}