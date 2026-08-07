package w8;

import androidx.media3.common.ParserException;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f121371a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f121372b = {-1, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f121373c = {64, 112, 128, 192, 224, 256, KyberEngine.KyberPolyBytes, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f121374d = {ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f121375e = {5, 8, 10, 12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f121376f = {6, 9, 12, 15};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f121377g = {2, 4, 6, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f121378h = {9, 11, 13, 16};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f121379i = {5, 8, 10, 12};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f121380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f121384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f121385f;

        private b(String str, int i11, int i12, int i13, long j11, int i14) {
            this.f121380a = str;
            this.f121382c = i11;
            this.f121381b = i12;
            this.f121383d = i13;
            this.f121384e = j11;
            this.f121385f = i14;
        }
    }

    private static void a(byte[] bArr, int i11) throws ParserException {
        int i12 = i11 - 2;
        if (((bArr[i11 - 1] & 255) | ((bArr[i12] << 8) & 65535)) != s7.q0.x(bArr, 0, i12, 65535)) {
            throw ParserException.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int b(byte[] bArr) {
        int i11;
        byte b11;
        int i12;
        int i13;
        byte b12;
        boolean z11 = false;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i13 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b12 = bArr[9];
            } else if (b13 != 31) {
                i11 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[7];
            } else {
                i13 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b12 = bArr[8];
            }
            i12 = (((b12 & 60) >> 2) | i13) + 1;
            z11 = true;
            if (z11) {
                return (i12 * 16) / 14;
            }
            return i12;
        }
        i11 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b11 = bArr[6];
        i12 = (((b11 & 240) >> 4) | i11) + 1;
        if (z11) {
            return (i12 * 16) / 14;
        }
        return i12;
    }

    public static int c(int i11) {
        if (i11 == 2147385345 || i11 == -25230976 || i11 == 536864768 || i11 == -14745368) {
            return 1;
        }
        if (i11 == 1683496997 || i11 == 622876772) {
            return 2;
        }
        if (i11 == 1078008818 || i11 == -233094848) {
            return 3;
        }
        return (i11 == 1908687592 || i11 == -398277519) ? 4 : 0;
    }

    private static s7.b0 d(byte[] bArr) {
        byte b11 = bArr[0];
        if (b11 == 127 || b11 == 100 || b11 == 64 || b11 == 113) {
            return new s7.b0(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(bArrCopyOf)) {
            for (int i11 = 0; i11 < bArrCopyOf.length - 1; i11 += 2) {
                byte b12 = bArrCopyOf[i11];
                int i12 = i11 + 1;
                bArrCopyOf[i11] = bArrCopyOf[i12];
                bArrCopyOf[i12] = b12;
            }
        }
        s7.b0 b0Var = new s7.b0(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            s7.b0 b0Var2 = new s7.b0(bArrCopyOf);
            while (b0Var2.b() >= 16) {
                b0Var2.r(2);
                b0Var.f(b0Var2.h(14), 14);
            }
        }
        b0Var.n(bArrCopyOf);
        return b0Var;
    }

    private static boolean e(byte[] bArr) {
        byte b11 = bArr[0];
        return b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i11;
        byte b11;
        int i12;
        byte b12;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b13 = byteBuffer.get(iPosition);
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b12 = byteBuffer.get(iPosition + 7);
            } else if (b13 != 31) {
                i11 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b11 = byteBuffer.get(iPosition + 5);
            } else {
                i11 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b12 = byteBuffer.get(iPosition + 6);
            }
            i12 = b12 & 60;
            return (((i12 >> 2) | i11) + 1) * 32;
        }
        i11 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b11 = byteBuffer.get(iPosition + 4);
        i12 = b11 & 252;
        return (((i12 >> 2) | i11) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i11;
        byte b11;
        int i12;
        byte b12;
        byte b13 = bArr[0];
        if (b13 != -2) {
            if (b13 == -1) {
                i11 = (bArr[4] & 7) << 4;
                b12 = bArr[7];
            } else if (b13 != 31) {
                i11 = (bArr[4] & 1) << 6;
                b11 = bArr[5];
            } else {
                i11 = (bArr[5] & 7) << 4;
                b12 = bArr[6];
            }
            i12 = b12 & 60;
            return (((i12 >> 2) | i11) + 1) * 32;
        }
        i11 = (bArr[5] & 1) << 6;
        b11 = bArr[4];
        i12 = b11 & 252;
        return (((i12 >> 2) | i11) + 1) * 32;
    }

    public static p7.u h(byte[] bArr, String str, String str2, int i11, String str3, p7.n nVar) {
        s7.b0 b0VarD = d(bArr);
        b0VarD.r(60);
        int i12 = f121371a[b0VarD.h(6)];
        int i13 = f121372b[b0VarD.h(4)];
        int iH = b0VarD.h(5);
        int[] iArr = f121373c;
        int i14 = iH >= iArr.length ? -1 : (iArr[iH] * 1000) / 2;
        b0VarD.r(10);
        return new p7.u.b().j0(str).W(str3).y0("audio/vnd.dts").S(i14).T(i12 + (b0VarD.h(2) > 0 ? 1 : 0)).z0(i13).c0(nVar).n0(str2).w0(i11).P();
    }

    public static b i(byte[] bArr) throws ParserException {
        int i11;
        int i12;
        int iH;
        int i13;
        long jS1;
        int i14;
        s7.b0 b0VarD = d(bArr);
        b0VarD.r(40);
        int iH2 = b0VarD.h(2);
        if (b0VarD.g()) {
            i11 = 20;
            i12 = 12;
        } else {
            i11 = 16;
            i12 = 8;
        }
        b0VarD.r(i12);
        int iH3 = b0VarD.h(i11) + 1;
        boolean zG = b0VarD.g();
        int iH4 = -1;
        int i15 = 0;
        if (zG) {
            iH = b0VarD.h(2);
            int iH5 = (b0VarD.h(3) + 1) * 512;
            if (b0VarD.g()) {
                b0VarD.r(36);
            }
            int iH6 = b0VarD.h(3) + 1;
            int iH7 = b0VarD.h(3) + 1;
            if (iH6 != 1 || iH7 != 1) {
                throw ParserException.d("Multiple audio presentations or assets not supported");
            }
            int i16 = iH2 + 1;
            int iH8 = b0VarD.h(i16);
            for (int i17 = 0; i17 < i16; i17++) {
                if (((iH8 >> i17) & 1) == 1) {
                    b0VarD.r(8);
                }
            }
            if (b0VarD.g()) {
                b0VarD.r(2);
                int iH9 = (b0VarD.h(2) + 1) << 2;
                int iH10 = b0VarD.h(2) + 1;
                while (i15 < iH10) {
                    b0VarD.r(iH9);
                    i15++;
                }
            }
            i15 = iH5;
        } else {
            iH = -1;
        }
        b0VarD.r(i11);
        b0VarD.r(12);
        if (zG) {
            if (b0VarD.g()) {
                b0VarD.r(4);
            }
            if (b0VarD.g()) {
                b0VarD.r(24);
            }
            if (b0VarD.g()) {
                b0VarD.s(b0VarD.h(10) + 1);
            }
            b0VarD.r(5);
            i13 = f121374d[b0VarD.h(4)];
            iH4 = b0VarD.h(8) + 1;
        } else {
            i13 = -2147483647;
        }
        int i18 = i13;
        if (zG) {
            if (iH == 0) {
                i14 = 32000;
            } else if (iH == 1) {
                i14 = 44100;
            } else {
                if (iH != 2) {
                    throw ParserException.a("Unsupported reference clock code in DTS HD header: " + iH, null);
                }
                i14 = 48000;
            }
            jS1 = s7.q0.s1(i15, 1000000L, i14);
        } else {
            jS1 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", iH4, i18, iH3, jS1, 0);
    }

    public static int j(byte[] bArr) {
        s7.b0 b0VarD = d(bArr);
        b0VarD.r(42);
        return b0VarD.h(b0VarD.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int iH;
        long jS1;
        AtomicInteger atomicInteger2;
        int i11;
        int i12;
        s7.b0 b0VarD = d(bArr);
        int i13 = b0VarD.h(32) == 1078008818 ? 1 : 0;
        int iM = m(b0VarD, f121375e, true) + 1;
        if (i13 == 0) {
            iH = -2147483647;
            jS1 = -9223372036854775807L;
        } else {
            if (!b0VarD.g()) {
                throw ParserException.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, iM);
            int iH2 = b0VarD.h(2);
            if (iH2 == 0) {
                i11 = 512;
            } else if (iH2 == 1) {
                i11 = 480;
            } else {
                if (iH2 != 2) {
                    throw ParserException.a("Unsupported base duration index in DTS UHD header: " + iH2, null);
                }
                i11 = KyberEngine.KyberPolyBytes;
            }
            int iH3 = i11 * (b0VarD.h(3) + 1);
            int iH4 = b0VarD.h(2);
            if (iH4 == 0) {
                i12 = 32000;
            } else if (iH4 == 1) {
                i12 = 44100;
            } else {
                if (iH4 != 2) {
                    throw ParserException.a("Unsupported clock rate index in DTS UHD header: " + iH4, null);
                }
                i12 = 48000;
            }
            if (b0VarD.g()) {
                b0VarD.r(36);
            }
            iH = (1 << b0VarD.h(2)) * i12;
            jS1 = s7.q0.s1(iH3, 1000000L, i12);
        }
        int i14 = iH;
        long j11 = jS1;
        int iM2 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            iM2 += m(b0VarD, f121376f, true);
        }
        if (i13 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(m(b0VarD, f121377g, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i14, iM + iM2 + (atomicInteger2.get() != 0 ? m(b0VarD, f121378h, true) : 0), j11, 0);
    }

    public static int l(byte[] bArr) {
        s7.b0 b0VarD = d(bArr);
        b0VarD.r(32);
        return m(b0VarD, f121379i, true) + 1;
    }

    private static int m(s7.b0 b0Var, int[] iArr, boolean z11) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 3 && b0Var.g(); i13++) {
            i12++;
        }
        if (z11) {
            int i14 = 0;
            while (i11 < i12) {
                i14 += 1 << iArr[i11];
                i11++;
            }
            i11 = i14;
        }
        return i11 + b0Var.h(iArr[i12]);
    }
}
