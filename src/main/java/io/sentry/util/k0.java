package io.sentry.util;

import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 {
    public static long a() {
        byte[] bArr = new byte[8];
        d0.a().b(bArr);
        byte b11 = (byte) (bArr[6] & 15);
        bArr[6] = b11;
        bArr[6] = (byte) (b11 | 64);
        long j11 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j11 = (j11 << 8) | ((long) (bArr[i11] & 255));
        }
        return j11;
    }

    public static UUID b() {
        byte[] bArr = new byte[16];
        d0.a().b(bArr);
        byte b11 = (byte) (bArr[6] & 15);
        bArr[6] = b11;
        bArr[6] = (byte) (b11 | 64);
        byte b12 = (byte) (bArr[8] & 63);
        bArr[8] = b12;
        bArr[8] = (byte) (b12 | 128);
        long j11 = 0;
        long j12 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j12 = (j12 << 8) | ((long) (bArr[i11] & 255));
        }
        for (int i12 = 8; i12 < 16; i12++) {
            j11 = (j11 << 8) | ((long) (bArr[i12] & 255));
        }
        return new UUID(j12, j11);
    }
}
