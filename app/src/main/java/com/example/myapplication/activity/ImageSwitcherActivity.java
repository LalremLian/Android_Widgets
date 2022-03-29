package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.example.myapplication.R;

public class ImageSwitcherActivity extends AppCompatActivity {

    //Variables...
    Button nextButton;
    android.widget.ImageSwitcher imageSwitcher;

    int imageSwitcherImages[] =
            {R.drawable.aaa, R.drawable.bbb, R.drawable.ccc, R.drawable.ddd};

    int switcherImageLength = imageSwitcherImages.length;
    int counter = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);

        //Hooks...
        nextButton = findViewById(R.id.ImaageNextbtn);
        imageSwitcher = findViewById(R.id.imageSwitcher);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                ImageView switcherImageView = new ImageView(getApplicationContext());
                /*switcherImageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT));*/

                switcherImageView.setLayoutParams(new ViewGroup.LayoutParams(ActionBar.LayoutParams.FILL_PARENT,
                        ActionBar.LayoutParams.FILL_PARENT));
                switcherImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                switcherImageView.setImageResource(R.drawable.aaa);
                //switcherImageView.setMaxHeight(100);
                return switcherImageView;
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (counter == switcherImageLength){
                    counter = 0;
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }
                else{
                    imageSwitcher.setImageResource(imageSwitcherImages[counter]);
                }

        }
        });
    }
}