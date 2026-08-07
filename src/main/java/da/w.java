package da;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f60326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f60327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f60328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60329e;

    public w(int i11, int i12) {
        this.f60325a = i11;
        byte[] bArr = new byte[i12 + 3];
        this.f60328d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i11, int i12) {
        if (this.f60326b) {
            int i13 = i12 - i11;
            byte[] bArr2 = this.f60328d;
            int length = bArr2.length;
            int i14 = this.f60329e;
            if (length < i14 + i13) {
                this.f60328d = Arrays.copyOf(bArr2, (i14 + i13) * 2);
            }
            System.arraycopy(bArr, i11, this.f60328d, this.f60329e, i13);
            this.f60329e += i13;
        }
    }

    public boolean b(int i11) {
        if (!this.f60326b) {
            return false;
        }
        this.f60329e -= i11;
        this.f60326b = false;
        this.f60327c = true;
        return true;
    }

    public boolean c() {
        return this.f60327c;
    }

    public void d() {
        this.f60326b = false;
        this.f60327c = false;
    }

    public void e(int i11) {
        s7.a.h(!this.f60326b);
        boolean z11 = i11 == this.f60325a;
        this.f60326b = z11;
        if (z11) {
            this.f60329e = 3;
            this.f60327c = false;
        }
    }
}
