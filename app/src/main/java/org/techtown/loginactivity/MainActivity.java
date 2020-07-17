package org.techtown.loginactivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends Activity {
    public static final int REQUEST_CODE_MENU = 101;


    //액티비티 옮겼을때 메세지
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE_MENU){
            Toast.makeText(getApplicationContext(),
                    "onActivityResult 메서드 호출됨. 요청 코드 : "+ requestCode+
                    ", 결과 코드 : "+ resultCode, Toast.LENGTH_LONG).show();

            if(resultCode==RESULT_OK){
                String name=data.getStringExtra("name");
                Toast.makeText(getApplicationContext(), "응답으로 전달된 name : "+ name, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button button = findViewById(R.id.SignButton);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SignActivty.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });



    }


    }












