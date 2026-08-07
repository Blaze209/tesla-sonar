package bg;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends p<cg.d, cg.d> {
    public c(List<ig.a<cg.d>> list) {
        super(d(list));
    }

    private static ig.a<cg.d> c(ig.a<cg.d> aVar) {
        cg.d dVar = aVar.f77657b;
        cg.d dVar2 = aVar.f77658c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrE = e(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrE), dVar2.b(fArrE));
    }

    private static List<ig.a<cg.d>> d(List<ig.a<cg.d>> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.set(i11, c(list.get(i11)));
        }
        return list;
    }

    static float[] e(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f11 = Float.NaN;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            float f12 = fArr3[i12];
            if (f12 != f11) {
                fArr3[i11] = f12;
                i11++;
                f11 = fArr3[i12];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i11);
    }

    @Override // bg.o
    public wf.a<cg.d, cg.d> a() {
        return new wf.e(this.f17126a);
    }

    @Override // bg.p, bg.o
    public /* bridge */ /* synthetic */ List b() {
        return super.b();
    }

    @Override // bg.p, bg.o
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // bg.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
