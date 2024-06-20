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
            Intent intent = new Intent(getApplicationContext(), CourseListActivity.class);
            startActivity(intent);
        });
        binding.btnNav.checkOutBtn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), CheckoutActivity.class);
            startActivity(intent);
        });
        binding.btnNav.profileBtn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intent);
        });
        binding.btnNav.homeBtn.setOnClickListener(v -> {

        });
        binding.btnNav.settingsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
            startActivity(intent);
        });
    }
}