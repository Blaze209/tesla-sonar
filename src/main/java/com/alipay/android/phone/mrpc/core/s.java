package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f20046a;

    public static final boolean a(Context context) {
        Boolean bool = f20046a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z11 = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0;
            f20046a = Boolean.valueOf(z11);
            return z11;
        } catch (Exception e11) {
            Log.e("MiscUtils", "", e11);
            return false;
        }
    }
}
