package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Ni implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f27055a;

    public Ni(ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        this.f27055a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, AbstractC3502l8.c error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        retryBlock.invoke();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(InterfaceC3807sD intent, AbstractC3502l8.c error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        this.f27055a.a(InterfaceC2937Ta.a.C0518a.f27873a);
    }
}
