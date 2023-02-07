package com.example.firstproto.Controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firstproto.R;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private EditText mEditText;
    private Button mPlayButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.main_textview_bienvenu);
        mEditText = findViewById(R.id.main_edittext_name);
        mPlayButton = findViewById(R.id.main_button_play);
        mPlayButton.setEnabled(false);
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mPlayButton.setEnabled(!editable.toString().isEmpty());
            }
        });
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameActivityIntent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivityIntent);
            }
        });

    }
}