package com.fanxiaoyudemo.myapplication.UserInterface;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fanxiaoyudemo.myapplication.JavaBean.Data;
import com.fanxiaoyudemo.myapplication.R;

public class InformationActivity extends AppCompatActivity {

    private ImageView GO_BACK;
    private TextView USER_ID;
    private TextView USER_NAME;
    private TextView USER_PASSWORD;
    private TextView CAREER;
    private TextView COLLEDGE;
    private TextView ADDRESS;
    Data MY_DATA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        GO_BACK=(ImageView)findViewById(R.id.go_back);
        USER_ID=findViewById(R.id.user_id);
        USER_NAME=findViewById(R.id.user_name);
        CAREER=findViewById(R.id.career);
        COLLEDGE=findViewById(R.id.colledge);
        ADDRESS=findViewById(R.id.address);
        MY_DATA= (Data)this.getApplication();

        USER_ID.setText(MY_DATA.getUser().getUser_id());
        USER_NAME.setText(MY_DATA.getUser().getUser_name());
        CAREER.setText(MY_DATA.getUser().getCareer());
        COLLEDGE.setText(MY_DATA.getUser().getColledge());
        ADDRESS.setText(MY_DATA.getUser().getAdress());

        GO_BACK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
