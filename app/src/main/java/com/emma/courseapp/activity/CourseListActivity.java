package com.emma.courseapp.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.emma.courseapp.adapter.CourseAdapter;
import com.emma.courseapp.databinding.ActivityCourseListBinding;
import com.emma.courseapp.model.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseListActivity extends AppCompatActivity {

    private List<Course> courses = new ArrayList<>();
    private ActivityCourseListBinding binding;
    private CourseAdapter courseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCourseListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
        System.err.println("courses: " + courses.size());
        initRecyclerView();
    }

    public void init() {
        courses = Arrays.asList(
                new Course("Advance certificate program for AI", 24, "btn_1"),
                new Course("Google cloud platform architecture", 69, "btn_2"),
                new Course("Fundamentals of Java programming", 100, "btn_3"),
                new Course("Introduction to UI design history", 46, "btn_4"),
                new Course("Advance certificate program for AI", 24, "btn_1")
        );
        binding.backImg.setOnClickListener(v -> getOnBackPressedDispatcher().onBackPressed());
    }

    private void initRecyclerView() {
        courseAdapter = new CourseAdapter(courses);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        binding.recyclerView.setVisibility(View.VISIBLE);
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setAdapter(courseAdapter);
    }
}