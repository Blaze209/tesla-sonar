package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3338hE implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f32249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f32251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f32252d;

    public C3338hE(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f32249a = viewNavigator;
        this.f32250b = imageServiceLocator;
        this.f32251c = new AbstractC3594nE.c("");
        this.f32252d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.k31
            @Override // wn0.a
            public final Object invoke() {
                return C3338hE.a(this.f32883a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f32252d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f32251c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3338hE c3338hE) {
        return new InterfaceC4001ws.e(c3338hE.f32250b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f32249a.a(new FE(popupType.c()));
    }
}
