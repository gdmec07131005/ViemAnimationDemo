package cn.edu.gdemc.s07131005.viemanimationdemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
	private Button btAlpha, btTranslate, btScale, btRotate, btAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tv = (TextView) findViewById(R.id.textView1);
        btAlpha = (Button) findViewById(R.id.button1);
        btTranslate = (Button) findViewById(R.id.button2);
        btScale = (Button) findViewById(R.id.button3);
        btRotate = (Button) findViewById(R.id.button4);
        btAll = (Button) findViewById(R.id.button5);
        
        btAlpha.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Animation alpha = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha_animation);
				tv.startAnimation(alpha);
			}
		});
        
        btTranslate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Animation translate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_animation);
				tv.startAnimation(translate);
			}
		});
        
        btScale.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Animation scale = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale_animation);
				tv.startAnimation(scale);
				
			}
		});
        btRotate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Animation Rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotateanimation);
				tv.startAnimation(Rotate);			
			}
		});
        
        btAll.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Animation All = AnimationUtils.loadAnimation(MainActivity.this, R.anim.set_animation);
				tv.startAnimation(All);
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
