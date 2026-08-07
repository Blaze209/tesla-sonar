package jw;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements qj0.e<com.google.firebase.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84361a;

    public c(a aVar) {
        this.f84361a = aVar;
    }

    public static c a(a aVar) {
        return new c(aVar);
    }

    public static com.google.firebase.f c(a aVar) {
        return (com.google.firebase.f) qj0.h.d(aVar.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.f get() {
        return c(this.f84361a);
    }
}
