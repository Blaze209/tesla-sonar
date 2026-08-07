package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3348hi implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.l f32308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f32309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f32310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f32311d;

    public C3348hi(wn0.l onPrimaryClicked, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(onPrimaryClicked, "onPrimaryClicked");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f32308a = onPrimaryClicked;
        this.f32309b = imageServiceLocator;
        this.f32310c = AbstractC3518li.a.f33324a;
        this.f32311d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.n31
            @Override // wn0.a
            public final Object invoke() {
                return C3348hi.a(this.f33814a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f32311d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f32310c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(C3348hi c3348hi) {
        return new InterfaceC4001ws.e(c3348hi.f32309b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_exit, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f32308a.invoke(popupType);
    }
}
