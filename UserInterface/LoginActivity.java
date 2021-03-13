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

import cn.bmob.v3.Bmob;

public class LoginActivity extends AppCompatActivity {
    private TextView LOGIN;
    private TextView REGISTER;
    private EditText USER_ID;
    private EditText USER_PASSWORD;
    private RadioButton STUDENT;
    private RadioButton TEACHER;
    Data MY_DATA;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bmob.initialize(this, "db7a7f9db3d18924556eae784dcf63f0");
        LOGIN=(TextView)findViewById(R.id.login);
        REGISTER=(TextView)findViewById(R.id.register);
        USER_ID=(EditText)findViewById(R.id.user_id);
        USER_PASSWORD=(EditText)findViewById(R.id.user_password);
        STUDENT=(RadioButton)findViewById(R.id.student);
        TEACHER=(RadioButton)findViewById(R.id.teacher);
        MY_DATA= (Data)this.getApplication();
        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_id=USER_ID.getText().toString();
                String user_password=USER_PASSWORD.getText().toString();
                MY_DATA.login(user_id, user_password);
                flag=MY_DATA.getFlag_login();
                if(MY_DATA.LOCK_LOGIN==1){
                    if(flag==1){
                        Log.e("Bmob","登录跳转了，成功！");
                        Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
                        startActivity(intent);
                        MY_DATA.LOCK_LOGIN=0;
                    }else {
                        Log.e("Bmob","登录失败");
                        Toast.makeText(getApplicationContext(), "登录失败", Toast.LENGTH_SHORT).show();
                        MY_DATA.LOCK_LOGIN=0;
                    }
                }
            }
        });
        REGISTER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
