package s7;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h0<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f110421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V[] f110422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f110423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f110424d;

    public h0() {
        this(10);
    }

    private void b(long j11, V v11) {
        int i11 = this.f110423c;
        int i12 = this.f110424d;
        V[] vArr = this.f110422b;
        int length = (i11 + i12) % vArr.length;
        this.f110421a[length] = j11;
        vArr[length] = v11;
        this.f110424d = i12 + 1;
    }

    private void d(long j11) {
        int i11 = this.f110424d;
        if (i11 > 0) {
            if (j11 <= this.f110421a[((this.f110423c + i11) - 1) % this.f110422b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f110422b.length;
        if (this.f110424d < length) {
            return;
        }
        int i11 = length * 2;
        long[] jArr = new long[i11];
        V[] vArr = (V[]) f(i11);
        int i12 = this.f110423c;
        int i13 = length - i12;
        System.arraycopy(this.f110421a, i12, jArr, 0, i13);
        System.arraycopy(this.f110422b, this.f110423c, vArr, 0, i13);
        int i14 = this.f110423c;
        if (i14 > 0) {
            System.arraycopy(this.f110421a, 0, jArr, i13, i14);
            System.arraycopy(this.f110422b, 0, vArr, i13, this.f110423c);
        }
        this.f110421a = jArr;
        this.f110422b = vArr;
        this.f110423c = 0;
    }

    private static <V> V[] f(int i11) {
        return (V[]) new Object[i11];
    }

    private V h(long j11, boolean z11) {
        V vK = null;
        long j12 = Long.MAX_VALUE;
        while (this.f110424d > 0) {
            long j13 = j11 - this.f110421a[this.f110423c];
            if (j13 < 0 && (z11 || (-j13) >= j12)) {
                break;
            }
            vK = k();
            j12 = j13;
        }
        return vK;
    }

    private V k() {
        a.h(this.f110424d > 0);
        V[] vArr = this.f110422b;
        int i11 = this.f110423c;
        V v11 = vArr[i11];
        vArr[i11] = null;
        this.f110423c = (i11 + 1) % vArr.length;
        this.f110424d--;
        return v11;
    }

    public synchronized void a(long j11, V v11) {
        d(j11);
        e();
        b(j11, v11);
    }

    public synchronized void c() {
        this.f110423c = 0;
        this.f110424d = 0;
        Arrays.fill(this.f110422b, (Object) null);
    }

    public synchronized V g(long j11) {
        return h(j11, false);
    }

    public synchronized V i() {
        return this.f110424d == 0 ? null : k();
    }

    public synchronized V j(long j11) {
        return h(j11, true);
    }

    public synchronized int l() {
        return this.f110424d;
    }

    public h0(int i11) {
        this.f110421a = new long[i11];
        this.f110422b = (V[]) f(i11);
    }
}
