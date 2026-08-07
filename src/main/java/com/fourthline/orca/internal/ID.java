package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class ID implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f26279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rs f26280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f26281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bo f26282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f26283e;

    public ID(InterfaceC3863tk navigationChannel, Rs errorProvider, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(errorProvider, "errorProvider");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f26279a = navigationChannel;
        this.f26280b = errorProvider;
        this.f26281c = imageServiceLocator;
        this.f26282d = ZD.c.f30009a;
        this.f26283e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.de0
            @Override // wn0.a
            public final Object invoke() {
                return ID.a(this.f31160a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f26283e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f26282d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(ID id2) {
        return new InterfaceC4001ws.e(id2.f26281c.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new InterfaceC3807sD.l(null, 1, null), new InterfaceC3807sD.g(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f26279a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(this.f26280b.a()));
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        popupType.d().invoke();
    }
}
