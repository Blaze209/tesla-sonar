package org.bouncycastle.crypto.util;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes9.dex */
class SSHBuffer {
    private final byte[] buffer;
    private int pos = 0;

    public SSHBuffer(byte[] bArr) {
        this.buffer = bArr;
    }

    public byte[] getBuffer() {
        return Arrays.clone(this.buffer);
    }

    public boolean hasRemaining() {
        return this.pos < this.buffer.length;
    }

    public BigInteger readBigNumPositive() {
        int u32 = readU32();
        int i11 = this.pos;
        int i12 = i11 + u32;
        byte[] bArr = this.buffer;
        if (i12 > bArr.length) {
            throw new IllegalArgumentException("not enough data for big num");
        }
        int i13 = u32 + i11;
        this.pos = i13;
        return new BigInteger(1, Arrays.copyOfRange(bArr, i11, i13));
    }

    public byte[] readBlock() {
        int u32 = readU32();
        if (u32 == 0) {
            return new byte[0];
        }
        int i11 = this.pos;
        byte[] bArr = this.buffer;
        if (i11 > bArr.length - u32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        int i12 = u32 + i11;
        this.pos = i12;
        return Arrays.copyOfRange(bArr, i11, i12);
    }

    public byte[] readPaddedBlock() {
        return readPaddedBlock(8);
    }

    public String readString() {
        return Strings.fromByteArray(readBlock());
    }

    public int readU32() {
        int i11 = this.pos;
        byte[] bArr = this.buffer;
        if (i11 > bArr.length - 4) {
            throw new IllegalArgumentException("4 bytes for U32 exceeds buffer.");
        }
        int i12 = i11 + 1;
        this.pos = i12;
        int i13 = (bArr[i11] & 255) << 24;
        int i14 = i11 + 2;
        this.pos = i14;
        int i15 = ((bArr[i12] & 255) << 16) | i13;
        int i16 = i11 + 3;
        this.pos = i16;
        int i17 = i15 | ((bArr[i14] & 255) << 8);
        this.pos = i11 + 4;
        return (bArr[i16] & 255) | i17;
    }

    public void skipBlock() {
        int u32 = readU32();
        int i11 = this.pos;
        if (i11 > this.buffer.length - u32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        this.pos = i11 + u32;
    }

    public SSHBuffer(byte[] bArr, byte[] bArr2) {
        this.buffer = bArr2;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                throw new IllegalArgumentException("magic-number incorrect");
            }
        }
        this.pos += bArr.length;
    }

    public byte[] readPaddedBlock(int i11) {
        int i12;
        int u32 = readU32();
        if (u32 == 0) {
            return new byte[0];
        }
        int i13 = this.pos;
        byte[] bArr = this.buffer;
        if (i13 > bArr.length - u32) {
            throw new IllegalArgumentException("not enough data for block");
        }
        if (u32 % i11 != 0) {
            throw new IllegalArgumentException("missing padding");
        }
        int i14 = i13 + u32;
        this.pos = i14;
        if (u32 > 0 && (i12 = bArr[i14 - 1] & 255) > 0 && i12 < i11) {
            i14 -= i12;
            int i15 = 1;
            int i16 = i14;
            while (i15 <= i12) {
                if (i15 != (this.buffer[i16] & 255)) {
                    throw new IllegalArgumentException("incorrect padding");
                }
                i15++;
                i16++;
            }
        }
        return Arrays.copyOfRange(this.buffer, i13, i14);
    }
}
