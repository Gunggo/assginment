package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "lecture";

    SingerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new SingerAdapter(this);
        SingerItem item1 = new SingerItem("고성은", "010-7340-7171", R.drawable.rhtjddms, "male");
        adapter.addItem(item1);

        SingerItem item2 = new SingerItem("김관호","010-4422-1669",R.drawable.rlarhksgh, "male");
        adapter.addItem(item2);

        SingerItem item3 = new SingerItem("김승현","010-5520-5215",R.drawable.rlatmdgus, "male");
        adapter.addItem(item3);

        SingerItem item4 = new SingerItem("김승환", "010-4517-9330", R.drawable.rlatmdghks, "male");
        adapter.addItem(item4);

        SingerItem item5 = new SingerItem("노동현", "010-8254-8754", R.drawable.shehdgus, "male");
        adapter.addItem(item5);

        SingerItem item6 = new SingerItem("박다은", "010-6739-1559", R.drawable.qkrekdms, "female");
        adapter.addItem(item6);

        SingerItem item7 = new SingerItem("박지훈", "010-4029-9306", R.drawable.qkrwlgns, "male");
        adapter.addItem(item7);

        SingerItem item8 = new SingerItem("박창환", "010-3529-5523", R.drawable.qkrckdghks, "male");
        adapter.addItem(item8);

        SingerItem item9 = new SingerItem("서기남", "010-9249-4217", R.drawable.tjrlska, "male");
        adapter.addItem(item9);

        SingerItem item10 = new SingerItem("선우은미", "010-4179-4191", R.drawable.tjsdndmsal, "female");
        adapter.addItem(item10);

        SingerItem item11 = new SingerItem("신혜성", "010-5714-0314", R.drawable.tlsgptjd, "male");
        adapter.addItem(item11);

        SingerItem ite12 = new SingerItem("양호열", "010-4949-5102", R.drawable.didghduf, "male");
        adapter.addItem(ite12);

        SingerItem item13 = new SingerItem("윤송", "010-3627-7217", R.drawable.dbsthd, "female");
        adapter.addItem(item13);

        SingerItem item14 = new SingerItem("윤재필", "010-7182-6895", R.drawable.dbswovlf, "male");
        adapter.addItem(item14);

        SingerItem item15 = new SingerItem("이시은", "010-7743-1274", R.drawable.dltldms, "female");
        adapter.addItem(item15);

        SingerItem item16 = new SingerItem("이유진", "010-8798-2081", R.drawable.dldbwls, "female");
        adapter.addItem(item16);

        SingerItem item17 = new SingerItem("정민승", "010-5621-8245", R.drawable.wjdalstmd, "male");
        adapter.addItem(item17);

        SingerItem item18 = new SingerItem("정승우", "010-7172-5170", R.drawable.wjdtmddn, "male");
        adapter.addItem(item18);

        SingerItem item19 = new SingerItem("조혜원", "010-3948-0207", R.drawable.whgpdnjs, "female");
        adapter.addItem(item19);

        SingerItem item20 = new SingerItem("최영수", "010-2527-1657", R.drawable.chldudtn, "male");
        adapter.addItem(item20);

        SingerItem item21 = new SingerItem("한진희", "010-5344-9980", R.drawable.gkswlsgml, "male");
        adapter.addItem(item21);

        SingerItem item22 = new SingerItem("한태준", "010-6361-4874", R.drawable.gksxowns, "male");
        adapter.addItem(item22);

        SingerItem item23 = new SingerItem("허예진", "010-6307-6025", R.drawable.gjdpwls, "female");
        adapter.addItem(item23);

        SingerItem item24 = new SingerItem("홍석우", "010-7381-9117", R.drawable.ghdtjrdn, "male");
        adapter.addItem(item24);

        ListView listView1 = findViewById(R.id.listView1);
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SingerItem item = (SingerItem) adapter.getItem(i);
                Toast.makeText(getApplicationContext()
                ,"selecte : " + item.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
