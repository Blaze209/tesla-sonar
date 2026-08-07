package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Xc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3011Xc implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4038xm f29734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f29735b;

    public C3011Xc(C4038xm nfcCanStateHandler, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(nfcCanStateHandler, "nfcCanStateHandler");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29734a = nfcCanStateHandler;
        this.f29735b = imageServiceLocator;
    }

    public final wn0.l a(String input) {
        p013kotlin.jvm.internal.s.k(input, "input");
        return this.f29734a.a(input);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3952vm getInitialState() {
        return C3952vm.a(this.f29734a.getInitialState(), null, null, null, this.f29735b.a(EnumC3689ph.f34571u0), null, null, QA.a.a(QA.f27433a, R.string.shared_button_choose_another_verification_type, 0, 2, null), 39, null);
    }

    public final wn0.l a(EnumC3865tm fieldType, boolean z11) {
        p013kotlin.jvm.internal.s.k(fieldType, "fieldType");
        return this.f29734a.a(fieldType, z11);
    }
}
