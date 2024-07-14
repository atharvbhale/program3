package com.example.program3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.program3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "onCreate Called", Toast.LENGTH_SHORT).show();
        Log.d("lifecycle", "onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle", "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG).show();
        Log.d("lifecycle", "onDestroy invoked");
    }
}
