package us;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f116527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f116530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f116531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f116532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f116533g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f116534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f116535i;

    private a(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, float f11, String str) {
        this.f116527a = list;
        this.f116528b = i11;
        this.f116529c = i12;
        this.f116530d = i13;
        this.f116531e = i14;
        this.f116532f = i15;
        this.f116533g = i16;
        this.f116534h = f11;
        this.f116535i = str;
    }

    private static byte[] a(d0 d0Var) {
        int iN = d0Var.N();
        int iF = d0Var.f();
        d0Var.V(iN);
        return ts.e.d(d0Var.e(), iF, iN);
    }

    public static a b(d0 d0Var) throws ParserException {
        String strA;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        try {
            d0Var.V(4);
            int iH = (d0Var.H() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = d0Var.H() & 31;
            for (int i16 = 0; i16 < iH2; i16++) {
                arrayList.add(a(d0Var));
            }
            int iH3 = d0Var.H();
            for (int i17 = 0; i17 < iH3; i17++) {
                arrayList.add(a(d0Var));
            }
            if (iH2 > 0) {
                ts.z.c cVarL = ts.z.l((byte[]) arrayList.get(0), iH, ((byte[]) arrayList.get(0)).length);
                int i18 = cVarL.f115114f;
                int i19 = cVarL.f115115g;
                int i21 = cVarL.f115123o;
                int i22 = cVarL.f115124p;
                int i23 = cVarL.f115125q;
                float f12 = cVarL.f115116h;
                strA = ts.e.a(cVarL.f115109a, cVarL.f115110b, cVarL.f115111c);
                i13 = i22;
                i14 = i23;
                f11 = f12;
                i11 = i18;
                i12 = i19;
                i15 = i21;
            } else {
                strA = null;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                f11 = 1.0f;
                i15 = -1;
            }
            return new a(arrayList, iH, i11, i12, i15, i13, i14, f11, strA);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw ParserException.a("Error parsing AVC config", e11);
        }
    }
}
