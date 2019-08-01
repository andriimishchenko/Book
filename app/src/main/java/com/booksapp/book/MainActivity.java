package com.booksapp.book;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends Activity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    Intent i = new Intent(MainActivity.this, ListOfThemes.class);
                    startActivity(i);
                    finish();
                }
            },2*1000);
            FrameLayout.LayoutParams paramsForStartPage = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);



            ImageView startLogo=new ImageView(this);
            startLogo.setImageResource(R.drawable.jacket);
            startLogo.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT));


            FrameLayout fl=new FrameLayout(this);
            fl.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT));
            fl.addView(startLogo);
            setContentView(fl);
        }
}
