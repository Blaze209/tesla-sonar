package s7;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f110494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f110495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f110496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f110497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f110498e;

    public v() {
        this(16);
    }

    private void c() {
        long[] jArr = this.f110497d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i11 = this.f110494a;
        int i12 = length2 - i11;
        System.arraycopy(jArr, i11, jArr2, 0, i12);
        System.arraycopy(this.f110497d, 0, jArr2, i12, i11);
        this.f110494a = 0;
        this.f110495b = this.f110496c - 1;
        this.f110497d = jArr2;
        this.f110498e = jArr2.length - 1;
    }

    public void a(long j11) {
        if (this.f110496c == this.f110497d.length) {
            c();
        }
        int i11 = (this.f110495b + 1) & this.f110498e;
        this.f110495b = i11;
        this.f110497d[i11] = j11;
        this.f110496c++;
    }

    public void b() {
        this.f110494a = 0;
        this.f110495b = -1;
        this.f110496c = 0;
    }

    public long d() {
        if (this.f110496c != 0) {
            return this.f110497d[this.f110494a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f110496c == 0;
    }

    public long f() {
        int i11 = this.f110496c;
        if (i11 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f110497d;
        int i12 = this.f110494a;
        long j11 = jArr[i12];
        this.f110494a = this.f110498e & (i12 + 1);
        this.f110496c = i11 - 1;
        return j11;
    }

    public v(int i11) {
        a.a(i11 >= 0 && i11 <= 1073741824);
        i11 = i11 == 0 ? 1 : i11;
        i11 = Integer.bitCount(i11) != 1 ? Integer.highestOneBit(i11 - 1) << 1 : i11;
        this.f110494a = 0;
        this.f110495b = -1;
        this.f110496c = 0;
        long[] jArr = new long[i11];
        this.f110497d = jArr;
        this.f110498e = jArr.length - 1;
    }
}
