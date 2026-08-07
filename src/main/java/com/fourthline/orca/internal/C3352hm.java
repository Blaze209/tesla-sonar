package com.fourthline.orca.internal;

import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3352hm implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zl f32331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f32332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f32333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f32334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f32335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider f32336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider f32337g;

    public C3352hm(Zl zl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.f32331a = zl2;
        this.f32332b = provider;
        this.f32333c = provider2;
        this.f32334d = provider3;
        this.f32335e = provider4;
        this.f32336f = provider5;
        this.f32337g = provider6;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4081ym get() {
        return a(this.f32331a, (C4038xm) this.f32332b.get(), (Q3) this.f32333c.get(), (C3737qm) this.f32334d.get(), (Ul) this.f32335e.get(), (CoroutineScope) this.f32336f.get(), (C3085bb) this.f32337g.get());
    }

    public static C3352hm a(Zl zl2, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C3352hm(zl2, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static C4081ym a(Zl zl2, C4038xm c4038xm, Q3 q11, C3737qm c3737qm, Ul ul2, CoroutineScope coroutineScope, C3085bb c3085bb) {
        return (C4081ym) qj0.h.d(zl2.a(c4038xm, q11, c3737qm, ul2, coroutineScope, c3085bb));
    }
}
