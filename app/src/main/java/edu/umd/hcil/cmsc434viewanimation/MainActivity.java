package edu.umd.hcil.cmsc434viewanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAnimateButton(View v){
        TextView textView = (TextView) findViewById(R.id.textViewHelloWorld);
        Animation textViewAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_demo);
        textView.startAnimation(textViewAnimation);
    }
}
