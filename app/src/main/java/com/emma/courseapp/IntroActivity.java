package com.emma.courseapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnticipateInterpolator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import com.emma.courseapp.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {

    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        splashScreen.setKeepOnScreenCondition(() -> {
            // Keep the splash screen visible until your app is ready to display content.
            return false;
        });
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
//            getSplashScreen().setOnExitAnimationListener(splashScreenView -> {
//                final ObjectAnimator slideUp = ObjectAnimator.ofFloat(
//                        splashScreenView,
//                        View.TRANSLATION_Y,
//                        0f,
//                        -splashScreenView.getHeight()
//                );
//                slideUp.setInterpolator(new AnticipateInterpolator());
//                slideUp.setDuration(2L);
//
//                // Call SplashScreenView.remove at the end of your custom animation.
//                slideUp.addListener(new AnimatorListenerAdapter() {
//                    @Override
//                    public void onAnimationEnd(Animator animation) {
//                        splashScreenView.remove();
//                    }
//                });
//
//                // Run your animation.
//                slideUp.start();
//            });
//        }

        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);

    }
}