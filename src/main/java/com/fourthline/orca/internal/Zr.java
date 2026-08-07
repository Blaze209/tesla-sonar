package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Zr implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f30112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ds f30113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f30114c;

    public Zr(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f30112a = imageServiceLocator;
        this.f30113b = Rq.d.f27667a;
        this.f30114c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.vx0
            @Override // wn0.a
            public final Object invoke() {
                return Zr.a(this.f36307a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Zr zr2) {
        return new InterfaceC4001ws.e(zr2.f30112a.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_error_dialog_poa_unsupported_filetype, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        Cs.b.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f30114c.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f30113b;
    }
}
