package ei0;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements qj0.e<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f62981a;

    public g(f fVar) {
        this.f62981a = fVar;
    }

    public static g a(f fVar) {
        return new g(fVar);
    }

    public static e b(f fVar) {
        return (e) qj0.h.d(fVar.getExternalInquiryController());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e get() {
        return b(this.f62981a);
    }
}
