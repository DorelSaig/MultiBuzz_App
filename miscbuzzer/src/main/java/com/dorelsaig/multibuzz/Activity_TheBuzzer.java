package com.dorelsaig.multibuzz;


import com.dorelsaig.common.Activity_TheBuzzer_Parent;

public class Activity_TheBuzzer extends Activity_TheBuzzer_Parent {

    @Override
    protected int getImage() {
        return R.drawable.custom_button;
    }

    @Override
    protected int getSound() {
        return R.raw.airhorn;
    }
}
