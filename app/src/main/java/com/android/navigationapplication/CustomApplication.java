package com.android.navigationapplication;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class CustomApplication extends Application {

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.i("terminate","OnTerminate is called");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Log.i("TrimMemory","OnTrimMemory is called");

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        Log.i("onLowMemory","onLowMemory is called");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public  List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Abhishek","Jog","Nagpur","BE"));
        empList.add(new Employee("Sanket","lambat","Pune","MCA"));
        empList.add(new Employee("Kaustubh","Ingle","Mumbai","BA"));
        empList.add(new Employee("Trushant","Aate","Latur","MA"));
        return empList;

    }
}
