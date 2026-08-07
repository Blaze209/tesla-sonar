package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4088yt implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3997wo f37112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f37113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f37114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f37115d;

    public C4088yt(InterfaceC3997wo orcaDestroyer, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f37112a = orcaDestroyer;
        this.f37113b = imageServiceLocator;
        this.f37114c = QesError.Canceled.INSTANCE;
        this.f37115d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.ej1
            @Override // wn0.a
            public final Object invoke() {
                return C4088yt.a(this.f31451a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f37115d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f37114c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C4088yt c4088yt) {
        return new InterfaceC4001ws.e(c4088yt.f37113b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_exit, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        this.f37112a.a(jn0.s.b(jn0.t.a(popupType.c())));
    }
}
