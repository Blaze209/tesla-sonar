package vf;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements s, wf.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.p f119209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f119210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wf.a<Float, Float> f119211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private cg.o f119212d;

    public q(com.airbnb.lottie.p pVar, dg.b bVar, cg.n nVar) {
        this.f119209a = pVar;
        this.f119210b = nVar.c();
        wf.a<Float, Float> aVarA = nVar.b().a();
        this.f119211c = aVarA;
        bVar.j(aVarA);
        aVarA.a(this);
    }

    private static int c(int i11, int i12) {
        int i13 = i11 / i12;
        return ((i11 ^ i12) >= 0 || i12 * i13 == i11) ? i13 : i13 - 1;
    }

    private static int d(int i11, int i12) {
        return i11 - (c(i11, i12) * i12);
    }

    @NonNull
    private cg.o j(cg.o oVar) {
        List<ag.a> listA = oVar.a();
        boolean zD = oVar.d();
        int size = listA.size() - 1;
        int i11 = 0;
        while (size >= 0) {
            ag.a aVar = listA.get(size);
            ag.a aVar2 = listA.get(d(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? aVar2.c() : oVar.b();
            i11 = (((size != 0 || zD) ? aVar2.b() : pointFC).equals(pointFC) && aVar.a().equals(pointFC) && !(!oVar.d() && (size == 0 || size == listA.size() - 1))) ? i11 + 2 : i11 + 1;
            size--;
        }
        cg.o oVar2 = this.f119212d;
        if (oVar2 == null || oVar2.a().size() != i11) {
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(new ag.a());
            }
            this.f119212d = new cg.o(new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), false, arrayList);
        }
        this.f119212d.e(zD);
        return this.f119212d;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // vf.s
    public cg.o a(cg.o oVar) {
        boolean z11;
        List<ag.a> listA = oVar.a();
        if (listA.size() > 2) {
            float fFloatValue = this.f119211c.h().floatValue();
            if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                cg.o oVarJ = j(oVar);
                oVarJ.f(oVar.b().x, oVar.b().y);
                List<ag.a> listA2 = oVarJ.a();
                boolean zD = oVar.d();
                int i11 = 0;
                int i12 = 0;
                while (i11 < listA.size()) {
                    ag.a aVar = listA.get(i11);
                    ag.a aVar2 = listA.get(d(i11 - 1, listA.size()));
                    ag.a aVar3 = listA.get(d(i11 - 2, listA.size()));
                    PointF pointFC = (i11 != 0 || zD) ? aVar2.c() : oVar.b();
                    PointF pointFB = (i11 != 0 || zD) ? aVar2.b() : pointFC;
                    PointF pointFA = aVar.a();
                    PointF pointFC2 = aVar3.c();
                    PointF pointFC3 = aVar.c();
                    if (oVar.d()) {
                        z11 = false;
                    } else {
                        z11 = true;
                        if (i11 != 0 && i11 != listA.size() - 1) {
                            z11 = false;
                        }
                    }
                    if (pointFB.equals(pointFC) && pointFA.equals(pointFC) && !z11) {
                        float f11 = pointFC.x;
                        float f12 = f11 - pointFC2.x;
                        float f13 = pointFC.y;
                        float f14 = f13 - pointFC2.y;
                        float f15 = pointFC3.x - f11;
                        float f16 = pointFC3.y - f13;
                        float fHypot = (float) Math.hypot(f12, f14);
                        float fHypot2 = (float) Math.hypot(f15, f16);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f17 = pointFC.x;
                        float f18 = ((pointFC2.x - f17) * fMin) + f17;
                        float f19 = pointFC.y;
                        float f21 = ((pointFC2.y - f19) * fMin) + f19;
                        float f22 = ((pointFC3.x - f17) * fMin2) + f17;
                        float f23 = ((pointFC3.y - f19) * fMin2) + f19;
                        float f24 = f18 - ((f18 - f17) * 0.5519f);
                        float f25 = f21 - ((f21 - f19) * 0.5519f);
                        float f26 = f22 - ((f22 - f17) * 0.5519f);
                        float f27 = f23 - ((f23 - f19) * 0.5519f);
                        ag.a aVar4 = listA2.get(d(i12 - 1, listA2.size()));
                        ag.a aVar5 = listA2.get(i12);
                        aVar4.e(f18, f21);
                        aVar4.f(f18, f21);
                        if (i11 == 0) {
                            oVarJ.f(f18, f21);
                        }
                        aVar5.d(f24, f25);
                        ag.a aVar6 = listA2.get(i12 + 1);
                        aVar5.e(f26, f27);
                        aVar5.f(f22, f23);
                        aVar6.d(f22, f23);
                        i12 += 2;
                    } else {
                        ag.a aVar7 = listA2.get(d(i12 - 1, listA2.size()));
                        ag.a aVar8 = listA2.get(i12);
                        aVar7.e(aVar2.b().x, aVar2.b().y);
                        aVar7.f(aVar2.c().x, aVar2.c().y);
                        aVar8.d(aVar.a().x, aVar.a().y);
                        i12++;
                    }
                    i11++;
                    listA = listA;
                }
                return oVarJ;
            }
        }
        return oVar;
    }

    @Override // wf.a.b
    public void e() {
        this.f119209a.invalidateSelf();
    }

    public wf.a<Float, Float> g() {
        return this.f119211c;
    }

    @Override // vf.s
    public void h(wf.a.b bVar) {
        this.f119211c.a(bVar);
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
    }
}
