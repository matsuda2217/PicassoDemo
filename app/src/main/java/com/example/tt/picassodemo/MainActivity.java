package com.example.tt.picassodemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img = (ImageView) findViewById(R.id.image);

        Picasso.with(this).load("http://xn--nhppro-c3a1761d0fa.vn/images/hinh-nen-hot-girl-quynh-chi-noi-tieng1-1024x768-1413841801.jpg")
                .resize(300,300)
                .into(img);
    }


}
