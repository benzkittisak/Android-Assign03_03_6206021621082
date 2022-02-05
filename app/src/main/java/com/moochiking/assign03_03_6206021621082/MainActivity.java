/*
 *
 * 6206021621082
 * กิตติศักดิ์_ปานเหลือ
 *
 */

package com.moochiking.assign03_03_6206021621082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTitle , editFullName , editAge , editDateOfBirth;
    private RadioButton maleRadio , femaleRadio;
    private CheckBox drawBox , gameBox, musicBox , sportBox;
    private Button btnSubmit;
    private TextView showData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTitle = (EditText) findViewById(R.id.editTitle);
        editFullName = (EditText) findViewById(R.id.editFullName);
        editAge = (EditText) findViewById(R.id.editAge);
        editDateOfBirth = (EditText) findViewById(R.id.editDateOfBirth);

        maleRadio = (RadioButton) findViewById(R.id.maleRadio);
        femaleRadio = (RadioButton) findViewById(R.id.femaleRadio);

        drawBox = (CheckBox) findViewById(R.id.drawBox);
        gameBox = (CheckBox) findViewById(R.id.gameBox);
        musicBox = (CheckBox) findViewById(R.id.musicBox);
        sportBox = (CheckBox) findViewById(R.id.sportBox);

        showData = (TextView) findViewById(R.id.showData);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        String message = "";
        message += editTitle.getText().toString() + editFullName.getText().toString();
        message += "\nเพศ : " + (maleRadio.isChecked() ? "ชาย" : "") + (femaleRadio.isChecked() ? "หญิง" : "");
        message += "  อายุ : " + editAge.getText().toString() ;
        message += " วันเกิด : " + editDateOfBirth.getText().toString();
        message += "\nงานอดิเรก : " + (drawBox.isChecked() ? "วาดรูป " : "") + (gameBox.isChecked() ? "เล่นเกม " : "") + (musicBox.isChecked() ? "ฟังเพลง " : "") + (sportBox.isChecked() ? "เล่นกีฬา " : "");



        showData.setText(message);

    }
}