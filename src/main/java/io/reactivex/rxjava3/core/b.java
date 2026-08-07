package io.reactivex.rxjava3.core;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b implements f {
    public static b d() {
        return tm0.a.k(hm0.b.f73182a);
    }

    public static b e(e eVar) {
        Objects.requireNonNull(eVar, "source is null");
        return tm0.a.k(new hm0.a(eVar));
    }

    public static b f(Callable<?> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return tm0.a.k(new hm0.c(callable));
    }

    public static b l(long j11, TimeUnit timeUnit) {
        return m(j11, timeUnit, vm0.a.a());
    }

    public static b m(long j11, TimeUnit timeUnit, t tVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.k(new hm0.f(j11, timeUnit, tVar));
    }

    private static NullPointerException n(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    @Override // io.reactivex.rxjava3.core.f
    public final void b(d dVar) {
        Objects.requireNonNull(dVar, "observer is null");
        try {
            d dVarV = tm0.a.v(this, dVar);
            Objects.requireNonNull(dVarV, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            j(dVarV);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            bm0.a.b(th2);
            tm0.a.r(th2);
            throw n(th2);
        }
    }

    public final <T> u<T> c(y<T> yVar) {
        Objects.requireNonNull(yVar, "next is null");
        return tm0.a.o(new mm0.b(yVar, this));
    }

    public final am0.b g() {
        gm0.j jVar = new gm0.j();
        b(jVar);
        return jVar;
    }

    public final am0.b h(cm0.a aVar) {
        Objects.requireNonNull(aVar, "onComplete is null");
        gm0.f fVar = new gm0.f(aVar);
        b(fVar);
        return fVar;
    }

    public final am0.b i(cm0.a aVar, cm0.f<? super Throwable> fVar) {
        Objects.requireNonNull(fVar, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        gm0.f fVar2 = new gm0.f(fVar, aVar);
        b(fVar2);
        return fVar2;
    }

    protected abstract void j(d dVar);

    public final b k(t tVar) {
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.k(new hm0.e(this, tVar));
    }
}
