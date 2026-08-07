package w8;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f121239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f121242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f121243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f121244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f121245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f121246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f121247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f121248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f121249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f121250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f121251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f121252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f121253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f121254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t7.h.k f121255q;

    private c0(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23, float f11, int i24, String str, t7.h.k kVar) {
        this.f121239a = list;
        this.f121240b = i11;
        this.f121241c = i12;
        this.f121242d = i13;
        this.f121243e = i14;
        this.f121244f = i15;
        this.f121245g = i16;
        this.f121246h = i17;
        this.f121247i = i18;
        this.f121248j = i19;
        this.f121249k = i21;
        this.f121250l = i22;
        this.f121251m = i23;
        this.f121252n = f11;
        this.f121253o = i24;
        this.f121254p = str;
        this.f121255q = kVar;
    }

    public static c0 a(s7.c0 c0Var) {
        return b(c0Var, false, null);
    }

    private static c0 b(s7.c0 c0Var, boolean z11, t7.h.k kVar) throws ParserException {
        boolean z12;
        int i11;
        t7.h.g gVarT;
        try {
            if (z11) {
                c0Var.c0(4);
            } else {
                c0Var.c0(21);
            }
            int iM = c0Var.M() & 3;
            int iM2 = c0Var.M();
            int iG = c0Var.g();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z12 = true;
                if (i13 >= iM2) {
                    break;
                }
                c0Var.c0(1);
                int iU = c0Var.U();
                for (int i15 = 0; i15 < iU; i15++) {
                    int iU2 = c0Var.U();
                    i14 += iU2 + 4;
                    c0Var.c0(iU2);
                }
                i13++;
            }
            c0Var.b0(iG);
            byte[] bArr = new byte[i14];
            t7.h.k kVar2 = kVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            int i28 = -1;
            float f11 = 1.0f;
            String strH = null;
            int i29 = 0;
            int i31 = 0;
            while (i29 < iM2) {
                int iM3 = c0Var.M() & 63;
                int iU3 = c0Var.U();
                int i32 = i12;
                t7.h.k kVarY = kVar2;
                while (i32 < iU3) {
                    int iU4 = c0Var.U();
                    boolean z13 = z12;
                    byte[] bArr2 = t7.h.f112710a;
                    int i33 = iM;
                    System.arraycopy(bArr2, i12, bArr, i31, bArr2.length);
                    int length = i31 + bArr2.length;
                    System.arraycopy(c0Var.f(), c0Var.g(), bArr, length, iU4);
                    if (iM3 == 32 && i32 == 0) {
                        kVarY = t7.h.y(bArr, length, length + iU4);
                        i11 = iM2;
                    } else {
                        if (iM3 == 33 && i32 == 0) {
                            t7.h.C2408h c2408hU = t7.h.u(bArr, length, length + iU4, kVarY);
                            i16 = c2408hU.f112744b + 1;
                            i17 = c2408hU.f112750h;
                            int i34 = c2408hU.f112751i;
                            int i35 = c2408hU.f112752j;
                            i11 = iM2;
                            int i36 = c2408hU.f112753k;
                            i22 = c2408hU.f112747e + 8;
                            i23 = c2408hU.f112748f + 8;
                            int i37 = c2408hU.f112756n;
                            int i38 = c2408hU.f112757o;
                            int i39 = c2408hU.f112758p;
                            float f12 = c2408hU.f112754l;
                            int i41 = c2408hU.f112755m;
                            t7.h.c cVar = c2408hU.f112745c;
                            if (cVar != null) {
                                strH = s7.k.h(cVar.f112719a, cVar.f112720b, cVar.f112721c, cVar.f112722d, cVar.f112723e, cVar.f112724f);
                            }
                            f11 = f12;
                            i28 = i41;
                            i25 = i38;
                            i26 = i39;
                            i21 = i36;
                            i24 = i37;
                            i19 = i35;
                            i18 = i34;
                        } else {
                            i11 = iM2;
                            if (iM3 == 39 && i32 == 0 && (gVarT = t7.h.t(bArr, length, length + iU4)) != null && kVarY != null) {
                                i12 = 0;
                                i27 = gVarT.f112737d == kVarY.f112765b.get(0).f112715b ? 4 : 5;
                            }
                        }
                        i12 = 0;
                    }
                    i31 = length + iU4;
                    c0Var.c0(iU4);
                    i32++;
                    z12 = z13;
                    iM = i33;
                    iM2 = i11;
                }
                i29++;
                kVar2 = kVarY;
            }
            return new c0(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iM + 1, i16, i17, i18, i19, i21, i22, i23, i24, i25, i26, i27, f11, i28, strH, kVar2);
        } catch (ArrayIndexOutOfBoundsException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z11 ? "L-HEVC config" : "HEVC config");
            throw ParserException.a(sb2.toString(), e11);
        }
    }

    public static c0 c(s7.c0 c0Var, t7.h.k kVar) {
        return b(c0Var, true, kVar);
    }
}
