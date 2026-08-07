package dr;

import com.google.android.exoplayer2.u0;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.EnumC4419g;
import java.nio.ByteBuffer;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import ts.c0;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f60848a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f60849b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f60850c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f60851d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f60852e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, KyberEngine.KyberPolyBytes, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f60853f = {69, 87, 104, 121, 139, 174, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, 348, 417, DownloaderService.STATUS_FILE_DELIVERED_INCORRECTLY, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: dr.b$b, reason: collision with other inner class name */
    public static final class C1243b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f60857d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f60858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f60859f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f60860g;

        private C1243b(String str, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f60854a = str;
            this.f60855b = i11;
            this.f60857d = i12;
            this.f60856c = i13;
            this.f60858e = i14;
            this.f60859f = i15;
            this.f60860g = i16;
        }
    }

    private static int a(int i11, int i12, int i13) {
        return (i11 * i12) / (i13 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i11 = iPosition; i11 <= iLimit; i11++) {
            if ((p0.H(byteBuffer, i11 + 4) & (-2)) == -126718022) {
                return i11 - iPosition;
            }
        }
        return -1;
    }

    private static int c(int i11, int i12) {
        int i13 = i12 / 2;
        if (i11 < 0) {
            return -1;
        }
        int[] iArr = f60849b;
        if (i11 >= iArr.length || i12 < 0) {
            return -1;
        }
        int[] iArr2 = f60853f;
        if (i13 >= iArr2.length) {
            return -1;
        }
        int i14 = iArr[i11];
        if (i14 == 44100) {
            return (iArr2[i13] + (i12 % 2)) * 2;
        }
        int i15 = f60852e[i13];
        return i14 == 32000 ? i15 * 6 : i15 * 4;
    }

    public static u0 d(d0 d0Var, String str, String str2, com.google.android.exoplayer2.drm.h hVar) {
        c0 c0Var = new c0();
        c0Var.m(d0Var);
        int i11 = f60849b[c0Var.h(2)];
        c0Var.r(8);
        int i12 = f60851d[c0Var.h(3)];
        if (c0Var.h(1) != 0) {
            i12++;
        }
        int i13 = f60852e[c0Var.h(5)] * 1000;
        c0Var.c();
        d0Var.U(c0Var.d());
        return new u0.b().U(str).g0("audio/ac3").J(i12).h0(i11).O(hVar).X(str2).I(i13).b0(i13).G();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f60848a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C1243b f(c0 c0Var) {
        int iC;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iE = c0Var.e();
        c0Var.r(40);
        boolean z11 = c0Var.h(5) > 10;
        c0Var.p(iE);
        int i21 = -1;
        if (z11) {
            c0Var.r(16);
            int iH = c0Var.h(2);
            if (iH == 0) {
                i21 = 0;
            } else if (iH == 1) {
                i21 = 1;
            } else if (iH == 2) {
                i21 = 2;
            }
            c0Var.r(3);
            iC = (c0Var.h(11) + 1) * 2;
            int iH2 = c0Var.h(2);
            if (iH2 == 3) {
                i11 = f60850c[c0Var.h(2)];
                i15 = 3;
                i16 = 6;
            } else {
                int iH3 = c0Var.h(2);
                int i22 = f60848a[iH3];
                i15 = iH3;
                i11 = f60849b[iH2];
                i16 = i22;
            }
            i13 = i16 * 256;
            int iA = a(iC, i11, i16);
            int iH4 = c0Var.h(3);
            boolean zG = c0Var.g();
            i12 = f60851d[iH4] + (zG ? 1 : 0);
            c0Var.r(10);
            if (c0Var.g()) {
                c0Var.r(8);
            }
            if (iH4 == 0) {
                c0Var.r(5);
                if (c0Var.g()) {
                    c0Var.r(8);
                }
            }
            if (i21 == 1 && c0Var.g()) {
                c0Var.r(16);
            }
            if (c0Var.g()) {
                if (iH4 > 2) {
                    c0Var.r(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i18 = 6;
                } else {
                    i18 = 6;
                    c0Var.r(6);
                }
                if ((iH4 & 4) != 0) {
                    c0Var.r(i18);
                }
                if (zG && c0Var.g()) {
                    c0Var.r(5);
                }
                if (i21 == 0) {
                    if (c0Var.g()) {
                        i19 = 6;
                        c0Var.r(6);
                    } else {
                        i19 = 6;
                    }
                    if (iH4 == 0 && c0Var.g()) {
                        c0Var.r(i19);
                    }
                    if (c0Var.g()) {
                        c0Var.r(i19);
                    }
                    int iH5 = c0Var.h(2);
                    if (iH5 == 1) {
                        c0Var.r(5);
                    } else if (iH5 == 2) {
                        c0Var.r(12);
                    } else if (iH5 == 3) {
                        int iH6 = c0Var.h(5);
                        if (c0Var.g()) {
                            c0Var.r(5);
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                c0Var.r(4);
                            }
                            if (c0Var.g()) {
                                if (c0Var.g()) {
                                    c0Var.r(4);
                                }
                                if (c0Var.g()) {
                                    c0Var.r(4);
                                }
                            }
                        }
                        if (c0Var.g()) {
                            c0Var.r(5);
                            if (c0Var.g()) {
                                c0Var.r(7);
                                if (c0Var.g()) {
                                    c0Var.r(8);
                                }
                            }
                        }
                        c0Var.r((iH6 + 2) * 8);
                        c0Var.c();
                    }
                    if (iH4 < 2) {
                        if (c0Var.g()) {
                            c0Var.r(14);
                        }
                        if (iH4 == 0 && c0Var.g()) {
                            c0Var.r(14);
                        }
                    }
                    if (c0Var.g()) {
                        if (i15 == 0) {
                            c0Var.r(5);
                        } else {
                            for (int i23 = 0; i23 < i16; i23++) {
                                if (c0Var.g()) {
                                    c0Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c0Var.g()) {
                c0Var.r(5);
                if (iH4 == 2) {
                    c0Var.r(4);
                }
                if (iH4 >= 6) {
                    c0Var.r(2);
                }
                if (c0Var.g()) {
                    c0Var.r(8);
                }
                if (iH4 == 0 && c0Var.g()) {
                    c0Var.r(8);
                }
                if (iH2 < 3) {
                    c0Var.q();
                }
            }
            if (i21 == 0 && i15 != 3) {
                c0Var.q();
            }
            if (i21 == 2 && (i15 == 3 || c0Var.g())) {
                i17 = 6;
                c0Var.r(6);
            } else {
                i17 = 6;
            }
            str = (c0Var.g() && c0Var.h(i17) == 1 && c0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = iA;
        } else {
            c0Var.r(32);
            int iH7 = c0Var.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            int iH8 = c0Var.h(6);
            int i24 = f60852e[iH8 / 2] * 1000;
            iC = c(iH7, iH8);
            c0Var.r(8);
            int iH9 = c0Var.h(3);
            if ((iH9 & 1) != 0 && iH9 != 1) {
                c0Var.r(2);
            }
            if ((iH9 & 4) != 0) {
                c0Var.r(2);
            }
            if (iH9 == 2) {
                c0Var.r(2);
            }
            int[] iArr = f60849b;
            i11 = iH7 < iArr.length ? iArr[iH7] : -1;
            i12 = f60851d[iH9] + (c0Var.g() ? 1 : 0);
            i13 = 1536;
            str = str2;
            i14 = i24;
        }
        return new C1243b(str, i21, i12, i11, iC, i13, i14);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b11 = bArr[4];
        return c((b11 & 192) >> 6, b11 & 63);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static u0 h(d0 d0Var, String str, String str2, com.google.android.exoplayer2.drm.h hVar) {
        String str3;
        c0 c0Var = new c0();
        c0Var.m(d0Var);
        int iH = c0Var.h(13) * 1000;
        c0Var.r(3);
        int i11 = f60849b[c0Var.h(2)];
        c0Var.r(10);
        int i12 = f60851d[c0Var.h(3)];
        if (c0Var.h(1) != 0) {
            i12++;
        }
        c0Var.r(3);
        int iH2 = c0Var.h(4);
        c0Var.r(1);
        if (iH2 > 0) {
            c0Var.r(6);
            if (c0Var.h(1) != 0) {
                i12 += 2;
            }
            c0Var.r(1);
        }
        if (c0Var.b() > 7) {
            c0Var.r(7);
            if (c0Var.h(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        c0Var.c();
        d0Var.U(c0Var.d());
        return new u0.b().U(str).g0(str3).J(i12).h0(i11).O(hVar).X(str2).b0(iH).G();
    }

    public static int i(ByteBuffer byteBuffer, int i11) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i11) + ((byteBuffer.get((byteBuffer.position() + i11) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b11 = bArr[7];
            if ((b11 & 254) == 186) {
                return 40 << ((bArr[(b11 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
