package io.reactivex.rxjava3.core;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class u<T> implements y<T> {
    public static <T> h<T> c(Iterable<? extends y<? extends T>> iterable) {
        return h.j(iterable).c(em0.a.c(), false);
    }

    public static <T> u<T> d(x<T> xVar) {
        Objects.requireNonNull(xVar, "source is null");
        return tm0.a.o(new mm0.a(xVar));
    }

    public static <T> u<T> h(cm0.k<? extends Throwable> kVar) {
        Objects.requireNonNull(kVar, "supplier is null");
        return tm0.a.o(new mm0.f(kVar));
    }

    public static <T> u<T> i(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return h(em0.a.d(th2));
    }

    public static <T> u<T> k(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return tm0.a.o(new mm0.h(callable));
    }

    public static <T> u<T> m(T t11) {
        Objects.requireNonNull(t11, "item is null");
        return tm0.a.o(new mm0.i(t11));
    }

    private u<T> x(long j11, TimeUnit timeUnit, t tVar, y<? extends T> yVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.o(new mm0.o(this, j11, timeUnit, tVar, yVar));
    }

    @Override // io.reactivex.rxjava3.core.y
    public final void a(w<? super T> wVar) {
        Objects.requireNonNull(wVar, "observer is null");
        w<? super T> wVarY = tm0.a.y(this, wVar);
        Objects.requireNonNull(wVarY, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            u(wVarY);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            bm0.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T b() {
        gm0.e eVar = new gm0.e();
        a(eVar);
        return (T) eVar.a();
    }

    public final u<T> e(cm0.f<? super Throwable> fVar) {
        Objects.requireNonNull(fVar, "onError is null");
        return tm0.a.o(new mm0.c(this, fVar));
    }

    public final u<T> f(cm0.f<? super T> fVar) {
        Objects.requireNonNull(fVar, "onSuccess is null");
        return tm0.a.o(new mm0.d(this, fVar));
    }

    public final u<T> g(cm0.a aVar) {
        Objects.requireNonNull(aVar, "onTerminate is null");
        return tm0.a.o(new mm0.e(this, aVar));
    }

    public final <R> u<R> j(cm0.h<? super T, ? extends y<? extends R>> hVar) {
        Objects.requireNonNull(hVar, "mapper is null");
        return tm0.a.o(new mm0.g(this, hVar));
    }

    public final b l() {
        return tm0.a.k(new hm0.d(this));
    }

    public final <R> u<R> n(cm0.h<? super T, ? extends R> hVar) {
        Objects.requireNonNull(hVar, "mapper is null");
        return tm0.a.o(new mm0.j(this, hVar));
    }

    public final u<T> o(t tVar) {
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.o(new mm0.k(this, tVar));
    }

    public final u<T> p(cm0.h<? super Throwable, ? extends y<? extends T>> hVar) {
        Objects.requireNonNull(hVar, "fallbackSupplier is null");
        return tm0.a.o(new mm0.m(this, hVar));
    }

    public final u<T> q(cm0.h<Throwable, ? extends T> hVar) {
        Objects.requireNonNull(hVar, "itemSupplier is null");
        return tm0.a.o(new mm0.l(this, hVar, null));
    }

    public final am0.b r() {
        return t(em0.a.b(), em0.a.f63094f);
    }

    public final am0.b s(cm0.b<? super T, ? super Throwable> bVar) {
        Objects.requireNonNull(bVar, "onCallback is null");
        gm0.d dVar = new gm0.d(bVar);
        a(dVar);
        return dVar;
    }

    public final am0.b t(cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2) {
        Objects.requireNonNull(fVar, "onSuccess is null");
        Objects.requireNonNull(fVar2, "onError is null");
        gm0.g gVar = new gm0.g(fVar, fVar2);
        a(gVar);
        return gVar;
    }

    protected abstract void u(w<? super T> wVar);

    public final u<T> v(t tVar) {
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.o(new mm0.n(this, tVar));
    }

    public final u<T> w(long j11, TimeUnit timeUnit) {
        return x(j11, timeUnit, vm0.a.a(), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o<T> y() {
        return this instanceof fm0.b ? ((fm0.b) this).a() : tm0.a.n(new mm0.p(this));
    }
}
