package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<f> f43929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bv.f f43934h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, bv.f fVar) {
        this.f43927a = str;
        this.f43928b = str2;
        this.f43929c = list;
        this.f43930d = str3;
        this.f43931e = str4;
        this.f43932f = str5;
        this.f43933g = str6;
        this.f43934h = fVar;
    }

    public static a a(Context context, k0 k0Var, String str, String str2, List<f> list, bv.f fVar) {
        String packageName = context.getPackageName();
        String strG = k0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
