package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class i implements z0<tk.a<um.e>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nm.x<jk.d, um.e> f21831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.k f21832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0<tk.a<um.e>> f21833c;

    class a extends u<tk.a<um.e>, tk.a<um.e>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ jk.d f21834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f21835d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, jk.d dVar, boolean z11) {
            super(nVar);
            this.f21834c = dVar;
            this.f21835d = z11;
        }

        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(tk.a<um.e> aVar, int i11) {
            tk.a<um.e> aVar2;
            try {
                if (bn.b.d()) {
                    bn.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zD = c.d(i11);
                if (aVar == null) {
                    if (zD) {
                        o().b(null, i11);
                    }
                    if (bn.b.d()) {
                        bn.b.b();
                        return;
                    }
                    return;
                }
                if (!aVar.H().J3() && !c.m(i11, 8)) {
                    if (!zD && (aVar2 = i.this.f21831a.get(this.f21834c)) != null) {
                        try {
                            um.p pVarO3 = aVar.H().o3();
                            um.p pVarO4 = aVar2.H().o3();
                            if (pVarO4.a() || pVarO4.c() >= pVarO3.c()) {
                                o().b(aVar2, i11);
                                tk.a.C(aVar2);
                                if (bn.b.d()) {
                                    bn.b.b();
                                    return;
                                }
                                return;
                            }
                            tk.a.C(aVar2);
                        } catch (Throwable th2) {
                            tk.a.C(aVar2);
                            throw th2;
                        }
                    }
                    tk.a<um.e> aVarC = this.f21835d ? i.this.f21831a.c(this.f21834c, aVar) : null;
                    if (zD) {
                        try {
                            o().c(1.0f);
                        } catch (Throwable th3) {
                            tk.a.C(aVarC);
                            throw th3;
                        }
                    }
                    n<tk.a<um.e>> nVarO = o();
                    if (aVarC != null) {
                        aVar = aVarC;
                    }
                    nVarO.b(aVar, i11);
                    tk.a.C(aVarC);
                    if (bn.b.d()) {
                        bn.b.b();
                        return;
                    }
                    return;
                }
                o().b(aVar, i11);
                if (bn.b.d()) {
                    bn.b.b();
                }
            } catch (Throwable th4) {
                if (bn.b.d()) {
                    bn.b.b();
                }
                throw th4;
            }
        }
    }

    public i(nm.x<jk.d, um.e> xVar, nm.k kVar, z0<tk.a<um.e>> z0Var) {
        this.f21831a = xVar;
        this.f21832b = kVar;
        this.f21833c = z0Var;
    }

    private static void f(um.l lVar, a1 a1Var) {
        a1Var.C(lVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<tk.a<um.e>> nVar, a1 a1Var) {
        boolean zD;
        try {
            if (bn.b.d()) {
                bn.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            c1 c1VarP = a1Var.p();
            c1VarP.b(a1Var, e());
            jk.d dVarC = this.f21832b.c(a1Var.B(), a1Var.c());
            tk.a<um.e> aVar = a1Var.B().y(1) ? this.f21831a.get(dVarC) : null;
            if (aVar != null) {
                f(aVar.H(), a1Var);
                boolean zA = aVar.H().o3().a();
                if (zA) {
                    c1VarP.j(a1Var, e(), c1VarP.f(a1Var, e()) ? pk.g.of("cached_value_found", "true") : null);
                    c1VarP.a(a1Var, e(), true);
                    a1Var.I("memory_bitmap", d());
                    nVar.c(1.0f);
                }
                nVar.b(aVar, c.k(zA));
                aVar.close();
                if (zA) {
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (a1Var.k0().getValue() >= com.facebook.imagepipeline.request.a.c.BITMAP_MEMORY_CACHE.getValue()) {
                c1VarP.j(a1Var, e(), c1VarP.f(a1Var, e()) ? pk.g.of("cached_value_found", "false") : null);
                c1VarP.a(a1Var, e(), false);
                a1Var.I("memory_bitmap", d());
                nVar.b(null, 1);
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            n<tk.a<um.e>> nVarG = g(nVar, dVarC, a1Var.B().y(2));
            c1VarP.j(a1Var, e(), c1VarP.f(a1Var, e()) ? pk.g.of("cached_value_found", "false") : null);
            if (bn.b.d()) {
                bn.b.a("mInputProducer.produceResult");
            }
            this.f21833c.a(nVarG, a1Var);
            if (bn.b.d()) {
                bn.b.b();
            }
        } finally {
            if (bn.b.d()) {
                bn.b.b();
            }
        }
    }

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected n<tk.a<um.e>> g(n<tk.a<um.e>> nVar, jk.d dVar, boolean z11) {
        return new a(nVar, dVar, z11);
    }
}
