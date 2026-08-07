package com.google.firebase.perf.session.gauges;

import android.app.ActivityManager;
import android.content.Context;
import com.google.firebase.perf.util.o;

/* JADX INFO: loaded from: classes5.dex */
class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final kw.a f44528e = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runtime f44529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ActivityManager f44530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ActivityManager.MemoryInfo f44531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f44532d;

    i(Context context) {
        this(Runtime.getRuntime(), context);
    }

    public int a() {
        return o.c(com.google.firebase.perf.util.k.BYTES.toKilobytes(this.f44531c.totalMem));
    }

    public int b() {
        return o.c(com.google.firebase.perf.util.k.BYTES.toKilobytes(this.f44529a.maxMemory()));
    }

    public int c() {
        return o.c(com.google.firebase.perf.util.k.MEGABYTES.toKilobytes(this.f44530b.getMemoryClass()));
    }

    i(Runtime runtime, Context context) {
        this.f44529a = runtime;
        this.f44532d = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f44530b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f44531c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
