package zr;

import com.google.common.collect.x;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import ts.c0;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h extends ur.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128522b = new a() { // from class: zr.g
        @Override // zr.h.a
        public final boolean a(int i11, int i12, int i13, int i14, int i15) {
            return h.c(i11, i12, i13, i14, i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f128523a;

    public interface a {
        boolean a(int i11, int i12, int i13, int i14, int i15);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f128524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f128525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f128526c;

        public b(int i11, boolean z11, int i12) {
            this.f128524a = i11;
            this.f128525b = z11;
            this.f128526c = i12;
        }
    }

    public h() {
        this(null);
    }

    private static int A(d0 d0Var, int i11) {
        byte[] bArrE = d0Var.e();
        int iF = d0Var.f();
        int i12 = iF;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= iF + i11) {
                return i11;
            }
            if ((bArrE[i12] & 255) == 255 && bArrE[i13] == 0) {
                System.arraycopy(bArrE, i12 + 2, bArrE, i13, (i11 - (i12 - iF)) - 2);
                i11--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean B(d0 d0Var, int i11, int i12, boolean z11) {
        int iK;
        long jK;
        int iN;
        int i13;
        int iF = d0Var.f();
        while (true) {
            try {
                boolean z12 = true;
                if (d0Var.a() < i12) {
                    d0Var.U(iF);
                    return true;
                }
                if (i11 >= 3) {
                    iK = d0Var.q();
                    jK = d0Var.J();
                    iN = d0Var.N();
                } else {
                    iK = d0Var.K();
                    jK = d0Var.K();
                    iN = 0;
                }
                if (iK == 0 && jK == 0 && iN == 0) {
                    d0Var.U(iF);
                    return true;
                }
                if (i11 == 4 && !z11) {
                    if ((8421504 & jK) != 0) {
                        d0Var.U(iF);
                        return false;
                    }
                    jK = (((jK >> 24) & 255) << 21) | (jK & 255) | (((jK >> 8) & 255) << 7) | (((jK >> 16) & 255) << 14);
                }
                if (i11 == 4) {
                    i13 = (iN & 64) != 0 ? 1 : 0;
                    if ((iN & 1) == 0) {
                        z12 = false;
                    }
                } else if (i11 == 3) {
                    i13 = (iN & 32) != 0 ? 1 : 0;
                    if ((iN & 128) == 0) {
                        z12 = false;
                    }
                } else {
                    i13 = 0;
                    z12 = false;
                }
                if (z12) {
                    i13 += 4;
                }
                if (jK < i13) {
                    d0Var.U(iF);
                    return false;
                }
                if (d0Var.a() < jK) {
                    d0Var.U(iF);
                    return false;
                }
                d0Var.V((int) jK);
            } catch (Throwable th2) {
                d0Var.U(iF);
                throw th2;
            }
        }
    }

    public static /* synthetic */ boolean c(int i11, int i12, int i13, int i14, int i15) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i11, int i12) {
        return i12 <= i11 ? p0.f115045f : Arrays.copyOfRange(bArr, i11, i12);
    }

    private static zr.a f(d0 d0Var, int i11, int i12) {
        int iZ;
        String str;
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        int i13 = i11 - 1;
        byte[] bArr = new byte[i13];
        d0Var.l(bArr, 0, i13);
        if (i12 == 2) {
            str = "image/" + ou.c.e(new String(bArr, 0, 3, ou.e.f99999b));
            if (ClipboardModule.MIMETYPE_JPG.equals(str)) {
                str = ClipboardModule.MIMETYPE_JPEG;
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = ou.c.e(new String(bArr, 0, iZ, ou.e.f99999b));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i14 = bArr[iZ + 1] & 255;
        int i15 = iZ + 2;
        int iY = y(bArr, i15, iH);
        return new zr.a(str, new String(bArr, i15, iY - i15, charsetW), i14, d(bArr, iY + v(iH), i13));
    }

    private static zr.b g(d0 d0Var, int i11, String str) {
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        return new zr.b(str, bArr);
    }

    private static c h(d0 d0Var, int i11, int i12, boolean z11, int i13, a aVar) throws Throwable {
        int iF = d0Var.f();
        int iZ = z(d0Var.e(), iF);
        String str = new String(d0Var.e(), iF, iZ - iF, ou.e.f99999b);
        d0Var.U(iZ + 1);
        int iQ = d0Var.q();
        int iQ2 = d0Var.q();
        long J = d0Var.J();
        if (J == 4294967295L) {
            J = -1;
        }
        long J2 = d0Var.J();
        long j11 = J2 == 4294967295L ? -1L : J2;
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i11;
        while (d0Var.f() < i14) {
            i iVarK = k(i12, d0Var, z11, i13, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iQ, iQ2, J, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(d0 d0Var, int i11, int i12, boolean z11, int i13, a aVar) throws Throwable {
        int iF = d0Var.f();
        int iZ = z(d0Var.e(), iF);
        String str = new String(d0Var.e(), iF, iZ - iF, ou.e.f99999b);
        d0Var.U(iZ + 1);
        int iH = d0Var.H();
        boolean z12 = (iH & 2) != 0;
        boolean z13 = (iH & 1) != 0;
        int iH2 = d0Var.H();
        String[] strArr = new String[iH2];
        for (int i14 = 0; i14 < iH2; i14++) {
            int iF2 = d0Var.f();
            int iZ2 = z(d0Var.e(), iF2);
            strArr[i14] = new String(d0Var.e(), iF2, iZ2 - iF2, ou.e.f99999b);
            d0Var.U(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = iF + i11;
        while (d0Var.f() < i15) {
            i iVarK = k(i12, d0Var, z11, i13, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(d0 d0Var, int i11) {
        if (i11 < 4) {
            return null;
        }
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        byte[] bArr = new byte[3];
        d0Var.l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i12 = i11 - 4;
        byte[] bArr2 = new byte[i12];
        d0Var.l(bArr2, 0, i12);
        int iY = y(bArr2, 0, iH);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iH);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iH), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x018f  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f5 A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:168:0x01ff, B:156:0x01db, B:165:0x01f0, B:166:0x01f5), top: B:175:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x01ff A[Catch: all -> 0x01e0, TRY_LEAVE, TryCatch #0 {all -> 0x01e0, blocks: (B:168:0x01ff, B:156:0x01db, B:165:0x01f0, B:166:0x01f5), top: B:175:0x0109 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x01ff, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [ts.d0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [ts.d0] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static i k(int i11, d0 d0Var, boolean z11, int i12, a aVar) throws Throwable {
        int iL;
        ?? r11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r12;
        ?? r13;
        int i13;
        int i14;
        int i15;
        d0 d0Var2;
        i iVarG;
        ?? r14;
        int i16 = i11;
        int iH = d0Var.H();
        int iH2 = d0Var.H();
        int iH3 = d0Var.H();
        boolean z16 = false;
        int iH4 = i16 >= 3 ? d0Var.H() : 0;
        if (i16 == 4) {
            iL = d0Var.L();
            if (!z11) {
                iL = (((iL >> 24) & 255) << 21) | (iL & 255) | (((iL >> 8) & 255) << 7) | (((iL >> 16) & 255) << 14);
            }
        } else {
            iL = i16 == 3 ? d0Var.L() : d0Var.K();
        }
        int iA = iL;
        int iN = i16 >= 3 ? d0Var.N() : 0;
        if (iH == 0 && iH2 == 0 && iH3 == 0 && iH4 == 0 && iA == 0 && iN == 0) {
            d0Var.U(d0Var.g());
            return null;
        }
        int iF = d0Var.f() + iA;
        if (iF > d0Var.g()) {
            u.i("Id3Decoder", "Frame size exceeds remaining tag data");
            d0Var.U(d0Var.g());
            return null;
        }
        if (aVar != null) {
            r11 = iH2;
            if (!aVar.a(i16, iH, iH2, iH3, iH4)) {
                i16 = i16;
                d0Var.U(iF);
                return null;
            }
        } else {
            r11 = iH2;
        }
        i16 = i16;
        if (i16 == 3) {
            z12 = (iN & 128) != 0;
            boolean z17 = (iN & 64) != 0;
            z15 = false;
            z16 = z12;
            z13 = (iN & 32) != 0;
            z14 = z17;
        } else if (i16 == 4) {
            boolean z18 = (iN & 64) != 0;
            boolean z19 = (iN & 8) != 0;
            boolean z21 = (iN & 4) != 0;
            boolean z22 = (iN & 2) != 0;
            z16 = (iN & 1) != 0;
            z13 = z18;
            z12 = z16;
            z16 = z19;
            z14 = z21;
            z15 = z22;
        } else {
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z16 || z14) {
            u.i("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            d0Var.U(iF);
            return null;
        }
        if (z13) {
            iA--;
            d0Var.V(1);
        }
        if (z12) {
            iA -= 4;
            d0Var.V(4);
        }
        if (z15) {
            iA = A(d0Var, iA);
        }
        try {
            try {
                if (iH == 84 && r11 == 88 && iH3 == 88 && (i16 == 2 || iH4 == 88)) {
                    iVarG = s(d0Var, iA);
                } else if (iH == 84) {
                    iVarG = q(d0Var, iA, x(i16, iH, r11, iH3, iH4));
                } else if (iH == 87 && r11 == 88 && iH3 == 88 && (i16 == 2 || iH4 == 88)) {
                    iVarG = u(d0Var, iA);
                } else if (iH == 87) {
                    iVarG = t(d0Var, iA, x(i16, iH, r11, iH3, iH4));
                } else if (iH == 80 && r11 == 82 && iH3 == 73 && iH4 == 86) {
                    iVarG = o(d0Var, iA);
                } else {
                    if (iH != 71 || r11 != 69 || iH3 != 79 || (iH4 != 66 && i16 != 2)) {
                        if (i16 == 2) {
                            if (iH == 80 && r11 == 73 && iH3 == 67) {
                                iVarG = f(d0Var, iA, i16);
                            } else if (iH != 67 && r11 == 79 && iH3 == 77 && (iH4 == 77 || i16 == 2)) {
                                iVarG = j(d0Var, iA);
                            } else if (iH != 67 && r11 == 72 && iH3 == 65 && iH4 == 80) {
                                r14 = r11;
                                i13 = iH3;
                                i14 = iA;
                                i15 = iH4;
                                try {
                                    iVarG = h(d0Var, i14, i16, z11, i12, aVar);
                                    i16 = i11;
                                    r11 = d0Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = d0Var;
                                    r12.U(iF);
                                    throw th;
                                }
                            } else {
                                r13 = r11;
                                i13 = iH3;
                                i14 = iA;
                                i15 = iH4;
                                if (iH != 67 && r13 == 84 && i13 == 79 && i15 == 67) {
                                    i16 = i11;
                                    d0 d0Var3 = d0Var;
                                    iVarG = i(d0Var3, i14, i16, z11, i12, aVar);
                                    r11 = d0Var3;
                                    r14 = r13;
                                } else {
                                    i16 = i11;
                                    d0Var2 = d0Var;
                                    if (iH != 77 && r13 == 76 && i13 == 76 && i15 == 84) {
                                        iVarG = n(d0Var2, i14);
                                    } else {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    }
                                }
                            }
                        } else if (iH == 65 && r11 == 80 && iH3 == 73 && iH4 == 67) {
                            iVarG = f(d0Var, iA, i16);
                        } else {
                            if (iH != 67) {
                            }
                            if (iH != 67) {
                                r13 = r11;
                                i13 = iH3;
                                i14 = iA;
                                i15 = iH4;
                                if (iH != 67) {
                                    i16 = i11;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    } else {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    }
                                } else {
                                    i16 = i11;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    } else {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    }
                                }
                            } else {
                                r13 = r11;
                                i13 = iH3;
                                i14 = iA;
                                i15 = iH4;
                                if (iH != 67) {
                                    i16 = i11;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    } else {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    }
                                } else {
                                    i16 = i11;
                                    d0Var2 = d0Var;
                                    if (iH != 77) {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    } else {
                                        iVarG = g(d0Var2, i14, x(i16, iH, r13 == true ? 1 : 0, i13, i15));
                                        r11 = d0Var2;
                                        r14 = r13;
                                    }
                                }
                            }
                        }
                        if (iVarG == null) {
                            r11 = d0Var2;
                            r14 = r13;
                            u.i("Id3Decoder", "Failed to decode frame: id=" + x(i16, iH, r14, i13, i15) + ", frameSize=" + i14);
                        }
                        r11 = d0Var2;
                        r14 = r13;
                        r11.U(iF);
                        return iVarG;
                    }
                    iVarG = l(d0Var, iA);
                }
                r14 = r11;
                i13 = iH3;
                r11 = d0Var;
                i14 = iA;
                i15 = iH4;
                if (iVarG == null) {
                    r11 = d0Var2;
                    r14 = r13;
                    u.i("Id3Decoder", "Failed to decode frame: id=" + x(i16, iH, r14, i13, i15) + ", frameSize=" + i14);
                }
                r11 = d0Var2;
                r14 = r13;
                r11.U(iF);
                return iVarG;
            } catch (Throwable th3) {
                th = th3;
                r12 = r11;
            }
        } catch (Throwable th4) {
            th = th4;
            r12 = d0Var;
        }
    }

    private static f l(d0 d0Var, int i11) {
        int iH = d0Var.H();
        Charset charsetW = w(iH);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        d0Var.l(bArr, 0, i12);
        int iZ = z(bArr, 0);
        String str = new String(bArr, 0, iZ, ou.e.f99999b);
        int i13 = iZ + 1;
        int iY = y(bArr, i13, iH);
        String strP = p(bArr, i13, iY, charsetW);
        int iV = iY + v(iH);
        int iY2 = y(bArr, iV, iH);
        return new f(str, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iH), i12));
    }

    private static b m(d0 d0Var) {
        if (d0Var.a() < 10) {
            u.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iK = d0Var.K();
        if (iK != 4801587) {
            u.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iK)));
            return null;
        }
        int iH = d0Var.H();
        d0Var.V(1);
        int iH2 = d0Var.H();
        int iG = d0Var.G();
        if (iH == 2) {
            if ((iH2 & 64) != 0) {
                u.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iH == 3) {
            if ((iH2 & 64) != 0) {
                int iQ = d0Var.q();
                d0Var.V(iQ);
                iG -= iQ + 4;
            }
        } else {
            if (iH != 4) {
                u.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iH);
                return null;
            }
            if ((iH2 & 64) != 0) {
                int iG2 = d0Var.G();
                d0Var.V(iG2 - 4);
                iG -= iG2;
            }
            if ((iH2 & 16) != 0) {
                iG -= 10;
            }
        }
        return new b(iH, iH < 4 && (iH2 & 128) != 0, iG);
    }

    private static k n(d0 d0Var, int i11) {
        int iN = d0Var.N();
        int iK = d0Var.K();
        int iK2 = d0Var.K();
        int iH = d0Var.H();
        int iH2 = d0Var.H();
        c0 c0Var = new c0();
        c0Var.m(d0Var);
        int i12 = ((i11 - 10) * 8) / (iH + iH2);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int iH3 = c0Var.h(iH);
            int iH4 = c0Var.h(iH2);
            iArr[i13] = iH3;
            iArr2[i13] = iH4;
        }
        return new k(iN, iK, iK2, iArr, iArr2);
    }

    private static l o(d0 d0Var, int i11) {
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        int iZ = z(bArr, 0);
        return new l(new String(bArr, 0, iZ, ou.e.f99999b), d(bArr, iZ + 1, i11));
    }

    private static String p(byte[] bArr, int i11, int i12, Charset charset) {
        return (i12 <= i11 || i12 > bArr.length) ? "" : new String(bArr, i11, i12 - i11, charset);
    }

    private static m q(d0 d0Var, int i11, String str) {
        if (i11 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        d0Var.l(bArr, 0, i12);
        return new m(str, null, r(bArr, iH, 0));
    }

    private static x<String> r(byte[] bArr, int i11, int i12) {
        if (i12 >= bArr.length) {
            return x.s("");
        }
        x.a aVarK = x.k();
        int iY = y(bArr, i12, i11);
        while (i12 < iY) {
            aVarK.a(new String(bArr, i12, iY - i12, w(i11)));
            i12 = v(i11) + iY;
            iY = y(bArr, i12, i11);
        }
        x<String> xVarK = aVarK.k();
        return xVarK.isEmpty() ? x.s("") : xVarK;
    }

    private static m s(d0 d0Var, int i11) {
        if (i11 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        d0Var.l(bArr, 0, i12);
        int iY = y(bArr, 0, iH);
        return new m("TXXX", new String(bArr, 0, iY, w(iH)), r(bArr, iH, iY + v(iH)));
    }

    private static n t(d0 d0Var, int i11, String str) {
        byte[] bArr = new byte[i11];
        d0Var.l(bArr, 0, i11);
        return new n(str, null, new String(bArr, 0, z(bArr, 0), ou.e.f99999b));
    }

    private static n u(d0 d0Var, int i11) {
        if (i11 < 1) {
            return null;
        }
        int iH = d0Var.H();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        d0Var.l(bArr, 0, i12);
        int iY = y(bArr, 0, iH);
        String str = new String(bArr, 0, iY, w(iH));
        int iV = iY + v(iH);
        return new n("WXXX", str, p(bArr, iV, z(bArr, iV), ou.e.f99999b));
    }

    private static int v(int i11) {
        return (i11 == 0 || i11 == 3) ? 1 : 2;
    }

    private static Charset w(int i11) {
        if (i11 == 1) {
            return ou.e.f100003f;
        }
        if (i11 != 2) {
            return i11 != 3 ? ou.e.f99999b : ou.e.f100000c;
        }
        return ou.e.f100001d;
    }

    private static String x(int i11, int i12, int i13, int i14, int i15) {
        return i11 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    private static int y(byte[] bArr, int i11, int i12) {
        int iZ = z(bArr, i11);
        if (i12 == 0 || i12 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i11) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i11) {
        while (i11 < bArr.length) {
            if (bArr[i11] == 0) {
                return i11;
            }
            i11++;
        }
        return bArr.length;
    }

    @Override // ur.g
    protected ur.a b(ur.d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public ur.a e(byte[] bArr, int i11) throws Throwable {
        ArrayList arrayList = new ArrayList();
        d0 d0Var = new d0(bArr, i11);
        b bVarM = m(d0Var);
        if (bVarM == null) {
            return null;
        }
        int iF = d0Var.f();
        int i12 = bVarM.f128524a == 2 ? 6 : 10;
        int iA = bVarM.f128526c;
        if (bVarM.f128525b) {
            iA = A(d0Var, bVarM.f128526c);
        }
        d0Var.T(iF + iA);
        boolean z11 = false;
        if (!B(d0Var, bVarM.f128524a, i12, false)) {
            if (bVarM.f128524a != 4 || !B(d0Var, 4, i12, true)) {
                u.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f128524a);
                return null;
            }
            z11 = true;
        }
        while (d0Var.a() >= i12) {
            i iVarK = k(bVarM.f128524a, d0Var, z11, i12, this.f128523a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new ur.a(arrayList);
    }

    public h(a aVar) {
        this.f128523a = aVar;
    }
}
