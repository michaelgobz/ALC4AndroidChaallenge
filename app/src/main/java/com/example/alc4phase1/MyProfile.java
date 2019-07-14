package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        // we change the source of my image

        ImageView myProfile = findViewById(R.id.my_profile);
        myProfile.setImageResource(R.drawable.myprofile);

     }
}
