package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3826sq implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f35385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f35386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f35387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f35388d;

    public C3826sq(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f35385a = viewNavigator;
        this.f35386b = imageServiceLocator;
        this.f35387c = KycError.NationalityNotSupported.INSTANCE;
        this.f35388d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.mc1
            @Override // wn0.a
            public final Object invoke() {
                return C3826sq.a(this.f33554a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f35387c;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f35388d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f35385a.a(new O9.c.b(KycError.NationalityNotSupported.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3826sq c3826sq) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3826sq.f35386b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_document_nationality_not_supported_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_nationality, 0, 2, null)), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }
}
