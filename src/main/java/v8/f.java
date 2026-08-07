package v8;

import java.util.ArrayList;
import java.util.zip.Inflater;
import s7.b0;
import s7.c0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class f {
    public static e a(byte[] bArr, int i11) {
        ArrayList<e.a> arrayListF;
        c0 c0Var = new c0(bArr);
        try {
            arrayListF = c(c0Var) ? f(c0Var) : e(c0Var);
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

    private static boolean c(c0 c0Var) {
        c0Var.c0(4);
        int iV = c0Var.v();
        c0Var.b0(0);
        return iV == 1886547818;
    }

    private static e.a d(c0 c0Var) {
        int iV = c0Var.v();
        e.a aVar = null;
        if (iV > 10000) {
            return null;
        }
        float[] fArr = new float[iV];
        for (int i11 = 0; i11 < iV; i11++) {
            fArr[i11] = c0Var.u();
        }
        int iV2 = c0Var.v();
        if (iV2 > 32000) {
            return null;
        }
        double d11 = 2.0d;
        double dLog = Math.log(2.0d);
        int iCeil = (int) Math.ceil(Math.log(((double) iV) * 2.0d) / dLog);
        b0 b0Var = new b0(c0Var.f());
        int i12 = 8;
        b0Var.p(c0Var.g() * 8);
        float[] fArr2 = new float[iV2 * 5];
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < iV2) {
            e.a aVar2 = aVar;
            int i15 = 0;
            while (i15 < 5) {
                int iB = iArr[i15] + b(b0Var.h(iCeil));
                if (iB >= iV || iB < 0) {
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
        b0Var.p((b0Var.e() + 7) & (-8));
        int i16 = 32;
        int iH = b0Var.h(32);
        e.b[] bVarArr = new e.b[iH];
        int i17 = 0;
        while (i17 < iH) {
            int iH2 = b0Var.h(i12);
            int iH3 = b0Var.h(i12);
            int iH4 = b0Var.h(i16);
            if (iH4 > 128000) {
                return aVar3;
            }
            int i18 = iH;
            int iCeil2 = (int) Math.ceil(Math.log(((double) iV2) * d11) / dLog);
            float[] fArr3 = new float[iH4 * 3];
            float[] fArr4 = new float[iH4 * 2];
            int i19 = 0;
            int i21 = 0;
            while (i19 < iH4) {
                int iB2 = i21 + b(b0Var.h(iCeil2));
                if (iB2 < 0 || iB2 >= iV2) {
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

    private static ArrayList<e.a> e(c0 c0Var) {
        if (c0Var.M() != 0) {
            return null;
        }
        c0Var.c0(7);
        int iV = c0Var.v();
        if (iV == 1684433976) {
            c0 c0Var2 = new c0();
            Inflater inflater = new Inflater(true);
            try {
                if (!q0.M0(c0Var, c0Var2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                c0Var = c0Var2;
            } catch (Throwable th2) {
                inflater.end();
                throw th2;
            }
        } else if (iV != 1918990112) {
            return null;
        }
        return g(c0Var);
    }

    private static ArrayList<e.a> f(c0 c0Var) {
        int iV;
        c0Var.c0(8);
        int iG = c0Var.g();
        int iJ = c0Var.j();
        while (iG < iJ && (iV = c0Var.v() + iG) > iG && iV <= iJ) {
            int iV2 = c0Var.v();
            if (iV2 == 2037673328 || iV2 == 1836279920) {
                c0Var.a0(iV);
                return e(c0Var);
            }
            c0Var.b0(iV);
            iG = iV;
        }
        return null;
    }

    private static ArrayList<e.a> g(c0 c0Var) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int iG = c0Var.g();
        int iJ = c0Var.j();
        while (iG < iJ) {
            int iV = c0Var.v() + iG;
            if (iV <= iG || iV > iJ) {
                return null;
            }
            if (c0Var.v() == 1835365224) {
                e.a aVarD = d(c0Var);
                if (aVarD == null) {
                    return null;
                }
                arrayList.add(aVarD);
            }
            c0Var.b0(iV);
            iG = iV;
        }
        return arrayList;
    }
}
