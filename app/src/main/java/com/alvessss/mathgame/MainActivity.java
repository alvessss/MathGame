package com.alvessss.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      new MathGame(this);
   }

   @Override
   protected void onStart(){
      super.onStart();
   }
}