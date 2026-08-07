package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f20861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile e f20862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile e f20863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.a f20864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.a f20865f;

    public b(Object obj, f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f20864e = aVar;
        this.f20865f = aVar;
        this.f20860a = obj;
        this.f20861b = fVar;
    }

    private boolean k(e eVar) {
        f.a aVar = this.f20864e;
        f.a aVar2 = f.a.FAILED;
        if (aVar != aVar2) {
            return eVar.equals(this.f20862c);
        }
        if (!eVar.equals(this.f20863d)) {
            return false;
        }
        f.a aVar3 = this.f20865f;
        return aVar3 == f.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean l() {
        f fVar = this.f20861b;
        return fVar == null || fVar.j(this);
    }

    private boolean m() {
        f fVar = this.f20861b;
        return fVar == null || fVar.c(this);
    }

    private boolean n() {
        f fVar = this.f20861b;
        return fVar == null || fVar.e(this);
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean a() {
        boolean z11;
        synchronized (this.f20860a) {
            try {
                z11 = this.f20862c.a() || this.f20863d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.f
    public void b(e eVar) {
        synchronized (this.f20860a) {
            try {
                if (eVar.equals(this.f20862c)) {
                    this.f20864e = f.a.SUCCESS;
                } else if (eVar.equals(this.f20863d)) {
                    this.f20865f = f.a.SUCCESS;
                }
                f fVar = this.f20861b;
                if (fVar != null) {
                    fVar.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public boolean c(e eVar) {
        boolean z11;
        synchronized (this.f20860a) {
            try {
                z11 = m() && k(eVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f20860a) {
            try {
                f.a aVar = f.a.CLEARED;
                this.f20864e = aVar;
                this.f20862c.clear();
                if (this.f20865f != aVar) {
                    this.f20865f = aVar;
                    this.f20863d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void d() {
        synchronized (this.f20860a) {
            try {
                f.a aVar = this.f20864e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar == aVar2) {
                    this.f20864e = f.a.PAUSED;
                    this.f20862c.d();
                }
                if (this.f20865f == aVar2) {
                    this.f20865f = f.a.PAUSED;
                    this.f20863d.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public boolean e(e eVar) {
        boolean zN;
        synchronized (this.f20860a) {
            zN = n();
        }
        return zN;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z11;
        synchronized (this.f20860a) {
            try {
                f.a aVar = this.f20864e;
                f.a aVar2 = f.a.CLEARED;
                z11 = aVar == aVar2 && this.f20865f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        if (eVar instanceof b) {
            b bVar = (b) eVar;
            if (this.f20862c.g(bVar.f20862c) && this.f20863d.g(bVar.f20863d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.f
    public f getRoot() {
        f root;
        synchronized (this.f20860a) {
            try {
                f fVar = this.f20861b;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.f
    public void h(e eVar) {
        synchronized (this.f20860a) {
            try {
                if (eVar.equals(this.f20863d)) {
                    this.f20865f = f.a.FAILED;
                    f fVar = this.f20861b;
                    if (fVar != null) {
                        fVar.h(this);
                    }
                    return;
                }
                this.f20864e = f.a.FAILED;
                f.a aVar = this.f20865f;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f20865f = aVar2;
                    this.f20863d.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void i() {
        synchronized (this.f20860a) {
            try {
                f.a aVar = this.f20864e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f20864e = aVar2;
                    this.f20862c.i();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f20860a) {
            try {
                f.a aVar = this.f20864e;
                f.a aVar2 = f.a.SUCCESS;
                z11 = aVar == aVar2 || this.f20865f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f20860a) {
            try {
                f.a aVar = this.f20864e;
                f.a aVar2 = f.a.RUNNING;
                z11 = aVar == aVar2 || this.f20865f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.f
    public boolean j(e eVar) {
        boolean z11;
        synchronized (this.f20860a) {
            try {
                z11 = l() && eVar.equals(this.f20862c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public void o(e eVar, e eVar2) {
        this.f20862c = eVar;
        this.f20863d = eVar2;
    }
}
