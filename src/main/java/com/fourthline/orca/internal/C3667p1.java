package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3667p1 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f34422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f34423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f34424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f34425d;

    public C3667p1(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f34422a = viewNavigator;
        this.f34423b = imageServiceLocator;
        this.f34424c = BavError.Generic.INSTANCE;
        this.f34425d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.p91
            @Override // wn0.a
            public final Object invoke() {
                return C3667p1.a(this.f34468a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3667p1 c3667p1) {
        return new InterfaceC4001ws.e(c3667p1.f34423b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_bav_required_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f34424c;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f34425d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f34422a.a(new C3969w2(BavError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
