package com.example.graphicera_linkcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button2,button3,button4,button5,button6;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
    }
    public void go_geu(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geu.ac.in/"));
        startActivity(i);
    }
    public void go_gehu(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gehu.ac.in/content/gehu/en/admission-aid/bhimtal.html"));
        startActivity(i);
    }
    public void go_Erp(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://student.gehu.ac.in/"));
        startActivity(i);
    }
    public void go_Lib(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://geu.knimbus.com/user#/home"));
        startActivity(i);
    }
    public void go_exam(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://exam.gehu.ac.in/"));
        startActivity(i);
    }
}