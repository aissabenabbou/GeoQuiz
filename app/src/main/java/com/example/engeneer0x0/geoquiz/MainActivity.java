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

    private Question [] questions = new Question[]{
            new Question(R.string.adrar_question, false),
            new Question(R.string.oran_question, false),
            new Question(R.string.algies_question, false)

    };

    private int currentIndex = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView questionTextView = (TextView) findViewById(R.id.question_view);
        int question = questions[currentIndex].getMtextResId();
        questionTextView.setText(question);


        buttonFalse = (Button) findViewById(R.id.false_button) ;
        buttonTrue = (Button) findViewById(R.id.true_button) ;

        buttonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.Toast_false,Toast.LENGTH_SHORT).show();

            }
        });

        buttonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.Toast_correct,Toast.LENGTH_SHORT).show();
            }
        });



    }
}
