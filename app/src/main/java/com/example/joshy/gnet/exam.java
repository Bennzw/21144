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


public class exam extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Intent intent1=getIntent();
        listView = (ListView)findViewById(R.id.exam);

        ArrayAdapter<String> CAdapter = new ArrayAdapter<String>(exam.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.exam));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(exam.this,examto.class);
                intent.putExtra("exam",listView.getItemAtPosition(i).toString());
                startActivity(intent);


            }
        });
        listView.setAdapter(CAdapter);
    }
}
