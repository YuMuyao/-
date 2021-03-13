package com.fanxiaoyudemo.myapplication.UserInterface;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.fanxiaoyudemo.myapplication.JavaBean.Data;
import com.fanxiaoyudemo.myapplication.R;

public class RegisterActivity extends AppCompatActivity {

    private TextView REGISTER;
    private EditText USER_ID;
    private EditText USER_NAME;
    private EditText USER_PASSWORD;
    private RadioButton MALE;
    private RadioButton FEMALE;
    private RadioButton STUDENT;
    private RadioButton TEACHER;
    private EditText COLLEDGE;
    private EditText ADDRESS;
    Data MY_DATA;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        REGISTER=(TextView)findViewById(R.id.register);
        USER_ID=(EditText)findViewById(R.id.user_id);
        USER_NAME=(EditText)findViewById(R.id.user_name);
        USER_PASSWORD=(EditText)findViewById(R.id.user_password);
        MALE=(RadioButton)findViewById(R.id.male);
        FEMALE=(RadioButton)findViewById(R.id.female);
        STUDENT=(RadioButton)findViewById(R.id.student);
        TEACHER=(RadioButton)findViewById(R.id.teacher);
        COLLEDGE=(EditText)findViewById(R.id.colledge);
        ADDRESS=(EditText)findViewById(R.id.address);
        MY_DATA= (Data)this.getApplication();

        REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_id=USER_ID.getText().toString();
                String user_name=USER_NAME.getText().toString();
                String user_password=USER_PASSWORD.getText().toString();
                String gender="male";
                if(FEMALE.isChecked())
                    gender="female";
                String career="student";
                if(TEACHER.isChecked())
                    career="teacher";
                String colledge=COLLEDGE.getText().toString();
                String address=ADDRESS.getText().toString();
                String finalGender = gender;
                String finalCareer = career;
                MY_DATA.register(user_id, user_name, user_password, finalGender, finalCareer, colledge, address);
                flag=MY_DATA.getFlag_register();
                if(MY_DATA.LOCK_REGISTER==1) {
                    if (flag == 1) {
                        Log.e("Bmob", "成功弹窗跳转");
                        Toast.makeText(getApplicationContext(), "注册成功", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                        startActivity(intent);
                        MY_DATA.LOCK_REGISTER = 0;
                    } else {
                        Log.e("Bmob", "失败弹窗跳转");
                        Toast.makeText(getApplicationContext(), "已经注册过啦", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                        MY_DATA.LOCK_REGISTER = 0;
                    }
                }
            }
        });


    }
}
