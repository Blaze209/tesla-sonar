package w8;

import androidx.media3.common.ParserException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f121226a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f121227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f121228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f121229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f121230d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f121231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f121232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f121233g;

        private b() {
            this.f121227a = true;
            this.f121228b = -1;
            this.f121229c = -1;
            this.f121230d = true;
            this.f121231e = 2;
            this.f121232f = 1;
            this.f121233g = 0;
        }
    }

    /* JADX INFO: renamed from: w8.c$c, reason: collision with other inner class name */
    public static final class C2599c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f121234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121236c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f121238e;

        private C2599c(int i11, int i12, int i13, int i14, int i15) {
            this.f121234a = i11;
            this.f121236c = i12;
            this.f121235b = i13;
            this.f121237d = i14;
            this.f121238e = i15;
        }
    }

    private static String a(int i11, int i12, int i13) {
        return s7.q0.J("ac-4.%02d.%02d.%02d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static void b(int i11, s7.c0 c0Var) {
        c0Var.X(7);
        byte[] bArrF = c0Var.f();
        bArrF[0] = -84;
        bArrF[1] = 64;
        bArrF[2] = -1;
        bArrF[3] = -1;
        bArrF[4] = (byte) ((i11 >> 16) & 255);
        bArrF[5] = (byte) ((i11 >> 8) & 255);
        bArrF[6] = (byte) (i11 & 255);
    }

    private static int c(int i11, boolean z11, int i12) {
        int iD = d(i11);
        if (i11 != 11 && i11 != 12 && i11 != 13 && i11 != 14) {
            return iD;
        }
        if (!z11) {
            iD -= 2;
        }
        if (i12 != 0) {
            return i12 != 1 ? iD : iD - 2;
        }
        return iD - 4;
    }

    private static int d(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x011e  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    public static p7.u e(s7.c0 c0Var, String str, String str2, p7.n nVar) {
        int i11;
        int i12;
        int iC;
        boolean zG;
        int iH;
        int iH2;
        int iH3;
        int i13;
        boolean z11;
        boolean zG2;
        int i14;
        int iH4;
        s7.b0 b0Var = new s7.b0();
        b0Var.m(c0Var);
        int iB = b0Var.b();
        int iH5 = b0Var.h(3);
        if (iH5 > 1) {
            throw ParserException.d("Unsupported AC-4 DSI version: " + iH5);
        }
        int iH6 = b0Var.h(7);
        int i15 = b0Var.g() ? 48000 : 44100;
        b0Var.r(4);
        int iH7 = b0Var.h(9);
        if (iH6 > 1) {
            if (iH5 == 0) {
                throw ParserException.d("Invalid AC-4 DSI version: " + iH5);
            }
            if (b0Var.g()) {
                b0Var.r(16);
                if (b0Var.g()) {
                    b0Var.r(128);
                }
            }
        }
        if (iH5 == 1) {
            if (!l(b0Var)) {
                throw ParserException.d("Invalid AC-4 DSI bitrate.");
            }
            b0Var.c();
        }
        b bVar = new b();
        int i16 = 0;
        while (true) {
            if (i16 < iH7) {
                if (iH5 == 0) {
                    zG = b0Var.g();
                    iH = b0Var.h(5);
                    iH2 = b0Var.h(5);
                    iH3 = 0;
                    i13 = 0;
                    z11 = false;
                } else {
                    int iH8 = b0Var.h(8);
                    iH3 = b0Var.h(8);
                    if (iH3 == 255) {
                        iH3 += b0Var.h(16);
                    }
                    if (iH8 > 2) {
                        b0Var.r(iH3 * 8);
                        i16++;
                    } else {
                        int iB2 = (iB - b0Var.b()) / 8;
                        int iH9 = b0Var.h(5);
                        iH2 = iH8;
                        iH = iH9;
                        z11 = iH9 == 31;
                        i13 = iB2;
                        zG = false;
                    }
                }
                bVar.f121232f = iH2;
                if (zG || z11 || iH != 6) {
                    bVar.f121233g = b0Var.h(3);
                    if (b0Var.g()) {
                        b0Var.r(5);
                    }
                    b0Var.r(2);
                    int i17 = 1;
                    if (iH5 == 1 && (iH2 == 1 || iH2 == 2)) {
                        b0Var.r(2);
                    }
                    b0Var.r(5);
                    b0Var.r(10);
                    if (iH5 == 1) {
                        if (iH2 > 0) {
                            bVar.f121227a = b0Var.g();
                        }
                        if (bVar.f121227a) {
                            if (iH2 != 1) {
                                i14 = 2;
                                if (iH2 == 2) {
                                    iH4 = b0Var.h(5);
                                    if (iH4 >= 0 && iH4 <= 15) {
                                        bVar.f121228b = iH4;
                                    }
                                    if (iH4 >= 11 || iH4 > 14) {
                                        i14 = 2;
                                    } else {
                                        bVar.f121230d = b0Var.g();
                                        i14 = 2;
                                        bVar.f121231e = b0Var.h(2);
                                    }
                                }
                            } else {
                                iH4 = b0Var.h(5);
                                if (iH4 >= 0) {
                                    bVar.f121228b = iH4;
                                }
                                if (iH4 >= 11) {
                                    i14 = 2;
                                } else {
                                    i14 = 2;
                                }
                            }
                            b0Var.r(24);
                            i17 = 1;
                        } else {
                            i14 = 2;
                        }
                        if (iH2 == i17 || iH2 == i14) {
                            if (b0Var.g() && b0Var.g()) {
                                b0Var.r(i14);
                            }
                            if (b0Var.g()) {
                                b0Var.q();
                                int i18 = 8;
                                int iH10 = b0Var.h(8);
                                int i19 = 0;
                                while (i19 < iH10) {
                                    b0Var.r(i18);
                                    i19++;
                                    i18 = 8;
                                }
                            }
                        }
                    }
                    if (!zG && !z11) {
                        b0Var.q();
                        if (iH == 0 || iH == 1 || iH == 2) {
                            if (iH2 == 0) {
                                for (int i21 = 0; i21 < 2; i21++) {
                                    i(b0Var, bVar);
                                }
                            } else {
                                for (int i22 = 0; i22 < 2; i22++) {
                                    j(b0Var, bVar);
                                }
                            }
                        } else if (iH == 3 || iH == 4) {
                            if (iH2 == 0) {
                                for (int i23 = 0; i23 < 3; i23++) {
                                    i(b0Var, bVar);
                                }
                            } else {
                                for (int i24 = 0; i24 < 3; i24++) {
                                    j(b0Var, bVar);
                                }
                            }
                        } else if (iH != 5) {
                            int iH11 = b0Var.h(7);
                            for (int i25 = 0; i25 < iH11; i25++) {
                                b0Var.r(8);
                            }
                        } else if (iH2 == 0) {
                            i(b0Var, bVar);
                        } else {
                            int iH12 = b0Var.h(3);
                            for (int i26 = 0; i26 < iH12 + 2; i26++) {
                                j(b0Var, bVar);
                            }
                        }
                    } else if (iH2 == 0) {
                        i(b0Var, bVar);
                    } else {
                        j(b0Var, bVar);
                    }
                    b0Var.q();
                    zG2 = b0Var.g();
                } else {
                    zG2 = true;
                }
                if (zG2) {
                    int iH13 = b0Var.h(7);
                    for (int i27 = 0; i27 < iH13; i27++) {
                        b0Var.r(15);
                    }
                }
                if (iH2 > 0) {
                    if (b0Var.g() && !l(b0Var)) {
                        throw ParserException.d("Can't parse bitrate DSI.");
                    }
                    if (b0Var.g()) {
                        b0Var.c();
                        b0Var.s(b0Var.h(16));
                        int iH14 = b0Var.h(5);
                        for (int i28 = 0; i28 < iH14; i28++) {
                            b0Var.r(3);
                            b0Var.r(8);
                        }
                    }
                }
                i11 = 8;
                b0Var.c();
                if (iH5 == 1) {
                    int iB3 = ((iB - b0Var.b()) / 8) - i13;
                    if (iH3 < iB3) {
                        throw ParserException.d("pres_bytes is smaller than presentation bytes read.");
                    }
                    b0Var.s(iH3 - iB3);
                }
                if (bVar.f121227a && bVar.f121228b == -1) {
                    throw ParserException.d("Can't determine channel mode of presentation " + i16);
                }
            } else {
                i11 = 8;
            }
            if (bVar.f121227a) {
                iC = c(bVar.f121228b, bVar.f121230d, bVar.f121231e);
            } else {
                int i29 = bVar.f121229c;
                if (i29 > 0) {
                    int i31 = i29 + 1;
                    if (bVar.f121233g == 4 && i31 == 17) {
                        i31 = 21;
                    }
                    iC = i31;
                } else {
                    int i32 = bVar.f121233g;
                    if (i32 == 0) {
                        i12 = 2;
                    } else if (i32 != 1) {
                        i12 = 2;
                        if (i32 == 2) {
                            iC = i11;
                        } else if (i32 == 3) {
                            iC = 10;
                        } else if (i32 != 4) {
                            s7.t.i("Ac4Util", "AC-4 level " + bVar.f121233g + " has not been defined.");
                        } else {
                            iC = 12;
                        }
                    } else {
                        iC = 6;
                    }
                    iC = i12;
                }
            }
            if (iC > 0) {
                return new p7.u.b().j0(str).y0("audio/ac4").T(iC).z0(i15).c0(nVar).n0(str2).U(a(iH6, bVar.f121232f, bVar.f121233g)).P();
            }
            throw ParserException.d("Cannot determine channel count of presentation.");
        }
    }

    public static int f(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return g(new s7.b0(bArr)).f121238e;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static C2599c g(s7.b0 b0Var) {
        int i11;
        int i12;
        int i13;
        int iH = b0Var.h(16);
        int iH2 = b0Var.h(16);
        if (iH2 == 65535) {
            iH2 = b0Var.h(24);
            i11 = 7;
        } else {
            i11 = 4;
        }
        int i14 = iH2 + i11;
        if (iH == 44097) {
            i14 += 2;
        }
        int i15 = i14;
        int iH3 = b0Var.h(2);
        if (iH3 == 3) {
            iH3 += k(b0Var, 2);
        }
        int i16 = iH3;
        int iH4 = b0Var.h(10);
        if (b0Var.g() && b0Var.h(3) > 0) {
            b0Var.r(2);
        }
        int i17 = 48000;
        if (!b0Var.g()) {
            i17 = 44100;
        }
        int iH5 = b0Var.h(4);
        if (i17 != 44100 || iH5 != 13) {
            if (i17 == 48000) {
                int[] iArr = f121226a;
                if (iH5 < iArr.length) {
                    int i18 = iArr[iH5];
                    int i19 = iH4 % 5;
                    if (i19 == 1) {
                        if (iH5 != 3 || iH5 == 8) {
                            i12 = i18 + 1;
                        } else {
                            i13 = i18;
                        }
                    } else if (i19 != 2) {
                        if (i19 == 3) {
                            if (iH5 != 3) {
                            }
                            i12 = i18 + 1;
                        } else if (i19 == 4 && (iH5 == 3 || iH5 == 8 || iH5 == 11)) {
                            i12 = i18 + 1;
                        } else {
                            i13 = i18;
                        }
                    } else if (iH5 == 8 || iH5 == 11) {
                        i12 = i18 + 1;
                    } else {
                        i13 = i18;
                    }
                } else {
                    i12 = 0;
                }
            } else {
                i12 = 0;
            }
            return new C2599c(i16, 2, i17, i15, i13);
        }
        i12 = f121226a[iH5];
        i13 = i12;
        return new C2599c(i16, 2, i17, i15, i13);
    }

    public static int h(byte[] bArr, int i11) {
        int i12 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i13 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i13 == 65535) {
            i13 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i12 = 4;
        }
        if (i11 == 44097) {
            i12 += 2;
        }
        return i13 + i12;
    }

    private static void i(s7.b0 b0Var, b bVar) throws ParserException {
        int iH = b0Var.h(5);
        b0Var.r(2);
        if (b0Var.g()) {
            b0Var.r(5);
        }
        if (iH >= 7 && iH <= 10) {
            b0Var.q();
        }
        if (b0Var.g()) {
            int iH2 = b0Var.h(3);
            if (bVar.f121228b == -1 && iH >= 0 && iH <= 15 && (iH2 == 0 || iH2 == 1)) {
                bVar.f121228b = iH;
            }
            if (b0Var.g()) {
                m(b0Var);
            }
        }
    }

    private static void j(s7.b0 b0Var, b bVar) throws ParserException {
        b0Var.r(2);
        boolean zG = b0Var.g();
        int iH = b0Var.h(8);
        for (int i11 = 0; i11 < iH; i11++) {
            b0Var.r(2);
            if (b0Var.g()) {
                b0Var.r(5);
            }
            if (zG) {
                b0Var.r(24);
            } else {
                if (b0Var.g()) {
                    if (!b0Var.g()) {
                        b0Var.r(4);
                    }
                    bVar.f121229c = b0Var.h(6) + 1;
                }
                b0Var.r(4);
            }
        }
        if (b0Var.g()) {
            b0Var.r(3);
            if (b0Var.g()) {
                m(b0Var);
            }
        }
    }

    private static int k(s7.b0 b0Var, int i11) {
        int i12 = 0;
        while (true) {
            int iH = i12 + b0Var.h(i11);
            if (!b0Var.g()) {
                return iH;
            }
            i12 = (iH + 1) << i11;
        }
    }

    private static boolean l(s7.b0 b0Var) {
        if (b0Var.b() < 66) {
            return false;
        }
        b0Var.r(66);
        return true;
    }

    private static void m(s7.b0 b0Var) throws ParserException {
        int iH = b0Var.h(6);
        if (iH < 2 || iH > 42) {
            throw ParserException.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iH)));
        }
        b0Var.r(iH * 8);
    }
}
