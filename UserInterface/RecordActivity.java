package com.fanxiaoyudemo.myapplication.UserInterface;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.fanxiaoyudemo.myapplication.Adapter.RecordsAdapter;
import com.fanxiaoyudemo.myapplication.JavaBean.Data;
import com.fanxiaoyudemo.myapplication.JavaBean.Goods;
import com.fanxiaoyudemo.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class RecordActivity extends AppCompatActivity {
    private List<Goods> myRecords=null;
    private Context myContext;
    private RecordsAdapter myAdapter2;
    private ListView RECORDS_LIST;
    private ImageView GO_BACK;
    Data MY_DATA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        MY_DATA=(Data) this.getApplication();
        GO_BACK=(ImageView)findViewById(R.id.go_back);
        GO_BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        RECORDS_LIST =(ListView)findViewById(R.id.records_list);
        myContext =RecordActivity.this;
        myRecords=new ArrayList<Goods>();
        MY_DATA.record_search1();
        MY_DATA.record_search2();
        myRecords=MY_DATA.getRecordsData1();
        myRecords.addAll(MY_DATA.getRecordsData2());
//        myRecords.add(0,new Goods("goods_name","车辆",100,"","","","","2020-5-31",null,""));
        myAdapter2 =new RecordsAdapter(myRecords,myContext);
        RECORDS_LIST.setAdapter(myAdapter2);
    }
}
