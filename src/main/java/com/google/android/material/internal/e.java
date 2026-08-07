package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.core.view.z0;

/* JADX INFO: loaded from: classes5.dex */
public class e {
    public static void a(@NonNull Window window, boolean z11, Integer num, Integer num2) {
        boolean z12 = num == null || num.intValue() == 0;
        boolean z13 = num2 == null || num2.intValue() == 0;
        if (z12 || z13) {
            int iB = ht.a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z12) {
                num = Integer.valueOf(iB);
            }
            if (z13) {
                num2 = Integer.valueOf(iB);
            }
        }
        z0.b(window, !z11);
        int iC = c(window.getContext(), z11);
        int iB2 = b(window.getContext(), z11);
        window.setStatusBarColor(iC);
        window.setNavigationBarColor(iB2);
        f(window, d(iC, ht.a.h(num.intValue())));
        e(window, d(iB2, ht.a.h(num2.intValue())));
    }

    @TargetApi(21)
    private static int b(Context context, boolean z11) {
        if (z11 && Build.VERSION.SDK_INT < 27) {
            return k5.d.l(ht.a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z11) {
            return 0;
        }
        return ht.a.b(context, R.attr.navigationBarColor, -16777216);
    }

    @TargetApi(21)
    private static int c(Context context, boolean z11) {
        if (z11) {
            return 0;
        }
        return ht.a.b(context, R.attr.statusBarColor, -16777216);
    }

    private static boolean d(int i11, boolean z11) {
        if (ht.a.h(i11)) {
            return true;
        }
        return i11 == 0 && z11;
    }

    public static void e(@NonNull Window window, boolean z11) {
        z0.a(window, window.getDecorView()).f(z11);
    }

    public static void f(@NonNull Window window, boolean z11) {
        z0.a(window, window.getDecorView()).g(z11);
    }
}
