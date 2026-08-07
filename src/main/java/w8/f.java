package w8;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static void a(long j11, s7.c0 c0Var, o0[] o0VarArr) {
        while (true) {
            if (c0Var.a() <= 1) {
                return;
            }
            int iC = c(c0Var);
            int iC2 = c(c0Var);
            int iG = c0Var.g() + iC2;
            if (iC2 == -1 || iC2 > c0Var.a()) {
                s7.t.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iG = c0Var.j();
            } else if (iC == 4 && iC2 >= 8) {
                int iM = c0Var.M();
                int iU = c0Var.U();
                int iV = iU == 49 ? c0Var.v() : 0;
                int iM2 = c0Var.M();
                if (iU == 47) {
                    c0Var.c0(1);
                }
                boolean z11 = iM == 181 && (iU == 49 || iU == 47) && iM2 == 3;
                if (iU == 49) {
                    z11 &= iV == 1195456820;
                }
                if (z11) {
                    b(j11, c0Var, o0VarArr);
                }
            }
            c0Var.b0(iG);
        }
    }

    public static void b(long j11, s7.c0 c0Var, o0[] o0VarArr) {
        int iM = c0Var.M();
        if ((iM & 64) != 0) {
            c0Var.c0(1);
            int i11 = (iM & 31) * 3;
            int iG = c0Var.g();
            for (o0 o0Var : o0VarArr) {
                c0Var.b0(iG);
                o0Var.f(c0Var, i11);
                s7.a.h(j11 != -9223372036854775807L);
                o0Var.b(j11, 1, i11, 0, null);
            }
        }
    }

    private static int c(s7.c0 c0Var) {
        int i11 = 0;
        while (c0Var.a() != 0) {
            int iM = c0Var.M();
            i11 += iM;
            if (iM != 255) {
                return i11;
            }
        }
        return -1;
    }
}
