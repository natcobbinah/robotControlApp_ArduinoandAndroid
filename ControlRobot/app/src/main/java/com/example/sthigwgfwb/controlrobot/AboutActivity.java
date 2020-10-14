package com.example.sthigwgfwb.controlrobot;

/**
 * Created by STHIGWGFWB on 22/02/2018.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import com.led_on_off.led.R;

public class AboutActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void fb(View view)
    {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/hewlett cobbinah"));
        startActivity(fbIntent);
    }

    public void tweet(View view)
    {
        Intent tweetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Nathaniel Cobbinah/"));
        startActivity(tweetIntent);
    }

    public void insta(View view)
    {
        Intent instaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/WalkingKali/"));
        startActivity(instaIntent);
    }


    public void web(View view)
    {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/WalkingKali/"));
        startActivity(webIntent);
    }
}