package com.example.lesson7home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rateGood,rateExcellent, ratePoor, rateOkay;
    CheckBox r1CheckBox, r2CheckBox, r3CheckBox, r4CheckBox;
    Button btnSubmit;
    String osenka, checkBox1, checkBox2, checkBox3, checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1CheckBox=findViewById(R.id.r1CheckBox);
        r2CheckBox=findViewById(R.id.r2CheckBox);
        r3CheckBox=findViewById(R.id.r3CheckBox);
        r4CheckBox=findViewById(R.id.r4CheckBox);


        rateGood=findViewById(R.id.rateGood);
        rateExcellent=findViewById(R.id.rateExcellent);
        ratePoor=findViewById(R.id. ratePoor);
        rateOkay=findViewById(R.id. rateOkay);

        btnSubmit=findViewById(R.id. btnSubmit);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rateGood.isChecked()){
                    osenka = "Excellent";
                }else if(rateGood.isChecked()){
                    osenka = "Good";
                }else if(rateOkay.isChecked()){
                    osenka = "Okay";
                }else if(ratePoor.isChecked()){
                    osenka = "Poor";
                }


                if(r1CheckBox.isChecked()){
                    checkBox1 = "yes";
                }else{
                    checkBox1 = "no";
                }
                if(r2CheckBox.isChecked()){
                    checkBox2 = "yes";
                }else{
                    checkBox2 = "no";
                }
                if(r3CheckBox.isChecked()){
                    checkBox3 = "yes";
                }else{
                    checkBox3 = "no";
                }
                if(r1CheckBox.isChecked()){
                    checkBox4 = "yes";
                }else{
                    checkBox4 = "no";
                }


                String result ="osenka: "+osenka+"\n"+
                        r1CheckBox.getText()+": "+checkBox1+"\n"+
                        r2CheckBox.getText()+": "+checkBox2+"\n"+
                        r3CheckBox.getText()+": "+checkBox3+"\n"+
                        r4CheckBox.getText()+": "+checkBox4+"\n";
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    }
