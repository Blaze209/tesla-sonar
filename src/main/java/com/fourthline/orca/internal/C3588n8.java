package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3588n8 implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3131cf f33836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3131cf f33837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3131cf f33838c;

    public C3588n8(InterfaceC3131cf permissionErrorPopupClicksHandler, InterfaceC3131cf postProcessingErrorPopupClicksHandler, InterfaceC3131cf scannerErrorPopupClicksHandler) {
        p013kotlin.jvm.internal.s.k(permissionErrorPopupClicksHandler, "permissionErrorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(postProcessingErrorPopupClicksHandler, "postProcessingErrorPopupClicksHandler");
        p013kotlin.jvm.internal.s.k(scannerErrorPopupClicksHandler, "scannerErrorPopupClicksHandler");
        this.f33836a = permissionErrorPopupClicksHandler;
        this.f33837b = postProcessingErrorPopupClicksHandler;
        this.f33838c = scannerErrorPopupClicksHandler;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, AbstractC3502l8 error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (error instanceof AbstractC3502l8.c) {
            this.f33836a.onPrimaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof AbstractC3502l8.d) {
            this.f33837b.onPrimaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof AbstractC3502l8.e) {
            this.f33838c.onPrimaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof AbstractC3502l8.a) {
            throw new IllegalStateException((error + " is not handled by this object.").toString());
        }
        if (!(error instanceof AbstractC3502l8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException((error + " state should not have a clickable primary button").toString());
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(InterfaceC3807sD intent, AbstractC3502l8 error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        if (error instanceof AbstractC3502l8.c) {
            this.f33836a.onSecondaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof AbstractC3502l8.d) {
            this.f33837b.onSecondaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof AbstractC3502l8.e) {
            this.f33838c.onSecondaryClicked(intent, error, source, retryBlock);
            return;
        }
        if (error instanceof AbstractC3502l8.a) {
            throw new IllegalStateException((error + " is not handled by this object.").toString());
        }
        if (!(error instanceof AbstractC3502l8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException((error + " state should not have a clickable secondary button").toString());
    }
}
