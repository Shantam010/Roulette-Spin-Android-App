package com.shantams.roulette;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    ImageView wheel;

    Random random;

    int degree = 0, degree_old = 0;

    private static final float FACTOR = 4.86f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        wheel = (ImageView) findViewById(R.id.ic_wheel);

        random = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degree_old = degree * 360;
                degree = random.nextInt(3600) + 720;
                RotateAnimation rotateAnimation = new RotateAnimation(degree_old, degree, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotateAnimation.setDuration(3600);
                rotateAnimation.setInterpolator(new DecelerateInterpolator());
                rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        textView.setText("");
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree % 360)));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                wheel.startAnimation(rotateAnimation);
            }
        });
    }

    private String currentNumber(int degree){
        String text = "";

        if (degree >= (FACTOR * 1) && degree < (FACTOR * 3)) {
            text = "32 Red";
        }
        if (degree >= (FACTOR * 3) && degree < (FACTOR * 5)) {
            text = "15 Black";
        }
        if (degree >= (FACTOR * 5) && degree < (FACTOR * 7)) {
            text = "19 Red";
        }
        if (degree >= (FACTOR * 7) && degree < (FACTOR * 9)) {
            text = "4 Black";
        }
        if (degree >= (FACTOR * 9) && degree < (FACTOR * 11)) {
            text = "21 Red";
        }
        if (degree >= (FACTOR * 11) && degree < (FACTOR * 13)) {
            text = "2 Black";
        }
        if (degree >= (FACTOR * 13) && degree < (FACTOR * 15)) {
            text = "25 Red";
        }
        if (degree >= (FACTOR * 15) && degree < (FACTOR * 17)) {
            text = "17 Black";
        }
        if (degree >= (FACTOR * 17) && degree < (FACTOR * 19)) {
            text = "34 Red";
        }
        if (degree >= (FACTOR * 19) && degree < (FACTOR * 21)) {
            text = "6 Black";
        }
        if (degree >= (FACTOR * 21) && degree < (FACTOR * 23)) {
            text = "27 Red";
        }
        if (degree >= (FACTOR * 23) && degree < (FACTOR * 25)) {
            text = "13 Black";
        }
        if (degree >= (FACTOR * 25) && degree < (FACTOR * 27)) {
            text = "36 Red";
        }
        if (degree >= (FACTOR * 27) && degree < (FACTOR * 29)) {
            text = "11 Black";
        }
        if (degree >= (FACTOR * 29) && degree < (FACTOR * 31)) {
            text = "30 Red";
        }
        if (degree >= (FACTOR * 31) && degree < (FACTOR * 33)) {
            text = "8 Black";
        }
        if (degree >= (FACTOR * 33) && degree < (FACTOR * 35)) {
            text = "23 Red";
        }
        if (degree >= (FACTOR * 35) && degree < (FACTOR * 37)) {
            text = "10 Black";
        }
        if (degree >= (FACTOR * 37) && degree < (FACTOR * 39)) {
            text = "5 Red";
        }
        if (degree >= (FACTOR * 39) && degree < (FACTOR * 41)) {
            text = "24 Black";
        }
        if (degree >= (FACTOR * 41) && degree < (FACTOR * 43)) {
            text = "16 Red";
        }
        if (degree >= (FACTOR * 43) && degree < (FACTOR * 45)) {
            text = "33 Black";
        }
        if (degree >= (FACTOR * 45) && degree < (FACTOR * 47)) {
            text = "1 Red";
        }
        if (degree >= (FACTOR * 47) && degree < (FACTOR * 49)) {
            text = "20 Black";
        }
        if (degree >= (FACTOR * 49) && degree < (FACTOR * 51)) {
            text = "14 Red";
        }
        if (degree >= (FACTOR * 51) && degree < (FACTOR * 53)) {
            text = "31 Black";
        }
        if (degree >= (FACTOR * 53) && degree < (FACTOR * 55)) {
            text = "9 Red";
        }
        if (degree >= (FACTOR * 55) && degree < (FACTOR * 57)) {
            text = "22 Black";
        }
        if (degree >= (FACTOR * 57) && degree < (FACTOR * 59)) {
            text = "18 Red";
        }
        if (degree >= (FACTOR * 59) && degree < (FACTOR * 61)) {
            text = "29 Black";
        }
        if (degree >= (FACTOR * 61) && degree < (FACTOR * 63)) {
            text = "7 Red";
        }
        if (degree >= (FACTOR * 63) && degree < (FACTOR * 65)) {
            text = "28 Black";
        }
        if (degree >= (FACTOR * 65) && degree < (FACTOR * 67)) {
            text = "12 Red";
        }
        if (degree >= (FACTOR * 67) && degree < (FACTOR * 69)) {
            text = "35 Black";
        }
        if (degree >= (FACTOR * 69) && degree < (FACTOR * 71)) {
            text = "3 Red";
        }
        if (degree >= (FACTOR * 71) && degree < (FACTOR * 73)) {
            text = "26 Black";
        }
        if ((degree >= (FACTOR * 73) && degree < 360) || (degree >= 0 && degree < (FACTOR * 1))){
            text = "0";
        }
        return text;
    }
}