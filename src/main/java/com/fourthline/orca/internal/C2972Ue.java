package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2972Ue implements InterfaceC2931Re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2941Te f28790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3354ho f28791b;

    public C2972Ue(C2941Te realHandler, InterfaceC3354ho analytics) {
        p013kotlin.jvm.internal.s.k(realHandler, "realHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f28790a = realHandler;
        this.f28791b = analytics;
    }

    @Override // com.fourthline.orca.internal.InterfaceC2931Re
    public void handleError(Throwable error, String source) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        InterfaceC3354ho interfaceC3354ho = this.f28791b;
        this.f28790a.handleError(error, source);
        interfaceC3354ho.track(new C3046af.a.C0541a(error, source));
    }

    @Override // com.fourthline.orca.internal.InterfaceC2931Re
    public void handleRecoverableError(Throwable error, String source, wn0.a onRetry) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(onRetry, "onRetry");
        InterfaceC3354ho interfaceC3354ho = this.f28791b;
        this.f28790a.handleRecoverableError(error, source, onRetry);
        interfaceC3354ho.track(new C3046af.a.C0541a(error, source));
    }
}
