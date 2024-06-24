package com.emma.courseapp.adapter;

import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.emma.courseapp.R;
import com.emma.courseapp.databinding.ViewholderListBinding;
import com.emma.courseapp.model.Course;

import java.util.Random;

public class CourseViewHolder extends RecyclerView.ViewHolder {

    private final ViewholderListBinding binding;

    public CourseViewHolder(@NonNull ViewholderListBinding itemView) {
        super(itemView.getRoot());
        this.binding = itemView;
    }

    public void setBinding(Course course) {
        binding.title.setText(course.getTitle());
        binding.price.setText(String.format("$%s", course.getPrice()));
        Random random = new Random();
        int a = random.nextInt(3);
        String path;

        if (getAdapterPosition() <=4) {
            a = getAdapterPosition();
            path = course.getPicPath();
        } else {
            if (!(a > 0)) {
                a = 1;
            }
            path = course.getPicPath() + a;
        }
        binding.backgroundImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), "Position " + getAdapterPosition()+" - "+path, Toast.LENGTH_SHORT).show();
            }
        });

        int picHolder = binding.getRoot().getContext().getResources().getIdentifier(path, "drawable", binding.getRoot().getContext().getPackageName());
        Glide.with(binding.getRoot().getContext()).load(picHolder).into(binding.pic);


        switch (a) {
            case 0:
                binding.backgroundImg.setImageResource(R.drawable.bg_1);
                binding.mailLayout.setBackgroundResource(R.drawable.list_background_1);
                break;
            case 1:
                binding.backgroundImg.setImageResource(R.drawable.bg_2);
                binding.mailLayout.setBackgroundResource(R.drawable.list_background_2);
                break;
            case 2:
                binding.backgroundImg.setImageResource(R.drawable.bg_3);
                binding.mailLayout.setBackgroundResource(R.drawable.list_background_3);
                break;
            case 3:
                binding.backgroundImg.setImageResource(R.drawable.bg_4);
                binding.mailLayout.setBackgroundResource(R.drawable.list_background_4);
                break;
            case 4:
                binding.backgroundImg.setImageResource(R.drawable.bg_5);
                binding.mailLayout.setBackgroundResource(R.drawable.list_background_5);
                break;
        }

    }
}
