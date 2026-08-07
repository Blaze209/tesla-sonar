package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class s implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.a f20732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f20733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20735d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dj.e f20736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<jj.o<File, ?>> f20737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile jj.o.a<?> f20739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f20740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t f20741j;

    s(g<?> gVar, f.a aVar) {
        this.f20733b = gVar;
        this.f20732a = aVar;
    }

    private boolean a() {
        return this.f20738g < this.f20737f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        yj.b.a("ResourceCacheGenerator.startNext");
        try {
            List<dj.e> listC = this.f20733b.c();
            boolean z11 = false;
            if (listC.isEmpty()) {
                yj.b.e();
                return false;
            }
            List<Class<?>> listM = this.f20733b.m();
            if (listM.isEmpty()) {
                if (File.class.equals(this.f20733b.r())) {
                    yj.b.e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f20733b.i() + " to " + this.f20733b.r());
            }
            while (true) {
                if (this.f20737f != null && a()) {
                    this.f20739h = null;
                    while (!z11 && a()) {
                        List<jj.o<File, ?>> list = this.f20737f;
                        int i11 = this.f20738g;
                        this.f20738g = i11 + 1;
                        this.f20739h = list.get(i11).b(this.f20740i, this.f20733b.t(), this.f20733b.f(), this.f20733b.k());
                        if (this.f20739h != null && this.f20733b.u(this.f20739h.f83876c.a())) {
                            this.f20739h.f83876c.d(this.f20733b.l(), this);
                            z11 = true;
                        }
                    }
                    yj.b.e();
                    return z11;
                }
                int i12 = this.f20735d + 1;
                this.f20735d = i12;
                if (i12 >= listM.size()) {
                    int i13 = this.f20734c + 1;
                    this.f20734c = i13;
                    if (i13 >= listC.size()) {
                        yj.b.e();
                        return false;
                    }
                    this.f20735d = 0;
                }
                dj.e eVar = listC.get(this.f20734c);
                Class<?> cls = listM.get(this.f20735d);
                this.f20741j = new t(this.f20733b.b(), eVar, this.f20733b.p(), this.f20733b.t(), this.f20733b.f(), this.f20733b.s(cls), cls, this.f20733b.k());
                File fileA = this.f20733b.d().a(this.f20741j);
                this.f20740i = fileA;
                if (fileA != null) {
                    this.f20736e = eVar;
                    this.f20737f = this.f20733b.j(fileA);
                    this.f20738g = 0;
                }
            }
        } catch (Throwable th2) {
            yj.b.e();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        jj.o.a<?> aVar = this.f20739h;
        if (aVar != null) {
            aVar.f83876c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(Object obj) {
        this.f20732a.a(this.f20736e, obj, this.f20739h.f83876c, dj.a.RESOURCE_DISK_CACHE, this.f20741j);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(@NonNull Exception exc) {
        this.f20732a.c(this.f20741j, exc, this.f20739h.f83876c, dj.a.RESOURCE_DISK_CACHE);
    }
}
