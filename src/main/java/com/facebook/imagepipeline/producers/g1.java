package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class g1 implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sk.h f21813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0<um.k> f21814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final cn.d f21816e;

    private class a extends u<um.k, um.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f21817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final cn.d f21818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a1 f21819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final g0 f21821g;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g1$a$a, reason: collision with other inner class name */
        class C0438a implements g0.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g1 f21823a;

            C0438a(g1 g1Var) {
                this.f21823a = g1Var;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: X */
            @Override // com.facebook.imagepipeline.producers.g0.d
            public void a(um.k kVar, int i11) throws X {
                if (kVar == null) {
                    a.this.o().b(null, i11);
                } else {
                    a aVar = a.this;
                    aVar.v(kVar, i11, (cn.c) pk.k.g(aVar.f21818d.createImageTranscoder(kVar.I(), a.this.f21817c)));
                }
            }
        }

        class b extends f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g1 f21825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f21826b;

            b(g1 g1Var, n nVar) {
                this.f21825a = g1Var;
                this.f21826b = nVar;
            }

            @Override // com.facebook.imagepipeline.producers.f, com.facebook.imagepipeline.producers.b1
            public void a() {
                if (a.this.f21819e.b0()) {
                    a.this.f21821g.h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.b1
            public void b() {
                a.this.f21821g.c();
                a.this.f21820f = true;
                this.f21826b.a();
            }
        }

        a(n<um.k> nVar, a1 a1Var, boolean z11, cn.d dVar) {
            super(nVar);
            this.f21820f = false;
            this.f21819e = a1Var;
            Boolean boolS = a1Var.B().s();
            this.f21817c = boolS != null ? boolS.booleanValue() : z11;
            this.f21818d = dVar;
            this.f21821g = new g0(g1.this.f21812a, new C0438a(g1.this), 100);
            a1Var.H(new b(g1.this, nVar));
        }

        private um.k A(um.k kVar) {
            return (this.f21819e.B().t().getDeferUntilRendered() || kVar.U2() == 0 || kVar.U2() == -1) ? kVar : x(kVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: Thrown type has an unknown type hierarchy: X */
        public void v(um.k kVar, int i11, cn.c cVar) throws X {
            this.f21819e.p().b(this.f21819e, "ResizeAndRotateProducer");
            com.facebook.imagepipeline.request.a aVarB = this.f21819e.B();
            sk.j jVarB = g1.this.f21813b.b();
            try {
                try {
                    cn.b bVarC = cVar.c(kVar, jVarB, aVarB.t(), aVarB.r(), null, 85, kVar.C());
                    if (bVarC.getTranscodeStatus() == 2) {
                        throw new RuntimeException("Error while transcoding the image");
                    }
                    Map<String, String> mapY = y(kVar, aVarB.r(), bVarC, cVar.getIdentifier());
                    tk.a aVarC0 = tk.a.c0(jVarB.c());
                    try {
                        um.k kVar2 = new um.k((tk.a<PooledByteBuffer>) aVarC0);
                        kVar2.K0(gm.b.JPEG);
                        try {
                            kVar2.w0();
                            this.f21819e.p().j(this.f21819e, "ResizeAndRotateProducer", mapY);
                            if (bVarC.getTranscodeStatus() != 1) {
                                i11 |= 16;
                            }
                            o().b(kVar2, i11);
                            um.k.o(kVar2);
                            tk.a.C(aVarC0);
                            jVarB.close();
                        } catch (Throwable th2) {
                            um.k.o(kVar2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        tk.a.C(aVarC0);
                        throw th3;
                    }
                } catch (Exception e11) {
                    this.f21819e.p().k(this.f21819e, "ResizeAndRotateProducer", e11, null);
                    if (c.d(i11)) {
                        o().onFailure(e11);
                    }
                    jVarB.close();
                }
            } catch (Throwable th4) {
                jVarB.close();
                throw th4;
            }
        }

        private void w(um.k kVar, int i11, gm.c cVar) {
            o().b((cVar == gm.b.JPEG || cVar == gm.b.HEIF) ? A(kVar) : z(kVar), i11);
        }

        private um.k x(um.k kVar, int i11) {
            um.k kVarN = um.k.n(kVar);
            if (kVarN != null) {
                kVarN.O0(i11);
            }
            return kVarN;
        }

        private Map<String, String> y(um.k kVar, om.f fVar, cn.b bVar, String str) {
            String str2;
            if (!this.f21819e.p().f(this.f21819e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = kVar.getWidth() + "x" + kVar.getHeight();
            if (fVar != null) {
                str2 = fVar.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String + "x" + fVar.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String;
            } else {
                str2 = "Unspecified";
            }
            HashMap map = new HashMap();
            map.put("Image format", String.valueOf(kVar.I()));
            map.put("Original size", str3);
            map.put("Requested size", str2);
            map.put("queueTime", String.valueOf(this.f21821g.f()));
            map.put("Transcoder id", str);
            map.put("Transcoding result", String.valueOf(bVar));
            return pk.g.b(map);
        }

        private um.k z(um.k kVar) {
            om.g gVarT = this.f21819e.B().t();
            return (gVarT.j() || !gVarT.i()) ? kVar : x(kVar, gVarT.h());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            if (this.f21820f) {
                return;
            }
            boolean zD = c.d(i11);
            if (kVar == null) {
                if (zD) {
                    o().b(null, 1);
                    return;
                }
                return;
            }
            gm.c cVarI = kVar.I();
            xk.d dVarH = g1.h(this.f21819e.B(), kVar, (cn.c) pk.k.g(this.f21818d.createImageTranscoder(cVarI, this.f21817c)));
            if (zD || dVarH != xk.d.UNSET) {
                if (dVarH != xk.d.YES) {
                    w(kVar, i11, cVarI);
                } else if (this.f21821g.k(kVar, i11)) {
                    if (zD || this.f21819e.b0()) {
                        this.f21821g.h();
                    }
                }
            }
        }
    }

    public g1(Executor executor, sk.h hVar, z0<um.k> z0Var, boolean z11, cn.d dVar) {
        this.f21812a = (Executor) pk.k.g(executor);
        this.f21813b = (sk.h) pk.k.g(hVar);
        this.f21814c = (z0) pk.k.g(z0Var);
        this.f21816e = (cn.d) pk.k.g(dVar);
        this.f21815d = z11;
    }

    private static boolean f(om.g gVar, um.k kVar) {
        if (gVar.getDeferUntilRendered()) {
            return false;
        }
        return cn.e.e(gVar, kVar) != 0 || g(gVar, kVar);
    }

    private static boolean g(om.g gVar, um.k kVar) {
        if (gVar.i() && !gVar.getDeferUntilRendered()) {
            return cn.e.INVERTED_EXIF_ORIENTATIONS.contains(Integer.valueOf(kVar.L0()));
        }
        kVar.H0(0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static xk.d h(com.facebook.imagepipeline.request.a aVar, um.k kVar, cn.c cVar) {
        if (kVar == null || kVar.I() == gm.c.f69215d) {
            return xk.d.UNSET;
        }
        if (cVar.b(kVar.I())) {
            return xk.d.valueOf(f(aVar.t(), kVar) || cVar.d(kVar, aVar.t(), aVar.r()));
        }
        return xk.d.NO;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        this.f21814c.a(new a(nVar, a1Var, this.f21815d, this.f21816e), a1Var);
    }
}
