package com.example.mvpexample;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,MVP.view {

    private Presenter presenter;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);

        button = findViewById(R.id.button);
        Button becomeRedBtn = findViewById(R.id.changeColorBtn);

        becomeRedBtn.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.changeColorBtn:
                presenter.clickedChangeColorBtn();
                break;
            case R.id.button:
                presenter.clickedToastButton();
                break;
        }
    }

    @Override
    public void displayToastMessage() {
        Toast.makeText(this, "You clicked Me!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void changeColor() {
        button.setBackgroundColor(getResources().getColor(R.color.colorAccent));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        button.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                });
            }
        },1000);
    }
}
