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
        String[] array = getResources().getStringArray(R.array.string_array_titles);
        ArrayAdapter<String> listItems = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, array);

        ListView listView = (ListView)findViewById(R.id.listview_scms);
        listView.setAdapter(listItems);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //Toast.makeText(view.getContext(), position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        };

        listView.setOnItemClickListener(onItemClickListener);

    }


}