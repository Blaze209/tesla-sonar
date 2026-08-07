package com.horcrux.svg;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes6.dex */
public class CustomFilter {
    public static Bitmap apply(Bitmap bitmap, Bitmap bitmap2, d dVar) {
        int[] iArr;
        int[] iArr2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr3 = new int[i11];
        int[] iArr4 = new int[i11];
        int[] iArr5 = new int[i11];
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        float[] fArr2 = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        try {
            bitmap.getPixels(iArr3, 0, width, 0, 0, width, height);
            iArr = iArr3;
            iArr2 = iArr4;
            try {
                bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
            }
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
            iArr = iArr3;
            iArr2 = iArr4;
        }
        for (int i12 = 0; i12 < height; i12++) {
            for (int i13 = 0; i13 < width; i13++) {
                int i14 = (i12 * width) + i13;
                int i15 = iArr[i14];
                fArr[0] = ((i15 >> 24) & 255) / 255.0f;
                fArr[1] = ((i15 >> 16) & 255) / 255.0f;
                fArr[2] = ((i15 >> 8) & 255) / 255.0f;
                fArr[3] = (i15 & 255) / 255.0f;
                int i16 = iArr2[i14];
                fArr2[0] = ((i16 >> 24) & 255) / 255.0f;
                fArr2[1] = ((i16 >> 16) & 255) / 255.0f;
                fArr2[2] = ((i16 >> 8) & 255) / 255.0f;
                fArr2[3] = (i16 & 255) / 255.0f;
                iArr5[i14] = normalizeFromFloats(dVar.a(fArr, fArr2));
            }
        }
        return Bitmap.createBitmap(iArr5, width, height, Bitmap.Config.ARGB_8888);
    }

    public static int normalizeFromFloat(float f11) {
        return Math.min(255, Math.max(0, Math.round(f11 * 255.0f)));
    }

    public static int normalizeFromFloats(float[] fArr) {
        if (fArr.length < 4 || normalizeFromFloat(fArr[0]) <= 0) {
            return 0;
        }
        return normalizeFromFloat(fArr[3] / fArr[0]) | (normalizeFromFloat(fArr[0]) << 24) | (normalizeFromFloat(fArr[1] / fArr[0]) << 16) | (normalizeFromFloat(fArr[2] / fArr[0]) << 8);
    }
}
