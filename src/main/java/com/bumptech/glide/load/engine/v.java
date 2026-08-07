package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class v implements f, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<?> f20753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f20754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f20755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f20756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f20757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile jj.o.a<?> f20758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile d f20759g;

    class a implements com.bumptech.glide.load.data.d.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ jj.o.a f20760a;

        a(jj.o.a aVar) {
            this.f20760a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(Object obj) {
            if (v.this.g(this.f20760a)) {
                v.this.h(this.f20760a, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@NonNull Exception exc) {
            if (v.this.g(this.f20760a)) {
                v.this.i(this.f20760a, exc);
            }
        }
    }

    v(g<?> gVar, f.a aVar) {
        this.f20753a = gVar;
        this.f20754b = aVar;
    }

    private boolean e(Object obj) throws Throwable {
        Throwable th2;
        long jB = xj.g.b();
        boolean z11 = false;
        try {
            com.bumptech.glide.load.data.e<T> eVarO = this.f20753a.o(obj);
            Object objA = eVarO.a();
            dj.d<X> dVarQ = this.f20753a.q(objA);
            e eVar = new e(dVarQ, objA, this.f20753a.k());
            d dVar = new d(this.f20758f.f83874a, this.f20753a.p());
            hj.a aVarD = this.f20753a.d();
            aVarD.b(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + xj.g.a(jB));
            }
            if (aVarD.a(dVar) != null) {
                this.f20759g = dVar;
                this.f20756d = new c(Collections.singletonList(this.f20758f.f83874a), this.f20753a, this);
                this.f20758f.f83876c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f20759g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f20754b.a(this.f20758f.f83874a, eVarO.a(), this.f20758f.f83876c, this.f20758f.f83876c.c(), this.f20758f.f83874a);
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                z11 = true;
                if (z11) {
                    throw th2;
                }
                this.f20758f.f83876c.b();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    private boolean f() {
        return this.f20755c < this.f20753a.g().size();
    }

    private void j(jj.o.a<?> aVar) {
        this.f20758f.f83876c.d(this.f20753a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(dj.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, dj.a aVar, dj.e eVar2) {
        this.f20754b.a(eVar, obj, dVar, this.f20758f.f83876c.c(), eVar);
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        if (this.f20757e != null) {
            Object obj = this.f20757e;
            this.f20757e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e11) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e11);
                }
            }
        }
        if (this.f20756d != null && this.f20756d.b()) {
            return true;
        }
        this.f20756d = null;
        this.f20758f = null;
        boolean z11 = false;
        while (!z11 && f()) {
            List<jj.o.a<?>> listG = this.f20753a.g();
            int i11 = this.f20755c;
            this.f20755c = i11 + 1;
            this.f20758f = listG.get(i11);
            if (this.f20758f != null && (this.f20753a.e().c(this.f20758f.f83876c.c()) || this.f20753a.u(this.f20758f.f83876c.a()))) {
                j(this.f20758f);
                z11 = true;
            }
        }
        return z11;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(dj.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, dj.a aVar) {
        this.f20754b.c(eVar, exc, dVar, this.f20758f.f83876c.c());
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        jj.o.a<?> aVar = this.f20758f;
        if (aVar != null) {
            aVar.f83876c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    boolean g(jj.o.a<?> aVar) {
        jj.o.a<?> aVar2 = this.f20758f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(jj.o.a<?> aVar, Object obj) {
        fj.a aVarE = this.f20753a.e();
        if (obj != null && aVarE.c(aVar.f83876c.c())) {
            this.f20757e = obj;
            this.f20754b.d();
        } else {
            f.a aVar2 = this.f20754b;
            dj.e eVar = aVar.f83874a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f83876c;
            aVar2.a(eVar, obj, dVar, dVar.c(), this.f20759g);
        }
    }

    void i(jj.o.a<?> aVar, @NonNull Exception exc) {
        f.a aVar2 = this.f20754b;
        d dVar = this.f20759g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f83876c;
        aVar2.c(dVar, exc, dVar2, dVar2.c());
    }
}
