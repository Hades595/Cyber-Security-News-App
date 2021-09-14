package com.example.compx202_242_assignmentfive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        String[] array = getResources().getStringArray(R.array.string_array_titles);
        ArrayAdapter<String> listItems = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);

        ListView listView = (ListView)findViewById(R.id.listview_scms);
        listView.setAdapter(listItems);


    }


}