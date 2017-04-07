package com.thinking.wpad;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.widget.LinearLayout;

import com.thinking.ad.AD.ADManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import cn.waps.AppConnect;

/**
 * Created by Yu Yong on 2017/4/6.
 */

public class WPADManager extends ADManager {

    ExecutorService pool = Executors.newFixedThreadPool(2);

    @Override
    public void onAppCreate(Context context) {
        AppConnect.getInstance(context);
    }

    @Override
    public void onAppFinish(Context context) {
        AppConnect.getInstance(context).close();
    }

    @Override
    public void setAd(Context context, Object... params) {
        if (params[0].equals("setBgColor")) {
            setBgColor(context, (int) params[1]);
        }
        if (params[0].equals("setForeColor")) {
            setForeColor(context, (int) params[1]);
        }
        if (params[0].equals("showMiniAd")) {
            showMiniAd(context, (LinearLayout) params[1], (int) params[2]);
        }
    }

    private void setBgColor(Context context, int color) {
        AppConnect.getInstance(context).setAdBackColor(color);
    }

    private void setForeColor(Context context, int color) {
        AppConnect.getInstance(context).setAdForeColor(color);
    }

    private void showMiniAd(Context context, LinearLayout layout, int time) {
        AppConnect.getInstance(context).showMiniAd(context, layout, time);
    }
}
