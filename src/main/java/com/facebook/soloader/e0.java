package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;

/* JADX INFO: loaded from: classes4.dex */
public class e0 extends d0 {
    @Override // com.facebook.soloader.d0
    public String c() {
        return "SystemLoadWrapperSoSource";
    }

    @Override // com.facebook.soloader.d0
    @SuppressLint({"CatchGeneralException"})
    public int d(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        try {
            System.loadLibrary(str.substring(3, str.length() - 3));
            return 1;
        } catch (Exception e11) {
            p.c("SoLoader", "Error loading library: " + str, e11);
            return 0;
        }
    }

    @Override // com.facebook.soloader.d0
    public String toString() {
        return c() + "[" + SysUtil.getClassLoaderLdLoadLibrary() + "]";
    }
}
