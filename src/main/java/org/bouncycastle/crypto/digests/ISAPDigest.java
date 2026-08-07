package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class ISAPDigest implements Digest {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long f98616t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private long f98617t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private long f98618t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private long f98619t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private long f98620t4;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long f98621x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f98622x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f98623x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private long f98624x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private long f98625x4;

    private void P12() {
        ROUND(240L);
        ROUND(225L);
        ROUND(210L);
        ROUND(195L);
        ROUND(180L);
        ROUND(165L);
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long ROTR(long j11, long j12) {
        return (j11 << ((int) (64 - j12))) | (j11 >>> ((int) j12));
    }

    private void ROUND(long j11) {
        long j12 = this.f98621x0;
        long j13 = this.f98622x1;
        long j14 = this.f98623x2;
        long j15 = this.f98624x3;
        long j16 = this.f98625x4;
        long j17 = ((((j12 ^ j13) ^ j14) ^ j15) ^ j11) ^ ((((j12 ^ j14) ^ j16) ^ j11) & j13);
        this.f98616t0 = j17;
        this.f98617t1 = ((((j12 ^ j14) ^ j15) ^ j16) ^ j11) ^ (((j13 ^ j14) ^ j11) & (j13 ^ j15));
        this.f98618t2 = (((j13 ^ j14) ^ j16) ^ j11) ^ (j15 & j16);
        this.f98619t3 = ((j14 ^ (j12 ^ j13)) ^ j11) ^ ((~j12) & (j15 ^ j16));
        this.f98620t4 = ((j12 ^ j16) & j13) ^ ((j13 ^ j15) ^ j16);
        this.f98621x0 = (ROTR(j17, 19L) ^ j17) ^ ROTR(this.f98616t0, 28L);
        long j18 = this.f98617t1;
        this.f98622x1 = (j18 ^ ROTR(j18, 39L)) ^ ROTR(this.f98617t1, 61L);
        long j19 = this.f98618t2;
        this.f98623x2 = ~((j19 ^ ROTR(j19, 1L)) ^ ROTR(this.f98618t2, 6L));
        long j21 = this.f98619t3;
        this.f98624x3 = (j21 ^ ROTR(j21, 10L)) ^ ROTR(this.f98619t3, 17L);
        long j22 = this.f98620t4;
        this.f98625x4 = (j22 ^ ROTR(j22, 7L)) ^ ROTR(this.f98620t4, 41L);
    }

    protected long U64BIG(long j11) {
        return (ROTR(j11, 56L) & 1095216660735L) | (ROTR(j11, 8L) & (-72057589759737856L)) | (ROTR(j11, 24L) & 71776119077928960L) | (ROTR(j11, 40L) & 280375465148160L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        if (i11 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        this.f98620t4 = 0L;
        this.f98619t3 = 0L;
        this.f98618t2 = 0L;
        this.f98617t1 = 0L;
        this.f98616t0 = 0L;
        this.f98621x0 = -1255492011513352131L;
        this.f98622x1 = -8380609354527731710L;
        this.f98623x2 = -5437372128236807582L;
        this.f98624x3 = 4834782570098516968L;
        this.f98625x4 = 3787428097924915520L;
        byte[] byteArray = this.buffer.toByteArray();
        int length = byteArray.length;
        int i12 = length >> 3;
        long[] jArr = new long[i12];
        int i13 = 0;
        Pack.littleEndianToLong(byteArray, 0, jArr, 0, i12);
        int i14 = 0;
        while (length >= 8) {
            this.f98621x0 ^= U64BIG(jArr[i14]);
            P12();
            length -= 8;
            i14++;
        }
        long j11 = this.f98621x0;
        int i15 = (7 - length) << 3;
        long j12 = 128;
        while (true) {
            this.f98621x0 = j11 ^ (j12 << i15);
            if (length <= 0) {
                break;
            }
            j11 = this.f98621x0;
            length--;
            j12 = ((long) byteArray[(i14 << 3) + length]) & 255;
            i15 = (7 - length) << 3;
        }
        P12();
        long[] jArr2 = new long[4];
        while (true) {
            long jU64BIG = U64BIG(this.f98621x0);
            if (i13 >= 3) {
                jArr2[i13] = jU64BIG;
                Pack.longToLittleEndian(jArr2, bArr, i11);
                this.buffer.reset();
                return 32;
            }
            jArr2[i13] = jU64BIG;
            P12();
            i13++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "ISAP Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.buffer.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b11) {
        this.buffer.write(b11);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.buffer.write(bArr, i11, i12);
    }
}
