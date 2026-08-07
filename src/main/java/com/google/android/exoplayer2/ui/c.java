package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class c {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i11) {
        return p0.B("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i11)), Integer.valueOf(Color.green(i11)), Integer.valueOf(Color.blue(i11)), Double.valueOf(((double) Color.alpha(i11)) / 255.0d));
    }
}
