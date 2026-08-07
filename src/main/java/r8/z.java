package r8;

import android.graphics.Point;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p7.a1;
import p7.t0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class z {
    public static a1 a(w.a aVar, List<? extends x>[] listArr) {
        boolean z11;
        com.google.common.collect.x.a aVar2 = new com.google.common.collect.x.a();
        for (int i11 = 0; i11 < aVar.d(); i11++) {
            n8.y yVarF = aVar.f(i11);
            List<? extends x> list = listArr[i11];
            for (int i12 = 0; i12 < yVarF.f93615a; i12++) {
                t0 t0VarB = yVarF.b(i12);
                boolean z12 = aVar.a(i11, i12, false) != 0;
                int i13 = t0VarB.f101499a;
                int[] iArr = new int[i13];
                boolean[] zArr = new boolean[i13];
                for (int i14 = 0; i14 < t0VarB.f101499a; i14++) {
                    iArr[i14] = aVar.g(i11, i12, i14);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        x xVar = list.get(i15);
                        if (xVar.e().equals(t0VarB) && xVar.d(i14) != -1) {
                            z11 = true;
                            break;
                        }
                        i15++;
                    }
                    zArr[i14] = z11;
                }
                aVar2.a(new a1.a(t0VarB, z12, iArr, zArr));
            }
        }
        n8.y yVarH = aVar.h();
        for (int i16 = 0; i16 < yVarH.f93615a; i16++) {
            t0 t0VarB2 = yVarH.b(i16);
            int[] iArr2 = new int[t0VarB2.f101499a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new a1.a(t0VarB2, false, iArr2, new boolean[t0VarB2.f101499a]));
        }
        return new a1(aVar2.k());
    }

    public static a1 b(w.a aVar, x[] xVarArr) {
        List[] listArr = new List[xVarArr.length];
        for (int i11 = 0; i11 < xVarArr.length; i11++) {
            x xVar = xVarArr[i11];
            listArr[i11] = xVar != null ? com.google.common.collect.x.s(xVar) : com.google.common.collect.x.r();
        }
        return a(aVar, listArr);
    }

    public static androidx.media3.exoplayer.upstream.b.a c(t tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (tVar.l(i12, jElapsedRealtime)) {
                i11++;
            }
        }
        return new androidx.media3.exoplayer.upstream.b.a(1, 0, length, i11);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    public static Point d(boolean z11, int i11, int i12, int i13, int i14) {
        if (z11) {
            if ((i13 > i14) == (i11 > i12)) {
                i12 = i11;
                i11 = i12;
            }
        } else {
            i12 = i11;
            i11 = i12;
        }
        int i15 = i13 * i11;
        int i16 = i14 * i12;
        return i15 >= i16 ? new Point(i12, q0.n(i16, i13)) : new Point(q0.n(i15, i14), i11);
    }
}
