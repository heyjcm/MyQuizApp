package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    // four radio buttons for question 1
    // because Android is dumb and makes me do this
    // instead of having the ability to nest views
    // of radio buttons inside a RadioGroup
    RadioButton q1Radio1, q1Radio2, q1Radio3, q1Radio4;
    RadioButton q2Radio1, q2Radio2, q2Radio3, q2Radio4;

    CheckBox blueBike, blackBike, silverBike, greenBike;

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
        q1Radio1 = (RadioButton) findViewById(R.id.q1_radio1_view);
        q1Radio2 = (RadioButton) findViewById(R.id.q1_radio2_view);
        q1Radio3 = (RadioButton) findViewById(R.id.q1_radio3_view);
        q1Radio4 = (RadioButton) findViewById(R.id.q1_radio4_view);

        // if radio button 1 is ticked, all others are set to false
        q1Radio1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1Radio1.setChecked(true);
                q1Radio2.setChecked(false);
                q1Radio3.setChecked(false);
                q1Radio4.setChecked(false);
            }
        });

        // if radio button 2 is ticked, all others are set to false
        q1Radio2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1Radio1.setChecked(false);
                q1Radio2.setChecked(true);
                q1Radio3.setChecked(false);
                q1Radio4.setChecked(false);
            }
        });

        // if radio button 3 is ticked, all others are set to false
        q1Radio3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1Radio1.setChecked(false);
                q1Radio2.setChecked(false);
                q1Radio3.setChecked(true);
                q1Radio4.setChecked(false);
            }
        });

        // if radio button 4 is ticked, all others are set to false
        q1Radio4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q1Radio1.setChecked(false);
                q1Radio2.setChecked(false);
                q1Radio3.setChecked(false);
                q1Radio4.setChecked(true);
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
        q2Radio1 = (RadioButton) findViewById(R.id.q2_radio1_view);
        q2Radio2 = (RadioButton) findViewById(R.id.q2_radio2_view);
        q2Radio3 = (RadioButton) findViewById(R.id.q2_radio3_view);
        q2Radio4 = (RadioButton) findViewById(R.id.q2_radio4_view);

        // if radio button 1 is ticked, all others are set to false
        q2Radio1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2Radio1.setChecked(true);
                q2Radio2.setChecked(false);
                q2Radio3.setChecked(false);
                q2Radio4.setChecked(false);
            }
        });

        // if radio button 2 is ticked, all others are set to false
        q2Radio2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2Radio1.setChecked(false);
                q2Radio2.setChecked(true);
                q2Radio3.setChecked(false);
                q2Radio4.setChecked(false);
            }
        });

        // if radio button 3 is ticked, all others are set to false
        q2Radio3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2Radio1.setChecked(false);
                q2Radio2.setChecked(false);
                q2Radio3.setChecked(true);
                q2Radio4.setChecked(false);
            }
        });

        // if radio button 4 is ticked, all others are set to false
        q2Radio4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                q2Radio1.setChecked(false);
                q2Radio2.setChecked(false);
                q2Radio3.setChecked(false);
                q2Radio4.setChecked(true);
            }
        });
        /**
         * End Question 2 Radio buttons initialization
         * * <------------------------------------------------->
         */

        // Initialize checkboxes
        blueBike = findViewById(R.id.blue_bike_checkbox);
        blackBike = findViewById(R.id.black_bike_checkbox);
        silverBike = findViewById(R.id.silver_bike_checkbox);
        greenBike = findViewById(R.id.green_bike_checkbox);
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public boolean isBlueChecked() {
        // blueBike initialized in onCreate method
        return blueBike.isChecked();
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public boolean isBlackChecked() {
        // blackBike initialized in onCreate method
        return blackBike.isChecked();
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public boolean isSilverChecked() {
        // silverBike initialized in onCreate method
        return silverBike.isChecked();
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public boolean isGreenChecked() {
        // greenBike initialized in onCreate method
        return greenBike.isChecked();
    }
}
