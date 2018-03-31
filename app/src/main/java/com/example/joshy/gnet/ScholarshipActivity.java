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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class ScholarshipActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);
        Intent intent1=getIntent();
        listView = (ListView)findViewById(R.id.scholarship);

        ArrayAdapter<String> SAdapter = new ArrayAdapter<String>(ScholarshipActivity.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Scholarship));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ScholarshipActivity.this, scholarshipto.class);
                intent.putExtra("Scholarship", listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }

        });
        listView.setAdapter(SAdapter);
    }
}
