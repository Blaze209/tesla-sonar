package fg;

import android.graphics.PointF;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h0 implements n0<cg.o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f65897a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final gg.c.a f65898b = gg.c.a.a("c", "v", IntegerTokenConverter.CONVERTER_KEY, "o");

    private h0() {
    }

    @Override // fg.n0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public cg.o a(gg.c cVar, float f11) {
        if (cVar.o() == gg.c.b.BEGIN_ARRAY) {
            cVar.f();
        }
        cVar.h();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zNextBoolean = false;
        while (cVar.hasNext()) {
            int iT = cVar.t(f65898b);
            if (iT == 0) {
                zNextBoolean = cVar.nextBoolean();
            } else if (iT == 1) {
                listF = s.f(cVar, f11);
            } else if (iT == 2) {
                listF2 = s.f(cVar, f11);
            } else if (iT != 3) {
                cVar.B();
                cVar.F();
            } else {
                listF3 = s.f(cVar, f11);
            }
        }
        cVar.j();
        if (cVar.o() == gg.c.b.END_ARRAY) {
            cVar.e();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new cg.o(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 1; i11 < size; i11++) {
            PointF pointF2 = listF.get(i11);
            int i12 = i11 - 1;
            arrayList.add(new ag.a(hg.j.a(listF.get(i12), listF3.get(i12)), hg.j.a(pointF2, listF2.get(i11)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = listF.get(0);
            int i13 = size - 1;
            arrayList.add(new ag.a(hg.j.a(listF.get(i13), listF3.get(i13)), hg.j.a(pointF3, listF2.get(0)), pointF3));
        }
        return new cg.o(pointF, zNextBoolean, arrayList);
    }
}
