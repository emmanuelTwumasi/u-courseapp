package com.emma.courseapp.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.emma.courseapp.adapter.CourseAdapter;
import com.emma.courseapp.databinding.ActivityCourseListBinding;
import com.emma.courseapp.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseListActivity extends AppCompatActivity {

    ActivityCourseListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCourseListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.backImg.setOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());
        init();
    }

    public void init() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Advance certificate program for AI", "24", "btn_1"));
        courses.add(new Course("Google cloud platform architecture", "69", "btn_2"));
        courses.add(new Course("Fundamentals of Java programming", "100", "btn_3"));
        courses.add(new Course("Introduction to UI design history", "46", "btn_4"));
        courses.add(new Course("Advance certificate program for AI", "24", "btn_1"));
        initRecyclerView(courses);
    }

    private void initRecyclerView(List<Course> courses) {
        binding.recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        binding.recyclerView.setLayoutManager(layoutManager);
        CourseAdapter courseAdapter = new CourseAdapter(courses);
        binding.recyclerView.setAdapter(courseAdapter);
    }
}