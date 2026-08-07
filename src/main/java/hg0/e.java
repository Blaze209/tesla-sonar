package hg0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f72766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<j> f72767b;

    public e(c cVar, qj0.i<j> iVar) {
        this.f72766a = cVar;
        this.f72767b = iVar;
    }

    public static e a(c cVar, qj0.i<j> iVar) {
        return new e(cVar, iVar);
    }

    public static a b(c cVar, j jVar) {
        return (a) qj0.h.d(cVar.b(jVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a get() {
        return b(this.f72766a, this.f72767b.get());
    }
}
