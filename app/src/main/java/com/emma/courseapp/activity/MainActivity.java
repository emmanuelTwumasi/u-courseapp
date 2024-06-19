package com.emma.courseapp.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.emma.courseapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
//        binding.backImg.setOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());
        binding.txtPopularCourses.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CourseListActivity.class);
            startActivity(intent);
        });

    }
}