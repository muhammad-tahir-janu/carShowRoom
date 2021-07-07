package com.tahir70108.carshowroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CarAdapter.OnItemSelected {

    Button btnCarInfo, btnOwnerInfo;
    ImageView ivCarLogo;
    TextView tvModl,tvModel,tvOwner,tvTell;

    Fragment carInforFrag;
    Fragment ownewInforFragemt;
    FragmentManager  fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial();
        ivCarLogo.setImageResource(R.drawable.audi);
    btnCarInfo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fragmentManager.beginTransaction().show(carInforFrag).hide(ownewInforFragemt);


        }
    });

    btnOwnerInfo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fragmentManager.beginTransaction().show(ownewInforFragemt).hide(carInforFrag);
        }
    });

    }

    private void initial() {
        btnCarInfo = findViewById(R.id.btnCar_info);
        btnOwnerInfo = findViewById(R.id.btnOwnerInfor);
        ivCarLogo = findViewById(R.id.ivCarLogo);
        tvModl = findViewById(R.id.tvModl);
        tvModel = findViewById(R.id.tvModel);
        tvOwner = findViewById(R.id.tvOwnerName);
        tvTell = findViewById(R.id.tvTell);
        fragmentManager = getSupportFragmentManager();

        carInforFrag = fragmentManager.findFragmentById(R.id.carInforFragment);
        ownewInforFragemt = fragmentManager.findFragmentById(R.id.OwnerInforFrag);



    }


    @Override
    public void onItemSelected(int index) {

        tvTell.setText(ApplicationClass.cars.get(index).getTel());
        tvModel.setText(ApplicationClass.cars.get(index).getModel());
        tvOwner.setText(ApplicationClass.cars.get(index).getOwner());
        tvModl.setText(ApplicationClass.cars.get(index).getModel());
        tvModl.setText(ApplicationClass.cars.get(index).getModel());

    }
}