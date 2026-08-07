package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f29646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f29647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bo f29649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f29650e;

    public X0(ND viewNavigator, InterfaceC3732qh imageServiceLocator, boolean z11) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29646a = viewNavigator;
        this.f29647b = imageServiceLocator;
        this.f29648c = z11;
        this.f29649d = Z0.a.f29958a;
        this.f29650e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.rv0
            @Override // wn0.a
            public final Object invoke() {
                return X0.a(this.f35169a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f29649d;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f29650e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(X0 x11) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(x11.f29647b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_account_name_not_matching_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_edit_iban, 0, 2, null)), x11.f29648c ? new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)) : new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        if (this.f29648c) {
            this.f29646a.a(C3196e1.f31284a);
        } else {
            this.f29646a.a(new C3239f1(popupType.c()));
        }
    }
}
