package zp;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f128483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f128484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f128485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f128486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f128487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f128488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f128489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private yp.b f128490h;

    public void a(aq.a aVar) {
        yp.b bVar = this.f128490h;
        if (bVar != null) {
            bVar.d(aVar);
        }
    }

    public void b(int i11) {
        d dVar = this.f128483a;
        if (dVar != null) {
            dVar.f(i11);
        }
    }

    public void d(int i11, int i12) {
        f fVar = this.f128485c;
        if (fVar != null) {
            fVar.e(i11, i12);
        }
    }

    public boolean e(int i11, Throwable th2) {
        return false;
    }

    public void f(int i11, float f11) {
        h hVar = this.f128486d;
        if (hVar != null) {
            hVar.c(i11, f11);
        }
    }

    public boolean h(MotionEvent motionEvent) {
        j jVar = this.f128489g;
        return jVar != null && jVar.a(motionEvent);
    }

    public b i() {
        return this.f128487e;
    }

    public b j() {
        return this.f128488f;
    }

    public c k() {
        return this.f128484b;
    }

    public void l(yp.b bVar) {
        this.f128490h = bVar;
    }

    public void m(b bVar) {
        this.f128487e = bVar;
    }

    public void n(b bVar) {
        this.f128488f = bVar;
    }

    public void o(c cVar) {
        this.f128484b = cVar;
    }

    public void p(d dVar) {
        this.f128483a = dVar;
    }

    public void r(f fVar) {
        this.f128485c = fVar;
    }

    public void t(h hVar) {
        this.f128486d = hVar;
    }

    public void v(j jVar) {
        this.f128489g = jVar;
    }

    public void c(MotionEvent motionEvent) {
    }

    public void g(int i11) {
    }

    public void q(e eVar) {
    }

    public void s(g gVar) {
    }

    public void u(i iVar) {
    }
}
