package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f21883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sk.h f21884b;

    class a extends i1<um.k> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.a f21885f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c1 f21886g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a1 f21887h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, c1 c1Var, a1 a1Var, String str, com.facebook.imagepipeline.request.a aVar, c1 c1Var2, a1 a1Var2) {
            super(nVar, c1Var, a1Var, str);
            this.f21885f = aVar;
            this.f21886g = c1Var2;
            this.f21887h = a1Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(um.k kVar) {
            um.k.o(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // nk.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public um.k c() {
            um.k kVarD = l0.this.d(this.f21885f);
            if (kVarD == null) {
                this.f21886g.a(this.f21887h, l0.this.f(), false);
                this.f21887h.I(ImagesContract.LOCAL, "fetch");
                return null;
            }
            kVarD.w0();
            this.f21886g.a(this.f21887h, l0.this.f(), true);
            this.f21887h.I(ImagesContract.LOCAL, "fetch");
            this.f21887h.o("image_color_space", kVarD.C());
            return kVarD;
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1 f21889a;

        b(i1 i1Var) {
            this.f21889a = i1Var;
        }

        @Override // com.facebook.imagepipeline.producers.b1
        public void b() {
            this.f21889a.a();
        }
    }

    protected l0(Executor executor, sk.h hVar) {
        this.f21883a = executor;
        this.f21884b = hVar;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        c1 c1VarP = a1Var.p();
        com.facebook.imagepipeline.request.a aVarB = a1Var.B();
        a1Var.I(ImagesContract.LOCAL, "fetch");
        a aVar = new a(nVar, c1VarP, a1Var, f(), aVarB, c1VarP, a1Var);
        a1Var.H(new b(aVar));
        this.f21883a.execute(aVar);
    }

    protected um.k c(InputStream inputStream, int i11) {
        tk.a aVarC0 = null;
        try {
            aVarC0 = i11 <= 0 ? tk.a.c0(this.f21884b.a(inputStream)) : tk.a.c0(this.f21884b.e(inputStream, i11));
            um.k kVar = new um.k((tk.a<PooledByteBuffer>) aVarC0);
            pk.b.b(inputStream);
            tk.a.C(aVarC0);
            return kVar;
        } catch (Throwable th2) {
            pk.b.b(inputStream);
            tk.a.C(aVarC0);
            throw th2;
        }
    }

    protected abstract um.k d(com.facebook.imagepipeline.request.a aVar);

    protected um.k e(InputStream inputStream, int i11) {
        return c(inputStream, i11);
    }

    protected abstract String f();
}
