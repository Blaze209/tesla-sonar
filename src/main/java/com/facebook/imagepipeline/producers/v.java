package com.facebook.imagepipeline.producers;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class v implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pk.n<pm.c> f22003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.k f22004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z0<um.k> f22005c;

    class a implements ac.d<um.k, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1 f22006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f22007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f22008c;

        a(c1 c1Var, a1 a1Var, n nVar) {
            this.f22006a = c1Var;
            this.f22007b = a1Var;
            this.f22008c = nVar;
        }

        @Override // ac.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(ac.e<um.k> eVar) {
            if (v.f(eVar)) {
                this.f22006a.d(this.f22007b, "DiskCacheProducer", null);
                this.f22008c.a();
            } else if (eVar.n()) {
                this.f22006a.k(this.f22007b, "DiskCacheProducer", eVar.i(), null);
                v.this.f22005c.a(this.f22008c, this.f22007b);
            } else {
                um.k kVarJ = eVar.j();
                if (kVarJ != null) {
                    c1 c1Var = this.f22006a;
                    a1 a1Var = this.f22007b;
                    c1Var.j(a1Var, "DiskCacheProducer", v.e(c1Var, a1Var, true, kVarJ.c0()));
                    this.f22006a.a(this.f22007b, "DiskCacheProducer", true);
                    this.f22007b.T("disk");
                    this.f22008c.c(1.0f);
                    this.f22008c.b(kVarJ, 1);
                    kVarJ.close();
                } else {
                    c1 c1Var2 = this.f22006a;
                    a1 a1Var2 = this.f22007b;
                    c1Var2.j(a1Var2, "DiskCacheProducer", v.e(c1Var2, a1Var2, false, 0));
                    v.this.f22005c.a(this.f22008c, this.f22007b);
                }
            }
            return null;
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f22010a;

        b(AtomicBoolean atomicBoolean) {
            this.f22010a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            this.f22010a.set(true);
        }
    }

    public v(pk.n<pm.c> nVar, nm.k kVar, z0<um.k> z0Var) {
        this.f22003a = nVar;
        this.f22004b = kVar;
        this.f22005c = z0Var;
    }

    static Map<String, String> e(c1 c1Var, a1 a1Var, boolean z11, int i11) {
        if (c1Var.f(a1Var, "DiskCacheProducer")) {
            return z11 ? pk.g.of("cached_value_found", String.valueOf(z11), "encodedImageSize", String.valueOf(i11)) : pk.g.of("cached_value_found", String.valueOf(z11));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(ac.e<?> eVar) {
        if (eVar.l()) {
            return true;
        }
        return eVar.n() && (eVar.i() instanceof CancellationException);
    }

    private void g(n<um.k> nVar, a1 a1Var) {
        if (a1Var.k0().getValue() < com.facebook.imagepipeline.request.a.c.DISK_CACHE.getValue()) {
            this.f22005c.a(nVar, a1Var);
        } else {
            a1Var.I("disk", "nil-result_read");
            nVar.b(null, 1);
        }
    }

    private ac.d<um.k, Void> h(n<um.k> nVar, a1 a1Var) {
        return new a(a1Var.p(), a1Var, nVar);
    }

    private void i(AtomicBoolean atomicBoolean, a1 a1Var) {
        a1Var.H(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        com.facebook.imagepipeline.request.a aVarB = a1Var.B();
        if (!a1Var.B().y(16)) {
            g(nVar, a1Var);
            return;
        }
        a1Var.p().b(a1Var, "DiskCacheProducer");
        jk.d dVarB = this.f22004b.b(aVarB, a1Var.c());
        pm.c cVar = this.f22003a.get();
        nm.j jVarA = DiskCacheDecision.a(aVarB, cVar.a(), cVar.b(), cVar.c());
        if (jVarA != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            jVarA.m(dVarB, atomicBoolean).e(h(nVar, a1Var));
            i(atomicBoolean, a1Var);
        } else {
            a1Var.p().k(a1Var, "DiskCacheProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(aVarB.c().ordinal()).toString()), null);
            g(nVar, a1Var);
        }
    }
}
