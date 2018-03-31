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
public class technical extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical);
        listView = (ListView)findViewById(R.id.technical);

        ArrayAdapter<String> CAdapter = new ArrayAdapter<String>(technical.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.tech));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(technical.this,techto.class);
                intent.putExtra("technical",listView.getItemAtPosition(i).toString());
                startActivity(intent);


            }
        });
        listView.setAdapter(CAdapter);
    }
}