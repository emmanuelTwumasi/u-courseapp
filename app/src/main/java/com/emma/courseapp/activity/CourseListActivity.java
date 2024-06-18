package com.emma.courseapp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.emma.courseapp.adapter.CourseAdapter;
import com.emma.courseapp.databinding.ActivityCourseListBinding;
import com.emma.courseapp.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseListActivity extends AppCompatActivity {

    private final List<Course> courses = new ArrayList<>();
    private ActivityCourseListBinding binding;
    private CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCourseListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initRecyclerView();
    }

    private void initRecyclerView() {
        courseAdapter = new CourseAdapter(courses);
        binding.backImg.setOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());
        binding.recyclerView.setAdapter(courseAdapter);
    }
}