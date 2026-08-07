package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class z implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nm.x<jk.d, PooledByteBuffer> f22047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.k f22048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0<um.k> f22049c;

    private static class a extends u<um.k, um.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nm.x<jk.d, PooledByteBuffer> f22050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final jk.d f22051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f22052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f22053f;

        public a(n<um.k> nVar, nm.x<jk.d, PooledByteBuffer> xVar, jk.d dVar, boolean z11, boolean z12) {
            super(nVar);
            this.f22050c = xVar;
            this.f22051d = dVar;
            this.f22052e = z11;
            this.f22053f = z12;
        }

        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            try {
                if (bn.b.d()) {
                    bn.b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!c.e(i11) && kVar != null && !c.l(i11, 10) && kVar.I() != gm.c.f69215d) {
                    tk.a<PooledByteBuffer> aVarT = kVar.t();
                    if (aVarT != null) {
                        try {
                            tk.a<PooledByteBuffer> aVarC = (this.f22053f && this.f22052e) ? this.f22050c.c(this.f22051d, aVarT) : null;
                            tk.a.C(aVarT);
                            if (aVarC != null) {
                                try {
                                    um.k kVar2 = new um.k(aVarC);
                                    kVar2.p(kVar);
                                    tk.a.C(aVarC);
                                    try {
                                        o().c(1.0f);
                                        o().b(kVar2, i11);
                                        um.k.o(kVar2);
                                        if (bn.b.d()) {
                                            bn.b.b();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th2) {
                                        um.k.o(kVar2);
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    tk.a.C(aVarC);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            tk.a.C(aVarT);
                            throw th4;
                        }
                    }
                    o().b(kVar, i11);
                    if (bn.b.d()) {
                        bn.b.b();
                        return;
                    }
                    return;
                }
                o().b(kVar, i11);
                if (bn.b.d()) {
                    bn.b.b();
                }
            } catch (Throwable th5) {
                if (bn.b.d()) {
                    bn.b.b();
                }
                throw th5;
            }
        }
    }

    public z(nm.x<jk.d, PooledByteBuffer> xVar, nm.k kVar, z0<um.k> z0Var) {
        this.f22047a = xVar;
        this.f22048b = kVar;
        this.f22049c = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        try {
            if (bn.b.d()) {
                bn.b.a("EncodedMemoryCacheProducer#produceResults");
            }
            c1 c1VarP = a1Var.p();
            c1VarP.b(a1Var, "EncodedMemoryCacheProducer");
            jk.d dVarB = this.f22048b.b(a1Var.B(), a1Var.c());
            tk.a<PooledByteBuffer> aVar = a1Var.B().y(4) ? this.f22047a.get(dVarB) : null;
            try {
                if (aVar != null) {
                    um.k kVar = new um.k(aVar);
                    try {
                        c1VarP.j(a1Var, "EncodedMemoryCacheProducer", c1VarP.f(a1Var, "EncodedMemoryCacheProducer") ? pk.g.of("cached_value_found", "true") : null);
                        c1VarP.a(a1Var, "EncodedMemoryCacheProducer", true);
                        a1Var.T("memory_encoded");
                        nVar.c(1.0f);
                        nVar.b(kVar, 1);
                        um.k.o(kVar);
                        tk.a.C(aVar);
                        if (bn.b.d()) {
                            bn.b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        um.k.o(kVar);
                        throw th2;
                    }
                }
                if (a1Var.k0().getValue() < com.facebook.imagepipeline.request.a.c.ENCODED_MEMORY_CACHE.getValue()) {
                    a aVar2 = new a(nVar, this.f22047a, dVarB, a1Var.B().y(8), a1Var.n().getExperiments().getIsEncodedCacheEnabled());
                    c1VarP.j(a1Var, "EncodedMemoryCacheProducer", c1VarP.f(a1Var, "EncodedMemoryCacheProducer") ? pk.g.of("cached_value_found", "false") : null);
                    this.f22049c.a(aVar2, a1Var);
                    tk.a.C(aVar);
                    if (bn.b.d()) {
                        bn.b.b();
                        return;
                    }
                    return;
                }
                c1VarP.j(a1Var, "EncodedMemoryCacheProducer", c1VarP.f(a1Var, "EncodedMemoryCacheProducer") ? pk.g.of("cached_value_found", "false") : null);
                c1VarP.a(a1Var, "EncodedMemoryCacheProducer", false);
                a1Var.I("memory_encoded", "nil-result");
                nVar.b(null, 1);
                tk.a.C(aVar);
                if (bn.b.d()) {
                    bn.b.b();
                }
            } catch (Throwable th3) {
                tk.a.C(aVar);
                throw th3;
            }
        } catch (Throwable th4) {
            if (!bn.b.d()) {
                throw th4;
            }
            bn.b.b();
            throw th4;
        }
    }
}
