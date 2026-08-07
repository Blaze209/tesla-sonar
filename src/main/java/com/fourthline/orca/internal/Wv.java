package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Wv implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3997wo f29636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f29637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f29638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f29639d;

    public Wv(InterfaceC3997wo orcaDestroyer, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f29636a = orcaDestroyer;
        this.f29637b = imageServiceLocator;
        this.f29638c = QesError.TooManyAuthorizationAttempts.INSTANCE;
        this.f29639d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.qv0
            @Override // wn0.a
            public final Object invoke() {
                return Wv.a(this.f34915a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f29639d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f29638c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Wv wv2) {
        return new InterfaceC4001ws.e(wv2.f29637b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_too_many_attempts, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        this.f29636a.a(jn0.s.b(jn0.t.a(popupType.c())));
    }
}
