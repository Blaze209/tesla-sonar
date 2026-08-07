package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class s0 implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sk.h f21977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sk.a f21978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f21979c;

    class a implements t0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f21980a;

        a(c0 c0Var) {
            this.f21980a = c0Var;
        }

        @Override // com.facebook.imagepipeline.producers.t0.a
        public void a() {
            s0.this.k(this.f21980a);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X */
        @Override // com.facebook.imagepipeline.producers.t0.a
        public void b(InputStream inputStream, int i11) throws X {
            if (bn.b.d()) {
                bn.b.a("NetworkFetcher->onResponse");
            }
            s0.this.m(this.f21980a, inputStream, i11);
            if (bn.b.d()) {
                bn.b.b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.t0.a
        public void onFailure(Throwable th2) {
            s0.this.l(this.f21980a, th2);
        }
    }

    public s0(sk.h hVar, sk.a aVar, t0 t0Var) {
        this.f21977a = hVar;
        this.f21978b = aVar;
        this.f21979c = t0Var;
    }

    protected static float e(int i11, int i12) {
        return i12 > 0 ? i11 / i12 : 1.0f - ((float) Math.exp(((double) (-i11)) / 50000.0d));
    }

    private Map<String, String> f(c0 c0Var, int i11) {
        if (c0Var.d().f(c0Var.b(), "NetworkFetchProducer")) {
            return this.f21979c.e(c0Var, i11);
        }
        return null;
    }

    protected static void j(sk.j jVar, int i11, om.b bVar, n<um.k> nVar, a1 a1Var) throws Throwable {
        tk.a aVarC0 = tk.a.c0(jVar.c());
        um.k kVar = null;
        try {
            um.k kVar2 = new um.k((tk.a<PooledByteBuffer>) aVarC0);
            try {
                kVar2.G0(bVar);
                kVar2.w0();
                nVar.b(kVar2, i11);
                um.k.o(kVar2);
                tk.a.C(aVarC0);
            } catch (Throwable th2) {
                th = th2;
                kVar = kVar2;
                um.k.o(kVar);
                tk.a.C(aVarC0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(c0 c0Var) {
        c0Var.d().d(c0Var.b(), "NetworkFetchProducer", null);
        c0Var.a().a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(c0 c0Var, Throwable th2) {
        c0Var.d().k(c0Var.b(), "NetworkFetchProducer", th2, null);
        c0Var.d().a(c0Var.b(), "NetworkFetchProducer", false);
        c0Var.b().T("network");
        c0Var.a().onFailure(th2);
    }

    private boolean n(c0 c0Var, a1 a1Var) {
        sm.d progressiveJpegConfig = a1Var.n().getProgressiveJpegConfig();
        if (progressiveJpegConfig != null && progressiveJpegConfig.c() && c0Var.b().b0()) {
            return this.f21979c.d(c0Var);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        a1Var.p().b(a1Var, "NetworkFetchProducer");
        c0 c0VarB = this.f21979c.b(nVar, a1Var);
        this.f21979c.c(c0VarB, new a(c0VarB));
    }

    protected long g() {
        return SystemClock.uptimeMillis();
    }

    protected void h(sk.j jVar, c0 c0Var) throws Throwable {
        Map<String, String> mapF = f(c0Var, jVar.getCount());
        c1 c1VarD = c0Var.d();
        c1VarD.j(c0Var.b(), "NetworkFetchProducer", mapF);
        c1VarD.a(c0Var.b(), "NetworkFetchProducer", true);
        c0Var.b().T("network");
        j(jVar, c0Var.e() | 1, c0Var.f(), c0Var.a(), c0Var.b());
    }

    protected void i(sk.j jVar, c0 c0Var) throws Throwable {
        if (n(c0Var, c0Var.b())) {
            long jG = g();
            if (jG - c0Var.c() >= 100) {
                c0Var.h(jG);
                c0Var.d().h(c0Var.b(), "NetworkFetchProducer", "intermediate_result");
                j(jVar, c0Var.e(), c0Var.f(), c0Var.a(), c0Var.b());
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    protected void m(c0 c0Var, InputStream inputStream, int i11) throws X {
        sk.j jVarD = i11 > 0 ? this.f21977a.d(i11) : this.f21977a.b();
        byte[] bArr = this.f21978b.get(16384);
        while (true) {
            try {
                int i12 = inputStream.read(bArr);
                if (i12 < 0) {
                    this.f21979c.a(c0Var, jVarD.getCount());
                    h(jVarD, c0Var);
                    this.f21978b.a(bArr);
                    jVarD.close();
                    return;
                }
                if (i12 > 0) {
                    jVarD.write(bArr, 0, i12);
                    i(jVarD, c0Var);
                    c0Var.a().c(e(jVarD.getCount(), i11));
                }
            } catch (Throwable th2) {
                this.f21978b.a(bArr);
                jVarD.close();
                throw th2;
            }
        }
    }
}
