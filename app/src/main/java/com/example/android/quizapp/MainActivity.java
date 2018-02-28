package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    // four radio buttons for question 1
    // because Android is dumb and makes me do this
    // instead of having the ability to nest views
    // of radio buttons inside a RadioGroup
    RadioButton q1Radio1, q1Radio2, q1Radio3, q1Radio4;
    RadioButton q2Radio1, q2Radio2, q2Radio3, q2Radio4;

    CheckBox blueBike, blackBike, silverBike, greenBike;

    EditText cusName, cusEmail;

    private TextView quizSummary;

    Map<String, Boolean> colorMap = new HashMap<>();

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

        // Initialize customer email
        cusEmail = findViewById(R.id.customers_email);

        // Initialize quizSummary
        quizSummary = findViewById(R.id.quiz_summary_view);


    }

    public void populateColorMap() {
        isBlueChecked();
        isBlackChecked();
        isSilverChecked();
        isGreenChecked();
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public void isBlueChecked() {
        // blueBike initialized in onCreate method
        //return blueBike.isChecked();
        if (blueBike.isChecked()) {
            colorMap.put("Blue", true);
        }
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public void isBlackChecked() {
        // blackBike initialized in onCreate method
        //return blackBike.isChecked();
        if (blackBike.isChecked()) {
            colorMap.put("Black", true);
        }
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public void isSilverChecked() {
        // silverBike initialized in onCreate method
        //return silverBike.isChecked();
        if (silverBike.isChecked()) {
            colorMap.put("Silver", true);
        }
    }

    /**
     *
     * @return true if user checked Blue Bike preference
     */
    public void isGreenChecked() {
        // greenBike initialized in onCreate method
        // return greenBike.isChecked();
        if (greenBike.isChecked()) {
            colorMap.put("Green", true);
        }
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
        // Initialize HashMap of colors to false
        colorMap.put("Blue", false);
        colorMap.put("Black", false);
        colorMap.put("Silver", false);
        colorMap.put("Green", false);

        // call colorChecker here
        populateColorMap();

        quizSummary.setText(createQuizSummary());

    }

    public String getQ1Answer() {
        if (q1Radio1.isChecked()) {
            return getString(R.string.q1radio1) +
                    "--> That's not right. The right answer is 720W";
        }

        if (q1Radio2.isChecked()) {
            return getString(R.string.q1radio2) +
                    "--> That's right!";
        }

        if (q1Radio3.isChecked()) {
            return getString(R.string.q1radio3) +
                    "--> That's not right. The right answer is 720W";
        }

        if (q1Radio4.isChecked()) {
            return getString(R.string.q1radio4) +
                    "--> That's not right. The right answer is 720W";
        }

        return "No answer!";
    }

    public String getQ2Answer() {
        if (q2Radio1.isChecked()) {
            return getString(R.string.q2radio1) +
                    "--> That's right!";
        }

        if (q2Radio2.isChecked()) {
            return getString(R.string.q2radio2) +
                    "--> That's not right. The right answer is 60 minutes";
        }

        if (q2Radio3.isChecked()) {
            return getString(R.string.q2radio3) +
                    "--> That's not right. The right answer is 60 minutes";
        }

        if (q2Radio4.isChecked()) {
            return getString(R.string.q2radio4) +
                    "--> That's not right. The right answer is 60 minutes";
        }

        return "No answer!";
    }

    /**
     *
     * @return a string with the response(s) for Q3 built
     * depending on which checkboxes were checked.
     */
    public String getQ3Answer() {
        String q3Response = "WHAT?!? You don't have a favorite color?";
        Boolean choseAColor = false;

        Iterator colorIterator = colorMap.keySet().iterator();

        while (colorIterator.hasNext()) {
            // key is the color being checked
            String key = (String) colorIterator.next();

            // value is boolean of color
            Boolean isColorChecked = colorMap.get(key);

            if (isColorChecked && !choseAColor) {
                q3Response = key;
                choseAColor = true;
            }
            else if (isColorChecked) {
                q3Response += ", " + key;
            }
        }


        // this code works but I changed it (and other
        // functions supporting it) to the more dynamic
        // version above. Color checker functions
        // (isBlueChecked, etc) have also been modified
        // from their previous versions
        /*if (isBlueChecked()) {
            q3Response = "Blue Bike";
            countColors++;
        }

        if (isBlackChecked() && countColors == 0) {
            q3Response = "Black Bike";
            countColors++;
        }
        else if (isBlackChecked() && countColors > 0) {
            q3Response += ", Black Bike";
            countColors++;
        }

        if (isSilverChecked() && countColors == 0) {
            q3Response = "Silver Bike";
            countColors++;
        }
        else if (isSilverChecked() && countColors > 0) {
            q3Response += ", Silver Bike";
            countColors++;
        }

        if (isGreenChecked() && countColors == 0) {
            q3Response = "Green Bike";
            countColors++;
        }
        else if (isGreenChecked() && countColors > 0) {
            q3Response += ", Green Bike";
            countColors++;
        }*/

        return q3Response;
    }

    public Boolean colorChecker(String color) {
        return colorMap.get(color);
    }

    public String getQ4Answer() {
        return cusEmail.getText().toString();
    }

    private String createQuizSummary() {
            return getString(R.string.customer_name, customerName()) + // have to use xliff in strings.xml for this to work
                "\n" + getString(R.string.q1_answer) + " " + getQ1Answer() +
                "\n" + getString(R.string.q2_answer) + " " + getQ2Answer() +
                "\n" + getString(R.string.q3_answer) + " " + getQ3Answer() +
                "\n" + getString(R.string.q4_answer) + " " + getQ4Answer();

    }
}
