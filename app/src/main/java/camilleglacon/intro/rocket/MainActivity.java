package camilleglacon.intro.rocket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.rocket).startAnimation(AnimationUtils.loadAnimation(this,R.anim.flotteur));

    }


    public void slidetop(View view) {
        findViewById(R.id.rocket).startAnimation(AnimationUtils.loadAnimation(this,R.anim.slidetop));
    }
}
