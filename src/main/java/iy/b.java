package iy;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f81945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f81946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f81947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f81948d;

    public b(int i11, int i12) {
        if (i11 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f81945a = i11;
        this.f81946b = i12;
        int i13 = (i11 + 31) / 32;
        this.f81947c = i13;
        this.f81948d = new int[i13 * i12];
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f81946b * (this.f81945a + 1));
        for (int i11 = 0; i11 < this.f81946b; i11++) {
            for (int i12 = 0; i12 < this.f81945a; i12++) {
                sb2.append(c(i12, i11) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f81945a, this.f81946b, this.f81947c, (int[]) this.f81948d.clone());
    }

    public boolean c(int i11, int i12) {
        return ((this.f81948d[(i12 * this.f81947c) + (i11 / 32)] >>> (i11 & 31)) & 1) != 0;
    }

    public void d(int i11, int i12, int i13, int i14) {
        if (i12 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i14 < 1 || i13 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i15 = i13 + i11;
        int i16 = i14 + i12;
        if (i16 > this.f81946b || i15 > this.f81945a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i12 < i16) {
            int i17 = this.f81947c * i12;
            for (int i18 = i11; i18 < i15; i18++) {
                int[] iArr = this.f81948d;
                int i19 = (i18 / 32) + i17;
                iArr[i19] = iArr[i19] | (1 << (i18 & 31));
            }
            i12++;
        }
    }

    public String e(String str, String str2) {
        return a(str, str2, "\n");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f81945a == bVar.f81945a && this.f81946b == bVar.f81946b && this.f81947c == bVar.f81947c && Arrays.equals(this.f81948d, bVar.f81948d);
    }

    public int hashCode() {
        int i11 = this.f81945a;
        return (((((((i11 * 31) + i11) * 31) + this.f81946b) * 31) + this.f81947c) * 31) + Arrays.hashCode(this.f81948d);
    }

    public String toString() {
        return e("X ", "  ");
    }

    private b(int i11, int i12, int i13, int[] iArr) {
        this.f81945a = i11;
        this.f81946b = i12;
        this.f81947c = i13;
        this.f81948d = iArr;
    }
}
