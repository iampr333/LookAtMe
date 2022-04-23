package com.example.lookatme;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.pd.lookatme.LookAtMe;

public class MainActivity extends AppCompatActivity {
    private LookAtMe lookAtMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        lookAtMe = findViewById(R.id.lookme);

        lookAtMe.init(this);
      //  lookAtMe.setVideoURI(Uri.parse("android.resource://" + getPackageName() + " /" + R.raw.videoplayback));
        lookAtMe.setVideoPath("https://www.rmp-streaming.com/media/big-buck-bunny-360p.mp4"); // use video from a url

        lookAtMe.start();
        lookAtMe.setLookMe();
    }
}