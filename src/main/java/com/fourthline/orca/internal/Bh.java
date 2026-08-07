package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Bh extends T0 {
    @Override // com.fourthline.orca.internal.T0
    public InterfaceC3949vk a(InterfaceC3364hy.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        if (aVar instanceof InterfaceC3364hy.a.C0567a) {
            return new InterfaceC3949vk.b(null, 1, null);
        }
        if (aVar instanceof InterfaceC3364hy.a.c) {
            InterfaceC3364hy.a.c cVar = (InterfaceC3364hy.a.c) aVar;
            return cVar.c() instanceof InterfaceC3919ux.a ? new InterfaceC3949vk.x.d(null, 1, null) : new InterfaceC3949vk.l(null, Pf.a(cVar.c()), 1, null);
        }
        if (aVar instanceof InterfaceC3364hy.a.d) {
            return c();
        }
        if (aVar instanceof InterfaceC3364hy.a.b) {
            throw new IllegalStateException("Not supported by KYC flow");
        }
        throw new NoWhenBranchMatchedException();
    }
}
