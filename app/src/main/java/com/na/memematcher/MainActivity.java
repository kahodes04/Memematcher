package com.na.memematcher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView danschneider = (ImageView) findViewById(R.id.imgdanschneider) ;
        ImageView haveyou = (ImageView) findViewById(R.id.haveyou) ;
        ImageView seenthese = (ImageView) findViewById(R.id.seenthese) ;
        ImageView girls = (ImageView) findViewById(R.id.girls) ;

        final LinearLayout credits = (LinearLayout) findViewById(R.id.linearlayoutmainscreen);
        credits.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent in = new Intent(getApplicationContext(), aftertitleactivity.class);
                startActivity(in);
            }
        });

        Animation righttoleftanimation = AnimationUtils.loadAnimation(this, R.anim.anim1);
        danschneider.startAnimation(righttoleftanimation);

        righttoleftanimation = AnimationUtils.loadAnimation(this, R.anim.anim3);
        haveyou.startAnimation(righttoleftanimation);

        righttoleftanimation = AnimationUtils.loadAnimation(this, R.anim.anim1);
        seenthese.startAnimation(righttoleftanimation);

        righttoleftanimation = AnimationUtils.loadAnimation(this, R.anim.anim3);
        girls.startAnimation(righttoleftanimation);
    }
}
