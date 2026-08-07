package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.zi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4120zi implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f37284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f37285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W6 f37286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3732qh f37287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f37288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC3641oc f37289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f37290g;

    public C4120zi(Fs analytics, ND viewNavigator, W6 documentAnalysisDataBundle, InterfaceC3732qh imageServiceLocator, boolean z11) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f37284a = analytics;
        this.f37285b = viewNavigator;
        this.f37286c = documentAnalysisDataBundle;
        this.f37287d = imageServiceLocator;
        this.f37288e = z11;
        this.f37289f = AbstractC3641oc.g.f34200a;
        this.f37290g = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.hj1
            @Override // wn0.a
            public final Object invoke() {
                return C4120zi.a(this.f32324a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f37289f;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f37290g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C4120zi c4120zi) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(c4120zi.f37287d.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_unsupported_issuing_country_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_change_issuing_country, 0, 2, null)), c4120zi.f37288e ? new InterfaceC3807sD.o(QA.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)) : null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f37284a.track(new Fs.a.b(e()));
        W6 w11 = this.f37286c;
        C4104z8 c4104z8 = w11 instanceof C4104z8 ? (C4104z8) w11 : null;
        if (c4104z8 != null) {
            c4104z8.a((G5) null);
        }
        this.f37285b.a(new T6.b(e()));
    }
}
