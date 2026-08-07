package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Oz {
    public final InterfaceC3624o1 a() {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return new Jz(jn0.s.b(new InterfaceC3624o1.c(new InterfaceC3624o1.BavConfirmIbanResult(true))), 0L, 2, null);
    }

    public final InterfaceC3700ps b() {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return new Zz(jn0.s.b(new G2.b(new BavStatus(O2.COMPLETED))), 0L, 2, null);
    }

    public final InterfaceC3839t2 c() {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return new Mz(jn0.s.b(new InterfaceC3839t2.c(new InterfaceC3839t2.BavStartPaymentResult("tink", new AbstractC3582n2.Tink("https://external/pay")))), 0L, 2, null);
    }

    public final N2 d() {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return new Nz(jn0.s.b(new N2.d(new N2.BavValidateIbanResult(true, "XX00000000000", null))), 0L, 2, null);
    }
}
