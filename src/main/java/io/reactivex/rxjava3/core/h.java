package io.reactivex.rxjava3.core;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h<T> implements nr0.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f78862a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static int b() {
        return f78862a;
    }

    private h<T> g(cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar, cm0.a aVar2) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        Objects.requireNonNull(aVar2, "onAfterTerminate is null");
        return tm0.a.l(new im0.d(this, fVar, fVar2, aVar, aVar2));
    }

    public static <T> h<T> i() {
        return tm0.a.l(im0.e.f78331b);
    }

    public static <T> h<T> j(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return tm0.a.l(new im0.f(iterable));
    }

    public static <T> h<T> k(nr0.a<? extends T> aVar) {
        if (aVar instanceof h) {
            return tm0.a.l((h) aVar);
        }
        Objects.requireNonNull(aVar, "publisher is null");
        return tm0.a.l(new im0.h(aVar));
    }

    public static h<Long> l(long j11, long j12, TimeUnit timeUnit) {
        return m(j11, j12, timeUnit, vm0.a.a());
    }

    public static h<Long> m(long j11, long j12, TimeUnit timeUnit, t tVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.l(new im0.j(Math.max(0L, j11), Math.max(0L, j12), timeUnit, tVar));
    }

    public static h<Long> n(long j11, long j12, long j13, long j14, TimeUnit timeUnit) {
        return o(j11, j12, j13, j14, timeUnit, vm0.a.a());
    }

    public static h<Long> o(long j11, long j12, long j13, long j14, TimeUnit timeUnit, t tVar) {
        if (j12 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j12);
        }
        if (j12 == 0) {
            return i().e(j13, timeUnit, tVar);
        }
        long j15 = (j12 - 1) + j11;
        if (j11 > 0 && j15 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.l(new im0.k(j11, j15, Math.max(0L, j13), Math.max(0L, j14), timeUnit, tVar));
    }

    public final <R> h<R> c(cm0.h<? super T, ? extends y<? extends R>> hVar, boolean z11) {
        return d(hVar, z11, 2);
    }

    public final <R> h<R> d(cm0.h<? super T, ? extends y<? extends R>> hVar, boolean z11, int i11) {
        Objects.requireNonNull(hVar, "mapper is null");
        em0.b.b(i11, "prefetch");
        return tm0.a.l(new km0.b(this, hVar, z11 ? rm0.f.END : rm0.f.BOUNDARY, i11));
    }

    public final h<T> e(long j11, TimeUnit timeUnit, t tVar) {
        return f(j11, timeUnit, tVar, false);
    }

    public final h<T> f(long j11, TimeUnit timeUnit, t tVar, boolean z11) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.l(new im0.c(this, Math.max(0L, j11), timeUnit, tVar, z11));
    }

    public final h<T> h(cm0.a aVar) {
        return g(em0.a.b(), em0.a.a(aVar), aVar, em0.a.f63091c);
    }

    public final <R> h<R> p(cm0.h<? super T, ? extends R> hVar) {
        Objects.requireNonNull(hVar, "mapper is null");
        return tm0.a.l(new im0.l(this, hVar));
    }

    public final h<T> q() {
        return r(b(), false, true);
    }

    public final h<T> r(int i11, boolean z11, boolean z12) {
        em0.b.b(i11, "capacity");
        return tm0.a.l(new im0.m(this, i11, z12, z11, em0.a.f63091c));
    }

    public final h<T> s() {
        return tm0.a.l(new im0.n(this));
    }

    @Override // nr0.a
    public final void subscribe(nr0.b<? super T> bVar) {
        if (bVar instanceof i) {
            x((i) bVar);
        } else {
            Objects.requireNonNull(bVar, "subscriber is null");
            x(new pm0.d(bVar));
        }
    }

    public final h<T> t() {
        return tm0.a.l(new im0.p(this));
    }

    public final <R> u<R> u(R r11, cm0.c<R, ? super T, R> cVar) {
        Objects.requireNonNull(r11, "seed is null");
        Objects.requireNonNull(cVar, "reducer is null");
        return tm0.a.o(new im0.q(this, r11, cVar));
    }

    public final am0.b v(cm0.f<? super T> fVar) {
        return w(fVar, em0.a.f63094f, em0.a.f63091c);
    }

    public final am0.b w(cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        pm0.c cVar = new pm0.c(fVar, fVar2, aVar, im0.i.INSTANCE);
        x(cVar);
        return cVar;
    }

    public final void x(i<? super T> iVar) {
        Objects.requireNonNull(iVar, "subscriber is null");
        try {
            nr0.b<? super T> bVarZ = tm0.a.z(this, iVar);
            Objects.requireNonNull(bVarZ, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            y(bVarZ);
        } catch (NullPointerException e11) {
            throw e11;
        } catch (Throwable th2) {
            bm0.a.b(th2);
            tm0.a.r(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    protected abstract void y(nr0.b<? super T> bVar);
}
