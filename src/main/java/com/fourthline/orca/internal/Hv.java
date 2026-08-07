package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesError;

/* JADX INFO: loaded from: classes4.dex */
public final class Hv implements InterfaceC4101z5 {
    @Override // com.fourthline.orca.internal.InterfaceC4101z5
    public InterfaceC3949vk b(MD navigationEffect) {
        p013kotlin.jvm.internal.s.k(navigationEffect, "navigationEffect");
        if (p013kotlin.jvm.internal.s.f(navigationEffect, Dv.c.b.f25512a)) {
            return new InterfaceC3949vk.m(QesError.Canceled.INSTANCE);
        }
        if (navigationEffect instanceof Dv.c.C0482c) {
            return new InterfaceC3949vk.l(null, Pf.a(((Dv.c.C0482c) navigationEffect).c()), 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(navigationEffect, Dv.c.a.f25511a)) {
            return new InterfaceC3949vk.v.a(null, 1, null);
        }
        throw new IllegalArgumentException(navigationEffect + " is not supported by this coordinator");
    }
}
