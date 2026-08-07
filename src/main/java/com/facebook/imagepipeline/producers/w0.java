package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class w0 implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nm.x<jk.d, um.e> f22018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.k f22019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0<tk.a<um.e>> f22020c;

    public static class a extends u<tk.a<um.e>, tk.a<um.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final jk.d f22021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f22022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final nm.x<jk.d, um.e> f22023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f22024f;

        public a(n<tk.a<um.e>> nVar, jk.d dVar, boolean z11, nm.x<jk.d, um.e> xVar, boolean z12) {
            super(nVar);
            this.f22021c = dVar;
            this.f22022d = z11;
            this.f22023e = xVar;
            this.f22024f = z12;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(tk.a<um.e> aVar, int i11) {
            if (aVar == null) {
                if (c.d(i11)) {
                    o().b(null, i11);
                }
            } else if (!c.e(i11) || this.f22022d) {
                tk.a<um.e> aVarC = this.f22024f ? this.f22023e.c(this.f22021c, aVar) : null;
                try {
                    o().c(1.0f);
                    n<tk.a<um.e>> nVarO = o();
                    if (aVarC != null) {
                        aVar = aVarC;
                    }
                    nVarO.b(aVar, i11);
                } finally {
                    tk.a.C(aVarC);
                }
            }
        }
    }

    public w0(nm.x<jk.d, um.e> xVar, nm.k kVar, z0<tk.a<um.e>> z0Var) {
        this.f22018a = xVar;
        this.f22019b = kVar;
        this.f22020c = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> nVar, a1 a1Var) {
        c1 c1VarP = a1Var.p();
        com.facebook.imagepipeline.request.a aVarB = a1Var.B();
        Object objC = a1Var.c();
        an.b bVarL = aVarB.l();
        if (bVarL == null || bVarL.a() == null) {
            this.f22020c.a(nVar, a1Var);
            return;
        }
        c1VarP.b(a1Var, c());
        jk.d dVarA = this.f22019b.a(aVarB, objC);
        tk.a<um.e> aVar = a1Var.B().y(1) ? this.f22018a.get(dVarA) : null;
        if (aVar == null) {
            a aVar2 = new a(nVar, dVarA, bVarL instanceof an.c, this.f22018a, a1Var.B().y(2));
            c1VarP.j(a1Var, c(), c1VarP.f(a1Var, c()) ? pk.g.of("cached_value_found", "false") : null);
            this.f22020c.a(aVar2, a1Var);
        } else {
            c1VarP.j(a1Var, c(), c1VarP.f(a1Var, c()) ? pk.g.of("cached_value_found", "true") : null);
            c1VarP.a(a1Var, "PostprocessedBitmapMemoryCacheProducer", true);
            a1Var.I("memory_bitmap", "postprocessed");
            nVar.c(1.0f);
            nVar.b(aVar, 1);
            aVar.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
