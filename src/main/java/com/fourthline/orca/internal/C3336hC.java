package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3336hC implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gy f32248b;

    public C3336hC(boolean z11, Gy skipTinDetailsUseCase) {
        p013kotlin.jvm.internal.s.k(skipTinDetailsUseCase, "skipTinDetailsUseCase");
        this.f32247a = z11;
        this.f32248b = skipTinDetailsUseCase;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        Object bVar;
        if (this.f32248b.a()) {
            bVar = b() ? InterfaceC3805sB.a.f35228a : new InterfaceC3805sB.b(null, 1, null);
        } else {
            bVar = InterfaceC3805sB.c.f35230a;
        }
        return p013kotlin.collections.v.e(bVar);
    }

    public boolean b() {
        return this.f32247a;
    }
}
