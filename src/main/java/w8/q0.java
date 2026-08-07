package w8;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f121397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f121398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f121399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f121400d;

    public q0(byte[] bArr) {
        this.f121397a = bArr;
        this.f121398b = bArr.length;
    }

    private void a() {
        int i11;
        int i12 = this.f121399c;
        s7.a.h(i12 >= 0 && (i12 < (i11 = this.f121398b) || (i12 == i11 && this.f121400d == 0)));
    }

    public int b() {
        return (this.f121399c * 8) + this.f121400d;
    }

    public boolean c() {
        boolean z11 = (((this.f121397a[this.f121399c] & 255) >> this.f121400d) & 1) == 1;
        e(1);
        return z11;
    }

    public int d(int i11) {
        int i12 = this.f121399c;
        int iMin = Math.min(i11, 8 - this.f121400d);
        int i13 = i12 + 1;
        int i14 = ((this.f121397a[i12] & 255) >> this.f121400d) & (255 >> (8 - iMin));
        while (iMin < i11) {
            i14 |= (this.f121397a[i13] & 255) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i11));
        e(i11);
        return i15;
    }

    public void e(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f121399c + i12;
        this.f121399c = i13;
        int i14 = this.f121400d + (i11 - (i12 * 8));
        this.f121400d = i14;
        if (i14 > 7) {
            this.f121399c = i13 + 1;
            this.f121400d = i14 - 8;
        }
        a();
    }
}
