package hg0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qj0.e<g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f72764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<r> f72765b;

    public d(c cVar, qj0.i<r> iVar) {
        this.f72764a = cVar;
        this.f72765b = iVar;
    }

    public static g a(c cVar, r rVar) {
        return (g) qj0.h.d(cVar.a(rVar));
    }

    public static d b(c cVar, qj0.i<r> iVar) {
        return new d(cVar, iVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g get() {
        return a(this.f72764a, this.f72765b.get());
    }
}
