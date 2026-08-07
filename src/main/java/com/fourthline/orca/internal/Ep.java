package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Ep implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f25636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f25637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f25638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f25639d;

    public Ep(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25636a = viewNavigator;
        this.f25637b = imageServiceLocator;
        this.f25638c = new AbstractC3594nE.g("not_set");
        this.f25639d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.j20
            @Override // wn0.a
            public final Object invoke() {
                return Ep.a(this.f32653a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f25639d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f25638c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Ep ep2) {
        return new InterfaceC4001ws.e(ep2.f25637b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_not_verified, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f25636a.a(new FE(popupType.c()));
    }
}
