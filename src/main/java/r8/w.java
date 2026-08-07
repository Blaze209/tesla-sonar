package r8;

import android.util.Pair;
import androidx.media3.exoplayer.m2;
import java.util.Arrays;
import java.util.Objects;
import p7.r0;
import p7.t0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f107275c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f107276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f107277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f107278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final n8.y[] f107279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f107280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[][][] f107281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final n8.y f107282g;

        a(String[] strArr, int[] iArr, n8.y[] yVarArr, int[] iArr2, int[][][] iArr3, n8.y yVar) {
            this.f107277b = strArr;
            this.f107278c = iArr;
            this.f107279d = yVarArr;
            this.f107281f = iArr3;
            this.f107280e = iArr2;
            this.f107282g = yVar;
            this.f107276a = iArr.length;
        }

        public int a(int i11, int i12, boolean z11) {
            int i13 = this.f107279d[i11].b(i12).f101499a;
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
                String str2 = this.f107279d[i11].b(i12).c(iArr[i13]).f101544o;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z11 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, m2.i(this.f107281f[i11][i12][i13]));
                i13++;
                i14 = i15;
            }
            return z11 ? Math.min(iMin, this.f107280e[i11]) : iMin;
        }

        public int c(int i11, int i12, int i13) {
            return this.f107281f[i11][i12][i13];
        }

        public int d() {
            return this.f107276a;
        }

        public int e(int i11) {
            return this.f107278c[i11];
        }

        public n8.y f(int i11) {
            return this.f107279d[i11];
        }

        public int g(int i11, int i12, int i13) {
            return m2.q(c(i11, i12, i13));
        }

        public n8.y h() {
            return this.f107282g;
        }
    }

    private static int n(m2[] m2VarArr, t0 t0Var, int[] iArr, boolean z11) {
        int length = m2VarArr.length;
        int i11 = 0;
        boolean z12 = true;
        for (int i12 = 0; i12 < m2VarArr.length; i12++) {
            m2 m2Var = m2VarArr[i12];
            int iMax = 0;
            for (int i13 = 0; i13 < t0Var.f101499a; i13++) {
                iMax = Math.max(iMax, m2.q(m2Var.b(t0Var.c(i13))));
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

    private static int[] p(m2 m2Var, t0 t0Var) {
        int[] iArr = new int[t0Var.f101499a];
        for (int i11 = 0; i11 < t0Var.f101499a; i11++) {
            iArr[i11] = m2Var.b(t0Var.c(i11));
        }
        return iArr;
    }

    private static int[] q(m2[] m2VarArr) {
        int length = m2VarArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = m2VarArr[i11].A();
        }
        return iArr;
    }

    @Override // r8.a0
    public final void i(Object obj) {
        this.f107275c = (a) obj;
    }

    @Override // r8.a0
    public final b0 k(m2[] m2VarArr, n8.y yVar, androidx.media3.exoplayer.source.r.b bVar, r0 r0Var) {
        int[] iArr = new int[m2VarArr.length + 1];
        int length = m2VarArr.length + 1;
        t0[][] t0VarArr = new t0[length][];
        int[][][] iArr2 = new int[m2VarArr.length + 1][][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = yVar.f93615a;
            t0VarArr[i11] = new t0[i12];
            iArr2[i11] = new int[i12][];
        }
        int[] iArrQ = q(m2VarArr);
        for (int i13 = 0; i13 < yVar.f93615a; i13++) {
            t0 t0VarB = yVar.b(i13);
            int iN = n(m2VarArr, t0VarB, iArr, t0VarB.f101501c == 5);
            int[] iArrP = iN == m2VarArr.length ? new int[t0VarB.f101499a] : p(m2VarArr[iN], t0VarB);
            int i14 = iArr[iN];
            t0VarArr[iN][i14] = t0VarB;
            iArr2[iN][i14] = iArrP;
            iArr[iN] = i14 + 1;
        }
        n8.y[] yVarArr = new n8.y[m2VarArr.length];
        String[] strArr = new String[m2VarArr.length];
        int[] iArr3 = new int[m2VarArr.length];
        for (int i15 = 0; i15 < m2VarArr.length; i15++) {
            int i16 = iArr[i15];
            yVarArr[i15] = new n8.y((t0[]) q0.h1(t0VarArr[i15], i16));
            iArr2[i15] = (int[][]) q0.h1(iArr2[i15], i16);
            strArr[i15] = m2VarArr[i15].getName();
            iArr3[i15] = m2VarArr[i15].c();
        }
        a aVar = new a(strArr, iArr3, yVarArr, iArrQ, iArr2, new n8.y((t0[]) q0.h1(t0VarArr[m2VarArr.length], iArr[m2VarArr.length])));
        Pair<z7.y[], t[]> pairR = r(aVar, iArr2, iArrQ, bVar, r0Var);
        return new b0((z7.y[]) pairR.first, (t[]) pairR.second, z.b(aVar, (x[]) pairR.second), aVar);
    }

    public final a o() {
        return this.f107275c;
    }

    protected abstract Pair<z7.y[], t[]> r(a aVar, int[][][] iArr, int[] iArr2, androidx.media3.exoplayer.source.r.b bVar, r0 r0Var);
}
