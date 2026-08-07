package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3070b2 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f30541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f30542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bo f30544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f30545e;

    public C3070b2(ND viewNavigator, InterfaceC3732qh imageServiceLocator, boolean z11) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f30541a = viewNavigator;
        this.f30542b = imageServiceLocator;
        this.f30543c = z11;
        this.f30544d = Z0.c.f29960a;
        this.f30545e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.my0
            @Override // wn0.a
            public final Object invoke() {
                return C3070b2.a(this.f33737a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f30544d;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f30545e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3070b2 c3070b2) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3070b2.f30542b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_sepa_not_supported_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_edit_iban, 0, 2, null)), c3070b2.f30543c ? new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)) : new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        if (this.f30543c) {
            this.f30541a.a(C3196e1.f31284a);
        } else {
            this.f30541a.a(new C3239f1(popupType.c()));
        }
    }
}
