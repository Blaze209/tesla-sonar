package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3044ad implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f30376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bo f30377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f30378c;

    public C3044ad(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f30376a = imageServiceLocator;
        this.f30377b = new ZD.b("");
        this.f30378c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.iy0
            @Override // wn0.a
            public final Object invoke() {
                return C3044ad.a(this.f32624a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f30377b;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f30378c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3044ad c3044ad) {
        return new InterfaceC4001ws.e(c3044ad.f30376a.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }
}
