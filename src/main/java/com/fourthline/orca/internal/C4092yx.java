package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4092yx implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3863tk f37143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4101z5 f37144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4101z5 f37145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3392ik f37146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC3949vk f37147e;

    public C4092yx(InterfaceC3863tk navigationChannel, InterfaceC4101z5 selfieIntroCoordinator, InterfaceC4101z5 selfieScannerCoordinator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(selfieIntroCoordinator, "selfieIntroCoordinator");
        p013kotlin.jvm.internal.s.k(selfieScannerCoordinator, "selfieScannerCoordinator");
        this.f37143a = navigationChannel;
        this.f37144b = selfieIntroCoordinator;
        this.f37145c = selfieScannerCoordinator;
        this.f37146d = new C3392ik("biometrics");
        this.f37147e = InterfaceC3949vk.x.b.f36233b;
    }

    private final InterfaceC3949vk c(MD md2) {
        InterfaceC3949vk interfaceC3949vkB = this.f37145c.b(md2);
        return interfaceC3949vkB instanceof InterfaceC3949vk.d ? new InterfaceC3949vk.b(null, 1, null) : interfaceC3949vkB;
    }

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f37146d;
    }

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return this.f37147e;
    }

    @Override // com.fourthline.orca.internal.ND
    public void a(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        this.f37143a.mo85trySendJP2dKIU(b(navigationEffect));
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof Nx) {
            return this.f37144b.b(navigationEffect);
        }
        if (navigationEffect instanceof InterfaceC3364hy.a) {
            return c(navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
