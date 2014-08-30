package com.practise.androidux;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView imageView[] = new ImageView[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView[0] = (ImageView) findViewById(R.id.imageView1);
        imageView[1] = (ImageView) findViewById(R.id.imageView2);
        imageView[2] = (ImageView) findViewById(R.id.animatedImage);
        imageView[0].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onImageClicked(v);	
			}
		});
        imageView[1].setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onImageClicked(v);	
			}
		});
    }
    public void onImageClicked(View thumbnailView) {
    	  ImageView thumbnail = (ImageView) thumbnailView;
    	  ImageView animatedImage = (ImageView) findViewById(R.id.animatedImage);
    	  animatedImage.setImageDrawable(thumbnail.getDrawable());
    	  animatedImage.setVisibility(View.VISIBLE);

    	  Animation animation
    	    = AnimationUtils.loadAnimation(this, R.anim.combined_animation2);
    	  animatedImage.startAnimation(animation);
    	}
}
