package dg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import tf.d0;
import wf.q;

/* JADX INFO: loaded from: classes3.dex */
public class h extends b {
    private final RectF E;
    private final Paint F;
    private final float[] G;
    private final Path H;
    private final e I;
    private wf.a<ColorFilter, ColorFilter> J;
    private wf.a<Integer, Integer> K;

    h(p pVar, e eVar) {
        super(pVar, eVar);
        this.E = new RectF();
        uf.a aVar = new uf.a();
        this.F = aVar;
        this.G = new float[8];
        this.H = new Path();
        this.I = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // dg.b, vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        super.b(rectF, matrix, z11);
        this.E.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.I.r(), this.I.q());
        this.f60551o.mapRect(this.E);
        rectF.set(this.E);
    }

    @Override // dg.b, ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        super.g(t11, cVar);
        if (t11 == d0.K) {
            if (cVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new q(cVar);
                return;
            }
        }
        if (t11 == d0.f113272a) {
            if (cVar != null) {
                this.K = new q(cVar);
            } else {
                this.K = null;
                this.F.setColor(this.I.p());
            }
        }
    }

    @Override // dg.b
    public void u(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        int iAlpha = Color.alpha(this.I.p());
        if (iAlpha == 0) {
            return;
        }
        wf.a<Integer, Integer> aVar = this.K;
        Integer numH = aVar == null ? null : aVar.h();
        if (numH != null) {
            this.F.setColor(numH.intValue());
        } else {
            this.F.setColor(this.I.p());
        }
        int iIntValue = (int) ((i11 / 255.0f) * (((iAlpha / 255.0f) * (this.f60560x.h() == null ? 100 : this.f60560x.h().h().intValue())) / 100.0f) * 255.0f);
        this.F.setAlpha(iIntValue);
        if (bVar != null) {
            bVar.a(this.F);
        } else {
            this.F.clearShadowLayer();
        }
        wf.a<ColorFilter, ColorFilter> aVar2 = this.J;
        if (aVar2 != null) {
            this.F.setColorFilter(aVar2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.I.r();
            float[] fArr2 = this.G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.I.r();
            this.G[5] = this.I.q();
            float[] fArr3 = this.G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.I.q();
            matrix.mapPoints(this.G);
            this.H.reset();
            Path path = this.H;
            float[] fArr4 = this.G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.H;
            float[] fArr5 = this.G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.H;
            float[] fArr6 = this.G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.H;
            float[] fArr7 = this.G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.H;
            float[] fArr8 = this.G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.H.close();
            canvas.drawPath(this.H, this.F);
        }
    }
}
