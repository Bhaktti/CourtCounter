package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int  scoreTeamA=0;
    int scoreTeamB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threepoints(View view) {

        scoreTeamA= scoreTeamA+3;
        displayForTeamA(scoreTeamA);


    }


    public void twopoints(View view) {

        scoreTeamA= scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void freethrow(View view) {

        scoreTeamA= scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    public void threepoints1(View view) {

        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);

    }


    public void twopoints1(View view) {

        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void freethrow1(View view) {
        scoreTeamB=scoreTeamB+1;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(View view) {
        displayForTeamA(0);
        displayForTeamB(0);


    }

}
