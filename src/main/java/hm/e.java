package hm;

import android.graphics.Bitmap;
import java.util.List;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f73170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f73172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private tk.a<Bitmap> f73173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<tk.a<Bitmap>> f73174e;

    e(f fVar) {
        this.f73170a = (c) k.g(fVar.e());
        this.f73171b = fVar.d();
        this.f73173d = fVar.f();
        this.f73174e = fVar.c();
        fVar.b();
        this.f73172c = fVar.g();
    }

    public static e b(c cVar) {
        return new e(cVar);
    }

    public static f f(c cVar) {
        return new f(cVar);
    }

    public synchronized void a() {
        tk.a.C(this.f73173d);
        this.f73173d = null;
        tk.a.B(this.f73174e);
        this.f73174e = null;
    }

    public dn.a c() {
        return null;
    }

    public c d() {
        return this.f73170a;
    }

    public String e() {
        return this.f73172c;
    }

    private e(c cVar) {
        this.f73170a = (c) k.g(cVar);
        this.f73171b = 0;
    }
}
