package com.facebook.soloader;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class e extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f23926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected q f23927b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Set<String> f23928c = null;

    public e(String str) {
        this.f23926a = str;
    }

    static String g(String str) {
        if ("base".equals(str)) {
            return SoLoader.f23905d.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.f23905d.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String str2 = "split_" + str + ".apk";
        for (String str3 : strArr) {
            if (str3.endsWith(str2)) {
                return str3;
            }
        }
        throw new IllegalStateException("Could not find " + str + " split");
    }

    @Override // com.facebook.soloader.d0
    public String c() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.d0
    public int d(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        Set<String> set = this.f23928c;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return h(str, i11);
        }
        return 0;
    }

    @Override // com.facebook.soloader.d0
    protected void e(int i11) throws IOException {
        InputStream inputStreamOpen = SoLoader.f23905d.getAssets().open(this.f23926a + ".soloader-manifest");
        try {
            this.f23927b = q.b(inputStreamOpen);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            this.f23928c = new HashSet(this.f23927b.f23967b);
        } catch (Throwable th2) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String f(String str) {
        Set<String> set = this.f23928c;
        if (set == null || this.f23927b == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        return g(this.f23926a) + "!/lib/" + this.f23927b.f23966a + "/" + str;
    }

    @SuppressLint({"MissingSoLoaderLibrary"})
    protected int h(String str, int i11) {
        String strF = f(str);
        strF.getClass();
        System.load(strF);
        return 1;
    }
}
