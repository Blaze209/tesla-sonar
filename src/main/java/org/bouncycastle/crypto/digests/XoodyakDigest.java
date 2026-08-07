package org.bouncycastle.crypto.digests;

import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class XoodyakDigest implements Digest {
    private int Rabsorb;
    private MODE mode;
    private int phase;
    private final int f_bPrime = 48;
    private final int Rhash = 16;
    private final int PhaseDown = 1;
    private final int PhaseUp = 2;
    private final int NLANES = 12;
    private final int NROWS = 3;
    private final int NCOLUMS = 4;
    private final int MAXROUNDS = 12;
    private final int TAGLEN = 16;
    private final int[] RC = {88, 56, 960, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, 20, 96, 44, 896, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 416, 18};
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private byte[] state = new byte[48];

    enum MODE {
        ModeHash,
        ModeKeyed
    }

    public XoodyakDigest() {
        reset();
    }

    private int ROTL32(int i11, int i12) {
        return (i11 >>> ((32 - i12) & 31)) ^ (i11 << (i12 & 31));
    }

    private void Up(byte[] bArr, int i11, int i12, int i13) {
        int i14;
        if (this.mode != MODE.ModeHash) {
            byte[] bArr2 = this.state;
            bArr2[47] = (byte) (bArr2[47] ^ i13);
        }
        int i15 = 12;
        int[] iArr = new int[12];
        Pack.littleEndianToInt(this.state, 0, iArr, 0, 12);
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[4];
        int[] iArr4 = new int[4];
        for (int i16 = 0; i16 < i15; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                iArr3[i17] = (iArr[index(i17, 1)] ^ iArr[index(i17, 0)]) ^ iArr[index(i17, 2)];
            }
            int i18 = 0;
            while (true) {
                i14 = 3;
                if (i18 >= 4) {
                    break;
                }
                int i19 = iArr3[3 & (i18 + 3)];
                iArr4[i18] = ROTL32(i19, 14) ^ ROTL32(i19, 5);
                i18++;
            }
            for (int i21 = 0; i21 < 4; i21++) {
                for (int i22 = 0; i22 < 3; i22++) {
                    int iIndex = index(i21, i22);
                    iArr[iIndex] = iArr[iIndex] ^ iArr4[i21];
                }
            }
            for (int i23 = 0; i23 < 4; i23++) {
                iArr2[index(i23, 0)] = iArr[index(i23, 0)];
                iArr2[index(i23, 1)] = iArr[index(i23 + 3, 1)];
                iArr2[index(i23, 2)] = ROTL32(iArr[index(i23, 2)], 11);
            }
            iArr2[0] = iArr2[0] ^ this.RC[i16];
            int i24 = 0;
            while (i24 < 4) {
                int i25 = 0;
                while (i25 < i14) {
                    int i26 = i25 + 1;
                    iArr[index(i24, i25)] = ((~iArr2[index(i24, i26)]) & iArr2[index(i24, i25 + 2)]) ^ iArr2[index(i24, i25)];
                    i25 = i26;
                    i14 = 3;
                }
                i24++;
                i14 = 3;
            }
            for (int i27 = 0; i27 < 4; i27++) {
                iArr2[index(i27, 0)] = iArr[index(i27, 0)];
                iArr2[index(i27, 1)] = ROTL32(iArr[index(i27, 1)], 1);
                iArr2[index(i27, 2)] = ROTL32(iArr[index(i27 + 2, 2)], 8);
            }
            i15 = 12;
            System.arraycopy(iArr2, 0, iArr, 0, 12);
        }
        Pack.intToLittleEndian(iArr, 0, i15, this.state, 0);
        this.phase = 2;
        if (bArr != null) {
            System.arraycopy(this.state, 0, bArr, i11, i12);
        }
    }

    private int index(int i11, int i12) {
        return ((i12 % 3) * 4) + (i11 % 4);
    }

    void Down(byte[] bArr, int i11, int i12, int i13) {
        int i14 = 0;
        while (i14 < i12) {
            byte[] bArr2 = this.state;
            bArr2[i14] = (byte) (bArr[i11] ^ bArr2[i14]);
            i14++;
            i11++;
        }
        byte[] bArr3 = this.state;
        bArr3[i12] = (byte) (bArr3[i12] ^ 1);
        byte b11 = bArr3[47];
        if (this.mode == MODE.ModeHash) {
            i13 &= 1;
        }
        bArr3[47] = (byte) (b11 ^ i13);
        this.phase = 1;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        if (i11 + 32 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.buffer.toByteArray();
        int size = this.buffer.size();
        int i12 = 3;
        int i13 = 0;
        while (true) {
            if (this.phase != 2) {
                Up(null, 0, 0, 0);
            }
            int iMin = Math.min(size, this.Rabsorb);
            Down(byteArray, i13, iMin, i12);
            i13 += iMin;
            size -= iMin;
            if (size == 0) {
                Up(bArr, i11, 16, 64);
                Down(null, 0, 0, 0);
                Up(bArr, i11 + 16, 16, 0);
                return 32;
            }
            i12 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Xoodyak Hash";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        Arrays.fill(this.state, (byte) 0);
        this.phase = 2;
        this.mode = MODE.ModeHash;
        this.Rabsorb = 16;
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
