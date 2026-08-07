package pq;

/* JADX INFO: loaded from: classes4.dex */
final class s<T> implements nq.i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f103624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f103625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nq.c f103626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nq.h<T, byte[]> f103627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t f103628e;

    s(p pVar, String str, nq.c cVar, nq.h<T, byte[]> hVar, t tVar) {
        this.f103624a = pVar;
        this.f103625b = str;
        this.f103626c = cVar;
        this.f103627d = hVar;
        this.f103628e = tVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // nq.i
    public void a(nq.d<T> dVar) {
        b(dVar, new nq.k() { // from class: pq.r
            @Override // nq.k
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    @Override // nq.i
    public void b(nq.d<T> dVar, nq.k kVar) {
        this.f103628e.a(o.a().e(this.f103624a).c(dVar).f(this.f103625b).d(this.f103627d).b(this.f103626c).a(), kVar);
    }

    p d() {
        return this.f103624a;
    }
}
