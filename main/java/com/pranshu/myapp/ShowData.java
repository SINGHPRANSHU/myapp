package com.pranshu.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        Intent intent=getIntent();
        String sname=intent.getStringExtra("name");
        String sgender=intent.getStringExtra("gender");
        TextView text=(TextView)findViewById(R.id.textView3);
        text.setText(sname);
        TextView text1=findViewById(R.id.textView4);
        text1.setText(sgender);

















    }
    public void btn(View v){
        Intent inten=new Intent(ShowData.this,Visibility.class);
        startActivity(inten);}

}
