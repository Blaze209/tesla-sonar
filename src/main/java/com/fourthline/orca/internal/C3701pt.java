package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3701pt implements InterfaceC3131cf {
    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, AbstractC3658ot error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (!(error instanceof AbstractC3658ot.a)) {
            throw new NoWhenBranchMatchedException();
        }
        retryBlock.invoke();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(InterfaceC3807sD intent, AbstractC3658ot error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        throw new IllegalStateException(("There is no secondary button for the error: " + error + " ").toString());
    }
}
