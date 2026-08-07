package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class l implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<um.k> f21879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0<um.k> f21880b;

    private class a extends u<um.k, um.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a1 f21881c;

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void g(Throwable th2) {
            l.this.f21880b.a(o(), this.f21881c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            com.facebook.imagepipeline.request.a aVarB = this.f21881c.B();
            boolean zD = c.d(i11);
            boolean zC = r1.c(kVar, aVarB.r());
            if (kVar != null && (zC || aVarB.j())) {
                if (zD && zC) {
                    o().b(kVar, i11);
                } else {
                    o().b(kVar, c.n(i11, 1));
                }
            }
            if (!zD || zC || aVarB.i()) {
                return;
            }
            um.k.o(kVar);
            l.this.f21880b.a(o(), this.f21881c);
        }

        private a(n<um.k> nVar, a1 a1Var) {
            super(nVar);
            this.f21881c = a1Var;
        }
    }

    public l(z0<um.k> z0Var, z0<um.k> z0Var2) {
        this.f21879a = z0Var;
        this.f21880b = z0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        this.f21879a.a(new a(nVar, a1Var), a1Var);
    }
}
