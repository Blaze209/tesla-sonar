package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3938vF implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f36059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f36060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f36061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f36062d;

    public C3938vF(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f36059a = viewNavigator;
        this.f36060b = imageServiceLocator;
        this.f36061c = new ZD.b("");
        this.f36062d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.xf1
            @Override // wn0.a
            public final Object invoke() {
                return C3938vF.a(this.f36719a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f36062d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f36061c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3938vF c3938vF) {
        return new InterfaceC4001ws.e(c3938vF.f36060b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        ND nd2 = this.f36059a;
        AbstractC3594nE.h.a aVar = AbstractC3594nE.h.f33887e;
        String message = popupType.c().getMessage();
        if (message == null) {
            message = "FL Developer error. Throwable message was not provided";
        }
        nd2.a(new FE(AbstractC3594nE.h.a.a(aVar, message, null, 2, null)));
    }
}
