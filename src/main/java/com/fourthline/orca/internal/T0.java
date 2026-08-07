package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T0 implements Sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3392ik f27823a = new C3392ik("biometrics");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3906uk f27824b = new C3906uk(true, true, false, new C3743qs(new InterfaceC3949vk.x.c(null, 1, null), true, false, 4, null), 4, null);

    @Override // com.fourthline.orca.internal.Sf
    public C3392ik a() {
        return this.f27823a;
    }

    public abstract InterfaceC3949vk a(InterfaceC3364hy.a aVar);

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return new InterfaceC3949vk.x.c(this.f27824b);
    }

    protected final InterfaceC3949vk c() {
        return new InterfaceC3949vk.x.c(this.f27824b);
    }

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC3364hy.a) {
            return a((InterfaceC3364hy.a) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
