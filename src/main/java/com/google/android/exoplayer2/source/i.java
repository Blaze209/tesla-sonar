package com.google.android.exoplayer2.source;

import android.content.Context;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.x0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i implements q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f40457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ss.i.a f40458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f40459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.exoplayer2.upstream.b f40460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f40461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f40462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f40464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f40465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f40466l;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final hr.p f40467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Integer, ou.x<o.a>> f40468b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<Integer> f40469c = new HashSet();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map<Integer, o.a> f40470d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ss.i.a f40471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ss.f f40472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private gr.k f40473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.b f40474h;

        public a(hr.p pVar) {
            this.f40467a = pVar;
        }

        public static /* synthetic */ o.a d(a aVar, ss.i.a aVar2) {
            aVar.getClass();
            return new y.b(aVar2, aVar.f40467a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0086  */
        private ou.x<o.a> g(int i11) {
            ou.x<o.a> xVar;
            ou.x<o.a> xVar2;
            if (this.f40468b.containsKey(Integer.valueOf(i11))) {
                return this.f40468b.get(Integer.valueOf(i11));
            }
            final ss.i.a aVar = (ss.i.a) ts.a.e(this.f40471e);
            ou.x<o.a> xVar3 = null;
            try {
                if (i11 == 0) {
                    final Class<? extends U> clsAsSubclass = Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(o.a.class);
                    xVar = new ou.x() { // from class: com.google.android.exoplayer2.source.d
                        @Override // ou.x
                        public final Object get() {
                            return i.k(clsAsSubclass, aVar);
                        }
                    };
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                final Class<? extends U> clsAsSubclass2 = Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(o.a.class);
                                xVar2 = new ou.x() { // from class: com.google.android.exoplayer2.source.g
                                    @Override // ou.x
                                    public final Object get() {
                                        return i.j(clsAsSubclass2);
                                    }
                                };
                            } else if (i11 == 4) {
                                xVar2 = new ou.x() { // from class: com.google.android.exoplayer2.source.h
                                    @Override // ou.x
                                    public final Object get() {
                                        return i.a.d(this.f40455a, aVar);
                                    }
                                };
                            }
                            xVar3 = xVar2;
                        } else {
                            final Class<? extends U> clsAsSubclass3 = Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(o.a.class);
                            xVar = new ou.x() { // from class: com.google.android.exoplayer2.source.f
                                @Override // ou.x
                                public final Object get() {
                                    return i.k(clsAsSubclass3, aVar);
                                }
                            };
                        }
                        this.f40468b.put(Integer.valueOf(i11), xVar3);
                        if (xVar3 != null) {
                            this.f40469c.add(Integer.valueOf(i11));
                        }
                        return xVar3;
                    }
                    final Class<? extends U> clsAsSubclass4 = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(o.a.class);
                    xVar = new ou.x() { // from class: com.google.android.exoplayer2.source.e
                        @Override // ou.x
                        public final Object get() {
                            return i.k(clsAsSubclass4, aVar);
                        }
                    };
                }
                xVar3 = xVar;
            } catch (ClassNotFoundException unused) {
            }
            this.f40468b.put(Integer.valueOf(i11), xVar3);
            if (xVar3 != null) {
                this.f40469c.add(Integer.valueOf(i11));
            }
            return xVar3;
        }

        public o.a f(int i11) {
            o.a aVar = this.f40470d.get(Integer.valueOf(i11));
            if (aVar != null) {
                return aVar;
            }
            ou.x<o.a> xVarG = g(i11);
            if (xVarG == null) {
                return null;
            }
            o.a aVar2 = xVarG.get();
            ss.f fVar = this.f40472f;
            if (fVar != null) {
                aVar2.d(fVar);
            }
            gr.k kVar = this.f40473g;
            if (kVar != null) {
                aVar2.c(kVar);
            }
            com.google.android.exoplayer2.upstream.b bVar = this.f40474h;
            if (bVar != null) {
                aVar2.a(bVar);
            }
            this.f40470d.put(Integer.valueOf(i11), aVar2);
            return aVar2;
        }

        public void h(ss.f fVar) {
            this.f40472f = fVar;
            Iterator<o.a> it = this.f40470d.values().iterator();
            while (it.hasNext()) {
                it.next().d(fVar);
            }
        }

        public void i(ss.i.a aVar) {
            if (aVar != this.f40471e) {
                this.f40471e = aVar;
                this.f40468b.clear();
                this.f40470d.clear();
            }
        }

        public void j(gr.k kVar) {
            this.f40473g = kVar;
            Iterator<o.a> it = this.f40470d.values().iterator();
            while (it.hasNext()) {
                it.next().c(kVar);
            }
        }

        public void k(com.google.android.exoplayer2.upstream.b bVar) {
            this.f40474h = bVar;
            Iterator<o.a> it = this.f40470d.values().iterator();
            while (it.hasNext()) {
                it.next().a(bVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final class b implements hr.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u0 f40475a;

        public b(u0 u0Var) {
            this.f40475a = u0Var;
        }

        @Override // hr.k
        public void a(long j11, long j12) {
        }

        @Override // hr.k
        public void e(hr.m mVar) {
            hr.b0 b0VarB = mVar.b(0, 3);
            mVar.p(new hr.z.b(-9223372036854775807L));
            mVar.j();
            b0VarB.b(this.f40475a.b().g0("text/x-unknown").K(this.f40475a.f40712l).G());
        }

        @Override // hr.k
        public boolean h(hr.l lVar) {
            return true;
        }

        @Override // hr.k
        public int i(hr.l lVar, hr.y yVar) {
            return lVar.a(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // hr.k
        public void release() {
        }
    }

    public i(Context context) {
        this(new ss.p.a(context));
    }

    public static /* synthetic */ hr.k[] e(u0 u0Var) {
        gs.k kVar = gs.k.f69523a;
        return new hr.k[]{kVar.b(u0Var) ? new gs.l(kVar.a(u0Var), u0Var) : new b(u0Var)};
    }

    private static o h(x0 x0Var, o oVar) {
        x0.d dVar = x0Var.f41171f;
        if (dVar.f41200a == 0 && dVar.f41201b == Long.MIN_VALUE && !dVar.f41203d) {
            return oVar;
        }
        long jD0 = p0.D0(x0Var.f41171f.f41200a);
        long jD1 = p0.D0(x0Var.f41171f.f41201b);
        x0.d dVar2 = x0Var.f41171f;
        return new ClippingMediaSource(oVar, jD0, jD1, !dVar2.f41204e, dVar2.f41202c, dVar2.f41203d);
    }

    private o i(x0 x0Var, o oVar) {
        ts.a.e(x0Var.f41167b);
        if (x0Var.f41167b.f41267d == null) {
            return oVar;
        }
        ts.u.i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o.a j(Class<? extends o.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o.a k(Class<? extends o.a> cls, ss.i.a aVar) {
        try {
            return cls.getConstructor(ss.i.a.class).newInstance(aVar);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // com.google.android.exoplayer2.source.o.a
    public o b(x0 x0Var) {
        ts.a.e(x0Var.f41167b);
        String scheme = x0Var.f41167b.f41264a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((o.a) ts.a.e(this.f40459e)).b(x0Var);
        }
        x0.h hVar = x0Var.f41167b;
        int iR0 = p0.r0(hVar.f41264a, hVar.f41265b);
        o.a aVarF = this.f40457c.f(iR0);
        ts.a.j(aVarF, "No suitable media source factory found for content type: " + iR0);
        x0.g.a aVarB = x0Var.f41169d.b();
        if (x0Var.f41169d.f41246a == -9223372036854775807L) {
            aVarB.k(this.f40461g);
        }
        if (x0Var.f41169d.f41249d == -3.4028235E38f) {
            aVarB.j(this.f40464j);
        }
        if (x0Var.f41169d.f41250e == -3.4028235E38f) {
            aVarB.h(this.f40465k);
        }
        if (x0Var.f41169d.f41247b == -9223372036854775807L) {
            aVarB.i(this.f40462h);
        }
        if (x0Var.f41169d.f41248c == -9223372036854775807L) {
            aVarB.g(this.f40463i);
        }
        x0.g gVarF = aVarB.f();
        if (!gVarF.equals(x0Var.f41169d)) {
            x0Var = x0Var.b().b(gVarF).a();
        }
        o oVarB = aVarF.b(x0Var);
        com.google.common.collect.x<x0.k> xVar = ((x0.h) p0.j(x0Var.f41167b)).f41270g;
        if (!xVar.isEmpty()) {
            o[] oVarArr = new o[xVar.size() + 1];
            oVarArr[0] = oVarB;
            for (int i11 = 0; i11 < xVar.size(); i11++) {
                if (this.f40466l) {
                    final u0 u0VarG = new u0.b().g0(xVar.get(i11).f41293b).X(xVar.get(i11).f41294c).i0(xVar.get(i11).f41295d).e0(xVar.get(i11).f41296e).W(xVar.get(i11).f41297f).U(xVar.get(i11).f41298g).G();
                    y.b bVar = new y.b(this.f40458d, new hr.p() { // from class: es.f
                        @Override // hr.p
                        public final hr.k[] d() {
                            return com.google.android.exoplayer2.source.i.e(u0VarG);
                        }
                    });
                    com.google.android.exoplayer2.upstream.b bVar2 = this.f40460f;
                    if (bVar2 != null) {
                        bVar.a(bVar2);
                    }
                    oVarArr[i11 + 1] = bVar.b(x0.e(xVar.get(i11).f41292a.toString()));
                } else {
                    e0.b bVar3 = new e0.b(this.f40458d);
                    com.google.android.exoplayer2.upstream.b bVar4 = this.f40460f;
                    if (bVar4 != null) {
                        bVar3.b(bVar4);
                    }
                    oVarArr[i11 + 1] = bVar3.a(xVar.get(i11), -9223372036854775807L);
                }
            }
            oVarB = new MergingMediaSource(oVarArr);
        }
        return i(x0Var, h(x0Var, oVarB));
    }

    @Override // com.google.android.exoplayer2.source.o.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public i d(ss.f fVar) {
        this.f40457c.h((ss.f) ts.a.e(fVar));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.o.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i c(gr.k kVar) {
        this.f40457c.j((gr.k) ts.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // com.google.android.exoplayer2.source.o.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i a(com.google.android.exoplayer2.upstream.b bVar) {
        this.f40460f = (com.google.android.exoplayer2.upstream.b) ts.a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f40457c.k(bVar);
        return this;
    }

    public i(Context context, hr.p pVar) {
        this(new ss.p.a(context), pVar);
    }

    public i(ss.i.a aVar) {
        this(aVar, new hr.h());
    }

    public i(ss.i.a aVar, hr.p pVar) {
        this.f40458d = aVar;
        a aVar2 = new a(pVar);
        this.f40457c = aVar2;
        aVar2.i(aVar);
        this.f40461g = -9223372036854775807L;
        this.f40462h = -9223372036854775807L;
        this.f40463i = -9223372036854775807L;
        this.f40464j = -3.4028235E38f;
        this.f40465k = -3.4028235E38f;
    }
}
