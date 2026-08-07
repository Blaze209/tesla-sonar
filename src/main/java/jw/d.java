package jw;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements qj0.e<zv.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f84362a;

    public d(a aVar) {
        this.f84362a = aVar;
    }

    public static d a(a aVar) {
        return new d(aVar);
    }

    public static zv.f c(a aVar) {
        return (zv.f) qj0.h.d(aVar.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public zv.f get() {
        return c(this.f84362a);
    }
}
