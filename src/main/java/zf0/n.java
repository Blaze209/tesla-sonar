package zf0;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements qj0.e<eg0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f128241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qj0.i<eg0.b> f128242b;

    public n(m mVar, qj0.i<eg0.b> iVar) {
        this.f128241a = mVar;
        this.f128242b = iVar;
    }

    public static eg0.a a(m mVar, pj0.a<eg0.b> aVar) {
        return (eg0.a) qj0.h.d(mVar.a(aVar));
    }

    public static n b(m mVar, qj0.i<eg0.b> iVar) {
        return new n(mVar, iVar);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public eg0.a get() {
        return a(this.f128241a, qj0.d.c(this.f128242b));
    }
}
