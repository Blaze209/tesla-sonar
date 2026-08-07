package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3045ae implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f30380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bo f30381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f30382c;

    public C3045ae(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f30380a = imageServiceLocator;
        this.f30381b = ZD.c.f30009a;
        this.f30382c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.jy0
            @Override // wn0.a
            public final Object invoke() {
                return C3045ae.a(this.f32854a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f30381b;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f30382c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3045ae c3045ae) {
        return new InterfaceC4001ws.e(c3045ae.f30380a.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }
}
