package dg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hg.k;
import hg.l;
import tf.d0;
import tf.z;
import wf.q;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {
    private final Paint E;
    private final Rect F;
    private final Rect G;
    private final RectF H;
    private final z I;
    private wf.a<ColorFilter, ColorFilter> J;
    private wf.a<Bitmap, Bitmap> K;
    private wf.c L;
    private k M;
    private k.a N;

    d(p pVar, e eVar) {
        super(pVar, eVar);
        this.E = new uf.a(3);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.I = pVar.T(eVar.n());
        if (z() != null) {
            this.L = new wf.c(this, this, z());
        }
    }

    private Bitmap P() {
        Bitmap bitmapH;
        wf.a<Bitmap, Bitmap> aVar = this.K;
        if (aVar != null && (bitmapH = aVar.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapK = this.f60552p.K(this.f60553q.n());
        if (bitmapK != null) {
            return bitmapK;
        }
        z zVar = this.I;
        if (zVar != null) {
            return zVar.b();
        }
        return null;
    }

    @Override // dg.b, vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        super.b(rectF, matrix, z11);
        if (this.I != null) {
            float fE = l.e();
            if (this.f60552p.U()) {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.I.f() * fE, this.I.d() * fE);
            } else {
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, P().getWidth() * fE, P().getHeight() * fE);
            }
            this.f60551o.mapRect(rectF);
        }
    }

    @Override // dg.b, ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        wf.c cVar2;
        wf.c cVar3;
        wf.c cVar4;
        wf.c cVar5;
        wf.c cVar6;
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
        if (t11 == d0.N) {
            if (cVar == null) {
                this.K = null;
                return;
            } else {
                this.K = new q(cVar);
                return;
            }
        }
        if (t11 == d0.f113276e && (cVar6 = this.L) != null) {
            cVar6.b(cVar);
            return;
        }
        if (t11 == d0.G && (cVar5 = this.L) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t11 == d0.H && (cVar4 = this.L) != null) {
            cVar4.c(cVar);
            return;
        }
        if (t11 == d0.I && (cVar3 = this.L) != null) {
            cVar3.d(cVar);
        } else {
            if (t11 != d0.J || (cVar2 = this.L) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // dg.b
    public void u(@NonNull Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        Bitmap bitmapP = P();
        if (bitmapP == null || bitmapP.isRecycled() || this.I == null) {
            return;
        }
        float fE = l.e();
        this.E.setAlpha(i11);
        wf.a<ColorFilter, ColorFilter> aVar = this.J;
        if (aVar != null) {
            this.E.setColorFilter(aVar.h());
        }
        wf.c cVar = this.L;
        if (cVar != null) {
            bVar = cVar.a(matrix, i11);
        }
        this.F.set(0, 0, bitmapP.getWidth(), bitmapP.getHeight());
        if (this.f60552p.U()) {
            this.G.set(0, 0, (int) (this.I.f() * fE), (int) (this.I.d() * fE));
        } else {
            this.G.set(0, 0, (int) (bitmapP.getWidth() * fE), (int) (bitmapP.getHeight() * fE));
        }
        boolean z11 = bVar != null;
        if (z11) {
            if (this.M == null) {
                this.M = new k();
            }
            if (this.N == null) {
                this.N = new k.a();
            }
            this.N.f();
            bVar.d(i11, this.N);
            RectF rectF = this.H;
            Rect rect = this.G;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(this.H);
            canvas = this.M.i(canvas, this.H, this.N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapP, this.F, this.G, this.E);
        if (z11) {
            this.M.e();
        }
        canvas.restore();
    }
}
