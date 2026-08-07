package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class w implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pk.n<pm.c> f22012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.k f22013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0<um.k> f22014c;

    private static class a extends u<um.k, um.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a1 f22015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final pk.n<pm.c> f22016d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final nm.k f22017e;

        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            this.f22015c.p().b(this.f22015c, "DiskCacheWriteProducer");
            if (c.e(i11) || kVar == null || c.l(i11, 10) || kVar.I() == gm.c.f69215d) {
                this.f22015c.p().j(this.f22015c, "DiskCacheWriteProducer", null);
                o().b(kVar, i11);
                return;
            }
            com.facebook.imagepipeline.request.a aVarB = this.f22015c.B();
            jk.d dVarB = this.f22017e.b(aVarB, this.f22015c.c());
            pm.c cVar = this.f22016d.get();
            nm.j jVarA = DiskCacheDecision.a(aVarB, cVar.a(), cVar.b(), cVar.c());
            if (jVarA != null) {
                jVarA.p(dVarB, kVar);
                this.f22015c.p().j(this.f22015c, "DiskCacheWriteProducer", null);
                o().b(kVar, i11);
                return;
            }
            this.f22015c.p().k(this.f22015c, "DiskCacheWriteProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(aVarB.c().ordinal()).toString()), null);
            o().b(kVar, i11);
        }

        private a(n<um.k> nVar, a1 a1Var, pk.n<pm.c> nVar2, nm.k kVar) {
            super(nVar);
            this.f22015c = a1Var;
            this.f22016d = nVar2;
            this.f22017e = kVar;
        }
    }

    public w(pk.n<pm.c> nVar, nm.k kVar, z0<um.k> z0Var) {
        this.f22012a = nVar;
        this.f22013b = kVar;
        this.f22014c = z0Var;
    }

    private void c(n<um.k> nVar, a1 a1Var) {
        a1 a1Var2;
        if (a1Var.k0().getValue() >= com.facebook.imagepipeline.request.a.c.DISK_CACHE.getValue()) {
            a1Var.I("disk", "nil-result_write");
            nVar.b(null, 1);
            return;
        }
        if (a1Var.B().y(32)) {
            a1Var2 = a1Var;
            nVar = new a(nVar, a1Var2, this.f22012a, this.f22013b);
        } else {
            a1Var2 = a1Var;
        }
        this.f22014c.a(nVar, a1Var2);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        c(nVar, a1Var);
    }
}
