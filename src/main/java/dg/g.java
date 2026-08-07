package dg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import cg.q;
import com.airbnb.lottie.p;
import java.util.Collections;
import java.util.List;
import tf.d0;

/* JADX INFO: loaded from: classes3.dex */
public class g extends b {
    private final vf.d E;
    private final c F;
    private wf.c G;

    g(p pVar, e eVar, c cVar, tf.i iVar) {
        super(pVar, eVar);
        this.F = cVar;
        vf.d dVar = new vf.d(pVar, this, new q("__container", eVar.o(), false), iVar);
        this.E = dVar;
        List<vf.c> list = Collections.EMPTY_LIST;
        dVar.f(list, list);
        if (z() != null) {
            this.G = new wf.c(this, this, z());
        }
    }

    @Override // dg.b
    protected void I(ag.e eVar, int i11, List<ag.e> list, ag.e eVar2) {
        this.E.d(eVar, i11, list, eVar2);
    }

    @Override // dg.b, vf.e
    public void b(RectF rectF, Matrix matrix, boolean z11) {
        super.b(rectF, matrix, z11);
        this.E.b(rectF, this.f60551o, z11);
    }

    @Override // dg.b, ag.f
    public <T> void g(T t11, ig.c<T> cVar) {
        wf.c cVar2;
        wf.c cVar3;
        wf.c cVar4;
        wf.c cVar5;
        wf.c cVar6;
        super.g(t11, cVar);
        if (t11 == d0.f113276e && (cVar6 = this.G) != null) {
            cVar6.b(cVar);
            return;
        }
        if (t11 == d0.G && (cVar5 = this.G) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t11 == d0.H && (cVar4 = this.G) != null) {
            cVar4.c(cVar);
            return;
        }
        if (t11 == d0.I && (cVar3 = this.G) != null) {
            cVar3.d(cVar);
        } else {
            if (t11 != d0.J || (cVar2 = this.G) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // dg.b
    void u(@NonNull Canvas canvas, Matrix matrix, int i11, hg.b bVar) {
        wf.c cVar = this.G;
        if (cVar != null) {
            bVar = cVar.a(matrix, i11);
        }
        this.E.i(canvas, matrix, i11, bVar);
    }

    @Override // dg.b
    public cg.a x() {
        cg.a aVarX = super.x();
        return aVarX != null ? aVarX : this.F.x();
    }
}
