package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Z9 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f29997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3641oc.c f29998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f29999c;

    public Z9(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29997a = imageServiceLocator;
        this.f29998b = AbstractC3641oc.c.f34196a;
        this.f29999c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ox0
            @Override // wn0.a
            public final Object invoke() {
                return Z9.a(this.f34395a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc.c e() {
        return this.f29998b;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f29999c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Z9 z11) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(z11.f29997a.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_no_document_details_detected_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_retake, 0, 2, null)), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
