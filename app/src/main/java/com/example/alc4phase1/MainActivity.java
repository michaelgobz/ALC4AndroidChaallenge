package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickAboutAlc(View view) {
         // we handle the onclick
        Intent intent = new Intent(this , AboutALC2.class);
       startActivity(intent);
    }

    public void clickMyProfile(View view) {
        // we handle the clicking of our button to the profile
        Intent intent2 = new Intent(this, MyProfile.class);
        startActivity(intent2);

    }
}
