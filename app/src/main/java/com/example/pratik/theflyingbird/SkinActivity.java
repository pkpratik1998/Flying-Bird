package com.example.pratik.theflyingbird;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class SkinActivity extends Activity {

    public ImageButton imgbtnBird1;
    public ImageButton imgbtnBird2;
    public static int birdNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);


        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        getWindow().setLayout((int) (width*.9),(int) (height*.6));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);

        imgbtnBird1=(ImageButton)findViewById(R.id.imgbtnBird1);
        imgbtnBird2=(ImageButton)findViewById(R.id.imgbtnBird2);
        imgbtnBird1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birdNo=1;
                Toast.makeText(SkinActivity.this, "Bird 1 Selected", Toast.LENGTH_SHORT).show();
            }
        });
        imgbtnBird2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birdNo=2;
                Toast.makeText(SkinActivity.this, "Bird 2 Selected", Toast.LENGTH_SHORT).show();
            }
        });
    }
}