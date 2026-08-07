package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public class y extends q0<Pair<jk.d, com.facebook.imagepipeline.request.a.c>, um.k> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nm.k f22046f;

    public y(nm.k kVar, boolean z11, z0 z0Var) {
        super(z0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z11);
        this.f22046f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.q0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public um.k g(um.k kVar) {
        return um.k.n(kVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.q0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair<jk.d, com.facebook.imagepipeline.request.a.c> j(a1 a1Var) {
        return Pair.create(this.f22046f.b(a1Var.B(), a1Var.c()), a1Var.k0());
    }
}
