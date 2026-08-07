package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"RestrictedApi"})
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ScheduledFuture<?> f43921h;

    class a implements b<V> {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th2) {
            p.this.q(th2);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(V v11) {
            p.this.p(v11);
        }
    }

    interface b<T> {
        void a(Throwable th2);

        void set(T t11);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f43921h = cVar.a(new a());
    }

    @Override // androidx.concurrent.futures.a
    protected void c() {
        this.f43921h.cancel(s());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f43921h.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f43921h.compareTo(delayed);
    }
}
