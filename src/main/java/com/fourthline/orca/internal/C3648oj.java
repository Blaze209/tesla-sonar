package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3648oj implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f34298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4044xs f34299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f34300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk f34301d;

    public C3648oj(InterfaceC3863tk navigationChannel, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f34298a = navigationChannel;
        this.f34299b = popupHandler;
        this.f34300c = new C3392ik("geolocation");
        this.f34301d = InterfaceC3949vk.o.b.f36185b;
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f34299b, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.m91
            @Override // wn0.a
            public final Object invoke() {
                return C3648oj.a(this.f33523a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f34300c;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        InterfaceC3949vk lVar;
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof Hj.a.C0493a) {
            lVar = c();
        } else {
            if (!(navigationEffect instanceof Hj.a.b)) {
                throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
            }
            lVar = new InterfaceC3949vk.l(null, Pf.a(((Hj.a.b) navigationEffect).c()), 1, null);
        }
        this.f34298a.mo85trySendJP2dKIU(lVar);
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f34301d;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3648oj c3648oj) {
        c3648oj.f34298a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
