package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class GD implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f25930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rs f25931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f25932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bo f25933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f25934e;

    public GD(InterfaceC3863tk navigationChannel, Rs errorProvider, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(errorProvider, "errorProvider");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f25930a = navigationChannel;
        this.f25931b = errorProvider;
        this.f25932c = imageServiceLocator;
        this.f25933d = ZD.a.f30007a;
        this.f25934e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.db0
            @Override // wn0.a
            public final Object invoke() {
                return GD.a(this.f31119a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f25934e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f25933d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(GD gd2) {
        return new InterfaceC4001ws.e(gd2.f25932c.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_offline, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f25930a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(this.f25931b.a()));
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
