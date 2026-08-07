package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.kf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3472kf implements InterfaceC3429jf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XA f32968a;

    public C3472kf(XA tinBundle) {
        p013kotlin.jvm.internal.s.k(tinBundle, "tinBundle");
        this.f32968a = tinBundle;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3429jf
    public void a(String tin, MA taxationCountry) {
        p013kotlin.jvm.internal.s.k(tin, "tin");
        p013kotlin.jvm.internal.s.k(taxationCountry, "taxationCountry");
        XA xa2 = this.f32968a;
        if (xa2.c() == null) {
            xa2.a(taxationCountry.d());
            xa2.b(tin);
        }
    }
}
