package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3446jw implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3997wo f32847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f32849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f32850d;

    public C3446jw(InterfaceC3997wo orcaDestroyer, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f32847a = orcaDestroyer;
        this.f32848b = imageServiceLocator;
        this.f32849c = ZD.c.f30009a;
        this.f32850d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.s51
            @Override // wn0.a
            public final Object invoke() {
                return C3446jw.a(this.f35206a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c cVar) {
        Cs.a.C0480a.a(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f32849c;
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f32850d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        this.f32847a.a(jn0.s.b(jn0.t.a(QesError.Canceled.INSTANCE)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3446jw c3446jw) {
        return new InterfaceC4001ws.e(c3446jw.f32848b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }
}
