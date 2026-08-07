package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3243f5 implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f31621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4044xs f31622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f31623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk f31624d;

    public C3243f5(InterfaceC3863tk navigationChannel, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f31621a = navigationChannel;
        this.f31622b = popupHandler;
        this.f31623c = new C3392ik("contact");
        this.f31624d = InterfaceC3949vk.f.b.f36144b;
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f31622b, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.q11
            @Override // wn0.a
            public final Object invoke() {
                return C3243f5.a(this.f34704a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f31623c;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f31624d;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(InterfaceC3671p5 navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f31621a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (p013kotlin.jvm.internal.s.f(navigationEffect, K4.c.a.f26540a)) {
            return c();
        }
        if (navigationEffect instanceof K4.c.b) {
            return new InterfaceC3949vk.l(null, Pf.a(((K4.c.b) navigationEffect).c()), 1, null);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3243f5 c3243f5) {
        c3243f5.f31621a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
