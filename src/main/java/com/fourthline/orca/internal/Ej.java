package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Ej implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uj f25601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fj.c f25602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f25603c;

    public Ej(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        this.f25601a = lottieServiceLocator;
        this.f25602b = Fj.c.f25830a;
        this.f25603c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.i20
            @Override // wn0.a
            public final Object invoke() {
                return Ej.a(this.f32422a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fj.c b() {
        return this.f25602b;
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
        return (InterfaceC4001ws.a) this.f25603c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.a a(Ej ej2) {
        Yj yjA = ej2.f25601a.a(Tj.LocationPermission);
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.a(QA.a.a(aVar, R.string.shared_dialog_permission_location_header, 0, 2, null), yjA, QA.a.a(aVar, R.string.shared_dialog_permission_location_message, 0, 2, null), new InterfaceC3807sD.d(null, 1, null), new InterfaceC3807sD.a(null, 1, null), false, 32, null);
    }
}
