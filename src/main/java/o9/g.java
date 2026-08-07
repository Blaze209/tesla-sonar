package o9;

import w8.q;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f96964d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f96965a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f96966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96967c;

    public static long a(byte[] bArr, int i11, boolean z11) {
        long j11 = ((long) bArr[0]) & 255;
        if (z11) {
            j11 &= ~f96964d[i11 - 1];
        }
        for (int i12 = 1; i12 < i11; i12++) {
            j11 = (j11 << 8) | (((long) bArr[i12]) & 255);
        }
        return j11;
    }

    public static int c(int i11) {
        int i12 = 0;
        while (true) {
            long[] jArr = f96964d;
            if (i12 >= jArr.length) {
                return -1;
            }
            if ((jArr[i12] & ((long) i11)) != 0) {
                return i12 + 1;
            }
            i12++;
        }
    }

    public int b() {
        return this.f96967c;
    }

    public long d(q qVar, boolean z11, boolean z12, int i11) {
        if (this.f96966b == 0) {
            if (!qVar.c(this.f96965a, 0, 1, z11)) {
                return -1L;
            }
            int iC = c(this.f96965a[0] & 255);
            this.f96967c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f96966b = 1;
        }
        int i12 = this.f96967c;
        if (i12 > i11) {
            this.f96966b = 0;
            return -2L;
        }
        if (i12 != 1) {
            qVar.readFully(this.f96965a, 1, i12 - 1);
        }
        this.f96966b = 0;
        return a(this.f96965a, this.f96967c, z12);
    }

    public void e() {
        this.f96966b = 0;
        this.f96967c = 0;
    }
}
