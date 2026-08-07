package hk0;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lk0.q f73043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected q f73044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f73045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lk0.g f73047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f73048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f73049g;

    protected j(lk0.q qVar, boolean z11) {
        this.f73045c = false;
        this.f73046d = 0;
        this.f73047e = null;
        this.f73048f = false;
        this.f73049g = false;
        lk0.r.a(qVar);
        qVar = z11 ? qVar : i.l(qVar);
        this.f73043a = qVar;
        this.f73044b = new q(qVar);
    }

    protected Object a(boolean z11) {
        try {
            j jVar = (j) super.clone();
            if (!z11) {
                return jVar;
            }
            jVar.f73044b = (q) this.f73044b.clone();
            return jVar;
        } catch (CloneNotSupportedException e11) {
            throw new RuntimeException("Failed to clone BeansWrapperConfiguration", e11);
        }
    }

    public int b() {
        return this.f73046d;
    }

    public lk0.q c() {
        return this.f73043a;
    }

    public t d() {
        return this.f73044b.d();
    }

    public lk0.g e() {
        return this.f73047e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f73043a.equals(jVar.f73043a) && this.f73045c == jVar.f73045c && this.f73046d == jVar.f73046d && this.f73047e == jVar.f73047e && this.f73048f == jVar.f73048f && this.f73049g == jVar.f73049g && this.f73044b.equals(jVar.f73044b);
    }

    public boolean f() {
        return this.f73049g;
    }

    public boolean g() {
        return this.f73045c;
    }

    public boolean h() {
        return this.f73048f;
    }

    public int hashCode() {
        int iHashCode = (((((this.f73043a.hashCode() + 31) * 31) + (this.f73045c ? 1231 : 1237)) * 31) + this.f73046d) * 31;
        lk0.g gVar = this.f73047e;
        return ((((((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + (this.f73048f ? 1231 : 1237)) * 31) + (this.f73049g ? 1231 : 1237)) * 31) + this.f73044b.hashCode();
    }

    public void i(t tVar) {
        this.f73044b.h(tVar);
    }

    protected j(lk0.q qVar) {
        this(qVar, false);
    }
}
