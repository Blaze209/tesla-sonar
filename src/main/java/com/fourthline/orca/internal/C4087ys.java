package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4087ys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bs f37108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3785rs f37109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f37110c;

    public C4087ys(Bs presenter, C3785rs analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(presenter, "presenter");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f37108a = presenter;
        this.f37109b = analytics;
        this.f37110c = coroutineScope;
    }

    public final InterfaceC4044xs a(Cs... providers) {
        p013kotlin.jvm.internal.s.k(providers, "providers");
        return new C3242f4(p013kotlin.collections.n.h(providers), this.f37108a, this.f37109b, this.f37110c);
    }
}
