package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class ProgressBarActivity extends AppCompatActivity {

    //Variables.........
    int currentProgress = 0, progress;
    Button startProgress;
    android.widget.ProgressBar progressBar, progressBar1;
    TextView textView;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        //Hooks...........
        startProgress = findViewById(R.id.dwnldBTN);
        progressBar = findViewById(R.id.progressbar);
        progressBar1 = findViewById(R.id.progressbar2);
        textView = findViewById(R.id.SHOW);

        startProgress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                currentProgress = currentProgress + 10;
                progressBar.setProgress(currentProgress);
                progressBar.setMax(100);  //range of a progress bar
            }
        });

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                startBar();  //calling method from here.............
            }
        });
        thread.start();
    }

    public void startBar() {

        for (progress = 0; progress<=100; progress = progress + 10)
        {
            try {
                Thread.sleep(500);
                progressBar1.setProgress(progress);  //progressbar1 is the second bar in the main activity....
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            handler.post(new Runnable() {      //for the percentage of the progress bar....
                @Override
                public void run() {
                    textView.setText(String.valueOf(progress + "%"));
                }
            });
        }
    }
}