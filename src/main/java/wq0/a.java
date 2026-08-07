package wq0;

/* JADX INFO: loaded from: classes10.dex */
class a implements Runnable, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f122249a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f122250b;

    a(c cVar) {
        this.f122250b = cVar;
    }

    @Override // wq0.k
    public void a(p pVar, Object obj) {
        this.f122249a.a(i.a(pVar, obj));
        this.f122250b.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVarB = this.f122249a.b();
        if (iVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f122250b.g(iVarB);
    }
}
