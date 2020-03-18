package com.example.customizedbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private Button TargetButtonNormal;
    private FloatingActionButton TragetButtonFloating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TargetButtonNormal = (Button)findViewById(R.id.button);
    }

    void log(String s){
        Log.d("TAG", s);
    }

    public void onVisibilityChangeButtonClicked(View view) {
        int cur = TargetButtonNormal.getVisibility();
        int next = View.VISIBLE;
        switch(cur){
            case View.VISIBLE:
                next = View.INVISIBLE;
                break;
            case View.INVISIBLE:
                next = View.GONE;
                break;
            case View.GONE:
                next = View.VISIBLE;
                break;
        }
        TargetButtonNormal.setVisibility(next);
    }
}
