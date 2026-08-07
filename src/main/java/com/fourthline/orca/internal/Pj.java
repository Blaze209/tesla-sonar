package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class Pj implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2874Gc f27338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fj.e f27340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27341d;

    public Pj(C2874Gc effectHandler, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(effectHandler, "effectHandler");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27338a = effectHandler;
        this.f27339b = imageServiceLocator;
        this.f27340c = Fj.e.f25834a;
        this.f27341d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.el0
            @Override // wn0.a
            public final Object invoke() {
                return Pj.a(this.f31475a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Hj g() {
        return Hj.b.f26117a;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Fj.e b() {
        return this.f27340c;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f27338a.a(new wn0.a() { // from class: com.fourthline.orca.internal.fl0
            @Override // wn0.a
            public final Object invoke() {
                return Pj.g();
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
        return (InterfaceC4001ws.e) this.f27341d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(Pj pj2) {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.e(pj2.f27339b.a(EnumC3689ph.B0), QA.a.a(aVar, R.string.shared_dialog_error_location_services_off_title_android, 0, 2, null), new InterfaceC3807sD.k(QA.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
    }
}
