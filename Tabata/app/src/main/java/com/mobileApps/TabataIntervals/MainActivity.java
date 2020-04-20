package com.mobileApps.TabataIntervals;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int prepaer = 0, work = 0, rest = 0, cycles = 0, sets = 0, restbs = 0, cooldown = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();

        //- buttons
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);

        // + buttons
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);

        //- button
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);

        //+ button
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);


        //int prepaer = 0, work = 0, rest = 0, cycles = 0, sets = 0, restbs = 0, cooldown = 0;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                prepaer -= 1;
                Toast.makeText(this, "button 1 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                work -= 1;
                Toast.makeText(this, "button 2 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                rest -= 1;
                Toast.makeText(this, "button 3 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                cycles -= 1;
                Toast.makeText(this, "button 4 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                sets -= 1;
                Toast.makeText(this, "button 5 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                restbs -= 1;
                Toast.makeText(this, "button 6 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                cooldown -= 1;
                Toast.makeText(this, "button 7 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                prepaer += 1;
                Toast.makeText(this, "button 8 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                work += 1;
                Toast.makeText(this, "button 9 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                rest += 1;
                Toast.makeText(this, "button 10 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:
                cycles += 1;
                Toast.makeText(this, "button 11 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button12:
                sets += 1;
                Toast.makeText(this, "button 12 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button13:
                restbs += 1;
                Toast.makeText(this, "button 13 is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button14:
                cooldown += 1;
                Toast.makeText(this, "button 14 is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
