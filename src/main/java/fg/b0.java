package fg;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f65884a = new b0();

    private b0() {
    }

    @Override // fg.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(gg.c cVar, float f11) {
        gg.c.b bVarO = cVar.o();
        if (bVarO == gg.c.b.BEGIN_ARRAY) {
            return s.e(cVar, f11);
        }
        if (bVarO == gg.c.b.BEGIN_OBJECT) {
            return s.e(cVar, f11);
        }
        if (bVarO == gg.c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.nextDouble()) * f11, ((float) cVar.nextDouble()) * f11);
            while (cVar.hasNext()) {
                cVar.F();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarO);
    }
}
