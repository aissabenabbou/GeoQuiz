package com.example.engeneer0x0.geoquiz;

import android.nfc.Tag;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "QuizActivity" ;
    private static final String KEY_INDEX = "INDEX" ;
    private Button buttonTrue ;
    private Button buttonFalse ;
    private Button buttonNext ;
    private TextView questionTextView;

    private Question [] questions = new Question[]{
            new Question(R.string.adrar_question, false),
            new Question(R.string.oran_question, false),
            new Question(R.string.algies_question, true)

    };

    private int currentIndex = 0 ;

    private void checkAnswer(boolean boole  ){
        boolean answer = questions[currentIndex].isManswerTrue();

        if (answer==boole){
            Toast.makeText(MainActivity.this,R.string.Toast_correct,Toast.LENGTH_SHORT).show();
        }else Toast.makeText(MainActivity.this,R.string.Toast_false,Toast.LENGTH_SHORT).show();

    }

    private void updateQuestion(){
        int question = questions[currentIndex].getMtextResId();
        questionTextView.setText(question);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"Oncreate Called");
        setContentView(R.layout.activity_main);

         questionTextView = (TextView) findViewById(R.id.question_view);




        buttonFalse = (Button) findViewById(R.id.false_button) ;
        buttonTrue = (Button) findViewById(R.id.true_button) ;
        buttonNext = (Button) findViewById(R.id.next_button);

        buttonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               checkAnswer(false);

            }
        });

        buttonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              checkAnswer(true);

            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               currentIndex=(currentIndex+1)%questions.length;
               updateQuestion();
            }
        });
        if(savedInstanceState != null){
            currentIndex = savedInstanceState.getInt(KEY_INDEX,0);
        }
        updateQuestion();

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG,"On Save Instance State ");
        savedInstanceState.putInt(KEY_INDEX,currentIndex);
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"onStart called");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"onPause called");

    }
    @Override
    public void  onResume(){
        super.onResume();
        Log.d(TAG,"onResume called");

    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"onStop called");

    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy called");
    }

}
