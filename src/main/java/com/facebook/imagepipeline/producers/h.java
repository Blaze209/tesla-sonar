package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class h extends q0<Pair<jk.d, com.facebook.imagepipeline.request.a.c>, tk.a<um.e>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nm.k f21828f;

    public h(nm.k kVar, z0 z0Var) {
        super(z0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f21828f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.q0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public tk.a<um.e> g(tk.a<um.e> aVar) {
        return tk.a.t(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.q0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<jk.d, com.facebook.imagepipeline.request.a.c> j(a1 a1Var) {
        return Pair.create(this.f21828f.c(a1Var.B(), a1Var.c()), a1Var.k0());
    }
}
