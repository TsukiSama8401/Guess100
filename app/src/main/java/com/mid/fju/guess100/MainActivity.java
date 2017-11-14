package com.mid.fju.guess100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText number;
    private TextView secret;
    private TextView info;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }
    private void findViews(){
        number = (EditText) findViewById(R.id.number);
        secret = (TextView) findViewById(R.id.secret);
        info = (TextView) findViewById(R.id.info);
        send = (Button) findViewById(R.id.send);
    }



    public void guess(View view){
        Random random = new Random();
        int r = random.nextInt(99)+1;

    }

}