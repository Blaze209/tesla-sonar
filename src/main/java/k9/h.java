package k9;

import com.google.common.collect.x;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p7.f0;
import p7.g0;
import s7.b0;
import s7.c0;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends f9.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f85421b = new a() { // from class: k9.g
        @Override // k9.h.a
        public final boolean a(int i11, int i12, int i13, int i14, int i15) {
            return h.c(i11, i12, i13, i14, i15);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f85422a;

    public interface a {
        boolean a(int i11, int i12, int i13, int i14, int i15);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f85423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f85424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f85425c;

        public b(int i11, boolean z11, int i12) {
            this.f85423a = i11;
            this.f85424b = z11;
            this.f85425c = i12;
        }
    }

    public h() {
        this(null);
    }

    private static int A(c0 c0Var, int i11) {
        byte[] bArrF = c0Var.f();
        int iG = c0Var.g();
        int i12 = iG;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= iG + i11) {
                return i11;
            }
            if ((bArrF[i12] & 255) == 255 && bArrF[i13] == 0) {
                System.arraycopy(bArrF, i12 + 2, bArrF, i13, (i11 - (i12 - iG)) - 2);
                i11--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[PHI: r3
      0x007c: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0089, B:33:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean B(c0 c0Var, int i11, int i12, boolean z11) {
        int iP;
        long jP;
        int iU;
        int i13;
        int iG = c0Var.g();
        while (true) {
            try {
                boolean z12 = true;
                if (c0Var.a() < i12) {
                    c0Var.b0(iG);
                    return true;
                }
                if (i11 >= 3) {
                    iP = c0Var.v();
                    jP = c0Var.O();
                    iU = c0Var.U();
                } else {
                    iP = c0Var.P();
                    jP = c0Var.P();
                    iU = 0;
                }
                if (iP == 0 && jP == 0 && iU == 0) {
                    c0Var.b0(iG);
                    return true;
                }
                if (i11 == 4 && !z11) {
                    if ((8421504 & jP) != 0) {
                        c0Var.b0(iG);
                        return false;
                    }
                    jP = (((jP >> 24) & 255) << 21) | (jP & 255) | (((jP >> 8) & 255) << 7) | (((jP >> 16) & 255) << 14);
                }
                if (i11 == 4) {
                    i13 = (iU & 64) != 0 ? 1 : 0;
                    if ((iU & 1) == 0) {
                        z12 = false;
                    }
                } else if (i11 == 3) {
                    i13 = (iU & 32) != 0 ? 1 : 0;
                    if ((iU & 128) == 0) {
                        z12 = false;
                    }
                } else {
                    i13 = 0;
                    z12 = false;
                }
                if (z12) {
                    i13 += 4;
                }
                if (jP < i13) {
                    c0Var.b0(iG);
                    return false;
                }
                if (c0Var.a() < jP) {
                    c0Var.b0(iG);
                    return false;
                }
                c0Var.c0((int) jP);
            } catch (Throwable th2) {
                c0Var.b0(iG);
                throw th2;
            }
        }
    }

    public static /* synthetic */ boolean c(int i11, int i12, int i13, int i14, int i15) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i11, int i12) {
        return i12 <= i11 ? q0.f110459f : Arrays.copyOfRange(bArr, i11, i12);
    }

    private static k9.a f(c0 c0Var, int i11, int i12) {
        int iZ;
        String str;
        int iM = c0Var.M();
        Charset charsetW = w(iM);
        int i13 = i11 - 1;
        byte[] bArr = new byte[i13];
        c0Var.q(bArr, 0, i13);
        if (i12 == 2) {
            str = "image/" + ou.c.e(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if (ClipboardModule.MIMETYPE_JPG.equals(str)) {
                str = ClipboardModule.MIMETYPE_JPEG;
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strE = ou.c.e(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strE.indexOf(47) == -1) {
                str = "image/" + strE;
            } else {
                str = strE;
            }
        }
        int i14 = bArr[iZ + 1] & 255;
        int i15 = iZ + 2;
        int iY = y(bArr, i15, iM);
        return new k9.a(str, new String(bArr, i15, iY - i15, charsetW), i14, d(bArr, iY + v(iM), i13));
    }

    private static k9.b g(c0 c0Var, int i11, String str) {
        byte[] bArr = new byte[i11];
        c0Var.q(bArr, 0, i11);
        return new k9.b(str, bArr);
    }

    private static c h(c0 c0Var, int i11, int i12, boolean z11, int i13, a aVar) throws Throwable {
        int iG = c0Var.g();
        int iZ = z(c0Var.f(), iG);
        String str = new String(c0Var.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c0Var.b0(iZ + 1);
        int iV = c0Var.v();
        int iV2 = c0Var.v();
        long jO = c0Var.O();
        if (jO == 4294967295L) {
            jO = -1;
        }
        long jO2 = c0Var.O();
        long j11 = jO2 == 4294967295L ? -1L : jO2;
        ArrayList arrayList = new ArrayList();
        int i14 = iG + i11;
        while (c0Var.g() < i14) {
            i iVarK = k(i12, c0Var, z11, i13, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iV, iV2, jO, j11, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(c0 c0Var, int i11, int i12, boolean z11, int i13, a aVar) throws Throwable {
        int iG = c0Var.g();
        int iZ = z(c0Var.f(), iG);
        String str = new String(c0Var.f(), iG, iZ - iG, StandardCharsets.ISO_8859_1);
        c0Var.b0(iZ + 1);
        int iM = c0Var.M();
        boolean z12 = (iM & 2) != 0;
        boolean z13 = (iM & 1) != 0;
        int iM2 = c0Var.M();
        String[] strArr = new String[iM2];
        for (int i14 = 0; i14 < iM2; i14++) {
            int iG2 = c0Var.g();
            int iZ2 = z(c0Var.f(), iG2);
            strArr[i14] = new String(c0Var.f(), iG2, iZ2 - iG2, StandardCharsets.ISO_8859_1);
            c0Var.b0(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = iG + i11;
        while (c0Var.g() < i15) {
            i iVarK = k(i12, c0Var, z11, i13, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z12, z13, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    private static e j(c0 c0Var, int i11) {
        if (i11 < 4) {
            return null;
        }
        int iM = c0Var.M();
        Charset charsetW = w(iM);
        byte[] bArr = new byte[3];
        c0Var.q(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i12 = i11 - 4;
        byte[] bArr2 = new byte[i12];
        c0Var.q(bArr2, 0, i12);
        int iY = y(bArr2, 0, iM);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iM);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iM), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0240  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x0240, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [k9.i] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [s7.c0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [s7.c0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29, types: [s7.c0] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private static i k(int i11, c0 c0Var, boolean z11, int i12, a aVar) throws Throwable {
        int iQ;
        ?? r11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ?? r12;
        Throwable th2;
        ?? r13;
        int i13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        f0.a aVarG;
        int i14 = i11;
        c0 c0Var2 = c0Var;
        int iM = c0Var2.M();
        int iM2 = c0Var2.M();
        int iM3 = c0Var2.M();
        boolean z16 = false;
        int iM4 = i14 >= 3 ? c0Var2.M() : 0;
        if (i14 == 4) {
            iQ = c0Var2.Q();
            if (!z11) {
                iQ = (((iQ >> 24) & 255) << 21) | (iQ & 255) | (((iQ >> 8) & 255) << 7) | (((iQ >> 16) & 255) << 14);
            }
        } else {
            iQ = i14 == 3 ? c0Var2.Q() : c0Var2.P();
        }
        int iA = iQ;
        int iU = i14 >= 3 ? c0Var2.U() : 0;
        if (iM == 0 && iM2 == 0 && iM3 == 0 && iM4 == 0 && iA == 0 && iU == 0) {
            c0Var2.b0(c0Var2.j());
            return null;
        }
        int iG = c0Var2.g() + iA;
        if (iG > c0Var2.j()) {
            t.i("Id3Decoder", "Frame size exceeds remaining tag data");
            c0Var2.b0(c0Var2.j());
            return null;
        }
        if (aVar != null) {
            boolean zA = aVar.a(i14, iM, iM2, iM3, iM4);
            r11 = iM;
            iA = iM2;
            if (!zA) {
                i14 = i14;
                c0Var2.b0(iG);
                return null;
            }
        } else {
            iA = iM2;
            r11 = iM;
        }
        i14 = i14;
        if (i14 == 3) {
            z12 = (iU & 128) != 0;
            z14 = (iU & 64) != 0;
            z13 = (iU & 32) != 0;
            z15 = false;
            z16 = z12;
        } else if (i14 == 4) {
            boolean z17 = (iU & 64) != 0;
            boolean z18 = (iU & 8) != 0;
            boolean z19 = (iU & 4) != 0;
            z15 = (iU & 2) != 0;
            z16 = (iU & 1) != 0;
            z13 = z17;
            z12 = z16;
            z16 = z18;
            z14 = z19;
        } else {
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
        }
        if (z16 || z14) {
            t.i("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c0Var2.b0(iG);
            return null;
        }
        if (z13) {
            iA--;
            c0Var2.c0(1);
        }
        if (z12) {
            iA -= 4;
            c0Var2.c0(4);
        }
        if (z15) {
            iA = A(c0Var2, iA);
        }
        try {
            try {
                if (r11 == 84 && iA == 88 && iM3 == 88 && (i14 == 2 || iM4 == 88)) {
                    aVarG = s(c0Var2, iA);
                } else if (r11 == 84) {
                    aVarG = q(c0Var2, iA, x(i14, r11, iA, iM3, iM4));
                } else if (r11 == 87 && iA == 88 && iM3 == 88 && (i14 == 2 || iM4 == 88)) {
                    aVarG = u(c0Var2, iA);
                } else if (r11 == 87) {
                    aVarG = t(c0Var2, iA, x(i14, r11, iA, iM3, iM4));
                } else {
                    if (r11 != 80 || iA != 82 || iM3 != 73 || iM4 != 86) {
                        if (r11 == 71 && iA == 69 && iM3 == 79 && (iM4 == 66 || i14 == 2)) {
                            aVarG = l(c0Var2, iA);
                        } else {
                            th2 = null;
                            try {
                                if (i14 != 2 ? r11 == 65 && iA == 80 && iM3 == 73 && iM4 == 67 : r11 == 80 && iA == 73 && iM3 == 67) {
                                    aVarG = f(c0Var2, iA, i14);
                                } else {
                                    if (r11 != 67 || iA != 79 || iM3 != 77 || (iM4 != 77 && i14 != 2)) {
                                        if (r11 == 67 && iA == 72 && iM3 == 65 && iM4 == 80) {
                                            r11 = r11;
                                            iA = iA;
                                            iM4 = iM4;
                                            iA = iA;
                                            i13 = iM3;
                                            try {
                                                aVarG = h(c0Var2, iA, i14, z11, i12, aVar);
                                                i14 = i11;
                                                r11 = c0Var;
                                            } catch (Exception e11) {
                                                e = e11;
                                                i14 = i11;
                                                r15 = c0Var;
                                                r14 = r11;
                                                r15.b0(iG);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (OutOfMemoryError e12) {
                                                e = e12;
                                                i14 = i11;
                                                r15 = c0Var;
                                                r14 = r11;
                                                r15.b0(iG);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r13 = c0Var;
                                                r13.b0(iG);
                                                throw th;
                                            }
                                        } else {
                                            r11 = r11;
                                            iA = iA;
                                            iM4 = iM4;
                                            iA = iA;
                                            i13 = iM3;
                                            try {
                                                if (r11 == 67 && iA == 84 && i13 == 79 && iM4 == 67) {
                                                    i14 = i11;
                                                    c0 c0Var3 = c0Var;
                                                    aVarG = i(c0Var3, iA, i14, z11, i12, aVar);
                                                    r11 = c0Var3;
                                                } else {
                                                    i14 = i11;
                                                    c0 c0Var4 = c0Var;
                                                    if (r11 == 77 && iA == 76 && i13 == 76 && iM4 == 84) {
                                                        aVarG = n(c0Var4, iA);
                                                        r11 = c0Var4;
                                                    } else {
                                                        aVarG = g(c0Var4, iA, x(i14, r11, iA, i13, iM4));
                                                        r11 = c0Var4;
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                r15 = r11;
                                                r14 = r11;
                                                r15.b0(iG);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (OutOfMemoryError e14) {
                                                e = e14;
                                                r15 = r11;
                                                r14 = r11;
                                                r15.b0(iG);
                                                r16 = th2;
                                                r17 = r14;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r13 = r11;
                                                r13.b0(iG);
                                                throw th;
                                            }
                                        }
                                        if (r16 == 0) {
                                            t.j("Id3Decoder", "Failed to decode frame: id=" + x(i14, r17, iA, i13, iM4) + ", frameSize=" + iA, e);
                                        }
                                        return r16;
                                    }
                                    aVarG = j(c0Var2, iA);
                                }
                                r11 = c0Var2;
                                iA = iA;
                                r11 = r11;
                                i13 = iM3;
                            } catch (Exception e15) {
                                e = e15;
                                r12 = r11;
                                iA = iA;
                                i13 = iM3;
                                r15 = c0Var2;
                                r14 = r12;
                                r15.b0(iG);
                                r16 = th2;
                                r17 = r14;
                                if (r16 == 0) {
                                    t.j("Id3Decoder", "Failed to decode frame: id=" + x(i14, r17, iA, i13, iM4) + ", frameSize=" + iA, e);
                                }
                                return r16;
                            } catch (OutOfMemoryError e16) {
                                e = e16;
                                r12 = r11;
                                iA = iA;
                                i13 = iM3;
                                r15 = c0Var2;
                                r14 = r12;
                                r15.b0(iG);
                                r16 = th2;
                                r17 = r14;
                                if (r16 == 0) {
                                    t.j("Id3Decoder", "Failed to decode frame: id=" + x(i14, r17, iA, i13, iM4) + ", frameSize=" + iA, e);
                                }
                                return r16;
                            }
                        }
                        r11.b0(iG);
                        r16 = aVarG;
                        e = th2;
                        r17 = r11;
                        if (r16 == 0) {
                            t.j("Id3Decoder", "Failed to decode frame: id=" + x(i14, r17, iA, i13, iM4) + ", frameSize=" + iA, e);
                        }
                        return r16;
                    }
                    aVarG = o(c0Var2, iA);
                }
                r11 = c0Var2;
                iA = iA;
                th2 = null;
                r11 = r11;
                i13 = iM3;
                r11.b0(iG);
                r16 = aVarG;
                e = th2;
                r17 = r11;
            } catch (Throwable th5) {
                th = th5;
                r13 = c0Var2;
            }
        } catch (Exception e17) {
            e = e17;
            r12 = r11;
            iA = iA;
            th2 = null;
            i13 = iM3;
            r15 = c0Var2;
            r14 = r12;
            r15.b0(iG);
            r16 = th2;
            r17 = r14;
            if (r16 == 0) {
                t.j("Id3Decoder", "Failed to decode frame: id=" + x(i14, r17, iA, i13, iM4) + ", frameSize=" + iA, e);
            }
            return r16;
        } catch (OutOfMemoryError e18) {
            e = e18;
            r12 = r11;
            iA = iA;
            th2 = null;
            i13 = iM3;
            r15 = c0Var2;
            r14 = r12;
            r15.b0(iG);
            r16 = th2;
            r17 = r14;
            if (r16 == 0) {
                t.j("Id3Decoder", "Failed to decode frame: id=" + x(i14, r17, iA, i13, iM4) + ", frameSize=" + iA, e);
            }
            return r16;
        }
        if (r16 == 0) {
            t.j("Id3Decoder", "Failed to decode frame: id=" + x(i14, r17, iA, i13, iM4) + ", frameSize=" + iA, e);
        }
        return r16;
    }

    private static f l(c0 c0Var, int i11) {
        int iM = c0Var.M();
        Charset charsetW = w(iM);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c0Var.q(bArr, 0, i12);
        int iZ = z(bArr, 0);
        String strU = g0.u(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i13 = iZ + 1;
        int iY = y(bArr, i13, iM);
        String strP = p(bArr, i13, iY, charsetW);
        int iV = iY + v(iM);
        int iY2 = y(bArr, iV, iM);
        return new f(strU, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iM), i12));
    }

    private static b m(c0 c0Var) {
        if (c0Var.a() < 10) {
            t.i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iP = c0Var.P();
        if (iP != 4801587) {
            t.i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iP)));
            return null;
        }
        int iM = c0Var.M();
        c0Var.c0(1);
        int iM2 = c0Var.M();
        int iL = c0Var.L();
        if (iM == 2) {
            if ((iM2 & 64) != 0) {
                t.i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iM == 3) {
            if ((iM2 & 64) != 0) {
                int iV = c0Var.v();
                c0Var.c0(iV);
                iL -= iV + 4;
            }
        } else {
            if (iM != 4) {
                t.i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iM);
                return null;
            }
            if ((iM2 & 64) != 0) {
                int iL2 = c0Var.L();
                c0Var.c0(iL2 - 4);
                iL -= iL2;
            }
            if ((iM2 & 16) != 0) {
                iL -= 10;
            }
        }
        return new b(iM, iM < 4 && (iM2 & 128) != 0, iL);
    }

    private static l n(c0 c0Var, int i11) {
        int iU = c0Var.U();
        int iP = c0Var.P();
        int iP2 = c0Var.P();
        int iM = c0Var.M();
        int iM2 = c0Var.M();
        b0 b0Var = new b0();
        b0Var.m(c0Var);
        int i12 = ((i11 - 10) * 8) / (iM + iM2);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int iH = b0Var.h(iM);
            int iH2 = b0Var.h(iM2);
            iArr[i13] = iH;
            iArr2[i13] = iH2;
        }
        return new l(iU, iP, iP2, iArr, iArr2);
    }

    private static m o(c0 c0Var, int i11) {
        byte[] bArr = new byte[i11];
        c0Var.q(bArr, 0, i11);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i11));
    }

    private static String p(byte[] bArr, int i11, int i12, Charset charset) {
        return (i12 <= i11 || i12 > bArr.length) ? "" : new String(bArr, i11, i12 - i11, charset);
    }

    private static n q(c0 c0Var, int i11, String str) {
        if (i11 < 1) {
            return null;
        }
        int iM = c0Var.M();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c0Var.q(bArr, 0, i12);
        return new n(str, null, r(bArr, iM, 0));
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

    private static n s(c0 c0Var, int i11) {
        if (i11 < 1) {
            return null;
        }
        int iM = c0Var.M();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c0Var.q(bArr, 0, i12);
        int iY = y(bArr, 0, iM);
        return new n("TXXX", new String(bArr, 0, iY, w(iM)), r(bArr, iM, iY + v(iM)));
    }

    private static o t(c0 c0Var, int i11, String str) {
        byte[] bArr = new byte[i11];
        c0Var.q(bArr, 0, i11);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    private static o u(c0 c0Var, int i11) {
        if (i11 < 1) {
            return null;
        }
        int iM = c0Var.M();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c0Var.q(bArr, 0, i12);
        int iY = y(bArr, 0, iM);
        String str = new String(bArr, 0, iY, w(iM));
        int iV = iY + v(iM);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i11) {
        return (i11 == 0 || i11 == 3) ? 1 : 2;
    }

    private static Charset w(int i11) {
        if (i11 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i11 != 2) {
            return i11 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
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

    @Override // f9.c
    protected f0 b(f9.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public f0 e(byte[] bArr, int i11) throws Throwable {
        ArrayList arrayList = new ArrayList();
        c0 c0Var = new c0(bArr, i11);
        b bVarM = m(c0Var);
        if (bVarM == null) {
            return null;
        }
        int iG = c0Var.g();
        int i12 = bVarM.f85423a == 2 ? 6 : 10;
        int iA = bVarM.f85425c;
        if (bVarM.f85424b) {
            iA = A(c0Var, bVarM.f85425c);
        }
        c0Var.a0(iG + iA);
        boolean z11 = false;
        if (!B(c0Var, bVarM.f85423a, i12, false)) {
            if (bVarM.f85423a != 4 || !B(c0Var, 4, i12, true)) {
                t.i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarM.f85423a);
                return null;
            }
            z11 = true;
        }
        while (c0Var.a() >= i12) {
            i iVarK = k(bVarM.f85423a, c0Var, z11, i12, this.f85422a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new f0(arrayList);
    }

    public h(a aVar) {
        this.f85422a = aVar;
    }
}
