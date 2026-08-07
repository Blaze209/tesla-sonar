package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.sdk.R;
import java.util.List;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3213ec implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f31373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f31374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3354ho f31375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3732qh f31376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Ds f31377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f31378f;

    public C3213ec(wn0.a unsupportedDocuments, ND viewNavigator, InterfaceC3354ho analytics, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(unsupportedDocuments, "unsupportedDocuments");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f31373a = unsupportedDocuments;
        this.f31374b = viewNavigator;
        this.f31375c = analytics;
        this.f31376d = imageServiceLocator;
        this.f31377e = C3086bc.f30614a;
        this.f31378f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.b11
            @Override // wn0.a
            public final Object invoke() {
                return C3213ec.a(this.f30540a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3213ec c3213ec) {
        return new InterfaceC4001ws.e(c3213ec.f31376d.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_exit, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f31375c.track(new C3010Xb.a.c((List) this.f31373a.invoke()));
        this.f31374b.a(new InterfaceC3020Zb.b(KycError.DocumentTypeNotSupported.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f31378f.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f31377e;
    }
}
