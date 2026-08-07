package q9;

import com.plaid.internal.EnumC4419g;
import p7.f0;
import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    private static int a(int i11, c0 c0Var, int i12) {
        if (i11 == 12) {
            return EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
        }
        if (i11 == 13) {
            return 120;
        }
        if (i11 == 21 && c0Var.a() >= 8 && c0Var.g() + 8 <= i12) {
            int iV = c0Var.v();
            int iV2 = c0Var.v();
            if (iV >= 12 && iV2 == 1936877170) {
                return c0Var.N();
            }
        }
        return -2147483647;
    }

    public static f0 b(c0 c0Var, int i11) {
        c0Var.c0(12);
        while (c0Var.g() < i11) {
            int iG = c0Var.g();
            int iV = c0Var.v();
            if (c0Var.v() == 1935766900) {
                if (iV < 16) {
                    return null;
                }
                c0Var.c0(4);
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < 2; i14++) {
                    int iM = c0Var.M();
                    int iM2 = c0Var.M();
                    if (iM == 0) {
                        i12 = iM2;
                    } else if (iM == 1) {
                        i13 = iM2;
                    }
                }
                int iA = a(i12, c0Var, i11);
                if (iA == -2147483647) {
                    return null;
                }
                return new f0(new l9.d(iA, i13));
            }
            c0Var.b0(iG + iV);
        }
        return null;
    }
}
