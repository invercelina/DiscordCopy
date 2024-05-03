package com.example.discord;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tvnotice = findViewById(R.id.tv_notice);
        tvnotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "공지사항";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        TextView tvcoworker = findViewById(R.id.tv_coworker);
        tvcoworker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "동료에게-물어봐";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        TextView tvai = findViewById(R.id.tv_ai);
        tvai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "인공지능-과정";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        TextView tvapp = findViewById(R.id.tv_app);
        tvapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "앱-과정";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        TextView tvproject = findViewById(R.id.tv_project);
        tvproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "프로젝트-과정";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        TextView tvrecommendation = findViewById(R.id.tv_recommendation);
        tvrecommendation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "점심-추천해요";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        TextView tvofftherecord = findViewById(R.id.tv_offtherecord);
        tvofftherecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "오프더레코드";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });

        TextView tvshare = findViewById(R.id.tv_share);
        tvshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "정보-공유해요";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });


    }
}