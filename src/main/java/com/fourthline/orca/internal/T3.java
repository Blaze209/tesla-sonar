package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class T3 implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final QA f27827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ds f27829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27830d;

    public T3(QA exitResource, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(exitResource, "exitResource");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27827a = exitResource;
        this.f27828b = imageServiceLocator;
        this.f27829c = Ds.b.f25500a;
        this.f27830d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.lp0
            @Override // wn0.a
            public final Object invoke() {
                return T3.a(this.f33386a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(T3 t11) {
        return new InterfaceC4001ws.e(t11.f27828b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_exit, 0, 2, null), new InterfaceC3807sD.g(t11.f27827a), new InterfaceC3807sD.a(null, 1, null), false, 16, null);
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
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f27830d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f27829c;
    }

    public /* synthetic */ T3(QA qa2, InterfaceC3732qh interfaceC3732qh, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? QA.a.a(QA.f27433a, R.string.shared_button_exit_idv, 0, 2, null) : qa2, interfaceC3732qh);
    }
}
