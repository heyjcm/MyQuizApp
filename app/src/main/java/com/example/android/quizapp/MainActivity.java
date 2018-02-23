package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // four radio buttons for question 1
    // because Android is dumb and makes me do this
    // instead of having the ability to nest views
    // of radio buttons inside a RadioGroup
    RadioButton q1Radio1, q1Radio2, q1Radio3, q1Radio4;
    RadioButton q2Radio1, q2Radio2, q2Radio3, q2Radio4;

    CheckBox blueBike, blackBike, silverBike, greenBike;

    EditText cusName;

    private TextView quizSummary;

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
        q1Radio1 = findViewById(R.id.q1_radio1_view);
        q1Radio2 = findViewById(R.id.q1_radio2_view);
        q1Radio3 = findViewById(R.id.q1_radio3_view);
        q1Radio4 = findViewById(R.id.q1_radio4_view);

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
        q2Radio1 = findViewById(R.id.q2_radio1_view);
        q2Radio2 = findViewById(R.id.q2_radio2_view);
        q2Radio3 = findViewById(R.id.q2_radio3_view);
        q2Radio4 = findViewById(R.id.q2_radio4_view);

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

        // Initialize name
        cusName = findViewById(R.id.enter_name);

        // Initialize quizSummary
        quizSummary = findViewById(R.id.quiz_summary_view);


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

    /**
     *
     * @return customer's name entered in the enter_name EditText
     * cusName is declared as an instance variable at the top
     * then initialized in onCreate() method
     */
    public String customerName() {
        // this is the syntax to get the text from the view
        // <----could have also done this (but not as good for CPU):---->
        // EditText cusName;
        // cusName = findViewById(R.id.enter_name);
        return cusName.getText().toString();
    }

    public void submitQuiz(View view) {
        quizSummary.setText(createQuizSummary());

    }

    public String getQ1Answer() {
        if (q1Radio1.isChecked()) {
            return getString(R.string.q1radio1);
        }

        if (q1Radio2.isChecked()) {
            return getString(R.string.q1radio2);
        }

        if (q1Radio3.isChecked()) {
            return getString(R.string.q1radio3);
        }

        if (q1Radio4.isChecked()) {
            return getString(R.string.q1radio4);
        }

        return "No answer!";
    }


    private String createQuizSummary() {
        return getString(R.string.customer_name, customerName()) + // have to use xliff in strings.xml for this to work
                "\n" + getString(R.string.q1_answer) + " " + getQ1Answer();

    }
}
