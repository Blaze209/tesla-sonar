package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
class o<Z> implements fj.c<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fj.c<Z> f20716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dj.e f20718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20720g;

    interface a {
        void d(dj.e eVar, o<?> oVar);
    }

    o(fj.c<Z> cVar, boolean z11, boolean z12, dj.e eVar, a aVar) {
        this.f20716c = (fj.c) xj.k.d(cVar);
        this.f20714a = z11;
        this.f20715b = z12;
        this.f20718e = eVar;
        this.f20717d = (a) xj.k.d(aVar);
    }

    @Override // fj.c
    @NonNull
    public Class<Z> a() {
        return this.f20716c.a();
    }

    synchronized void b() {
        if (this.f20720g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f20719f++;
    }

    fj.c<Z> c() {
        return this.f20716c;
    }

    boolean d() {
        return this.f20714a;
    }

    void e() {
        boolean z11;
        synchronized (this) {
            int i11 = this.f20719f;
            if (i11 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z11 = true;
            int i12 = i11 - 1;
            this.f20719f = i12;
            if (i12 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            this.f20717d.d(this.f20718e, this);
        }
    }

    @Override // fj.c
    @NonNull
    public Z get() {
        return this.f20716c.get();
    }

    @Override // fj.c
    public int getSize() {
        return this.f20716c.getSize();
    }

    @Override // fj.c
    public synchronized void recycle() {
        if (this.f20719f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f20720g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f20720g = true;
        if (this.f20715b) {
            this.f20716c.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f20714a + ", listener=" + this.f20717d + ", key=" + this.f20718e + ", acquired=" + this.f20719f + ", isRecycled=" + this.f20720g + ", resource=" + this.f20716c + CoreConstants.CURLY_RIGHT;
    }
}
