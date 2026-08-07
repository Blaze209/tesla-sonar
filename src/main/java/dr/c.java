package dr;

import com.google.android.exoplayer2.u0;
import java.nio.ByteBuffer;
import ts.c0;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f60861a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f60865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f60866e;

        private b(int i11, int i12, int i13, int i14, int i15) {
            this.f60862a = i11;
            this.f60864c = i12;
            this.f60863b = i13;
            this.f60865d = i14;
            this.f60866e = i15;
        }
    }

    public static void a(int i11, d0 d0Var) {
        d0Var.Q(7);
        byte[] bArrE = d0Var.e();
        bArrE[0] = -84;
        bArrE[1] = 64;
        bArrE[2] = -1;
        bArrE[3] = -1;
        bArrE[4] = (byte) ((i11 >> 16) & 255);
        bArrE[5] = (byte) ((i11 >> 8) & 255);
        bArrE[6] = (byte) (i11 & 255);
    }

    public static u0 b(d0 d0Var, String str, String str2, com.google.android.exoplayer2.drm.h hVar) {
        d0Var.V(1);
        return new u0.b().U(str).g0("audio/ac4").J(2).h0(((d0Var.H() & 32) >> 5) == 1 ? 48000 : 44100).O(hVar).X(str2).G();
    }

    public static int c(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return d(new c0(bArr)).f60866e;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    public static b d(c0 c0Var) {
        int i11;
        int i12;
        int i13;
        int iH = c0Var.h(16);
        int iH2 = c0Var.h(16);
        if (iH2 == 65535) {
            iH2 = c0Var.h(24);
            i11 = 7;
        } else {
            i11 = 4;
        }
        int i14 = iH2 + i11;
        if (iH == 44097) {
            i14 += 2;
        }
        int i15 = i14;
        int iH3 = c0Var.h(2);
        if (iH3 == 3) {
            iH3 += f(c0Var, 2);
        }
        int i16 = iH3;
        int iH4 = c0Var.h(10);
        if (c0Var.g() && c0Var.h(3) > 0) {
            c0Var.r(2);
        }
        int i17 = 48000;
        if (!c0Var.g()) {
            i17 = 44100;
        }
        int iH5 = c0Var.h(4);
        if (i17 != 44100 || iH5 != 13) {
            if (i17 == 48000) {
                int[] iArr = f60861a;
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
            return new b(i16, 2, i17, i15, i13);
        }
        i12 = f60861a[iH5];
        i13 = i12;
        return new b(i16, 2, i17, i15, i13);
    }

    public static int e(byte[] bArr, int i11) {
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

    private static int f(c0 c0Var, int i11) {
        int i12 = 0;
        while (true) {
            int iH = i12 + c0Var.h(i11);
            if (!c0Var.g()) {
                return iH;
            }
            i12 = (iH + 1) << i11;
        }
    }
}
