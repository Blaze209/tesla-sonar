package pq;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import wq.x;
import xq.m0;
import xq.n0;
import xq.w0;

/* JADX INFO: loaded from: classes4.dex */
final class e {

    private static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f103600a;

        private b() {
        }

        @Override // pq.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f103600a = (Context) rq.d.b(context);
            return this;
        }

        @Override // pq.v.a
        public v build() {
            rq.d.a(this.f103600a, Context.class);
            return new c(this.f103600a);
        }
    }

    private static final class c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f103601a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Provider<Executor> f103602b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Provider<Context> f103603c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Provider f103604d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Provider f103605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Provider f103606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Provider<String> f103607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Provider<m0> f103608h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Provider<wq.f> f103609i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Provider<x> f103610j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Provider<vq.c> f103611k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Provider<wq.r> f103612l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Provider<wq.v> f103613m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Provider<u> f103614n;

        private void o(Context context) {
            this.f103602b = rq.a.a(k.a());
            rq.b bVarA = rq.c.a(context);
            this.f103603c = bVarA;
            qq.j jVarA = qq.j.a(bVarA, zq.c.a(), zq.d.a());
            this.f103604d = jVarA;
            this.f103605e = rq.a.a(qq.l.a(this.f103603c, jVarA));
            this.f103606f = w0.a(this.f103603c, xq.g.a(), xq.i.a());
            this.f103607g = rq.a.a(xq.h.a(this.f103603c));
            this.f103608h = rq.a.a(n0.a(zq.c.a(), zq.d.a(), xq.j.a(), this.f103606f, this.f103607g));
            vq.g gVarB = vq.g.b(zq.c.a());
            this.f103609i = gVarB;
            vq.i iVarA = vq.i.a(this.f103603c, this.f103608h, gVarB, zq.d.a());
            this.f103610j = iVarA;
            Provider<Executor> provider = this.f103602b;
            Provider provider2 = this.f103605e;
            Provider<m0> provider3 = this.f103608h;
            this.f103611k = vq.d.a(provider, provider2, iVarA, provider3, provider3);
            Provider<Context> provider4 = this.f103603c;
            Provider provider5 = this.f103605e;
            Provider<m0> provider6 = this.f103608h;
            this.f103612l = wq.s.a(provider4, provider5, provider6, this.f103610j, this.f103602b, provider6, zq.c.a(), zq.d.a(), this.f103608h);
            Provider<Executor> provider7 = this.f103602b;
            Provider<m0> provider8 = this.f103608h;
            this.f103613m = wq.w.a(provider7, provider8, this.f103610j, provider8);
            this.f103614n = rq.a.a(w.a(zq.c.a(), zq.d.a(), this.f103611k, this.f103612l, this.f103613m));
        }

        @Override // pq.v
        xq.d c() {
            return this.f103608h.get();
        }

        @Override // pq.v
        u n() {
            return this.f103614n.get();
        }

        private c(Context context) {
            this.f103601a = this;
            o(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
