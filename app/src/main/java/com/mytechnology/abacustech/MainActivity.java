package com.mytechnology.abacustech;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  Button buttonReset;
  TextView abacusValueTextView;

  int x1,x2,y1,y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abacus_view);

        buttonReset = findViewById(R.id.reset_button);
        abacusValueTextView = findViewById(R.id.abacus_value);
       
    }
    /*@Override
    public boolean onTouchEvent(MotionEvent event) {
           x1 = (int) event.getX();
           Log.d("MainActivity", "X1: " + x1);
           y1 = (int) event.getY();
           Log.d("MainActivity", "Y1: " + y1);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                button1.setText("B");
                button1.setFocusable(true);
                break;
            case MotionEvent.ACTION_UP:
                button1.setText("A");
                break;
            case MotionEvent.ACTION_MOVE:
                x2 = x1 ;
                y2 = y2 + 200;
                button1.setX(x2);
                button1.setY(y2);
                button1.setText("M");
                x1 = x2;
                y1 = y2;
                break;
            case MotionEvent.ACTION_BUTTON_PRESS:
                button1.setText("P");
                break;
            case MotionEvent.ACTION_BUTTON_RELEASE:
                button1.setText("R");
                break;
            case MotionEvent.ACTION_CANCEL:
                button1.setText("C");
                break;
        }
        return super.onTouchEvent(event);
    }*/
}