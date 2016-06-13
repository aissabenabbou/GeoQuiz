package com.example.engeneer0x0.geoquiz;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonTrue ;
    private Button buttonFalse ;
    private Button buttonNext ;

    private Question [] questions = new Question[]{
            new Question(R.string.adrar_question, false),
            new Question(R.string.oran_question, false),
            new Question(R.string.algies_question, true)

    };

    private int currentIndex = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView questionTextView = (TextView) findViewById(R.id.question_view);
         final int question = questions[currentIndex].getMtextResId();
        questionTextView.setText(question);


        buttonFalse = (Button) findViewById(R.id.false_button) ;
        buttonTrue = (Button) findViewById(R.id.true_button) ;
        buttonNext = (Button) findViewById(R.id.next_button);

        buttonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            boolean answer = questions[currentIndex].isManswerTrue();

                if (answer==false){
                    Toast.makeText(MainActivity.this,"rak lichan",Toast.LENGTH_SHORT).show();
                }else Toast.makeText(MainActivity.this,"rak ghalet",Toast.LENGTH_SHORT).show();


            }
        });

        buttonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = questions[currentIndex].isManswerTrue();

                if (answer==true){
                    Toast.makeText(MainActivity.this,"rak lichan",Toast.LENGTH_SHORT).show();
                }else Toast.makeText(MainActivity.this,"rak ghalet",Toast.LENGTH_SHORT).show();

            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               currentIndex=(currentIndex+1)%questions.length;
                int question = questions[currentIndex].getMtextResId();
                questionTextView.setText(question);
            }
        });

    }
}
