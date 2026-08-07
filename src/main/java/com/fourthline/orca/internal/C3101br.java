package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;

/* JADX INFO: renamed from: com.fourthline.orca.internal.br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3101br implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f30701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4044xs f30702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn0.a f30703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3392ik f30704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3949vk f30705e;

    public C3101br(InterfaceC3863tk navigationChannel, InterfaceC4044xs popupHandler, wn0.a showPermissionRationaleUseCase) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        this.f30701a = navigationChannel;
        this.f30702b = popupHandler;
        this.f30703c = showPermissionRationaleUseCase;
        this.f30704d = new C3392ik("poa");
        this.f30705e = InterfaceC3949vk.u.c.f36209b;
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f30702b, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.ty0
            @Override // wn0.a
            public final Object invoke() {
                return C3101br.a(this.f35771a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f30704d;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f30705e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3101br c3101br, InterfaceC3949vk.u.e eVar) {
        c3101br.f30701a.mo85trySendJP2dKIU(eVar);
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof C3177di) {
            return c();
        }
        if (navigationEffect instanceof C3604ni) {
            return InterfaceC3949vk.u.b.f36207b;
        }
        if (navigationEffect instanceof Pq.a.C0513a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (navigationEffect instanceof Pq.a.b) {
            return new InterfaceC3949vk.u.d(new C3906uk(true, false, false, new C3743qs(InterfaceC3949vk.u.b.f36207b, false, false, 4, null), 6, null));
        }
        if (navigationEffect instanceof Pq.a.d) {
            final InterfaceC3949vk.u.e eVar = new InterfaceC3949vk.u.e(null, 1, null);
            if (!((Boolean) this.f30703c.invoke()).booleanValue()) {
                return eVar;
            }
            InterfaceC4044xs.a.a(this.f30702b, Ds.a.f25497a, new wn0.a() { // from class: com.fourthline.orca.internal.uy0
                @Override // wn0.a
                public final Object invoke() {
                    return C3101br.a(this.f35971a, eVar);
                }
            }, null, 4, null);
            return new InterfaceC3949vk.p(null, 1, null);
        }
        if (navigationEffect instanceof Pq.a.c) {
            return new InterfaceC3949vk.m(((Pq.a.c) navigationEffect).c());
        }
        if (navigationEffect instanceof C4043xr) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (navigationEffect instanceof C4086yr) {
            C4086yr c4086yr = (C4086yr) navigationEffect;
            if (c4086yr.c() instanceof InterfaceC3442js.a) {
                return new InterfaceC3949vk.u.f(null, 1, null);
            }
            return new InterfaceC3949vk.l(null, Pf.a(c4086yr.c()), 1, null);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(InterfaceC3143cr navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f30701a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3101br c3101br) {
        c3101br.f30701a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
