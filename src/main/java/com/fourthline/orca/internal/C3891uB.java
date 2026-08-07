package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.uB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3891uB implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f35829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f35830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4044xs f35831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3392ik f35832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3906uk f35833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3949vk.y.b f35834f;

    public C3891uB(InterfaceC3863tk navigationChannel, wn0.a skipDocumentScannerUseCase, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(skipDocumentScannerUseCase, "skipDocumentScannerUseCase");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f35829a = navigationChannel;
        this.f35830b = skipDocumentScannerUseCase;
        this.f35831c = popupHandler;
        this.f35832d = new C3392ik("tin");
        C3906uk c3906uk = new C3906uk(false, false, false, new C3743qs(InterfaceC3949vk.y.c.f36241b, false, false, 4, null), 7, null);
        this.f35833e = c3906uk;
        this.f35834f = new InterfaceC3949vk.y.b(c3906uk);
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f35831c, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.ue1
            @Override // wn0.a
            public final Object invoke() {
                return C3891uB.a(this.f35903a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f35832d;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return ((Boolean) this.f35830b.invoke()).booleanValue() ? this.f35834f : InterfaceC3949vk.y.c.f36241b;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(InterfaceC3978wB navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f35829a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3891uB c3891uB) {
        c3891uB.f35829a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (p013kotlin.jvm.internal.s.f(navigationEffect, C3219ei.f31440a)) {
            return c();
        }
        if (p013kotlin.jvm.internal.s.f(navigationEffect, C3647oi.f34291a)) {
            return new InterfaceC3949vk.y.d(null, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(navigationEffect, C3079bB.f30585a)) {
            return ((Boolean) this.f35830b.invoke()).booleanValue() ? c() : new InterfaceC3949vk.b(null, 1, null);
        }
        if (navigationEffect instanceof C3121cB) {
            return new InterfaceC3949vk.l(null, Pf.a(((C3121cB) navigationEffect).c()), 1, null);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }
}
