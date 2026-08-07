package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Kv implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3997wo f26684a;

    public Kv(InterfaceC3997wo orcaDestroyer) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        this.f26684a = orcaDestroyer;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, Jv error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (!(error instanceof Jv.a)) {
            throw new NoWhenBranchMatchedException();
        }
        retryBlock.invoke();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(InterfaceC3807sD intent, Jv error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (!(error instanceof Jv.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC3997wo interfaceC3997wo = this.f26684a;
        jn0.s.Companion companion = jn0.s.INSTANCE;
        interfaceC3997wo.a(jn0.s.b(jn0.t.a(QesError.Canceled.INSTANCE)));
    }
}
