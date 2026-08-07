package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3174df implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3131cf f31162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3354ho f31163b;

    public C3174df(InterfaceC3131cf realHandler, InterfaceC3354ho analytics) {
        p013kotlin.jvm.internal.s.k(realHandler, "realHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f31162a = realHandler;
        this.f31163b = analytics;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    public void onPrimaryClicked(InterfaceC3807sD intent, Throwable error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        this.f31163b.track(new C3046af.a.b(intent, error, source));
        this.f31162a.onPrimaryClicked(intent, error, source, retryBlock);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    public void onSecondaryClicked(InterfaceC3807sD intent, Throwable error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        this.f31163b.track(new C3046af.a.c(intent, error, source));
        this.f31162a.onSecondaryClicked(intent, error, source, retryBlock);
    }
}
