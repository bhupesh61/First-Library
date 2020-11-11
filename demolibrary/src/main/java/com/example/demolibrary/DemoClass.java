package com.example.demolibrary;


import android.content.Context;
import android.widget.Toast;

public class DemoClass {

    public static void testMethod1(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
