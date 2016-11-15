package com.example.guest.epic_madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.submitButton) Button mSubmitButton;
    @Bind(R.id.text1) EditText mText1;
    @Bind(R.id.text2) EditText mText2;
    @Bind(R.id.text3) EditText mText3;
    @Bind(R.id.text4) EditText mText4;
    @Bind(R.id.text5) EditText mText5;
    @Bind(R.id.text6) EditText mText6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String text1 = mText1.getText().toString();
                String text2 = mText2.getText().toString();
                String text3 = mText3.getText().toString();
                String text4 = mText4.getText().toString();
                String text5 = mText5.getText().toString();
                String text6 = mText6.getText().toString();

                Intent intent = new Intent(MainActivity.this, StoryActivity.class);
                intent.putExtra("text1",text1);
                intent.putExtra("text2",text2);
                intent.putExtra("text3",text3);
                intent.putExtra("text4",text4);
                intent.putExtra("text5",text5);
                intent.putExtra("text6",text6);
                startActivity(intent);
            }
        });
    }
}
