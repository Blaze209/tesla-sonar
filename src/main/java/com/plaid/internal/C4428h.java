package com.plaid.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: com.plaid.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4428h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile T f47695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Exception f47696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f47697c = new CountDownLatch(1);

    public static <T> C4428h<T> a(T t11) {
        C4428h<T> c4428h = new C4428h<>();
        synchronized (c4428h.f47697c) {
            try {
                if (c4428h.f47697c.getCount() > 0) {
                    c4428h.f47695a = t11;
                    c4428h.f47697c.countDown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4428h;
    }

    public static <T> C4428h<T> a(Exception exc) {
        C4428h<T> c4428h = new C4428h<>();
        synchronized (c4428h.f47697c) {
            try {
                if (c4428h.f47697c.getCount() > 0) {
                    c4428h.f47696b = exc;
                    c4428h.f47697c.countDown();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4428h;
    }

    public final T a() throws ExecutionException, InterruptedException {
        this.f47697c.await();
        if (this.f47696b == null) {
            return this.f47695a;
        }
        throw new ExecutionException(this.f47696b);
    }
}
