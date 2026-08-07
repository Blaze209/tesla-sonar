package ei0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qj0.e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<e> f62979a;

    public d(qj0.i<e> iVar) {
        this.f62979a = iVar;
    }

    public static d a(qj0.i<e> iVar) {
        return new d(iVar);
    }

    public static c c(e eVar) {
        return new c(eVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f62979a.get());
    }
}
