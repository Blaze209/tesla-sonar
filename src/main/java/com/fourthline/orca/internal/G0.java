package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G0 implements Sf, ND {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3906uk f25887a = new C3906uk(true, true, false, new C3743qs(new InterfaceC3949vk.i.e(null, 1, null), true, false), 4, null);

    public abstract InterfaceC3949vk a(InterfaceC2937Ta.a aVar);

    @Override // com.fourthline.orca.internal.Sf
    public InterfaceC3949vk b() {
        return c();
    }

    protected abstract InterfaceC3949vk c();

    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (navigationEffect instanceof InterfaceC2937Ta.a) {
            return a((InterfaceC2937Ta.a) navigationEffect);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
