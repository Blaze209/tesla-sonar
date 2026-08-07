package o9;

import s7.c0;
import w8.q;

/* JADX INFO: loaded from: classes3.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f96962a = new c0(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f96963b;

    private long a(q qVar) {
        int i11 = 0;
        qVar.e(this.f96962a.f(), 0, 1);
        int i12 = this.f96962a.f()[0] & 255;
        if (i12 == 0) {
            return Long.MIN_VALUE;
        }
        int i13 = 128;
        int i14 = 0;
        while ((i12 & i13) == 0) {
            i13 >>= 1;
            i14++;
        }
        int i15 = i12 & (~i13);
        qVar.e(this.f96962a.f(), 1, i14);
        while (i11 < i14) {
            i11++;
            i15 = (this.f96962a.f()[i11] & 255) + (i15 << 8);
        }
        this.f96963b += i14 + 1;
        return i15;
    }

    public boolean b(q qVar) {
        long length = qVar.getLength();
        long j11 = 1024;
        if (length != -1 && length <= 1024) {
            j11 = length;
        }
        int i11 = (int) j11;
        qVar.e(this.f96962a.f(), 0, 4);
        long jO = this.f96962a.O();
        this.f96963b = 4;
        while (jO != 440786851) {
            int i12 = this.f96963b + 1;
            this.f96963b = i12;
            if (i12 == i11) {
                return false;
            }
            qVar.e(this.f96962a.f(), 0, 1);
            jO = ((jO << 8) & (-256)) | ((long) (this.f96962a.f()[0] & 255));
        }
        long jA = a(qVar);
        long j12 = this.f96963b;
        if (jA != Long.MIN_VALUE && (length == -1 || j12 + jA < length)) {
            while (true) {
                int i13 = this.f96963b;
                long j13 = j12 + jA;
                if (i13 < j13) {
                    if (a(qVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jA2 = a(qVar);
                    if (jA2 < 0 || jA2 > 2147483647L) {
                        return false;
                    }
                    if (jA2 != 0) {
                        int i14 = (int) jA2;
                        qVar.i(i14);
                        this.f96963b += i14;
                    }
                } else if (i13 == j13) {
                    return true;
                }
            }
        }
        return false;
    }
}
