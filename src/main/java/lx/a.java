package lx;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f90853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f90854c;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f90855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f90856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f90857c;

        private b(int i11, int i12, float f11) {
            this.f90855a = i11;
            this.f90856b = i12;
            this.f90857c = f11;
        }
    }

    public a(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, b> a() {
        HashMap<Integer, b> map = new HashMap<>();
        if (this.f90854c[0] != BitmapDescriptorFactory.HUE_RED) {
            map.put(0, new b(Color.argb(0, Color.red(this.f90853b[0]), Color.green(this.f90853b[0]), Color.blue(this.f90853b[0])), this.f90853b[0], this.f90852a * this.f90854c[0]));
        }
        for (int i11 = 1; i11 < this.f90853b.length; i11++) {
            int i12 = i11 - 1;
            Integer numValueOf = Integer.valueOf((int) (this.f90852a * this.f90854c[i12]));
            int[] iArr = this.f90853b;
            int i13 = iArr[i12];
            int i14 = iArr[i11];
            float f11 = this.f90852a;
            float[] fArr = this.f90854c;
            map.put(numValueOf, new b(i13, i14, f11 * (fArr[i11] - fArr[i12])));
        }
        float[] fArr2 = this.f90854c;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer numValueOf2 = Integer.valueOf((int) (this.f90852a * fArr2[length]));
            int i15 = this.f90853b[length];
            map.put(numValueOf2, new b(i15, i15, this.f90852a * (1.0f - this.f90854c[length])));
        }
        return map;
    }

    static int c(int i11, int i12, float f11) {
        int iAlpha = (int) (((Color.alpha(i12) - Color.alpha(i11)) * f11) + Color.alpha(i11));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i11), Color.green(i11), Color.blue(i11), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i12), Color.green(i12), Color.blue(i12), fArr2);
        float f12 = fArr[0];
        float f13 = fArr2[0];
        if (f12 - f13 > 180.0f) {
            fArr2[0] = f13 + 360.0f;
        } else if (f13 - f12 > 180.0f) {
            fArr[0] = f12 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i13 = 0; i13 < 3; i13++) {
            float f14 = fArr2[i13];
            float f15 = fArr[i13];
            fArr3[i13] = ((f14 - f15) * f11) + f15;
        }
        return Color.HSVToColor(iAlpha, fArr3);
    }

    int[] b(double d11) {
        HashMap<Integer, b> mapA = a();
        int[] iArr = new int[this.f90852a];
        b bVar = mapA.get(0);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f90852a; i12++) {
            if (mapA.containsKey(Integer.valueOf(i12))) {
                bVar = mapA.get(Integer.valueOf(i12));
                i11 = i12;
            }
            iArr[i12] = c(bVar.f90855a, bVar.f90856b, (i12 - i11) / bVar.f90857c);
        }
        if (d11 != 1.0d) {
            for (int i13 = 0; i13 < this.f90852a; i13++) {
                int i14 = iArr[i13];
                iArr[i13] = Color.argb((int) (((double) Color.alpha(i14)) * d11), Color.red(i14), Color.green(i14), Color.blue(i14));
            }
        }
        return iArr;
    }

    public a(int[] iArr, float[] fArr, int i11) {
        if (iArr.length != fArr.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (iArr.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int i12 = 1; i12 < fArr.length; i12++) {
            if (fArr[i12] <= fArr[i12 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
        this.f90852a = i11;
        int[] iArr2 = new int[iArr.length];
        this.f90853b = iArr2;
        this.f90854c = new float[fArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        System.arraycopy(fArr, 0, this.f90854c, 0, fArr.length);
    }
}
