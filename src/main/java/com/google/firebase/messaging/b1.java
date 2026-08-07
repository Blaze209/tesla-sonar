package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static WeakReference<b1> f44244d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f44245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x0 f44246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f44247c;

    private b1(SharedPreferences sharedPreferences, Executor executor) {
        this.f44247c = executor;
        this.f44245a = sharedPreferences;
    }

    public static synchronized b1 a(Context context, Executor executor) {
        b1 b1Var;
        try {
            WeakReference<b1> weakReference = f44244d;
            b1Var = weakReference != null ? weakReference.get() : null;
            if (b1Var == null) {
                b1Var = new b1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                b1Var.c();
                f44244d = new WeakReference<>(b1Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return b1Var;
    }

    private synchronized void c() {
        this.f44246b = x0.c(this.f44245a, "topic_operation_queue", ",", this.f44247c);
    }

    synchronized a1 b() {
        return a1.a(this.f44246b.e());
    }

    synchronized boolean d(a1 a1Var) {
        return this.f44246b.f(a1Var.e());
    }
}
