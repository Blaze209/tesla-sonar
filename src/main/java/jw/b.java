package jw;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements qj0.e<com.google.firebase.perf.config.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84360a;

    public b(a aVar) {
        this.f84360a = aVar;
    }

    public static b a(a aVar) {
        return new b(aVar);
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) qj0.h.d(aVar.a());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.a get() {
        return c(this.f84360a);
    }
}
