package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Rp implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f27643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3208eD f27644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3208eD f27645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4044xs f27646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3392ik f27647e;

    public Rp(InterfaceC3863tk navigationChannel, C3208eD skipNationalityUseCase, C3208eD skipPersonDetailsUseCase, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(skipNationalityUseCase, "skipNationalityUseCase");
        p013kotlin.jvm.internal.s.k(skipPersonDetailsUseCase, "skipPersonDetailsUseCase");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        this.f27643a = navigationChannel;
        this.f27644b = skipNationalityUseCase;
        this.f27645c = skipPersonDetailsUseCase;
        this.f27646d = popupHandler;
        this.f27647e = new C3392ik("person");
    }

    private final InterfaceC3949vk c() {
        InterfaceC4044xs.a.a(this.f27646d, Ds.b.f25500a, new wn0.a() { // from class: com.fourthline.orca.internal.qn0
            @Override // wn0.a
            public final Object invoke() {
                return Rp.a(this.f34866a);
            }
        }, null, 4, null);
        return new InterfaceC3949vk.p(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f27647e;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        if (this.f27644b.a(true)) {
            return InterfaceC3949vk.t.c.f36205b;
        }
        return this.f27645c.a(true) ? new InterfaceC3949vk.t.b(null, 1, null) : new InterfaceC3949vk.t.b(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(InterfaceC3612nq navigationEffect) {
        InterfaceC3949vk interfaceC3949vkA;
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof O9.c) {
            interfaceC3949vkA = a((O9.c) navigationEffect);
        } else {
            if (!(navigationEffect instanceof Cq.a)) {
                throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
            }
            interfaceC3949vkA = a((Cq.a) navigationEffect);
        }
        this.f27643a.mo85trySendJP2dKIU(interfaceC3949vkA);
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof O9.c) {
            return a((O9.c) navigationEffect);
        }
        if (navigationEffect instanceof Cq.a) {
            return a((Cq.a) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    private final InterfaceC3949vk a(O9.c cVar) {
        if (cVar instanceof O9.c.a) {
            return c();
        }
        if (cVar instanceof O9.c.C0508c) {
            O9.c.C0508c c0508c = (O9.c.C0508c) cVar;
            return c0508c.c() instanceof Pp.b ? InterfaceC3949vk.t.c.f36205b : new InterfaceC3949vk.l(null, Pf.a(c0508c.c()), 1, null);
        }
        if (cVar instanceof O9.c.b) {
            return new InterfaceC3949vk.m(((O9.c.b) cVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(Cq.a aVar) {
        if (p013kotlin.jvm.internal.s.f(aVar, Cq.a.C0479a.f25263a)) {
            if (this.f27644b.a(false)) {
                return c();
            }
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (aVar instanceof Cq.a.b) {
            Cq.a.b bVar = (Cq.a.b) aVar;
            bVar.c();
            return new InterfaceC3949vk.l(null, Pf.a(bVar.c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Rp rp2) {
        rp2.f27643a.mo85trySendJP2dKIU(new InterfaceC3949vk.m(KycError.Canceled.INSTANCE));
        return jn0.h0.f84049a;
    }
}
