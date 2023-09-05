package com.shaf.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class MyToaster1 {

    public void DisplayToast(Context context, String msg){

        Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT).show();
    }
}
