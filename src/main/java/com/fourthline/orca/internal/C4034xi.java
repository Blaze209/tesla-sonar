package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4034xi implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f36737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f36738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f36739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f36740d;

    public C4034xi(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f36737a = viewNavigator;
        this.f36738b = imageServiceLocator;
        this.f36739c = AbstractC3594nE.e.f33884c;
        this.f36740d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ai1
            @Override // wn0.a
            public final Object invoke() {
                return C4034xi.a(this.f30427a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f36740d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f36739c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C4034xi c4034xi) {
        return new InterfaceC4001ws.e(c4034xi.f36738b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f36737a.a(new FE(popupType.c()));
    }
}
