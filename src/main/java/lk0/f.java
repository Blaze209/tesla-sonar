package lk0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f extends hk0.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f90055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f90056i;

    protected f(q qVar) {
        super(d.l(qVar), true);
        this.f90055h = c().c() >= r.f90080e;
        this.f90056i = true;
    }

    @Override // hk0.j
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f90055h == fVar.k() && this.f90056i == fVar.f90056i;
    }

    @Override // hk0.j
    public int hashCode() {
        return (((super.hashCode() * 31) + (this.f90055h ? 1231 : 1237)) * 31) + (this.f90056i ? 1231 : 1237);
    }

    public boolean j() {
        return this.f90056i;
    }

    public boolean k() {
        return this.f90055h;
    }
}
