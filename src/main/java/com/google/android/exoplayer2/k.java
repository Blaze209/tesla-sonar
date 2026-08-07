package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.gms.location.DeviceOrientationRequest;
import cr.l1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface k extends v1 {

    public interface a {
        default void B(boolean z11) {
        }

        default void y(boolean z11) {
        }
    }

    public static final class b {
        boolean A;
        boolean B;
        Looper C;
        boolean D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f40094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ts.d f40095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f40096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ou.x<br.k0> f40097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ou.x<com.google.android.exoplayer2.source.o.a> f40098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ou.x<qs.a0> f40099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ou.x<br.t> f40100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ou.x<ss.d> f40101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ou.h<ts.d, cr.a> f40102i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Looper f40103j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        PriorityTaskManager f40104k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        com.google.android.exoplayer2.audio.a f40105l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f40106m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f40107n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f40108o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f40109p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f40110q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f40111r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f40112s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f40113t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        br.l0 f40114u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        long f40115v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        long f40116w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        w0 f40117x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        long f40118y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        long f40119z;

        public b(final Context context) {
            this(context, new ou.x() { // from class: br.i
                @Override // ou.x
                public final Object get() {
                    return com.google.android.exoplayer2.k.b.a(context);
                }
            }, new ou.x() { // from class: br.j
                @Override // ou.x
                public final Object get() {
                    return com.google.android.exoplayer2.k.b.b(context);
                }
            });
        }

        public static /* synthetic */ br.k0 a(Context context) {
            return new br.f(context);
        }

        public static /* synthetic */ com.google.android.exoplayer2.source.o.a b(Context context) {
            return new com.google.android.exoplayer2.source.i(context, new hr.h());
        }

        public static /* synthetic */ qs.a0 d(Context context) {
            return new qs.m(context);
        }

        public k e() {
            ts.a.g(!this.D);
            this.D = true;
            return new i0(this, null);
        }

        private b(final Context context, ou.x<br.k0> xVar, ou.x<com.google.android.exoplayer2.source.o.a> xVar2) {
            this(context, xVar, xVar2, new ou.x() { // from class: br.k
                @Override // ou.x
                public final Object get() {
                    return com.google.android.exoplayer2.k.b.d(context);
                }
            }, new ou.x() { // from class: br.l
                @Override // ou.x
                public final Object get() {
                    return new e();
                }
            }, new ou.x() { // from class: br.m
                @Override // ou.x
                public final Object get() {
                    return ss.o.l(context);
                }
            }, new ou.h() { // from class: br.n
                @Override // ou.h
                public final Object apply(Object obj) {
                    return new l1((ts.d) obj);
                }
            });
        }

        private b(Context context, ou.x<br.k0> xVar, ou.x<com.google.android.exoplayer2.source.o.a> xVar2, ou.x<qs.a0> xVar3, ou.x<br.t> xVar4, ou.x<ss.d> xVar5, ou.h<ts.d, cr.a> hVar) {
            this.f40094a = (Context) ts.a.e(context);
            this.f40097d = xVar;
            this.f40098e = xVar2;
            this.f40099f = xVar3;
            this.f40100g = xVar4;
            this.f40101h = xVar5;
            this.f40102i = hVar;
            this.f40103j = ts.p0.M();
            this.f40105l = com.google.android.exoplayer2.audio.a.f39502g;
            this.f40107n = 0;
            this.f40111r = 1;
            this.f40112s = 0;
            this.f40113t = true;
            this.f40114u = br.l0.f17936g;
            this.f40115v = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
            this.f40116w = 15000L;
            this.f40117x = new h.b().a();
            this.f40095b = ts.d.f114979a;
            this.f40118y = 500L;
            this.f40119z = 2000L;
            this.B = true;
        }
    }

    ExoPlaybackException a();

    void c(com.google.android.exoplayer2.source.o oVar);
}
