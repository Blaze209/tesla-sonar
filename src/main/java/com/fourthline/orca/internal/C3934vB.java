package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3934vB extends G0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3863tk f36049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3392ik f36050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3906uk f36051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3906uk f36052e;

    public C3934vB(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        this.f36049b = navigationChannel;
        this.f36050c = new C3392ik("tin");
        this.f36051d = new C3906uk(false, false, false, new C3743qs(InterfaceC3949vk.y.c.f36241b, false, false, 4, null), 7, null);
        this.f36052e = new C3906uk(true, true, false, new C3743qs(new InterfaceC3949vk.y.d(null, 1, null), true, false), 4, null);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f36050c;
    }

    @Override // com.fourthline.orca.internal.G0
    protected InterfaceC3949vk c() {
        return new InterfaceC3949vk.y.d(this.f36052e);
    }

    @Override // com.fourthline.orca.internal.G0
    public InterfaceC3949vk a(InterfaceC2937Ta.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        if (aVar instanceof InterfaceC2937Ta.a.C0518a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (aVar instanceof InterfaceC2937Ta.a.d) {
            InterfaceC2937Ta.a.d dVar = (InterfaceC2937Ta.a.d) aVar;
            Of ofC = dVar.c();
            if (ofC instanceof InterfaceC3805sB.c) {
                return new InterfaceC3949vk.y.b(this.f36051d);
            }
            return ofC instanceof InterfaceC3805sB.a ? new InterfaceC3949vk.y.e(null, 1, null) : new InterfaceC3949vk.l(null, Pf.a(dVar.c()), 1, null);
        }
        if ((aVar instanceof InterfaceC2937Ta.a.c) || (aVar instanceof InterfaceC2937Ta.a.e) || (aVar instanceof InterfaceC2937Ta.a.b)) {
            throw new IllegalStateException("Developer error. Not part of TIN flow");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC2937Ta.a) {
            this.f36049b.mo85trySendJP2dKIU(a((InterfaceC2937Ta.a) navigationEffect));
            return;
        }
        throw new IllegalStateException("Developer error. Not part of TIN flow");
    }
}
