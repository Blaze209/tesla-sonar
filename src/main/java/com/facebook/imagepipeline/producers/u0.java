package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class u0 implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pk.n<pm.c> f21985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nm.k f21986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sk.h f21987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final sk.a f21988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z0<um.k> f21989e;

    class a implements ac.d<um.k, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c1 f21990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f21991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n f21992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ jk.d f21993d;

        a(c1 c1Var, a1 a1Var, n nVar, jk.d dVar) {
            this.f21990a = c1Var;
            this.f21991b = a1Var;
            this.f21992c = nVar;
            this.f21993d = dVar;
        }

        @Override // ac.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(ac.e<um.k> eVar) {
            if (u0.g(eVar)) {
                this.f21990a.d(this.f21991b, "PartialDiskCacheProducer", null);
                this.f21992c.a();
            } else if (eVar.n()) {
                this.f21990a.k(this.f21991b, "PartialDiskCacheProducer", eVar.i(), null);
                u0.this.i(this.f21992c, this.f21991b, this.f21993d, null);
            } else {
                um.k kVarJ = eVar.j();
                if (kVarJ != null) {
                    c1 c1Var = this.f21990a;
                    a1 a1Var = this.f21991b;
                    c1Var.j(a1Var, "PartialDiskCacheProducer", u0.f(c1Var, a1Var, true, kVarJ.c0()));
                    om.b bVarG = om.b.g(kVarJ.c0() - 1);
                    kVarJ.G0(bVarG);
                    int iC0 = kVarJ.c0();
                    com.facebook.imagepipeline.request.a aVarB = this.f21991b.B();
                    if (bVarG.c(aVarB.b())) {
                        this.f21991b.I("disk", "partial");
                        this.f21990a.a(this.f21991b, "PartialDiskCacheProducer", true);
                        this.f21992c.b(kVarJ, 9);
                    } else {
                        this.f21992c.b(kVarJ, 8);
                        u0.this.i(this.f21992c, new h1(ImageRequestBuilder.b(aVarB).z(om.b.d(iC0 - 1)).a(), this.f21991b), this.f21993d, kVarJ);
                    }
                } else {
                    c1 c1Var2 = this.f21990a;
                    a1 a1Var2 = this.f21991b;
                    c1Var2.j(a1Var2, "PartialDiskCacheProducer", u0.f(c1Var2, a1Var2, false, 0));
                    u0.this.i(this.f21992c, this.f21991b, this.f21993d, kVarJ);
                }
            }
            return null;
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f21995a;

        b(AtomicBoolean atomicBoolean) {
            this.f21995a = atomicBoolean;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            this.f21995a.set(true);
        }
    }

    private static class c extends u<um.k, um.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final pk.n<pm.c> f21997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final jk.d f21998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final sk.h f21999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final sk.a f22000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final um.k f22001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f22002h;

        private void p(InputStream inputStream, OutputStream outputStream, int i11) throws IOException {
            byte[] bArr = this.f22000f.get(16384);
            int i12 = i11;
            while (i12 > 0) {
                try {
                    int i13 = inputStream.read(bArr, 0, Math.min(16384, i12));
                    if (i13 < 0) {
                        break;
                    } else if (i13 > 0) {
                        outputStream.write(bArr, 0, i13);
                        i12 -= i13;
                    }
                } catch (Throwable th2) {
                    this.f22000f.a(bArr);
                    throw th2;
                }
            }
            this.f22000f.a(bArr);
            if (i12 > 0) {
                throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", Integer.valueOf(i11), Integer.valueOf(i12)));
            }
        }

        private sk.j q(um.k kVar, um.k kVar2) throws IOException {
            int i11 = ((om.b) pk.k.g(kVar2.B())).from;
            sk.j jVarD = this.f21999e.d(kVar2.c0() + i11);
            p(kVar.T(), jVarD, i11);
            p(kVar2.T(), jVarD, kVar2.c0());
            return jVarD;
        }

        private void s(sk.j jVar) throws Throwable {
            um.k kVar;
            Throwable th2;
            tk.a aVarC0 = tk.a.c0(jVar.c());
            try {
                kVar = new um.k((tk.a<PooledByteBuffer>) aVarC0);
                try {
                    kVar.w0();
                    o().b(kVar, 1);
                    um.k.o(kVar);
                    tk.a.C(aVarC0);
                } catch (Throwable th3) {
                    th2 = th3;
                    um.k.o(kVar);
                    tk.a.C(aVarC0);
                    throw th2;
                }
            } catch (Throwable th4) {
                kVar = null;
                th2 = th4;
            }
        }

        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            if (com.facebook.imagepipeline.producers.c.e(i11)) {
                return;
            }
            if (this.f22001g == null || kVar == null || kVar.B() == null) {
                if (!this.f22002h || !com.facebook.imagepipeline.producers.c.m(i11, 8) || !com.facebook.imagepipeline.producers.c.d(i11) || kVar == null || kVar.I() == gm.c.f69215d) {
                    o().b(kVar, i11);
                    return;
                } else {
                    this.f21997c.get().b().p(this.f21998d, kVar);
                    o().b(kVar, i11);
                    return;
                }
            }
            try {
                try {
                    s(q(this.f22001g, kVar));
                } catch (IOException e11) {
                    qk.a.n("PartialDiskCacheProducer", "Error while merging image data", e11);
                    o().onFailure(e11);
                }
                kVar.close();
                this.f22001g.close();
                this.f21997c.get().b().s(this.f21998d);
            } catch (Throwable th2) {
                kVar.close();
                this.f22001g.close();
                throw th2;
            }
        }

        private c(n<um.k> nVar, pk.n<pm.c> nVar2, jk.d dVar, sk.h hVar, sk.a aVar, um.k kVar, boolean z11) {
            super(nVar);
            this.f21997c = nVar2;
            this.f21998d = dVar;
            this.f21999e = hVar;
            this.f22000f = aVar;
            this.f22001g = kVar;
            this.f22002h = z11;
        }
    }

    public u0(pk.n<pm.c> nVar, nm.k kVar, sk.h hVar, sk.a aVar, z0<um.k> z0Var) {
        this.f21985a = nVar;
        this.f21986b = kVar;
        this.f21987c = hVar;
        this.f21988d = aVar;
        this.f21989e = z0Var;
    }

    private static Uri e(com.facebook.imagepipeline.request.a aVar) {
        return aVar.v().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    static Map<String, String> f(c1 c1Var, a1 a1Var, boolean z11, int i11) {
        if (c1Var.f(a1Var, "PartialDiskCacheProducer")) {
            return z11 ? pk.g.of("cached_value_found", String.valueOf(z11), "encodedImageSize", String.valueOf(i11)) : pk.g.of("cached_value_found", String.valueOf(z11));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(ac.e<?> eVar) {
        if (eVar.l()) {
            return true;
        }
        return eVar.n() && (eVar.i() instanceof CancellationException);
    }

    private ac.d<um.k, Void> h(n<um.k> nVar, a1 a1Var, jk.d dVar) {
        return new a(a1Var.p(), a1Var, nVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(n<um.k> nVar, a1 a1Var, jk.d dVar, um.k kVar) {
        this.f21989e.a(new c(nVar, this.f21985a, dVar, this.f21987c, this.f21988d, kVar, a1Var.B().y(32)), a1Var);
    }

    private void j(AtomicBoolean atomicBoolean, a1 a1Var) {
        a1Var.H(new b(atomicBoolean));
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        com.facebook.imagepipeline.request.a aVarB = a1Var.B();
        boolean zY = a1Var.B().y(16);
        boolean zY2 = a1Var.B().y(32);
        if (!zY && !zY2) {
            this.f21989e.a(nVar, a1Var);
            return;
        }
        c1 c1VarP = a1Var.p();
        c1VarP.b(a1Var, "PartialDiskCacheProducer");
        jk.d dVarD = this.f21986b.d(aVarB, e(aVarB), a1Var.c());
        if (!zY) {
            c1VarP.j(a1Var, "PartialDiskCacheProducer", f(c1VarP, a1Var, false, 0));
            i(nVar, a1Var, dVarD, null);
        } else {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f21985a.get().b().m(dVarD, atomicBoolean).e(h(nVar, a1Var, dVarD));
            j(atomicBoolean, a1Var);
        }
    }
}
