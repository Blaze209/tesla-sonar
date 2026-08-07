package ts;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f115077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f115078b;

    public v() {
        this(32);
    }

    public void a(long j11) {
        int i11 = this.f115077a;
        long[] jArr = this.f115078b;
        if (i11 == jArr.length) {
            this.f115078b = Arrays.copyOf(jArr, i11 * 2);
        }
        long[] jArr2 = this.f115078b;
        int i12 = this.f115077a;
        this.f115077a = i12 + 1;
        jArr2[i12] = j11;
    }

    public long b(int i11) {
        if (i11 >= 0 && i11 < this.f115077a) {
            return this.f115078b[i11];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i11 + ", size is " + this.f115077a);
    }

    public int c() {
        return this.f115077a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f115078b, this.f115077a);
    }

    public v(int i11) {
        this.f115078b = new long[i11];
    }
}
