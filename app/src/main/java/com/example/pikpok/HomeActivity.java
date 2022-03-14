package com.example.pikpok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.pikpok.Adapter.DemoAdapter;
import com.example.pikpok.Models.MediaObject;
import com.example.pikpok.databinding.ActivityHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
   ActivityHomeBinding binding;
   ImageView sound_disk;
   DemoAdapter demoAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        sound_disk=findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.disk).into(sound_disk);
        List<MediaObject> list=new ArrayList<>();



        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        demoAdapter=new DemoAdapter(list,this);

    }
}