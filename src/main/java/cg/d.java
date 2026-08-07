package cg;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f19237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f19238b;

    public d(float[] fArr, int[] iArr) {
        this.f19237a = fArr;
        this.f19238b = iArr;
    }

    private void a(d dVar) {
        int i11 = 0;
        while (true) {
            int[] iArr = dVar.f19238b;
            if (i11 >= iArr.length) {
                return;
            }
            this.f19237a[i11] = dVar.f19237a[i11];
            this.f19238b[i11] = iArr[i11];
            i11++;
        }
    }

    private int c(float f11) {
        int iBinarySearch = Arrays.binarySearch(this.f19237a, f11);
        if (iBinarySearch >= 0) {
            return this.f19238b[iBinarySearch];
        }
        int i11 = -(iBinarySearch + 1);
        if (i11 == 0) {
            return this.f19238b[0];
        }
        int[] iArr = this.f19238b;
        if (i11 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f19237a;
        int i12 = i11 - 1;
        float f12 = fArr[i12];
        return hg.c.c((f11 - f12) / (fArr[i11] - f12), iArr[i12], iArr[i11]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i11 = 0; i11 < fArr.length; i11++) {
            iArr[i11] = c(fArr[i11]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f19238b;
    }

    public float[] e() {
        return this.f19237a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f19237a, dVar.f19237a) && Arrays.equals(this.f19238b, dVar.f19238b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f19238b.length;
    }

    public void g(d dVar, d dVar2, float f11) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            a(dVar);
            return;
        }
        if (f11 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f19238b.length != dVar2.f19238b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f19238b.length + " vs " + dVar2.f19238b.length + ")");
        }
        int i11 = 0;
        while (true) {
            iArr = dVar.f19238b;
            if (i11 >= iArr.length) {
                break;
            }
            this.f19237a[i11] = hg.j.i(dVar.f19237a[i11], dVar2.f19237a[i11], f11);
            this.f19238b[i11] = hg.c.c(f11, dVar.f19238b[i11], dVar2.f19238b[i11]);
            i11++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f19237a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f19238b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f19238b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f19237a) * 31) + Arrays.hashCode(this.f19238b);
    }
}
