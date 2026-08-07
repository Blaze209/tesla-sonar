package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Fm implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f25842a;

    public Fm(ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        this.f25842a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, Em error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (error instanceof Em.e) {
            this.f25842a.a(new An.c.d(((Em.e) error).a()));
            return;
        }
        if ((error instanceof Em.a) || (error instanceof Em.d)) {
            throw new IllegalStateException(("NFC Scanner in document flow doesn't present popup for " + error).toString());
        }
        if (!(error instanceof Em.c) && !(error instanceof Em.b)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("NFC Scanner in document flow doesn't present popup for " + error).toString());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void onSecondaryClicked(InterfaceC3807sD intent, Em error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if ((error instanceof Em.a) || (error instanceof Em.d)) {
            throw new IllegalStateException(("NFC Scanner in document flow doesn't present popup for " + error).toString());
        }
        if (!(error instanceof Em.c) && !(error instanceof Em.b)) {
            if (error instanceof Em.e) {
                throw new IllegalStateException("NFC Scanner in document flow doesn't have secondary button for WrongUnlockKey");
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("NFC Scanner in document flow doesn't present popup for " + error).toString());
    }
}
