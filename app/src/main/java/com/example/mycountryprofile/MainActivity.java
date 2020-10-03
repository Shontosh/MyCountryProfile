package com.example.mycountryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladesh , india ,australia;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladesh=findViewById(R.id.bangbutton);
        india=findViewById(R.id.indiabutton);
        australia=findViewById(R.id.ausbutton);

        bangladesh.setOnClickListener(this);
        india.setOnClickListener(this);
        australia.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bangbutton){
            intent= new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }

        if(view.getId()==R.id.indiabutton){
            intent= new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }

        if(view.getId()==R.id.ausbutton){
            intent= new Intent(MainActivity.this,ProfileActivity.class);
            intent.putExtra("name","australia");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogbuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogbuilder.setCancelable(false);
        alertDialogbuilder.setTitle(R.string.alert_title);
        alertDialogbuilder.setMessage(R.string.alert_msg);
        alertDialogbuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        alertDialogbuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog=alertDialogbuilder.create();
        alertDialog.show();

    }
}
