package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2935Sd implements InterfaceC2930Rd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f27775a;

    public C2935Sd(C2899Lc eidBundle) {
        p013kotlin.jvm.internal.s.k(eidBundle, "eidBundle");
        this.f27775a = eidBundle;
    }

    @Override // com.fourthline.orca.internal.InterfaceC2930Rd
    public void a(String pin) {
        p013kotlin.jvm.internal.s.k(pin, "pin");
        this.f27775a.c(pin);
    }

    @Override // com.fourthline.orca.internal.InterfaceC2930Rd
    public String b() {
        return this.f27775a.e();
    }

    @Override // com.fourthline.orca.internal.InterfaceC2930Rd
    public String a() {
        return this.f27775a.f();
    }
}
