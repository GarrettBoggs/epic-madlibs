package com.example.guest.epic_madlibs;

import java.util.Random;

public class Stories {
    private String mName, mCreature, mNoun1, mNoun2, mVerb, mAdj;
    private int mNum;

    public Stories (String text1, String text2, String text3, String text4, String text5, String text6, int num) {
        this.mName = text1;
        this.mCreature = text2;
        this.mNoun1 = text3;
        this.mNoun2 = text4;
        this.mVerb = text5;
        this.mAdj= text6;
        this.mNum = num;
    }
    public String[] createStory(){
        String[] stories = {mName + " is on a quest to get the " + mNoun1 + ". As the journey begins, our intrepid hero runs into a " + mCreature + ". Terrified, the hero flees to grab a trusty " + mNoun2 + " to slay the beast. With this newfound weapon, the hero is able to " + mVerb + "  the monster. The heroic " + mName + " then continues this quest to get the " + mAdj + " " + mNoun1 + "." ,
                mName + " is in a gas station. Out of nowhere a zombie breaks through the window. " + mName + " runs towards the bathroom in terror, tripping over " + mNoun1 + ". Crawling on the floor, " +mName+ " thinks, if only that zombie was a " + mCreature + ", I would then " + mVerb + ". Too bad it’s a " + mAdj + " zombie. In a desperate lunge, " + mName + "  grabs a " + mNoun2 + " , and throws it at the zombie. The " +  mNoun2 + " pierces the zombie’s skull, sending the zombie sprawling onto the ground and forming a pool of blood."};
        return stories;
    }



    public String getStory(){
        String[] s = createStory();
        return s[mNum];
    }
}

