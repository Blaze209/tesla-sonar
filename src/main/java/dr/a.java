package dr;

import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.plaid.internal.EnumC4419g;
import ts.c0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f60843a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f60844b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f60847c;

        private b(int i11, int i12, String str) {
            this.f60845a = i11;
            this.f60846b = i12;
            this.f60847c = str;
        }
    }

    public static byte[] a(int i11, int i12, int i13) {
        return new byte[]{(byte) (((i11 << 3) & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE) | ((i12 >> 1) & 7)), (byte) (((i12 << 7) & 128) | ((i13 << 3) & 120))};
    }

    private static int b(c0 c0Var) {
        int iH = c0Var.h(5);
        return iH == 31 ? c0Var.h(6) + 32 : iH;
    }

    private static int c(c0 c0Var) throws ParserException {
        int iH = c0Var.h(4);
        if (iH == 15) {
            if (c0Var.b() >= 24) {
                return c0Var.h(24);
            }
            throw ParserException.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f60843a[iH];
        }
        throw ParserException.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b d(c0 c0Var, boolean z11) throws ParserException {
        int iB = b(c0Var);
        int iC = c(c0Var);
        int iH = c0Var.h(4);
        String str = "mp4a.40." + iB;
        if (iB == 5 || iB == 29) {
            iC = c(c0Var);
            iB = b(c0Var);
            if (iB == 22) {
                iH = c0Var.h(4);
            }
        }
        if (z11) {
            if (iB != 1 && iB != 2 && iB != 3 && iB != 4 && iB != 6 && iB != 7 && iB != 17) {
                switch (iB) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + iB);
                }
            }
            f(c0Var, iB, iH);
            switch (iB) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = c0Var.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw ParserException.c("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i11 = f60844b[iH];
        if (i11 != -1) {
            return new b(iC, i11, str);
        }
        throw ParserException.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new c0(bArr), false);
    }

    private static void f(c0 c0Var, int i11, int i12) {
        if (c0Var.g()) {
            ts.u.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c0Var.g()) {
            c0Var.r(14);
        }
        boolean zG = c0Var.g();
        if (i12 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i11 == 6 || i11 == 20) {
            c0Var.r(3);
        }
        if (zG) {
            if (i11 == 22) {
                c0Var.r(16);
            }
            if (i11 == 17 || i11 == 19 || i11 == 20 || i11 == 23) {
                c0Var.r(3);
            }
            c0Var.r(1);
        }
    }
}
