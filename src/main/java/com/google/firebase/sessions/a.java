package com.google.firebase.sessions;

import android.content.Context;
import nq.j;
import p013kotlin.coroutines.CoroutineContext;
import u6.h;
import vw.ApplicationInfo;
import vw.SessionData;
import vw.a0;
import vw.b0;
import vw.f0;
import vw.g0;
import vw.i;
import vw.l;
import vw.l0;
import vw.m0;
import vw.n0;
import vw.o0;
import vw.q0;
import vw.r0;
import vw.s;
import vw.s0;
import vw.t0;
import vw.u0;
import vw.w0;
import vw.y0;
import yw.SessionConfigs;
import yw.k;
import yw.m;
import yw.n;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    private static final class b implements com.google.firebase.sessions.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f44774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CoroutineContext f44775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CoroutineContext f44776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.firebase.f f44777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private zv.f f44778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private yv.b<j> f44779f;

        private b() {
        }

        @Override // com.google.firebase.sessions.b.a
        public com.google.firebase.sessions.b build() {
            xw.d.a(this.f44774a, Context.class);
            xw.d.a(this.f44775b, CoroutineContext.class);
            xw.d.a(this.f44776c, CoroutineContext.class);
            xw.d.a(this.f44777d, com.google.firebase.f.class);
            xw.d.a(this.f44778e, zv.f.class);
            xw.d.a(this.f44779f, yv.b.class);
            return new c(this.f44774a, this.f44775b, this.f44776c, this.f44777d, this.f44778e, this.f44779f);
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b d(Context context) {
            this.f44774a = (Context) xw.d.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b e(CoroutineContext coroutineContext) {
            this.f44775b = (CoroutineContext) xw.d.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b f(CoroutineContext coroutineContext) {
            this.f44776c = (CoroutineContext) xw.d.b(coroutineContext);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b c(com.google.firebase.f fVar) {
            this.f44777d = (com.google.firebase.f) xw.d.b(fVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b b(zv.f fVar) {
            this.f44778e = (zv.f) xw.d.b(fVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b a(yv.b<j> bVar) {
            this.f44779f = (yv.b) xw.d.b(bVar);
            return this;
        }
    }

    private static final class c implements com.google.firebase.sessions.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f44780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private xw.e<com.google.firebase.f> f44781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private xw.e<Context> f44782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private xw.e<yw.b> f44783d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private xw.e<w0> f44784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private xw.e<zv.f> f44785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private xw.e<ApplicationInfo> f44786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private xw.e<CoroutineContext> f44787h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private xw.e<yw.e> f44788i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private xw.e<CoroutineContext> f44789j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private xw.e<h<SessionConfigs>> f44790k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private xw.e<m> f44791l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private xw.e<yw.d> f44792m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private xw.e<yw.j> f44793n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private xw.e<y0> f44794o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private xw.e<n0> f44795p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private xw.e<yv.b<j>> f44796q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private xw.e<vw.g> f44797r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private xw.e<l0> f44798s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private xw.e<f0> f44799t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private xw.e<h<SessionData>> f44800u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private xw.e<a0> f44801v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private xw.e<t0> f44802w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private xw.e<q0> f44803x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private xw.e<l> f44804y;

        private void c(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.f fVar, zv.f fVar2, yv.b<j> bVar) {
            this.f44781b = xw.c.a(fVar);
            xw.b bVarA = xw.c.a(context);
            this.f44782c = bVarA;
            this.f44783d = xw.a.a(yw.c.a(bVarA));
            this.f44784e = xw.a.a(f.a());
            this.f44785f = xw.c.a(fVar2);
            this.f44786g = xw.a.a(com.google.firebase.sessions.c.b(this.f44781b));
            xw.b bVarA2 = xw.c.a(coroutineContext2);
            this.f44787h = bVarA2;
            this.f44788i = xw.a.a(yw.f.a(this.f44786g, bVarA2));
            this.f44789j = xw.c.a(coroutineContext);
            xw.e<h<SessionConfigs>> eVarA = xw.a.a(d.a(this.f44782c, this.f44787h));
            this.f44790k = eVarA;
            xw.e<m> eVarA2 = xw.a.a(n.a(this.f44789j, this.f44784e, eVarA));
            this.f44791l = eVarA2;
            xw.e<yw.d> eVarA3 = xw.a.a(yw.g.a(this.f44784e, this.f44785f, this.f44786g, this.f44788i, eVarA2));
            this.f44792m = eVarA3;
            this.f44793n = xw.a.a(k.a(this.f44783d, eVarA3));
            xw.e<y0> eVarA4 = xw.a.a(g.a());
            this.f44794o = eVarA4;
            this.f44795p = xw.a.a(o0.a(this.f44784e, eVarA4));
            xw.b bVarA3 = xw.c.a(bVar);
            this.f44796q = bVarA3;
            xw.e<vw.g> eVarA5 = xw.a.a(i.a(bVarA3));
            this.f44797r = eVarA5;
            this.f44798s = xw.a.a(m0.a(this.f44781b, this.f44785f, this.f44793n, eVarA5, this.f44789j));
            xw.e<f0> eVarA6 = xw.a.a(g0.a(this.f44795p));
            this.f44799t = eVarA6;
            this.f44800u = xw.a.a(e.a(this.f44782c, this.f44787h, eVarA6));
            xw.e<a0> eVarA7 = xw.a.a(b0.a(this.f44782c, this.f44794o));
            this.f44801v = eVarA7;
            xw.e<t0> eVarA8 = xw.a.a(u0.a(this.f44793n, this.f44795p, this.f44798s, this.f44784e, this.f44800u, eVarA7, this.f44789j));
            this.f44802w = eVarA8;
            xw.e<q0> eVarA9 = xw.a.a(r0.a(eVarA8));
            this.f44803x = eVarA9;
            this.f44804y = xw.a.a(s.a(this.f44781b, this.f44793n, this.f44789j, eVarA9));
        }

        @Override // com.google.firebase.sessions.b
        public l a() {
            return this.f44804y.get();
        }

        @Override // com.google.firebase.sessions.b
        public s0 b() {
            return this.f44802w.get();
        }

        private c(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, com.google.firebase.f fVar, zv.f fVar2, yv.b<j> bVar) {
            this.f44780a = this;
            c(context, coroutineContext, coroutineContext2, fVar, fVar2, bVar);
        }
    }

    public static com.google.firebase.sessions.b.a a() {
        return new b();
    }
}
