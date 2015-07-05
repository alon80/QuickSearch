package com.example.alon.quicksearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, PlayerService.class);
        intent.putExtra("stop_service", false);
        startService(intent);
        finish();
    }
}
