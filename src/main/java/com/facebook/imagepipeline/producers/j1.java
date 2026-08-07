package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes3.dex */
public class j1<T> implements z0<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z0<T> f21856a;

    class a extends u<T, Void> {
        a(n nVar) {
            super(nVar);
        }

        @Override // com.facebook.imagepipeline.producers.c
        protected void h(T t11, int i11) {
            if (c.d(i11)) {
                o().b(null, i11);
            }
        }
    }

    public j1(z0<T> z0Var) {
        this.f21856a = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(n<Void> nVar, a1 a1Var) {
        this.f21856a.a(new a(nVar), a1Var);
    }
}
