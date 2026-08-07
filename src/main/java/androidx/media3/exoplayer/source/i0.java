package androidx.media3.exoplayer.source;

import android.net.Uri;
import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class i0 extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v7.j f11032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0192a f11033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p7.u f11034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f11035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f11036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final r0 f11038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p7.y f11039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ou.x<t8.b> f11040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v7.q f11041q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0192a f11042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f11043b = new androidx.media3.exoplayer.upstream.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f11044c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f11045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f11046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ou.x<t8.b> f11047f;

        public b(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this.f11042a = (androidx.media3.datasource.a.InterfaceC0192a) s7.a.f(interfaceC0192a);
        }

        public i0 a(p7.y.k kVar, long j11) {
            return new i0(this.f11046e, kVar, this.f11042a, j11, this.f11043b, this.f11044c, this.f11045d, this.f11047f);
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            if (bVar == null) {
                bVar = new androidx.media3.exoplayer.upstream.a();
            }
            this.f11043b = bVar;
            return this;
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void E(v7.q qVar) {
        this.f11041q = qVar;
        F(this.f11038n);
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void G() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public p7.y a() {
        return this.f11039o;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void b() {
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((h0) qVar).w();
    }

    @Override // androidx.media3.exoplayer.source.r
    public q r(r.b bVar, s8.b bVar2, long j11) {
        v7.j jVar = this.f11032h;
        androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a = this.f11033i;
        v7.q qVar = this.f11041q;
        p7.u uVar = this.f11034j;
        long j12 = this.f11035k;
        androidx.media3.exoplayer.upstream.b bVar3 = this.f11036l;
        s.a aVarZ = z(bVar);
        boolean z11 = this.f11037m;
        ou.x<t8.b> xVar = this.f11040p;
        return new h0(jVar, interfaceC0192a, qVar, uVar, j12, bVar3, aVarZ, z11, xVar != null ? xVar.get() : null);
    }

    private i0(String str, p7.y.k kVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, long j11, androidx.media3.exoplayer.upstream.b bVar, boolean z11, Object obj, ou.x<t8.b> xVar) {
        this.f11033i = interfaceC0192a;
        this.f11035k = j11;
        this.f11036l = bVar;
        this.f11037m = z11;
        p7.y yVarA = new p7.y.c().i(Uri.EMPTY).c(kVar.f101810a.toString()).g(com.google.common.collect.x.s(kVar)).h(obj).a();
        this.f11039o = yVarA;
        p7.u.b bVarL0 = new p7.u.b().y0((String) ou.j.a(kVar.f101811b, "text/x-unknown")).n0(kVar.f101812c).A0(kVar.f101813d).w0(kVar.f101814e).l0(kVar.f101815f);
        String str2 = kVar.f101816g;
        this.f11034j = bVarL0.j0(str2 != null ? str2 : str).P();
        this.f11032h = new v7.j.b().i(kVar.f101810a).b(1).a();
        this.f11038n = new n8.u(j11, true, false, false, null, yVarA);
        this.f11040p = xVar;
    }
}
