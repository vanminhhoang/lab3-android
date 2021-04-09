package com.example.lab03_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //acChonMau();
        Button button=findViewById(R.id.buttonchonmau);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.activity_main2);
                        actionMau();
                    }
                });
    }
//    private void acChonMau(){
//        Button button=findViewById(R.id.buttonchonmau);
//        button.setOnClickListener(
//                new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                setContentView(R.layout.activity_main2);
//                actionMau();
//            }
//        });
//        return;
//    }

    private void actionMau(){
        Button buttonbac=findViewById(R.id.buttonbac);
        Button buttondo=findViewById(R.id.buttonred);
        Button buttonden=findViewById(R.id.buttonden);
        Button buttonxanh=findViewById(R.id.buttonxanh);
        ImageView image=findViewById(R.id.imageDT);
        TextView ncc=findViewById(R.id.ncc);
        TextView mau=findViewById(R.id.mau);
        TextView gia=findViewById(R.id.gia);
        buttonbac.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ncc.setText("Cung cấp bởi Tiki Tradding");
                        gia.setText("1.790.000 đ");
                        mau.setText("Màu: bạc");
                        image.setImageDrawable(getResources().getDrawable(R.drawable.vs_bac));
                    }
                });
        buttondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncc.setText("Cung cấp bởi Tiki Tradding");
                gia.setText("1.790.000 đ");
                mau.setText("Màu: đỏ");
                image.setImageDrawable(getResources().getDrawable(R.drawable.vs_red_a));
            }
        });
        buttonden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncc.setText("Cung cấp bởi Tiki Tradding");
                gia.setText("1.790.000 đ");
                mau.setText("Màu: đen");
                image.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_black_star));
            }
        });
        buttonxanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ncc.setText("Cung cấp bởi Tiki Tradding");
                gia.setText("1.790.000 đ");
                mau.setText("Màu: xanh");
                image.setImageDrawable(getResources().getDrawable(R.drawable.vsmart_live_xanh));
            }
        });
        acXong();
        return;
    }

    private void acXong(){
        Button buttonXong=findViewById(R.id.buttonxong);
        ImageView image1=findViewById(R.id.imageDT);
        buttonXong.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.activity_main);
                        ImageView image=findViewById(R.id.imageViewDT);
                        image.setImageDrawable(image1.getDrawable());
                    }
                });
        return;
    }

}