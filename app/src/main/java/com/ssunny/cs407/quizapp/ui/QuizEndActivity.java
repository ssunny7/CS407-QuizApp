package com.ssunny.cs407.quizapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizEndActivity extends AppCompatActivity {

    private TextView scoreTextView;
    private Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_end);

        scoreTextView = (TextView)findViewById(R.id.scoreView);
        playAgainButton = (Button)findViewById(R.id.playAgainButton);

        int score = getIntent().getExtras().getInt("SCORE");
        scoreTextView.setText(Integer.toString(score));

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startActivityIntent = new Intent(getBaseContext(), QuizStartActivity.class);
                startActivity(startActivityIntent);
            }
        });
    }
}
