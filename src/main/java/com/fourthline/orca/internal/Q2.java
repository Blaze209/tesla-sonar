package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Q2 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f27416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f27418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27419d;

    public Q2(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27416a = viewNavigator;
        this.f27417b = imageServiceLocator;
        this.f27418c = new ZD.b("");
        this.f27419d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.bm0
            @Override // wn0.a
            public final Object invoke() {
                return Q2.a(this.f30677a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Q2 q11) {
        return new InterfaceC4001ws.e(q11.f27417b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f27418c;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f27419d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        ND nd2 = this.f27416a;
        BavError.Unexpected.Companion companion = BavError.Unexpected.INSTANCE;
        String message = popupType.c().getMessage();
        if (message == null) {
            message = "FL Developer error. Throwable message was not provided";
        }
        nd2.a(new C3969w2(BavError.Unexpected.Companion.create$default(companion, message, null, 2, null)));
    }
}
