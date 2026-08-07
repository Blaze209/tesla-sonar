package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends o {

    private static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Future<V> f43820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l<? super V> f43821b;

        a(Future<V> future, l<? super V> lVar) {
            this.f43820a = future;
            this.f43821b = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thA;
            Future<V> future = this.f43820a;
            if ((future instanceof su.a) && (thA = su.b.a((su.a) future)) != null) {
                this.f43821b.onFailure(thA);
                return;
            }
            try {
                this.f43821b.onSuccess(m.b(this.f43820a));
            } catch (ExecutionException e11) {
                this.f43821b.onFailure(e11.getCause());
            } catch (Throwable th2) {
                this.f43821b.onFailure(th2);
            }
        }

        public String toString() {
            return ou.j.b(this).i(this.f43821b).toString();
        }
    }

    public static <V> void a(s<V> sVar, l<? super V> lVar, Executor executor) {
        ou.p.m(lVar);
        sVar.b(new a(sVar, lVar), executor);
    }

    public static <V> V b(Future<V> future) {
        ou.p.u(future.isDone(), "Future was expected to be done: %s", future);
        return (V) c0.a(future);
    }

    public static <V> s<V> c(Throwable th2) {
        ou.p.m(th2);
        return new p.a(th2);
    }

    public static <V> s<V> d(V v11) {
        return v11 == null ? (s<V>) p.f43822b : new p(v11);
    }

    public static s<Void> e() {
        return p.f43822b;
    }

    public static <I, O> s<O> f(s<I> sVar, ou.h<? super I, ? extends O> hVar, Executor executor) {
        return e.Q(sVar, hVar, executor);
    }
}
