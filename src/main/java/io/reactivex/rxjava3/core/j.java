package io.reactivex.rxjava3.core;

import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j<T> implements n<T> {
    public static <T> j<T> b(m<T> mVar) {
        Objects.requireNonNull(mVar, "onSubscribe is null");
        return tm0.a.m(new jm0.a(mVar));
    }

    @Override // io.reactivex.rxjava3.core.n
    public final void a(l<? super T> lVar) {
        Objects.requireNonNull(lVar, "observer is null");
        l<? super T> lVarW = tm0.a.w(this, lVar);
        Objects.requireNonNull(lVarW, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            c(lVarW);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            bm0.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    protected abstract void c(l<? super T> lVar);
}
