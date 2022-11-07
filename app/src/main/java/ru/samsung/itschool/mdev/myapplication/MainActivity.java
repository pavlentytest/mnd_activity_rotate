package ru.samsung.itschool.mdev.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button btn;
    private int counter = 0;
    private TextView tv;
    public static final String KEY = "ccc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        btn.setOnClickListener(view -> {
            counter++;
            tv.setText(Integer.toString(counter));
        });

        Log.d("RRR","onCreate()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY,counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(KEY);
        tv.setText(Integer.toString(counter));
    }

    /*
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button) {

        } else {

        }
    }
*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRR","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRR","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRR","onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRR","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRR","onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRR","onRestart()");
    }


}