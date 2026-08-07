package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Sw implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f27812a;

    public Sw(ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        this.f27812a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, AbstractC3397ip error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (error instanceof AbstractC3397ip.c) {
            retryBlock.invoke();
        } else {
            if (!(error instanceof AbstractC3397ip.d)) {
                throw new IllegalStateException("FL developer error. Unique error cases must be handled elsewhere");
            }
            this.f27812a.a(InterfaceC3364hy.a.d.f32383a);
        }
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(InterfaceC3807sD intent, AbstractC3397ip error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (!(error instanceof AbstractC3397ip.c) && !(error instanceof AbstractC3397ip.d)) {
            throw new IllegalStateException("FL developer error. Unique error cases must be handled elsewhere");
        }
        this.f27812a.a(InterfaceC3364hy.a.C0567a.f32378a);
    }
}
