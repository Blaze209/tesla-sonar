package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f44044a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f44045b = new AtomicInteger();

    public void a() {
        this.f44045b.getAndIncrement();
    }

    public void b() {
        this.f44044a.getAndIncrement();
    }

    public void c() {
        this.f44045b.set(0);
    }
}
