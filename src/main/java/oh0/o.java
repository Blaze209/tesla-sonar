package oh0;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f97466a;

    o(n nVar) {
        this.f97466a = nVar;
    }

    public static qj0.i<m.a> a(n nVar) {
        return qj0.f.a(new o(nVar));
    }

    @Override // oh0.m.a
    public m create() {
        return this.f97466a.b();
    }
}
