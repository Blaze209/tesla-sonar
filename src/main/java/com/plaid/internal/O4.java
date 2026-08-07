package com.plaid.internal;

import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: loaded from: classes6.dex */
public final class O4 implements H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O4 f46551a = new O4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f46552b = Build.ID;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f46553c = Build.MANUFACTURER;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f46554d = Build.MODEL;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f46555e = Build.DEVICE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f46556f = Build.TYPE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f46557g = Build.VERSION.RELEASE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f46558h = Build.VERSION.CODENAME;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f46559i = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f46560j = Resources.getSystem().getDisplayMetrics().heightPixels;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f46561k = Resources.getSystem().getDisplayMetrics().widthPixels;

    @Override // com.plaid.internal.H0
    public final String a() {
        return f46553c;
    }

    @Override // com.plaid.internal.H0
    public final String b() {
        return f46554d;
    }

    @Override // com.plaid.internal.H0
    public final String c() {
        return f46558h;
    }

    @Override // com.plaid.internal.H0
    public final String d() {
        return f46556f;
    }

    @Override // com.plaid.internal.H0
    public final String e() {
        return f46557g;
    }

    @Override // com.plaid.internal.H0
    public final int f() {
        return f46559i;
    }

    @Override // com.plaid.internal.H0
    public final String g() {
        return f46555e;
    }

    @Override // com.plaid.internal.H0
    public final String getId() {
        return f46552b;
    }
}
