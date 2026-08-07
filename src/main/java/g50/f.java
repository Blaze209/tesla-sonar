package g50;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d.InterfaceC1383d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f67443a;

    f(e eVar) {
        this.f67443a = eVar;
    }

    public static i<d.InterfaceC1383d> b(e eVar) {
        return qj0.f.a(new f(eVar));
    }

    @Override // g50.d.InterfaceC1383d
    public d a(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState) {
        return this.f67443a.b(networkingSaveToLinkVerificationState);
    }
}
