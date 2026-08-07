package fg;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static gg.c.a f65936a = gg.c.a.a("k");

    static <T> List<ig.a<T>> a(gg.c cVar, tf.i iVar, float f11, n0<T> n0Var, boolean z11) {
        gg.c cVar2;
        tf.i iVar2;
        float f12;
        n0<T> n0Var2;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        if (cVar.o() == gg.c.b.STRING) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.h();
        while (cVar.hasNext()) {
            if (cVar.t(f65936a) != 0) {
                cVar.F();
            } else if (cVar.o() == gg.c.b.BEGIN_ARRAY) {
                cVar.f();
                if (cVar.o() == gg.c.b.NUMBER) {
                    gg.c cVar3 = cVar;
                    tf.i iVar3 = iVar;
                    float f13 = f11;
                    n0<T> n0Var3 = n0Var;
                    boolean z13 = z11;
                    ig.a aVarC = t.c(cVar3, iVar3, f13, n0Var3, false, z13);
                    cVar2 = cVar3;
                    iVar2 = iVar3;
                    f12 = f13;
                    n0Var2 = n0Var3;
                    z12 = z13;
                    arrayList.add(aVarC);
                } else {
                    cVar2 = cVar;
                    iVar2 = iVar;
                    f12 = f11;
                    n0Var2 = n0Var;
                    z12 = z11;
                    while (cVar2.hasNext()) {
                        arrayList.add(t.c(cVar2, iVar2, f12, n0Var2, true, z12));
                    }
                }
                cVar2.e();
                cVar = cVar2;
                iVar = iVar2;
                f11 = f12;
                n0Var = n0Var2;
                z11 = z12;
            } else {
                gg.c cVar4 = cVar;
                arrayList.add(t.c(cVar4, iVar, f11, n0Var, false, z11));
                cVar = cVar4;
            }
        }
        cVar.j();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends ig.a<T>> list) {
        int i11;
        T t11;
        int size = list.size();
        int i12 = 0;
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            ig.a<T> aVar = list.get(i12);
            i12++;
            ig.a<T> aVar2 = list.get(i12);
            aVar.f77663h = Float.valueOf(aVar2.f77662g);
            if (aVar.f77658c == null && (t11 = aVar2.f77657b) != null) {
                aVar.f77658c = t11;
                if (aVar instanceof wf.i) {
                    ((wf.i) aVar).j();
                }
            }
        }
        ig.a<T> aVar3 = list.get(i11);
        if ((aVar3.f77657b == null || aVar3.f77658c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
