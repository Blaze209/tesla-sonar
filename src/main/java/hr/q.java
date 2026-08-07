package hr;

import com.google.android.exoplayer2.ParserException;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f73376a;
    }

    private static boolean a(ts.d0 d0Var, t tVar, int i11) {
        int iJ = j(d0Var, i11);
        return iJ != -1 && iJ <= tVar.f73381b;
    }

    private static boolean b(ts.d0 d0Var, int i11) {
        return d0Var.H() == p0.t(d0Var.e(), i11, d0Var.f() - 1, 0);
    }

    private static boolean c(ts.d0 d0Var, t tVar, boolean z11, a aVar) {
        try {
            long jO = d0Var.O();
            if (!z11) {
                jO *= (long) tVar.f73381b;
            }
            aVar.f73376a = jO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(ts.d0 d0Var, t tVar, int i11, a aVar) {
        int iF = d0Var.f();
        long J = d0Var.J();
        long j11 = J >>> 16;
        if (j11 != i11) {
            return false;
        }
        return g((int) ((J >> 4) & 15), tVar) && f((int) ((J >> 1) & 7), tVar) && !(((J & 1) > 1L ? 1 : ((J & 1) == 1L ? 0 : -1)) == 0) && c(d0Var, tVar, ((j11 & 1) > 1L ? 1 : ((j11 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(d0Var, tVar, (int) ((J >> 12) & 15)) && e(d0Var, tVar, (int) ((J >> 8) & 15)) && b(d0Var, iF);
    }

    private static boolean e(ts.d0 d0Var, t tVar, int i11) {
        int i12 = tVar.f73384e;
        if (i11 == 0) {
            return true;
        }
        if (i11 <= 11) {
            return i11 == tVar.f73385f;
        }
        if (i11 == 12) {
            return d0Var.H() * 1000 == i12;
        }
        if (i11 <= 14) {
            int iN = d0Var.N();
            if (i11 == 14) {
                iN *= 10;
            }
            if (iN == i12) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i11, t tVar) {
        return i11 == 0 || i11 == tVar.f73388i;
    }

    private static boolean g(int i11, t tVar) {
        if (i11 <= 7) {
            return i11 == tVar.f73386g - 1;
        }
        return i11 <= 10 && tVar.f73386g == 2;
    }

    public static boolean h(l lVar, t tVar, int i11, a aVar) {
        long jH = lVar.h();
        byte[] bArr = new byte[2];
        lVar.e(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i11) {
            lVar.g();
            lVar.i((int) (jH - lVar.getPosition()));
            return false;
        }
        ts.d0 d0Var = new ts.d0(16);
        System.arraycopy(bArr, 0, d0Var.e(), 0, 2);
        d0Var.T(n.c(lVar, d0Var.e(), 2, 14));
        lVar.g();
        lVar.i((int) (jH - lVar.getPosition()));
        return d(d0Var, tVar, i11, aVar);
    }

    public static long i(l lVar, t tVar) throws ParserException {
        lVar.g();
        lVar.i(1);
        byte[] bArr = new byte[1];
        lVar.e(bArr, 0, 1);
        boolean z11 = (bArr[0] & 1) == 1;
        lVar.i(2);
        int i11 = z11 ? 7 : 6;
        ts.d0 d0Var = new ts.d0(i11);
        d0Var.T(n.c(lVar, d0Var.e(), 0, i11));
        lVar.g();
        a aVar = new a();
        if (c(d0Var, tVar, z11, aVar)) {
            return aVar.f73376a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(ts.d0 d0Var, int i11) {
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
                return d0Var.H() + 1;
            case 7:
                return d0Var.N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i11 - 8);
            default:
                return -1;
        }
    }
}
