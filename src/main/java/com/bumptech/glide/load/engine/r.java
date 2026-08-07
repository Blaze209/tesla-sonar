package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class r<Z> implements fj.c<Z>, yj.a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u5.f<r<?>> f20727e = yj.a.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yj.c f20728a = yj.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fj.c<Z> f20729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20731d;

    class a implements yj.a.d<r<?>> {
        a() {
        }

        @Override // yj.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r<?> create() {
            return new r<>();
        }
    }

    r() {
    }

    private void b(fj.c<Z> cVar) {
        this.f20731d = false;
        this.f20730c = true;
        this.f20729b = cVar;
    }

    @NonNull
    static <Z> r<Z> c(fj.c<Z> cVar) {
        r<Z> rVar = (r) xj.k.d(f20727e.b());
        rVar.b(cVar);
        return rVar;
    }

    private void d() {
        this.f20729b = null;
        f20727e.a(this);
    }

    @Override // fj.c
    @NonNull
    public Class<Z> a() {
        return this.f20729b.a();
    }

    @Override // yj.a.f
    @NonNull
    public yj.c e() {
        return this.f20728a;
    }

    synchronized void f() {
        this.f20728a.c();
        if (!this.f20730c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f20730c = false;
        if (this.f20731d) {
            recycle();
        }
    }

    @Override // fj.c
    @NonNull
    public Z get() {
        return this.f20729b.get();
    }

    @Override // fj.c
    public int getSize() {
        return this.f20729b.getSize();
    }

    @Override // fj.c
    public synchronized void recycle() {
        this.f20728a.c();
        this.f20731d = true;
        if (!this.f20730c) {
            this.f20729b.recycle();
            d();
        }
    }
}
