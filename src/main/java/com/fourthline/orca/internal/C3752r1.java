package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3752r1 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f34955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f34956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f34957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f34958d;

    public C3752r1(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f34955a = viewNavigator;
        this.f34956b = imageServiceLocator;
        this.f34957c = BavError.KycRequired.INSTANCE;
        this.f34958d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ta1
            @Override // wn0.a
            public final Object invoke() {
                return C3752r1.a(this.f35630a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3752r1 c3752r1) {
        return new InterfaceC4001ws.e(c3752r1.f34956b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f34957c;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f34958d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f34955a.a(new C3969w2(BavError.KycRequired.INSTANCE));
    }
}
