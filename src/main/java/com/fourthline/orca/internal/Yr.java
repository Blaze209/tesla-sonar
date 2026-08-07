package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Yr implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f29935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ds f29936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f29937c;

    public Yr(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29935a = imageServiceLocator;
        this.f29936b = Rq.c.f27664a;
        this.f29937c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.nw0
            @Override // wn0.a
            public final Object invoke() {
                return Yr.a(this.f34004a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Yr yr2) {
        return new InterfaceC4001ws.e(yr2.f29935a.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_error_dialog_poa_unsupported_filesize, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
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
        return (InterfaceC4001ws) this.f29937c.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f29936b;
    }
}
