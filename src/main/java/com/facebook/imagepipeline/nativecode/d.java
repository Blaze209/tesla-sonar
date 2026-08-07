package com.facebook.imagepipeline.nativecode;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f21729a;

    public static synchronized void a() {
        if (!f21729a) {
            bp.a.d("native-imagetranscoder");
            f21729a = true;
        }
    }
}
