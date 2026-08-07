package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3929v6 implements InterfaceC3452k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0 f36020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f36021b;

    public C3929v6(W0 bavBundle) {
        p013kotlin.jvm.internal.s.k(bavBundle, "bavBundle");
        this.f36020a = bavBundle;
        BavPaymentMethod bavPaymentMethodA = bavBundle.a();
        this.f36021b = bavPaymentMethodA != null ? bavPaymentMethodA.getAmount() : 0;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3452k1
    public String a() {
        return this.f36020a.b();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3452k1
    public List b() {
        return this.f36020a.e();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3452k1
    public int c() {
        return this.f36021b;
    }
}
