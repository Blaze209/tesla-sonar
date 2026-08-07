package ky;

import iy.b;
import java.util.Map;
import my.c;
import my.g;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static b b(g gVar, int i11, int i12, int i13) {
        my.b bVarA = gVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iE = bVarA.e();
        int iD = bVarA.d();
        int i14 = i13 * 2;
        int i15 = iE + i14;
        int i16 = i14 + iD;
        int iMax = Math.max(i11, i15);
        int iMax2 = Math.max(i12, i16);
        int iMin = Math.min(iMax / i15, iMax2 / i16);
        int i17 = (iMax - (iE * iMin)) / 2;
        int i18 = (iMax2 - (iD * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i19 = 0;
        while (i19 < iD) {
            int i21 = 0;
            int i22 = i17;
            while (i21 < iE) {
                if (bVarA.b(i21, i19) == 1) {
                    bVar.d(i22, i18, iMin, iMin);
                }
                i21++;
                i22 += iMin;
            }
            i19++;
            i18 += iMin;
        }
        return bVar;
    }

    public b a(String str, com.google.zxing.a aVar, int i11, int i12, Map<com.google.zxing.b, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i11 + 'x' + i12);
        }
        ly.a aVarValueOf = ly.a.L;
        int i13 = 4;
        if (map != null) {
            com.google.zxing.b bVar = com.google.zxing.b.ERROR_CORRECTION;
            if (map.containsKey(bVar)) {
                aVarValueOf = ly.a.valueOf(map.get(bVar).toString());
            }
            com.google.zxing.b bVar2 = com.google.zxing.b.MARGIN;
            if (map.containsKey(bVar2)) {
                i13 = Integer.parseInt(map.get(bVar2).toString());
            }
        }
        return b(c.n(str, aVarValueOf, map), i11, i12, i13);
    }
}
