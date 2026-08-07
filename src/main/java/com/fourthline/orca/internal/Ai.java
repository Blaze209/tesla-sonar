package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Ai implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fs f24954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ND f24955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W6 f24956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3732qh f24957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC3641oc f24958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f24959f;

    public Ai(Fs analytics, ND viewNavigator, W6 documentAnalysisDataBundle, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(documentAnalysisDataBundle, "documentAnalysisDataBundle");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f24954a = analytics;
        this.f24955b = viewNavigator;
        this.f24956c = documentAnalysisDataBundle;
        this.f24957d = imageServiceLocator;
        this.f24958e = AbstractC3641oc.h.f34201a;
        this.f24959f = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.e00
            @Override // wn0.a
            public final Object invoke() {
                return Ai.a(this.f31280a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC3641oc e() {
        return this.f24958e;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f24959f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Ai ai2) {
        return new InterfaceC4001ws.e(ai2.f24957d.a(EnumC3689ph.B0), new QA.e("We couldn't detect the issuing country or document type."), new InterfaceC3807sD.k(QA.a.a(QA.f27433a, R.string.shared_button_add_details_manually, 0, 2, null)), null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f24954a.track(new Fs.a.b(e()));
        W6 w11 = this.f24956c;
        C4104z8 c4104z8 = w11 instanceof C4104z8 ? (C4104z8) w11 : null;
        if (c4104z8 != null) {
            c4104z8.a((G5) null);
            c4104z8.a((X7) null);
        }
        this.f24955b.a(new T6.b(e()));
    }
}
