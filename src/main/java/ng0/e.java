package ng0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f95003a;

    public e(d dVar) {
        this.f95003a = dVar;
    }

    public static e a(d dVar) {
        return new e(dVar);
    }

    public static a c(d dVar) {
        return (a) qj0.h.d(dVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f95003a);
    }
}
