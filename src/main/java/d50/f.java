package d50;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d.InterfaceC1217d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f59621a;

    f(e eVar) {
        this.f59621a = eVar;
    }

    public static i<d.InterfaceC1217d> b(e eVar) {
        return qj0.f.a(new f(eVar));
    }

    @Override // d50.d.InterfaceC1217d
    public d a(NetworkingLinkLoginWarmupState networkingLinkLoginWarmupState) {
        return this.f59621a.b(networkingLinkLoginWarmupState);
    }
}
