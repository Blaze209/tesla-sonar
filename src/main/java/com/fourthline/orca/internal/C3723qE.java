package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3723qE implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f34778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3392ik f34779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3949vk f34780c;

    public C3723qE(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        this.f34778a = navigationChannel;
        this.f34779b = new C3392ik("workflow_loading");
        this.f34780c = InterfaceC3949vk.A.b.f36126b;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f34780c;
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f34779b;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof GE) {
            return new InterfaceC3949vk.l(null, Pf.a(((GE) navigationEffect).c()), 1, null);
        }
        if (navigationEffect instanceof FE) {
            return new InterfaceC3949vk.m(((FE) navigationEffect).c());
        }
        throw new IllegalStateException((navigationEffect + " is not supported by this coordinator").toString());
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(BE navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f34778a.mo85trySendJP2dKIU(b(navigationEffect));
    }
}
