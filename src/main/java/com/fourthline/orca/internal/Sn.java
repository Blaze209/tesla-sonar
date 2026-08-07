package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Sn implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2874Gc f27792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uj f27793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ds f27794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27795d;

    public Sn(C2874Gc effectHandler, Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        this.f27792a = effectHandler;
        this.f27793b = lottieServiceLocator;
        this.f27794c = C3695pn.f34611a;
        this.f27795d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.gp0
            @Override // wn0.a
            public final Object invoke() {
                return Sn.a(this.f32072a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3566mn f() {
        return InterfaceC3566mn.b.f33622a;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.a getState() {
        return (InterfaceC4001ws.a) this.f27795d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f27794c;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f27792a.a(new wn0.a() { // from class: com.fourthline.orca.internal.hp0
            @Override // wn0.a
            public final Object invoke() {
                return Sn.f();
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.a a(Sn sn2) {
        Yj yjA = sn2.f27793b.a(Tj.NfcEnable);
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.a(QA.a.a(aVar, R.string.shared_dialog_permission_nfc_header, 0, 2, null), yjA, QA.a.a(aVar, R.string.shared_dialog_permission_nfc_message, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), false, 32, null);
    }
}
