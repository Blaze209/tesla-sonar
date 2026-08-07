package f50;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f64511a;

    f(e eVar) {
        this.f64511a = eVar;
    }

    public static i<d.c> b(e eVar) {
        return qj0.f.a(new f(eVar));
    }

    @Override // f50.d.c
    public d a(NetworkingLinkVerificationState networkingLinkVerificationState) {
        return this.f64511a.b(networkingLinkVerificationState);
    }
}
