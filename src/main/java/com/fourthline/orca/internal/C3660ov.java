package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3660ov implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3997wo f34384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f34385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f34386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f34387d;

    public C3660ov(InterfaceC3997wo orcaDestroyer, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f34384a = orcaDestroyer;
        this.f34385b = imageServiceLocator;
        this.f34386c = QesError.Rejected.INSTANCE;
        this.f34387d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.o91
            @Override // wn0.a
            public final Object invoke() {
                return C3660ov.a(this.f34104a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f34387d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f34386c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3660ov c3660ov) {
        return new InterfaceC4001ws.e(c3660ov.f34385b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        this.f34384a.a(jn0.s.b(jn0.t.a(popupType.c())));
    }
}
