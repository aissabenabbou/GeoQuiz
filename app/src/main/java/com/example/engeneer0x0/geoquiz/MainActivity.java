package com.example.engeneer0x0.geoquiz;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonTrue ;
    private Button buttonFalse ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
