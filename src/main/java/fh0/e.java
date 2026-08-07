package fh0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements qj0.e<mg0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f65969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<h> f65970b;

    public e(b bVar, qj0.i<h> iVar) {
        this.f65969a = bVar;
        this.f65970b = iVar;
    }

    public static e a(b bVar, qj0.i<h> iVar) {
        return new e(bVar, iVar);
    }

    public static mg0.a b(b bVar, h hVar) {
        return (mg0.a) qj0.h.d(bVar.c(hVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public mg0.a get() {
        return b(this.f65969a, this.f65970b.get());
    }
}
