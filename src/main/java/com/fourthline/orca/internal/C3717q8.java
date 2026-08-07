package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3717q8 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f34737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC3641oc.b f34738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f34739c;

    public C3717q8(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f34737a = imageServiceLocator;
        this.f34738b = AbstractC3641oc.b.f34195a;
        this.f34739c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ca1
            @Override // wn0.a
            public final Object invoke() {
                return C3717q8.a(this.f30849a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc.b e() {
        return this.f34738b;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f34739c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3717q8 c3717q8) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3717q8.f34737a.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_no_document_details_detected_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_retake, 0, 2, null)), null, false, 24, null);
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
