package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Dj implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2874Gc f25471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f25472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fj.d f25473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f25474d;

    public Dj(C2874Gc effectHandler, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25471a = effectHandler;
        this.f25472b = imageServiceLocator;
        this.f25473c = Fj.d.f25832a;
        this.f25474d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.w10
            @Override // wn0.a
            public final Object invoke() {
                return Dj.a(this.f36319a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hj g() {
        return Hj.c.f26118a;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fj.d b() {
        return this.f25473c;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f25471a.a(new wn0.a() { // from class: com.fourthline.orca.internal.v10
            @Override // wn0.a
            public final Object invoke() {
                return Dj.g();
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f25474d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Dj dj2) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(dj2.f25472b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_location_permission_blocked_title, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }
}
