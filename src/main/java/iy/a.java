package iy;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f81942c = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f81943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f81944b;

    public a() {
        this.f81944b = 0;
        this.f81943a = f81942c;
    }

    private void e(int i11) {
        if (i11 > this.f81943a.length * 32) {
            int[] iArrI = i((int) Math.ceil(i11 / 0.75f));
            int[] iArr = this.f81943a;
            System.arraycopy(iArr, 0, iArrI, 0, iArr.length);
            this.f81943a = iArrI;
        }
    }

    private static int[] i(int i11) {
        return new int[(i11 + 31) / 32];
    }

    public void a(boolean z11) {
        e(this.f81944b + 1);
        if (z11) {
            int[] iArr = this.f81943a;
            int i11 = this.f81944b;
            int i12 = i11 / 32;
            iArr[i12] = (1 << (i11 & 31)) | iArr[i12];
        }
        this.f81944b++;
    }

    public void b(a aVar) {
        int i11 = aVar.f81944b;
        e(this.f81944b + i11);
        for (int i12 = 0; i12 < i11; i12++) {
            a(aVar.f(i12));
        }
    }

    public void c(int i11, int i12) {
        if (i12 < 0 || i12 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i13 = this.f81944b;
        e(i13 + i12);
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            if (((1 << i14) & i11) != 0) {
                int[] iArr = this.f81943a;
                int i15 = i13 / 32;
                iArr[i15] = iArr[i15] | (1 << (i13 & 31));
            }
            i13++;
        }
        this.f81944b = i13;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f81943a.clone(), this.f81944b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f81944b == aVar.f81944b && Arrays.equals(this.f81943a, aVar.f81943a);
    }

    public boolean f(int i11) {
        return ((1 << (i11 & 31)) & this.f81943a[i11 / 32]) != 0;
    }

    public int g() {
        return this.f81944b;
    }

    public int h() {
        return (this.f81944b + 7) / 8;
    }

    public int hashCode() {
        return (this.f81944b * 31) + Arrays.hashCode(this.f81943a);
    }

    public void j(int i11, byte[] bArr, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = 0;
            for (int i16 = 0; i16 < 8; i16++) {
                if (f(i11)) {
                    i15 |= 1 << (7 - i16);
                }
                i11++;
            }
            bArr[i12 + i14] = (byte) i15;
        }
    }

    public void k(a aVar) {
        if (this.f81944b != aVar.f81944b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i11 = 0;
        while (true) {
            int[] iArr = this.f81943a;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = iArr[i11] ^ aVar.f81943a[i11];
            i11++;
        }
    }

    public String toString() {
        int i11 = this.f81944b;
        StringBuilder sb2 = new StringBuilder(i11 + (i11 / 8) + 1);
        for (int i12 = 0; i12 < this.f81944b; i12++) {
            if ((i12 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(f(i12) ? 'X' : CoreConstants.DOT);
        }
        return sb2.toString();
    }

    a(int[] iArr, int i11) {
        this.f81943a = iArr;
        this.f81944b = i11;
    }
}
