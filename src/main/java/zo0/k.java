package zo0;

/* JADX INFO: loaded from: classes9.dex */
public class k extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f128480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f128481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f128482g;

    public k(e eVar, c cVar) {
        this.f128480e = eVar;
        this.f128481f = cVar;
    }

    @Override // zo0.e
    public boolean c(Exception exc) {
        return this.f128480e.c(exc);
    }

    @Override // zo0.e
    public void e() {
        this.f128480e.e();
    }

    @Override // zo0.e
    public j f(f fVar) {
        if (!h()) {
            return this.f128480e.f(fVar);
        }
        return this.f128481f.b(this.f128480e.f(this.f128481f.a(fVar)));
    }

    public void g() {
        this.f128482g = true;
    }

    public boolean h() {
        return this.f128482g;
    }
}
