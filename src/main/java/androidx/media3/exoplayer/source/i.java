package androidx.media3.exoplayer.source;

import android.content.Context;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import s7.q0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f11007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.a.InterfaceC0192a f11008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t9.q.a f11009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r.a f11010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f11011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o8.a.InterfaceC2069a f11012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private p7.c f11013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f11014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f11015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f11016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f11017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f11018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f11019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11020p;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w8.u f11021a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.datasource.a.InterfaceC0192a f11024d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private t9.q.a f11026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f11027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private s8.e.a f11028h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private e8.k f11029i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f11030j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, ou.x<r.a>> f11022b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Integer, r.a> f11023c = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11025e = true;

        public a(w8.u uVar, t9.q.a aVar) {
            this.f11021a = uVar;
            this.f11026f = aVar;
        }

        public static /* synthetic */ r.a c(a aVar, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            aVar.getClass();
            return new c0.b(interfaceC0192a, aVar.f11021a);
        }

        private ou.x<r.a> g(int i11) {
            ou.x<r.a> xVar;
            ou.x<r.a> xVar2;
            ou.x<r.a> xVar3 = this.f11022b.get(Integer.valueOf(i11));
            if (xVar3 != null) {
                return xVar3;
            }
            final androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a = (androidx.media3.datasource.a.InterfaceC0192a) s7.a.f(this.f11024d);
            if (i11 == 0) {
                int i12 = DashMediaSource.Factory.f9596l;
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(r.a.class);
                xVar = new ou.x() { // from class: androidx.media3.exoplayer.source.d
                    @Override // ou.x
                    public final Object get() {
                        return i.p(clsAsSubclass, interfaceC0192a);
                    }
                };
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i13 = HlsMediaSource.Factory.f9921s;
                        final Class clsAsSubclass2 = HlsMediaSource.Factory.class.asSubclass(r.a.class);
                        xVar = new ou.x() { // from class: androidx.media3.exoplayer.source.f
                            @Override // ou.x
                            public final Object get() {
                                return i.p(clsAsSubclass2, interfaceC0192a);
                            }
                        };
                    } else if (i11 == 3) {
                        int i14 = RtspMediaSource$Factory.f10647c;
                        final Class clsAsSubclass3 = RtspMediaSource$Factory.class.asSubclass(r.a.class);
                        xVar2 = new ou.x() { // from class: androidx.media3.exoplayer.source.g
                            @Override // ou.x
                            public final Object get() {
                                return i.o(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i11 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i11);
                        }
                        xVar2 = new ou.x() { // from class: androidx.media3.exoplayer.source.h
                            @Override // ou.x
                            public final Object get() {
                                return i.a.c(this.f10984a, interfaceC0192a);
                            }
                        };
                    }
                    this.f11022b.put(Integer.valueOf(i11), xVar2);
                    return xVar2;
                }
                int i15 = SsMediaSource.Factory.f10691k;
                final Class clsAsSubclass4 = SsMediaSource.Factory.class.asSubclass(r.a.class);
                xVar = new ou.x() { // from class: androidx.media3.exoplayer.source.e
                    @Override // ou.x
                    public final Object get() {
                        return i.p(clsAsSubclass4, interfaceC0192a);
                    }
                };
            }
            xVar2 = xVar;
            this.f11022b.put(Integer.valueOf(i11), xVar2);
            return xVar2;
        }

        public r.a f(int i11) {
            r.a aVar = this.f11023c.get(Integer.valueOf(i11));
            if (aVar != null) {
                return aVar;
            }
            r.a aVar2 = g(i11).get();
            s8.e.a aVar3 = this.f11028h;
            if (aVar3 != null) {
                aVar2.e(aVar3);
            }
            e8.k kVar = this.f11029i;
            if (kVar != null) {
                aVar2.d(kVar);
            }
            androidx.media3.exoplayer.upstream.b bVar = this.f11030j;
            if (bVar != null) {
                aVar2.f(bVar);
            }
            aVar2.a(this.f11026f);
            aVar2.b(this.f11025e);
            aVar2.c(this.f11027g);
            this.f11023c.put(Integer.valueOf(i11), aVar2);
            return aVar2;
        }

        public void h(s8.e.a aVar) {
            this.f11028h = aVar;
            Iterator<r.a> it = this.f11023c.values().iterator();
            while (it.hasNext()) {
                it.next().e(aVar);
            }
        }

        public void i(int i11) {
            this.f11027g = i11;
            this.f11021a.c(i11);
        }

        public void j(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
            if (interfaceC0192a != this.f11024d) {
                this.f11024d = interfaceC0192a;
                this.f11022b.clear();
                this.f11023c.clear();
            }
        }

        public void k(e8.k kVar) {
            this.f11029i = kVar;
            Iterator<r.a> it = this.f11023c.values().iterator();
            while (it.hasNext()) {
                it.next().d(kVar);
            }
        }

        public void l(int i11) {
            w8.u uVar = this.f11021a;
            if (uVar instanceof w8.m) {
                ((w8.m) uVar).n(i11);
            }
        }

        public void m(androidx.media3.exoplayer.upstream.b bVar) {
            this.f11030j = bVar;
            Iterator<r.a> it = this.f11023c.values().iterator();
            while (it.hasNext()) {
                it.next().f(bVar);
            }
        }

        public void n(boolean z11) {
            this.f11025e = z11;
            this.f11021a.e(z11);
            Iterator<r.a> it = this.f11023c.values().iterator();
            while (it.hasNext()) {
                it.next().b(z11);
            }
        }

        public void o(t9.q.a aVar) {
            this.f11026f = aVar;
            this.f11021a.a(aVar);
            Iterator<r.a> it = this.f11023c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final class b implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p7.u f11031a;

        public b(p7.u uVar) {
            this.f11031a = uVar;
        }

        @Override // w8.p
        public void a(long j11, long j12) {
        }

        @Override // w8.p
        public void e(w8.r rVar) {
            o0 o0VarB = rVar.b(0, 3);
            rVar.t(new w8.j0.b(-9223372036854775807L));
            rVar.j();
            o0VarB.g(this.f11031a.b().y0("text/x-unknown").U(this.f11031a.f101544o).P());
        }

        @Override // w8.p
        public int h(w8.q qVar, w8.i0 i0Var) {
            return qVar.a(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // w8.p
        public boolean l(w8.q qVar) {
            return true;
        }

        @Override // w8.p
        public void release() {
        }
    }

    public i(Context context, w8.u uVar) {
        this(new androidx.media3.datasource.c.a(context), uVar);
    }

    public static /* synthetic */ w8.p[] h(i iVar, p7.u uVar) {
        return new w8.p[]{iVar.f11009e.b(uVar) ? new t9.m(iVar.f11009e.c(uVar), null) : new b(uVar)};
    }

    private static r m(p7.y yVar, r rVar) {
        p7.y.d dVar = yVar.f101686f;
        return (dVar.f101718b == 0 && dVar.f101720d == Long.MIN_VALUE && !dVar.f101722f) ? rVar : new ClippingMediaSource.b(rVar).n(yVar.f101686f.f101718b).l(yVar.f101686f.f101720d).k(!yVar.f101686f.f101723g).i(yVar.f101686f.f101721e).m(yVar.f101686f.f101722f).j(yVar.f101686f.f101724h).h();
    }

    private r n(p7.y yVar, r rVar) {
        s7.a.f(yVar.f101682b);
        p7.y.b bVar = yVar.f101682b.f101786d;
        if (bVar == null) {
            return rVar;
        }
        o8.a.InterfaceC2069a interfaceC2069a = this.f11012h;
        p7.c cVar = this.f11013i;
        if (interfaceC2069a == null || cVar == null) {
            s7.t.i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return rVar;
        }
        interfaceC2069a.a(bVar);
        s7.t.i("DMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a o(Class<? extends r.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a p(Class<? extends r.a> cls, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
        try {
            return cls.getConstructor(androidx.media3.datasource.a.InterfaceC0192a.class).newInstance(interfaceC0192a);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    public r g(p7.y yVar) {
        s7.a.f(yVar.f101682b);
        String scheme = yVar.f101682b.f101783a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((r.a) s7.a.f(this.f11010f)).g(yVar);
        }
        if (Objects.equals(yVar.f101682b.f101784b, "application/x-image-uri")) {
            return new l.b(q0.b1(yVar.f101682b.f101792j), (j) s7.a.f(this.f11011g)).g(yVar);
        }
        p7.y.h hVar = yVar.f101682b;
        int iL0 = q0.L0(hVar.f101783a, hVar.f101784b);
        if (yVar.f101682b.f101792j != -9223372036854775807L) {
            this.f11007c.l(1);
        }
        try {
            r.a aVarF = this.f11007c.f(iL0);
            p7.y.g.a aVarA = yVar.f101684d.a();
            if (yVar.f101684d.f101765a == -9223372036854775807L) {
                aVarA.k(this.f11015k);
            }
            if (yVar.f101684d.f101768d == -3.4028235E38f) {
                aVarA.j(this.f11018n);
            }
            if (yVar.f101684d.f101769e == -3.4028235E38f) {
                aVarA.h(this.f11019o);
            }
            if (yVar.f101684d.f101766b == -9223372036854775807L) {
                aVarA.i(this.f11016l);
            }
            if (yVar.f101684d.f101767c == -9223372036854775807L) {
                aVarA.g(this.f11017m);
            }
            p7.y.g gVarF = aVarA.f();
            if (!gVarF.equals(yVar.f101684d)) {
                yVar = yVar.a().b(gVarF).a();
            }
            r rVarG = aVarF.g(yVar);
            com.google.common.collect.x<p7.y.k> xVar = ((p7.y.h) q0.l(yVar.f101682b)).f101789g;
            if (!xVar.isEmpty()) {
                r[] rVarArr = new r[xVar.size() + 1];
                rVarArr[0] = rVarG;
                for (int i11 = 0; i11 < xVar.size(); i11++) {
                    if (this.f11020p) {
                        final p7.u uVarP = new p7.u.b().y0(xVar.get(i11).f101811b).n0(xVar.get(i11).f101812c).A0(xVar.get(i11).f101813d).w0(xVar.get(i11).f101814e).l0(xVar.get(i11).f101815f).j0(xVar.get(i11).f101816g).P();
                        c0.b bVar = new c0.b(this.f11008d, new w8.u() { // from class: n8.g
                            @Override // w8.u
                            public final w8.p[] d() {
                                return androidx.media3.exoplayer.source.i.h(this.f93554b, uVarP);
                            }
                        });
                        if (this.f11009e.b(uVarP)) {
                            uVarP = uVarP.b().y0("application/x-media3-cues").U(uVarP.f101544o).Y(this.f11009e.a(uVarP)).P();
                        }
                        c0.b bVarJ = bVar.j(0, uVarP);
                        androidx.media3.exoplayer.upstream.b bVar2 = this.f11014j;
                        if (bVar2 != null) {
                            bVarJ.f(bVar2);
                        }
                        rVarArr[i11 + 1] = bVarJ.g(p7.y.d(xVar.get(i11).f101810a.toString()));
                    } else {
                        i0.b bVar3 = new i0.b(this.f11008d);
                        androidx.media3.exoplayer.upstream.b bVar4 = this.f11014j;
                        if (bVar4 != null) {
                            bVar3.b(bVar4);
                        }
                        rVarArr[i11 + 1] = bVar3.a(xVar.get(i11), -9223372036854775807L);
                    }
                }
                rVarG = new MergingMediaSource(rVarArr);
            }
            return n(yVar, m(yVar, rVarG));
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    @Deprecated
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public i b(boolean z11) {
        this.f11020p = z11;
        this.f11007c.n(z11);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i c(int i11) {
        this.f11007c.i(i11);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public i e(s8.e.a aVar) {
        this.f11007c.h((s8.e.a) s7.a.f(aVar));
        return this;
    }

    public i r(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
        this.f11008d = interfaceC0192a;
        this.f11007c.j(interfaceC0192a);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public i d(e8.k kVar) {
        this.f11007c.k((e8.k) s7.a.g(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public i f(androidx.media3.exoplayer.upstream.b bVar) {
        this.f11014j = (androidx.media3.exoplayer.upstream.b) s7.a.g(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f11007c.m(bVar);
        return this;
    }

    public i u(o8.a.InterfaceC2069a interfaceC2069a, p7.c cVar) {
        this.f11012h = (o8.a.InterfaceC2069a) s7.a.f(interfaceC2069a);
        this.f11013i = (p7.c) s7.a.f(cVar);
        return this;
    }

    public i v(r.a aVar) {
        this.f11010f = aVar;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public i a(t9.q.a aVar) {
        this.f11009e = (t9.q.a) s7.a.f(aVar);
        this.f11007c.o(aVar);
        return this;
    }

    public i(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
        this(interfaceC0192a, new w8.m());
    }

    public i(androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a, w8.u uVar) {
        this.f11008d = interfaceC0192a;
        t9.g gVar = new t9.g();
        this.f11009e = gVar;
        a aVar = new a(uVar, gVar);
        this.f11007c = aVar;
        aVar.j(interfaceC0192a);
        this.f11015k = -9223372036854775807L;
        this.f11016l = -9223372036854775807L;
        this.f11017m = -9223372036854775807L;
        this.f11018n = -3.4028235E38f;
        this.f11019o = -3.4028235E38f;
        this.f11020p = true;
    }
}
