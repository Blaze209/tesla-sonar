package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.o8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3631o8 implements InterfaceC3216ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3216ef f34094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3216ef f34095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3216ef f34096c;

    public C3631o8(InterfaceC3216ef permissionErrorPopupStateBuilder, InterfaceC3216ef postProcessingErrorPopupStateBuilder, InterfaceC3216ef scannerErrorPopupStateBuilder) {
        p013kotlin.jvm.internal.s.k(permissionErrorPopupStateBuilder, "permissionErrorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(postProcessingErrorPopupStateBuilder, "postProcessingErrorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(scannerErrorPopupStateBuilder, "scannerErrorPopupStateBuilder");
        this.f34094a = permissionErrorPopupStateBuilder;
        this.f34095b = postProcessingErrorPopupStateBuilder;
        this.f34096c = scannerErrorPopupStateBuilder;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3216ef
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws buildStateFor(AbstractC3502l8 error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        if (error instanceof AbstractC3502l8.c) {
            return this.f34094a.buildStateFor(error);
        }
        if (error instanceof AbstractC3502l8.d) {
            return this.f34095b.buildStateFor(error);
        }
        if (error instanceof AbstractC3502l8.e) {
            return this.f34096c.buildStateFor(error);
        }
        if (error instanceof AbstractC3502l8.a) {
            throw new IllegalStateException((error + " is not handled by this object.").toString());
        }
        if (!(error instanceof AbstractC3502l8.b)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Document product doesn't have state for " + error).toString());
    }
}
