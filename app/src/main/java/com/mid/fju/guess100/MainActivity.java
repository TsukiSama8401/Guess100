package com.mid.fju.guess100;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
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
    Random random = new Random();
    int r = random.nextInt(99)+1;
    int min = 0;
    int max = 100;
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
        String s = String.valueOf(r);
        secret.setText(s);
    }

    public void guess(View view){
        String n = number.getText().toString();
        int i = Integer.parseInt(n);

        if(i > max || i < min){
            new AlertDialog.Builder(this)
                    .setMessage("Are you kidding me")
                    .setPositiveButton("ok" , null)
                    .show();
        }else{
            if (i > r){
                max = i;
                new AlertDialog.Builder(this)
                        .setMessage(min + " to " + max)
                        .setPositiveButton("ok",null)
                        .show();
            }else if (i < r){
                min = i;
                new AlertDialog.Builder(this)
                        .setMessage(min + "to " + max)
                        .setPositiveButton("ok" , null)
                        .show();
            }else if (i == r){
                new AlertDialog.Builder(this)
                        .setMessage("BINGO")
                        .setPositiveButton("ok" , null)
                        .show();
                Intent intent = new Intent(this , AgainActivity.class);
                startActivity(intent);
            }
        }

    }

}