package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Tn implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3732qh f27955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Em.d f27956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f27957c;

    public Tn(InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27955a = imageServiceLocator;
        this.f27956b = Em.d.a.a(Em.d.f25608c, "not_set", null, 2, null);
        this.f27957c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.gq0
            @Override // wn0.a
            public final Object invoke() {
                return Tn.a(this.f32075a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f27957c.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Em.d e() {
        return this.f27956b;
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Tn tn2) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(tn2.f27955a.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_nfc_timeout_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.o(QA.a.a(aVar, R.string.shared_button_skip_nfc, 0, 2, null)), false, 16, null);
    }
}
