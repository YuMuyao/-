package com.fanxiaoyudemo.myapplication.UserInterface;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.fanxiaoyudemo.myapplication.Adapter.GoodsAdapter;
import com.fanxiaoyudemo.myapplication.JavaBean.Data;
import com.fanxiaoyudemo.myapplication.JavaBean.Goods;
import com.fanxiaoyudemo.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<Goods> myGoods = null;
    private List<Goods> myGoods_copy = null;
    private Context myContext;
    private GoodsAdapter myAdapter = null;
    private ArrayAdapter<String> myAdapter3;
    private ListView GOODS_LIST;
    private ImageView RECORD_IMAGEVIEW;
    private ImageView PERSON_IMAGEVIEW;
    private ImageView SELL_IMAGEVIEW;
    private Spinner spinner;
    private static final String[] category = {"书本", "车辆", "日用", "其它"};
    private ImageView SEARCH;
    private EditText NAME_SEARCH;
    private String category_selected="CheLiang";
    Data MY_DATA;

    @SuppressLint("WrongViewCast")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        RECORD_IMAGEVIEW = (ImageView) findViewById(R.id.record_imageView);
        PERSON_IMAGEVIEW = (ImageView) findViewById(R.id.person_imageView);
        SELL_IMAGEVIEW = (ImageView) findViewById(R.id.sell_imageView);
        spinner = (Spinner) findViewById(R.id.spinner);
        SEARCH = (ImageView) findViewById(R.id.search);
        NAME_SEARCH = (EditText) findViewById(R.id.name_serch);
        MY_DATA = (Data) this.getApplication();

        myGoods=new ArrayList<Goods>();
        myGoods.add(0,new Goods("goods_name","CheLiang",100,"","","","","2020-5-31",null,""));

        myContext =HomeActivity .this;
        GOODS_LIST =(ListView)findViewById(R.id.goods_list);
        myAdapter =new GoodsAdapter(myGoods,myContext);
        GOODS_LIST.setAdapter(myAdapter);

        SEARCH.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                MY_DATA.home_search(NAME_SEARCH.getText().toString(), category_selected);
                myGoods_copy = MY_DATA.getListGoods();
                if (myGoods_copy != null) {
                    myGoods.clear();
                    myGoods.addAll(myGoods_copy);
                    myAdapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(getApplicationContext(), "查询失败", Toast.LENGTH_SHORT).show();
                }
            }
        });

        RECORD_IMAGEVIEW.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(HomeActivity.this, RecordActivity.class);
                startActivity(intent);
            }
        });
        PERSON_IMAGEVIEW.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(HomeActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });
        SELL_IMAGEVIEW.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(HomeActivity.this, SellActivity.class);
                startActivity(intent);
            }
        });

        myAdapter3 =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,category);
        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter3);
        spinner.setOnItemSelectedListener(new SpinnerSelectedListener());
        spinner.setVisibility(View.VISIBLE);
    }

    private class SpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    category_selected="ShuBen";
                    break;
                case 1:
                    category_selected="CheLiang";
                    break;
                case 2:
                    category_selected="RiYong";
                    break;
                case 3:
                    category_selected="QiTa";
                    break;
            }
        }

        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}

