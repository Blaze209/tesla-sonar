package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class a extends d0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f23918b;

    public a(Context context, int i11) {
        this.f23917a = i11;
        this.f23918b = new f(f(context), i11);
    }

    private static File f(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.v
    public d0 b(Context context) {
        this.f23918b = new f(f(context), this.f23917a | 1);
        return this;
    }

    @Override // com.facebook.soloader.d0
    public String c() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.d0
    public int d(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        return this.f23918b.d(str, i11, threadPolicy);
    }

    @Override // com.facebook.soloader.d0
    protected void e(int i11) {
        this.f23918b.e(i11);
    }

    @Override // com.facebook.soloader.d0
    public String toString() {
        return c() + "[" + this.f23918b.toString() + "]";
    }
}
