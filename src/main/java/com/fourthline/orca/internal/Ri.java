package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Ri implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f27620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f27622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27623d;

    public Ri(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27620a = viewNavigator;
        this.f27621b = imageServiceLocator;
        this.f27622c = new AbstractC3594nE.f("not_set");
        this.f27623d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.nn0
            @Override // wn0.a
            public final Object invoke() {
                return Ri.a(this.f33973a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f27623d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f27622c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Ri ri2) {
        return new InterfaceC4001ws.e(ri2.f27621b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_not_verified, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f27620a.a(new FE(popupType.c()));
    }
}
