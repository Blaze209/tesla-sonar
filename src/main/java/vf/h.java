package vf;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.collection.v;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e, wf.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f119132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f119133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.b f119134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v<LinearGradient> f119135d = new v<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v<RadialGradient> f119136e = new v<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f119137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f119138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RectF f119139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<m> f119140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final cg.g f119141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final wf.a<cg.d, cg.d> f119142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final wf.a<Integer, Integer> f119143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wf.a<PointF, PointF> f119144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wf.a<PointF, PointF> f119145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private wf.a<ColorFilter, ColorFilter> f119146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private wf.q f119147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.airbnb.lottie.p f119148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f119149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private wf.a<Float, Float> f119150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f119151t;

    public h(com.airbnb.lottie.p pVar, tf.i iVar, dg.b bVar, cg.e eVar) {
        Path path = new Path();
        this.f119137f = path;
        this.f119138g = new uf.a(1);
        this.f119139h = new RectF();
        this.f119140i = new ArrayList();
        this.f119151t = BitmapDescriptorFactory.HUE_RED;
        this.f119134c = bVar;
        this.f119132a = eVar.f();
        this.f119133b = eVar.i();
        this.f119148q = pVar;
        this.f119141j = eVar.e();
        path.setFillType(eVar.c());
        this.f119149r = (int) (iVar.d() / 32.0f);
        wf.a<cg.d, cg.d> aVarA = eVar.d().a();
        this.f119142k = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        wf.a<Integer, Integer> aVarA2 = eVar.g().a();
        this.f119143l = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        wf.a<PointF, PointF> aVarA3 = eVar.h().a();
        this.f119144m = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
        wf.a<PointF, PointF> aVarA4 = eVar.b().a();
        this.f119145n = aVarA4;
        aVarA4.a(this);
        bVar.j(aVarA4);
        if (bVar.x() != null) {
            wf.d dVarA = bVar.x().a().a();
            this.f119150s = dVarA;
            dVarA.a(this);
            bVar.j(this.f119150s);
        }
    }

    private int[] c(int[] iArr) {
        wf.q qVar = this.f119147p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int iRound = Math.round(this.f119144m.f() * this.f119149r);
        int iRound2 = Math.round(this.f119145n.f() * this.f119149r);
        int iRound3 = Math.round(this.f119142k.f() * this.f119149r);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }

    private LinearGradient k() {
        long j11 = j();
        LinearGradient linearGradientD = this.f119135d.d(j11);
        if (linearGradientD != null) {
            return linearGradientD;
        }
        PointF pointFH = this.f119144m.h();
        PointF pointFH2 = this.f119145n.h();
        cg.d dVarH = this.f119142k.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, c(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f119135d.h(j11, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        long j11 = j();
        RadialGradient radialGradientD = this.f119136e.d(j11);
        if (radialGradientD != null) {
            return radialGradientD;
        }
        PointF pointFH = this.f119144m.h();
        PointF pointFH2 = this.f119145n.h();
        cg.d dVarH = this.f119142k.h();
        int[] iArrC = c(dVarH.d());
        float[] fArrE = dVarH.e();
        float f11 = pointFH.x;
        float f12 = pointFH.y;
        float fHypot = (float) Math.hypot(pointFH2.x - f11, pointFH2.y - f12);
        if (fHypot <= BitmapDescriptorFactory.HUE_RED) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f11, f12, fHypot, iArrC, fArrE, Shader.TileMode.CLAMP);
        this.f119136e.h(j11, radialGradient);
        return radialGradient;
    }

    @Override // vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        this.f119137f.reset();
        for (int i11 = 0; i11 < this.f119140i.size(); i11++) {
            this.f119137f.addPath(this.f119140i.get(i11).getPath(), matrix);
        }
        this.f119137f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // ag.f
    public void d(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        hg.j.k(eVar, i11, list, eVar2, this);
    }

    @Override // wf.a.b
    public void e() {
        this.f119148q.invalidateSelf();
    }

    @Override // vf.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof m) {
                this.f119140i.add((m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        if (t11 == d0.f113275d) {
            this.f119143l.o(cVar);
            return;
        }
        if (t11 == d0.K) {
            wf.a<ColorFilter, ColorFilter> aVar = this.f119146o;
            if (aVar != null) {
                this.f119134c.H(aVar);
            }
            if (cVar == null) {
                this.f119146o = null;
                return;
            }
            wf.q qVar = new wf.q(cVar);
            this.f119146o = qVar;
            qVar.a(this);
            this.f119134c.j(this.f119146o);
            return;
        }
        if (t11 != d0.L) {
            if (t11 == d0.f113281j) {
                wf.a<Float, Float> aVar2 = this.f119150s;
                if (aVar2 != null) {
                    aVar2.o(cVar);
                    return;
                }
                wf.q qVar2 = new wf.q(cVar);
                this.f119150s = qVar2;
                qVar2.a(this);
                this.f119134c.j(this.f119150s);
                return;
            }
            return;
        }
        wf.q qVar3 = this.f119147p;
        if (qVar3 != null) {
            this.f119134c.H(qVar3);
        }
        if (cVar == null) {
            this.f119147p = null;
            return;
        }
        this.f119135d.a();
        this.f119136e.a();
        wf.q qVar4 = new wf.q(cVar);
        this.f119147p = qVar4;
        qVar4.a(this);
        this.f119134c.j(this.f119147p);
    }

    @Override // vf.c
    public String getName() {
        return this.f119132a;
    }

    @Override // vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        if (this.f119133b) {
            return;
        }
        if (tf.e.h()) {
            tf.e.b("GradientFillContent#draw");
        }
        this.f119137f.reset();
        for (int i12 = 0; i12 < this.f119140i.size(); i12++) {
            this.f119137f.addPath(this.f119140i.get(i12).getPath(), matrix);
        }
        this.f119137f.computeBounds(this.f119139h, false);
        Shader shaderK = this.f119141j == cg.g.LINEAR ? k() : l();
        shaderK.setLocalMatrix(matrix);
        this.f119138g.setShader(shaderK);
        wf.a<ColorFilter, ColorFilter> aVar = this.f119146o;
        if (aVar != null) {
            this.f119138g.setColorFilter(aVar.h());
        }
        wf.a<Float, Float> aVar2 = this.f119150s;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                this.f119138g.setMaskFilter(null);
            } else if (fFloatValue != this.f119151t) {
                this.f119138g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f119151t = fFloatValue;
        }
        float fIntValue = this.f119143l.h().intValue() / 100.0f;
        this.f119138g.setAlpha(hg.j.c((int) (i11 * fIntValue), 0, 255));
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f119138g);
        }
        canvas.drawPath(this.f119137f, this.f119138g);
        if (tf.e.h()) {
            tf.e.c("GradientFillContent#draw");
        }
    }
}
