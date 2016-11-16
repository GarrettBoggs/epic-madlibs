package com.example.guest.epic_madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;

public class StoryActivity extends AppCompatActivity {
    @Bind(R.id.storyTextView) TextView mStoryTextView;
    @Bind(R.id.gasStation) ImageView mGasStation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        ButterKnife.bind(this);

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(2);

        Intent intent = getIntent();
        String[] storyArray = intent.getStringArrayExtra("storyArray");
        System.out.println(storyArray[0]);
        Stories story = new Stories(storyArray[0], storyArray[1], storyArray[2], storyArray[3], storyArray[4], storyArray[5], randomNumber);

        if(randomNumber == 1) {
            mGasStation.setVisibility(View.VISIBLE);
        } else {
            mGasStation.setVisibility(View.INVISIBLE);
        }
        mStoryTextView.setText(story.getStory());

    }
}
