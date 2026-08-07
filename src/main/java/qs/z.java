package qs;

import com.google.android.exoplayer2.g2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z {
    public static g2 a(t.a aVar, List<? extends u>[] listArr) {
        boolean z11;
        com.google.common.collect.x.a aVar2 = new com.google.common.collect.x.a();
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            es.w wVarF = aVar.f(i11);
            List<? extends u> list = listArr[i11];
            for (int i12 = 0; i12 < wVarF.f63213a; i12++) {
                es.u uVarB = wVarF.b(i12);
                boolean z12 = aVar.a(i11, i12, false) != 0;
                int i13 = uVarB.f63205a;
                int[] iArr = new int[i13];
                boolean[] zArr = new boolean[i13];
                for (int i14 = 0; i14 < uVarB.f63205a; i14++) {
                    iArr[i14] = aVar.g(i11, i12, i14);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        u uVar = list.get(i15);
                        if (uVar.e().equals(uVarB) && uVar.d(i14) != -1) {
                            z11 = true;
                            break;
                        }
                        i15++;
                    }
                    zArr[i14] = z11;
                }
                aVar2.a(new g2.a(uVarB, z12, iArr, zArr));
            }
        }
        es.w wVarH = aVar.h();
        for (int i16 = 0; i16 < wVarH.f63213a; i16++) {
            es.u uVarB2 = wVarH.b(i16);
            int[] iArr2 = new int[uVarB2.f63205a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new g2.a(uVarB2, false, iArr2, new boolean[uVarB2.f63205a]));
        }
        return new g2(aVar2.k());
    }

    public static g2 b(t.a aVar, u[] uVarArr) {
        List[] listArr = new List[uVarArr.length];
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            u uVar = uVarArr[i11];
            listArr[i11] = uVar != null ? com.google.common.collect.x.s(uVar) : com.google.common.collect.x.r();
        }
        return a(aVar, listArr);
    }
}
