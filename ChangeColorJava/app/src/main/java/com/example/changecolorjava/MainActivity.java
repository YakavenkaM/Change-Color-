package com.example.changecolorjava;

import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    EditText textEditLogoColor;
    Button buttonLogoColor ;

    //View lifecycle hook method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgView = findViewById(R.id.image_view);
        textEditLogoColor = findViewById(R.id.text_edit_logo_color) ;
        buttonLogoColor = findViewById(R.id.button_change_color_logo) ;
        final ImageView image = imgView; //(ImageView) findViewById(R.id.image_view);
        imgView.setBackgroundColor(getResources().getColor(R.color.LightYellow));

        //Using Java Listener Below
        buttonLogoColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textEditLogoColor.getText().toString().toLowerCase().equals("red")) {
                    image.setColorFilter( getResources().getColor(R.color.Red), PorterDuff.Mode.SRC_ATOP);
                }
                if(textEditLogoColor.getText().toString().toLowerCase().equals("gold")) {
                    image.setColorFilter( getResources().getColor(R.color.Gold), PorterDuff.Mode.SRC_ATOP);
                }

                if(textEditLogoColor.getText().toString().toLowerCase().equals("green")) {
                    image.setColorFilter( getResources().getColor(R.color.Green), PorterDuff.Mode.SRC_ATOP);

                }
                if(textEditLogoColor.getText().toString().toLowerCase().equals("blue")) {
                    image.setColorFilter( getResources().getColor(R.color.Blue), PorterDuff.Mode.SRC_ATOP);
                }
                if(textEditLogoColor.getText().toString().toLowerCase().equals("yellow")) {
                    image.setColorFilter( getResources().getColor(R.color.Yellow), PorterDuff.Mode.SRC_ATOP);
                }

                if(textEditLogoColor.getText().toString().toLowerCase().equals("brown")) {
                    image.setColorFilter( getResources().getColor(R.color.Brown), PorterDuff.Mode.SRC_ATOP);

                }   if(textEditLogoColor.getText().toString().toLowerCase().equals("silver")) {
                    image.setColorFilter( getResources().getColor(R.color.Silver), PorterDuff.Mode.SRC_ATOP);

                }
                if(textEditLogoColor.getText().toString().toLowerCase().equals("purple")) {
                    image.setColorFilter( getResources().getColor(R.color.Purple), PorterDuff.Mode.SRC_ATOP);

                }
                if(textEditLogoColor.getText().toString().toLowerCase().equals("pink")) {
                    image.setColorFilter( getResources().getColor(R.color.Pink), PorterDuff.Mode.SRC_ATOP);
                }

            }
        });

    }
}