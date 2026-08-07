package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3783rq implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f35134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f35135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f35136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f35137d;

    public C3783rq(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f35134a = viewNavigator;
        this.f35135b = imageServiceLocator;
        this.f35136c = T9.f27850a;
        this.f35137d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ub1
            @Override // wn0.a
            public final Object invoke() {
                return C3783rq.a(this.f35867a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f35136c;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f35137d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f35134a.a(new O9.c.b(KycError.NationalityNotSupported.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3783rq c3783rq) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3783rq.f35135b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_different_nationality, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_nationality, 0, 2, null)), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }
}
