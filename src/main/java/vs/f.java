package vs;

import java.util.ArrayList;
import java.util.zip.Inflater;
import ts.c0;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f {
    public static e a(byte[] bArr, int i11) {
        ArrayList<e.a> arrayListF;
        d0 d0Var = new d0(bArr);
        try {
            arrayListF = c(d0Var) ? f(d0Var) : e(d0Var);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayListF = null;
        }
        if (arrayListF == null) {
            return null;
        }
        int size = arrayListF.size();
        if (size == 1) {
            return new e(arrayListF.get(0), i11);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayListF.get(0), arrayListF.get(1), i11);
    }

    private static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >> 1);
    }

    private static boolean c(d0 d0Var) {
        d0Var.V(4);
        int iQ = d0Var.q();
        d0Var.U(0);
        return iQ == 1886547818;
    }

    private static e.a d(d0 d0Var) {
        int iQ = d0Var.q();
        e.a aVar = null;
        if (iQ > 10000) {
            return null;
        }
        float[] fArr = new float[iQ];
        for (int i11 = 0; i11 < iQ; i11++) {
            fArr[i11] = d0Var.p();
        }
        int iQ2 = d0Var.q();
        if (iQ2 > 32000) {
            return null;
        }
        double d11 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iQ) * 2.0d) / dLog);
        c0 c0Var = new c0(d0Var.e());
        int i12 = 8;
        c0Var.p(d0Var.f() * 8);
        float[] fArr2 = new float[iQ2 * 5];
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iQ2) {
            e.a aVar2 = aVar;
            int i15 = 0;
            while (i15 < 5) {
                int iB = iArr[i15] + b(c0Var.h(iCeil));
                if (iB >= iQ || iB < 0) {
                    return aVar2;
                }
                fArr2[i14] = fArr[iB];
                iArr[i15] = iB;
                i15++;
                i14++;
            }
            i13++;
            aVar = aVar2;
        }
        e.a aVar3 = aVar;
        c0Var.p((c0Var.e() + 7) & (-8));
        int i16 = 32;
        int iH = c0Var.h(32);
        e.b[] bVarArr = new e.b[iH];
        int i17 = 0;
        while (i17 < iH) {
            int iH2 = c0Var.h(i12);
            int iH3 = c0Var.h(i12);
            int iH4 = c0Var.h(i16);
            if (iH4 > 128000) {
                return aVar3;
            }
            int i18 = iH;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iQ2) * d11) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int i19 = 0;
            int i21 = 0;
            while (i19 < iH4) {
                int iB2 = i21 + b(c0Var.h(iCeil2));
                if (iB2 < 0 || iB2 >= iQ2) {
                    return aVar3;
                }
                int i22 = i19 * 3;
                int i23 = iB2 * 5;
                fArr3[i22] = fArr2[i23];
                fArr3[i22 + 1] = fArr2[i23 + 1];
                fArr3[i22 + 2] = fArr2[i23 + 2];
                int i24 = i19 * 2;
                fArr4[i24] = fArr2[i23 + 3];
                fArr4[i24 + 1] = fArr2[i23 + 4];
                i19++;
                i21 = iB2;
            }
            bVarArr[i17] = new e.b(iH2, fArr3, fArr4, iH3);
            i17++;
            iH = i18;
            i16 = 32;
            d11 = 2.0d;
            i12 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList<e.a> e(d0 d0Var) {
        if (d0Var.H() != 0) {
            return null;
        }
        d0Var.V(7);
        int iQ = d0Var.q();
        if (iQ == 1684433976) {
            d0 d0Var2 = new d0();
            Inflater inflater = new Inflater(true);
            try {
                if (!p0.s0(d0Var, d0Var2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                d0Var = d0Var2;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iQ != 1918990112) {
            return null;
        }
        return g(d0Var);
    }

    private static ArrayList<e.a> f(d0 d0Var) {
        int iQ;
        d0Var.V(8);
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG && (iQ = d0Var.q() + iF) > iF && iQ <= iG) {
            int iQ2 = d0Var.q();
            if (iQ2 == 2037673328 || iQ2 == 1836279920) {
                d0Var.T(iQ);
                return e(d0Var);
            }
            d0Var.U(iQ);
            iF = iQ;
        }
        return null;
    }

    private static ArrayList<e.a> g(d0 d0Var) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG) {
            int iQ = d0Var.q() + iF;
            if (iQ <= iF || iQ > iG) {
                return null;
            }
            if (d0Var.q() == 1835365224) {
                e.a aVarD = d(d0Var);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            d0Var.U(iQ);
            iF = iQ;
        }
        return arrayList;
    }
}
