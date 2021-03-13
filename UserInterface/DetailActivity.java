package com.fanxiaoyudemo.myapplication.UserInterface;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fanxiaoyudemo.myapplication.JavaBean.Data;
import com.fanxiaoyudemo.myapplication.R;

public class DetailActivity extends AppCompatActivity {

    private ImageView GO_BACK;
    private TextView GOODS_NAME;
    private TextView PRICE;
    private TextView SELLER_NAME;
    private TextView RELEASE_TIME;
    private TextView DETAILS;
    private Button BUY_BUTTON;
    private int position=0;
    private String object_id;
    int flag=0;
    Data MY_DATA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        MY_DATA = (Data) this.getApplication();

        Intent intent=getIntent();
        String positionString=intent.getStringExtra("position");
        position=Integer.parseInt(positionString);

        GO_BACK=(ImageView)findViewById(R.id.go_back);
        GOODS_NAME=(TextView)findViewById(R.id.goods_name);
        PRICE=(TextView)findViewById(R.id.price);

        SELLER_NAME=(TextView)findViewById(R.id.seller_name);
        RELEASE_TIME=(TextView)findViewById(R.id.release_time);

        DETAILS=(TextView)findViewById(R.id.details);

        BUY_BUTTON=(Button)findViewById(R.id.buy_button);
        MY_DATA = (Data) this.getApplication();

        String goods_name=MY_DATA.getListGoods().get(position).getGoods_name();
        String price= String.valueOf(MY_DATA.getListGoods().get(position).getPrice());

        String seller=MY_DATA.getListGoods().get(position).getSeller_name();
        String release_time=MY_DATA.getListGoods().get(position).getRelease_time();

        String details=MY_DATA.getListGoods().get(position).getDetails();

        object_id=MY_DATA.getListGoods().get(position).getObjectId();

        GOODS_NAME.setText(goods_name);
        PRICE.setText(price);

        SELLER_NAME.setText(seller);
        RELEASE_TIME.setText(release_time);

        DETAILS.setText(details);


        GO_BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        BUY_BUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MY_DATA.buy(object_id);
                flag=MY_DATA.getFlag_buy();
                if(MY_DATA.LOCK_BUY==1){
                    if(flag==1){
                        Toast.makeText(getApplicationContext(), "购买成功", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(DetailActivity.this,HomeActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(getApplicationContext(), "购买出错啦", Toast.LENGTH_SHORT).show();
                    }
                    MY_DATA.LOCK_BUY=0;
                }

            }
        });

    }
}
