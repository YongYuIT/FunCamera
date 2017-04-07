package com.thinking.ad.AD;

import android.content.Context;

/**
 * Created by Yu Yong on 2017/4/6.
 */

public abstract class ADManager {
    public abstract void onAppCreate(Context context);

    public abstract void onAppFinish(Context context);

    public abstract void setAd(Context context, Object... params);
}
