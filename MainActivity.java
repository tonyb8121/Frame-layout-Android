package com.example.framelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private Button changeButton;
    private boolean isImage1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        changeButton = findViewById(R.id.changeButton);

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isImage1) {
                    imageView.setImageResource(R.drawable.image2);
                    textView.setText("You switched to Image 2");
                } else {
                    imageView.setImageResource(R.drawable.image1);
                    textView.setText("Welcome to FrameLayout");
                }
                isImage1 = !isImage1; // Toggle the image state
            }
        });
    }
}