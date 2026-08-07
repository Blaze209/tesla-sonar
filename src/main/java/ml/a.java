package ml;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import ll.g;
import ll.h;
import ll.p;
import ll.s;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
public class a implements ol.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Drawable f92288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f92289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f92290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f92291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ll.f f92292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f92293f;

    a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f92288a = colorDrawable;
        if (bn.b.d()) {
            bn.b.a("GenericDraweeHierarchy()");
        }
        this.f92289b = bVar.p();
        this.f92290c = bVar.s();
        g gVar = new g(colorDrawable);
        this.f92293f = gVar;
        int i11 = 1;
        int size = bVar.j() != null ? bVar.j().size() : 1;
        int i12 = (size == 0 ? 1 : size) + (bVar.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i12 + 6];
        drawableArr[0] = h(bVar.e(), null);
        drawableArr[1] = h(bVar.k(), bVar.l());
        drawableArr[2] = g(gVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = h(bVar.n(), bVar.o());
        drawableArr[4] = h(bVar.q(), bVar.r());
        drawableArr[5] = h(bVar.h(), bVar.i());
        if (i12 > 0) {
            if (bVar.j() != null) {
                Iterator<Drawable> it = bVar.j().iterator();
                i11 = 0;
                while (it.hasNext()) {
                    drawableArr[i11 + 6] = h(it.next(), null);
                    i11++;
                }
            }
            if (bVar.m() != null) {
                drawableArr[i11 + 6] = h(bVar.m(), null);
            }
        }
        ll.f fVar = new ll.f(drawableArr, false, 2);
        this.f92292e = fVar;
        fVar.v(bVar.g());
        d dVar = new d(f.e(fVar, this.f92290c));
        this.f92291d = dVar;
        dVar.mutate();
        u();
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A(float f11) {
        Drawable drawableB = this.f92292e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f11 >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            k(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            i(3);
        }
        drawableB.setLevel(Math.round(f11 * 10000.0f));
    }

    private Drawable g(Drawable drawable, s sVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return f.g(drawable, sVar, pointF);
    }

    private Drawable h(Drawable drawable, s sVar) {
        return f.f(f.d(drawable, this.f92290c, this.f92289b), sVar);
    }

    private void i(int i11) {
        if (i11 >= 0) {
            this.f92292e.l(i11);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i11) {
        if (i11 >= 0) {
            this.f92292e.n(i11);
        }
    }

    private ll.c p(int i11) {
        ll.c cVarC = this.f92292e.c(i11);
        if (cVarC.a() instanceof h) {
            cVarC = (h) cVarC.a();
        }
        return cVarC.a() instanceof p ? (p) cVarC.a() : cVarC;
    }

    private p r(int i11) {
        ll.c cVarP = p(i11);
        return cVarP instanceof p ? (p) cVarP : f.k(cVarP, s.f90213a);
    }

    private boolean s(int i11) {
        return p(i11) instanceof p;
    }

    private void t() {
        this.f92293f.o(this.f92288a);
    }

    private void u() {
        ll.f fVar = this.f92292e;
        if (fVar != null) {
            fVar.f();
            this.f92292e.j();
            j();
            i(1);
            this.f92292e.o();
            this.f92292e.h();
        }
    }

    private void x(int i11, Drawable drawable) {
        if (drawable == null) {
            this.f92292e.e(i11, null);
        } else {
            p(i11).o(f.d(drawable, this.f92290c, this.f92289b));
        }
    }

    public void B(Drawable drawable) {
        x(3, drawable);
    }

    public void C(e eVar) {
        this.f92290c = eVar;
        f.j(this.f92291d, eVar);
        for (int i11 = 0; i11 < this.f92292e.d(); i11++) {
            f.i(p(i11), this.f92290c, this.f92289b);
        }
    }

    @Override // ol.c
    public void a(Throwable th2) {
        this.f92292e.f();
        j();
        if (this.f92292e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f92292e.h();
    }

    @Override // ol.b
    public Drawable b() {
        return this.f92291d;
    }

    @Override // ol.c
    public void c(Drawable drawable) {
        this.f92291d.y(drawable);
    }

    @Override // ol.c
    public void d(Throwable th2) {
        this.f92292e.f();
        j();
        if (this.f92292e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f92292e.h();
    }

    @Override // ol.c
    public void e(float f11, boolean z11) {
        if (this.f92292e.b(3) == null) {
            return;
        }
        this.f92292e.f();
        A(f11);
        if (z11) {
            this.f92292e.o();
        }
        this.f92292e.h();
    }

    @Override // ol.c
    public void f(Drawable drawable, float f11, boolean z11) {
        Drawable drawableD = f.d(drawable, this.f92290c, this.f92289b);
        drawableD.mutate();
        this.f92293f.o(drawableD);
        this.f92292e.f();
        j();
        i(2);
        A(f11);
        if (z11) {
            this.f92292e.o();
        }
        this.f92292e.h();
    }

    @Override // ol.b
    public Rect getBounds() {
        return this.f92291d.getBounds();
    }

    public void l(RectF rectF) {
        this.f92293f.v(rectF);
    }

    public PointF m() {
        if (s(2)) {
            return r(2).getMFocusPoint();
        }
        return null;
    }

    public s n() {
        if (s(2)) {
            return r(2).getMScaleType();
        }
        return null;
    }

    public int o() {
        return this.f92292e.q();
    }

    public e q() {
        return this.f92290c;
    }

    @Override // ol.c
    public void reset() {
        t();
        u();
    }

    public void v(s sVar) {
        k.g(sVar);
        r(2).D(sVar);
    }

    public void w(Drawable drawable) {
        x(0, drawable);
    }

    public void y(int i11) {
        this.f92292e.v(i11);
    }

    public void z(Drawable drawable, s sVar) {
        x(1, drawable);
        r(1).D(sVar);
    }
}
