package dg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.collection.v;
import com.airbnb.lottie.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import hg.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tf.d0;
import wf.q;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b {
    private wf.a<Float, Float> E;
    private final List<b> F;
    private final RectF G;
    private final RectF H;
    private final RectF I;
    private final k J;
    private final k.a K;
    private float L;
    private boolean M;
    private wf.c N;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60565a;

        static {
            int[] iArr = new int[e.b.values().length];
            f60565a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60565a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(p pVar, e eVar, List<e> list, tf.i iVar) {
        int i11;
        b bVar;
        super(pVar, eVar);
        this.F = new ArrayList();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new k();
        this.K = new k.a();
        this.M = true;
        bg.b bVarV = eVar.v();
        if (bVarV != null) {
            wf.d dVarA = bVarV.a();
            this.E = dVarA;
            j(dVarA);
            this.E.a(this);
        } else {
            this.E = null;
        }
        v vVar = new v(iVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b bVarV2 = b.v(this, eVar2, pVar, iVar);
            if (bVarV2 != null) {
                vVar.h(bVarV2.A().e(), bVarV2);
                if (bVar2 != null) {
                    bVar2.J(bVarV2);
                    bVar2 = null;
                } else {
                    this.F.add(0, bVarV2);
                    int i12 = a.f60565a[eVar2.i().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        bVar2 = bVarV2;
                    }
                }
            }
            size--;
        }
        for (i11 = 0; i11 < vVar.k(); i11++) {
            b bVar3 = (b) vVar.d(vVar.g(i11));
            if (bVar3 != null && (bVar = (b) vVar.d(bVar3.A().k())) != null) {
                bVar3.L(bVar);
            }
        }
        if (z() != null) {
            this.N = new wf.c(this, this, z());
        }
    }

    @Override // dg.b
    protected void I(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        for (int i12 = 0; i12 < this.F.size(); i12++) {
            this.F.get(i12).d(eVar, i11, list, eVar2);
        }
    }

    @Override // dg.b
    public void K(boolean z11) {
        super.K(z11);
        Iterator<b> it = this.F.iterator();
        while (it.hasNext()) {
            it.next().K(z11);
        }
    }

    @Override // dg.b
    public void M(float f11) {
        if (tf.e.h()) {
            tf.e.b("CompositionLayer#setProgress");
        }
        this.L = f11;
        super.M(f11);
        if (this.E != null) {
            f11 = ((this.E.h().floatValue() * this.f60553q.c().i()) - this.f60553q.c().p()) / (this.f60552p.N().e() + 0.01f);
        }
        if (this.E == null) {
            f11 -= this.f60553q.s();
        }
        if (this.f60553q.w() != BitmapDescriptorFactory.HUE_RED && !"__container".equals(this.f60553q.j())) {
            f11 /= this.f60553q.w();
        }
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.F.get(size).M(f11);
        }
        if (tf.e.h()) {
            tf.e.c("CompositionLayer#setProgress");
        }
    }

    public float P() {
        return this.L;
    }

    public void Q(boolean z11) {
        this.M = z11;
    }

    @Override // dg.b, vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        super.b(rectF, matrix, z11);
        for (int size = this.F.size() - 1; size >= 0; size--) {
            this.G.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.F.get(size).b(this.G, this.f60551o, true);
            rectF.union(this.G);
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
        if (t11 == d0.E) {
            if (cVar == null) {
                wf.a<Float, Float> aVar = this.E;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.E = qVar;
            qVar.a(this);
            j(this.E);
            return;
        }
        if (t11 == d0.f113276e && (cVar6 = this.N) != null) {
            cVar6.b(cVar);
            return;
        }
        if (t11 == d0.G && (cVar5 = this.N) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t11 == d0.H && (cVar4 = this.N) != null) {
            cVar4.c(cVar);
            return;
        }
        if (t11 == d0.I && (cVar3 = this.N) != null) {
            cVar3.d(cVar);
        } else {
            if (t11 != d0.J || (cVar2 = this.N) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // dg.b
    void u(Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        Canvas canvasI;
        if (tf.e.h()) {
            tf.e.b("CompositionLayer#draw");
        }
        boolean z11 = false;
        boolean z12 = (bVar == null && this.N == null) ? false : true;
        if ((this.f60552p.j0() && this.F.size() > 1 && i11 != 255) || (z12 && this.f60552p.k0())) {
            z11 = true;
        }
        int i12 = z11 ? 255 : i11;
        wf.c cVar = this.N;
        if (cVar != null) {
            bVar = cVar.a(matrix, i12);
        }
        if (this.M || !"__container".equals(this.f60553q.j())) {
            this.H.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f60553q.m(), this.f60553q.l());
            matrix.mapRect(this.H);
        } else {
            this.H.setEmpty();
            Iterator<b> it = this.F.iterator();
            while (it.hasNext()) {
                it.next().b(this.I, matrix, true);
                this.H.union(this.I);
            }
        }
        if (z11) {
            this.K.f();
            k.a aVar = this.K;
            aVar.f72754a = i11;
            if (bVar != null) {
                bVar.b(aVar);
                bVar = null;
            }
            canvasI = this.J.i(canvas, this.H, this.K);
        } else {
            canvasI = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.H)) {
            for (int size = this.F.size() - 1; size >= 0; size--) {
                this.F.get(size).i(canvasI, matrix, i12, bVar);
            }
        }
        if (z11) {
            this.J.e();
        }
        canvas.restore();
        if (tf.e.h()) {
            tf.e.c("CompositionLayer#draw");
        }
    }
}
