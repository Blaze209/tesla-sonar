package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class HD implements Cs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f26094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rs f26095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3732qh f26096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Bo f26097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f26098e;

    public HD(InterfaceC3863tk navigationChannel, Rs errorProvider, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(errorProvider, "errorProvider");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        this.f26094a = navigationChannel;
        this.f26095b = errorProvider;
        this.f26096c = imageServiceLocator;
        this.f26097d = new ZD.b("");
        this.f26098e = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.rd0
            @Override // wn0.a
            public final Object invoke() {
                return HD.a(this.f35049a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Cs
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC4001ws.e getState() {
        return (InterfaceC4001ws.e) this.f26098e.getValue();
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public Bo e() {
        return this.f26097d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC4001ws.e a(HD hd2) {
        return new InterfaceC4001ws.e(hd2.f26096c.a(EnumC3689ph.B0), QA.a.a(QA.f27433a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new InterfaceC3807sD.g(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void b(Ds.c cVar) {
        Cs.a.C0480a.b(this, cVar);
    }

    @Override // com.fourthline.orca.internal.Cs.a
    public void a(Ds.c popupType) {
        p013kotlin.jvm.internal.s.k(popupType, "popupType");
        this.f26094a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(this.f26095b.a(popupType.c())));
    }
}
