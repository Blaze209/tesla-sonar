package hr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {
    public static void a(long j11, ts.d0 d0Var, b0[] b0VarArr) {
        while (true) {
            if (d0Var.a() <= 1) {
                return;
            }
            int iC = c(d0Var);
            int iC2 = c(d0Var);
            int iF = d0Var.f() + iC2;
            if (iC2 == -1 || iC2 > d0Var.a()) {
                ts.u.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iF = d0Var.g();
            } else if (iC == 4 && iC2 >= 8) {
                int iH = d0Var.H();
                int iN = d0Var.N();
                int iQ = iN == 49 ? d0Var.q() : 0;
                int iH2 = d0Var.H();
                if (iN == 47) {
                    d0Var.V(1);
                }
                boolean z11 = iH == 181 && (iN == 49 || iN == 47) && iH2 == 3;
                if (iN == 49) {
                    z11 &= iQ == 1195456820;
                }
                if (z11) {
                    b(j11, d0Var, b0VarArr);
                }
            }
            d0Var.U(iF);
        }
    }

    public static void b(long j11, ts.d0 d0Var, b0[] b0VarArr) {
        long j12;
        int iH = d0Var.H();
        if ((iH & 64) != 0) {
            d0Var.V(1);
            int i11 = (iH & 31) * 3;
            int iF = d0Var.f();
            int length = b0VarArr.length;
            int i12 = 0;
            while (i12 < length) {
                b0 b0Var = b0VarArr[i12];
                d0Var.U(iF);
                b0Var.d(d0Var, i11);
                if (j11 != -9223372036854775807L) {
                    j12 = j11;
                    b0Var.e(j12, 1, i11, 0, null);
                } else {
                    j12 = j11;
                }
                i12++;
                j11 = j12;
            }
        }
    }

    private static int c(ts.d0 d0Var) {
        int i11 = 0;
        while (d0Var.a() != 0) {
            int iH = d0Var.H();
            i11 += iH;
            if (iH != 255) {
                return i11;
            }
        }
        return -1;
    }
}
