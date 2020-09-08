package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button askButton;
        askButton = (Button) findViewById(R.id.askButton);
        final TextView title = findViewById(R.id.title);
        final ImageView frontImage = findViewById(R.id.ball);
        final int ballList[]={R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5};
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Magic ball 8","Button has been pressed");
                Random r = new Random();
                int n = r.nextInt(5);
                frontImage.setImageResource(ballList[n]);
            }
        });
    }
}
