package com.example.trw.sampleapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;
import com.example.trw.sampleapi.http.HttpManager;
import com.example.trw.sampleapi.dao.Collection;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        loadData();
    }

    private void loadData() {
        String API_KEY = "AIzaSyBDJ-humCFVkDiwM3c0nl2w0rjZV7J3Q7M";
        String URL = "http://www.akexorcist.com";

        Call<Collection> call = HttpManager.getInstance().getService().Repos(URL, API_KEY);
        call.enqueue(new Callback<Collection>() {
            @Override
            public void onResponse(Call<Collection> call, Response<Collection> response) {
                if (response.isSuccessful()) {
                    Collection dao = response.body();
                    textView.setText(dao.getName());
                } else {
                    textView.setText(response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<Collection> call, Throwable t) {
                Toast.makeText(MainActivity.this
                        , t.toString()
                        , Toast.LENGTH_SHORT)
                        .show();
                textView.setText(t.toString());
            }
        });
    }
}
