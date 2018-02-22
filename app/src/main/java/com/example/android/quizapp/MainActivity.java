package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // four radio buttons for question 1
    // because Android is dumb and makes me do this
    // instead of having the ability to nest views
    // of radio buttons inside a RadioGroup
    RadioButton q1_radio1;
    RadioButton q1_radio2;
    RadioButton q1_radio3;
    RadioButton q1_radio4;

    RadioButton q2_radio1, q2_radio2, q2_radio3, q2_radio4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * <------------------------------------------------->
         * Question 1 Radio buttons initialization
         * Used because Android RadioGroup view only allows vertical
         * alignment. I'm using two rows with two columns for
         * radio buttons in question 1 so RadioGroup wasn't working
         * for me.
         */

        // set up each radio button view ID
        q1_radio1 = (RadioButton) findViewById(R.id.q1radio1);
        q1_radio2 = (RadioButton) findViewById(R.id.q1radio2);
        q1_radio3 = (RadioButton) findViewById(R.id.q1radio3);
        q1_radio4 = (RadioButton) findViewById(R.id.q1radio4);

        // if radio button 1 is ticked, all others are set to false
        q1_radio1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1_radio1.setChecked(true);
                q1_radio2.setChecked(false);
                q1_radio3.setChecked(false);
                q1_radio4.setChecked(false);
            }
        });

        // if radio button 2 is ticked, all others are set to false
        q1_radio2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1_radio1.setChecked(false);
                q1_radio2.setChecked(true);
                q1_radio3.setChecked(false);
                q1_radio4.setChecked(false);
            }
        });

        // if radio button 3 is ticked, all others are set to false
        q1_radio3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1_radio1.setChecked(false);
                q1_radio2.setChecked(false);
                q1_radio3.setChecked(true);
                q1_radio4.setChecked(false);
            }
        });

        // if radio button 4 is ticked, all others are set to false
        q1_radio4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1_radio1.setChecked(false);
                q1_radio2.setChecked(false);
                q1_radio3.setChecked(false);
                q1_radio4.setChecked(true);
            }
        });
        /**
         * End Question 2 Radio buttons initialization
         * * <------------------------------------------------->
         */

        /**
         * <------------------------------------------------->
         * Question 2 Radio buttons initialization
         * Used because Android RadioGroup view only allows vertical
         * alignment. I'm using two rows with two columns for
         * radio buttons in question 1 so RadioGroup wasn't working
         * for me.
         */

        // set up each radio button view ID
        q2_radio1 = (RadioButton) findViewById(R.id.q2radio1);
        q2_radio2 = (RadioButton) findViewById(R.id.q2radio2);
        q2_radio3 = (RadioButton) findViewById(R.id.q2radio3);
        q2_radio4 = (RadioButton) findViewById(R.id.q2radio4);

        // if radio button 1 is ticked, all others are set to false
        q2_radio1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2_radio1.setChecked(true);
                q2_radio2.setChecked(false);
                q2_radio3.setChecked(false);
                q2_radio4.setChecked(false);
            }
        });

        // if radio button 2 is ticked, all others are set to false
        q2_radio2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2_radio1.setChecked(false);
                q2_radio2.setChecked(true);
                q2_radio3.setChecked(false);
                q2_radio4.setChecked(false);
            }
        });

        // if radio button 3 is ticked, all others are set to false
        q2_radio3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2_radio1.setChecked(false);
                q2_radio2.setChecked(false);
                q2_radio3.setChecked(true);
                q2_radio4.setChecked(false);
            }
        });

        // if radio button 4 is ticked, all others are set to false
        q2_radio4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2_radio1.setChecked(false);
                q2_radio2.setChecked(false);
                q2_radio3.setChecked(false);
                q2_radio4.setChecked(true);
            }
        });
        /**
         * End Question 2 Radio buttons initialization
         * * <------------------------------------------------->
         */
    }
}
