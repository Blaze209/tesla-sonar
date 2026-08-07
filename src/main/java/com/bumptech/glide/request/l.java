package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes3.dex */
public class l implements f, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f20903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile e f20905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile e f20906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f.a f20907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f.a f20908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20909g;

    public l(Object obj, f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f20907e = aVar;
        this.f20908f = aVar;
        this.f20904b = obj;
        this.f20903a = fVar;
    }

    private boolean k() {
        f fVar = this.f20903a;
        return fVar == null || fVar.j(this);
    }

    private boolean l() {
        f fVar = this.f20903a;
        return fVar == null || fVar.c(this);
    }

    private boolean m() {
        f fVar = this.f20903a;
        return fVar == null || fVar.e(this);
    }

    @Override // com.bumptech.glide.request.f, com.bumptech.glide.request.e
    public boolean a() {
        boolean z11;
        synchronized (this.f20904b) {
            try {
                z11 = this.f20906d.a() || this.f20905c.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.f
    public void b(e eVar) {
        synchronized (this.f20904b) {
            try {
                if (eVar.equals(this.f20906d)) {
                    this.f20908f = f.a.SUCCESS;
                    return;
                }
                this.f20907e = f.a.SUCCESS;
                f fVar = this.f20903a;
                if (fVar != null) {
                    fVar.b(this);
                }
                if (!this.f20908f.isComplete()) {
                    this.f20906d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public boolean c(e eVar) {
        boolean z11;
        synchronized (this.f20904b) {
            try {
                z11 = l() && eVar.equals(this.f20905c) && !a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.f20904b) {
            this.f20909g = false;
            f.a aVar = f.a.CLEARED;
            this.f20907e = aVar;
            this.f20908f = aVar;
            this.f20906d.clear();
            this.f20905c.clear();
        }
    }

    @Override // com.bumptech.glide.request.e
    public void d() {
        synchronized (this.f20904b) {
            try {
                if (!this.f20908f.isComplete()) {
                    this.f20908f = f.a.PAUSED;
                    this.f20906d.d();
                }
                if (!this.f20907e.isComplete()) {
                    this.f20907e = f.a.PAUSED;
                    this.f20905c.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.f
    public boolean e(e eVar) {
        boolean z11;
        synchronized (this.f20904b) {
            try {
                z11 = m() && (eVar.equals(this.f20905c) || this.f20907e != f.a.SUCCESS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean f() {
        boolean z11;
        synchronized (this.f20904b) {
            z11 = this.f20907e == f.a.CLEARED;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean g(e eVar) {
        if (eVar instanceof l) {
            l lVar = (l) eVar;
            if (this.f20905c != null ? this.f20905c.g(lVar.f20905c) : lVar.f20905c == null) {
                if (this.f20906d == null) {
                    if (lVar.f20906d == null) {
                        return true;
                    }
                } else if (this.f20906d.g(lVar.f20906d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.f
    public f getRoot() {
        f root;
        synchronized (this.f20904b) {
            try {
                f fVar = this.f20903a;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.f
    public void h(e eVar) {
        synchronized (this.f20904b) {
            try {
                if (!eVar.equals(this.f20905c)) {
                    this.f20908f = f.a.FAILED;
                    return;
                }
                this.f20907e = f.a.FAILED;
                f fVar = this.f20903a;
                if (fVar != null) {
                    fVar.h(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public void i() {
        synchronized (this.f20904b) {
            try {
                this.f20909g = true;
                try {
                    if (this.f20907e != f.a.SUCCESS) {
                        f.a aVar = this.f20908f;
                        f.a aVar2 = f.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f20908f = aVar2;
                            this.f20906d.i();
                        }
                    }
                    if (this.f20909g) {
                        f.a aVar3 = this.f20907e;
                        f.a aVar4 = f.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f20907e = aVar4;
                            this.f20905c.i();
                        }
                    }
                    this.f20909g = false;
                } catch (Throwable th2) {
                    this.f20909g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z11;
        synchronized (this.f20904b) {
            z11 = this.f20907e == f.a.SUCCESS;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z11;
        synchronized (this.f20904b) {
            z11 = this.f20907e == f.a.RUNNING;
        }
        return z11;
    }

    @Override // com.bumptech.glide.request.f
    public boolean j(e eVar) {
        boolean z11;
        synchronized (this.f20904b) {
            try {
                z11 = k() && eVar.equals(this.f20905c) && this.f20907e != f.a.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public void n(e eVar, e eVar2) {
        this.f20905c = eVar;
        this.f20906d = eVar2;
    }
}
