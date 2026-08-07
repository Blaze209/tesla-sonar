package vf;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class p implements e, m, j, wf.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Matrix f119199a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f119200b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.p f119201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.b f119202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f119203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f119204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wf.a<Float, Float> f119205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wf.a<Float, Float> f119206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final wf.p f119207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f119208j;

    public p(com.airbnb.lottie.p pVar, dg.b bVar, cg.m mVar) {
        this.f119201c = pVar;
        this.f119202d = bVar;
        this.f119203e = mVar.c();
        this.f119204f = mVar.f();
        wf.d dVarA = mVar.b().a();
        this.f119205g = dVarA;
        bVar.j(dVarA);
        dVarA.a(this);
        wf.d dVarA2 = mVar.d().a();
        this.f119206h = dVarA2;
        bVar.j(dVarA2);
        dVarA2.a(this);
        wf.p pVarB = mVar.e().b();
        this.f119207i = pVarB;
        pVarB.a(bVar);
        pVarB.b(this);
    }

    @Override // vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        this.f119208j.b(rectF, matrix, z11);
    }

    @Override // vf.j
    public void c(ListIterator<c> listIterator) {
        if (this.f119208j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f119208j = new d(this.f119201c, this.f119202d, "Repeater", this.f119204f, arrayList, null);
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
        for (int i12 = 0; i12 < this.f119208j.k().size(); i12++) {
            c cVar = this.f119208j.k().get(i12);
            if (cVar instanceof k) {
                hg.j.k(eVar, i11, list, eVar2, (k) cVar);
            }
        }
    }

    @Override // wf.a.b
    public void e() {
        this.f119201c.invalidateSelf();
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        this.f119208j.f(list, list2);
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        if (this.f119207i.c(t11, cVar)) {
            return;
        }
        if (t11 == d0.f113292u) {
            this.f119205g.o(cVar);
        } else if (t11 == d0.f113293v) {
            this.f119206h.o(cVar);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119203e;
    }

    @Override // vf.m
    public Path getPath() {
        Path path = this.f119208j.getPath();
        this.f119200b.reset();
        float fFloatValue = this.f119205g.h().floatValue();
        float fFloatValue2 = this.f119206h.h().floatValue();
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f119199a.set(this.f119207i.g(i11 + fFloatValue2));
            this.f119200b.addPath(path, this.f119199a);
        }
        return this.f119200b;
    }

    @Override // vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        float fFloatValue = this.f119205g.h().floatValue();
        float fFloatValue2 = this.f119206h.h().floatValue();
        float fFloatValue3 = this.f119207i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f119207i.e().h().floatValue() / 100.0f;
        for (int i12 = ((int) fFloatValue) - 1; i12 >= 0; i12--) {
            this.f119199a.set(matrix);
            float f11 = i12;
            this.f119199a.preConcat(this.f119207i.g(f11 + fFloatValue2));
            this.f119208j.i(canvas, this.f119199a, (int) (i11 * hg.j.i(fFloatValue3, fFloatValue4, f11 / fFloatValue)), bVar);
        }
    }
}
