package com.tahir70108.carshowroom;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    static ArrayList<Car> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<>();

        cars.add(new Car("Audi","User1","Hybrid","03300"));
        cars.add(new Car("Audi","User2","Hybrid","03360"));
        cars.add(new Car("Audi","User3","Hybrid","03350"));
        cars.add(new Car("Audi","User4","Hybrid","03340"));
        cars.add(new Car("Audi","User5","Hybrid","03330"));
        cars.add(new Car("Audi","User6","Hybrid","03310"));


    }
}
