package org.bouncycastle.crypto.digests;

import com.plaid.internal.EnumC4419g;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class KeccakDigest implements ExtendedDigest {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected final CryptoServicePurpose purpose;
    protected int rate;
    protected boolean squeezing;
    protected long[] state;

    public KeccakDigest() {
        this(EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, CryptoServicePurpose.ANY);
    }

    private void KeccakAbsorb(byte[] bArr, int i11) {
        int i12 = this.rate >>> 6;
        for (int i13 = 0; i13 < i12; i13++) {
            long[] jArr = this.state;
            jArr[i13] = jArr[i13] ^ Pack.littleEndianToLong(bArr, i11);
            i11 += 8;
        }
        KeccakPermutation();
    }

    private void KeccakExtract() {
        KeccakPermutation();
        Pack.longToLittleEndian(this.state, 0, this.rate >>> 6, this.dataQueue, 0);
        this.bitsInQueue = this.rate;
    }

    private void KeccakPermutation() {
        long[] jArr = this.state;
        long j11 = jArr[0];
        long j12 = jArr[1];
        char c11 = 2;
        long j13 = jArr[2];
        char c12 = 3;
        long j14 = jArr[3];
        char c13 = 4;
        long j15 = jArr[4];
        long j16 = jArr[5];
        long j17 = jArr[6];
        long j18 = jArr[7];
        long j19 = jArr[8];
        long j21 = jArr[9];
        long j22 = jArr[10];
        long j23 = jArr[11];
        long j24 = jArr[12];
        long j25 = jArr[13];
        long j26 = jArr[14];
        long j27 = jArr[15];
        long j28 = jArr[16];
        long j29 = jArr[17];
        long j31 = jArr[18];
        long j32 = jArr[19];
        long j33 = jArr[20];
        long j34 = jArr[21];
        long j35 = jArr[22];
        long j36 = jArr[23];
        int i11 = 24;
        long j37 = jArr[24];
        int i12 = 0;
        while (i12 < i11) {
            long j38 = (((j11 ^ j16) ^ j22) ^ j27) ^ j33;
            long j39 = (((j12 ^ j17) ^ j23) ^ j28) ^ j34;
            long j41 = (((j13 ^ j18) ^ j24) ^ j29) ^ j35;
            long j42 = (((j14 ^ j19) ^ j25) ^ j31) ^ j36;
            long j43 = (((j15 ^ j21) ^ j26) ^ j32) ^ j37;
            long j44 = ((j39 << 1) | (j39 >>> (-1))) ^ j43;
            long j45 = ((j41 << 1) | (j41 >>> (-1))) ^ j38;
            long j46 = ((j42 << 1) | (j42 >>> (-1))) ^ j39;
            long j47 = ((j43 << 1) | (j43 >>> (-1))) ^ j41;
            long j48 = ((j38 << 1) | (j38 >>> (-1))) ^ j42;
            long j49 = j11 ^ j44;
            long j51 = j16 ^ j44;
            long j52 = j22 ^ j44;
            long j53 = j27 ^ j44;
            long j54 = j33 ^ j44;
            long j55 = j12 ^ j45;
            long j56 = j17 ^ j45;
            long j57 = j23 ^ j45;
            long j58 = j28 ^ j45;
            long j59 = j34 ^ j45;
            long j61 = j13 ^ j46;
            long j62 = j18 ^ j46;
            long j63 = j24 ^ j46;
            long j64 = j29 ^ j46;
            long j65 = j35 ^ j46;
            long j66 = j14 ^ j47;
            long j67 = j19 ^ j47;
            long j68 = j25 ^ j47;
            long j69 = j31 ^ j47;
            long j71 = j36 ^ j47;
            long j72 = j15 ^ j48;
            long j73 = j21 ^ j48;
            long j74 = j26 ^ j48;
            long j75 = j32 ^ j48;
            long j76 = j37 ^ j48;
            long j77 = (j55 << 1) | (j55 >>> 63);
            char c14 = c11;
            long j78 = (j56 << 44) | (j56 >>> 20);
            char c15 = c12;
            long j79 = (j73 << 20) | (j73 >>> 44);
            char c16 = c13;
            long j81 = (j65 << 61) | (j65 >>> c15);
            int i13 = i11;
            long j82 = (j74 << 39) | (j74 >>> 25);
            long j83 = (j54 << 18) | (j54 >>> 46);
            int i14 = i12;
            long j84 = (j61 << 62) | (j61 >>> c14);
            long j85 = (j63 << 43) | (j63 >>> 21);
            long j86 = (j68 << 25) | (j68 >>> 39);
            long j87 = (j75 << 8) | (j75 >>> 56);
            long j88 = (j71 << 56) | (j71 >>> 8);
            long j89 = (j53 << 41) | (j53 >>> 23);
            long j91 = (j72 << 27) | (j72 >>> 37);
            long j92 = (j76 << 14) | (j76 >>> 50);
            long j93 = (j59 << c14) | (j59 >>> 62);
            long j94 = (j67 << 55) | (j67 >>> 9);
            long j95 = (j58 << 45) | (j58 >>> 19);
            long j96 = (j51 << 36) | (j51 >>> 28);
            long j97 = (j66 << 28) | (j66 >>> 36);
            long j98 = (j69 << 21) | (j69 >>> 43);
            long j99 = (j64 << 15) | (j64 >>> 49);
            long j100 = (j57 << 10) | (j57 >>> 54);
            long j101 = (j62 << 6) | (j62 >>> 58);
            long j102 = (j52 << c15) | (j52 >>> 61);
            long j103 = j49 ^ ((~j78) & j85);
            j12 = ((~j85) & j98) ^ j78;
            long j104 = j85 ^ ((~j98) & j92);
            long j105 = j98 ^ ((~j92) & j49);
            long j106 = j92 ^ ((~j49) & j78);
            long j107 = j97 ^ ((~j79) & j102);
            long j108 = ((~j102) & j95) ^ j79;
            long j109 = ((~j95) & j81) ^ j102;
            long j110 = j95 ^ ((~j81) & j97);
            long j111 = ((~j97) & j79) ^ j81;
            j22 = j77 ^ ((~j101) & j86);
            long j112 = ((~j86) & j87) ^ j101;
            long j113 = ((~j87) & j83) ^ j86;
            long j114 = j87 ^ ((~j83) & j77);
            j26 = j83 ^ ((~j77) & j101);
            long j115 = j91 ^ ((~j96) & j100);
            long j116 = j96 ^ ((~j100) & j99);
            long j117 = ((~j99) & j88) ^ j100;
            long j118 = j99 ^ ((~j88) & j91);
            long j119 = ((~j91) & j96) ^ j88;
            long j120 = j84 ^ ((~j94) & j82);
            long j121 = ((~j82) & j89) ^ j94;
            long j122 = j82 ^ ((~j89) & j93);
            j36 = j89 ^ ((~j93) & j84);
            j28 = j116;
            j18 = j109;
            j34 = j121;
            j33 = j120;
            j35 = j122;
            j21 = j111;
            j19 = j110;
            j29 = j117;
            j25 = j114;
            j32 = j119;
            j16 = j107;
            j24 = j113;
            j17 = j108;
            c13 = c16;
            c11 = c14;
            j37 = j93 ^ ((~j84) & j94);
            jArr = jArr;
            i12 = i14 + 1;
            j11 = j103 ^ KeccakRoundConstants[i14];
            j14 = j105;
            j15 = j106;
            j23 = j112;
            i11 = i13;
            j31 = j118;
            j27 = j115;
            c12 = c15;
            j13 = j104;
        }
        long[] jArr2 = jArr;
        jArr2[0] = j11;
        jArr2[1] = j12;
        jArr2[c11] = j13;
        jArr2[c12] = j14;
        jArr2[c13] = j15;
        jArr2[5] = j16;
        jArr2[6] = j17;
        jArr2[7] = j18;
        jArr2[8] = j19;
        jArr2[9] = j21;
        jArr2[10] = j22;
        jArr2[11] = j23;
        jArr2[12] = j24;
        jArr2[13] = j25;
        jArr2[14] = j26;
        jArr2[15] = j27;
        jArr2[16] = j28;
        jArr2[17] = j29;
        jArr2[18] = j31;
        jArr2[19] = j32;
        jArr2[20] = j33;
        jArr2[21] = j34;
        jArr2[22] = j35;
        jArr2[23] = j36;
        jArr2[i11] = j37;
    }

    private void init(int i11) {
        if (i11 != 128 && i11 != 224 && i11 != 256 && i11 != 288 && i11 != 384 && i11 != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        initSponge(1600 - (i11 << 1));
    }

    private void initSponge(int i11) {
        if (i11 <= 0 || i11 >= 1600 || i11 % 64 != 0) {
            throw new IllegalStateException("invalid rate value");
        }
        this.rate = i11;
        int i12 = 0;
        while (true) {
            long[] jArr = this.state;
            if (i12 >= jArr.length) {
                Arrays.fill(this.dataQueue, (byte) 0);
                this.bitsInQueue = 0;
                this.squeezing = false;
                this.fixedOutputLength = (1600 - i11) / 2;
                return;
            }
            jArr[i12] = 0;
            i12++;
        }
    }

    private void padAndSwitchToSqueezingPhase() {
        byte[] bArr = this.dataQueue;
        int i11 = this.bitsInQueue;
        int i12 = i11 >>> 3;
        bArr[i12] = (byte) (bArr[i12] | ((byte) (1 << (i11 & 7))));
        int i13 = i11 + 1;
        this.bitsInQueue = i13;
        if (i13 == this.rate) {
            KeccakAbsorb(bArr, 0);
        } else {
            int i14 = i13 >>> 6;
            int i15 = i13 & 63;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                long[] jArr = this.state;
                jArr[i17] = jArr[i17] ^ Pack.littleEndianToLong(this.dataQueue, i16);
                i16 += 8;
            }
            if (i15 > 0) {
                long[] jArr2 = this.state;
                jArr2[i14] = (((1 << i15) - 1) & Pack.littleEndianToLong(this.dataQueue, i16)) ^ jArr2[i14];
            }
        }
        long[] jArr3 = this.state;
        int i18 = (this.rate - 1) >>> 6;
        jArr3[i18] = jArr3[i18] ^ Long.MIN_VALUE;
        this.bitsInQueue = 0;
        this.squeezing = true;
    }

    protected void absorb(byte b11) {
        int i11 = this.bitsInQueue;
        if (i11 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        byte[] bArr = this.dataQueue;
        bArr[i11 >>> 3] = b11;
        int i12 = i11 + 8;
        this.bitsInQueue = i12;
        if (i12 == this.rate) {
            KeccakAbsorb(bArr, 0);
            this.bitsInQueue = 0;
        }
    }

    protected void absorbBits(int i11, int i12) {
        if (i12 < 1 || i12 > 7) {
            throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
        }
        int i13 = this.bitsInQueue;
        if (i13 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        this.dataQueue[i13 >>> 3] = (byte) (i11 & ((1 << i12) - 1));
        this.bitsInQueue = i13 + i12;
    }

    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, getDigestSize() * 8, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        squeeze(bArr, i11, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Keccak-" + this.fixedOutputLength;
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.rate / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.fixedOutputLength / 8;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        init(this.fixedOutputLength);
    }

    protected void squeeze(byte[] bArr, int i11, long j11) {
        if (!this.squeezing) {
            padAndSwitchToSqueezingPhase();
        }
        long j12 = 0;
        if (j11 % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        while (j12 < j11) {
            if (this.bitsInQueue == 0) {
                KeccakExtract();
            }
            int iMin = (int) Math.min(this.bitsInQueue, j11 - j12);
            System.arraycopy(this.dataQueue, (this.rate - this.bitsInQueue) / 8, bArr, ((int) (j12 / 8)) + i11, iMin / 8);
            this.bitsInQueue -= iMin;
            j12 += (long) iMin;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b11) {
        absorb(b11);
    }

    public KeccakDigest(int i11) {
        this(i11, CryptoServicePurpose.ANY);
    }

    protected void absorb(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15 = this.bitsInQueue;
        if (i15 % 8 != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (this.squeezing) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i16 = i15 >>> 3;
        int i17 = this.rate >>> 3;
        int i18 = i17 - i16;
        if (i12 < i18) {
            System.arraycopy(bArr, i11, this.dataQueue, i16, i12);
            i14 = this.bitsInQueue + (i12 << 3);
        } else {
            if (i16 > 0) {
                System.arraycopy(bArr, i11, this.dataQueue, i16, i18);
                KeccakAbsorb(this.dataQueue, 0);
            } else {
                i18 = 0;
            }
            while (true) {
                i13 = i12 - i18;
                if (i13 < i17) {
                    break;
                }
                KeccakAbsorb(bArr, i11 + i18);
                i18 += i17;
            }
            System.arraycopy(bArr, i11 + i18, this.dataQueue, 0, i13);
            i14 = i13 << 3;
        }
        this.bitsInQueue = i14;
    }

    protected int doFinal(byte[] bArr, int i11, byte b11, int i12) {
        if (i12 > 0) {
            absorbBits(b11, i12);
        }
        squeeze(bArr, i11, this.fixedOutputLength);
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        absorb(bArr, i11, i12);
    }

    public KeccakDigest(int i11, CryptoServicePurpose cryptoServicePurpose) {
        this.state = new long[25];
        this.dataQueue = new byte[192];
        this.purpose = cryptoServicePurpose;
        init(i11);
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }

    public KeccakDigest(CryptoServicePurpose cryptoServicePurpose) {
        this(EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, cryptoServicePurpose);
    }

    public KeccakDigest(KeccakDigest keccakDigest) {
        long[] jArr = new long[25];
        this.state = jArr;
        this.dataQueue = new byte[192];
        this.purpose = keccakDigest.purpose;
        long[] jArr2 = keccakDigest.state;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        byte[] bArr = keccakDigest.dataQueue;
        System.arraycopy(bArr, 0, this.dataQueue, 0, bArr.length);
        this.rate = keccakDigest.rate;
        this.bitsInQueue = keccakDigest.bitsInQueue;
        this.fixedOutputLength = keccakDigest.fixedOutputLength;
        this.squeezing = keccakDigest.squeezing;
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    }
}
