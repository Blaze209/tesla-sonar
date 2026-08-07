package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class k implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nm.x<jk.d, PooledByteBuffer> f21858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pk.n<pm.c> f21859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nm.k f21860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z0<tk.a<um.e>> f21861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nm.d<jk.d> f21862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nm.d<jk.d> f21863f;

    private static class a extends u<tk.a<um.e>, tk.a<um.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a1 f21864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final nm.x<jk.d, PooledByteBuffer> f21865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final pk.n<pm.c> f21866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final nm.k f21867f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final nm.d<jk.d> f21868g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final nm.d<jk.d> f21869h;

        public a(n<tk.a<um.e>> nVar, a1 a1Var, nm.x<jk.d, PooledByteBuffer> xVar, pk.n<pm.c> nVar2, nm.k kVar, nm.d<jk.d> dVar, nm.d<jk.d> dVar2) {
            super(nVar);
            this.f21864c = a1Var;
            this.f21865d = xVar;
            this.f21866e = nVar2;
            this.f21867f = kVar;
            this.f21868g = dVar;
            this.f21869h = dVar2;
        }

        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(tk.a<um.e> aVar, int i11) {
            boolean zD;
            try {
                if (bn.b.d()) {
                    bn.b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!c.e(i11) && aVar != null && !c.l(i11, 8)) {
                    com.facebook.imagepipeline.request.a aVarB = this.f21864c.B();
                    jk.d dVarB = this.f21867f.b(aVarB, this.f21864c.c());
                    String str = (String) this.f21864c.e0("origin");
                    if (str != null && str.equals("memory_bitmap")) {
                        if (this.f21864c.n().getExperiments().getIsEncodedMemoryCacheProbingEnabled() && !this.f21868g.b(dVarB)) {
                            this.f21865d.b(dVarB);
                            this.f21868g.a(dVarB);
                        }
                        if (this.f21864c.n().getExperiments().getIsDiskCacheProbingEnabled() && !this.f21869h.b(dVarB)) {
                            boolean z11 = aVarB.c() == com.facebook.imagepipeline.request.a.b.SMALL;
                            pm.c cVar = this.f21866e.get();
                            (z11 ? cVar.a() : cVar.b()).f(dVarB);
                            this.f21869h.a(dVarB);
                        }
                    }
                    o().b(aVar, i11);
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
                o().b(aVar, i11);
            } finally {
                if (bn.b.d()) {
                    bn.b.b();
                }
            }
        }
    }

    public k(nm.x<jk.d, PooledByteBuffer> xVar, pk.n<pm.c> nVar, nm.k kVar, nm.d<jk.d> dVar, nm.d<jk.d> dVar2, z0<tk.a<um.e>> z0Var) {
        this.f21858a = xVar;
        this.f21859b = nVar;
        this.f21860c = kVar;
        this.f21862e = dVar;
        this.f21863f = dVar2;
        this.f21861d = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> nVar, a1 a1Var) {
        try {
            if (bn.b.d()) {
                bn.b.a("BitmapProbeProducer#produceResults");
            }
            c1 c1VarP = a1Var.p();
            c1VarP.b(a1Var, c());
            a aVar = new a(nVar, a1Var, this.f21858a, this.f21859b, this.f21860c, this.f21862e, this.f21863f);
            c1VarP.j(a1Var, "BitmapProbeProducer", null);
            if (bn.b.d()) {
                bn.b.a("mInputProducer.produceResult");
            }
            this.f21861d.a(aVar, a1Var);
            if (bn.b.d()) {
                bn.b.b();
            }
        } finally {
            if (bn.b.d()) {
                bn.b.b();
            }
        }
    }

    protected String c() {
        return "BitmapProbeProducer";
    }
}
