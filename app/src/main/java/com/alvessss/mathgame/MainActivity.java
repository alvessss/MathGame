package com.alvessss.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   private MathGame mg;

   @Override
   protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      mg = new MathGame(this);
   }

   @Override
   protected void onStart(){
      super.onStart();
      mg.generateNewExpression();
   }
}