package com.example.discord;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public void toaster(TextView tv) {
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                text = tv.getText().toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(MainActivity.this, text, duration);
                toast.show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView tvnotice = findViewById(R.id.tv_notice);
        toaster(tvnotice);

        TextView tvcoworker = findViewById(R.id.tv_coworker);
        toaster(tvcoworker);

        TextView tvai = findViewById(R.id.tv_ai);
        toaster(tvai);

        TextView tvapp = findViewById(R.id.tv_app);
        toaster(tvapp);

        TextView tvproject = findViewById(R.id.tv_project);
        toaster(tvproject);

        TextView tvrecommendation = findViewById(R.id.tv_recommendation);
        toaster(tvrecommendation);

        TextView tvofftherecord = findViewById(R.id.tv_offtherecord);
        toaster(tvofftherecord);

        TextView tvshare = findViewById(R.id.tv_share);
        toaster(tvshare);

        TextView tvconfirm = findViewById(R.id.tv_confirm);

        tvconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvnotice.getVisibility() == View.GONE) {
                    tvnotice.setVisibility(View.VISIBLE);
                } else {
                    tvnotice.setVisibility(View.GONE);
                }
            }
        });

        TextView tvquestion = findViewById(R.id.tv_question);

        tvquestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvcoworker.getVisibility() == View.GONE) {
                    tvcoworker.setVisibility(View.VISIBLE);
                } else {
                    tvcoworker.setVisibility(View.GONE);
                }
            }
        });

        TextView tvedu = findViewById(R.id.tv_edu);

        tvedu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvai.getVisibility() == View.GONE) {
                    tvai.setVisibility(View.VISIBLE);
                    tvapp.setVisibility(View.VISIBLE);
                    tvproject.setVisibility(View.VISIBLE);
                } else {
                    tvai.setVisibility(View.GONE);
                    tvapp.setVisibility(View.GONE);
                    tvproject.setVisibility(View.GONE);
                }
            }
        });

        TextView tvintimate = findViewById(R.id.tv_intimate);
        TextView tvstudy = findViewById(R.id.tv_study);
        ImageView ivvolume = findViewById(R.id.iv_volume);
        tvintimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvshare.getVisibility() == View.GONE) {
                    tvrecommendation.setVisibility(View.VISIBLE);
                    tvofftherecord.setVisibility(View.VISIBLE);
                    tvshare.setVisibility(View.VISIBLE);
                    tvstudy.setVisibility(View.VISIBLE);
                    ivvolume.setVisibility(View.VISIBLE);
                } else {
                    tvrecommendation.setVisibility(View.GONE);
                    tvofftherecord.setVisibility(View.GONE);
                    tvshare.setVisibility(View.GONE);
                    tvstudy.setVisibility(View.GONE);
                    ivvolume.setVisibility(View.GONE);
                }
            }
        });

    }
}