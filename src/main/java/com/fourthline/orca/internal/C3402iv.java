package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3402iv implements InterfaceC4101z5 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (p013kotlin.jvm.internal.s.f(navigationEffect, InterfaceC3275fv.a.f31877a)) {
            return new InterfaceC3949vk.b(null, 1, 0 == true ? 1 : 0);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
