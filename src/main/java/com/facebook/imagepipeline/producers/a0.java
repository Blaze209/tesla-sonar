package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class a0 implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pk.n<pm.c> f21743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.k f21744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0<um.k> f21745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nm.d<jk.d> f21746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nm.d<jk.d> f21747e;

    private static class a extends u<um.k, um.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a1 f21748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final pk.n<pm.c> f21749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final nm.k f21750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final nm.d<jk.d> f21751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final nm.d<jk.d> f21752g;

        public a(n<um.k> nVar, a1 a1Var, pk.n<pm.c> nVar2, nm.k kVar, nm.d<jk.d> dVar, nm.d<jk.d> dVar2) {
            super(nVar);
            this.f21748c = a1Var;
            this.f21749d = nVar2;
            this.f21750e = kVar;
            this.f21751f = dVar;
            this.f21752g = dVar2;
        }

        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            boolean zD;
            try {
                if (bn.b.d()) {
                    bn.b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!c.e(i11) && kVar != null && !c.l(i11, 10) && kVar.I() != gm.c.f69215d) {
                    com.facebook.imagepipeline.request.a aVarB = this.f21748c.B();
                    jk.d dVarB = this.f21750e.b(aVarB, this.f21748c.c());
                    this.f21751f.a(dVarB);
                    if ("memory_encoded".equals(this.f21748c.e0("origin"))) {
                        if (!this.f21752g.b(dVarB)) {
                            boolean z11 = aVarB.c() == com.facebook.imagepipeline.request.a.b.SMALL;
                            pm.c cVar = this.f21749d.get();
                            (z11 ? cVar.a() : cVar.b()).f(dVarB);
                            this.f21752g.a(dVarB);
                        }
                    } else if ("disk".equals(this.f21748c.e0("origin"))) {
                        this.f21752g.a(dVarB);
                    }
                    o().b(kVar, i11);
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
                o().b(kVar, i11);
            } finally {
                if (bn.b.d()) {
                    bn.b.b();
                }
            }
        }
    }

    public a0(pk.n<pm.c> nVar, nm.k kVar, nm.d dVar, nm.d dVar2, z0<um.k> z0Var) {
        this.f21743a = nVar;
        this.f21744b = kVar;
        this.f21746d = dVar;
        this.f21747e = dVar2;
        this.f21745c = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        try {
            if (bn.b.d()) {
                bn.b.a("EncodedProbeProducer#produceResults");
            }
            c1 c1VarP = a1Var.p();
            c1VarP.b(a1Var, c());
            a aVar = new a(nVar, a1Var, this.f21743a, this.f21744b, this.f21746d, this.f21747e);
            c1VarP.j(a1Var, "EncodedProbeProducer", null);
            if (bn.b.d()) {
                bn.b.a("mInputProducer.produceResult");
            }
            this.f21745c.a(aVar, a1Var);
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
        return "EncodedProbeProducer";
    }
}
