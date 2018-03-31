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

public class jobs extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        Intent intent2=getIntent();
        listView = (ListView)findViewById(R.id.job);

        ArrayAdapter<String> JAdapter = new ArrayAdapter<String>(com.example.joshy.gnet.jobs.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.job));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(com.example.joshy.gnet.jobs.this,jobsto.class);
                intent.putExtra("job",listView.getItemAtPosition(i).toString());
                startActivity(intent);


            }
        });

        listView.setAdapter(JAdapter);
    }
}


