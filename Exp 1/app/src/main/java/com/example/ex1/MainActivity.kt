package com.example.ex1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv1 :TextView = findViewById(R.id.text1);
        var btn1 :Button =  findViewById(R.id.bt1);
        var btn2 :Button =  findViewById(R.id.btn2);
        var btn3 :Button = findViewById(R.id.btn3) ;
        var bg :LinearLayout =findViewById(R.id.bg);
        var size=10f;
        var textCol:Int =0;
        var bgCol:Int =0;

       btn1.setOnClickListener {
           tv1.setTextSize(size);
           size=size+5;
       }
        btn2.setOnClickListener {
            when(textCol%3){
                0->tv1.setTextColor(Color.RED);
                1->tv1.setTextColor(Color.GREEN);
                2->tv1.setTextColor(Color.BLUE);
            }
            textCol=textCol+1;
        }
        btn3.setOnClickListener {

            when(bgCol%3){
                0->bg.setBackgroundColor(Color.RED);
                1->bg.setBackgroundColor(Color.GREEN)
                2->bg.setBackgroundColor(Color.BLUE)
            }
            bgCol=bgCol+1;
        }
    }
}