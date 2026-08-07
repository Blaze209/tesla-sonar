package us;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f116569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f116572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f116573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f116574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f116575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f116576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f116577i;

    private f(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, float f11, String str) {
        this.f116569a = list;
        this.f116570b = i11;
        this.f116571c = i12;
        this.f116572d = i13;
        this.f116573e = i14;
        this.f116574f = i15;
        this.f116575g = i16;
        this.f116576h = f11;
        this.f116577i = str;
    }

    public static f a(d0 d0Var) throws ParserException {
        boolean z11;
        try {
            d0Var.V(21);
            int iH = d0Var.H() & 3;
            int iH2 = d0Var.H();
            int iF = d0Var.f();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z11 = true;
                if (i12 >= iH2) {
                    break;
                }
                d0Var.V(1);
                int iN = d0Var.N();
                for (int i14 = 0; i14 < iN; i14++) {
                    int iN2 = d0Var.N();
                    i13 += iN2 + 4;
                    d0Var.V(iN2);
                }
                i12++;
            }
            d0Var.U(iF);
            byte[] bArr = new byte[i13];
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            float f11 = 1.0f;
            String strC = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 < iH2) {
                int iH3 = d0Var.H() & 63;
                int iN3 = d0Var.N();
                int i23 = i11;
                while (i23 < iN3) {
                    int iN4 = d0Var.N();
                    boolean z12 = z11;
                    byte[] bArr2 = ts.z.f115086a;
                    int i24 = iH;
                    System.arraycopy(bArr2, i11, bArr, i22, bArr2.length);
                    int length = i22 + bArr2.length;
                    System.arraycopy(d0Var.e(), d0Var.f(), bArr, length, iN4);
                    if (iH3 == 33 && i23 == 0) {
                        ts.z.a aVarH = ts.z.h(bArr, length, length + iN4);
                        i15 = aVarH.f115100k;
                        i16 = aVarH.f115101l;
                        i17 = aVarH.f115103n;
                        int i25 = aVarH.f115104o;
                        int i26 = aVarH.f115105p;
                        float f12 = aVarH.f115102m;
                        strC = ts.e.c(aVarH.f115090a, aVarH.f115091b, aVarH.f115092c, aVarH.f115093d, aVarH.f115097h, aVarH.f115098i);
                        i19 = i26;
                        f11 = f12;
                        i18 = i25;
                    }
                    i22 = length + iN4;
                    d0Var.V(iN4);
                    i23++;
                    z11 = z12;
                    iH = i24;
                    iH2 = iH2;
                    i11 = 0;
                }
                i21++;
                i11 = 0;
            }
            return new f(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iH + 1, i15, i16, i17, i18, i19, f11, strC);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw ParserException.a("Error parsing HEVC config", e11);
        }
    }
}
