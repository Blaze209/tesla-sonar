package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: loaded from: classes4.dex */
public final class Qx implements InterfaceC4101z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f27576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f27577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4044xs f27578c;

    public Qx(InterfaceC3863tk navigationChannel, wn0.a showPermissionRationaleUseCase, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f27576a = navigationChannel;
        this.f27577b = showPermissionRationaleUseCase;
        this.f27578c = popupHandler;
    }

    private final InterfaceC3949vk a(Nx.b bVar) {
        final InterfaceC3949vk.x.c cVar = new InterfaceC3949vk.x.c(null, 1, null);
        if (!((Boolean) this.f27577b.invoke()).booleanValue()) {
            return cVar;
        }
        InterfaceC4044xs.a.a(this.f27578c, Ds.a.f25497a, new wn0.a() { // from class: com.fourthline.orca.internal.xm0
            @Override // wn0.a
            public final Object invoke() {
                return Qx.a(this.f36771a, cVar);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f27578c, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.ym0
            @Override // wn0.a
            public final Object invoke() {
                return Qx.a(this.f37055a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof Nx.a) {
            return c();
        }
        if (navigationEffect instanceof Nx.b) {
            return a((Nx.b) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Qx qx2, InterfaceC3949vk.x.c cVar) {
        qx2.f27576a.mo85trySendJP2dKIU(cVar);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Qx qx2) {
        qx2.f27576a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
