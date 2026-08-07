package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class P7 implements O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S7 f27285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P0 f27286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3354ho f27287c;

    public P7(S7 repository, P0 selectionValidator, InterfaceC3354ho analytics) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(selectionValidator, "selectionValidator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f27285a = repository;
        this.f27286b = selectionValidator;
        this.f27287c = analytics;
    }

    @Override // com.fourthline.orca.internal.O0
    public void a(InterfaceC3447jx item) {
        InterfaceC3354ho.a fVar;
        p013kotlin.jvm.internal.s.k(item, "item");
        G5 g11 = (G5) item;
        P0.a aVarA = this.f27286b.a(item);
        if (aVarA instanceof P0.a.b) {
            fVar = new L7.a.c(g11);
        } else {
            if (!(aVarA instanceof P0.a.C0511a)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar = new L7.a.f(g11);
        }
        this.f27287c.track(fVar);
        this.f27285a.a(g11);
    }

    @Override // com.fourthline.orca.internal.O0
    public void a() {
        this.f27285a.a(null);
    }
}
