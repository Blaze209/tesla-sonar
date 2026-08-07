package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class P2 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f27271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f27273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27274d;

    public P2(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27271a = viewNavigator;
        this.f27272b = imageServiceLocator;
        this.f27273c = ZD.a.f30007a;
        this.f27274d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.zk0
            @Override // wn0.a
            public final Object invoke() {
                return P2.a(this.f37304a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(P2 p11) {
        return new InterfaceC4001ws.e(p11.f27272b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_offline, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f27273c;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f27274d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f27271a.a(new C3969w2(BavError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
