package t7;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f112815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f112816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f112817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f112818d;

    public j(byte[] bArr, int i11, int i12) {
        j(bArr, i11, i12);
    }

    private void a() {
        int i11;
        int i12 = this.f112817c;
        s7.a.h(i12 >= 0 && (i12 < (i11 = this.f112816b) || (i12 == i11 && this.f112818d == 0)));
    }

    private int g() {
        int i11 = 0;
        while (!e()) {
            i11++;
        }
        return ((1 << i11) - 1) + (i11 > 0 ? f(i11) : 0);
    }

    private boolean k(int i11) {
        if (2 > i11 || i11 >= this.f112816b) {
            return false;
        }
        byte[] bArr = this.f112815a;
        return bArr[i11] == 3 && bArr[i11 + (-2)] == 0 && bArr[i11 - 1] == 0;
    }

    public void b() {
        int i11 = this.f112818d;
        if (i11 > 0) {
            m(8 - i11);
        }
    }

    public boolean c(int i11) {
        int i12 = this.f112817c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        int i15 = (this.f112818d + i11) - (i13 * 8);
        if (i15 > 7) {
            i14++;
            i15 -= 8;
        }
        while (true) {
            i12++;
            if (i12 > i14 || i14 >= this.f112816b) {
                break;
            }
            if (k(i12)) {
                i14++;
                i12 += 2;
            }
        }
        int i16 = this.f112816b;
        if (i14 >= i16) {
            return i14 == i16 && i15 == 0;
        }
        return true;
    }

    public boolean d() {
        int i11 = this.f112817c;
        int i12 = this.f112818d;
        int i13 = 0;
        while (this.f112817c < this.f112816b && !e()) {
            i13++;
        }
        boolean z11 = this.f112817c == this.f112816b;
        this.f112817c = i11;
        this.f112818d = i12;
        return !z11 && c((i13 * 2) + 1);
    }

    public boolean e() {
        boolean z11 = (this.f112815a[this.f112817c] & (128 >> this.f112818d)) != 0;
        l();
        return z11;
    }

    public int f(int i11) {
        int i12;
        this.f112818d += i11;
        int i13 = 0;
        while (true) {
            i12 = this.f112818d;
            int i14 = 2;
            if (i12 <= 8) {
                break;
            }
            int i15 = i12 - 8;
            this.f112818d = i15;
            byte[] bArr = this.f112815a;
            int i16 = this.f112817c;
            i13 |= (bArr[i16] & 255) << i15;
            if (!k(i16 + 1)) {
                i14 = 1;
            }
            this.f112817c = i16 + i14;
        }
        byte[] bArr2 = this.f112815a;
        int i17 = this.f112817c;
        int i18 = ((-1) >>> (32 - i11)) & (i13 | ((bArr2[i17] & 255) >> (8 - i12)));
        if (i12 == 8) {
            this.f112818d = 0;
            this.f112817c = i17 + (k(i17 + 1) ? 2 : 1);
        }
        a();
        return i18;
    }

    public int h() {
        int iG = g();
        return (iG % 2 == 0 ? -1 : 1) * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i11, int i12) {
        this.f112815a = bArr;
        this.f112817c = i11;
        this.f112816b = i12;
        this.f112818d = 0;
        a();
    }

    public void l() {
        int i11 = this.f112818d + 1;
        this.f112818d = i11;
        if (i11 == 8) {
            this.f112818d = 0;
            int i12 = this.f112817c;
            this.f112817c = i12 + (k(i12 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i11) {
        int i12 = this.f112817c;
        int i13 = i11 / 8;
        int i14 = i12 + i13;
        this.f112817c = i14;
        int i15 = this.f112818d + (i11 - (i13 * 8));
        this.f112818d = i15;
        if (i15 > 7) {
            this.f112817c = i14 + 1;
            this.f112818d = i15 - 8;
        }
        while (true) {
            i12++;
            if (i12 > this.f112817c) {
                a();
                return;
            } else if (k(i12)) {
                this.f112817c++;
                i12 += 2;
            }
        }
    }
}
