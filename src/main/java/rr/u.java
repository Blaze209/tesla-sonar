package rr;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f109037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f109038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f109039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f109040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f109041e;

    public u(int i11, int i12) {
        this.f109037a = i11;
        byte[] bArr = new byte[i12 + 3];
        this.f109040d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i11, int i12) {
        if (this.f109038b) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f109040d;
            int length = bArr2.length;
            int i14 = this.f109041e;
            if (length < i14 + i13) {
                this.f109040d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, this.f109040d, this.f109041e, i13);
            this.f109041e += i13;
        }
    }

    public boolean b(int i11) {
        if (!this.f109038b) {
            return false;
        }
        this.f109041e -= i11;
        this.f109038b = false;
        this.f109039c = true;
        return true;
    }

    public boolean c() {
        return this.f109039c;
    }

    public void d() {
        this.f109038b = false;
        this.f109039c = false;
    }

    public void e(int i11) {
        ts.a.g(!this.f109038b);
        boolean z11 = i11 == this.f109037a;
        this.f109038b = z11;
        if (z11) {
            this.f109041e = 3;
            this.f109039c = false;
        }
    }
}
