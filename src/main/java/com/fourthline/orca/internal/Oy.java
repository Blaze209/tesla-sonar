package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Oy implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f27258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3392ik f27259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3906uk f27260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk f27261d;

    public Oy(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        this.f27258a = navigationChannel;
        this.f27259b = new C3392ik("biometrics");
        C3906uk c3906uk = new C3906uk(true, true, false, new C3743qs(new InterfaceC3949vk.w.b(null, 1, null), true, false, 4, null), 4, null);
        this.f27260c = c3906uk;
        this.f27261d = new InterfaceC3949vk.w.b(c3906uk);
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f27259b;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f27261d;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f27258a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC3364hy.a) {
            return a((InterfaceC3364hy.a) navigationEffect);
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    private final InterfaceC3949vk a(InterfaceC3364hy.a aVar) {
        if (aVar instanceof InterfaceC3364hy.a.C0567a) {
            return new InterfaceC3949vk.m(AbstractC3397ip.a.f32573a);
        }
        if (aVar instanceof InterfaceC3364hy.a.d) {
            return b();
        }
        if (aVar instanceof InterfaceC3364hy.a.c) {
            return new InterfaceC3949vk.n(new InterfaceC3740qp.b(((InterfaceC3364hy.a.c) aVar).d()));
        }
        if (aVar instanceof InterfaceC3364hy.a.b) {
            return new InterfaceC3949vk.m(((InterfaceC3364hy.a.b) aVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
