package com.example.wingyanho.intentdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //第一个按钮
        button1=(Button)findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(MainActivity.this,secondActivity.class);
//                startActivity(intent);

                Intent intent=new Intent();
                intent.setAction("com.newland.My_ACTION");
                startActivity(intent);
            }
        });

        button2=(Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                //添加Action属性
                intent.setAction(Intent.ACTION_MAIN);
                //添加Category属性
                intent.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent);
            }
        });

        button3=(Button) findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                Uri data=Uri.parse("http://www.baidu.com");
                intent.setData(data);
                startActivity(intent);
            }
        });
    }
}
