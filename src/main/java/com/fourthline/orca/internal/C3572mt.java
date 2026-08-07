package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3572mt implements InterfaceC4101z5 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (p013kotlin.jvm.internal.s.f(navigationEffect, InterfaceC3443jt.b.f32839a)) {
            return InterfaceC3949vk.v.h.f36229b;
        }
        if (p013kotlin.jvm.internal.s.f(navigationEffect, InterfaceC3443jt.c.f32840a)) {
            return InterfaceC3949vk.v.e.f36223b;
        }
        if (p013kotlin.jvm.internal.s.f(navigationEffect, InterfaceC3443jt.a.f32838a)) {
            return new InterfaceC3949vk.d(null, 1, 0 == true ? 1 : 0);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
