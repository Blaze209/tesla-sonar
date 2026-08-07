package s7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f110492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f110493b;

    public u() {
        this(32);
    }

    public void a(long j11) {
        int i11 = this.f110492a;
        long[] jArr = this.f110493b;
        if (i11 == jArr.length) {
            this.f110493b = Arrays.copyOf(jArr, i11 * 2);
        }
        long[] jArr2 = this.f110493b;
        int i12 = this.f110492a;
        this.f110492a = i12 + 1;
        jArr2[i12] = j11;
    }

    public void b(long[] jArr) {
        int length = this.f110492a + jArr.length;
        long[] jArr2 = this.f110493b;
        if (length > jArr2.length) {
            this.f110493b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f110493b, this.f110492a, jArr.length);
        this.f110492a = length;
    }

    public long c(int i11) {
        if (i11 >= 0 && i11 < this.f110492a) {
            return this.f110493b[i11];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i11 + ", size is " + this.f110492a);
    }

    public int d() {
        return this.f110492a;
    }

    public u(int i11) {
        this.f110493b = new long[i11];
    }
}
