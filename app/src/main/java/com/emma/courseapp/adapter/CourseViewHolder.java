package com.emma.courseapp.adapter;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.emma.courseapp.databinding.ViewholderListBinding;
import com.emma.courseapp.model.Course;

import java.util.Random;

public class CourseViewHolder extends RecyclerView.ViewHolder {

    ViewholderListBinding binding;

    public CourseViewHolder(@NonNull ViewholderListBinding itemView) {
        super(itemView.getRoot());
        this.binding = itemView;
    }

    public void setBinding(Course course) {
        binding.title.setText(course.getTitle());
        binding.price.setText(String.valueOf(course.getPrice()));
        int picHolder = binding.getRoot().getContext().getResources().getIdentifier(course.getPicPath(), "drawable", binding.getRoot().getContext().getPackageName());
        Glide.with(binding.getRoot().getContext()).load(picHolder).into(binding.pic);

        Random random = new Random();
        String a = String.valueOf(random.nextInt(5));
        String b = "R.drawable.bg_" + a;
        String c = "R.drawable.list_background_" + a;
        binding.backgroundImg.setImageResource(binding.getRoot().getContext().getResources().getIdentifier(b, "drawable", binding.getRoot().getContext().getPackageName()));
        binding.mailLayout.setBackgroundResource(binding.getRoot().getContext().getResources().getIdentifier(c, "drawable", binding.getRoot().getContext().getPackageName()));
    }
}
