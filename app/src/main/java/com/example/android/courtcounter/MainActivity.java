package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // TEAM A LOGIC

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.score_teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increases the scoreA  by 3 points everytime the button point3A is clicked
     */
    public void inc3points(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * increases the scoreA  by 3 points everytime the button point3A is clicked
     */
    public void inc2points(View v) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * increases the scoreA  by 3 points everytime the button point3A is clicked
     */
    public void incFreeThrow(View v) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    // END OF TEAM A LOGIC

}
