package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3895uF implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f35854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f35855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f35856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f35857d;

    public C3895uF(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f35854a = viewNavigator;
        this.f35855b = imageServiceLocator;
        this.f35856c = ZD.a.f30007a;
        this.f35857d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.cf1
            @Override // wn0.a
            public final Object invoke() {
                return C3895uF.a(this.f30880a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f35857d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f35856c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3895uF c3895uF) {
        return new InterfaceC4001ws.e(c3895uF.f35855b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_offline, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f35854a.a(new FE(AbstractC3594nE.a.f33881c));
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
