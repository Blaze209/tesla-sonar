package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Gs implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uj f26005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fj.f f26006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f26007c;

    public Gs(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        this.f26005a = lottieServiceLocator;
        this.f26006b = Fj.f.f25836a;
        this.f26007c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.jb0
            @Override // wn0.a
            public final Object invoke() {
                return Gs.a(this.f32726a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fj.f b() {
        return this.f26006b;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        Cs.b.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.a getState() {
        return (InterfaceC4001ws.a) this.f26007c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.a a(Gs gs2) {
        Yj yjA = gs2.f26005a.a(Tj.LocationPermissionPrecise);
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.a(QA.a.a(aVar, R.string.shared_dialog_permission_precise_location_header, 0, 2, null), yjA, QA.a.a(aVar, R.string.shared_dialog_permission_precise_location_message, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_dialog_permission_shared_button_precise_location, 0, 2, null)), new InterfaceC3807sD.q(QA.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)), false, 32, null);
    }
}
