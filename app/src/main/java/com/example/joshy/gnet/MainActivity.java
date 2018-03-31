package com.example.joshy.gnet;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    ImageButton imageButton1;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;
    ImageButton imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton1=(ImageButton)findViewById(R.id.imageButton1);
        imageButton2=(ImageButton)findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)findViewById(R.id.imageButton3);
        imageButton4=(ImageButton)findViewById(R.id.imageButton4);
        imageButton5=(ImageButton)findViewById(R.id.imageButton5);
        imageButton6=(ImageButton)findViewById(R.id.imageButton6);

        imageButton1.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
        imageButton3.setOnClickListener(this);
        imageButton4.setOnClickListener(this);
        imageButton5.setOnClickListener(this);
        imageButton6.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        Intent intent1=new Intent(MainActivity.this,ScholarshipActivity.class);
        startActivity(intent1);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v) {
        Intent intent2=new Intent(MainActivity.this,jobs.class);
        startActivity(intent2);
        setContentView(R.layout.activity_main);
    }
    public void onClick2(View v) {
        Intent intent3=new Intent(MainActivity.this,exam.class);
        startActivity(intent3);
        setContentView(R.layout.activity_main);
    }
    public void onClick3(View v) {
        Intent intent4=new Intent(MainActivity.this,Cultural_Activity.class);
        startActivity(intent4);
        setContentView(R.layout.activity_main);
    }
    public void onClick4(View v) {
        Intent intent5=new Intent(MainActivity.this,sports.class);
        startActivity(intent5);
        setContentView(R.layout.activity_main);
    }
    public void onClick5(View v) {
        Intent intent6=new Intent(MainActivity.this,technical.class);
        startActivity(intent6);
        setContentView(R.layout.activity_main);
    }
}
