package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Ul implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f28804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3392ik f28805b;

    public Ul(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        this.f28804a = navigationChannel;
        this.f28805b = new C3392ik("document");
    }

    private final C3906uk c() {
        return new C3906uk(false, false, false, new C3743qs(new InterfaceC3949vk.r.d(null, 1, null), true, false, 4, null), 7, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f28805b;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return InterfaceC3949vk.r.b.f36191b;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f28804a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC3779rm) {
            return a((InterfaceC3779rm) navigationEffect);
        }
        if (navigationEffect instanceof An.c) {
            return a((An.c) navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3566mn.a) {
            return a((InterfaceC3566mn.a) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    private final InterfaceC3949vk a(InterfaceC3779rm interfaceC3779rm) {
        if (interfaceC3779rm instanceof InterfaceC3779rm.a) {
            return new InterfaceC3949vk.d(null, 1, null);
        }
        if (interfaceC3779rm instanceof InterfaceC3779rm.b) {
            return new InterfaceC3949vk.r.c(null, 1, null);
        }
        if (interfaceC3779rm instanceof InterfaceC3779rm.c) {
            return new InterfaceC3949vk.l(null, Pf.a(((InterfaceC3779rm.c) interfaceC3779rm).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(InterfaceC3566mn.a aVar) {
        if (aVar instanceof InterfaceC3566mn.a.C0583a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (aVar instanceof InterfaceC3566mn.a.b) {
            return new InterfaceC3949vk.r.d(null, 1, null);
        }
        if (aVar instanceof InterfaceC3566mn.a.c) {
            return new InterfaceC3949vk.l(null, Pf.a(((InterfaceC3566mn.a.c) aVar).c()), 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final InterfaceC3949vk a(An.c cVar) {
        if (cVar instanceof An.c.a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (cVar instanceof An.c.C0471c) {
            return new InterfaceC3949vk.l(c(), Pf.a(((An.c.C0471c) cVar).c()));
        }
        if (cVar instanceof An.c.b) {
            return new InterfaceC3949vk.l(c(), Pf.a(((An.c.b) cVar).c()));
        }
        if (cVar instanceof An.c.d) {
            return new InterfaceC3949vk.b(new C3906uk(false, false, false, new C3743qs(InterfaceC3949vk.r.b.f36191b, false, false, 4, null), 7, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
