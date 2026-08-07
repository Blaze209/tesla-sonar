package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes5.dex */
class b0<V> extends i.a<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile q<?> f43814h;

    private final class a extends q<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Callable<V> f43815c;

        a(Callable<V> callable) {
            this.f43815c = (Callable) ou.p.m(callable);
        }

        @Override // com.google.common.util.concurrent.q
        void a(Throwable th2) {
            b0.this.N(th2);
        }

        @Override // com.google.common.util.concurrent.q
        void b(V v11) {
            b0.this.M(v11);
        }

        @Override // com.google.common.util.concurrent.q
        final boolean d() {
            return b0.this.isDone();
        }

        @Override // com.google.common.util.concurrent.q
        V e() {
            return this.f43815c.call();
        }

        @Override // com.google.common.util.concurrent.q
        String f() {
            return this.f43815c.toString();
        }
    }

    b0(Callable<V> callable) {
        this.f43814h = new a(callable);
    }

    static <V> b0<V> Q(Runnable runnable, V v11) {
        return new b0<>(Executors.callable(runnable, v11));
    }

    static <V> b0<V> R(Callable<V> callable) {
        return new b0<>(callable);
    }

    @Override // com.google.common.util.concurrent.a
    protected String L() {
        q<?> qVar = this.f43814h;
        if (qVar == null) {
            return super.L();
        }
        return "task=[" + qVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        q<?> qVar = this.f43814h;
        if (qVar != null) {
            qVar.run();
        }
        this.f43814h = null;
    }

    @Override // com.google.common.util.concurrent.a
    protected void y() {
        q<?> qVar;
        super.y();
        if (P() && (qVar = this.f43814h) != null) {
            qVar.c();
        }
        this.f43814h = null;
    }
}
