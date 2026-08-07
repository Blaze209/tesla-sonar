package androidx.media3.exoplayer.source;

import a8.o2;
import android.net.Uri;
import android.os.Looper;
import androidx.media3.exoplayer.source.c0;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p7.r0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends androidx.media3.exoplayer.source.a implements b0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0192a f10912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w.a f10913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f10914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f10915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f10916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f10917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p7.u f10918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ou.x<t8.b> f10919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f10921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private v7.q f10924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p7.y f10925u;

    class a extends m {
        a(r0 r0Var) {
            super(r0Var);
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.b k(int i11, r0.b bVar, boolean z11) {
            super.k(i11, bVar, z11);
            bVar.f101465f = true;
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, p7.r0
        public r0.d s(int i11, r0.d dVar, long j11) {
            super.s(i11, dVar, j11);
            dVar.f101491k = true;
            return dVar;
        }
    }

    public static final class b implements t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.media3.datasource.a.InterfaceC0192a f10927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private w.a f10928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private e8.k f10929e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f10930f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10931g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ou.x<t8.b> f10932h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10933i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private p7.u f10934j;

        public b(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            this(interfaceC0192a, new w8.m());
        }

        public static /* synthetic */ w h(w8.u uVar, o2 o2Var) {
            return new n8.b(uVar);
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c0 g(p7.y yVar) {
            s7.a.f(yVar.f101682b);
            return new c0(yVar, this.f10927c, this.f10928d, this.f10929e.a(yVar), this.f10930f, this.f10931g, this.f10933i, this.f10934j, this.f10932h, null);
        }

        b j(int i11, p7.u uVar) {
            this.f10933i = i11;
            this.f10934j = (p7.u) s7.a.f(uVar);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b d(e8.k kVar) {
            this.f10929e = (e8.k) s7.a.g(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.r.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b f(androidx.media3.exoplayer.upstream.b bVar) {
            this.f10930f = (androidx.media3.exoplayer.upstream.b) s7.a.g(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        public b(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, final w8.u uVar) {
            this(interfaceC0192a, new w.a() { // from class: n8.r
                @Override // androidx.media3.exoplayer.source.w.a
                public final androidx.media3.exoplayer.source.w a(o2 o2Var) {
                    return c0.b.h(uVar, o2Var);
                }
            });
        }

        public b(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, w.a aVar) {
            this(interfaceC0192a, aVar, new androidx.media3.exoplayer.drm.g(), new androidx.media3.exoplayer.upstream.a(), PKIFailureInfo.badCertTemplate);
        }

        public b(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, w.a aVar, e8.k kVar, androidx.media3.exoplayer.upstream.b bVar, int i11) {
            this.f10927c = interfaceC0192a;
            this.f10928d = aVar;
            this.f10929e = kVar;
            this.f10930f = bVar;
            this.f10931g = i11;
        }
    }

    /* synthetic */ c0(p7.y yVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, w.a aVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i11, int i12, p7.u uVar, ou.x xVar, a aVar2) {
        this(yVar, interfaceC0192a, aVar, iVar, bVar, i11, i12, uVar, xVar);
    }

    private p7.y.h H() {
        return (p7.y.h) s7.a.f(a().f101682b);
    }

    private void I() {
        r0 uVar = new n8.u(this.f10921q, this.f10922r, false, this.f10923s, null, a());
        if (this.f10920p) {
            uVar = new a(uVar);
        }
        F(uVar);
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void E(v7.q qVar) {
        this.f10924t = qVar;
        this.f10914j.f((Looper) s7.a.f(Looper.myLooper()), C());
        this.f10914j.b();
        I();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void G() {
        this.f10914j.release();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized p7.y a() {
        return this.f10925u;
    }

    @Override // androidx.media3.exoplayer.source.r
    public void b() {
    }

    @Override // androidx.media3.exoplayer.source.b0.c
    public void g(long j11, w8.j0 j0Var, boolean z11) {
        if (j11 == -9223372036854775807L) {
            j11 = this.f10921q;
        }
        boolean zD = j0Var.d();
        if (!this.f10920p && this.f10921q == j11 && this.f10922r == zD && this.f10923s == z11) {
            return;
        }
        this.f10921q = j11;
        this.f10922r = zD;
        this.f10923s = z11;
        this.f10920p = false;
        I();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((b0) qVar).f0();
    }

    @Override // androidx.media3.exoplayer.source.r
    public synchronized void i(p7.y yVar) {
        this.f10925u = yVar;
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean k(p7.y yVar) {
        p7.y.h hVarH = H();
        p7.y.h hVar = yVar.f101682b;
        return hVar != null && hVar.f101783a.equals(hVarH.f101783a) && hVar.f101792j == hVarH.f101792j && Objects.equals(hVar.f101788f, hVarH.f101788f);
    }

    @Override // androidx.media3.exoplayer.source.r
    public q r(r.b bVar, s8.b bVar2, long j11) {
        androidx.media3.datasource.a aVarA = this.f10912h.a();
        v7.q qVar = this.f10924t;
        if (qVar != null) {
            aVarA.n(qVar);
        }
        p7.y.h hVarH = H();
        Uri uri = hVarH.f101783a;
        w wVarA = this.f10913i.a(C());
        androidx.media3.exoplayer.drm.i iVar = this.f10914j;
        androidx.media3.exoplayer.drm.h.a aVarX = x(bVar);
        androidx.media3.exoplayer.upstream.b bVar3 = this.f10915k;
        s.a aVarZ = z(bVar);
        String str = hVarH.f101788f;
        int i11 = this.f10916l;
        int i12 = this.f10917m;
        p7.u uVar = this.f10918n;
        long jB1 = q0.b1(hVarH.f101792j);
        ou.x<t8.b> xVar = this.f10919o;
        return new b0(uri, aVarA, wVarA, iVar, aVarX, bVar3, aVarZ, this, bVar2, str, i11, i12, uVar, jB1, xVar != null ? xVar.get() : null);
    }

    private c0(p7.y yVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, w.a aVar, androidx.media3.exoplayer.drm.i iVar, androidx.media3.exoplayer.upstream.b bVar, int i11, int i12, p7.u uVar, ou.x<t8.b> xVar) {
        this.f10925u = yVar;
        this.f10912h = interfaceC0192a;
        this.f10913i = aVar;
        this.f10914j = iVar;
        this.f10915k = bVar;
        this.f10916l = i11;
        this.f10918n = uVar;
        this.f10917m = i12;
        this.f10920p = true;
        this.f10921q = -9223372036854775807L;
        this.f10919o = xVar;
    }
}
