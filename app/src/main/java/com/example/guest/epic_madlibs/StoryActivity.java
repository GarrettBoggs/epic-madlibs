package com.example.guest.epic_madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.storyTextView) TextView mStoryTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String text1 = intent.getStringExtra("text1");
        String text2 = intent.getStringExtra("text2");
        String text3 = intent.getStringExtra("text3");
        String text4 = intent.getStringExtra("text4");
        String text5 = intent.getStringExtra("text5");
        String text6 = intent.getStringExtra("text6");

        mStoryTextView.setText(" Test " + text1 + " Test " + text2 + " Test " + text3 + " Test " + text4 + " Test " + text5 + " Test " + text6);


    }
}
