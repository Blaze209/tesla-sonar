package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3410j2 implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f32650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ds f32651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f32652c;

    public C3410j2(ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        this.f32650a = viewNavigator;
        this.f32651b = C3453k2.f32877a;
        this.f32652c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.z41
            @Override // wn0.a
            public final Object invoke() {
                return C3410j2.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.d a() {
        QA.a aVar = QA.f27433a;
        return new InterfaceC4001ws.d(false, QA.a.a(aVar, R.string.shared_dialog_action_continue_to_browser_title, 0, 2, null), QA.a.a(aVar, R.string.shared_dialog_action_continue_to_browser_message, 0, 2, null), new InterfaceC3807sD.d(QA.a.a(aVar, R.string.shared_button_continue_to_browser, 0, 2, null)), new InterfaceC3807sD.a(null, 1, null), 1, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f32651b;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        this.f32650a.a(C3369i2.f32418a.b());
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f32652c.getValue();
    }
}
