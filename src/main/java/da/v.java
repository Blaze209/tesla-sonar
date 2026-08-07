package da;

import androidx.media3.common.ParserException;
import ch.qos.logback.classic.Level;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
final class v {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f60318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f60319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f60320c;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f60324d;

        private c(int i11, int i12, int i13, byte[] bArr) {
            this.f60321a = i11;
            this.f60322b = i12;
            this.f60323c = i13;
            this.f60324d = bArr;
        }
    }

    private static int a(int i11) throws ParserException {
        if (i11 == 0) {
            return 768;
        }
        if (i11 == 1) {
            return 1024;
        }
        if (i11 == 2 || i11 == 3) {
            return 2048;
        }
        if (i11 == 4) {
            return 4096;
        }
        throw ParserException.d("Unsupported coreSbrFrameLengthIndex " + i11);
    }

    private static double b(int i11) throws ParserException {
        switch (i11) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw ParserException.d("Unsupported sampling rate " + i11);
        }
    }

    private static int c(int i11) throws ParserException {
        switch (i11) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw ParserException.d("Unsupported sampling rate index " + i11);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return Level.INFO_INT;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    private static int d(int i11) throws ParserException {
        if (i11 == 0 || i11 == 1) {
            return 0;
        }
        int i12 = 2;
        if (i11 != 2) {
            i12 = 3;
            if (i11 != 3) {
                if (i11 == 4) {
                    return 1;
                }
                throw ParserException.d("Unsupported coreSbrFrameLengthIndex " + i11);
            }
        }
        return i12;
    }

    public static boolean e(int i11) {
        return (i11 & 16777215) == 12583333;
    }

    public static int f(s7.b0 b0Var) {
        if (!b0Var.g()) {
            return 0;
        }
        b0Var.r(2);
        return b0Var.h(13);
    }

    public static boolean g(s7.b0 b0Var, b bVar) throws ParserException {
        b0Var.d();
        int iK = k(b0Var, 3, 8, 8);
        bVar.f60318a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(b0Var, 2, 8, 32);
        bVar.f60319b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw ParserException.d("Contains sub-stream with an invalid packet label " + bVar.f60319b);
        }
        if (jL == 0) {
            int i11 = bVar.f60318a;
            if (i11 == 1) {
                throw ParserException.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i11 == 2) {
                throw ParserException.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i11 == 17) {
                throw ParserException.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(b0Var, 11, 24, 24);
        bVar.f60320c = iK2;
        return iK2 != -1;
    }

    public static c h(s7.b0 b0Var) throws ParserException {
        int iH = b0Var.h(8);
        int iH2 = b0Var.h(5);
        int iH3 = iH2 == 31 ? b0Var.h(24) : c(iH2);
        int iH4 = b0Var.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        b0Var.r(2);
        p(b0Var);
        m(b0Var, j(b0Var), iD);
        byte[] bArr = null;
        if (b0Var.g()) {
            int iK = k(b0Var, 2, 4, 8) + 1;
            for (int i11 = 0; i11 < iK; i11++) {
                int iK2 = k(b0Var, 4, 8, 16);
                int iK3 = k(b0Var, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = b0Var.h(4) + 1;
                    b0Var.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i12 = 0; i12 < iH5; i12++) {
                        bArr2[i12] = (byte) b0Var.h(8);
                    }
                    bArr = bArr2;
                } else {
                    b0Var.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (((double) iH3) * dB), (int) (((double) iA) * dB), bArr3);
    }

    private static boolean i(s7.b0 b0Var) {
        b0Var.r(3);
        boolean zG = b0Var.g();
        if (zG) {
            b0Var.r(13);
        }
        return zG;
    }

    private static int j(s7.b0 b0Var) {
        int iH = b0Var.h(5);
        int iK = 0;
        for (int i11 = 0; i11 < iH + 1; i11++) {
            int iH2 = b0Var.h(3);
            iK += k(b0Var, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && b0Var.g()) {
                p(b0Var);
            }
        }
        return iK;
    }

    private static int k(s7.b0 b0Var, int i11, int i12, int i13) {
        s7.a.a(Math.max(Math.max(i11, i12), i13) <= 31);
        int i14 = (1 << i11) - 1;
        int i15 = (1 << i12) - 1;
        qu.d.a(qu.d.a(i14, i15), 1 << i13);
        if (b0Var.b() < i11) {
            return -1;
        }
        int iH = b0Var.h(i11);
        if (iH != i14) {
            return iH;
        }
        if (b0Var.b() < i12) {
            return -1;
        }
        int iH2 = b0Var.h(i12);
        int i16 = iH + iH2;
        if (iH2 != i15) {
            return i16;
        }
        if (b0Var.b() < i13) {
            return -1;
        }
        return i16 + b0Var.h(i13);
    }

    private static long l(s7.b0 b0Var, int i11, int i12, int i13) {
        s7.a.a(Math.max(Math.max(i11, i12), i13) <= 63);
        long j11 = (1 << i11) - 1;
        long j12 = (1 << i12) - 1;
        qu.e.a(qu.e.a(j11, j12), 1 << i13);
        if (b0Var.b() < i11) {
            return -1L;
        }
        long j13 = b0Var.j(i11);
        if (j13 != j11) {
            return j13;
        }
        if (b0Var.b() < i12) {
            return -1L;
        }
        long j14 = b0Var.j(i12);
        long j15 = j13 + j14;
        if (j14 != j12) {
            return j15;
        }
        if (b0Var.b() < i13) {
            return -1L;
        }
        return j15 + b0Var.j(i13);
    }

    private static void m(s7.b0 b0Var, int i11, int i12) {
        int iH;
        int iK = k(b0Var, 4, 8, 16) + 1;
        b0Var.q();
        for (int i13 = 0; i13 < iK; i13++) {
            int iH2 = b0Var.h(2);
            if (iH2 == 0) {
                i(b0Var);
                if (i12 > 0) {
                    o(b0Var);
                }
            } else if (iH2 == 1) {
                if (i(b0Var)) {
                    b0Var.q();
                }
                if (i12 > 0) {
                    o(b0Var);
                    iH = b0Var.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    b0Var.r(6);
                    int iH3 = b0Var.h(2);
                    b0Var.r(4);
                    if (b0Var.g()) {
                        b0Var.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        b0Var.r(6);
                    }
                    if (iH3 == 2) {
                        b0Var.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i11 - 1) / Math.log(2.0d))) + 1;
                int iH4 = b0Var.h(2);
                if (iH4 > 0 && b0Var.g()) {
                    b0Var.r(iFloor);
                }
                if (b0Var.g()) {
                    b0Var.r(iFloor);
                }
                if (i12 == 0 && iH4 == 0) {
                    b0Var.q();
                }
            } else if (iH2 == 3) {
                k(b0Var, 4, 8, 16);
                int iK2 = k(b0Var, 4, 8, 16);
                if (b0Var.g()) {
                    k(b0Var, 8, 16, 0);
                }
                b0Var.q();
                if (iK2 > 0) {
                    b0Var.r(iK2 * 8);
                }
            }
        }
    }

    private static void n(s7.b0 b0Var, int i11) {
        int iH;
        boolean zG = b0Var.g();
        int i12 = zG ? 1 : 5;
        int i13 = zG ? 7 : 5;
        int i14 = zG ? 8 : 6;
        int i15 = 0;
        while (i15 < i11) {
            if (b0Var.g()) {
                b0Var.r(7);
                iH = 0;
            } else {
                if (b0Var.h(2) == 3 && b0Var.h(i13) * i12 != 0) {
                    b0Var.q();
                }
                iH = b0Var.h(i14) * i12;
                if (iH != 0 && iH != 180) {
                    b0Var.q();
                }
                b0Var.q();
            }
            if (iH != 0 && iH != 180 && b0Var.g()) {
                i15++;
            }
            i15++;
        }
    }

    private static void o(s7.b0 b0Var) {
        b0Var.r(3);
        b0Var.r(8);
        boolean zG = b0Var.g();
        boolean zG2 = b0Var.g();
        if (zG) {
            b0Var.r(5);
        }
        if (zG2) {
            b0Var.r(6);
        }
    }

    private static void p(s7.b0 b0Var) {
        int iH = b0Var.h(2);
        if (iH == 0) {
            b0Var.r(6);
            return;
        }
        int iK = k(b0Var, 5, 8, 16) + 1;
        if (iH == 1) {
            b0Var.r(iK * 7);
        } else if (iH == 2) {
            n(b0Var, iK);
        }
    }
}
