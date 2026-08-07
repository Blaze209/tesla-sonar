package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3999wq implements InterfaceC3956vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kp f36526a;

    public C3999wq(Kp personBundle) {
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        this.f36526a = personBundle;
    }

    public void a(G5 g11) {
        this.f36526a.q().d(g11 != null ? g11.c() : null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3956vq
    public void b(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f36526a.q().a(value);
    }

    @Override // com.fourthline.orca.internal.Ei
    public void a(InterfaceC3447jx interfaceC3447jx) {
        C4042xq c4042xq = interfaceC3447jx instanceof C4042xq ? (C4042xq) interfaceC3447jx : null;
        a(c4042xq != null ? c4042xq.b() : null);
    }
}
