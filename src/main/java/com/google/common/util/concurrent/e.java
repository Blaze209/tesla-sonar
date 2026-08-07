package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
abstract class e<I, O, F, T> extends i.a<O> implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    s<? extends I> f43817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    F f43818i;

    private static final class a<I, O> extends e<I, O, ou.h<? super I, ? extends O>, O> {
        a(s<? extends I> sVar, ou.h<? super I, ? extends O> hVar) {
            super(sVar, hVar);
        }

        @Override // com.google.common.util.concurrent.e
        void S(O o11) {
            M(o11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.e
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public O R(ou.h<? super I, ? extends O> hVar, I i11) {
            return hVar.apply(i11);
        }
    }

    e(s<? extends I> sVar, F f11) {
        this.f43817h = (s) ou.p.m(sVar);
        this.f43818i = (F) ou.p.m(f11);
    }

    static <I, O> s<O> Q(s<I> sVar, ou.h<? super I, ? extends O> hVar, Executor executor) {
        a aVar = new a(sVar, hVar);
        sVar.b(aVar, w.d(executor, aVar));
        return aVar;
    }

    @Override // com.google.common.util.concurrent.a
    protected String L() {
        String str;
        s<? extends I> sVar = this.f43817h;
        F f11 = this.f43818i;
        String strL = super.L();
        if (sVar != null) {
            str = "inputFuture=[" + sVar + "], ";
        } else {
            str = "";
        }
        if (f11 != null) {
            return str + "function=[" + f11 + "]";
        }
        if (strL == null) {
            return null;
        }
        return str + strL;
    }

    abstract T R(F f11, I i11);

    abstract void S(T t11);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        s<? extends I> sVar = this.f43817h;
        F f11 = this.f43818i;
        if ((isCancelled() | (sVar == null)) || (f11 == null)) {
            return;
        }
        this.f43817h = null;
        if (sVar.isCancelled()) {
            O(sVar);
            return;
        }
        try {
            try {
                Object objR = R(f11, m.b(sVar));
                this.f43818i = null;
                S(objR);
            } catch (Throwable th2) {
                try {
                    z.d(th2);
                    N(th2);
                } finally {
                    this.f43818i = null;
                }
            }
        } catch (Error e11) {
            N(e11);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e12) {
            N(e12.getCause());
        } catch (Exception e13) {
            N(e13);
        }
    }

    @Override // com.google.common.util.concurrent.a
    protected final void y() {
        J(this.f43817h);
        this.f43817h = null;
        this.f43818i = null;
    }
}
