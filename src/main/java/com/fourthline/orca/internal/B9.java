package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class B9 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f25072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f25073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f25074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f25075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC3641oc f25076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f25077f;

    public B9(Fs analytics, ND viewNavigator, InterfaceC3732qh imageServiceLocator, boolean z11) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25072a = analytics;
        this.f25073b = viewNavigator;
        this.f25074c = imageServiceLocator;
        this.f25075d = z11;
        this.f25076e = AbstractC3641oc.d.f34197a;
        this.f25077f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.u00
            @Override // wn0.a
            public final Object invoke() {
                return B9.a(this.f35781a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f25076e;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f25077f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(B9 b11) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(b11.f25074c.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_different_scanned_document_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_document, 0, 2, null)), b11.f25075d ? new InterfaceC3807sD.o(QA.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f25072a.track(new Fs.a.b(e()));
        this.f25073b.a(new T6.e(e()));
    }
}
