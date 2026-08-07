package e50;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f62067a;

    l(k kVar) {
        this.f62067a = kVar;
    }

    public static qj0.i<i.d> b(k kVar) {
        return qj0.f.a(new l(kVar));
    }

    @Override // e50.i.d
    public i a(NetworkingLinkSignupState networkingLinkSignupState) {
        return this.f62067a.b(networkingLinkSignupState);
    }
}
