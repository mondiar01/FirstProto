package com.example.firstproto.Controller;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.firstproto.R;

public class GameActivity extends AppCompatActivity {
    private TextView mTextView;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mTextView = findViewById(R.id.game_textview_question);
        mButton1 = findViewById(R.id.game_button_q1);
        mButton2 = findViewById(R.id.game_button_q2);
        mButton3 = findViewById(R.id.game_button_q3);
        mButton4 = findViewById(R.id.game_button_q4);



    }
}