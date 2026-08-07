package hr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f73327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f73328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f73329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73330d;

    public d0(byte[] bArr) {
        this.f73327a = bArr;
        this.f73328b = bArr.length;
    }

    private void a() {
        int i11;
        int i12 = this.f73329c;
        ts.a.g(i12 >= 0 && (i12 < (i11 = this.f73328b) || (i12 == i11 && this.f73330d == 0)));
    }

    public int b() {
        return (this.f73329c * 8) + this.f73330d;
    }

    public boolean c() {
        boolean z11 = (((this.f73327a[this.f73329c] & 255) >> this.f73330d) & 1) == 1;
        e(1);
        return z11;
    }

    public int d(int i11) {
        int i12 = this.f73329c;
        int iMin = Math.min(i11, 8 - this.f73330d);
        int i13 = i12 + 1;
        int i14 = ((this.f73327a[i12] & 255) >> this.f73330d) & (255 >> (8 - iMin));
        while (iMin < i11) {
            i14 |= (this.f73327a[i13] & 255) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i11));
        e(i11);
        return i15;
    }

    public void e(int i11) {
        int i12 = i11 / 8;
        int i13 = this.f73329c + i12;
        this.f73329c = i13;
        int i14 = this.f73330d + (i11 - (i12 * 8));
        this.f73330d = i14;
        if (i14 > 7) {
            this.f73329c = i13 + 1;
            this.f73330d = i14 - 8;
        }
        a();
    }
}
