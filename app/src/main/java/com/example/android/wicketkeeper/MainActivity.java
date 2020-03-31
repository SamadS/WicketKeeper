package com.example.android.wicketkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketBangladesh = 0;
    int wicketEngland = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /** Bangladesh + 6 points */
    public void addSixForBangladesh (View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /** Bangladesh + 4 points */
    public void addFourForBangladesh (View view){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    /** England + 6 points */
    public void addSixForEngland (View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /** England + 4 points */
    public void addFourForEngland (View view){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    /** Bangladesh wicket count goes up + 1 */
    public void addOneWicketBangladesh (View view){
        wicketBangladesh = wicketBangladesh + 1;
        displayWicketBangladesh(wicketBangladesh);

    }

    /** England wicket count goes up + 1 */
    public void addOneWicketEngland (View view){
        wicketEngland = wicketEngland + 1;
        displayWicketEngland(wicketEngland);

    }

    /**
     * Displays the given score for Bangladesh.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for England.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     *  Displays the wicket count for Bangladesh.
     */
    public void displayWicketBangladesh(int wicket) {
        TextView wicketView = findViewById(R.id.bangladesh_wicket);
        wicketView.setText(String.valueOf(wicket));
    }

    /**
     *  Displays the wicket count for Bangladesh.
     */
    public void displayWicketEngland(int wicket) {
        TextView wicketView = findViewById(R.id.england_wicket);
        wicketView.setText(String.valueOf(wicket));
    }

    /**
     * Reset button - tapping this will reset both scores to 0
     */
    public void resetScore (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketBangladesh = 0;
        wicketEngland = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayWicketBangladesh(wicketBangladesh);
        displayWicketEngland(wicketEngland);
    }
}
