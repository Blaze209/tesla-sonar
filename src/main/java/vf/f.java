package vf;

import android.graphics.Path;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class f implements m, wf.a.b, k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.p f119114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wf.a<?, PointF> f119115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wf.a<?, PointF> f119116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cg.b f119117f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f119119h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f119112a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f119118g = new b();

    public f(com.airbnb.lottie.p pVar, dg.b bVar, cg.b bVar2) {
        this.f119113b = bVar2.b();
        this.f119114c = pVar;
        wf.a<PointF, PointF> aVarA = bVar2.d().a();
        this.f119115d = aVarA;
        wf.a<PointF, PointF> aVarA2 = bVar2.c().a();
        this.f119116e = aVarA2;
        this.f119117f = bVar2;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    private void c() {
        this.f119119h = false;
        this.f119114c.invalidateSelf();
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
    }

    @Override // wf.a.b
    public void e() {
        c();
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == cg.t.a.SIMULTANEOUSLY) {
                    this.f119118g.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        if (t11 == d0.f113282k) {
            this.f119115d.o(cVar);
        } else if (t11 == d0.f113285n) {
            this.f119116e.o(cVar);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119113b;
    }

    @Override // vf.m
    public Path getPath() {
        if (this.f119119h) {
            return this.f119112a;
        }
        this.f119112a.reset();
        if (this.f119117f.e()) {
            this.f119119h = true;
            return this.f119112a;
        }
        PointF pointFH = this.f119115d.h();
        float f11 = pointFH.x / 2.0f;
        float f12 = pointFH.y / 2.0f;
        float f13 = f11 * 0.55228f;
        float f14 = 0.55228f * f12;
        this.f119112a.reset();
        if (this.f119117f.f()) {
            float f15 = -f12;
            this.f119112a.moveTo(BitmapDescriptorFactory.HUE_RED, f15);
            Path path = this.f119112a;
            float f16 = BitmapDescriptorFactory.HUE_RED - f13;
            float f17 = -f11;
            float f18 = BitmapDescriptorFactory.HUE_RED - f14;
            path.cubicTo(f16, f15, f17, f18, f17, BitmapDescriptorFactory.HUE_RED);
            Path path2 = this.f119112a;
            float f19 = f14 + BitmapDescriptorFactory.HUE_RED;
            path2.cubicTo(f17, f19, f16, f12, BitmapDescriptorFactory.HUE_RED, f12);
            Path path3 = this.f119112a;
            float f21 = f13 + BitmapDescriptorFactory.HUE_RED;
            path3.cubicTo(f21, f12, f11, f19, f11, BitmapDescriptorFactory.HUE_RED);
            this.f119112a.cubicTo(f11, f18, f21, f15, BitmapDescriptorFactory.HUE_RED, f15);
        } else {
            float f22 = -f12;
            this.f119112a.moveTo(BitmapDescriptorFactory.HUE_RED, f22);
            Path path4 = this.f119112a;
            float f23 = f13 + BitmapDescriptorFactory.HUE_RED;
            float f24 = BitmapDescriptorFactory.HUE_RED - f14;
            path4.cubicTo(f23, f22, f11, f24, f11, BitmapDescriptorFactory.HUE_RED);
            Path path5 = this.f119112a;
            float f25 = f14 + BitmapDescriptorFactory.HUE_RED;
            path5.cubicTo(f11, f25, f23, f12, BitmapDescriptorFactory.HUE_RED, f12);
            Path path6 = this.f119112a;
            float f26 = BitmapDescriptorFactory.HUE_RED - f13;
            float f27 = -f11;
            path6.cubicTo(f26, f12, f27, f25, f27, BitmapDescriptorFactory.HUE_RED);
            this.f119112a.cubicTo(f27, f24, f26, f22, BitmapDescriptorFactory.HUE_RED, f22);
        }
        PointF pointFH2 = this.f119116e.h();
        this.f119112a.offset(pointFH2.x, pointFH2.y);
        this.f119112a.close();
        this.f119118g.b(this.f119112a);
        this.f119119h = true;
        return this.f119112a;
    }
}
