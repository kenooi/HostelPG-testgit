package com.inti.student.hostelpg;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class Hostelinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toolbar mToolbar;
        ImageView hostel;
        TextView txt;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hostelinfo);

        mToolbar = (Toolbar) findViewById(R.id.tlbar);
        hostel = (ImageView) findViewById(R.id.imageView);
        txt = (TextView) findViewById(R.id.txtInfo);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            mToolbar.setTitle(bundle.getString("Name"));
            if(mToolbar.getTitle().toString().equalsIgnoreCase("Golden Triangle")){
                hostel.setImageDrawable(ContextCompat.getDrawable(Hostelinfo.this, R.drawable.condo1));
                txt.setText("\nGolden Triangle\n\n Rooms Available: Twin-Sharing / Single\n Price from: RM500 - RM750\n Facilities Overview: AC/Fridge/Furniture/Microwave included \nContact No: 012-1234567");
            }
            else if(mToolbar.getTitle().toString().equalsIgnoreCase("The Light")){
                hostel.setImageDrawable(ContextCompat.getDrawable(Hostelinfo.this, R.drawable.condo3));
                txt.setText("\nThe Light\n\n Rooms Available: Twin-Sharing / Single/ Whole Unit\n Price from: RM700 - RM1050\n Facilities Overview: AC/Fridge/Furniture/Microwave/Gym/Swimming Pool included \nContact No: 012-1234568");
            }
            else if(mToolbar.getTitle().toString().equalsIgnoreCase("One Imperial")){
                hostel.setImageDrawable(ContextCompat.getDrawable(Hostelinfo.this, R.drawable.condo2));
                txt.setText("\nOne Imperial\n\n Rooms Available: Twin-Sharing / Single\n Price from: RM600 - RM950\n Facilities Overview: AC/Fridge/Furniture/Microwave/Gym/Swimming Pool/Badminton Court included \nContact No: 012-1234569");
            }
            else if(mToolbar.getTitle().toString().equalsIgnoreCase("Elite Avenue")){
                hostel.setImageDrawable(ContextCompat.getDrawable(Hostelinfo.this, R.drawable.condo4));
                txt.setText("\nElite Avenue\n\n Rooms Available: Twin-Sharing / Single\n Price from: RM500 - RM850\n Facilities Overview: AC/Fridge/Furniture/Microwave/Shoplets below included \nContact No: 012-1234510");
            }
        }


    }
}
