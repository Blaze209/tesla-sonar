package vf;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.v;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends a {
    private wf.q A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f119152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f119153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final v<LinearGradient> f119154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final v<RadialGradient> f119155t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final RectF f119156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final cg.g f119157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f119158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final wf.a<cg.d, cg.d> f119159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final wf.a<PointF, PointF> f119160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final wf.a<PointF, PointF> f119161z;

    public i(com.airbnb.lottie.p pVar, dg.b bVar, cg.f fVar) {
        super(pVar, bVar, fVar.b().toPaintCap(), fVar.g().toPaintJoin(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f119154s = new v<>();
        this.f119155t = new v<>();
        this.f119156u = new RectF();
        this.f119152q = fVar.j();
        this.f119157v = fVar.f();
        this.f119153r = fVar.n();
        this.f119158w = (int) (pVar.N().d() / 32.0f);
        wf.a<cg.d, cg.d> aVarA = fVar.e().a();
        this.f119159x = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        wf.a<PointF, PointF> aVarA2 = fVar.l().a();
        this.f119160y = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
        wf.a<PointF, PointF> aVarA3 = fVar.d().a();
        this.f119161z = aVarA3;
        aVarA3.a(this);
        bVar.j(aVarA3);
    }

    private int[] k(int[] iArr) {
        wf.q qVar = this.A;
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

    private int l() {
        int iRound = Math.round(this.f119160y.f() * this.f119158w);
        int iRound2 = Math.round(this.f119161z.f() * this.f119158w);
        int iRound3 = Math.round(this.f119159x.f() * this.f119158w);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }

    private LinearGradient m() {
        long jL = l();
        LinearGradient linearGradientD = this.f119154s.d(jL);
        if (linearGradientD != null) {
            return linearGradientD;
        }
        PointF pointFH = this.f119160y.h();
        PointF pointFH2 = this.f119161z.h();
        cg.d dVarH = this.f119159x.h();
        LinearGradient linearGradient = new LinearGradient(pointFH.x, pointFH.y, pointFH2.x, pointFH2.y, k(dVarH.d()), dVarH.e(), Shader.TileMode.CLAMP);
        this.f119154s.h(jL, linearGradient);
        return linearGradient;
    }

    private RadialGradient n() {
        long jL = l();
        RadialGradient radialGradientD = this.f119155t.d(jL);
        if (radialGradientD != null) {
            return radialGradientD;
        }
        PointF pointFH = this.f119160y.h();
        PointF pointFH2 = this.f119161z.h();
        cg.d dVarH = this.f119159x.h();
        int[] iArrK = k(dVarH.d());
        float[] fArrE = dVarH.e();
        float f11 = pointFH.x;
        float f12 = pointFH.y;
        RadialGradient radialGradient = new RadialGradient(f11, f12, (float) Math.hypot(pointFH2.x - f11, pointFH2.y - f12), iArrK, fArrE, Shader.TileMode.CLAMP);
        this.f119155t.h(jL, radialGradient);
        return radialGradient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vf.a, ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        super.g(t11, cVar);
        if (t11 == d0.L) {
            wf.q qVar = this.A;
            if (qVar != null) {
                this.f119086f.H(qVar);
            }
            if (cVar == null) {
                this.A = null;
                return;
            }
            wf.q qVar2 = new wf.q(cVar);
            this.A = qVar2;
            qVar2.a(this);
            this.f119086f.j(this.A);
        }
    }

    @Override // vf.c
    public String getName() {
        return this.f119152q;
    }

    @Override // vf.a, vf.e
    public void i(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        if (this.f119153r) {
            return;
        }
        b(this.f119156u, matrix, false);
        this.f119089i.setShader(this.f119157v == cg.g.LINEAR ? m() : n());
        super.i(canvas, matrix, i11, bVar);
    }
}
