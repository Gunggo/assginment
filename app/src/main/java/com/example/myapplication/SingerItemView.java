package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SingerItemView extends LinearLayout {

    TextView textView1;
    TextView textView2;
    Button button1;
    Button button2;
    ImageView imageView1;
    ImageView imageView2;

    public SingerItemView(Context context, String gender) {
        super(context);

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.singer_item_view, this, true);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);

    }

    public void setName(String name) {
        textView1.setText(name);
    }

    public void setTel(String telnum) {
        textView2.setText(telnum);
    }

    public void setImage(int imgNum,int check) {
        // 0 == 남자 , 1 == 여자
        if (check == 0) {
            imageView1.setImageResource(imgNum);
        } else {
            imageView2.setImageResource(imgNum);
        }
    }
}
