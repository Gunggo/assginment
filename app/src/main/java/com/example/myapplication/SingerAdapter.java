package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class SingerAdapter extends BaseAdapter {
    public static final String TAG = "lecture";

    Context context;
    ArrayList<SingerItem> items = new ArrayList<>();
    int check = 0;

    public SingerAdapter(Context context) {
        this.context = context;
    }

    public void addItem(SingerItem item) {
        items.add(item);
    }

    // 데이터 갯수
    @Override
    public int getCount() {
        return items.size();
    }
    // 파라미터로 받은 위치의 데이터
    @Override
    public Object getItem(int i) {
        return items.get(i);
    }
    // 파라미터로 받은 위치의 id 반환
    @Override
    public long getItemId(int i) {
        return i;
    }
    // 파라미터로 받은 위치의 데이터가 화면에 표시될 view 반환
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final SingerItem item = items.get(position);
        SingerItemView view = null; // <- view 홀더
        if (convertView == null) {
            view = new SingerItemView(context,item.getGender());
        } else {
            view = (SingerItemView) convertView;
        }
        if (item.getGender().equals("male")) {
            view.imageView1.setVisibility(View.VISIBLE);
            view.imageView2.setVisibility(View.GONE);
            check = 0;
        }else {
            view.imageView2.setVisibility(View.VISIBLE);
            view.imageView1.setVisibility(View.GONE);
            check = 1;
        }

        view.setName(item.getName());
        view.setTel(item.getTelnum());
        view.setImage(item.getResId(),check);

        // ******************************************************
        // 리스트뷰안의 버튼 클릭 이벤트 처리
        Button button1 = view.findViewById(R.id.button1);
        button1.setFocusable(false);
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "tel:" + item.getTelnum();

                Log.d(TAG, str);

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                context.startActivity(intent);
            }
        });

        Button button2 = view.findViewById(R.id.button2);
        button2.setFocusable(false);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "smsto:" + item.getTelnum();

                Log.d(TAG, str);

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                context.startActivity(intent);
            }
        });

        return view;
    }
}
