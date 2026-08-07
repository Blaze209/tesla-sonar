package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Mq extends G0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3863tk f26962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f26963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3906uk f26964d;

    public Mq(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        this.f26962b = navigationChannel;
        this.f26963c = new C3392ik("poa");
        this.f26964d = new C3906uk(true, true, false, new C3743qs(new InterfaceC3949vk.u.e(null, 1, null), true, false), 4, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f26963c;
    }

    @Override // com.fourthline.orca.internal.G0
    protected InterfaceC3949vk c() {
        return new InterfaceC3949vk.u.e(this.f26964d);
    }

    @Override // com.fourthline.orca.internal.G0
    public InterfaceC3949vk a(InterfaceC2937Ta.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        if (aVar instanceof InterfaceC2937Ta.a.C0518a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (aVar instanceof InterfaceC2937Ta.a.d) {
            InterfaceC2937Ta.a.d dVar = (InterfaceC2937Ta.a.d) aVar;
            return dVar.c() instanceof InterfaceC3442js.a ? new InterfaceC3949vk.u.f(null, 1, null) : new InterfaceC3949vk.l(null, Pf.a(dVar.c()), 1, null);
        }
        if ((aVar instanceof InterfaceC2937Ta.a.c) || (aVar instanceof InterfaceC2937Ta.a.e) || (aVar instanceof InterfaceC2937Ta.a.b)) {
            throw new IllegalStateException("Developer error. Not part of Proof of Address flow");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f26962b.mo85trySendJP2dKIU(b(navigationEffect));
    }
}
