package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3383ia implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3424ja f32472b;

    public C3383ia(boolean z11, C3424ja productRepository) {
        p013kotlin.jvm.internal.s.k(productRepository, "productRepository");
        this.f32471a = z11;
        this.f32472b = productRepository;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.e(this.f32472b.r() ? C3802s8.f35215a : new C3888u8(null, 1, null));
    }
}
