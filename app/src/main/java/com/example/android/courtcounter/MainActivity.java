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

    // TEAM B LOGIC

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
    public void incA3points(View v) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * increases the scoreA  by 3 points everytime the button point2A is clicked
     */
    public void incA2points(View v) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * increases the scoreA  by 3 points everytime the button freeThrowA is clicked
     */
    public void incAFreeThrow(View v) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    // END OF TEAM A LOGIC

    // TEAM B LOGIC

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.score_teamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increases the scoreA  by 3 points everytime the button point3B is clicked
     */
    public void incB3points(View v) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     * increases the scoreA  by 3 points everytime the button point2B is clicked
     */
    public void incB2points(View v) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /**
     * increases the scoreA  by 3 points everytime the button freeThrowB is clicked
     */
    public void incBFreeThrow(View v) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    // END OF TEAM A LOGIC

    // RESET BUTTON LOGIC

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

}
