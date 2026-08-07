package org.bouncycastle.pqc.crypto.falcon;

/* JADX INFO: loaded from: classes10.dex */
class FalconRNG {

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    byte[] f99060bd = new byte[512];
    long bdummy_u64 = 0;
    int ptr = 0;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    byte[] f99061sd = new byte[256];
    long sdummy_u64 = 0;
    int type = 0;
    FalconConversions convertor = new FalconConversions();

    FalconRNG() {
    }

    private void QROUND(int i11, int i12, int i13, int i14, int[] iArr) {
        int i15 = iArr[i11] + iArr[i12];
        iArr[i11] = i15;
        int i16 = i15 ^ iArr[i14];
        iArr[i14] = i16;
        int i17 = (i16 >>> 16) | (i16 << 16);
        iArr[i14] = i17;
        int i18 = iArr[i13] + i17;
        iArr[i13] = i18;
        int i19 = iArr[i12] ^ i18;
        iArr[i12] = i19;
        int i21 = (i19 >>> 20) | (i19 << 12);
        iArr[i12] = i21;
        int i22 = iArr[i11] + i21;
        iArr[i11] = i22;
        int i23 = iArr[i14] ^ i22;
        iArr[i14] = i23;
        int i24 = (i23 >>> 24) | (i23 << 8);
        iArr[i14] = i24;
        int i25 = iArr[i13] + i24;
        iArr[i13] = i25;
        int i26 = iArr[i12] ^ i25;
        iArr[i12] = i26;
        iArr[i12] = (i26 >>> 25) | (i26 << 7);
    }

    void prng_get_bytes(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            byte[] bArr2 = this.f99060bd;
            int length = bArr2.length - this.ptr;
            if (length > i12) {
                length = i12;
            }
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
            i12 -= length;
            int i13 = this.ptr + length;
            this.ptr = i13;
            if (i13 == this.f99060bd.length) {
                prng_refill();
            }
        }
    }

    long prng_get_u64() {
        int i11 = this.ptr;
        if (i11 >= this.f99060bd.length - 9) {
            prng_refill();
            i11 = 0;
        }
        this.ptr = i11 + 8;
        byte[] bArr = this.f99060bd;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    byte prng_get_u8() {
        byte[] bArr = this.f99060bd;
        int i11 = this.ptr;
        int i12 = i11 + 1;
        this.ptr = i12;
        byte b11 = bArr[i11];
        if (i12 == bArr.length) {
            prng_refill();
        }
        return b11;
    }

    void prng_init(SHAKE256 shake256) {
        byte[] bArr = new byte[56];
        shake256.inner_shake256_extract(bArr, 0, 56);
        for (int i11 = 0; i11 < 14; i11++) {
            int i12 = i11 << 2;
            System.arraycopy(this.convertor.int_to_bytes(((bArr[i12 + 1] & 255) << 8) | (bArr[i12] & 255) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24)), 0, this.f99061sd, i12, 4);
        }
        System.arraycopy(this.convertor.long_to_bytes((((long) this.convertor.bytes_to_int(this.f99061sd, 48)) & 4294967295L) + ((4294967295L & ((long) this.convertor.bytes_to_int(this.f99061sd, 52))) << 32)), 0, this.f99061sd, 48, 8);
        prng_refill();
    }

    void prng_refill() {
        FalconRNG falconRNG = this;
        int[] iArr = {1634760805, 857760878, 2036477234, 1797285236};
        long jBytes_to_long = falconRNG.convertor.bytes_to_long(falconRNG.f99061sd, 48);
        for (int i11 = 0; i11 < 8; i11++) {
            int[] iArr2 = new int[16];
            System.arraycopy(iArr, 0, iArr2, 0, 4);
            System.arraycopy(falconRNG.convertor.bytes_to_int_array(falconRNG.f99061sd, 0, 12), 0, iArr2, 4, 12);
            int i12 = (int) jBytes_to_long;
            iArr2[14] = iArr2[14] ^ i12;
            int i13 = (int) (jBytes_to_long >>> 32);
            iArr2[15] = iArr2[15] ^ i13;
            int i14 = 0;
            while (i14 < 10) {
                falconRNG.QROUND(0, 4, 8, 12, iArr2);
                falconRNG = this;
                falconRNG.QROUND(1, 5, 9, 13, iArr2);
                falconRNG.QROUND(2, 6, 10, 14, iArr2);
                falconRNG.QROUND(3, 7, 11, 15, iArr2);
                falconRNG.QROUND(0, 5, 10, 15, iArr2);
                falconRNG.QROUND(1, 6, 11, 12, iArr2);
                falconRNG.QROUND(2, 7, 8, 13, iArr2);
                falconRNG.QROUND(3, 4, 9, 14, iArr2);
                i14++;
                i13 = i13;
            }
            int i15 = i13;
            for (int i16 = 0; i16 < 4; i16++) {
                iArr2[i16] = iArr2[i16] + iArr[i16];
            }
            for (int i17 = 4; i17 < 14; i17++) {
                iArr2[i17] = iArr2[i17] + falconRNG.convertor.bytes_to_int(falconRNG.f99061sd, (i17 * 4) - 16);
            }
            iArr2[14] = iArr2[14] + (falconRNG.convertor.bytes_to_int(falconRNG.f99061sd, 40) ^ i12);
            iArr2[15] = iArr2[15] + (falconRNG.convertor.bytes_to_int(falconRNG.f99061sd, 44) ^ i15);
            jBytes_to_long++;
            for (int i18 = 0; i18 < 16; i18++) {
                byte[] bArr = falconRNG.f99060bd;
                int i19 = (i11 << 2) + (i18 << 5);
                int i21 = iArr2[i18];
                bArr[i19] = (byte) i21;
                bArr[i19 + 1] = (byte) (i21 >>> 8);
                bArr[i19 + 2] = (byte) (i21 >>> 16);
                bArr[i19 + 3] = (byte) (i21 >>> 24);
            }
        }
        System.arraycopy(falconRNG.convertor.long_to_bytes(jBytes_to_long), 0, falconRNG.f99061sd, 48, 8);
        falconRNG.ptr = 0;
    }
}
