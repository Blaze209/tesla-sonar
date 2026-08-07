package io.reactivex.rxjava3.core;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import lm0.a0;
import lm0.b0;
import lm0.c0;
import lm0.z;

/* JADX INFO: loaded from: classes8.dex */
public abstract class o<T> implements r<T> {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78863a;

        static {
            int[] iArr = new int[io.reactivex.rxjava3.core.a.values().length];
            f78863a = iArr;
            try {
                iArr[io.reactivex.rxjava3.core.a.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78863a[io.reactivex.rxjava3.core.a.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78863a[io.reactivex.rxjava3.core.a.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78863a[io.reactivex.rxjava3.core.a.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static o<Long> A(long j11, long j12, TimeUnit timeUnit, t tVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.n(new lm0.q(Math.max(0L, j11), Math.max(0L, j12), timeUnit, tVar));
    }

    public static o<Long> B(long j11, TimeUnit timeUnit) {
        return A(j11, j11, timeUnit, vm0.a.a());
    }

    public static <T> o<T> C(T t11) {
        Objects.requireNonNull(t11, "item is null");
        return tm0.a.n(new lm0.r(t11));
    }

    public static <T> o<T> X(r<T> rVar) {
        Objects.requireNonNull(rVar, "source is null");
        return rVar instanceof o ? tm0.a.n((o) rVar) : tm0.a.n(new lm0.m(rVar));
    }

    public static int b() {
        return h.b();
    }

    public static <T1, T2, R> o<R> c(r<? extends T1> rVar, r<? extends T2> rVar2, cm0.c<? super T1, ? super T2, ? extends R> cVar) {
        Objects.requireNonNull(rVar, "source1 is null");
        Objects.requireNonNull(rVar2, "source2 is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return e(new r[]{rVar, rVar2}, em0.a.e(cVar), b());
    }

    public static <T1, T2, T3, R> o<R> d(r<? extends T1> rVar, r<? extends T2> rVar2, r<? extends T3> rVar3, cm0.g<? super T1, ? super T2, ? super T3, ? extends R> gVar) {
        Objects.requireNonNull(rVar, "source1 is null");
        Objects.requireNonNull(rVar2, "source2 is null");
        Objects.requireNonNull(rVar3, "source3 is null");
        Objects.requireNonNull(gVar, "combiner is null");
        return e(new r[]{rVar, rVar2, rVar3}, em0.a.f(gVar), b());
    }

    public static <T, R> o<R> e(r<? extends T>[] rVarArr, cm0.h<? super Object[], ? extends R> hVar, int i11) {
        Objects.requireNonNull(rVarArr, "sources is null");
        if (rVarArr.length == 0) {
            return r();
        }
        Objects.requireNonNull(hVar, "combiner is null");
        em0.b.b(i11, "bufferSize");
        return tm0.a.n(new lm0.b(rVarArr, null, hVar, i11 << 1, false));
    }

    @SafeVarargs
    public static <T> o<T> f(r<? extends T>... rVarArr) {
        Objects.requireNonNull(rVarArr, "sources is null");
        if (rVarArr.length == 0) {
            return r();
        }
        return rVarArr.length == 1 ? X(rVarArr[0]) : tm0.a.n(new lm0.c(x(rVarArr), em0.a.c(), b(), rm0.f.BOUNDARY));
    }

    public static <T> o<T> g(q<T> qVar) {
        Objects.requireNonNull(qVar, "source is null");
        return tm0.a.n(new lm0.d(qVar));
    }

    private o<T> n(cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar, cm0.a aVar2) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        Objects.requireNonNull(aVar2, "onAfterTerminate is null");
        return tm0.a.n(new lm0.g(this, fVar, fVar2, aVar, aVar2));
    }

    public static <T> o<T> r() {
        return tm0.a.n(lm0.i.f90383a);
    }

    @SafeVarargs
    public static <T> o<T> x(T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        if (tArr.length == 0) {
            return r();
        }
        return tArr.length == 1 ? C(tArr[0]) : tm0.a.n(new lm0.l(tArr));
    }

    public final <R> o<R> D(cm0.h<? super T, ? extends R> hVar) {
        Objects.requireNonNull(hVar, "mapper is null");
        return tm0.a.n(new lm0.s(this, hVar));
    }

    public final o<T> E(t tVar) {
        return F(tVar, false, b());
    }

    public final o<T> F(t tVar, boolean z11, int i11) {
        Objects.requireNonNull(tVar, "scheduler is null");
        em0.b.b(i11, "bufferSize");
        return tm0.a.n(new lm0.t(this, tVar, z11, i11));
    }

    public final o<T> G(cm0.h<? super Throwable, ? extends T> hVar) {
        Objects.requireNonNull(hVar, "itemSupplier is null");
        return tm0.a.n(new lm0.u(this, hVar));
    }

    public final <R> o<R> H(R r11, cm0.c<R, ? super T, R> cVar) {
        Objects.requireNonNull(r11, "initialValue is null");
        return I(em0.a.d(r11), cVar);
    }

    public final <R> o<R> I(cm0.k<R> kVar, cm0.c<R, ? super T, R> cVar) {
        Objects.requireNonNull(kVar, "seedSupplier is null");
        Objects.requireNonNull(cVar, "accumulator is null");
        return tm0.a.n(new lm0.w(this, kVar, cVar));
    }

    public final j<T> J() {
        return tm0.a.m(new lm0.x(this));
    }

    public final u<T> K() {
        return tm0.a.o(new lm0.y(this, null));
    }

    public final o<T> L(cm0.j<? super T> jVar) {
        Objects.requireNonNull(jVar, "predicate is null");
        return tm0.a.n(new z(this, jVar));
    }

    public final o<T> M(T t11) {
        return f(C(t11), this);
    }

    public final am0.b N(cm0.f<? super T> fVar) {
        return P(fVar, em0.a.f63094f, em0.a.f63091c);
    }

    public final am0.b O(cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2) {
        return P(fVar, fVar2, em0.a.f63091c);
    }

    public final am0.b P(cm0.f<? super T> fVar, cm0.f<? super Throwable> fVar2, cm0.a aVar) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        gm0.k kVar = new gm0.k(fVar, fVar2, aVar, em0.a.b());
        a(kVar);
        return kVar;
    }

    protected abstract void Q(s<? super T> sVar);

    public final o<T> R(t tVar) {
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.n(new a0(this, tVar));
    }

    public final <R> o<R> S(cm0.h<? super T, ? extends r<? extends R>> hVar) {
        return T(hVar, b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> o<R> T(cm0.h<? super T, ? extends r<? extends R>> hVar, int i11) {
        Objects.requireNonNull(hVar, "mapper is null");
        em0.b.b(i11, "bufferSize");
        if (!(this instanceof fm0.f)) {
            return tm0.a.n(new b0(this, hVar, i11, false));
        }
        Object obj = ((fm0.f) this).get();
        return obj == null ? r() : lm0.v.a(obj, hVar);
    }

    public final o<T> U(long j11, TimeUnit timeUnit) {
        return V(j11, timeUnit, vm0.a.a());
    }

    public final o<T> V(long j11, TimeUnit timeUnit, t tVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.n(new c0(this, j11, timeUnit, tVar));
    }

    public final h<T> W(io.reactivex.rxjava3.core.a aVar) {
        Objects.requireNonNull(aVar, "strategy is null");
        im0.g gVar = new im0.g(this);
        int i11 = a.f78863a[aVar.ordinal()];
        if (i11 == 1) {
            return gVar.s();
        }
        if (i11 == 2) {
            return gVar.t();
        }
        if (i11 != 3) {
            return i11 != 4 ? gVar.q() : tm0.a.l(new im0.o(gVar));
        }
        return gVar;
    }

    @Override // io.reactivex.rxjava3.core.r
    public final void a(s<? super T> sVar) {
        Objects.requireNonNull(sVar, "observer is null");
        try {
            s<? super T> sVarX = tm0.a.x(this, sVar);
            Objects.requireNonNull(sVarX, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            Q(sVarX);
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

    public final o<T> h(long j11, TimeUnit timeUnit) {
        return i(j11, timeUnit, vm0.a.a());
    }

    public final o<T> i(long j11, TimeUnit timeUnit, t tVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(tVar, "scheduler is null");
        return tm0.a.n(new lm0.e(this, j11, timeUnit, tVar));
    }

    public final o<T> j() {
        return l(em0.a.c());
    }

    public final o<T> k(cm0.d<? super T, ? super T> dVar) {
        Objects.requireNonNull(dVar, "comparer is null");
        return tm0.a.n(new lm0.f(this, em0.a.c(), dVar));
    }

    public final <K> o<T> l(cm0.h<? super T, K> hVar) {
        Objects.requireNonNull(hVar, "keySelector is null");
        return tm0.a.n(new lm0.f(this, hVar, em0.b.a()));
    }

    public final o<T> m(cm0.a aVar) {
        return p(em0.a.b(), aVar);
    }

    public final o<T> o(cm0.f<? super Throwable> fVar) {
        cm0.f<? super T> fVarB = em0.a.b();
        cm0.a aVar = em0.a.f63091c;
        return n(fVarB, fVar, aVar, aVar);
    }

    public final o<T> p(cm0.f<? super am0.b> fVar, cm0.a aVar) {
        Objects.requireNonNull(fVar, "onSubscribe is null");
        Objects.requireNonNull(aVar, "onDispose is null");
        return tm0.a.n(new lm0.h(this, fVar, aVar));
    }

    public final o<T> q(cm0.f<? super T> fVar) {
        cm0.f<? super Throwable> fVarB = em0.a.b();
        cm0.a aVar = em0.a.f63091c;
        return n(fVar, fVarB, aVar, aVar);
    }

    public final o<T> s(cm0.j<? super T> jVar) {
        Objects.requireNonNull(jVar, "predicate is null");
        return tm0.a.n(new lm0.j(this, jVar));
    }

    public final <R> o<R> t(cm0.h<? super T, ? extends r<? extends R>> hVar) {
        return u(hVar, false);
    }

    public final <R> o<R> u(cm0.h<? super T, ? extends r<? extends R>> hVar, boolean z11) {
        return v(hVar, z11, Integer.MAX_VALUE);
    }

    public final <R> o<R> v(cm0.h<? super T, ? extends r<? extends R>> hVar, boolean z11, int i11) {
        return w(hVar, z11, i11, b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> o<R> w(cm0.h<? super T, ? extends r<? extends R>> hVar, boolean z11, int i11, int i12) {
        Objects.requireNonNull(hVar, "mapper is null");
        em0.b.b(i11, "maxConcurrency");
        em0.b.b(i12, "bufferSize");
        if (!(this instanceof fm0.f)) {
            return tm0.a.n(new lm0.k(this, hVar, z11, i11, i12));
        }
        Object obj = ((fm0.f) this).get();
        return obj == null ? r() : lm0.v.a(obj, hVar);
    }

    public final o<T> y() {
        return tm0.a.n(new lm0.n(this));
    }

    public final b z() {
        return tm0.a.k(new lm0.p(this));
    }
}
