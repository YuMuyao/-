package com.fanxiaoyudemo.myapplication.UserInterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fanxiaoyudemo.myapplication.JavaBean.Data;
import com.fanxiaoyudemo.myapplication.R;

public class SellActivity extends AppCompatActivity {

    private ImageView GO_BACK;
    private EditText GOODS_NAME;
    private EditText PRICE;
    private EditText DETAILS;
    private RadioButton SHUBEN_CHINESE;
    private RadioButton CHELIANG_CHINESE;
    private RadioButton RIYONG_CHINESE;
    private RadioButton QITA_CHINESE;
    private Button SELL_BUTTON;
    private String category="CheLiang";
    Data MY_DATA;
    int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        GO_BACK=(ImageView)findViewById(R.id.go_back);
        GOODS_NAME=(EditText)findViewById(R.id.goods_name);
        PRICE=(EditText)findViewById(R.id.price);
        DETAILS=(EditText)findViewById(R.id.details);
        SHUBEN_CHINESE=(RadioButton)findViewById(R.id.ShuBen_Chinese);
        CHELIANG_CHINESE=(RadioButton)findViewById(R.id.CheLiang_Chinese);
        RIYONG_CHINESE=(RadioButton)findViewById(R.id.RiYong_Chinese);
        QITA_CHINESE=(RadioButton)findViewById(R.id.QiTa_Chinese);
        SELL_BUTTON=(Button)findViewById(R.id.sell_button);
        MY_DATA= (Data)this.getApplication();

        GO_BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        SELL_BUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String goods_name=GOODS_NAME.getText().toString();
                Float price=Float.parseFloat(PRICE.getText().toString());
                String details= DETAILS.getText().toString();
                if(CHELIANG_CHINESE.isChecked()){
                    category="CheLiang";
                }else if(SHUBEN_CHINESE.isChecked()){
                    category="ShuBen";
                }else if(RIYONG_CHINESE.isChecked()){
                    category="RiYong";
                }else {
                    category="QiTa";
                }
                MY_DATA.sell(goods_name, category,price, details);
                flag=MY_DATA.getFlag_sell();
                if(MY_DATA.LOCK_SELL==1){
                    if(flag==1){
                        Toast.makeText(getApplicationContext(), "出售成功", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(SellActivity.this,HomeActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getApplicationContext(), "出售失败", Toast.LENGTH_SHORT).show();
                    }
                    MY_DATA.LOCK_SELL=0;
                }

            }
        });

    }
}
