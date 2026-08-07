package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class Q7 implements P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q5 f27423a;

    public Q7(Q5 countryValidator) {
        p013kotlin.jvm.internal.s.k(countryValidator, "countryValidator");
        this.f27423a = countryValidator;
    }

    @Override // com.fourthline.orca.internal.P0
    public P0.a a(InterfaceC3447jx selection) {
        p013kotlin.jvm.internal.s.k(selection, "selection");
        return this.f27423a.a((G5) selection) ? P0.a.b.f27265a : new P0.a.C0511a(AbstractC3641oc.g.f34200a);
    }
}
