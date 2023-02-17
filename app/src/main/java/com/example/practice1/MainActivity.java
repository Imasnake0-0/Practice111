package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    CharSequence text;
    int duration = Toast.LENGTH_LONG;
    private static final String Tag = "Practice1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Context context = getApplicationContext();
            text = "OnCreate";
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        catch (Exception e) {
            Log.e(Tag,"Exception", e);
        }
        Log.i(Tag,"Information in onCreate");
        Log.d(Tag,"Debug in onCreate");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        text = "OnPause";
        Toast.makeText(context, text, duration).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        text = "OnStart";
        Toast.makeText(context, text, duration).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Context context = getApplicationContext();
        text = "OnStop";
        Toast.makeText(context, text, duration).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Context context = getApplicationContext();
        text = "OnDestroy";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        text = "OnResume";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}