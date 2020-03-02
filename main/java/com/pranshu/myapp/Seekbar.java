package com.pranshu.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Seekbar extends AppCompatActivity {
TextView tv,tv1;
RatingBar rb;
SeekBar sb;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        sb=findViewById(R.id.seekBar);
        tv=findViewById(R.id.textView5);
        rb=findViewById(R.id.ratingBar);
        tv1=findViewById(R.id.textView6);
        b=findViewById(R.id.button6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent(Seekbar.this,web.class);
       startActivity(inten);



            }
        });
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv.setText(progress+"");
                tv.setTextSize(progress+5);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Seekbar.this,"started",Toast.LENGTH_SHORT);
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(Seekbar.this,"finished",Toast.LENGTH_LONG);
            }
        });
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv1.setText("value is:"+rating);

            }
        });
    }
//    public void button(View v){
//        Intent inten=new Intent(Seekbar.this,web.class);
//        startActivity(inten);
//
//    }


}
