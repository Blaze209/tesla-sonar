package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3768rb implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f35023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f35024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4044xs f35025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f35026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3392ik f35027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3949vk f35028f;

    public C3768rb(InterfaceC3863tk navigationChannel, wn0.a showPermissionRationaleUseCase, InterfaceC4044xs popupHandler, boolean z11, C3392ik analyticsContext) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(showPermissionRationaleUseCase, "showPermissionRationaleUseCase");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analyticsContext, "analyticsContext");
        this.f35023a = navigationChannel;
        this.f35024b = showPermissionRationaleUseCase;
        this.f35025c = popupHandler;
        this.f35026d = z11;
        this.f35027e = analyticsContext;
        this.f35028f = z11 ? new InterfaceC3949vk.j.a(null, 1, null) : InterfaceC3949vk.j.c.f36160b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(C3768rb c3768rb, InterfaceC3949vk.l lVar) {
        c3768rb.f35023a.mo85trySendJP2dKIU(lVar);
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f35028f;
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f35025c, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.ab1
            @Override // wn0.a
            public final Object invoke() {
                return C3768rb.a(this.f30368a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f35027e;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof C3305gi) {
            return c();
        }
        if (navigationEffect instanceof C3733qi) {
            C3733qi c3733qi = (C3733qi) navigationEffect;
            if (!(c3733qi.c() instanceof InterfaceC3726qb.c)) {
                return new InterfaceC3949vk.j.a(null, 1, null);
            }
            Rf rfA = Pf.a(c3733qi.c());
            final InterfaceC3949vk.l lVar = new InterfaceC3949vk.l(null, rfA, 1, null);
            if (!a(rfA) || !((Boolean) this.f35024b.invoke()).booleanValue()) {
                return lVar;
            }
            InterfaceC4044xs.a.a(this.f35025c, Ds.a.f25497a, new wn0.a() { // from class: com.fourthline.orca.internal.ya1
                @Override // wn0.a
                public final Object invoke() {
                    return C3768rb.a(this.f36976a, lVar);
                }
            }, null, 4, null);
            return new InterfaceC3949vk.p(null, 1, null);
        }
        if (navigationEffect instanceof R7) {
            return a((R7) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3020Zb) {
            return a((InterfaceC3020Zb) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3769rc) {
            return a((InterfaceC3769rc) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3768rb c3768rb, InterfaceC3949vk.l lVar) {
        c3768rb.f35023a.mo85trySendJP2dKIU(lVar);
        return jn0.h0.f84049a;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(InterfaceC2923Qb navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f35023a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    private final InterfaceC3949vk a(R7 r11) {
        if (r11 instanceof R7.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (r11 instanceof R7.c) {
            return new InterfaceC3949vk.j.d(null, 1, null);
        }
        if (r11 instanceof R7.b) {
            return new InterfaceC3949vk.m(((R7.b) r11).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(InterfaceC3020Zb interfaceC3020Zb) {
        if (interfaceC3020Zb instanceof InterfaceC3020Zb.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (interfaceC3020Zb instanceof InterfaceC3020Zb.c) {
            InterfaceC3020Zb.c cVar = (InterfaceC3020Zb.c) interfaceC3020Zb;
            if (cVar.c() instanceof InterfaceC3726qb.b) {
                return InterfaceC3949vk.j.e.f36164b;
            }
            Rf rfA = Pf.a(cVar.c());
            final InterfaceC3949vk.l lVar = new InterfaceC3949vk.l(null, rfA, 1, null);
            if (!a(rfA) || !((Boolean) this.f35024b.invoke()).booleanValue()) {
                return lVar;
            }
            InterfaceC4044xs.a.a(this.f35025c, Ds.a.f25497a, new wn0.a() { // from class: com.fourthline.orca.internal.za1
                @Override // wn0.a
                public final Object invoke() {
                    return C3768rb.b(this.f37249a, lVar);
                }
            }, null, 4, null);
            return new InterfaceC3949vk.p(null, 1, null);
        }
        if (interfaceC3020Zb instanceof InterfaceC3020Zb.b) {
            return new InterfaceC3949vk.m(((InterfaceC3020Zb.b) interfaceC3020Zb).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(C3768rb c3768rb, InterfaceC3949vk.l lVar) {
        c3768rb.f35023a.mo85trySendJP2dKIU(lVar);
        return jn0.h0.f84049a;
    }

    private final InterfaceC3949vk a(InterfaceC3769rc interfaceC3769rc) {
        if (interfaceC3769rc instanceof InterfaceC3769rc.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (interfaceC3769rc instanceof InterfaceC3769rc.b) {
            final InterfaceC3949vk.l lVar = new InterfaceC3949vk.l(null, Pf.a(((InterfaceC3769rc.b) interfaceC3769rc).c()), 1, null);
            if (!((Boolean) this.f35024b.invoke()).booleanValue()) {
                return lVar;
            }
            InterfaceC4044xs.a.a(this.f35025c, Ds.a.f25497a, new wn0.a() { // from class: com.fourthline.orca.internal.xa1
                @Override // wn0.a
                public final Object invoke() {
                    return C3768rb.c(this.f36698a, lVar);
                }
            }, null, 4, null);
            return new InterfaceC3949vk.p(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3768rb c3768rb) {
        c3768rb.f35023a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }

    private final boolean a(Rf rf2) {
        return rf2 instanceof C3085bb;
    }
}
