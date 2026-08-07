package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3874tv implements InterfaceC4101z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f35742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f35743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4044xs f35744c;

    public C3874tv(InterfaceC3863tk navigationChannel, wn0.a showPermissionRationaleUseCase, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f35742a = navigationChannel;
        this.f35743b = showPermissionRationaleUseCase;
        this.f35744c = popupHandler;
    }

    private final InterfaceC3949vk a(Nx.b bVar) {
        InterfaceC3949vk.v.g gVar = new InterfaceC3949vk.v.g(null, 1, null);
        if (!((Boolean) this.f35743b.invoke()).booleanValue()) {
            return gVar;
        }
        InterfaceC4044xs.a.a(this.f35744c, Ds.a.f25497a, new wn0.a() { // from class: com.fourthline.orca.internal.me1
            @Override // wn0.a
            public final Object invoke() {
                return C3874tv.a(this.f33563a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof Nx.a) {
            return new InterfaceC3949vk.d(null, 1, null);
        }
        if (navigationEffect instanceof Nx.b) {
            return a((Nx.b) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3874tv c3874tv) {
        c3874tv.f35742a.mo85trySendJP2dKIU(new InterfaceC3949vk.v.g(null, 1, null));
        return jn0.h0.f84049a;
    }
}
