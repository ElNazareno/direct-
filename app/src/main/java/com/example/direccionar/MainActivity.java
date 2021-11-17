package com.example.direccionar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.nio.file.Files;

public class MainActivity extends AppCompatActivity {
    ImageButton twitter,twich,face,insta,itunes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        variables();
        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wenas = getPackageManager().getLaunchIntentForPackage("https://com.facebook.katana");
                startActivity(wenas);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wenas = getPackageManager().getLaunchIntentForPackage("https://com.android.chrome");
                startActivity(wenas);
            }
        });

        twich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wenas = getPackageManager().getLaunchIntentForPackage("https://tv.twitch.android.app");
                startActivity(wenas);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wenas = getPackageManager().getLaunchIntentForPackage("https://com.chrome.android");
                startActivity(wenas);
            }
        });

        itunes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wenas = getPackageManager().getLaunchIntentForPackage("https://com.apple.android.music");
                startActivity(wenas);
            }
        });

    }

    private void variables() {
        twitter=findViewById(R.id.btnTwitter);
        twich=findViewById(R.id.btnTwitch);
        face=findViewById(R.id.btnFace);
        insta=findViewById(R.id.btnInsta);
        itunes=findViewById(R.id.btnItunes);
    }
}