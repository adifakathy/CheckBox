package com.example.cheakbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkcheakbox,sugercheakbox,watercheakbox;
    private Button showbutton,showbutton1;
    private TextView resulttextview,result;
    private RadioGroup radioGroup;
    private RadioButton genderButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkcheakbox = (CheckBox) findViewById(R.id.milkcheakboxId);
        sugercheakbox =(CheckBox) findViewById(R.id.sugercheakboxId);
        watercheakbox =(CheckBox)findViewById(R.id.watercheakboxId);
        showbutton = (Button) findViewById(R.id.showbuttonId);
        resulttextview =(TextView)findViewById(R.id.resulttextviewId);
        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               StringBuilder stringBuilder = new StringBuilder();
               if(milkcheakbox.isChecked()){
                   String value = milkcheakbox.getText().toString();
                   stringBuilder.append(value + " is ordered\n");
                }
               if(sugercheakbox.isChecked()){
                   String value = sugercheakbox.getText().toString();
                   stringBuilder.append(value + " is ordered\n");
                }
               if(watercheakbox.isChecked()){
                   String value = watercheakbox.getText().toString();
                   stringBuilder.append(value + " is ordered\n");
                }
               resulttextview.setText(stringBuilder);
            }
        });
        radioGroup =(RadioGroup) findViewById(R.id.radiogroupId);
        showbutton1=(Button) findViewById(R.id.showbutton1Id);
        result =(TextView) findViewById(R.id.resultId);
        showbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId =  radioGroup.getCheckedRadioButtonId();
                genderButton =findViewById(selectedId);
                String value = genderButton.getText().toString();
                result.setText("you have selected :" +value);

            }
        });
    }
}