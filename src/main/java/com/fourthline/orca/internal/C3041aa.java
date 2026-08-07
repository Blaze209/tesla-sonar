package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3041aa implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f30349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f30350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f30351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f30352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC3641oc f30353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f30354f;

    public C3041aa(Fs analytics, ND viewNavigator, InterfaceC3732qh imageServiceLocator, boolean z11) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f30349a = analytics;
        this.f30350b = viewNavigator;
        this.f30351c = imageServiceLocator;
        this.f30352d = z11;
        this.f30353e = AbstractC3641oc.e.f34198a;
        this.f30354f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ey0
            @Override // wn0.a
            public final Object invoke() {
                return C3041aa.a(this.f31554a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f30353e;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f30354f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3041aa c3041aa) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c3041aa.f30351c.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_document_type_not_supported_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_document, 0, 2, null)), c3041aa.f30352d ? new InterfaceC3807sD.o(QA.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f30349a.track(new Fs.a.b(e()));
        this.f30350b.a(new T6.e(e()));
    }
}
