package com.numbertostring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtnumber;
    private Button btnconvert;
    private TextView tvoutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnumber = findViewById(R.id.txtnumber);
        tvoutput = findViewById(R.id.tvoutput);
        btnconvert = findViewById(R.id.btnconvert);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(txtnumber.getText().toString());
                ConvertActivity change = new ConvertActivity();
                String word = change.change(num);
                tvoutput.setText("In word:"+ word);
            }
        });
    }
}
