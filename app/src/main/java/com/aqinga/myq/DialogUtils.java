package com.aqinga.myq;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by
 * 张庆龄
 * 1506A
 * Administrator
 * 2017/10/1716:05
 */

public class DialogUtils {
    public static void showDiglog(final Context context,String title,String message){
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "点击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "点击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
