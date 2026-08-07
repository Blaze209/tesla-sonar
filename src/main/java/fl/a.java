package fl;

import android.graphics.Rect;
import bm.f;
import bm.g;
import bm.i;
import bm.j;
import bm.k;
import bm.n;
import el.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import wk.b;
import wm.c;

/* JADX INFO: loaded from: classes3.dex */
public class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f66030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f66031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f66032c = new j(k.DRAWEE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gl.a f66033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private gl.b f66034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f66035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<g> f66036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f66037h;

    public a(b bVar, e eVar) {
        this.f66031b = bVar;
        this.f66030a = eVar;
    }

    private void h() {
        if (this.f66034e == null) {
            this.f66034e = new gl.b(this.f66031b, this.f66032c, this);
        }
        if (this.f66033d == null) {
            this.f66033d = new gl.a(this.f66031b, this.f66032c);
        }
        if (this.f66035f == null) {
            this.f66035f = new c(this.f66033d);
        }
    }

    @Override // bm.i
    public void a(j jVar, bm.e eVar) {
        List<g> list;
        jVar.H(eVar);
        if (!this.f66037h || (list = this.f66036g) == null || list.isEmpty()) {
            return;
        }
        if (eVar == bm.e.SUCCESS) {
            d();
        }
        f fVarS = jVar.S();
        Iterator<g> it = this.f66036g.iterator();
        while (it.hasNext()) {
            it.next().a(fVarS, eVar);
        }
    }

    @Override // bm.i
    public void b(j jVar, n nVar) {
        List<g> list;
        if (!this.f66037h || (list = this.f66036g) == null || list.isEmpty()) {
            return;
        }
        f fVarS = jVar.S();
        Iterator<g> it = this.f66036g.iterator();
        while (it.hasNext()) {
            it.next().b(fVarS, nVar);
        }
    }

    public void c(g gVar) {
        if (gVar == null) {
            return;
        }
        if (this.f66036g == null) {
            this.f66036g = new CopyOnWriteArrayList();
        }
        this.f66036g.add(gVar);
    }

    public void d() {
        ol.b bVarF = this.f66030a.f();
        if (bVarF == null || bVarF.b() == null) {
            return;
        }
        Rect bounds = bVarF.b().getBounds();
        this.f66032c.N(bounds.width());
        this.f66032c.M(bounds.height());
    }

    public void e() {
        List<g> list = this.f66036g;
        if (list != null) {
            list.clear();
        }
    }

    public void f() {
        e();
        g(false);
        this.f66032c.w();
    }

    public void g(boolean z11) {
        this.f66037h = z11;
        if (!z11) {
            gl.b bVar = this.f66034e;
            if (bVar != null) {
                this.f66030a.T(bVar);
            }
            c cVar = this.f66035f;
            if (cVar != null) {
                this.f66030a.z0(cVar);
                return;
            }
            return;
        }
        h();
        gl.b bVar2 = this.f66034e;
        if (bVar2 != null) {
            this.f66030a.k(bVar2);
        }
        c cVar2 = this.f66035f;
        if (cVar2 != null) {
            this.f66030a.j0(cVar2);
        }
    }
}
