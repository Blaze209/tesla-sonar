package vm0;

import cm0.k;
import io.reactivex.rxjava3.core.t;
import java.util.concurrent.Executor;
import om0.p;
import om0.q;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final t f119573a = tm0.a.h(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final t f119574b = tm0.a.e(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final t f119575c = tm0.a.f(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final t f119576d = q.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final t f119577e = tm0.a.g(new f());

    /* JADX INFO: renamed from: vm0.a$a, reason: collision with other inner class name */
    static final class C2561a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f119578a = new om0.b();
    }

    static final class b implements k<t> {
        b() {
        }

        @Override // cm0.k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t get() {
            return C2561a.f119578a;
        }
    }

    static final class c implements k<t> {
        c() {
        }

        @Override // cm0.k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t get() {
            return d.f119579a;
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f119579a = new om0.f();
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f119580a = new om0.g();
    }

    static final class f implements k<t> {
        f() {
        }

        @Override // cm0.k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t get() {
            return e.f119580a;
        }
    }

    static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f119581a = new p();
    }

    static final class h implements k<t> {
        h() {
        }

        @Override // cm0.k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t get() {
            return g.f119581a;
        }
    }

    public static t a() {
        return tm0.a.q(f119574b);
    }

    public static t b(Executor executor, boolean z11, boolean z12) {
        return new om0.d(executor, z11, z12);
    }

    public static t c() {
        return tm0.a.s(f119575c);
    }

    public static t d() {
        return tm0.a.u(f119573a);
    }
}
