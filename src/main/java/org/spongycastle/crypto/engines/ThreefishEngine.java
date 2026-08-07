package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.TweakableBlockCipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;

    /* JADX INFO: renamed from: kw, reason: collision with root package name */
    private long[] f99497kw;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long[] f99498t;

    private static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f99499kw;
            long[] jArr4 = this.f99500t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j11 = jArr[0];
            int i11 = 1;
            long j12 = jArr[1];
            long j13 = jArr[2];
            long j14 = jArr[3];
            long j15 = jArr[4];
            long j16 = jArr[5];
            long j17 = jArr[6];
            long j18 = jArr[7];
            long j19 = jArr[8];
            int i12 = 9;
            long j21 = jArr[9];
            long j22 = jArr[10];
            long j23 = jArr[11];
            long j24 = jArr[12];
            long j25 = jArr[13];
            long j26 = jArr[14];
            long jXorRotr = jArr[15];
            int i13 = 19;
            while (i13 >= i11) {
                int i14 = iArr[i13];
                int i15 = iArr2[i13];
                int i16 = i14 + 1;
                long j27 = j11 - jArr3[i16];
                int i17 = i14 + 2;
                long j28 = j12 - jArr3[i17];
                int i18 = i14 + 3;
                long j29 = j13 - jArr3[i18];
                int i19 = i14 + 4;
                long j31 = j14 - jArr3[i19];
                int i21 = i14 + 5;
                int i22 = i11;
                long j32 = j15 - jArr3[i21];
                int i23 = i14 + 6;
                long[] jArr5 = jArr3;
                long j33 = j16 - jArr3[i23];
                int i24 = i14 + 7;
                long[] jArr6 = jArr4;
                long j34 = j17 - jArr5[i24];
                int i25 = i14 + 8;
                int[] iArr3 = iArr2;
                long j35 = j18 - jArr5[i25];
                int i26 = i14 + 9;
                long j36 = j19 - jArr5[i26];
                int i27 = i14 + 10;
                long j37 = j21 - jArr5[i27];
                int i28 = i14 + 11;
                long j38 = j22 - jArr5[i28];
                int i29 = i14 + 12;
                long j39 = j23 - jArr5[i29];
                int i31 = i14 + 13;
                long j41 = j24 - jArr5[i31];
                int i32 = i14 + 14;
                int i33 = i15 + 1;
                long j42 = j25 - (jArr5[i32] + jArr6[i33]);
                int i34 = i14 + 15;
                long j43 = j26 - (jArr5[i34] + jArr6[i15 + 2]);
                long j44 = i13;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr5[i14 + 16] + j44) + 1), i12, j27);
                long j45 = j27 - jXorRotr2;
                long jXorRotr3 = ThreefishEngine.xorRotr(j39, 48, j29);
                long j46 = j29 - jXorRotr3;
                long jXorRotr4 = ThreefishEngine.xorRotr(j42, 35, j34);
                long j47 = j34 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j37, 52, j32);
                long j48 = j32 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j28, 23, j43);
                long j49 = j43 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j33, 31, j36);
                long j51 = j36 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(j31, 37, j38);
                long j52 = j38 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(j35, 20, j41);
                long j53 = j41 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9, 31, j45);
                long j54 = j45 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr7, 44, j46);
                long j55 = j46 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 47, j48);
                long j56 = j48 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr6, 46, j47);
                long j57 = j47 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr2, 19, j53);
                long j58 = j53 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr4, 42, j49);
                long j59 = j49 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr3, 44, j51);
                long j61 = j51 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr5, 25, j52);
                long j62 = j52 - jXorRotr17;
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr17, 16, j54);
                long j63 = j54 - jXorRotr18;
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr15, 34, j55);
                long j64 = j55 - jXorRotr19;
                long jXorRotr20 = ThreefishEngine.xorRotr(jXorRotr16, 56, j57);
                long j65 = j57 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(jXorRotr14, 51, j56);
                long j66 = j56 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(jXorRotr10, 4, j62);
                long j67 = j62 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(jXorRotr12, 53, j58);
                long j68 = j58 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr11, 42, j59);
                long j69 = j59 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr13, 41, j61);
                long j71 = j61 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr25, 41, j63);
                long j72 = j63 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr23, 9, j64);
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 37, j66);
                long j73 = j66 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr22, 31, j65);
                long j74 = j65 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr18, 12, j71);
                long j75 = j71 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr20, 47, j67);
                long j76 = j67 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr19, 44, j68);
                long j77 = j68 - jXorRotr32;
                long jXorRotr33 = ThreefishEngine.xorRotr(jXorRotr21, 30, j69);
                long j78 = j69 - jXorRotr33;
                long j79 = j72 - jArr5[i14];
                long j81 = jXorRotr26 - jArr5[i16];
                long j82 = (j64 - jXorRotr27) - jArr5[i17];
                long j83 = jXorRotr27 - jArr5[i18];
                long j84 = j73 - jArr5[i19];
                long j85 = jXorRotr28 - jArr5[i21];
                long j86 = j74 - jArr5[i23];
                long j87 = jXorRotr29 - jArr5[i24];
                long j88 = j75 - jArr5[i25];
                long j89 = jXorRotr30 - jArr5[i26];
                long j91 = j76 - jArr5[i27];
                long j92 = jXorRotr31 - jArr5[i28];
                long j93 = j77 - jArr5[i29];
                long j94 = jXorRotr32 - (jArr5[i31] + jArr6[i15]);
                long j95 = j78 - (jArr5[i32] + jArr6[i33]);
                long jXorRotr34 = ThreefishEngine.xorRotr(jXorRotr33 - (jArr5[i34] + j44), 5, j79);
                long j96 = j79 - jXorRotr34;
                long jXorRotr35 = ThreefishEngine.xorRotr(j92, 20, j82);
                long j97 = j82 - jXorRotr35;
                long jXorRotr36 = ThreefishEngine.xorRotr(j94, 48, j86);
                long j98 = j86 - jXorRotr36;
                long jXorRotr37 = ThreefishEngine.xorRotr(j89, 41, j84);
                long j99 = j84 - jXorRotr37;
                long jXorRotr38 = ThreefishEngine.xorRotr(j81, 47, j95);
                long j100 = j95 - jXorRotr38;
                long jXorRotr39 = ThreefishEngine.xorRotr(j85, 28, j88);
                long j101 = j88 - jXorRotr39;
                long jXorRotr40 = ThreefishEngine.xorRotr(j83, 16, j91);
                long j102 = j91 - jXorRotr40;
                long jXorRotr41 = ThreefishEngine.xorRotr(j87, 25, j93);
                long j103 = j93 - jXorRotr41;
                long jXorRotr42 = ThreefishEngine.xorRotr(jXorRotr41, 33, j96);
                long j104 = j96 - jXorRotr42;
                long jXorRotr43 = ThreefishEngine.xorRotr(jXorRotr39, 4, j97);
                long j105 = j97 - jXorRotr43;
                long jXorRotr44 = ThreefishEngine.xorRotr(jXorRotr40, 51, j99);
                long j106 = j99 - jXorRotr44;
                long jXorRotr45 = ThreefishEngine.xorRotr(jXorRotr38, 13, j98);
                long j107 = j98 - jXorRotr45;
                long jXorRotr46 = ThreefishEngine.xorRotr(jXorRotr34, 34, j103);
                long j108 = j103 - jXorRotr46;
                long jXorRotr47 = ThreefishEngine.xorRotr(jXorRotr36, 41, j100);
                long j109 = j100 - jXorRotr47;
                long jXorRotr48 = ThreefishEngine.xorRotr(jXorRotr35, 59, j101);
                long j110 = j101 - jXorRotr48;
                long jXorRotr49 = ThreefishEngine.xorRotr(jXorRotr37, 17, j102);
                long j111 = j102 - jXorRotr49;
                long jXorRotr50 = ThreefishEngine.xorRotr(jXorRotr49, 38, j104);
                long j112 = j104 - jXorRotr50;
                long jXorRotr51 = ThreefishEngine.xorRotr(jXorRotr47, 19, j105);
                long j113 = j105 - jXorRotr51;
                long jXorRotr52 = ThreefishEngine.xorRotr(jXorRotr48, 10, j107);
                long j114 = j107 - jXorRotr52;
                long jXorRotr53 = ThreefishEngine.xorRotr(jXorRotr46, 55, j106);
                long j115 = j106 - jXorRotr53;
                long jXorRotr54 = ThreefishEngine.xorRotr(jXorRotr42, 49, j111);
                long j116 = j111 - jXorRotr54;
                long jXorRotr55 = ThreefishEngine.xorRotr(jXorRotr44, 18, j108);
                long j117 = j108 - jXorRotr55;
                long jXorRotr56 = ThreefishEngine.xorRotr(jXorRotr43, 23, j109);
                long j118 = j109 - jXorRotr56;
                long jXorRotr57 = ThreefishEngine.xorRotr(jXorRotr45, 52, j110);
                long j119 = j110 - jXorRotr57;
                long jXorRotr58 = ThreefishEngine.xorRotr(jXorRotr57, 24, j112);
                long j120 = j112 - jXorRotr58;
                long jXorRotr59 = ThreefishEngine.xorRotr(jXorRotr55, 13, j113);
                j13 = j113 - jXorRotr59;
                long jXorRotr60 = ThreefishEngine.xorRotr(jXorRotr56, 8, j115);
                long j121 = j115 - jXorRotr60;
                long jXorRotr61 = ThreefishEngine.xorRotr(jXorRotr54, 47, j114);
                long j122 = j114 - jXorRotr61;
                long jXorRotr62 = ThreefishEngine.xorRotr(jXorRotr50, 8, j119);
                long j123 = j119 - jXorRotr62;
                long jXorRotr63 = ThreefishEngine.xorRotr(jXorRotr52, 17, j116);
                long j124 = j116 - jXorRotr63;
                long jXorRotr64 = ThreefishEngine.xorRotr(jXorRotr51, 22, j117);
                j24 = j117 - jXorRotr64;
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr53, 37, j118);
                j26 = j118 - jXorRotr;
                j23 = jXorRotr63;
                j22 = j124;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                j17 = j122;
                j16 = jXorRotr60;
                j11 = j120;
                i12 = 9;
                j14 = jXorRotr59;
                j25 = jXorRotr64;
                j18 = jXorRotr61;
                i13 -= 2;
                j21 = jXorRotr62;
                j15 = j121;
                j12 = jXorRotr58;
                i11 = i22;
                j19 = j123;
                iArr2 = iArr3;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i35 = i11;
            long j125 = j11 - jArr7[0];
            long j126 = j12 - jArr7[i35];
            long j127 = j13 - jArr7[2];
            long j128 = j14 - jArr7[3];
            long j129 = j15 - jArr7[4];
            long j130 = j16 - jArr7[5];
            long j131 = j17 - jArr7[6];
            long j132 = j18 - jArr7[7];
            long j133 = j19 - jArr7[8];
            long j134 = j21 - jArr7[9];
            long j135 = j22 - jArr7[10];
            long j136 = j23 - jArr7[11];
            long j137 = j24 - jArr7[12];
            long j138 = j25 - (jArr7[13] + jArr8[0]);
            long j139 = j26 - (jArr7[14] + jArr8[i35]);
            long j140 = jXorRotr - jArr7[15];
            jArr2[0] = j125;
            jArr2[i35] = j126;
            jArr2[2] = j127;
            jArr2[3] = j128;
            jArr2[4] = j129;
            jArr2[5] = j130;
            jArr2[6] = j131;
            jArr2[7] = j132;
            jArr2[8] = j133;
            jArr2[9] = j134;
            jArr2[10] = j135;
            jArr2[11] = j136;
            jArr2[12] = j137;
            jArr2[13] = j138;
            jArr2[14] = j139;
            jArr2[15] = j140;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f99499kw;
            long[] jArr4 = this.f99500t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j11 = jArr[0];
            long j12 = jArr[1];
            long j13 = jArr[2];
            long j14 = jArr[3];
            long j15 = jArr[4];
            long j16 = jArr[5];
            long j17 = jArr[6];
            long j18 = jArr[7];
            long j19 = jArr[8];
            long j21 = jArr[9];
            long j22 = jArr[10];
            long j23 = jArr[11];
            int i11 = 9;
            long j24 = jArr[12];
            int i12 = 12;
            int i13 = 13;
            long j25 = jArr[13];
            long j26 = jArr[14];
            long j27 = jArr[15];
            long j28 = j11 + jArr3[0];
            long j29 = j12 + jArr3[1];
            long j31 = j13 + jArr3[2];
            long j32 = j14 + jArr3[3];
            long j33 = j15 + jArr3[4];
            long j34 = j16 + jArr3[5];
            long j35 = j17 + jArr3[6];
            long j36 = j18 + jArr3[7];
            long j37 = j19 + jArr3[8];
            long j38 = j21 + jArr3[9];
            long j39 = j22 + jArr3[10];
            long j41 = j23 + jArr3[11];
            long j42 = j24 + jArr3[12];
            long j43 = j25 + jArr3[13] + jArr4[0];
            long j44 = j26 + jArr3[14] + jArr4[1];
            long j45 = j34;
            long j46 = j36;
            long j47 = j38;
            long j48 = j41;
            long j49 = j43;
            long j51 = j27 + jArr3[15];
            long j52 = j33;
            long j53 = j28;
            long j54 = j32;
            int i14 = 1;
            while (i14 < 20) {
                int i15 = iArr[i14];
                int i16 = iArr2[i14];
                long j55 = j54;
                long j56 = j53 + j29;
                long jRotlXor = ThreefishEngine.rotlXor(j29, 24, j56);
                long j57 = j31 + j55;
                long jRotlXor2 = ThreefishEngine.rotlXor(j55, i13, j57);
                int i17 = i14;
                long j58 = j45;
                long j59 = j52 + j58;
                long jRotlXor3 = ThreefishEngine.rotlXor(j58, 8, j59);
                long[] jArr5 = jArr3;
                long j61 = j46;
                long j62 = j35 + j61;
                long[] jArr6 = jArr4;
                long jRotlXor4 = ThreefishEngine.rotlXor(j61, 47, j62);
                long j63 = j47;
                long j64 = j37 + j63;
                int[] iArr3 = iArr2;
                long jRotlXor5 = ThreefishEngine.rotlXor(j63, 8, j64);
                long j65 = j48;
                long j66 = j39 + j65;
                long jRotlXor6 = ThreefishEngine.rotlXor(j65, 17, j66);
                long j67 = j49;
                long j68 = j42 + j67;
                long jRotlXor7 = ThreefishEngine.rotlXor(j67, 22, j68);
                long j69 = j51;
                long j71 = j44 + j69;
                long jRotlXor8 = ThreefishEngine.rotlXor(j69, 37, j71);
                long j72 = j56 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 38, j72);
                long j73 = j57 + jRotlXor7;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor7, 19, j73);
                long j74 = j62 + jRotlXor6;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor6, 10, j74);
                long j75 = j59 + jRotlXor8;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor8, 55, j75);
                long j76 = j66 + jRotlXor4;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor4, 49, j76);
                long j77 = j68 + jRotlXor2;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor2, 18, j77);
                long j78 = j71 + jRotlXor3;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor3, 23, j78);
                long j79 = j64 + jRotlXor;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor, 52, j79);
                long j81 = j72 + jRotlXor13;
                long jRotlXor17 = ThreefishEngine.rotlXor(jRotlXor13, 33, j81);
                long j82 = j73 + jRotlXor15;
                long jRotlXor18 = ThreefishEngine.rotlXor(jRotlXor15, 4, j82);
                long j83 = j75 + jRotlXor14;
                long jRotlXor19 = ThreefishEngine.rotlXor(jRotlXor14, 51, j83);
                long j84 = j74 + jRotlXor16;
                long jRotlXor20 = ThreefishEngine.rotlXor(jRotlXor16, 13, j84);
                long j85 = j77 + jRotlXor12;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor12, 34, j85);
                long j86 = j78 + jRotlXor10;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor10, 41, j86);
                long j87 = j79 + jRotlXor11;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor11, 59, j87);
                long j88 = j76 + jRotlXor9;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor9, 17, j88);
                long j89 = j81 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 5, j89);
                long j91 = j82 + jRotlXor23;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor23, 20, j91);
                long j92 = j84 + jRotlXor22;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor22, 48, j92);
                long j93 = j83 + jRotlXor24;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor24, 41, j93);
                long j94 = j86 + jRotlXor20;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor20, 47, j94);
                long j95 = j87 + jRotlXor18;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor18, 28, j95);
                long j96 = j88 + jRotlXor19;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor19, 16, j96);
                long j97 = j85 + jRotlXor17;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor17, 25, j97);
                long j98 = j89 + jArr5[i15];
                int i18 = i15 + 1;
                long j99 = jRotlXor29 + jArr5[i18];
                int i19 = i15 + 2;
                long j100 = j91 + jArr5[i19];
                int i21 = i15 + 3;
                long j101 = jRotlXor31 + jArr5[i21];
                int i22 = i15 + 4;
                long j102 = j93 + jArr5[i22];
                int i23 = i15 + 5;
                long j103 = jRotlXor30 + jArr5[i23];
                int i24 = i15 + 6;
                long j104 = j92 + jArr5[i24];
                int i25 = i15 + 7;
                long j105 = jRotlXor32 + jArr5[i25];
                int i26 = i15 + 8;
                long j106 = j95 + jArr5[i26];
                int i27 = i15 + 9;
                long j107 = jRotlXor28 + jArr5[i27];
                int i28 = i15 + 10;
                long j108 = j96 + jArr5[i28];
                int i29 = i15 + 11;
                long j109 = jRotlXor26 + jArr5[i29];
                int i31 = i15 + 12;
                long j110 = j97 + jArr5[i31];
                int i32 = i15 + 13;
                long j111 = jRotlXor27 + jArr5[i32] + jArr6[i16];
                int i33 = i15 + 14;
                int i34 = i16 + 1;
                long j112 = j94 + jArr5[i33] + jArr6[i34];
                int i35 = i15 + 15;
                long j113 = i17;
                long j114 = jRotlXor25 + jArr5[i35] + j113;
                long j115 = j98 + j99;
                long jRotlXor33 = ThreefishEngine.rotlXor(j99, 41, j115);
                long j116 = j100 + j101;
                long jRotlXor34 = ThreefishEngine.rotlXor(j101, i11, j116);
                long j117 = j102 + j103;
                long jRotlXor35 = ThreefishEngine.rotlXor(j103, 37, j117);
                long j118 = j104 + j105;
                long jRotlXor36 = ThreefishEngine.rotlXor(j105, 31, j118);
                long j119 = j106 + j107;
                long jRotlXor37 = ThreefishEngine.rotlXor(j107, i12, j119);
                long j120 = j108 + j109;
                long jRotlXor38 = ThreefishEngine.rotlXor(j109, 47, j120);
                long j121 = j110 + j111;
                long jRotlXor39 = ThreefishEngine.rotlXor(j111, 44, j121);
                long j122 = j112 + j114;
                long jRotlXor40 = ThreefishEngine.rotlXor(j114, 30, j122);
                long j123 = j115 + jRotlXor37;
                long jRotlXor41 = ThreefishEngine.rotlXor(jRotlXor37, 16, j123);
                long j124 = j116 + jRotlXor39;
                long jRotlXor42 = ThreefishEngine.rotlXor(jRotlXor39, 34, j124);
                long j125 = j118 + jRotlXor38;
                long jRotlXor43 = ThreefishEngine.rotlXor(jRotlXor38, 56, j125);
                long j126 = j117 + jRotlXor40;
                long jRotlXor44 = ThreefishEngine.rotlXor(jRotlXor40, 51, j126);
                long j127 = j120 + jRotlXor36;
                long jRotlXor45 = ThreefishEngine.rotlXor(jRotlXor36, 4, j127);
                long j128 = j121 + jRotlXor34;
                long jRotlXor46 = ThreefishEngine.rotlXor(jRotlXor34, 53, j128);
                long j129 = j122 + jRotlXor35;
                long jRotlXor47 = ThreefishEngine.rotlXor(jRotlXor35, 42, j129);
                long j130 = j119 + jRotlXor33;
                long jRotlXor48 = ThreefishEngine.rotlXor(jRotlXor33, 41, j130);
                long j131 = j123 + jRotlXor45;
                long jRotlXor49 = ThreefishEngine.rotlXor(jRotlXor45, 31, j131);
                long j132 = j124 + jRotlXor47;
                long jRotlXor50 = ThreefishEngine.rotlXor(jRotlXor47, 44, j132);
                long j133 = j126 + jRotlXor46;
                long jRotlXor51 = ThreefishEngine.rotlXor(jRotlXor46, 47, j133);
                long j134 = j125 + jRotlXor48;
                long jRotlXor52 = ThreefishEngine.rotlXor(jRotlXor48, 46, j134);
                long j135 = j128 + jRotlXor44;
                long jRotlXor53 = ThreefishEngine.rotlXor(jRotlXor44, 19, j135);
                long j136 = j129 + jRotlXor42;
                long jRotlXor54 = ThreefishEngine.rotlXor(jRotlXor42, 42, j136);
                long j137 = j130 + jRotlXor43;
                long jRotlXor55 = ThreefishEngine.rotlXor(jRotlXor43, 44, j137);
                long j138 = j127 + jRotlXor41;
                long jRotlXor56 = ThreefishEngine.rotlXor(jRotlXor41, 25, j138);
                long j139 = j131 + jRotlXor53;
                long jRotlXor57 = ThreefishEngine.rotlXor(jRotlXor53, 9, j139);
                long j140 = j132 + jRotlXor55;
                long jRotlXor58 = ThreefishEngine.rotlXor(jRotlXor55, 48, j140);
                long j141 = j134 + jRotlXor54;
                long jRotlXor59 = ThreefishEngine.rotlXor(jRotlXor54, 35, j141);
                long j142 = j133 + jRotlXor56;
                long jRotlXor60 = ThreefishEngine.rotlXor(jRotlXor56, 52, j142);
                long j143 = j136 + jRotlXor52;
                long jRotlXor61 = ThreefishEngine.rotlXor(jRotlXor52, 23, j143);
                long j144 = j137 + jRotlXor50;
                long jRotlXor62 = ThreefishEngine.rotlXor(jRotlXor50, 31, j144);
                long j145 = j138 + jRotlXor51;
                long jRotlXor63 = ThreefishEngine.rotlXor(jRotlXor51, 37, j145);
                long j146 = j135 + jRotlXor49;
                long jRotlXor64 = ThreefishEngine.rotlXor(jRotlXor49, 20, j146);
                long j147 = jArr5[i18] + j139;
                long j148 = jRotlXor61 + jArr5[i19];
                long j149 = j140 + jArr5[i21];
                long j150 = jRotlXor63 + jArr5[i22];
                long j151 = j142 + jArr5[i23];
                long j152 = jRotlXor62 + jArr5[i24];
                long j153 = j141 + jArr5[i25];
                long j154 = jRotlXor64 + jArr5[i26];
                long j155 = j144 + jArr5[i27];
                j47 = jRotlXor60 + jArr5[i28];
                long j156 = j145 + jArr5[i29];
                long j157 = jRotlXor58 + jArr5[i31];
                j42 = j146 + jArr5[i32];
                j49 = jRotlXor59 + jArr5[i33] + jArr6[i34];
                long j158 = j143 + jArr5[i35] + jArr6[i16 + 2];
                j51 = jRotlXor57 + jArr5[i15 + 16] + j113 + 1;
                j35 = j153;
                j37 = j155;
                j52 = j151;
                j29 = j148;
                j31 = j149;
                i14 = i17 + 2;
                j54 = j150;
                j39 = j156;
                j48 = j157;
                j45 = j152;
                i13 = 13;
                i11 = 9;
                i12 = 12;
                j46 = j154;
                j53 = j147;
                j44 = j158;
                jArr3 = jArr5;
                jArr4 = jArr6;
                iArr = iArr;
                iArr2 = iArr3;
            }
            jArr2[0] = j53;
            jArr2[1] = j29;
            jArr2[2] = j31;
            jArr2[3] = j54;
            jArr2[4] = j52;
            jArr2[5] = j45;
            jArr2[6] = j35;
            jArr2[7] = j46;
            jArr2[8] = j37;
            jArr2[9] = j47;
            jArr2[10] = j39;
            jArr2[11] = j48;
            jArr2[12] = j42;
            jArr2[13] = j49;
            jArr2[14] = j44;
            jArr2[15] = j51;
        }
    }

    private static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f99499kw;
            long[] jArr4 = this.f99500t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j11 = jArr[0];
            int i11 = 1;
            long j12 = jArr[1];
            char c11 = 2;
            long j13 = jArr[2];
            long jXorRotr = jArr[3];
            int i12 = 17;
            while (i12 >= i11) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                int i15 = i13 + 1;
                long j14 = j11 - jArr3[i15];
                int i16 = i13 + 2;
                int i17 = i14 + 1;
                long j15 = j12 - (jArr3[i16] + jArr4[i17]);
                int i18 = i13 + 3;
                long j16 = j13 - (jArr3[i18] + jArr4[i14 + 2]);
                int i19 = i11;
                long j17 = i12;
                char c12 = c11;
                long jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr - ((jArr3[i13 + 4] + j17) + 1), 32, j14);
                long j18 = j14 - jXorRotr2;
                long[] jArr5 = jArr3;
                long jXorRotr3 = ThreefishEngine.xorRotr(j15, 32, j16);
                long j19 = j16 - jXorRotr3;
                long[] jArr6 = jArr4;
                long jXorRotr4 = ThreefishEngine.xorRotr(jXorRotr3, 58, j18);
                long j21 = j18 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(jXorRotr2, 22, j19);
                long j22 = j19 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(jXorRotr5, 46, j21);
                long j23 = j21 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(jXorRotr4, 12, j22);
                long j24 = j22 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr7, 25, j23);
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr6, 33, j24);
                long j25 = (j23 - jXorRotr8) - jArr5[i13];
                long j26 = jXorRotr8 - (jArr5[i15] + jArr6[i14]);
                long j27 = (j24 - jXorRotr9) - (jArr5[i16] + jArr6[i17]);
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr9 - (jArr5[i18] + j17), 5, j25);
                long j28 = j25 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(j26, 37, j27);
                long j29 = j27 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr11, 23, j28);
                long j31 = j28 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr10, 40, j29);
                long j32 = j29 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr13, 52, j31);
                long j33 = j31 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr12, 57, j32);
                long j34 = j32 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr15, 14, j33);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr14, 16, j34);
                j13 = j34 - jXorRotr;
                i12 -= 2;
                j12 = jXorRotr16;
                i11 = i19;
                jArr3 = jArr5;
                c11 = c12;
                j11 = j33 - jXorRotr16;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            int i21 = i11;
            char c13 = c11;
            long j35 = j11 - jArr7[0];
            long j36 = j12 - (jArr7[i21] + jArr8[0]);
            long j37 = j13 - (jArr7[c13] + jArr8[i21]);
            long j38 = jXorRotr - jArr7[3];
            jArr2[0] = j35;
            jArr2[i21] = j36;
            jArr2[c13] = j37;
            jArr2[3] = j38;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f99499kw;
            long[] jArr4 = this.f99500t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j11 = jArr[0];
            boolean z11 = true;
            long j12 = jArr[1];
            long j13 = jArr[2];
            char c11 = 3;
            long j14 = jArr[3];
            long j15 = j11 + jArr3[0];
            long j16 = j12 + jArr3[1] + jArr4[0];
            int i11 = 1;
            long j17 = j13 + jArr3[2] + jArr4[1];
            long j18 = j14 + jArr3[3];
            while (i11 < 18) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                long j19 = j15 + j16;
                boolean z12 = z11;
                long jRotlXor = ThreefishEngine.rotlXor(j16, 14, j19);
                long j21 = j17 + j18;
                long jRotlXor2 = ThreefishEngine.rotlXor(j18, 16, j21);
                long[] jArr5 = jArr3;
                long j22 = j19 + jRotlXor2;
                long jRotlXor3 = ThreefishEngine.rotlXor(jRotlXor2, 52, j22);
                long j23 = j21 + jRotlXor;
                long jRotlXor4 = ThreefishEngine.rotlXor(jRotlXor, 57, j23);
                long j24 = j22 + jRotlXor4;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor4, 23, j24);
                long j25 = j23 + jRotlXor3;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor3, 40, j25);
                long j26 = j24 + jRotlXor6;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor6, 5, j26);
                long j27 = j25 + jRotlXor5;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor5, 37, j27);
                long j28 = j26 + jArr5[i12];
                int i14 = i12 + 1;
                long j29 = jRotlXor8 + jArr5[i14] + jArr4[i13];
                int i15 = i12 + 2;
                int i16 = i13 + 1;
                long j31 = j27 + jArr5[i15] + jArr4[i16];
                int i17 = i12 + 3;
                long j32 = i11;
                long j33 = jRotlXor7 + jArr5[i17] + j32;
                long j34 = j28 + j29;
                long jRotlXor9 = ThreefishEngine.rotlXor(j29, 25, j34);
                long j35 = j31 + j33;
                long jRotlXor10 = ThreefishEngine.rotlXor(j33, 33, j35);
                long j36 = j34 + jRotlXor10;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor10, 46, j36);
                long j37 = j35 + jRotlXor9;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor9, 12, j37);
                long j38 = j36 + jRotlXor12;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor12, 58, j38);
                long j39 = j37 + jRotlXor11;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor11, 22, j39);
                long j41 = j38 + jRotlXor14;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor14, 32, j41);
                long j42 = j39 + jRotlXor13;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor13, 32, j42);
                long j43 = j41 + jArr5[i14];
                long j44 = jRotlXor16 + jArr5[i15] + jArr4[i16];
                j17 = j42 + jArr5[i17] + jArr4[i13 + 2];
                j18 = jRotlXor15 + jArr5[i12 + 4] + j32 + 1;
                i11 += 2;
                j16 = j44;
                z11 = z12;
                c11 = c11;
                j15 = j43;
                jArr3 = jArr5;
            }
            jArr2[0] = j15;
            jArr2[z11 ? 1 : 0] = j16;
            jArr2[2] = j17;
            jArr2[c11] = j18;
        }
    }

    private static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        protected Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f99499kw;
            long[] jArr4 = this.f99500t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            char c11 = 5;
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j11 = jArr[0];
            int i11 = 1;
            long j12 = jArr[1];
            char c12 = 2;
            long j13 = jArr[2];
            long jXorRotr = jArr[3];
            long j14 = jArr[4];
            long jXorRotr2 = jArr[5];
            long j15 = jArr[6];
            long jXorRotr3 = jArr[7];
            int i12 = 17;
            while (i12 >= i11) {
                int i13 = iArr[i12];
                int i14 = iArr2[i12];
                int i15 = i13 + 1;
                long j16 = j11 - jArr3[i15];
                int i16 = i13 + 2;
                long j17 = j12 - jArr3[i16];
                int i17 = i13 + 3;
                long j18 = j13 - jArr3[i17];
                int i18 = i13 + 4;
                long j19 = jXorRotr - jArr3[i18];
                int i19 = i13 + 5;
                char c13 = c12;
                long j21 = j14 - jArr3[i19];
                int i21 = i13 + 6;
                int i22 = i14 + 1;
                int i23 = i11;
                long j22 = jXorRotr2 - (jArr3[i21] + jArr4[i22]);
                int i24 = i13 + 7;
                long[] jArr5 = jArr3;
                long j23 = j15 - (jArr3[i24] + jArr4[i14 + 2]);
                long[] jArr6 = jArr4;
                long j24 = i12;
                long j25 = jXorRotr3 - ((jArr5[i13 + 8] + j24) + 1);
                int[] iArr3 = iArr2;
                long jXorRotr4 = ThreefishEngine.xorRotr(j17, 8, j23);
                long j26 = j23 - jXorRotr4;
                long jXorRotr5 = ThreefishEngine.xorRotr(j25, 35, j16);
                long j27 = j16 - jXorRotr5;
                long jXorRotr6 = ThreefishEngine.xorRotr(j22, 56, j18);
                long j28 = j18 - jXorRotr6;
                long jXorRotr7 = ThreefishEngine.xorRotr(j19, 22, j21);
                long j29 = j21 - jXorRotr7;
                long jXorRotr8 = ThreefishEngine.xorRotr(jXorRotr4, 25, j29);
                long j31 = j29 - jXorRotr8;
                long jXorRotr9 = ThreefishEngine.xorRotr(jXorRotr7, 29, j26);
                long j32 = j26 - jXorRotr9;
                long jXorRotr10 = ThreefishEngine.xorRotr(jXorRotr6, 39, j27);
                long j33 = j27 - jXorRotr10;
                long jXorRotr11 = ThreefishEngine.xorRotr(jXorRotr5, 43, j28);
                long j34 = j28 - jXorRotr11;
                long jXorRotr12 = ThreefishEngine.xorRotr(jXorRotr8, 13, j34);
                long j35 = j34 - jXorRotr12;
                long jXorRotr13 = ThreefishEngine.xorRotr(jXorRotr11, 50, j31);
                long j36 = j31 - jXorRotr13;
                long jXorRotr14 = ThreefishEngine.xorRotr(jXorRotr10, 10, j32);
                long j37 = j32 - jXorRotr14;
                long jXorRotr15 = ThreefishEngine.xorRotr(jXorRotr9, 17, j33);
                long j38 = j33 - jXorRotr15;
                long jXorRotr16 = ThreefishEngine.xorRotr(jXorRotr12, 39, j38);
                long j39 = j38 - jXorRotr16;
                long jXorRotr17 = ThreefishEngine.xorRotr(jXorRotr15, 30, j35);
                long jXorRotr18 = ThreefishEngine.xorRotr(jXorRotr14, 34, j36);
                long jXorRotr19 = ThreefishEngine.xorRotr(jXorRotr13, 24, j37);
                long j41 = j37 - jXorRotr19;
                long j42 = j39 - jArr5[i13];
                long j43 = jXorRotr16 - jArr5[i15];
                long j44 = (j35 - jXorRotr17) - jArr5[i16];
                long j45 = jXorRotr17 - jArr5[i17];
                long j46 = (j36 - jXorRotr18) - jArr5[i18];
                long j47 = jXorRotr18 - (jArr5[i19] + jArr6[i14]);
                long j48 = j41 - (jArr5[i21] + jArr6[i22]);
                long j49 = jXorRotr19 - (jArr5[i24] + j24);
                long jXorRotr20 = ThreefishEngine.xorRotr(j43, 44, j48);
                long j51 = j48 - jXorRotr20;
                long jXorRotr21 = ThreefishEngine.xorRotr(j49, 9, j42);
                long j52 = j42 - jXorRotr21;
                long jXorRotr22 = ThreefishEngine.xorRotr(j47, 54, j44);
                long j53 = j44 - jXorRotr22;
                long jXorRotr23 = ThreefishEngine.xorRotr(j45, 56, j46);
                long j54 = j46 - jXorRotr23;
                long jXorRotr24 = ThreefishEngine.xorRotr(jXorRotr20, 17, j54);
                long j55 = j54 - jXorRotr24;
                long jXorRotr25 = ThreefishEngine.xorRotr(jXorRotr23, 49, j51);
                long j56 = j51 - jXorRotr25;
                long jXorRotr26 = ThreefishEngine.xorRotr(jXorRotr22, 36, j52);
                long j57 = j52 - jXorRotr26;
                long jXorRotr27 = ThreefishEngine.xorRotr(jXorRotr21, 39, j53);
                long j58 = j53 - jXorRotr27;
                long jXorRotr28 = ThreefishEngine.xorRotr(jXorRotr24, 33, j58);
                long j59 = j58 - jXorRotr28;
                long jXorRotr29 = ThreefishEngine.xorRotr(jXorRotr27, 27, j55);
                long j61 = j55 - jXorRotr29;
                long jXorRotr30 = ThreefishEngine.xorRotr(jXorRotr26, 14, j56);
                long j62 = j56 - jXorRotr30;
                long jXorRotr31 = ThreefishEngine.xorRotr(jXorRotr25, 42, j57);
                long j63 = j57 - jXorRotr31;
                long jXorRotr32 = ThreefishEngine.xorRotr(jXorRotr28, 46, j63);
                jXorRotr = ThreefishEngine.xorRotr(jXorRotr31, 36, j59);
                jXorRotr2 = ThreefishEngine.xorRotr(jXorRotr30, 19, j61);
                long j64 = j61 - jXorRotr2;
                jXorRotr3 = ThreefishEngine.xorRotr(jXorRotr29, 37, j62);
                j15 = j62 - jXorRotr3;
                j13 = j59 - jXorRotr;
                j12 = jXorRotr32;
                i12 -= 2;
                j11 = j63 - jXorRotr32;
                i11 = i23;
                jArr3 = jArr5;
                c11 = c11;
                c12 = c13;
                iArr2 = iArr3;
                j14 = j64;
                jArr4 = jArr6;
                iArr = iArr;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            char c14 = c11;
            int i25 = i11;
            char c15 = c12;
            long j65 = j11 - jArr7[0];
            long j66 = j12 - jArr7[i25];
            long j67 = j13 - jArr7[c15];
            long j68 = jXorRotr - jArr7[3];
            long j69 = j14 - jArr7[4];
            long j71 = jXorRotr2 - (jArr7[c14] + jArr8[0]);
            long j72 = j15 - (jArr7[6] + jArr8[i25]);
            long j73 = jXorRotr3 - jArr7[7];
            jArr2[0] = j65;
            jArr2[i25] = j66;
            jArr2[c15] = j67;
            jArr2[3] = j68;
            jArr2[4] = j69;
            jArr2[c14] = j71;
            jArr2[6] = j72;
            jArr2[7] = j73;
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f99499kw;
            long[] jArr4 = this.f99500t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j11 = jArr[0];
            long j12 = jArr[1];
            long j13 = jArr[2];
            long j14 = jArr[3];
            long j15 = jArr[4];
            long j16 = jArr[5];
            long j17 = jArr[6];
            long j18 = jArr[7];
            long j19 = j11 + jArr3[0];
            long j21 = j12 + jArr3[1];
            long j22 = j13 + jArr3[2];
            long j23 = j14 + jArr3[3];
            long j24 = j15 + jArr3[4];
            long j25 = j16 + jArr3[5] + jArr4[0];
            long j26 = j17 + jArr3[6] + jArr4[1];
            int i11 = 1;
            long j27 = j19;
            long j28 = j23;
            long j29 = j18 + jArr3[7];
            long j31 = j26;
            long j32 = j22;
            long j33 = j25;
            long j34 = j24;
            while (i11 < 18) {
                int i12 = iArr[i11];
                int i13 = iArr2[i11];
                long j35 = j28;
                long j36 = j27 + j21;
                long jRotlXor = ThreefishEngine.rotlXor(j21, 46, j36);
                long[] jArr5 = jArr3;
                long j37 = j32 + j35;
                long[] jArr6 = jArr4;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long jRotlXor2 = ThreefishEngine.rotlXor(j35, 36, j37);
                long j38 = j34 + j33;
                long jRotlXor3 = ThreefishEngine.rotlXor(j33, 19, j38);
                long j39 = j31 + j29;
                long jRotlXor4 = ThreefishEngine.rotlXor(j29, 37, j39);
                long j41 = j37 + jRotlXor;
                long jRotlXor5 = ThreefishEngine.rotlXor(jRotlXor, 33, j41);
                long j42 = j38 + jRotlXor4;
                long jRotlXor6 = ThreefishEngine.rotlXor(jRotlXor4, 27, j42);
                long j43 = j39 + jRotlXor3;
                long jRotlXor7 = ThreefishEngine.rotlXor(jRotlXor3, 14, j43);
                long j44 = j36 + jRotlXor2;
                long jRotlXor8 = ThreefishEngine.rotlXor(jRotlXor2, 42, j44);
                long j45 = j42 + jRotlXor5;
                long jRotlXor9 = ThreefishEngine.rotlXor(jRotlXor5, 17, j45);
                long j46 = j43 + jRotlXor8;
                long jRotlXor10 = ThreefishEngine.rotlXor(jRotlXor8, 49, j46);
                long j47 = j44 + jRotlXor7;
                long jRotlXor11 = ThreefishEngine.rotlXor(jRotlXor7, 36, j47);
                long j48 = j41 + jRotlXor6;
                long jRotlXor12 = ThreefishEngine.rotlXor(jRotlXor6, 39, j48);
                int i14 = i11;
                long j49 = j46 + jRotlXor9;
                long jRotlXor13 = ThreefishEngine.rotlXor(jRotlXor9, 44, j49);
                long j51 = j47 + jRotlXor12;
                long jRotlXor14 = ThreefishEngine.rotlXor(jRotlXor12, 9, j51);
                long j52 = j48 + jRotlXor11;
                long jRotlXor15 = ThreefishEngine.rotlXor(jRotlXor11, 54, j52);
                long j53 = j45 + jRotlXor10;
                long jRotlXor16 = ThreefishEngine.rotlXor(jRotlXor10, 56, j53);
                long j54 = j51 + jArr5[i12];
                int i15 = i12 + 1;
                long j55 = jRotlXor13 + jArr5[i15];
                int i16 = i12 + 2;
                long j56 = j52 + jArr5[i16];
                int i17 = i12 + 3;
                long j57 = jRotlXor16 + jArr5[i17];
                int i18 = i12 + 4;
                long j58 = j53 + jArr5[i18];
                int i19 = i12 + 5;
                long j59 = jRotlXor15 + jArr5[i19] + jArr6[i13];
                int i21 = i12 + 6;
                int i22 = i13 + 1;
                long j61 = j49 + jArr5[i21] + jArr6[i22];
                int i23 = i12 + 7;
                long j62 = i14;
                long j63 = jRotlXor14 + jArr5[i23] + j62;
                long j64 = j54 + j55;
                long jRotlXor17 = ThreefishEngine.rotlXor(j55, 39, j64);
                long j65 = j56 + j57;
                long jRotlXor18 = ThreefishEngine.rotlXor(j57, 30, j65);
                long j66 = j58 + j59;
                long jRotlXor19 = ThreefishEngine.rotlXor(j59, 34, j66);
                long j67 = j61 + j63;
                long jRotlXor20 = ThreefishEngine.rotlXor(j63, 24, j67);
                long j68 = j65 + jRotlXor17;
                long jRotlXor21 = ThreefishEngine.rotlXor(jRotlXor17, 13, j68);
                long j69 = j66 + jRotlXor20;
                long jRotlXor22 = ThreefishEngine.rotlXor(jRotlXor20, 50, j69);
                long j71 = j67 + jRotlXor19;
                long jRotlXor23 = ThreefishEngine.rotlXor(jRotlXor19, 10, j71);
                long j72 = j64 + jRotlXor18;
                long jRotlXor24 = ThreefishEngine.rotlXor(jRotlXor18, 17, j72);
                long j73 = j69 + jRotlXor21;
                long jRotlXor25 = ThreefishEngine.rotlXor(jRotlXor21, 25, j73);
                long j74 = j71 + jRotlXor24;
                long jRotlXor26 = ThreefishEngine.rotlXor(jRotlXor24, 29, j74);
                long j75 = j72 + jRotlXor23;
                long jRotlXor27 = ThreefishEngine.rotlXor(jRotlXor23, 39, j75);
                long j76 = j68 + jRotlXor22;
                long jRotlXor28 = ThreefishEngine.rotlXor(jRotlXor22, 43, j76);
                long j77 = j74 + jRotlXor25;
                long jRotlXor29 = ThreefishEngine.rotlXor(jRotlXor25, 8, j77);
                long j78 = j75 + jRotlXor28;
                long jRotlXor30 = ThreefishEngine.rotlXor(jRotlXor28, 35, j78);
                long j79 = j76 + jRotlXor27;
                long jRotlXor31 = ThreefishEngine.rotlXor(jRotlXor27, 56, j79);
                long j81 = j73 + jRotlXor26;
                long jRotlXor32 = ThreefishEngine.rotlXor(jRotlXor26, 22, j81);
                long j82 = j78 + jArr5[i15];
                long j83 = jRotlXor29 + jArr5[i16];
                long j84 = j79 + jArr5[i17];
                long j85 = jRotlXor32 + jArr5[i18];
                long j86 = j81 + jArr5[i19];
                long j87 = jRotlXor31 + jArr5[i21] + jArr6[i22];
                j31 = j77 + jArr5[i23] + jArr6[i13 + 2];
                j32 = j84;
                j27 = j82;
                j34 = j86;
                jArr4 = jArr6;
                iArr = iArr3;
                j21 = j83;
                j33 = j87;
                j29 = jArr5[i12 + 8] + j62 + 1 + jRotlXor30;
                i11 = i14 + 2;
                iArr2 = iArr4;
                j28 = j85;
                jArr3 = jArr5;
            }
            jArr2[0] = j27;
            jArr2[1] = j21;
            jArr2[2] = j32;
            jArr2[3] = j28;
            jArr2[4] = j34;
            jArr2[5] = j33;
            jArr2[6] = j31;
            jArr2[7] = j29;
        }
    }

    private static abstract class ThreefishCipher {

        /* JADX INFO: renamed from: kw, reason: collision with root package name */
        protected final long[] f99499kw;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        protected final long[] f99500t;

        protected ThreefishCipher(long[] jArr, long[] jArr2) {
            this.f99499kw = jArr;
            this.f99500t = jArr2;
        }

        abstract void decryptBlock(long[] jArr, long[] jArr2);

        abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i11 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i11 >= iArr2.length) {
                return;
            }
            MOD17[i11] = i11 % 17;
            iArr2[i11] = i11 % 9;
            MOD5[i11] = i11 % 5;
            MOD3[i11] = i11 % 3;
            i11++;
        }
    }

    public ThreefishEngine(int i11) {
        long[] jArr = new long[5];
        this.f99498t = jArr;
        int i12 = i11 / 8;
        this.blocksizeBytes = i12;
        int i13 = i12 / 8;
        this.blocksizeWords = i13;
        this.currentBlock = new long[i13];
        long[] jArr2 = new long[(i13 * 2) + 1];
        this.f99497kw = jArr2;
        if (i11 == 256) {
            this.cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i11 == 512) {
            this.cipher = new Threefish512Cipher(jArr2, jArr);
        } else {
            if (i11 != 1024) {
                throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
            }
            this.cipher = new Threefish1024Cipher(jArr2, jArr);
        }
    }

    public static long bytesToWord(byte[] bArr, int i11) {
        if (i11 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        long j11 = (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40);
        return ((((long) bArr[i11 + 7]) & 255) << 56) | j11 | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    static long rotlXor(long j11, int i11, long j12) {
        return ((j11 >>> (-i11)) | (j11 << i11)) ^ j12;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeWords + " words)");
        }
        long j11 = C_240;
        int i11 = 0;
        while (true) {
            int i12 = this.blocksizeWords;
            if (i11 >= i12) {
                long[] jArr2 = this.f99497kw;
                jArr2[i12] = j11;
                System.arraycopy(jArr2, 0, jArr2, i12 + 1, i12);
                return;
            } else {
                long[] jArr3 = this.f99497kw;
                long j12 = jArr[i11];
                jArr3[i11] = j12;
                j11 ^= j12;
                i11++;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f99498t;
        long j11 = jArr[0];
        jArr2[0] = j11;
        long j12 = jArr[1];
        jArr2[1] = j12;
        jArr2[2] = j11 ^ j12;
        jArr2[3] = j11;
        jArr2[4] = j12;
    }

    public static void wordToBytes(long j11, byte[] bArr, int i11) {
        if (i11 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
        bArr[i11] = (byte) j11;
        bArr[i11 + 1] = (byte) (j11 >> 8);
        bArr[i11 + 2] = (byte) (j11 >> 16);
        bArr[i11 + 3] = (byte) (j11 >> 24);
        bArr[i11 + 4] = (byte) (j11 >> 32);
        bArr[i11 + 5] = (byte) (j11 >> 40);
        bArr[i11 + 6] = (byte) (j11 >> 48);
        bArr[i11 + 7] = (byte) (j11 >> 56);
    }

    static long xorRotr(long j11, int i11, long j12) {
        long j13 = j11 ^ j12;
        return (j13 << (-i11)) | (j13 >>> i11);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] key;
        byte[] tweak;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            tweak = tweakableBlockCipherParameters.getTweak();
        } else {
            if (!(cipherParameters instanceof KeyParameter)) {
                throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + cipherParameters.getClass().getName());
            }
            key = ((KeyParameter) cipherParameters).getKey();
            tweak = null;
        }
        if (key == null) {
            jArr = null;
        } else {
            if (key.length != this.blocksizeBytes) {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeBytes + " bytes)");
            }
            int i11 = this.blocksizeWords;
            jArr = new long[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                jArr[i12] = bytesToWord(key, i12 * 8);
            }
        }
        if (tweak != null) {
            if (tweak.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(tweak, 0), bytesToWord(tweak, 8)};
        }
        init(z11, jArr, jArr2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.blocksizeBytes;
        if (i12 + i13 > bArr2.length) {
            throw new DataLengthException("Output buffer too short");
        }
        if (i13 + i11 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.blocksizeBytes; i15 += 8) {
            this.currentBlock[i15 >> 3] = bytesToWord(bArr, i11 + i15);
        }
        long[] jArr = this.currentBlock;
        processBlock(jArr, jArr);
        while (true) {
            int i16 = this.blocksizeBytes;
            if (i14 >= i16) {
                return i16;
            }
            wordToBytes(this.currentBlock[i14 >> 3], bArr2, i12 + i14);
            i14 += 8;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f99497kw;
        int i11 = this.blocksizeWords;
        if (jArr3[i11] != 0) {
            if (jArr.length == i11) {
                if (jArr2.length == i11) {
                    if (this.forEncryption) {
                        this.cipher.encryptBlock(jArr, jArr2);
                    } else {
                        this.cipher.decryptBlock(jArr, jArr2);
                    }
                    return this.blocksizeWords;
                }
                throw new DataLengthException("Output buffer too short");
            }
            throw new DataLengthException("Input buffer too short");
        }
        throw new IllegalStateException("Threefish engine not initialised");
    }

    public void init(boolean z11, long[] jArr, long[] jArr2) {
        this.forEncryption = z11;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }
}
