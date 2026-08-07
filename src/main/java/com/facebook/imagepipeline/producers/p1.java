package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class p1 implements z0<um.k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1<um.k>[] f21922a;

    private class a extends u<um.k, um.k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a1 f21923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final om.f f21925e;

        public a(n<um.k> nVar, a1 a1Var, int i11) {
            super(nVar);
            this.f21923c = a1Var;
            this.f21924d = i11;
            this.f21925e = a1Var.B().r();
        }

        @Override // com.facebook.imagepipeline.producers.u, com.facebook.imagepipeline.producers.c
        protected void g(Throwable th2) {
            if (p1.this.e(this.f21924d + 1, o(), this.f21923c)) {
                return;
            }
            o().onFailure(th2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(um.k kVar, int i11) {
            if (kVar != null && (c.e(i11) || r1.c(kVar, this.f21925e))) {
                o().b(kVar, i11);
            } else if (c.d(i11)) {
                um.k.o(kVar);
                if (p1.this.e(this.f21924d + 1, o(), this.f21923c)) {
                    return;
                }
                o().b(null, 1);
            }
        }
    }

    public p1(q1<um.k>... q1VarArr) {
        q1<um.k>[] q1VarArr2 = (q1[]) pk.k.g(q1VarArr);
        this.f21922a = q1VarArr2;
        pk.k.e(0, q1VarArr2.length);
    }

    private int d(int i11, om.f fVar) {
        while (true) {
            q1<um.k>[] q1VarArr = this.f21922a;
            if (i11 >= q1VarArr.length) {
                return -1;
            }
            if (q1VarArr[i11].b(fVar)) {
                return i11;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i11, n<um.k> nVar, a1 a1Var) {
        int iD = d(i11, a1Var.B().r());
        if (iD == -1) {
            return false;
        }
        this.f21922a[iD].a(new a(nVar, a1Var, iD), a1Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<um.k> nVar, a1 a1Var) {
        if (a1Var.B().r() == null) {
            nVar.b(null, 1);
        } else {
            if (e(0, nVar, a1Var)) {
                return;
            }
            nVar.b(null, 1);
        }
    }
}
