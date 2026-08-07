package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import tf.a0;
import tf.e0;

/* JADX INFO: loaded from: classes3.dex */
public class r<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f19954e = Executors.newCachedThreadPool(new hg.f());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<a0<T>> f19955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<a0<Throwable>> f19956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f19957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile e0<T> f19958d;

    private static class a<T> extends FutureTask<e0<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private r<T> f19959a;

        a(r<T> rVar, Callable<e0<T>> callable) {
            super(callable);
            this.f19959a = rVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f19959a.l(get());
                } catch (InterruptedException | ExecutionException e11) {
                    this.f19959a.l(new e0(e11));
                }
            } finally {
                this.f19959a = null;
            }
        }
    }

    public r(Callable<e0<T>> callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.f19956b);
        if (arrayList.isEmpty()) {
            hg.e.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a0) it.next()).onResult(th2);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.f19957c.post(new Runnable() { // from class: tf.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113313a.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        e0<T> e0Var = this.f19958d;
        if (e0Var == null) {
            return;
        }
        if (e0Var.b() != null) {
            i(e0Var.b());
        } else {
            f(e0Var.a());
        }
    }

    private synchronized void i(T t11) {
        Iterator it = new ArrayList(this.f19955a).iterator();
        while (it.hasNext()) {
            ((a0) it.next()).onResult(t11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(e0<T> e0Var) {
        if (this.f19958d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f19958d = e0Var;
        g();
    }

    public synchronized r<T> c(a0<Throwable> a0Var) {
        try {
            e0<T> e0Var = this.f19958d;
            if (e0Var != null && e0Var.a() != null) {
                a0Var.onResult(e0Var.a());
            }
            this.f19956b.add(a0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public synchronized r<T> d(a0<T> a0Var) {
        try {
            e0<T> e0Var = this.f19958d;
            if (e0Var != null && e0Var.b() != null) {
                a0Var.onResult(e0Var.b());
            }
            this.f19955a.add(a0Var);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    public e0<T> e() {
        return this.f19958d;
    }

    public synchronized r<T> j(a0<Throwable> a0Var) {
        this.f19956b.remove(a0Var);
        return this;
    }

    public synchronized r<T> k(a0<T> a0Var) {
        this.f19955a.remove(a0Var);
        return this;
    }

    public r(T t11) {
        this.f19955a = new LinkedHashSet(1);
        this.f19956b = new LinkedHashSet(1);
        this.f19957c = new Handler(Looper.getMainLooper());
        this.f19958d = null;
        l(new e0<>(t11));
    }

    r(Callable<e0<T>> callable, boolean z11) {
        this.f19955a = new LinkedHashSet(1);
        this.f19956b = new LinkedHashSet(1);
        this.f19957c = new Handler(Looper.getMainLooper());
        this.f19958d = null;
        if (z11) {
            try {
                l(callable.call());
                return;
            } catch (Throwable th2) {
                l(new e0<>(th2));
                return;
            }
        }
        f19954e.execute(new a(this, callable));
    }
}
