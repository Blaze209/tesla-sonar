package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3260fg implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f31747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3354ho f31748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f31749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f31750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f31751e;

    public C3260fg(ND viewNavigator, InterfaceC3354ho analytics, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f31747a = viewNavigator;
        this.f31748b = analytics;
        this.f31749c = imageServiceLocator;
        this.f31750d = C3132cg.f30881a;
        this.f31751e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.u11
            @Override // wn0.a
            public final Object invoke() {
                return C3260fg.a(this.f35791a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3260fg c3260fg) {
        return new InterfaceC4001ws.e(c3260fg.f31749c.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_exit, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f31748b.track(Yf.a.g.f29878a);
        this.f31747a.a(new Zf.b(KycError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f31751e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f31750d;
    }
}
