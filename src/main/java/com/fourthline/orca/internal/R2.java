package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class R2 implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f27588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3732qh f27589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bo f27590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f27591d;

    public R2(ND viewNavigator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f27588a = viewNavigator;
        this.f27589b = imageServiceLocator;
        this.f27590c = ZD.c.f30009a;
        this.f27591d = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.gn0
            @Override // wn0.a
            public final Object invoke() {
                return R2.a(this.f32060a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(R2 r11) {
        return new InterfaceC4001ws.e(r11.f27589b.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f27590c;
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return (InterfaceC4001ws) this.f27591d.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f27588a.a(new C3969w2(BavError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
