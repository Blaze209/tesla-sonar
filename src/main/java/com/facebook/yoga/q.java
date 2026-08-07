package com.facebook.yoga;

/* JADX INFO: loaded from: classes4.dex */
public class q {
    public static long a(float f11, float f12) {
        return ((long) Float.floatToRawIntBits(f12)) | (((long) Float.floatToRawIntBits(f11)) << 32);
    }

    public static long b(int i11, int i12) {
        return a(i11, i12);
    }
}
