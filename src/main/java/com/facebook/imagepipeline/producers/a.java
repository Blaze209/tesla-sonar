package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class a implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<um.k> f21742a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a, reason: collision with other inner class name */
    private static class C0437a extends u<um.k, um.k> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            if (kVar == null) {
                o().b(null, i11);
                return;
            }
            if (!um.k.s0(kVar)) {
                kVar.w0();
            }
            o().b(kVar, i11);
        }

        private C0437a(n<um.k> nVar) {
            super(nVar);
        }
    }

    public a(z0<um.k> z0Var) {
        this.f21742a = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        this.f21742a.a(new C0437a(nVar), a1Var);
    }
}
