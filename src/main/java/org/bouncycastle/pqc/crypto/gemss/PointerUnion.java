package org.bouncycastle.pqc.crypto.gemss;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
class PointerUnion extends Pointer {
    protected int remainder;

    public PointerUnion(int i11) {
        super((i11 >>> 3) + ((i11 & 7) != 0 ? 1 : 0));
        this.remainder = 0;
    }

    public void changeIndex(PointerUnion pointerUnion) {
        this.array = pointerUnion.array;
        this.f99075cp = pointerUnion.f99075cp;
        this.remainder = pointerUnion.remainder;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void fill(int i11, byte[] bArr, int i12, int i13) {
        int i14 = this.remainder;
        if (i14 != 0) {
            int i15 = this.f99075cp + i11;
            long[] jArr = this.array;
            jArr[i15] = jArr[i15] & (~((-1) << (i14 << 3)));
            int i16 = 0;
            while (i14 < 8 && i16 < i13) {
                long[] jArr2 = this.array;
                jArr2[i15] = jArr2[i15] | ((((long) bArr[i12]) & 255) << (i14 << 3));
                i12++;
                i16++;
                i14++;
            }
            i11++;
            i13 -= 8 - this.remainder;
        }
        super.fill(i11, bArr, i12, i13);
    }

    public void fillBytes(int i11, byte[] bArr, int i12, int i13) {
        int i14 = i11 + this.remainder;
        int i15 = this.f99075cp + (i14 >>> 3);
        int i16 = i14 & 7;
        if (i16 != 0) {
            long[] jArr = this.array;
            jArr[i15] = jArr[i15] & (~((-1) << (i16 << 3)));
            int i17 = 0;
            while (i16 < 8 && i17 < i13) {
                long[] jArr2 = this.array;
                jArr2[i15] = jArr2[i15] | ((((long) bArr[i12]) & 255) << (i16 << 3));
                i12++;
                i17++;
                i16++;
            }
            i15++;
            i13 -= i17;
        }
        super.fill(i15 - this.f99075cp, bArr, i12, i13);
    }

    public void fillRandomBytes(int i11, SecureRandom secureRandom, int i12) {
        byte[] bArr = new byte[i12];
        secureRandom.nextBytes(bArr);
        fillBytes(i11, bArr, 0, i12);
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public long get() {
        int i11 = this.remainder;
        if (i11 == 0) {
            return this.array[this.f99075cp];
        }
        long[] jArr = this.array;
        int i12 = this.f99075cp;
        return (jArr[i12 + 1] << ((8 - i11) << 3)) | (jArr[i12] >>> (i11 << 3));
    }

    public byte getByte() {
        return (byte) (this.array[this.f99075cp] >>> (this.remainder << 3));
    }

    public long getWithCheck() {
        int i11 = this.f99075cp;
        long[] jArr = this.array;
        if (i11 >= jArr.length) {
            return 0L;
        }
        int i12 = this.remainder;
        if (i12 == 0) {
            return jArr[i11];
        }
        if (i11 == jArr.length - 1) {
            return jArr[i11] >>> (i12 << 3);
        }
        return (jArr[i11 + 1] << ((8 - i12) << 3)) | (jArr[i11] >>> (i12 << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void indexReset() {
        this.f99075cp = 0;
        this.remainder = 0;
    }

    public void moveNextByte() {
        int i11 = this.remainder + 1;
        this.f99075cp += i11 >>> 3;
        this.remainder = i11 & 7;
    }

    public void moveNextBytes(int i11) {
        int i12 = this.remainder + i11;
        this.f99075cp += i12 >>> 3;
        this.remainder = i12 & 7;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void set(int i11, long j11) {
        int i12 = this.remainder;
        if (i12 == 0) {
            super.setXor(i11, j11);
            return;
        }
        int i13 = i12 << 3;
        int i14 = (8 - i12) << 3;
        long[] jArr = this.array;
        int i15 = this.f99075cp;
        jArr[i15 + i11] = (j11 << i13) | (jArr[i15 + i11] & ((-1) >>> i14));
        jArr[i15 + i11 + 1] = (((-1) << i13) & jArr[i15 + i11 + 1]) | (j11 >>> i14);
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setAnd(int i11, long j11) {
        int i12 = this.remainder;
        if (i12 == 0) {
            super.setAnd(i11, j11);
            return;
        }
        int i13 = i12 << 3;
        int i14 = (8 - i12) << 3;
        long[] jArr = this.array;
        int i15 = this.f99075cp;
        int i16 = i15 + i11;
        jArr[i16] = jArr[i16] & ((j11 << i13) | ((-1) >>> i14));
        int i17 = i15 + i11 + 1;
        jArr[i17] = (((-1) << i13) | (j11 >>> i14)) & jArr[i17];
    }

    public void setAndByte(int i11, long j11) {
        int i12 = i11 + this.remainder + (this.f99075cp << 3);
        int i13 = i12 >>> 3;
        long[] jArr = this.array;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (((j11 & 255) << i14) | (~(255 << i14))) & jArr[i13];
    }

    public void setAndThenXorByte(int i11, long j11, long j12) {
        int i12 = i11 + this.remainder + (this.f99075cp << 3);
        int i13 = i12 >>> 3;
        long[] jArr = this.array;
        int i14 = (i12 & 7) << 3;
        long j13 = (((j11 & 255) << i14) | (~(255 << i14))) & jArr[i13];
        jArr[i13] = j13;
        jArr[i13] = j13 ^ ((j12 & 255) << i14);
    }

    public void setByte(int i11) {
        long[] jArr = this.array;
        int i12 = this.f99075cp;
        long j11 = ((long) i11) & 255;
        int i13 = this.remainder;
        jArr[i12] = (j11 << (i13 << 3)) | (jArr[i12] & ((-1) >>> ((8 - i13) << 3)));
    }

    public void setByteIndex(int i11) {
        this.remainder = i11 & 7;
        this.f99075cp = i11 >>> 3;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setRangeClear(int i11, int i12) {
        int i13 = this.remainder;
        if (i13 == 0) {
            super.setRangeClear(i11, i12);
            return;
        }
        long[] jArr = this.array;
        int i14 = this.f99075cp + i11;
        jArr[i14] = jArr[i14] & ((-1) >>> ((8 - i13) << 3));
        super.setRangeClear(i11 + 1, i12);
        long[] jArr2 = this.array;
        int i15 = this.f99075cp + i12 + 1;
        jArr2[i15] = jArr2[i15] & ((-1) << (this.remainder << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setXor(int i11, long j11) {
        int i12 = this.remainder;
        if (i12 == 0) {
            super.setXor(i11, j11);
            return;
        }
        long[] jArr = this.array;
        int i13 = this.f99075cp;
        int i14 = i13 + i11;
        jArr[i14] = jArr[i14] ^ (j11 << (i12 << 3));
        int i15 = i13 + i11 + 1;
        jArr[i15] = (j11 >>> ((8 - i12) << 3)) ^ jArr[i15];
    }

    public void setXorByte(int i11) {
        long[] jArr = this.array;
        int i12 = this.f99075cp;
        jArr[i12] = jArr[i12] ^ ((((long) i11) & 255) << (this.remainder << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setXorRangeAndMask(Pointer pointer, int i11, long j11) {
        int i12 = this.remainder;
        if (i12 == 0) {
            super.setXorRangeAndMask(pointer, i11, j11);
            return;
        }
        int i13 = this.f99075cp;
        int i14 = pointer.f99075cp;
        int i15 = i12 << 3;
        int i16 = (8 - i12) << 3;
        int i17 = 0;
        while (i17 < i11) {
            int i18 = i14 + 1;
            long j12 = pointer.array[i14] & j11;
            long[] jArr = this.array;
            jArr[i13] = jArr[i13] ^ (j12 << i15);
            i13++;
            jArr[i13] = (j12 >>> i16) ^ jArr[i13];
            i17++;
            i14 = i18;
        }
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public byte[] toBytes(int i11) {
        byte[] bArr = new byte[i11];
        int i12 = this.remainder;
        while (true) {
            int i13 = this.remainder;
            if (i12 >= i11 + i13) {
                return bArr;
            }
            bArr[i12 - i13] = (byte) (this.array[this.f99075cp + (i12 >>> 3)] >>> ((i12 & 7) << 3));
            i12++;
        }
    }

    public int toBytesMove(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i11 + 1;
            long[] jArr = this.array;
            int i15 = this.f99075cp;
            long j11 = jArr[i15];
            int i16 = this.remainder;
            int i17 = i16 + 1;
            this.remainder = i17;
            bArr[i11] = (byte) (j11 >>> (i16 << 3));
            if (i17 == 8) {
                this.remainder = 0;
                this.f99075cp = i15 + 1;
            }
            i13++;
            i11 = i14;
        }
        return i11;
    }

    public PointerUnion(Pointer pointer) {
        super(pointer);
        this.remainder = 0;
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public long get(int i11) {
        int i12 = this.remainder;
        if (i12 == 0) {
            return this.array[this.f99075cp + i11];
        }
        long[] jArr = this.array;
        int i13 = this.f99075cp;
        return (jArr[(i13 + i11) + 1] << ((8 - i12) << 3)) | (jArr[i13 + i11] >>> (i12 << 3));
    }

    public byte getByte(int i11) {
        int i12 = this.f99075cp;
        int i13 = this.remainder;
        return (byte) (this.array[i12 + ((i11 + i13) >>> 3)] >>> (((i13 + i11) & 7) << 3));
    }

    public long getWithCheck(int i11) {
        int i12 = i11 + this.f99075cp;
        long[] jArr = this.array;
        if (i12 >= jArr.length) {
            return 0L;
        }
        int i13 = this.remainder;
        if (i13 == 0) {
            return jArr[i12];
        }
        if (i12 == jArr.length - 1) {
            return jArr[i12] >>> (i13 << 3);
        }
        return (jArr[i12 + 1] << ((8 - i13) << 3)) | (jArr[i12] >>> (i13 << 3));
    }

    @Override // org.bouncycastle.pqc.crypto.gemss.Pointer
    public void setXor(long j11) {
        int i11 = this.remainder;
        if (i11 == 0) {
            super.setXor(j11);
            return;
        }
        long[] jArr = this.array;
        int i12 = this.f99075cp;
        jArr[i12] = jArr[i12] ^ (j11 << (i11 << 3));
        int i13 = i12 + 1;
        jArr[i13] = (j11 >>> ((8 - i11) << 3)) ^ jArr[i13];
    }

    public PointerUnion(PointerUnion pointerUnion) {
        super(pointerUnion);
        this.remainder = pointerUnion.remainder;
    }

    public PointerUnion(byte[] bArr) {
        super((bArr.length >> 3) + ((bArr.length & 7) != 0 ? 1 : 0));
        int i11 = 0;
        for (int i12 = 0; i11 < bArr.length && i12 < this.array.length; i12++) {
            int i13 = 0;
            while (i13 < 8 && i11 < bArr.length) {
                long[] jArr = this.array;
                jArr[i12] = jArr[i12] | ((((long) bArr[i11]) & 255) << (i13 << 3));
                i13++;
                i11++;
            }
        }
        this.remainder = 0;
    }
}
