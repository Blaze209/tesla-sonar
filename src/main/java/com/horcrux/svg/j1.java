package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes6.dex */
class j1 {
    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    static Matrix a(RectF rectF, RectF rectF2, String str, int i11) {
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16 = rectF.left;
        double d17 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d18 = rectF2.left;
        double d19 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double dMax = dWidth2 / dWidth;
        double d21 = dHeight2 / dHeight;
        double d22 = d18 - (d16 * dMax);
        double d23 = d19 - (d17 * d21);
        if (i11 == 2) {
            dMax = Math.min(dMax, d21);
            if (dMax > 1.0d) {
                d13 = d22 - (((dWidth2 / dMax) - dWidth) / 2.0d);
                d15 = (dHeight2 / dMax) - dHeight;
            } else {
                d13 = d22 - ((dWidth2 - (dWidth * dMax)) / 2.0d);
                d15 = dHeight2 - (dHeight * dMax);
            }
            d14 = d23 - (d15 / 2.0d);
            d21 = dMax;
        } else {
            if (!str.equals("none") && i11 == 0) {
                dMax = Math.min(dMax, d21);
            } else if (str.equals("none") || i11 != 1) {
                d11 = d18 - (d16 * dMax);
                d12 = d19 - (d17 * d21);
                if (str.contains("xMid")) {
                    d11 += (dWidth2 - (dWidth * dMax)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d11 += dWidth2 - (dWidth * dMax);
                }
                d13 = d11;
                if (str.contains("YMid")) {
                    d12 += (dHeight2 - (dHeight * d21)) / 2.0d;
                }
                d14 = d12;
                if (str.contains("YMax")) {
                    d14 += dHeight2 - (dHeight * d21);
                }
            } else {
                dMax = Math.max(dMax, d21);
            }
            d21 = dMax;
            d11 = d18 - (d16 * dMax);
            d12 = d19 - (d17 * d21);
            if (str.contains("xMid")) {
                d11 += (dWidth2 - (dWidth * dMax)) / 2.0d;
            }
            if (str.contains("xMax")) {
                d11 += dWidth2 - (dWidth * dMax);
            }
            d13 = d11;
            if (str.contains("YMid")) {
                d12 += (dHeight2 - (dHeight * d21)) / 2.0d;
            }
            d14 = d12;
            if (str.contains("YMax")) {
                d14 += dHeight2 - (dHeight * d21);
            }
        }
        double d24 = d13;
        double d25 = d14;
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d24, (float) d25);
        matrix.preScale((float) dMax, (float) d21);
        return matrix;
    }
}
