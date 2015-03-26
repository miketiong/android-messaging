package com.sinch.messagingtutorial.app;

import android.app.Application;
import com.parse.Parse;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "79fytffZW7ROxw8BE8zosUCGfMAIv1JbjP04Jack", "JzuCggNtRAbLoL7FYVcNziui9fN45s3SFJwQdBZx");
    }
}
