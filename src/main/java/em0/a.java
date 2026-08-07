package em0;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final cm0.h<Object, Object> f63089a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f63090b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cm0.a f63091c = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final cm0.f<Object> f63092d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final cm0.f<Throwable> f63093e = new h();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final cm0.f<Throwable> f63094f = new n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cm0.i f63095g = new f();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final cm0.j<Object> f63096h = new o();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final cm0.j<Object> f63097i = new i();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final cm0.k<Object> f63098j = new m();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final cm0.f<nr0.c> f63099k = new l();

    /* JADX INFO: renamed from: em0.a$a, reason: collision with other inner class name */
    static final class C1294a<T> implements cm0.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final cm0.a f63100a;

        C1294a(cm0.a aVar) {
            this.f63100a = aVar;
        }

        @Override // cm0.f
        public void accept(T t11) {
            this.f63100a.run();
        }
    }

    static final class b<T1, T2, R> implements cm0.h<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final cm0.c<? super T1, ? super T2, ? extends R> f63101a;

        b(cm0.c<? super T1, ? super T2, ? extends R> cVar) {
            this.f63101a = cVar;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f63101a.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    static final class c<T1, T2, T3, R> implements cm0.h<Object[], R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final cm0.g<T1, T2, T3, R> f63102a;

        c(cm0.g<T1, T2, T3, R> gVar) {
            this.f63102a = gVar;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public R apply(Object[] objArr) {
            if (objArr.length == 3) {
                return this.f63102a.a((T1) objArr[0], (T2) objArr[1], (T3) objArr[2]);
            }
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
    }

    static final class f implements cm0.i {
        f() {
        }
    }

    static final class h implements cm0.f<Throwable> {
        h() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            tm0.a.r(th2);
        }
    }

    static final class i implements cm0.j<Object> {
        i() {
        }

        @Override // cm0.j
        public boolean test(Object obj) {
            return false;
        }
    }

    static final class k<T, U> implements Callable<U>, cm0.k<U>, cm0.h<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final U f63103a;

        k(U u11) {
            this.f63103a = u11;
        }

        @Override // cm0.h
        public U apply(T t11) {
            return this.f63103a;
        }

        @Override // java.util.concurrent.Callable
        public U call() {
            return this.f63103a;
        }

        @Override // cm0.k
        public U get() {
            return this.f63103a;
        }
    }

    static final class l implements cm0.f<nr0.c> {
        l() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(nr0.c cVar) {
            cVar.request(Long.MAX_VALUE);
        }
    }

    static final class m implements cm0.k<Object> {
        m() {
        }

        @Override // cm0.k
        public Object get() {
            return null;
        }
    }

    static final class n implements cm0.f<Throwable> {
        n() {
        }

        @Override // cm0.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            tm0.a.r(new OnErrorNotImplementedException(th2));
        }
    }

    static final class o implements cm0.j<Object> {
        o() {
        }

        @Override // cm0.j
        public boolean test(Object obj) {
            return true;
        }
    }

    public static <T> cm0.f<T> a(cm0.a aVar) {
        return new C1294a(aVar);
    }

    public static <T> cm0.f<T> b() {
        return (cm0.f<T>) f63092d;
    }

    public static <T> cm0.h<T, T> c() {
        return (cm0.h<T, T>) f63089a;
    }

    public static <T> cm0.k<T> d(T t11) {
        return new k(t11);
    }

    public static <T1, T2, R> cm0.h<Object[], R> e(cm0.c<? super T1, ? super T2, ? extends R> cVar) {
        return new b(cVar);
    }

    public static <T1, T2, T3, R> cm0.h<Object[], R> f(cm0.g<T1, T2, T3, R> gVar) {
        return new c(gVar);
    }

    static final class d implements cm0.a {
        d() {
        }

        public String toString() {
            return "EmptyAction";
        }

        @Override // cm0.a
        public void run() {
        }
    }

    static final class g implements Runnable {
        g() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static final class e implements cm0.f<Object> {
        e() {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        @Override // cm0.f
        public void accept(Object obj) {
        }
    }

    static final class j implements cm0.h<Object, Object> {
        j() {
        }

        public String toString() {
            return "IdentityFunction";
        }

        @Override // cm0.h
        public Object apply(Object obj) {
            return obj;
        }
    }
}
