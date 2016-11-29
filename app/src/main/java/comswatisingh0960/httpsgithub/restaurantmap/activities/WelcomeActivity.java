package comswatisingh0960.httpsgithub.restaurantmap.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import comswatisingh0960.httpsgithub.restaurantmap.R;

/**
 * Created by Swati on 11/29/2016.
 */

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent intent = new Intent(WelcomeActivity.this, StartActivity.class);
        startActivity(intent);

    }
}

