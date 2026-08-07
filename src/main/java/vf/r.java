package vf;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class r implements m, wf.a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f119215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.p f119216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wf.m f119217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f119218f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f119213a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f119219g = new b();

    public r(com.airbnb.lottie.p pVar, dg.b bVar, cg.r rVar) {
        this.f119214b = rVar.b();
        this.f119215c = rVar.d();
        this.f119216d = pVar;
        wf.m mVarA = rVar.c().a();
        this.f119217e = mVarA;
        bVar.j(mVarA);
        mVarA.a(this);
    }

    private void c() {
        this.f119218f = false;
        this.f119216d.invalidateSelf();
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
    }

    @Override // wf.a.b
    public void e() {
        c();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:12:0x002a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == cg.t.a.SIMULTANEOUSLY) {
                    this.f119219g.a(uVar);
                    uVar.c(this);
                } else if (!(cVar instanceof s)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    s sVar = (s) cVar;
                    sVar.h(this);
                    arrayList.add(sVar);
                }
            } else if (!(cVar instanceof s)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                s sVar2 = (s) cVar;
                sVar2.h(this);
                arrayList.add(sVar2);
            }
        }
        this.f119217e.s(arrayList);
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        if (t11 == d0.P) {
            this.f119217e.o(cVar);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119214b;
    }

    @Override // vf.m
    public Path getPath() {
        if (this.f119218f && !this.f119217e.k()) {
            return this.f119213a;
        }
        this.f119213a.reset();
        if (this.f119215c) {
            this.f119218f = true;
            return this.f119213a;
        }
        Path pathH = this.f119217e.h();
        if (pathH == null) {
            return this.f119213a;
        }
        this.f119213a.set(pathH);
        this.f119213a.setFillType(Path.FillType.EVEN_ODD);
        this.f119219g.b(this.f119213a);
        this.f119218f = true;
        return this.f119213a;
    }
}
