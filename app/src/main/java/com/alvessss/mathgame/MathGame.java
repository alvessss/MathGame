package com.alvessss.mathgame;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MathGame {
   private final static String[] OPERATORS = {
      "*", "-", "+", "/"
   };

   private final AppCompatActivity activity;
   private final TextView tvA;
   private final TextView tvB;
   private final TextView tvOperator;
   private final EditText etUserResponse;

   MathGame(AppCompatActivity activity) {
      this.activity = activity;
      this.tvA = activity.findViewById(R.id.a);
      this.tvB = activity.findViewById(R.id.b);
      this.tvOperator = activity.findViewById(R.id.sign);
      this.etUserResponse = activity.findViewById(R.id.resultInput);

      etUserResponse.setOnEditorActionListener(new TextView.OnEditorActionListener() {
         @Override
         public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if (actionId == EditorInfo.IME_ACTION_DONE){
               generateNewExpression();
               etUserResponse.setText("");
               return true;
            }

            return false;
         }
      });

   }

   void generateNewExpression() {
      Random random = new Random();
      int a = random.nextInt(100);
      int b = random.nextInt(100);
      String operator = OPERATORS[random.nextInt(OPERATORS.length)];

      if (a > b) {
         tvA.setText(Integer.toString(a));
         tvB.setText(Integer.toString(b));
      } else {
         tvA.setText(Integer.toString(b));
         tvB.setText(Integer.toString(a));
      }

      tvOperator.setText(operator);
   }
}
