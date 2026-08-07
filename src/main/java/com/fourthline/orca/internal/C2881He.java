package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2881He implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f26106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f26107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f26108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f26109d;

    public C2881He(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f26106a = viewNavigator;
        this.f26107b = imageServiceLocator;
        this.f26108c = new ZD.b("");
        this.f26109d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.sd0
            @Override // wn0.a
            public final Object invoke() {
                return C2881He.a(this.f35298a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C2881He c2881He) {
        return new InterfaceC4001ws.e(c2881He.f26107b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f26108c;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f26109d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f26106a.a(new InterfaceC2864Ee.a(KycError.Canceled.INSTANCE));
    }
}
