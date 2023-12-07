package com.example.zoomanagement;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewInfo;
    private Button buttonLion, buttonElephant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewInfo = findViewById(R.id.textViewInfo);
        buttonLion = findViewById(R.id.buttonLion);
        buttonElephant = findViewById(R.id.buttonElephant);

        buttonLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayLionInfo();
            }
        });

        buttonElephant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayElephantInfo();
            }
        });
    }

    private void displayLionInfo() {
        String info = "Name: Lion\nSound: Roar\nFeatures: Strong, carnivorous\nFeeding Time: 10 AM\nEnclosure Time: 6 PM";
        textViewInfo.setText(info);
    }

    private void displayElephantInfo() {
        String info = "Name: Elephant\nSound: Trumpet\nFeatures: Large, herbivorous\nFeeding Time: 8 AM\nEnclosure Time: 7 PM";
        textViewInfo.setText(info);
    }
}