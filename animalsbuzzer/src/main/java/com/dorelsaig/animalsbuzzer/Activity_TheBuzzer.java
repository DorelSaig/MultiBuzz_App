package com.dorelsaig.animalsbuzzer;


import com.dorelsaig.common.Activity_TheBuzzer_Parent;

public class Activity_TheBuzzer extends Activity_TheBuzzer_Parent {

    @Override
    protected int getImage() {
        return R.drawable.animal_button;
    }

    @Override
    protected int getSound() {
        return R.raw.wazzup;
    }


}