package ah0;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f1057a;

    d(c cVar) {
        this.f1057a = cVar;
    }

    public static qj0.i<b.a> b(c cVar) {
        return qj0.f.a(new d(cVar));
    }

    @Override // ah0.b.a
    public b a(String str, boolean z11) {
        return this.f1057a.b(str, z11);
    }
}
