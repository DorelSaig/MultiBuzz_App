package com.dorelsaig.multibuzz;


import com.dorelsaig.common.App_Parent;

public class App extends App_Parent {


    @Override
    public void onCreate() {
        super.onCreate();

        theBuzzer = Activity_TheBuzzer.class;
    }

}
