package ng0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements qj0.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f95004a;

    public f(d dVar) {
        this.f95004a = dVar;
    }

    public static f a(d dVar) {
        return new f(dVar);
    }

    public static a c(d dVar) {
        return (a) qj0.h.d(dVar.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f95004a);
    }
}
