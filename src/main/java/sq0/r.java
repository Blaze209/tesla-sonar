package sq0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f111584a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f111585b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f111586c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f111587d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private r f111588e = null;

    public abstract void a(y yVar);

    public void b(r rVar) {
        rVar.l();
        rVar.j(this);
        r rVar2 = this.f111586c;
        if (rVar2 == null) {
            this.f111585b = rVar;
            this.f111586c = rVar;
        } else {
            rVar2.f111588e = rVar;
            rVar.f111587d = rVar2;
            this.f111586c = rVar;
        }
    }

    public r c() {
        return this.f111585b;
    }

    public r d() {
        return this.f111586c;
    }

    public r e() {
        return this.f111588e;
    }

    public r f() {
        return this.f111584a;
    }

    public r g() {
        return this.f111587d;
    }

    public void h(r rVar) {
        rVar.l();
        r rVar2 = this.f111588e;
        rVar.f111588e = rVar2;
        if (rVar2 != null) {
            rVar2.f111587d = rVar;
        }
        rVar.f111587d = this;
        this.f111588e = rVar;
        r rVar3 = this.f111584a;
        rVar.f111584a = rVar3;
        if (rVar.f111588e == null) {
            rVar3.f111586c = rVar;
        }
    }

    public void i(r rVar) {
        rVar.l();
        r rVar2 = this.f111587d;
        rVar.f111587d = rVar2;
        if (rVar2 != null) {
            rVar2.f111588e = rVar;
        }
        rVar.f111588e = this;
        this.f111587d = rVar;
        r rVar3 = this.f111584a;
        rVar.f111584a = rVar3;
        if (rVar.f111587d == null) {
            rVar3.f111585b = rVar;
        }
    }

    protected void j(r rVar) {
        this.f111584a = rVar;
    }

    protected String k() {
        return "";
    }

    public void l() {
        r rVar = this.f111587d;
        if (rVar != null) {
            rVar.f111588e = this.f111588e;
        } else {
            r rVar2 = this.f111584a;
            if (rVar2 != null) {
                rVar2.f111585b = this.f111588e;
            }
        }
        r rVar3 = this.f111588e;
        if (rVar3 != null) {
            rVar3.f111587d = rVar;
        } else {
            r rVar4 = this.f111584a;
            if (rVar4 != null) {
                rVar4.f111586c = rVar;
            }
        }
        this.f111584a = null;
        this.f111588e = null;
        this.f111587d = null;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + k() + "}";
    }
}
