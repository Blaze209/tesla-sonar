package qs;

import android.util.Pair;
import br.j0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.f2;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class t extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f106076c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f106077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f106078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f106079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final es.w[] f106080d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f106081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f106082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final es.w f106083g;

        a(String[] strArr, int[] iArr, es.w[] wVarArr, int[] iArr2, int[][][] iArr3, es.w wVar) {
            this.f106078b = strArr;
            this.f106079c = iArr;
            this.f106080d = wVarArr;
            this.f106082f = iArr3;
            this.f106081e = iArr2;
            this.f106083g = wVar;
            this.f106077a = iArr.length;
        }

        public int a(int i11, int i12, boolean z11) {
            int i13 = this.f106080d[i11].b(i12).f63205a;
            int[] iArr = new int[i13];
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                int iG = g(i11, i12, i15);
                if (iG == 4 || (z11 && iG == 3)) {
                    iArr[i14] = i15;
                    i14++;
                }
            }
            return b(i11, i12, Arrays.copyOf(iArr, i14));
        }

        public int b(int i11, int i12, int[] iArr) {
            int i13 = 0;
            int iMin = 16;
            String str = null;
            boolean z11 = false;
            int i14 = 0;
            while (i13 < iArr.length) {
                String str2 = this.f106080d[i11].b(i12).c(iArr[i13]).f40712l;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z11 |= !p0.c(str, str2);
                }
                iMin = Math.min(iMin, a2.i(this.f106082f[i11][i12][i13]));
                i13++;
                i14 = i15;
            }
            return z11 ? Math.min(iMin, this.f106081e[i11]) : iMin;
        }

        public int c(int i11, int i12, int i13) {
            return this.f106082f[i11][i12][i13];
        }

        public int d() {
            return this.f106077a;
        }

        public int e(int i11) {
            return this.f106079c[i11];
        }

        public es.w f(int i11) {
            return this.f106080d[i11];
        }

        public int g(int i11, int i12, int i13) {
            return a2.q(c(i11, i12, i13));
        }

        public es.w h() {
            return this.f106083g;
        }
    }

    private static int n(a2[] a2VarArr, es.u uVar, int[] iArr, boolean z11) {
        int length = a2VarArr.length;
        int i11 = 0;
        boolean z12 = true;
        for (int i12 = 0; i12 < a2VarArr.length; i12++) {
            a2 a2Var = a2VarArr[i12];
            int iMax = 0;
            for (int i13 = 0; i13 < uVar.f63205a; i13++) {
                iMax = Math.max(iMax, a2.q(a2Var.b(uVar.c(i13))));
            }
            boolean z13 = iArr[i12] == 0;
            if (iMax > i11 || (iMax == i11 && z11 && !z12 && z13)) {
                length = i12;
                z12 = z13;
                i11 = iMax;
            }
        }
        return length;
    }

    private static int[] o(a2 a2Var, es.u uVar) {
        int[] iArr = new int[uVar.f63205a];
        for (int i11 = 0; i11 < uVar.f63205a; i11++) {
            iArr[i11] = a2Var.b(uVar.c(i11));
        }
        return iArr;
    }

    private static int[] p(a2[] a2VarArr) {
        int length = a2VarArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = a2VarArr[i11].A();
        }
        return iArr;
    }

    @Override // qs.a0
    public final void i(Object obj) {
        this.f106076c = (a) obj;
    }

    @Override // qs.a0
    public final b0 k(a2[] a2VarArr, es.w wVar, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var) {
        int[] iArr = new int[a2VarArr.length + 1];
        int length = a2VarArr.length + 1;
        es.u[][] uVarArr = new es.u[length][];
        int[][][] iArr2 = new int[a2VarArr.length + 1][][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = wVar.f63213a;
            uVarArr[i11] = new es.u[i12];
            iArr2[i11] = new int[i12][];
        }
        int[] iArrP = p(a2VarArr);
        for (int i13 = 0; i13 < wVar.f63213a; i13++) {
            es.u uVarB = wVar.b(i13);
            int iN = n(a2VarArr, uVarB, iArr, uVarB.f63207c == 5);
            int[] iArrO = iN == a2VarArr.length ? new int[uVarB.f63205a] : o(a2VarArr[iN], uVarB);
            int i14 = iArr[iN];
            uVarArr[iN][i14] = uVarB;
            iArr2[iN][i14] = iArrO;
            iArr[iN] = i14 + 1;
        }
        es.w[] wVarArr = new es.w[a2VarArr.length];
        String[] strArr = new String[a2VarArr.length];
        int[] iArr3 = new int[a2VarArr.length];
        for (int i15 = 0; i15 < a2VarArr.length; i15++) {
            int i16 = iArr[i15];
            wVarArr[i15] = new es.w((es.u[]) p0.H0(uVarArr[i15], i16));
            iArr2[i15] = (int[][]) p0.H0(iArr2[i15], i16);
            strArr[i15] = a2VarArr[i15].getName();
            iArr3[i15] = a2VarArr[i15].c();
        }
        a aVar = new a(strArr, iArr3, wVarArr, iArrP, iArr2, new es.w((es.u[]) p0.H0(uVarArr[a2VarArr.length], iArr[a2VarArr.length])));
        Pair<j0[], r[]> pairQ = q(aVar, iArr2, iArrP, bVar, f2Var);
        return new b0((j0[]) pairQ.first, (r[]) pairQ.second, z.b(aVar, (u[]) pairQ.second), aVar);
    }

    protected abstract Pair<j0[], r[]> q(a aVar, int[][][] iArr, int[] iArr2, com.google.android.exoplayer2.source.o.b bVar, f2 f2Var);
}
