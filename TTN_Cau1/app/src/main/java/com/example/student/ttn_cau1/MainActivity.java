package com.example.student.ttn_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnTinhTong, btnTinhHieu;
    private EditText inputX, inputY;
    private TextView textKetQua, textHieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTinhTong = (Button) findViewById(R.id.btnTinhTong);

    }

    public void tinhTong(View view) {
        inputX = (EditText) findViewById(R.id.inputX);
        inputY = (EditText) findViewById(R.id.inputY);
        int x = Integer.parseInt(inputX.getText().toString());
        int y = Integer.parseInt(inputY.getText().toString());

        int ketqua = x + y;

        textKetQua = (TextView) findViewById(R.id.textKetQua);
        textKetQua.setText("Tổng là: " + ketqua);


    }

    public void tinhHieu(View view) {
        inputX = (EditText) findViewById(R.id.inputX);
        inputY = (EditText) findViewById(R.id.inputY);
        int x = Integer.parseInt(inputX.getText().toString());
        int y = Integer.parseInt(inputY.getText().toString());
        int ketqua = x - y;

        textHieu = (TextView) findViewById(R.id.textHieu);
        textHieu.setText("Hiệu là: " + ketqua);
    }
}
