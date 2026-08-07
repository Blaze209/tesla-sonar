package org.bouncycastle.pqc.crypto.hqc;

import com.plaid.internal.EnumC4419g;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class KeccakRandomGenerator {
    private static long[] KeccakRoundConstants = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    protected int bitsInQueue;
    protected byte[] dataQueue;
    protected int fixedOutputLength;
    protected int rate;
    protected long[] state;

    public KeccakRandomGenerator() {
        this(EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
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
        Arrays.fill(this.state, 0L);
        Arrays.fill(this.dataQueue, (byte) 0);
        this.bitsInQueue = 0;
        this.fixedOutputLength = (1600 - i11) / 2;
    }

    private void keccakIncAbsorb(byte[] bArr, int i11) {
        long j11;
        long[] jArr;
        long j12;
        int i12 = this.rate >> 3;
        int i13 = i11;
        int i14 = 0;
        while (true) {
            j11 = i13;
            long j13 = i12;
            if (this.state[25] + j11 < j13) {
                break;
            }
            int i15 = 0;
            while (true) {
                long j14 = i15;
                jArr = this.state;
                j12 = jArr[25];
                if (j14 < j13 - j12) {
                    int i16 = i15;
                    int i17 = ((int) (j12 + j14)) >> 3;
                    jArr[i17] = jArr[i17] ^ (toUnsignedLong(bArr[i16 + i14] & 255) << ((int) (((this.state[25] + j14) & 7) * 8)));
                    i15 = i16 + 1;
                }
            }
            i13 = (int) (j11 - (j13 - j12));
            i14 = (int) (((long) i14) + (j13 - j12));
            jArr[25] = 0;
            keccakPermutation(jArr);
        }
        int i18 = 0;
        while (true) {
            long[] jArr2 = this.state;
            if (i18 >= i13) {
                jArr2[25] = jArr2[25] + j11;
                return;
            }
            long j15 = i18;
            int i19 = ((int) (jArr2[25] + j15)) >> 3;
            jArr2[i19] = (toUnsignedLong(bArr[i18 + i14] & 255) << ((int) (((this.state[25] + j15) & 7) * 8))) ^ jArr2[i19];
            i18++;
        }
    }

    private void keccakIncFinalize(int i11) {
        int i12 = this.rate >> 3;
        long[] jArr = this.state;
        int i13 = ((int) jArr[25]) >> 3;
        long j11 = jArr[i13];
        long unsignedLong = toUnsignedLong(i11);
        long[] jArr2 = this.state;
        jArr[i13] = j11 ^ (unsignedLong << ((int) ((jArr2[25] & 7) * 8)));
        int i14 = i12 - 1;
        int i15 = i14 >> 3;
        jArr2[i15] = jArr2[i15] ^ (toUnsignedLong(128) << ((i14 & 7) * 8));
        this.state[25] = 0;
    }

    private void keccakIncSqueeze(byte[] bArr, int i11) {
        int i12 = this.rate >> 3;
        int i13 = 0;
        while (i13 < i11) {
            long j11 = i13;
            long[] jArr = this.state;
            long j12 = jArr[25];
            if (j11 >= j12) {
                break;
            }
            long j13 = i12;
            bArr[i13] = (byte) (jArr[(int) (((j13 - j12) + j11) >> 3)] >> ((int) ((7 & ((j13 - j12) + j11)) * 8)));
            i13++;
        }
        int i14 = i11 - i13;
        long[] jArr2 = this.state;
        jArr2[25] = jArr2[25] - ((long) i13);
        while (i14 > 0) {
            keccakPermutation(this.state);
            int i15 = 0;
            while (i15 < i14 && i15 < i12) {
                bArr[i13 + i15] = (byte) (this.state[i15 >> 3] >> ((i15 & 7) * 8));
                i15++;
            }
            i13 += i15;
            i14 -= i15;
            this.state[25] = i12 - i15;
        }
    }

    private static void keccakPermutation(long[] jArr) {
        long j11 = jArr[0];
        long j12 = jArr[1];
        char c11 = 2;
        long j13 = jArr[2];
        char c12 = 3;
        long j14 = jArr[3];
        char c13 = 4;
        long j15 = jArr[4];
        char c14 = 5;
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
            char c15 = c11;
            long j78 = (j56 << 44) | (j56 >>> 20);
            char c16 = c12;
            long j79 = (j73 << 20) | (j73 >>> 44);
            char c17 = c13;
            long j81 = (j65 << 61) | (j65 >>> c16);
            int i13 = i11;
            long j82 = (j74 << 39) | (j74 >>> 25);
            int i14 = i12;
            long j83 = (j54 << 18) | (j54 >>> 46);
            long j84 = (j61 << 62) | (j61 >>> c15);
            long j85 = (j63 << 43) | (j63 >>> 21);
            long j86 = (j68 << 25) | (j68 >>> 39);
            long j87 = (j75 << 8) | (j75 >>> 56);
            long j88 = (j71 << 56) | (j71 >>> 8);
            long j89 = (j53 << 41) | (j53 >>> 23);
            long j91 = (j72 << 27) | (j72 >>> 37);
            long j92 = (j76 << 14) | (j76 >>> 50);
            long j93 = (j59 << c15) | (j59 >>> 62);
            long j94 = (j67 << 55) | (j67 >>> 9);
            long j95 = (j58 << 45) | (j58 >>> 19);
            long j96 = (j51 << 36) | (j51 >>> 28);
            long j97 = (j66 << 28) | (j66 >>> 36);
            long j98 = (j69 << 21) | (j69 >>> 43);
            long j99 = (j64 << 15) | (j64 >>> 49);
            long j100 = (j57 << 10) | (j57 >>> 54);
            long j101 = (j62 << 6) | (j62 >>> 58);
            long j102 = (j52 << c16) | (j52 >>> 61);
            long j103 = j49 ^ ((~j78) & j85);
            long j104 = ((~j85) & j98) ^ j78;
            long j105 = ((~j98) & j92) ^ j85;
            long j106 = j98 ^ ((~j92) & j49);
            j15 = j92 ^ (j78 & (~j49));
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
            long j123 = j93 ^ ((~j84) & j94);
            long j124 = j103 ^ KeccakRoundConstants[i14];
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
            j17 = j108;
            j16 = j107;
            j24 = j113;
            j23 = j112;
            c13 = c17;
            c11 = c15;
            c14 = c14;
            j31 = j118;
            j27 = j115;
            c12 = c16;
            j13 = j105;
            j12 = j104;
            j37 = j123;
            j11 = j124;
            i12 = i14 + 1;
            j14 = j106;
            i11 = i13;
        }
        jArr[0] = j11;
        jArr[1] = j12;
        jArr[c11] = j13;
        jArr[c12] = j14;
        jArr[c13] = j15;
        jArr[c14] = j16;
        jArr[6] = j17;
        jArr[7] = j18;
        jArr[8] = j19;
        jArr[9] = j21;
        jArr[10] = j22;
        jArr[11] = j23;
        jArr[12] = j24;
        jArr[13] = j25;
        jArr[14] = j26;
        jArr[15] = j27;
        jArr[16] = j28;
        jArr[17] = j29;
        jArr[18] = j31;
        jArr[19] = j32;
        jArr[20] = j33;
        jArr[21] = j34;
        jArr[22] = j35;
        jArr[23] = j36;
        jArr[i11] = j37;
    }

    private static long toUnsignedLong(int i11) {
        return ((long) i11) & 4294967295L;
    }

    public void SHAKE256_512_ds(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3) {
        Arrays.fill(this.state, 0L);
        keccakIncAbsorb(bArr2, i11);
        keccakIncAbsorb(bArr3, bArr3.length);
        keccakIncFinalize(31);
        keccakIncSqueeze(bArr, 64);
    }

    public void expandSeed(byte[] bArr, int i11) {
        int i12 = i11 & 7;
        int i13 = i11 - i12;
        keccakIncSqueeze(bArr, i13);
        if (i12 != 0) {
            byte[] bArr2 = new byte[8];
            keccakIncSqueeze(bArr2, 8);
            System.arraycopy(bArr2, 0, bArr, i13, i12);
        }
    }

    public void randomGeneratorInit(byte[] bArr, byte[] bArr2, int i11, int i12) {
        keccakIncAbsorb(bArr, i11);
        keccakIncAbsorb(bArr2, i12);
        keccakIncAbsorb(new byte[]{1}, 1);
        keccakIncFinalize(31);
    }

    public void seedExpanderInit(byte[] bArr, int i11) {
        keccakIncAbsorb(bArr, i11);
        keccakIncAbsorb(new byte[]{2}, 1);
        keccakIncFinalize(31);
    }

    public void squeeze(byte[] bArr, int i11) {
        keccakIncSqueeze(bArr, i11);
    }

    public KeccakRandomGenerator(int i11) {
        this.state = new long[26];
        this.dataQueue = new byte[192];
        init(i11);
    }
}
