package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Xr implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f29762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3354ho f29763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f29764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ds f29765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f29766e;

    public Xr(ND viewNavigator, InterfaceC3354ho analytics, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29762a = viewNavigator;
        this.f29763b = analytics;
        this.f29764c = imageServiceLocator;
        this.f29765d = Rq.b.f27661a;
        this.f29766e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.dw0
            @Override // wn0.a
            public final Object invoke() {
                return Xr.a(this.f31265a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Xr xr2) {
        return new InterfaceC4001ws.e(xr2.f29764c.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_exit, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f29763b.track(Ur.a.g.f28839a);
        this.f29762a.a(new Pq.a.c(KycError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f29766e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f29765d;
    }
}
