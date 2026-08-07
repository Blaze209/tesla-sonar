package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3362hw implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3997wo f32368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f32370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f32371d;

    public C3362hw(InterfaceC3997wo orcaDestroyer, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f32368a = orcaDestroyer;
        this.f32369b = imageServiceLocator;
        this.f32370c = ZD.a.f30007a;
        this.f32371d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.y31
            @Override // wn0.a
            public final Object invoke() {
                return C3362hw.a(this.f36889a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f32370c;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f32371d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        this.f32368a.a(jn0.s.b(jn0.t.a(QesError.Canceled.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3362hw c3362hw) {
        return new InterfaceC4001ws.e(c3362hw.f32369b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_offline, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }
}
