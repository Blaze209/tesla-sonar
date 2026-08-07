package vf;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e, m, wf.a.b, ag.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hg.k.a f119100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f119101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hg.k f119102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Matrix f119103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f119104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f119105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f119106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f119107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c> f119108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.p f119109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<m> f119110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private wf.p f119111l;

    public d(com.airbnb.lottie.p pVar, dg.b bVar, cg.q qVar, tf.i iVar) {
        this(pVar, bVar, qVar.c(), qVar.d(), c(pVar, iVar, bVar, qVar.b()), j(qVar.b()));
    }

    private static List<c> c(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar, List<cg.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVarA = list.get(i11).a(pVar, iVar, bVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    static bg.n j(List<cg.c> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            cg.c cVar = list.get(i11);
            if (cVar instanceof bg.n) {
                return (bg.n) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f119108i.size(); i12++) {
            if ((this.f119108i.get(i12) instanceof e) && (i11 = i11 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        this.f119103d.set(matrix);
        wf.p pVar = this.f119111l;
        if (pVar != null) {
            this.f119103d.preConcat(pVar.f());
        }
        this.f119105f.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        for (int size = this.f119108i.size() - 1; size >= 0; size--) {
            c cVar = this.f119108i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).b(this.f119105f, this.f119103d, z11);
                rectF.union(this.f119105f);
            }
        }
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        if (eVar.g(getName(), i11) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i11)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i11)) {
                int iE = i11 + eVar.e(getName(), i11);
                for (int i12 = 0; i12 < this.f119108i.size(); i12++) {
                    c cVar = this.f119108i.get(i12);
                    if (cVar instanceof ag.f) {
                        ((ag.f) cVar).d(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // wf.a.b
    public void e() {
        this.f119109j.invalidateSelf();
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f119108i.size());
        arrayList.addAll(list);
        for (int size = this.f119108i.size() - 1; size >= 0; size--) {
            c cVar = this.f119108i.get(size);
            cVar.f(arrayList, this.f119108i.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        wf.p pVar = this.f119111l;
        if (pVar != null) {
            pVar.c(t11, cVar);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119106g;
    }

    @Override // vf.m
    public Path getPath() {
        this.f119103d.reset();
        wf.p pVar = this.f119111l;
        if (pVar != null) {
            this.f119103d.set(pVar.f());
        }
        this.f119104e.reset();
        if (this.f119107h) {
            return this.f119104e;
        }
        for (int size = this.f119108i.size() - 1; size >= 0; size--) {
            c cVar = this.f119108i.get(size);
            if (cVar instanceof m) {
                this.f119104e.addPath(((m) cVar).getPath(), this.f119103d);
            }
        }
        return this.f119104e;
    }

    @Override // vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        if (this.f119107h) {
            return;
        }
        this.f119103d.set(matrix);
        wf.p pVar = this.f119111l;
        if (pVar != null) {
            this.f119103d.preConcat(pVar.f());
            i11 = (int) (((((this.f119111l.h() == null ? 100 : this.f119111l.h().h().intValue()) / 100.0f) * i11) / 255.0f) * 255.0f);
        }
        boolean z11 = (this.f119109j.j0() && n() && i11 != 255) || (bVar != null && this.f119109j.k0() && n());
        int i12 = z11 ? 255 : i11;
        if (z11) {
            this.f119101b.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            b(this.f119101b, matrix, true);
            hg.k.a aVar = this.f119100a;
            aVar.f72754a = i11;
            if (bVar != null) {
                bVar.b(aVar);
                bVar = null;
            } else {
                aVar.f72757d = null;
            }
            canvas = this.f119102c.i(canvas, this.f119101b, this.f119100a);
        } else if (bVar != null) {
            hg.b bVar2 = new hg.b(bVar);
            bVar2.i(i12);
            bVar = bVar2;
        }
        for (int size = this.f119108i.size() - 1; size >= 0; size--) {
            c cVar = this.f119108i.get(size);
            if (cVar instanceof e) {
                ((e) cVar).i(canvas, this.f119103d, i12, bVar);
            }
        }
        if (z11) {
            this.f119102c.e();
        }
    }

    public List<c> k() {
        return this.f119108i;
    }

    List<m> l() {
        if (this.f119110k == null) {
            this.f119110k = new ArrayList();
            for (int i11 = 0; i11 < this.f119108i.size(); i11++) {
                c cVar = this.f119108i.get(i11);
                if (cVar instanceof m) {
                    this.f119110k.add((m) cVar);
                }
            }
        }
        return this.f119110k;
    }

    Matrix m() {
        wf.p pVar = this.f119111l;
        if (pVar != null) {
            return pVar.f();
        }
        this.f119103d.reset();
        return this.f119103d;
    }

    d(com.airbnb.lottie.p pVar, dg.b bVar, String str, boolean z11, List<c> list, bg.n nVar) {
        this.f119100a = new hg.k.a();
        this.f119101b = new RectF();
        this.f119102c = new hg.k();
        this.f119103d = new Matrix();
        this.f119104e = new Path();
        this.f119105f = new RectF();
        this.f119106g = str;
        this.f119109j = pVar;
        this.f119107h = z11;
        this.f119108i = list;
        if (nVar != null) {
            wf.p pVarB = nVar.b();
            this.f119111l = pVarB;
            pVarB.a(bVar);
            this.f119111l.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).c(list.listIterator(list.size()));
        }
    }
}
