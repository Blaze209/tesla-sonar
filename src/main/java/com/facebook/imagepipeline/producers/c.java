package com.facebook.imagepipeline.producers;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> implements n<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f21754a = false;

    public static boolean d(int i11) {
        return (i11 & 1) == 1;
    }

    public static boolean e(int i11) {
        return !d(i11);
    }

    @SuppressLint({"WrongConstant"})
    public static int k(boolean z11) {
        return z11 ? 1 : 0;
    }

    public static boolean l(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public static boolean m(int i11, int i12) {
        return (i11 & i12) == i12;
    }

    public static int n(int i11, int i12) {
        return i11 & (~i12);
    }

    @Override // com.facebook.imagepipeline.producers.n
    public synchronized void a() {
        if (this.f21754a) {
            return;
        }
        this.f21754a = true;
        try {
            f();
        } catch (Exception e11) {
            j(e11);
        }
    }

    @Override // com.facebook.imagepipeline.producers.n
    public synchronized void b(T t11, int i11) {
        if (this.f21754a) {
            return;
        }
        this.f21754a = d(i11);
        try {
            h(t11, i11);
        } catch (Exception e11) {
            j(e11);
        }
    }

    @Override // com.facebook.imagepipeline.producers.n
    public synchronized void c(float f11) {
        if (this.f21754a) {
            return;
        }
        try {
            i(f11);
        } catch (Exception e11) {
            j(e11);
        }
    }

    protected abstract void f();

    protected abstract void g(Throwable th2);

    protected abstract void h(T t11, int i11);

    protected abstract void i(float f11);

    protected void j(Exception exc) {
        qk.a.M(getClass(), "unhandled exception", exc);
    }

    @Override // com.facebook.imagepipeline.producers.n
    public synchronized void onFailure(Throwable th2) {
        if (this.f21754a) {
            return;
        }
        this.f21754a = true;
        try {
            g(th2);
        } catch (Exception e11) {
            j(e11);
        }
    }
}
