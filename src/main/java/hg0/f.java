package hg0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qj0.e<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f72768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<l> f72769b;

    public f(c cVar, qj0.i<l> iVar) {
        this.f72768a = cVar;
        this.f72769b = iVar;
    }

    public static f a(c cVar, qj0.i<l> iVar) {
        return new f(cVar, iVar);
    }

    public static b b(c cVar, l lVar) {
        return (b) qj0.h.d(cVar.c(lVar));
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b get() {
        return b(this.f72768a, this.f72769b.get());
    }
}
