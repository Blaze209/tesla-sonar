package tm0;

import cm0.c;
import cm0.f;
import cm0.h;
import cm0.k;
import io.reactivex.rxjava3.core.b;
import io.reactivex.rxjava3.core.d;
import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.core.l;
import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.util.Objects;
import rm0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile f<? super Throwable> f114799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile h<? super Runnable, ? extends Runnable> f114800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile h<? super k<t>, ? extends t> f114801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile h<? super k<t>, ? extends t> f114802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile h<? super k<t>, ? extends t> f114803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile h<? super k<t>, ? extends t> f114804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile h<? super t, ? extends t> f114805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static volatile h<? super t, ? extends t> f114806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static volatile h<? super t, ? extends t> f114807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static volatile h<? super io.reactivex.rxjava3.core.h, ? extends io.reactivex.rxjava3.core.h> f114808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static volatile h<? super o, ? extends o> f114809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static volatile h<? super j, ? extends j> f114810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static volatile h<? super u, ? extends u> f114811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static volatile h<? super b, ? extends b> f114812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static volatile c<? super io.reactivex.rxjava3.core.h, ? super nr0.b, ? extends nr0.b> f114813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static volatile c<? super j, ? super l, ? extends l> f114814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static volatile c<? super o, ? super s, ? extends s> f114815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static volatile c<? super u, ? super w, ? extends w> f114816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static volatile c<? super b, ? super d, ? extends d> f114817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static volatile boolean f114818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static volatile boolean f114819u;

    public static void A(f<? super Throwable> fVar) {
        if (f114818t) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f114799a = fVar;
    }

    static void B(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    static <T, U, R> R a(c<T, U, R> cVar, T t11, U u11) {
        try {
            return cVar.apply(t11, u11);
        } catch (Throwable th2) {
            throw g.h(th2);
        }
    }

    static <T, R> R b(h<T, R> hVar, T t11) {
        try {
            return hVar.apply(t11);
        } catch (Throwable th2) {
            throw g.h(th2);
        }
    }

    static t c(h<? super k<t>, ? extends t> hVar, k<t> kVar) {
        Object objB = b(hVar, kVar);
        Objects.requireNonNull(objB, "Scheduler Supplier result can't be null");
        return (t) objB;
    }

    static t d(k<t> kVar) {
        try {
            t tVar = kVar.get();
            Objects.requireNonNull(tVar, "Scheduler Supplier result can't be null");
            return tVar;
        } catch (Throwable th2) {
            throw g.h(th2);
        }
    }

    public static t e(k<t> kVar) {
        Objects.requireNonNull(kVar, "Scheduler Supplier can't be null");
        h<? super k<t>, ? extends t> hVar = f114801c;
        return hVar == null ? d(kVar) : c(hVar, kVar);
    }

    public static t f(k<t> kVar) {
        Objects.requireNonNull(kVar, "Scheduler Supplier can't be null");
        h<? super k<t>, ? extends t> hVar = f114803e;
        return hVar == null ? d(kVar) : c(hVar, kVar);
    }

    public static t g(k<t> kVar) {
        Objects.requireNonNull(kVar, "Scheduler Supplier can't be null");
        h<? super k<t>, ? extends t> hVar = f114804f;
        return hVar == null ? d(kVar) : c(hVar, kVar);
    }

    public static t h(k<t> kVar) {
        Objects.requireNonNull(kVar, "Scheduler Supplier can't be null");
        h<? super k<t>, ? extends t> hVar = f114802d;
        return hVar == null ? d(kVar) : c(hVar, kVar);
    }

    static boolean i(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean j() {
        return f114819u;
    }

    public static b k(b bVar) {
        h<? super b, ? extends b> hVar = f114812n;
        return hVar != null ? (b) b(hVar, bVar) : bVar;
    }

    public static <T> io.reactivex.rxjava3.core.h<T> l(io.reactivex.rxjava3.core.h<T> hVar) {
        h<? super io.reactivex.rxjava3.core.h, ? extends io.reactivex.rxjava3.core.h> hVar2 = f114808j;
        return hVar2 != null ? (io.reactivex.rxjava3.core.h) b(hVar2, hVar) : hVar;
    }

    public static <T> j<T> m(j<T> jVar) {
        h<? super j, ? extends j> hVar = f114810l;
        return hVar != null ? (j) b(hVar, jVar) : jVar;
    }

    public static <T> o<T> n(o<T> oVar) {
        h<? super o, ? extends o> hVar = f114809k;
        return hVar != null ? (o) b(hVar, oVar) : oVar;
    }

    public static <T> u<T> o(u<T> uVar) {
        h<? super u, ? extends u> hVar = f114811m;
        return hVar != null ? (u) b(hVar, uVar) : uVar;
    }

    public static boolean p() {
        return false;
    }

    public static t q(t tVar) {
        h<? super t, ? extends t> hVar = f114805g;
        return hVar == null ? tVar : (t) b(hVar, tVar);
    }

    public static void r(Throwable th2) {
        f<? super Throwable> fVar = f114799a;
        if (th2 == null) {
            th2 = g.b("onError called with a null Throwable.");
        } else if (!i(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (fVar != null) {
            try {
                fVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                B(th3);
            }
        }
        th2.printStackTrace();
        B(th2);
    }

    public static t s(t tVar) {
        h<? super t, ? extends t> hVar = f114807i;
        return hVar == null ? tVar : (t) b(hVar, tVar);
    }

    public static Runnable t(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        h<? super Runnable, ? extends Runnable> hVar = f114800b;
        return hVar == null ? runnable : (Runnable) b(hVar, runnable);
    }

    public static t u(t tVar) {
        h<? super t, ? extends t> hVar = f114806h;
        return hVar == null ? tVar : (t) b(hVar, tVar);
    }

    public static d v(b bVar, d dVar) {
        c<? super b, ? super d, ? extends d> cVar = f114817s;
        return cVar != null ? (d) a(cVar, bVar, dVar) : dVar;
    }

    public static <T> l<? super T> w(j<T> jVar, l<? super T> lVar) {
        c<? super j, ? super l, ? extends l> cVar = f114814p;
        return cVar != null ? (l) a(cVar, jVar, lVar) : lVar;
    }

    public static <T> s<? super T> x(o<T> oVar, s<? super T> sVar) {
        c<? super o, ? super s, ? extends s> cVar = f114815q;
        return cVar != null ? (s) a(cVar, oVar, sVar) : sVar;
    }

    public static <T> w<? super T> y(u<T> uVar, w<? super T> wVar) {
        c<? super u, ? super w, ? extends w> cVar = f114816r;
        return cVar != null ? (w) a(cVar, uVar, wVar) : wVar;
    }

    public static <T> nr0.b<? super T> z(io.reactivex.rxjava3.core.h<T> hVar, nr0.b<? super T> bVar) {
        c<? super io.reactivex.rxjava3.core.h, ? super nr0.b, ? extends nr0.b> cVar = f114813o;
        return cVar != null ? (nr0.b) a(cVar, hVar, bVar) : bVar;
    }
}
