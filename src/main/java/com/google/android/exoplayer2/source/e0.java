package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.x0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e0 extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ss.l f40433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ss.i.a f40434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u0 f40435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f40436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f40437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f40438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f2 f40439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final x0 f40440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ss.z f40441p;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ss.i.a f40442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.b f40443b = new com.google.android.exoplayer2.upstream.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f40444c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f40445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f40446e;

        public b(ss.i.a aVar) {
            this.f40442a = (ss.i.a) ts.a.e(aVar);
        }

        public e0 a(x0.k kVar, long j11) {
            return new e0(this.f40446e, kVar, this.f40442a, j11, this.f40443b, this.f40444c, this.f40445d);
        }

        public b b(com.google.android.exoplayer2.upstream.b bVar) {
            if (bVar == null) {
                bVar = new com.google.android.exoplayer2.upstream.a();
            }
            this.f40443b = bVar;
            return this;
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public x0 a() {
        return this.f40440o;
    }

    @Override // com.google.android.exoplayer2.source.o
    public void b() {
    }

    @Override // com.google.android.exoplayer2.source.o
    public n g(o.b bVar, ss.b bVar2, long j11) {
        return new d0(this.f40433h, this.f40434i, this.f40441p, this.f40435j, this.f40436k, this.f40437l, s(bVar), this.f40438m);
    }

    @Override // com.google.android.exoplayer2.source.o
    public void i(n nVar) {
        ((d0) nVar).p();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void x(ss.z zVar) {
        this.f40441p = zVar;
        y(this.f40439n);
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void z() {
    }

    private e0(String str, x0.k kVar, ss.i.a aVar, long j11, com.google.android.exoplayer2.upstream.b bVar, boolean z11, Object obj) {
        this.f40434i = aVar;
        this.f40436k = j11;
        this.f40437l = bVar;
        this.f40438m = z11;
        x0 x0VarA = new x0.c().f(Uri.EMPTY).c(kVar.f41292a.toString()).d(com.google.common.collect.x.s(kVar)).e(obj).a();
        this.f40440o = x0VarA;
        u0.b bVarW = new u0.b().g0((String) ou.j.a(kVar.f41293b, "text/x-unknown")).X(kVar.f41294c).i0(kVar.f41295d).e0(kVar.f41296e).W(kVar.f41297f);
        String str2 = kVar.f41298g;
        this.f40435j = bVarW.U(str2 != null ? str2 : str).G();
        this.f40433h = new ss.l.b().h(kVar.f41292a).b(1).a();
        this.f40439n = new es.s(j11, true, false, false, null, x0VarA);
    }
}
