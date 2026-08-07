package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class c implements f, com.bumptech.glide.load.data.d.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<dj.e> f20572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f20573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f20574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private dj.e f20576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<jj.o<File, ?>> f20577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile jj.o.a<?> f20579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private File f20580i;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f20578g < this.f20577f.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        yj.b.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z11 = false;
                if (this.f20577f != null && a()) {
                    this.f20579h = null;
                    while (!z11 && a()) {
                        List<jj.o<File, ?>> list = this.f20577f;
                        int i11 = this.f20578g;
                        this.f20578g = i11 + 1;
                        this.f20579h = list.get(i11).b(this.f20580i, this.f20573b.t(), this.f20573b.f(), this.f20573b.k());
                        if (this.f20579h != null && this.f20573b.u(this.f20579h.f83876c.a())) {
                            this.f20579h.f83876c.d(this.f20573b.l(), this);
                            z11 = true;
                        }
                    }
                    yj.b.e();
                    return z11;
                }
                int i12 = this.f20575d + 1;
                this.f20575d = i12;
                if (i12 >= this.f20572a.size()) {
                    yj.b.e();
                    return false;
                }
                dj.e eVar = this.f20572a.get(this.f20575d);
                File fileA = this.f20573b.d().a(new d(eVar, this.f20573b.p()));
                this.f20580i = fileA;
                if (fileA != null) {
                    this.f20576e = eVar;
                    this.f20577f = this.f20573b.j(fileA);
                    this.f20578g = 0;
                }
            } catch (Throwable th2) {
                yj.b.e();
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        jj.o.a<?> aVar = this.f20579h;
        if (aVar != null) {
            aVar.f83876c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void e(Object obj) {
        this.f20574c.a(this.f20576e, obj, this.f20579h.f83876c, dj.a.DATA_DISK_CACHE, this.f20576e);
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(@NonNull Exception exc) {
        this.f20574c.c(this.f20576e, exc, this.f20579h.f83876c, dj.a.DATA_DISK_CACHE);
    }

    c(List<dj.e> list, g<?> gVar, f.a aVar) {
        this.f20575d = -1;
        this.f20572a = list;
        this.f20573b = gVar;
        this.f20574c = aVar;
    }
}
