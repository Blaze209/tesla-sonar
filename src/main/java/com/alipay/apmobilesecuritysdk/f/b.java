package com.alipay.apmobilesecuritysdk.f;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f20083a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f20084b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<Runnable> f20085c = new LinkedList<>();

    public static b a() {
        return f20083a;
    }

    public synchronized void a(Runnable runnable) {
        this.f20085c.add(runnable);
        if (this.f20084b == null) {
            Thread thread = new Thread(new c(this));
            this.f20084b = thread;
            thread.start();
        }
    }
}
