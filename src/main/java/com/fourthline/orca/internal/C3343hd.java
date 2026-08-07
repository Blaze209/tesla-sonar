package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3343hd implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f32280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4044xs f32281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f32282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk f32283d;

    public C3343hd(InterfaceC3863tk navigationChannel, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f32280a = navigationChannel;
        this.f32281b = popupHandler;
        this.f32282c = new C3392ik("eid");
        this.f32283d = InterfaceC3949vk.k.d.f36170b;
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f32281b, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.l31
            @Override // wn0.a
            public final Object invoke() {
                return C3343hd.a(this.f33218a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f32282c;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f32283d;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(InterfaceC3556md navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f32280a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof C3134ci) {
            return c();
        }
        if (navigationEffect instanceof C3561mi) {
            return new InterfaceC3949vk.k.c(null, 1, null);
        }
        if (navigationEffect instanceof InterfaceC3557me) {
            return a((InterfaceC3557me) navigationEffect);
        }
        if (navigationEffect instanceof Zf) {
            return a((Zf) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC2970Uc) {
            return a((InterfaceC2970Uc) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC2890Jd.c) {
            return a((InterfaceC2890Jd.c) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC2864Ee) {
            return a((InterfaceC2864Ee) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    private final InterfaceC3949vk a(Zf zf2) {
        if (zf2 instanceof Zf.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (zf2 instanceof Zf.c) {
            Zf.c cVar = (Zf.c) zf2;
            InterfaceC3172dd interfaceC3172ddC = cVar.c();
            if (interfaceC3172ddC instanceof InterfaceC3172dd.b) {
                return new InterfaceC3949vk.k.f(null, 1, null);
            }
            if (interfaceC3172ddC instanceof InterfaceC3172dd.a) {
                return new InterfaceC3949vk.l(null, ((InterfaceC3172dd.a) cVar.c()).a(), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (zf2 instanceof Zf.b) {
            return new InterfaceC3949vk.m(((Zf.b) zf2).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(InterfaceC2970Uc interfaceC2970Uc) {
        if (interfaceC2970Uc instanceof InterfaceC2970Uc.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (interfaceC2970Uc instanceof InterfaceC2970Uc.b) {
            return InterfaceC3949vk.k.e.f36172b;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(InterfaceC2890Jd.c cVar) {
        if (cVar instanceof InterfaceC2890Jd.c.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (cVar instanceof InterfaceC2890Jd.c.b) {
            return InterfaceC3949vk.k.e.f36172b;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(InterfaceC3557me interfaceC3557me) {
        if (interfaceC3557me instanceof InterfaceC3557me.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (interfaceC3557me instanceof InterfaceC3557me.d) {
            return InterfaceC3949vk.k.g.f36176b;
        }
        if (interfaceC3557me instanceof InterfaceC3557me.c) {
            return new InterfaceC3949vk.k.c(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.k.c(null, 1, null), true, false, 4, null), 7, null));
        }
        if (interfaceC3557me instanceof InterfaceC3557me.b) {
            return new InterfaceC3949vk.k.a(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.k.f(null, 1, null), true, false, 4, null), 7, null));
        }
        if (interfaceC3557me instanceof InterfaceC3557me.e) {
            return new InterfaceC3949vk.k.f(new C3906uk(false, false, false, new C3743qs(InterfaceC3949vk.k.e.f36172b, true, false, 4, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(InterfaceC2864Ee interfaceC2864Ee) {
        if (interfaceC2864Ee instanceof InterfaceC2864Ee.a) {
            return new InterfaceC3949vk.m(((InterfaceC2864Ee.a) interfaceC2864Ee).c());
        }
        if (interfaceC2864Ee instanceof InterfaceC2864Ee.b) {
            return new InterfaceC3949vk.l(null, Pf.a(((InterfaceC2864Ee.b) interfaceC2864Ee).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3343hd c3343hd) {
        c3343hd.f32280a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
