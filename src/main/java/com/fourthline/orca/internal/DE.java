package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class DE implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f25440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f25441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f25442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f25443d;

    public DE(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25440a = viewNavigator;
        this.f25441b = imageServiceLocator;
        this.f25442c = AbstractC3594nE.f33879a.a();
        this.f25443d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.u10
            @Override // wn0.a
            public final Object invoke() {
                return DE.a(this.f35790a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f25443d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f25442c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(DE de2) {
        return new InterfaceC4001ws.e(de2.f25441b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f25440a.a(new FE(popupType.c()));
    }
}
