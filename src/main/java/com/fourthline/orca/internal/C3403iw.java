package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3403iw implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3997wo f32608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f32610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f32611d;

    public C3403iw(InterfaceC3997wo orcaDestroyer, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f32608a = orcaDestroyer;
        this.f32609b = imageServiceLocator;
        this.f32610c = new ZD.b("not_set");
        this.f32611d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.y41
            @Override // wn0.a
            public final Object invoke() {
                return C3403iw.a(this.f36894a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f32611d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f32610c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3403iw c3403iw) {
        return new InterfaceC4001ws.e(c3403iw.f32609b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        String message;
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        QesError.Unexpected.Companion companion = QesError.Unexpected.INSTANCE;
        Bo boC = popupType.c();
        ZD.b bVar = boC instanceof ZD.b ? (ZD.b) boC : null;
        if (bVar == null || (message = bVar.getMessage()) == null) {
            message = "An unrecoverable error occurred.";
        }
        QesError.Unexpected unexpectedCreate$default = QesError.Unexpected.Companion.create$default(companion, message, null, 2, null);
        InterfaceC3997wo interfaceC3997wo = this.f32608a;
        jn0.s.Companion companion2 = jn0.s.INSTANCE;
        interfaceC3997wo.a(jn0.s.b(jn0.t.a(unexpectedCreate$default)));
    }
}
