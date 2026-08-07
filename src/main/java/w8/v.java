package w8;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f121419a;
    }

    private static boolean a(s7.c0 c0Var, y yVar, int i11) {
        int iJ = j(c0Var, i11);
        return iJ != -1 && iJ <= yVar.f121424b;
    }

    private static boolean b(s7.c0 c0Var, int i11) {
        return c0Var.M() == s7.q0.A(c0Var.f(), i11, c0Var.g() - 1, 0);
    }

    private static boolean c(s7.c0 c0Var, y yVar, boolean z11, a aVar) {
        try {
            long jV = c0Var.V();
            if (!z11) {
                jV *= (long) yVar.f121424b;
            }
            aVar.f121419a = jV;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(s7.c0 c0Var, y yVar, int i11, a aVar) {
        int iG = c0Var.g();
        long jO = c0Var.O();
        long j11 = jO >>> 16;
        if (j11 != i11) {
            return false;
        }
        return g((int) ((jO >> 4) & 15), yVar) && f((int) ((jO >> 1) & 7), yVar) && !(((jO & 1) > 1L ? 1 : ((jO & 1) == 1L ? 0 : -1)) == 0) && c(c0Var, yVar, ((j11 & 1) > 1L ? 1 : ((j11 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(c0Var, yVar, (int) ((jO >> 12) & 15)) && e(c0Var, yVar, (int) ((jO >> 8) & 15)) && b(c0Var, iG);
    }

    private static boolean e(s7.c0 c0Var, y yVar, int i11) {
        int i12 = yVar.f121427e;
        if (i11 == 0) {
            return true;
        }
        if (i11 <= 11) {
            return i11 == yVar.f121428f;
        }
        if (i11 == 12) {
            return c0Var.M() * 1000 == i12;
        }
        if (i11 <= 14) {
            int iU = c0Var.U();
            if (i11 == 14) {
                iU *= 10;
            }
            if (iU == i12) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i11, y yVar) {
        return i11 == 0 || i11 == yVar.f121431i;
    }

    private static boolean g(int i11, y yVar) {
        if (i11 <= 7) {
            return i11 == yVar.f121429g - 1;
        }
        return i11 <= 10 && yVar.f121429g == 2;
    }

    public static boolean h(q qVar, y yVar, int i11, a aVar) {
        long jH = qVar.h();
        byte[] bArr = new byte[2];
        qVar.e(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i11) {
            qVar.g();
            qVar.i((int) (jH - qVar.getPosition()));
            return false;
        }
        s7.c0 c0Var = new s7.c0(16);
        System.arraycopy(bArr, 0, c0Var.f(), 0, 2);
        c0Var.a0(s.d(qVar, c0Var.f(), 2, 14));
        qVar.g();
        qVar.i((int) (jH - qVar.getPosition()));
        return d(c0Var, yVar, i11, aVar);
    }

    public static long i(q qVar, y yVar) throws ParserException {
        qVar.g();
        qVar.i(1);
        byte[] bArr = new byte[1];
        qVar.e(bArr, 0, 1);
        boolean z11 = (bArr[0] & 1) == 1;
        qVar.i(2);
        int i11 = z11 ? 7 : 6;
        s7.c0 c0Var = new s7.c0(i11);
        c0Var.a0(s.d(qVar, c0Var.f(), 0, i11));
        qVar.g();
        a aVar = new a();
        if (c(c0Var, yVar, z11, aVar)) {
            return aVar.f121419a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(s7.c0 c0Var, int i11) {
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
                return c0Var.M() + 1;
            case 7:
                return c0Var.U() + 1;
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
