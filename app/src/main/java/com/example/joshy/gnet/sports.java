package com.example.joshy.gnet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class sports extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        Intent intent3=getIntent();
        listView = (ListView)findViewById(R.id.sports);

        ArrayAdapter<String> CAdapter = new ArrayAdapter<String>(sports.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.sports));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(sports.this,sportsto.class);
                intent.putExtra("sports",listView.getItemAtPosition(i).toString());
                startActivity(intent);


            }
        });
        listView.setAdapter(CAdapter);
    }
}
