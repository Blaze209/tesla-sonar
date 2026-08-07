package jw;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements qj0.e<yv.b<com.google.firebase.remoteconfig.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84363a;

    public e(a aVar) {
        this.f84363a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static yv.b<com.google.firebase.remoteconfig.c> c(a aVar) {
        return (yv.b) qj0.h.d(aVar.d());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public yv.b<com.google.firebase.remoteconfig.c> get() {
        return c(this.f84363a);
    }
}
