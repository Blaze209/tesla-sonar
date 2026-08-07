package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3961vv extends T0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3906uk f36299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3949vk.b f36300d;

    public C3961vv() {
        C3906uk c3906uk = new C3906uk(false, false, false, new C3743qs(InterfaceC3949vk.v.f.f36225b, false, false, 4, null), 7, null);
        this.f36299c = c3906uk;
        this.f36300d = new InterfaceC3949vk.b(c3906uk);
    }

    @Override // com.fourthline.orca.internal.T0
    public InterfaceC3949vk a(InterfaceC3364hy.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        if (aVar instanceof InterfaceC3364hy.a.C0567a) {
            return this.f36300d;
        }
        if (aVar instanceof InterfaceC3364hy.a.c) {
            return new InterfaceC3949vk.v.a(this.f36299c);
        }
        if (aVar instanceof InterfaceC3364hy.a.d) {
            return this.f36300d;
        }
        if (aVar instanceof InterfaceC3364hy.a.b) {
            return new InterfaceC3949vk.m(((InterfaceC3364hy.a.b) aVar).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
