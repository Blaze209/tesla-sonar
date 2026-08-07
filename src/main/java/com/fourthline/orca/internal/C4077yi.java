package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4077yi implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f37013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f37014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f37015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f37016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC3641oc f37017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f37018f;

    public C4077yi(Fs analytics, ND viewNavigator, InterfaceC3732qh imageServiceLocator, boolean z11) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f37013a = analytics;
        this.f37014b = viewNavigator;
        this.f37015c = imageServiceLocator;
        this.f37016d = z11;
        this.f37017e = AbstractC3641oc.f.f34199a;
        this.f37018f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.yi1
            @Override // wn0.a
            public final Object invoke() {
                return C4077yi.a(this.f37022a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f37017e;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f37018f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C4077yi c4077yi) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c4077yi.f37015c.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_inconsistent_document_and_issuing_country_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_issuing_country, 0, 2, null)), c4077yi.f37016d ? new InterfaceC3807sD.o(QA.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f37013a.track(new Fs.a.b(e()));
        this.f37014b.a(new T6.b(e()));
    }
}
