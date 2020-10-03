package com.example.mycountryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
private ImageView imageView;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView=findViewById(R.id.imageid);
        textView=findViewById(R.id.textid);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String countryname=bundle.getString("name");
            showdetails(countryname);

        }


    }
     void showdetails(String countryname){
        if(countryname.equals("bangladesh")){

            imageView.setImageResource(R.drawable.mash);
            textView.setText(R.string.bangladesh_text);
         }

        if(countryname.equals("india")){

            imageView.setImageResource(R.drawable.dhoni);
            textView.setText(R.string.india_text);
         }

        if(countryname.equals("australia")){

            imageView.setImageResource(R.drawable.war);
            textView.setText(R.string.australia_text);
         }

     }


}
