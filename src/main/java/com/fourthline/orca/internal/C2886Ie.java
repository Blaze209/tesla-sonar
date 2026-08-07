package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2886Ie implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f26293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f26294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f26295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f26296d;

    public C2886Ie(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f26293a = viewNavigator;
        this.f26294b = imageServiceLocator;
        this.f26295c = ZD.c.f30009a;
        this.f26296d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ee0
            @Override // wn0.a
            public final Object invoke() {
                return C2886Ie.a(this.f31393a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C2886Ie c2886Ie) {
        return new InterfaceC4001ws.e(c2886Ie.f26294b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f26295c;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f26296d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f26293a.a(new InterfaceC2864Ee.a(KycError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
