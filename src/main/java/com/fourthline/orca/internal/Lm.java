package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Lm implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f26828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3392ik f26829b;

    public Lm(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        this.f26828a = navigationChannel;
        this.f26829b = new C3392ik("document");
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f26829b;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return new InterfaceC3949vk.s.b(null, 1, null);
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f26828a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC3566mn.a) {
            return a((InterfaceC3566mn.a) navigationEffect);
        }
        if (navigationEffect instanceof An.c) {
            return a((An.c) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }

    private final InterfaceC3949vk a(InterfaceC3566mn.a aVar) {
        if (aVar instanceof InterfaceC3566mn.a.C0583a) {
            return new InterfaceC3949vk.d(null, 1, null);
        }
        if (aVar instanceof InterfaceC3566mn.a.b) {
            return new InterfaceC3949vk.s.c(null, 1, null);
        }
        if (aVar instanceof InterfaceC3566mn.a.c) {
            InterfaceC3566mn.a.c cVar = (InterfaceC3566mn.a.c) aVar;
            Im imC = cVar.c();
            if (imC instanceof Im.a) {
                return new InterfaceC3949vk.s.d(null, 1, null);
            }
            if (imC instanceof Im.b) {
                return new InterfaceC3949vk.l(null, Pf.a(cVar.c()), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(An.c cVar) {
        C3906uk c3906uk = new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.s.b(null, 1, null), false, false, 4, null), 7, null);
        if (cVar instanceof An.c.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (cVar instanceof An.c.C0471c) {
            An.c.C0471c c0471c = (An.c.C0471c) cVar;
            return c0471c.c() instanceof Im.a ? new InterfaceC3949vk.s.d(c3906uk) : new InterfaceC3949vk.l(null, Pf.a(c0471c.c()), 1, null);
        }
        if (cVar instanceof An.c.b) {
            An.c.b bVar = (An.c.b) cVar;
            Im imC = bVar.c();
            if (imC instanceof Im.a) {
                return new InterfaceC3949vk.s.d(c3906uk);
            }
            if (imC instanceof Im.b) {
                return new InterfaceC3949vk.l(null, Pf.a(bVar.c()), 1, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (cVar instanceof An.c.d) {
            if (((An.c.d) cVar).c() instanceof Jn.b) {
                return new InterfaceC3949vk.d(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.i.b(null, 1, null), false, false, 6, null), 7, null));
            }
            return new InterfaceC3949vk.d(new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.j.d(null, 1, null), false, false, 6, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
