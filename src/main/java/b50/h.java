package b50;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements f.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f16674a;

    h(g gVar) {
        this.f16674a = gVar;
    }

    public static qj0.i<f.d> b(g gVar) {
        return qj0.f.a(new h(gVar));
    }

    @Override // b50.f.d
    public f a(ManualEntryState manualEntryState) {
        return this.f16674a.b(manualEntryState);
    }
}
