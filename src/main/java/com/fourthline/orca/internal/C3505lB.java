package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3505lB implements InterfaceC3462kB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XA f33259a;

    public C3505lB(XA tinBundle) {
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        this.f33259a = tinBundle;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3462kB
    public void a(C3419jB tinDetails) {
        p013kotlin.jvm.internal.s.k(tinDetails, "tinDetails");
        XA xa2 = this.f33259a;
        xa2.a(tinDetails.b().d());
        xa2.b(tinDetails.a());
    }
}
