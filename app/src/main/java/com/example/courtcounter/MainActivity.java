package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void submitOrderA3(View view){
        scoreTeamA += 3;
        //scoreTeamB += 3;
        displayForTeamA(scoreTeamA);
        //displayForTeamB(scoreTeamB);
    }

    public void submitOrderA2(View view){
        scoreTeamA += 2;
        //scoreTeamB += 2;
        displayForTeamA(scoreTeamA);
        //displayForTeamB(scoreTeamB);
    }

    public void submitOrderA1(View view){
        scoreTeamA += 1;
        //scoreTeamB += 1;
        displayForTeamA(scoreTeamA);
        //displayForTeamB(scoreTeamB);
    }

    public void submitOrderB3(View view){
       // scoreTeamA += 3;
        scoreTeamB += 3;
        //displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void submitOrderB2(View view){
        //scoreTeamA += 2;
        scoreTeamB += 2;
        //displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void submitOrderB1(View view){
        //scoreTeamA += 1;
        scoreTeamB += 1;
        //displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void resetscore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
