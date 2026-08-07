package w8;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f121256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f121259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f121260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f121261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f121262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f121263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f121264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f121265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f121266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f121267l;

    private d(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f11, String str) {
        this.f121256a = list;
        this.f121257b = i11;
        this.f121258c = i12;
        this.f121259d = i13;
        this.f121260e = i14;
        this.f121261f = i15;
        this.f121262g = i16;
        this.f121263h = i17;
        this.f121264i = i18;
        this.f121265j = i19;
        this.f121266k = f11;
        this.f121267l = str;
    }

    private static byte[] a(s7.c0 c0Var) {
        int iU = c0Var.U();
        int iG = c0Var.g();
        c0Var.c0(iU);
        return s7.k.j(c0Var.f(), iG, iU);
    }

    public static d b(s7.c0 c0Var) throws ParserException {
        String strF;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        try {
            c0Var.c0(4);
            int iM = (c0Var.M() & 3) + 1;
            if (iM == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM2 = c0Var.M() & 31;
            for (int i19 = 0; i19 < iM2; i19++) {
                arrayList.add(a(c0Var));
            }
            int iM3 = c0Var.M();
            for (int i21 = 0; i21 < iM3; i21++) {
                arrayList.add(a(c0Var));
            }
            if (iM2 > 0) {
                t7.h.m mVarC = t7.h.C((byte[]) arrayList.get(0), t7.h.f112710a.length, ((byte[]) arrayList.get(0)).length);
                int i22 = mVarC.f112777f;
                int i23 = mVarC.f112778g;
                int i24 = mVarC.f112780i + 8;
                int i25 = mVarC.f112781j + 8;
                int i26 = mVarC.f112788q;
                int i27 = mVarC.f112789r;
                int i28 = mVarC.f112790s;
                int i29 = mVarC.f112791t;
                float f12 = mVarC.f112779h;
                strF = s7.k.f(mVarC.f112772a, mVarC.f112773b, mVarC.f112774c);
                i15 = i28;
                i16 = i29;
                f11 = f12;
                i14 = i25;
                i17 = i26;
                i18 = i27;
                i11 = i22;
                i12 = i23;
                i13 = i24;
            } else {
                strF = null;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = 16;
                f11 = 1.0f;
                i17 = -1;
                i18 = -1;
            }
            return new d(arrayList, iM, i11, i12, i13, i14, i17, i18, i15, i16, f11, strF);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw ParserException.a("Error parsing AVC config", e11);
        }
    }
}
