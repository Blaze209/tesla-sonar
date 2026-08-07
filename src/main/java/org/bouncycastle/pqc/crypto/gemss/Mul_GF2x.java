package org.bouncycastle.pqc.crypto.gemss;

/* JADX INFO: loaded from: classes10.dex */
abstract class Mul_GF2x {

    public static class Mul12 extends Mul_GF2x {
        private long[] Buffer = new long[12];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul384_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i11 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul13 extends Mul_GF2x {
        private long[] Buffer = new long[13];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul416_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.Buffer, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            jArr[12] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i11 + 6]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 8, jArr2, i11 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul17 extends Mul_GF2x {
        private long[] AA = new long[5];
        private long[] BB = new long[5];
        private long[] Buffer1 = new long[17];
        private long[] Buffer2 = new long[4];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x(pointer.array, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.AA, this.BB, this.Buffer1);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul544_no_simd_gf2x_xor(pointer.array, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.AA, this.BB, this.Buffer1, this.Buffer2);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            jArr[16] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i11 + 8]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 8, jArr2, i11 + 4);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul6 extends Mul_GF2x {
        private long[] Buffer = new long[6];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul192_no_simd_gf2x_xor(pointer.array, pointer.f99075cp, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            Mul_GF2x.SQR64_NO_SIMD_GF2X(jArr, 4, jArr2[i11 + 2]);
            Mul_GF2x.SQR128_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    public static class Mul9 extends Mul_GF2x {
        private long[] Buffer = new long[9];

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x(pointer.array, 0, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3) {
            Mul_GF2x.mul288_no_simd_gf2x_xor(pointer.array, pointer.f99075cp, pointer2.array, pointer2.f99075cp, pointer3.array, pointer3.f99075cp, this.Buffer);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Mul_GF2x
        public void sqr_gf2x(long[] jArr, long[] jArr2, int i11) {
            jArr[8] = Mul_GF2x.SQR32_NO_SIMD_GF2X(jArr2[i11 + 4]);
            Mul_GF2x.SQR256_NO_SIMD_GF2X(jArr, 0, jArr2, i11);
        }
    }

    Mul_GF2x() {
    }

    private static long MUL32_NO_SIMD_GF2X(long j11, long j12) {
        return ((j11 & (-((j12 >>> 31) & 1))) << 31) ^ ((((((((((((((((((((((((((((((((-(j12 & 1)) & j11) ^ (((-((j12 >>> 1) & 1)) & j11) << 1)) ^ (((-((j12 >>> 2) & 1)) & j11) << 2)) ^ (((-((j12 >>> 3) & 1)) & j11) << 3)) ^ (((-((j12 >>> 4) & 1)) & j11) << 4)) ^ (((-((j12 >>> 5) & 1)) & j11) << 5)) ^ (((-((j12 >>> 6) & 1)) & j11) << 6)) ^ (((-((j12 >>> 7) & 1)) & j11) << 7)) ^ (((-((j12 >>> 8) & 1)) & j11) << 8)) ^ (((-((j12 >>> 9) & 1)) & j11) << 9)) ^ (((-((j12 >>> 10) & 1)) & j11) << 10)) ^ (((-((j12 >>> 11) & 1)) & j11) << 11)) ^ (((-((j12 >>> 12) & 1)) & j11) << 12)) ^ (((-((j12 >>> 13) & 1)) & j11) << 13)) ^ (((-((j12 >>> 14) & 1)) & j11) << 14)) ^ (((-((j12 >>> 15) & 1)) & j11) << 15)) ^ (((-((j12 >>> 16) & 1)) & j11) << 16)) ^ (((-((j12 >>> 17) & 1)) & j11) << 17)) ^ (((-((j12 >>> 18) & 1)) & j11) << 18)) ^ (((-((j12 >>> 19) & 1)) & j11) << 19)) ^ (((-((j12 >>> 20) & 1)) & j11) << 20)) ^ (((-((j12 >>> 21) & 1)) & j11) << 21)) ^ (((-((j12 >>> 22) & 1)) & j11) << 22)) ^ (((-((j12 >>> 23) & 1)) & j11) << 23)) ^ (((-((j12 >>> 24) & 1)) & j11) << 24)) ^ (((-((j12 >>> 25) & 1)) & j11) << 25)) ^ (((-((j12 >>> 26) & 1)) & j11) << 26)) ^ (((-((j12 >>> 27) & 1)) & j11) << 27)) ^ (((-((j12 >>> 28) & 1)) & j11) << 28)) ^ (((-((j12 >>> 29) & 1)) & j11) << 29)) ^ (((-((j12 >>> 30) & 1)) & j11) << 30));
    }

    private static void MUL64_NO_SIMD_GF2X(long[] jArr, int i11, long j11, long j12) {
        long j13 = (-(j12 >>> 63)) & j11;
        long j14 = (-((j12 >>> 1) & 1)) & j11;
        long j15 = (((-(j12 & 1)) & j11) ^ (j13 << 63)) ^ (j14 << 1);
        long j16 = (j13 >>> 1) ^ (j14 >>> 63);
        long j17 = (-((j12 >>> 2) & 1)) & j11;
        long j18 = (-((j12 >>> 3) & 1)) & j11;
        long j19 = (-((j12 >>> 4) & 1)) & j11;
        long j21 = (-((j12 >>> 5) & 1)) & j11;
        long j22 = (((j15 ^ (j17 << 2)) ^ (j18 << 3)) ^ (j19 << 4)) ^ (j21 << 5);
        long j23 = (j21 >>> 59) ^ (((j16 ^ (j17 >>> 62)) ^ (j18 >>> 61)) ^ (j19 >>> 60));
        long j24 = (-((j12 >>> 6) & 1)) & j11;
        long j25 = j22 ^ (j24 << 6);
        long j26 = j23 ^ (j24 >>> 58);
        long j27 = (-((j12 >>> 7) & 1)) & j11;
        long j28 = j25 ^ (j27 << 7);
        long j29 = j26 ^ (j27 >>> 57);
        long j31 = (-((j12 >>> 8) & 1)) & j11;
        long j32 = j28 ^ (j31 << 8);
        long j33 = j29 ^ (j31 >>> 56);
        long j34 = (-((j12 >>> 9) & 1)) & j11;
        long j35 = j32 ^ (j34 << 9);
        long j36 = j33 ^ (j34 >>> 55);
        long j37 = (-((j12 >>> 10) & 1)) & j11;
        long j38 = j35 ^ (j37 << 10);
        long j39 = j36 ^ (j37 >>> 54);
        long j41 = (-((j12 >>> 11) & 1)) & j11;
        long j42 = j38 ^ (j41 << 11);
        long j43 = j39 ^ (j41 >>> 53);
        long j44 = (-((j12 >>> 12) & 1)) & j11;
        long j45 = j42 ^ (j44 << 12);
        long j46 = j43 ^ (j44 >>> 52);
        long j47 = (-((j12 >>> 13) & 1)) & j11;
        long j48 = j45 ^ (j47 << 13);
        long j49 = j46 ^ (j47 >>> 51);
        long j51 = (-((j12 >>> 14) & 1)) & j11;
        long j52 = j48 ^ (j51 << 14);
        long j53 = j49 ^ (j51 >>> 50);
        long j54 = (-((j12 >>> 15) & 1)) & j11;
        long j55 = j52 ^ (j54 << 15);
        long j56 = j53 ^ (j54 >>> 49);
        long j57 = (-((j12 >>> 16) & 1)) & j11;
        long j58 = j55 ^ (j57 << 16);
        long j59 = j56 ^ (j57 >>> 48);
        long j61 = (-((j12 >>> 17) & 1)) & j11;
        long j62 = j58 ^ (j61 << 17);
        long j63 = j59 ^ (j61 >>> 47);
        long j64 = (-((j12 >>> 18) & 1)) & j11;
        long j65 = j62 ^ (j64 << 18);
        long j66 = j63 ^ (j64 >>> 46);
        long j67 = (-((j12 >>> 19) & 1)) & j11;
        long j68 = j65 ^ (j67 << 19);
        long j69 = j66 ^ (j67 >>> 45);
        long j71 = (-((j12 >>> 20) & 1)) & j11;
        long j72 = j68 ^ (j71 << 20);
        long j73 = j69 ^ (j71 >>> 44);
        long j74 = (-((j12 >>> 21) & 1)) & j11;
        long j75 = j72 ^ (j74 << 21);
        long j76 = j73 ^ (j74 >>> 43);
        long j77 = (-((j12 >>> 22) & 1)) & j11;
        long j78 = j75 ^ (j77 << 22);
        long j79 = j76 ^ (j77 >>> 42);
        long j81 = (-((j12 >>> 23) & 1)) & j11;
        long j82 = j78 ^ (j81 << 23);
        long j83 = j79 ^ (j81 >>> 41);
        long j84 = (-((j12 >>> 24) & 1)) & j11;
        long j85 = j82 ^ (j84 << 24);
        long j86 = j83 ^ (j84 >>> 40);
        long j87 = (-((j12 >>> 25) & 1)) & j11;
        long j88 = j85 ^ (j87 << 25);
        long j89 = j86 ^ (j87 >>> 39);
        long j91 = (-((j12 >>> 26) & 1)) & j11;
        long j92 = j88 ^ (j91 << 26);
        long j93 = j89 ^ (j91 >>> 38);
        long j94 = (-((j12 >>> 27) & 1)) & j11;
        long j95 = j92 ^ (j94 << 27);
        long j96 = j93 ^ (j94 >>> 37);
        long j97 = (-((j12 >>> 28) & 1)) & j11;
        long j98 = j95 ^ (j97 << 28);
        long j99 = j96 ^ (j97 >>> 36);
        long j100 = (-((j12 >>> 29) & 1)) & j11;
        long j101 = j98 ^ (j100 << 29);
        long j102 = j99 ^ (j100 >>> 35);
        long j103 = (-((j12 >>> 30) & 1)) & j11;
        long j104 = j101 ^ (j103 << 30);
        long j105 = j102 ^ (j103 >>> 34);
        long j106 = (-((j12 >>> 31) & 1)) & j11;
        long j107 = j104 ^ (j106 << 31);
        long j108 = j105 ^ (j106 >>> 33);
        long j109 = (-((j12 >>> 32) & 1)) & j11;
        long j110 = j107 ^ (j109 << 32);
        long j111 = j108 ^ (j109 >>> 32);
        long j112 = (-((j12 >>> 33) & 1)) & j11;
        long j113 = j110 ^ (j112 << 33);
        long j114 = j111 ^ (j112 >>> 31);
        long j115 = (-((j12 >>> 34) & 1)) & j11;
        long j116 = j113 ^ (j115 << 34);
        long j117 = j114 ^ (j115 >>> 30);
        long j118 = (-((j12 >>> 35) & 1)) & j11;
        long j119 = j116 ^ (j118 << 35);
        long j120 = j117 ^ (j118 >>> 29);
        long j121 = (-((j12 >>> 36) & 1)) & j11;
        long j122 = j119 ^ (j121 << 36);
        long j123 = j120 ^ (j121 >>> 28);
        long j124 = (-((j12 >>> 37) & 1)) & j11;
        long j125 = j122 ^ (j124 << 37);
        long j126 = j123 ^ (j124 >>> 27);
        long j127 = (-((j12 >>> 38) & 1)) & j11;
        long j128 = j125 ^ (j127 << 38);
        long j129 = j126 ^ (j127 >>> 26);
        long j130 = (-((j12 >>> 39) & 1)) & j11;
        long j131 = j128 ^ (j130 << 39);
        long j132 = j129 ^ (j130 >>> 25);
        long j133 = (-((j12 >>> 40) & 1)) & j11;
        long j134 = j131 ^ (j133 << 40);
        long j135 = j132 ^ (j133 >>> 24);
        long j136 = (-((j12 >>> 41) & 1)) & j11;
        long j137 = j134 ^ (j136 << 41);
        long j138 = j135 ^ (j136 >>> 23);
        long j139 = (-((j12 >>> 42) & 1)) & j11;
        long j140 = j137 ^ (j139 << 42);
        long j141 = j138 ^ (j139 >>> 22);
        long j142 = (-((j12 >>> 43) & 1)) & j11;
        long j143 = j140 ^ (j142 << 43);
        long j144 = j141 ^ (j142 >>> 21);
        long j145 = (-((j12 >>> 44) & 1)) & j11;
        long j146 = j143 ^ (j145 << 44);
        long j147 = j144 ^ (j145 >>> 20);
        long j148 = (-((j12 >>> 45) & 1)) & j11;
        long j149 = j146 ^ (j148 << 45);
        long j150 = j147 ^ (j148 >>> 19);
        long j151 = (-((j12 >>> 46) & 1)) & j11;
        long j152 = j149 ^ (j151 << 46);
        long j153 = j150 ^ (j151 >>> 18);
        long j154 = (-((j12 >>> 47) & 1)) & j11;
        long j155 = j152 ^ (j154 << 47);
        long j156 = j153 ^ (j154 >>> 17);
        long j157 = (-((j12 >>> 48) & 1)) & j11;
        long j158 = j155 ^ (j157 << 48);
        long j159 = j156 ^ (j157 >>> 16);
        long j160 = (-((j12 >>> 49) & 1)) & j11;
        long j161 = j158 ^ (j160 << 49);
        long j162 = j159 ^ (j160 >>> 15);
        long j163 = (-((j12 >>> 50) & 1)) & j11;
        long j164 = j161 ^ (j163 << 50);
        long j165 = j162 ^ (j163 >>> 14);
        long j166 = (-((j12 >>> 51) & 1)) & j11;
        long j167 = j164 ^ (j166 << 51);
        long j168 = j165 ^ (j166 >>> 13);
        long j169 = (-((j12 >>> 52) & 1)) & j11;
        long j170 = j167 ^ (j169 << 52);
        long j171 = j168 ^ (j169 >>> 12);
        long j172 = (-((j12 >>> 53) & 1)) & j11;
        long j173 = j170 ^ (j172 << 53);
        long j174 = j171 ^ (j172 >>> 11);
        long j175 = (-((j12 >>> 54) & 1)) & j11;
        long j176 = j173 ^ (j175 << 54);
        long j177 = j174 ^ (j175 >>> 10);
        long j178 = (-((j12 >>> 55) & 1)) & j11;
        long j179 = j176 ^ (j178 << 55);
        long j180 = j177 ^ (j178 >>> 9);
        long j181 = (-((j12 >>> 56) & 1)) & j11;
        long j182 = j179 ^ (j181 << 56);
        long j183 = j180 ^ (j181 >>> 8);
        long j184 = (-((j12 >>> 57) & 1)) & j11;
        long j185 = j182 ^ (j184 << 57);
        long j186 = j183 ^ (j184 >>> 7);
        long j187 = (-((j12 >>> 58) & 1)) & j11;
        long j188 = j185 ^ (j187 << 58);
        long j189 = j186 ^ (j187 >>> 6);
        long j190 = (-((j12 >>> 59) & 1)) & j11;
        long j191 = j188 ^ (j190 << 59);
        long j192 = j189 ^ (j190 >>> 5);
        long j193 = (-((j12 >>> 60) & 1)) & j11;
        long j194 = j191 ^ (j193 << 60);
        long j195 = j192 ^ (j193 >>> 4);
        long j196 = (-((j12 >>> 61) & 1)) & j11;
        long j197 = j194 ^ (j196 << 61);
        long j198 = j195 ^ (j196 >>> 3);
        long j199 = (-((j12 >>> 62) & 1)) & j11;
        jArr[i11] = j197 ^ (j199 << 62);
        jArr[i11 + 1] = j198 ^ (j199 >>> 2);
    }

    private static void MUL64_NO_SIMD_GF2X_XOR(long[] jArr, int i11, long j11, long j12) {
        long j13 = (-(j12 >>> 63)) & j11;
        long j14 = (-((j12 >>> 1) & 1)) & j11;
        long j15 = (((-(j12 & 1)) & j11) ^ (j13 << 63)) ^ (j14 << 1);
        long j16 = (j13 >>> 1) ^ (j14 >>> 63);
        long j17 = (-((j12 >>> 2) & 1)) & j11;
        long j18 = (-((j12 >>> 3) & 1)) & j11;
        long j19 = (-((j12 >>> 4) & 1)) & j11;
        long j21 = (-((j12 >>> 5) & 1)) & j11;
        long j22 = (((j15 ^ (j17 << 2)) ^ (j18 << 3)) ^ (j19 << 4)) ^ (j21 << 5);
        long j23 = (j21 >>> 59) ^ (((j16 ^ (j17 >>> 62)) ^ (j18 >>> 61)) ^ (j19 >>> 60));
        long j24 = (-((j12 >>> 6) & 1)) & j11;
        long j25 = j22 ^ (j24 << 6);
        long j26 = j23 ^ (j24 >>> 58);
        long j27 = (-((j12 >>> 7) & 1)) & j11;
        long j28 = j25 ^ (j27 << 7);
        long j29 = j26 ^ (j27 >>> 57);
        long j31 = (-((j12 >>> 8) & 1)) & j11;
        long j32 = j28 ^ (j31 << 8);
        long j33 = j29 ^ (j31 >>> 56);
        long j34 = (-((j12 >>> 9) & 1)) & j11;
        long j35 = j32 ^ (j34 << 9);
        long j36 = j33 ^ (j34 >>> 55);
        long j37 = (-((j12 >>> 10) & 1)) & j11;
        long j38 = j35 ^ (j37 << 10);
        long j39 = j36 ^ (j37 >>> 54);
        long j41 = (-((j12 >>> 11) & 1)) & j11;
        long j42 = j38 ^ (j41 << 11);
        long j43 = j39 ^ (j41 >>> 53);
        long j44 = (-((j12 >>> 12) & 1)) & j11;
        long j45 = j42 ^ (j44 << 12);
        long j46 = j43 ^ (j44 >>> 52);
        long j47 = (-((j12 >>> 13) & 1)) & j11;
        long j48 = j45 ^ (j47 << 13);
        long j49 = j46 ^ (j47 >>> 51);
        long j51 = (-((j12 >>> 14) & 1)) & j11;
        long j52 = j48 ^ (j51 << 14);
        long j53 = j49 ^ (j51 >>> 50);
        long j54 = (-((j12 >>> 15) & 1)) & j11;
        long j55 = j52 ^ (j54 << 15);
        long j56 = j53 ^ (j54 >>> 49);
        long j57 = (-((j12 >>> 16) & 1)) & j11;
        long j58 = j55 ^ (j57 << 16);
        long j59 = j56 ^ (j57 >>> 48);
        long j61 = (-((j12 >>> 17) & 1)) & j11;
        long j62 = j58 ^ (j61 << 17);
        long j63 = j59 ^ (j61 >>> 47);
        long j64 = (-((j12 >>> 18) & 1)) & j11;
        long j65 = j62 ^ (j64 << 18);
        long j66 = j63 ^ (j64 >>> 46);
        long j67 = (-((j12 >>> 19) & 1)) & j11;
        long j68 = j65 ^ (j67 << 19);
        long j69 = j66 ^ (j67 >>> 45);
        long j71 = (-((j12 >>> 20) & 1)) & j11;
        long j72 = j68 ^ (j71 << 20);
        long j73 = j69 ^ (j71 >>> 44);
        long j74 = (-((j12 >>> 21) & 1)) & j11;
        long j75 = j72 ^ (j74 << 21);
        long j76 = j73 ^ (j74 >>> 43);
        long j77 = (-((j12 >>> 22) & 1)) & j11;
        long j78 = j75 ^ (j77 << 22);
        long j79 = j76 ^ (j77 >>> 42);
        long j81 = (-((j12 >>> 23) & 1)) & j11;
        long j82 = j78 ^ (j81 << 23);
        long j83 = j79 ^ (j81 >>> 41);
        long j84 = (-((j12 >>> 24) & 1)) & j11;
        long j85 = j82 ^ (j84 << 24);
        long j86 = j83 ^ (j84 >>> 40);
        long j87 = (-((j12 >>> 25) & 1)) & j11;
        long j88 = j85 ^ (j87 << 25);
        long j89 = j86 ^ (j87 >>> 39);
        long j91 = (-((j12 >>> 26) & 1)) & j11;
        long j92 = j88 ^ (j91 << 26);
        long j93 = j89 ^ (j91 >>> 38);
        long j94 = (-((j12 >>> 27) & 1)) & j11;
        long j95 = j92 ^ (j94 << 27);
        long j96 = j93 ^ (j94 >>> 37);
        long j97 = (-((j12 >>> 28) & 1)) & j11;
        long j98 = j95 ^ (j97 << 28);
        long j99 = j96 ^ (j97 >>> 36);
        long j100 = (-((j12 >>> 29) & 1)) & j11;
        long j101 = j98 ^ (j100 << 29);
        long j102 = j99 ^ (j100 >>> 35);
        long j103 = (-((j12 >>> 30) & 1)) & j11;
        long j104 = j101 ^ (j103 << 30);
        long j105 = j102 ^ (j103 >>> 34);
        long j106 = (-((j12 >>> 31) & 1)) & j11;
        long j107 = j104 ^ (j106 << 31);
        long j108 = j105 ^ (j106 >>> 33);
        long j109 = (-((j12 >>> 32) & 1)) & j11;
        long j110 = j107 ^ (j109 << 32);
        long j111 = j108 ^ (j109 >>> 32);
        long j112 = (-((j12 >>> 33) & 1)) & j11;
        long j113 = j110 ^ (j112 << 33);
        long j114 = j111 ^ (j112 >>> 31);
        long j115 = (-((j12 >>> 34) & 1)) & j11;
        long j116 = j113 ^ (j115 << 34);
        long j117 = j114 ^ (j115 >>> 30);
        long j118 = (-((j12 >>> 35) & 1)) & j11;
        long j119 = j116 ^ (j118 << 35);
        long j120 = j117 ^ (j118 >>> 29);
        long j121 = (-((j12 >>> 36) & 1)) & j11;
        long j122 = j119 ^ (j121 << 36);
        long j123 = j120 ^ (j121 >>> 28);
        long j124 = (-((j12 >>> 37) & 1)) & j11;
        long j125 = j122 ^ (j124 << 37);
        long j126 = j123 ^ (j124 >>> 27);
        long j127 = (-((j12 >>> 38) & 1)) & j11;
        long j128 = j125 ^ (j127 << 38);
        long j129 = j126 ^ (j127 >>> 26);
        long j130 = (-((j12 >>> 39) & 1)) & j11;
        long j131 = j128 ^ (j130 << 39);
        long j132 = j129 ^ (j130 >>> 25);
        long j133 = (-((j12 >>> 40) & 1)) & j11;
        long j134 = j131 ^ (j133 << 40);
        long j135 = j132 ^ (j133 >>> 24);
        long j136 = (-((j12 >>> 41) & 1)) & j11;
        long j137 = j134 ^ (j136 << 41);
        long j138 = j135 ^ (j136 >>> 23);
        long j139 = (-((j12 >>> 42) & 1)) & j11;
        long j140 = j137 ^ (j139 << 42);
        long j141 = j138 ^ (j139 >>> 22);
        long j142 = (-((j12 >>> 43) & 1)) & j11;
        long j143 = j140 ^ (j142 << 43);
        long j144 = j141 ^ (j142 >>> 21);
        long j145 = (-((j12 >>> 44) & 1)) & j11;
        long j146 = j143 ^ (j145 << 44);
        long j147 = j144 ^ (j145 >>> 20);
        long j148 = (-((j12 >>> 45) & 1)) & j11;
        long j149 = j146 ^ (j148 << 45);
        long j150 = j147 ^ (j148 >>> 19);
        long j151 = (-((j12 >>> 46) & 1)) & j11;
        long j152 = j149 ^ (j151 << 46);
        long j153 = j150 ^ (j151 >>> 18);
        long j154 = (-((j12 >>> 47) & 1)) & j11;
        long j155 = j152 ^ (j154 << 47);
        long j156 = j153 ^ (j154 >>> 17);
        long j157 = (-((j12 >>> 48) & 1)) & j11;
        long j158 = j155 ^ (j157 << 48);
        long j159 = j156 ^ (j157 >>> 16);
        long j160 = (-((j12 >>> 49) & 1)) & j11;
        long j161 = j158 ^ (j160 << 49);
        long j162 = j159 ^ (j160 >>> 15);
        long j163 = (-((j12 >>> 50) & 1)) & j11;
        long j164 = j161 ^ (j163 << 50);
        long j165 = j162 ^ (j163 >>> 14);
        long j166 = (-((j12 >>> 51) & 1)) & j11;
        long j167 = j164 ^ (j166 << 51);
        long j168 = j165 ^ (j166 >>> 13);
        long j169 = (-((j12 >>> 52) & 1)) & j11;
        long j170 = j167 ^ (j169 << 52);
        long j171 = j168 ^ (j169 >>> 12);
        long j172 = (-((j12 >>> 53) & 1)) & j11;
        long j173 = j170 ^ (j172 << 53);
        long j174 = j171 ^ (j172 >>> 11);
        long j175 = (-((j12 >>> 54) & 1)) & j11;
        long j176 = j173 ^ (j175 << 54);
        long j177 = j174 ^ (j175 >>> 10);
        long j178 = (-((j12 >>> 55) & 1)) & j11;
        long j179 = j176 ^ (j178 << 55);
        long j180 = j177 ^ (j178 >>> 9);
        long j181 = (-((j12 >>> 56) & 1)) & j11;
        long j182 = j179 ^ (j181 << 56);
        long j183 = j180 ^ (j181 >>> 8);
        long j184 = (-((j12 >>> 57) & 1)) & j11;
        long j185 = j182 ^ (j184 << 57);
        long j186 = j183 ^ (j184 >>> 7);
        long j187 = (-((j12 >>> 58) & 1)) & j11;
        long j188 = j185 ^ (j187 << 58);
        long j189 = j186 ^ (j187 >>> 6);
        long j190 = (-((j12 >>> 59) & 1)) & j11;
        long j191 = j188 ^ (j190 << 59);
        long j192 = j189 ^ (j190 >>> 5);
        long j193 = (-((j12 >>> 60) & 1)) & j11;
        long j194 = j191 ^ (j193 << 60);
        long j195 = j192 ^ (j193 >>> 4);
        long j196 = (-((j12 >>> 61) & 1)) & j11;
        long j197 = j194 ^ (j196 << 61);
        long j198 = j195 ^ (j196 >>> 3);
        long j199 = (-((j12 >>> 62) & 1)) & j11;
        jArr[i11] = (j197 ^ (j199 << 62)) ^ jArr[i11];
        int i12 = i11 + 1;
        jArr[i12] = (j198 ^ (j199 >>> 2)) ^ jArr[i12];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR128_NO_SIMD_GF2X(long[] jArr, int i11, long[] jArr2, int i12) {
        SQR64_NO_SIMD_GF2X(jArr, i11 + 2, jArr2[i12 + 1]);
        SQR64_NO_SIMD_GF2X(jArr, i11, jArr2[i12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR256_NO_SIMD_GF2X(long[] jArr, int i11, long[] jArr2, int i12) {
        SQR128_NO_SIMD_GF2X(jArr, i11 + 4, jArr2, i12 + 2);
        SQR128_NO_SIMD_GF2X(jArr, i11, jArr2, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long SQR32_NO_SIMD_GF2X(long j11) {
        long j12 = (j11 ^ (j11 << 16)) & 281470681808895L;
        long j13 = (j12 ^ (j12 << 8)) & 71777214294589695L;
        long j14 = (j13 ^ (j13 << 4)) & 1085102592571150095L;
        long j15 = (j14 ^ (j14 << 2)) & 3689348814741910323L;
        return (j15 ^ (j15 << 1)) & 6148914691236517205L;
    }

    private static long SQR64LOW_NO_SIMD_GF2X(long j11) {
        long j12 = ((j11 << 16) ^ (4294967295L & j11)) & 281470681808895L;
        long j13 = (j12 ^ (j12 << 8)) & 71777214294589695L;
        long j14 = (j13 ^ (j13 << 4)) & 1085102592571150095L;
        long j15 = (j14 ^ (j14 << 2)) & 3689348814741910323L;
        return (j15 ^ (j15 << 1)) & 6148914691236517205L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void SQR64_NO_SIMD_GF2X(long[] jArr, int i11, long j11) {
        jArr[i11 + 1] = SQR32_NO_SIMD_GF2X(j11 >>> 32);
        jArr[i11] = SQR64LOW_NO_SIMD_GF2X(j11);
    }

    private static void mul128_no_simd_gf2x(long[] jArr, int i11, long j11, long j12, long j13, long j14) {
        MUL64_NO_SIMD_GF2X(jArr, i11, j11, j13);
        int i12 = i11 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i12, j12, j14);
        int i13 = i11 + 1;
        long j15 = jArr[i12] ^ jArr[i13];
        jArr[i12] = j15;
        jArr[i13] = j15 ^ jArr[i11];
        jArr[i12] = jArr[i12] ^ jArr[i11 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i13, j11 ^ j12, j13 ^ j14);
    }

    private static void mul128_no_simd_gf2x_xor(long[] jArr, int i11, long j11, long j12, long j13, long j14, long[] jArr2) {
        MUL64_NO_SIMD_GF2X(jArr2, 0, j11, j13);
        MUL64_NO_SIMD_GF2X(jArr2, 2, j12, j14);
        jArr[i11] = jArr[i11] ^ jArr2[0];
        long j15 = jArr2[2] ^ jArr2[1];
        jArr2[2] = j15;
        int i12 = i11 + 1;
        jArr[i12] = (jArr2[0] ^ j15) ^ jArr[i12];
        int i13 = i11 + 2;
        jArr[i13] = jArr[i13] ^ (jArr2[2] ^ jArr2[3]);
        int i14 = i11 + 3;
        jArr[i14] = jArr[i14] ^ jArr2[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i12, j11 ^ j12, j13 ^ j14);
    }

    public static void mul192_no_simd_gf2x(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        MUL64_NO_SIMD_GF2X(jArr, i11, jArr2[i12], jArr3[i13]);
        int i14 = i11 + 4;
        int i15 = i12 + 2;
        int i16 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i14, jArr2[i15], jArr3[i16]);
        int i17 = i11 + 2;
        int i18 = i12 + 1;
        int i19 = i13 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i17, jArr2[i18], jArr3[i19]);
        int i21 = i11 + 1;
        jArr[i21] = jArr[i21] ^ jArr[i17];
        int i22 = i11 + 3;
        long j11 = jArr[i22] ^ jArr[i14];
        jArr[i22] = j11;
        jArr[i14] = j11 ^ jArr[i11 + 5];
        jArr[i17] = (jArr[i22] ^ jArr[i21]) ^ jArr[i11];
        jArr[i22] = jArr[i21] ^ jArr[i14];
        jArr[i21] = jArr[i21] ^ jArr[i11];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, jArr2[i12] ^ jArr2[i18], jArr3[i13] ^ jArr3[i19]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i22, jArr2[i18] ^ jArr2[i15], jArr3[i19] ^ jArr3[i16]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i17, jArr2[i12] ^ jArr2[i15], jArr3[i13] ^ jArr3[i16]);
    }

    public static void mul192_no_simd_gf2x_xor(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4) {
        MUL64_NO_SIMD_GF2X(jArr4, 0, jArr2[i12], jArr3[i13]);
        int i14 = i12 + 2;
        int i15 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i14], jArr3[i15]);
        int i16 = i12 + 1;
        int i17 = i13 + 1;
        MUL64_NO_SIMD_GF2X(jArr4, 2, jArr2[i16], jArr3[i17]);
        jArr[i11] = jArr[i11] ^ jArr4[0];
        long j11 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j11;
        long j12 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j12;
        jArr4[4] = j12 ^ jArr4[5];
        long j13 = j11 ^ jArr4[0];
        jArr4[0] = j13;
        int i18 = i11 + 1;
        jArr[i18] = j13 ^ jArr[i18];
        int i19 = i11 + 2;
        jArr[i19] = (jArr4[0] ^ jArr4[3]) ^ jArr[i19];
        int i21 = i11 + 3;
        jArr[i21] = jArr[i21] ^ (jArr4[1] ^ jArr4[4]);
        int i22 = i11 + 4;
        jArr[i22] = jArr[i22] ^ jArr4[4];
        int i23 = i11 + 5;
        jArr[i23] = jArr[i23] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i18, jArr2[i12] ^ jArr2[i16], jArr3[i13] ^ jArr3[i17]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i21, jArr2[i16] ^ jArr2[i14], jArr3[i17] ^ jArr3[i15]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i12] ^ jArr2[i14], jArr3[i15] ^ jArr3[i13]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4) {
        int i14 = i12 + 1;
        int i15 = i13 + 1;
        mul128_no_simd_gf2x(jArr, i11, jArr2[i12], jArr2[i14], jArr3[i13], jArr3[i15]);
        int i16 = i11 + 4;
        int i17 = i12 + 2;
        int i18 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr, i16, jArr2[i17], jArr3[i18]);
        int i19 = i11 + 7;
        int i21 = i12 + 3;
        int i22 = i13 + 3;
        MUL64_NO_SIMD_GF2X(jArr, i19, jArr2[i21], jArr3[i22]);
        long j11 = jArr[i19];
        int i23 = i11 + 5;
        jArr[i19] = j11 ^ jArr[i23];
        int i24 = i11 + 8;
        int i25 = i12 + 4;
        int i26 = i13 + 4;
        jArr[i24] = MUL32_NO_SIMD_GF2X(jArr2[i25], jArr3[i26]) ^ jArr[i24];
        jArr[i23] = jArr[i19] ^ jArr[i16];
        long j12 = jArr[i19] ^ jArr[i24];
        jArr[i19] = j12;
        int i27 = i11 + 6;
        jArr[i27] = j12 ^ jArr[i16];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i23, jArr2[i21] ^ jArr2[i17], jArr3[i18] ^ jArr3[i22]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i19, jArr2[i25] ^ jArr2[i21], jArr3[i22] ^ jArr3[i26]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i27, jArr2[i25] ^ jArr2[i17], jArr3[i18] ^ jArr3[i26]);
        int i28 = i11 + 2;
        jArr[i16] = jArr[i16] ^ jArr[i28];
        long j13 = jArr[i23];
        int i29 = i11 + 3;
        jArr[i23] = j13 ^ jArr[i29];
        long j14 = jArr2[i12] ^ jArr2[i17];
        long j15 = jArr2[i14] ^ jArr2[i21];
        long j16 = jArr3[i13] ^ jArr3[i18];
        long j17 = jArr3[i15] ^ jArr3[i22];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j14, j16);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j15, j17);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i25], jArr3[i26]) ^ jArr4[3];
        jArr[i28] = (jArr[i16] ^ jArr[i11]) ^ jArr4[0];
        jArr[i29] = ((jArr[i23] ^ jArr[i11 + 1]) ^ jArr4[2]) ^ jArr4[0];
        long j18 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j18;
        jArr[i16] = ((jArr[i27] ^ j18) ^ jArr4[0]) ^ jArr[i16];
        jArr[i23] = jArr[i23] ^ (jArr[i19] ^ jArr4[2]);
        jArr[i27] = (jArr[i24] ^ jArr4[3]) ^ jArr[i27];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i29, j14 ^ j15, j16 ^ j17);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i23, j15 ^ jArr2[i25], j17 ^ jArr3[i26]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i16, j14 ^ jArr2[i25], j16 ^ jArr3[i26]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul288_no_simd_gf2x_xor(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13, long[] jArr4) {
        int i14 = i12 + 1;
        int i15 = i13 + 1;
        mul128_no_simd_gf2x(jArr4, 0, jArr2[i12], jArr2[i14], jArr3[i13], jArr3[i15]);
        int i16 = i12 + 2;
        int i17 = i13 + 2;
        MUL64_NO_SIMD_GF2X(jArr4, 4, jArr2[i16], jArr3[i17]);
        int i18 = i12 + 3;
        int i19 = i13 + 3;
        MUL64_NO_SIMD_GF2X(jArr4, 7, jArr2[i18], jArr3[i19]);
        jArr4[7] = jArr4[7] ^ jArr4[5];
        int i21 = i12 + 4;
        int i22 = i13 + 4;
        long jMUL32_NO_SIMD_GF2X = jArr4[8] ^ MUL32_NO_SIMD_GF2X(jArr2[i21], jArr3[i22]);
        jArr4[8] = jMUL32_NO_SIMD_GF2X;
        long j11 = jArr4[7];
        long j12 = jArr4[4];
        long j13 = j11 ^ j12;
        jArr4[5] = j13;
        long j14 = jMUL32_NO_SIMD_GF2X ^ j11;
        jArr4[7] = j14;
        jArr4[6] = j14 ^ j12;
        jArr4[4] = jArr4[2] ^ j12;
        jArr4[5] = j13 ^ jArr4[3];
        jArr[i11] = jArr[i11] ^ jArr4[0];
        int i23 = i11 + 1;
        jArr[i23] = jArr[i23] ^ jArr4[1];
        int i24 = i11 + 2;
        jArr[i24] = jArr[i24] ^ (jArr4[4] ^ jArr4[0]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, jArr2[i18] ^ jArr2[i16], jArr3[i17] ^ jArr3[i19]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 7, jArr2[i21] ^ jArr2[i18], jArr3[i19] ^ jArr3[i22]);
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 6, jArr2[i21] ^ jArr2[i16], jArr3[i17] ^ jArr3[i22]);
        int i25 = i11 + 3;
        jArr[i25] = jArr[i25] ^ (jArr4[5] ^ jArr4[1]);
        int i26 = i11 + 4;
        jArr[i26] = jArr[i26] ^ (jArr4[4] ^ jArr4[6]);
        int i27 = i11 + 5;
        jArr[i27] = jArr[i27] ^ (jArr4[5] ^ jArr4[7]);
        int i28 = i11 + 6;
        jArr[i28] = jArr[i28] ^ (jArr4[6] ^ jArr4[8]);
        int i29 = i11 + 7;
        jArr[i29] = jArr[i29] ^ jArr4[7];
        int i31 = i11 + 8;
        jArr[i31] = jArr[i31] ^ jArr4[8];
        long j15 = jArr2[i12] ^ jArr2[i16];
        long j16 = jArr2[i14] ^ jArr2[i18];
        long j17 = jArr3[i13] ^ jArr3[i17];
        long j18 = jArr3[i15] ^ jArr3[i19];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j15, j17);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j16, j18);
        jArr4[2] = jArr4[2] ^ jArr4[1];
        jArr4[3] = MUL32_NO_SIMD_GF2X(jArr2[i21], jArr3[i22]) ^ jArr4[3];
        jArr[i24] = jArr[i24] ^ jArr4[0];
        jArr[i25] = jArr[i25] ^ (jArr4[2] ^ jArr4[0]);
        long j19 = jArr4[2] ^ jArr4[3];
        jArr4[2] = j19;
        jArr[i26] = (j19 ^ jArr4[0]) ^ jArr[i26];
        jArr[i27] = jArr[i27] ^ jArr4[2];
        jArr[i28] = jArr[i28] ^ jArr4[3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i25, j15 ^ j16, j17 ^ j18);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i27, j16 ^ jArr2[i21], j18 ^ jArr3[i22]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, i26, jArr2[i21] ^ j15, jArr3[i22] ^ j17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i12 + 3;
        mul192_no_simd_gf2x(jArr, 6, jArr2, i13, jArr3, i14);
        long j11 = jArr2[i11] ^ jArr2[i13];
        long j12 = jArr2[i11 + 1] ^ jArr2[i11 + 4];
        long j13 = jArr2[i11 + 2] ^ jArr2[i11 + 5];
        long j14 = jArr3[i12] ^ jArr3[i14];
        long j15 = jArr3[i12 + 1] ^ jArr3[i12 + 4];
        long j16 = jArr3[i12 + 2] ^ jArr3[i12 + 5];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        MUL64_NO_SIMD_GF2X(jArr4, 0, j11, j14);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j13, j16);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j12, j15);
        long j17 = jArr[6];
        long j18 = j17 ^ jArr[0];
        long j19 = jArr4[0];
        jArr[3] = j18 ^ j19;
        long j21 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j21;
        long j22 = j19 ^ j21;
        jArr4[0] = j22;
        long j23 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j23;
        long j24 = j23 ^ jArr4[5];
        jArr4[4] = j24;
        long j25 = jArr[8];
        jArr[5] = ((j25 ^ jArr[2]) ^ j23) ^ j22;
        jArr[6] = j17 ^ ((jArr[9] ^ j21) ^ j24);
        long j26 = jArr[7];
        jArr[4] = (jArr[1] ^ j26) ^ j22;
        jArr[7] = j26 ^ (jArr4[4] ^ jArr[10]);
        jArr[8] = j25 ^ (jArr[11] ^ jArr4[5]);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j11 ^ j12, j14 ^ j15);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j12 ^ j13, j15 ^ j16);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j11 ^ j13, j14 ^ j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul384_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i12 + 3;
        mul192_no_simd_gf2x(jArr4, 6, jArr2, i13, jArr3, i14);
        long j11 = jArr2[i13] ^ jArr2[i11];
        long j12 = jArr2[i11 + 1] ^ jArr2[i11 + 4];
        long j13 = jArr2[i11 + 2] ^ jArr2[i11 + 5];
        long j14 = jArr3[i14] ^ jArr3[i12];
        long j15 = jArr3[i12 + 4] ^ jArr3[i12 + 1];
        long j16 = jArr3[i12 + 5] ^ jArr3[i12 + 2];
        long j17 = jArr4[6] ^ jArr4[3];
        jArr4[6] = j17;
        long j18 = jArr4[7] ^ jArr4[4];
        jArr4[7] = j18;
        long j19 = jArr4[8] ^ jArr4[5];
        jArr4[8] = j19;
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        jArr[3] = jArr[3] ^ (j17 ^ jArr4[0]);
        jArr[5] = jArr[5] ^ (j19 ^ jArr4[2]);
        long j21 = jArr[6];
        long j22 = jArr4[9];
        jArr[6] = j21 ^ (j17 ^ j22);
        jArr[4] = jArr[4] ^ (j18 ^ jArr4[1]);
        long j23 = jArr[7];
        long j24 = jArr4[10];
        jArr[7] = j23 ^ (j18 ^ j24);
        long j25 = jArr[8];
        long j26 = jArr4[11];
        jArr[8] = j25 ^ (j19 ^ j26);
        jArr[9] = jArr[9] ^ j22;
        jArr[10] = jArr[10] ^ j24;
        jArr[11] = jArr[11] ^ j26;
        MUL64_NO_SIMD_GF2X(jArr4, 0, j11, j14);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j13, j16);
        MUL64_NO_SIMD_GF2X(jArr4, 2, j12, j15);
        long j27 = jArr[3];
        long j28 = jArr4[0];
        jArr[3] = j27 ^ j28;
        long j29 = jArr4[1] ^ jArr4[2];
        jArr4[1] = j29;
        long j31 = j28 ^ j29;
        jArr4[0] = j31;
        long j32 = jArr4[3] ^ jArr4[4];
        jArr4[3] = j32;
        long j33 = j32 ^ jArr4[5];
        jArr4[4] = j33;
        jArr[5] = jArr[5] ^ (j32 ^ j31);
        jArr[6] = (j29 ^ j33) ^ jArr[6];
        jArr[4] = jArr[4] ^ j31;
        jArr[7] = jArr[7] ^ jArr4[4];
        jArr[8] = jArr[8] ^ jArr4[5];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 4, j11 ^ j12, j14 ^ j15);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 6, j12 ^ j13, j15 ^ j16);
        MUL64_NO_SIMD_GF2X_XOR(jArr, 5, j11 ^ j13, j14 ^ j16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4) {
        mul192_no_simd_gf2x(jArr, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i11 + 4;
        int i15 = i12 + 3;
        int i16 = i12 + 4;
        mul128_no_simd_gf2x(jArr, 6, jArr2[i13], jArr2[i14], jArr3[i15], jArr3[i16]);
        int i17 = i11 + 5;
        int i18 = i12 + 5;
        MUL64_NO_SIMD_GF2X(jArr, 10, jArr2[i17], jArr3[i18]);
        int i19 = i11 + 6;
        int i21 = i12 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i21]) ^ jArr[11];
        jArr[12] = jMUL32_NO_SIMD_GF2X;
        jArr[11] = jMUL32_NO_SIMD_GF2X ^ jArr[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr, 11, jArr2[i19] ^ jArr2[i17], jArr3[i21] ^ jArr3[i18]);
        long j11 = jArr[8] ^ jArr[10];
        jArr[8] = j11;
        long j12 = jArr[11] ^ jArr[9];
        jArr[11] = j12;
        jArr[10] = jArr[12] ^ j11;
        jArr[8] = j11 ^ jArr[6];
        jArr[9] = jArr[7] ^ j12;
        mul128_no_simd_gf2x_xor(jArr, 8, jArr2[i17] ^ jArr2[i13], jArr2[i19] ^ jArr2[i14], jArr3[i18] ^ jArr3[i15], jArr3[i21] ^ jArr3[i16], jArr4);
        long j13 = jArr2[i13] ^ jArr2[i11];
        long j14 = jArr2[i11 + 1] ^ jArr2[i14];
        long j15 = jArr2[i11 + 2] ^ jArr2[i17];
        long j16 = jArr2[i19];
        long j17 = jArr3[i12] ^ jArr3[i15];
        long j18 = jArr3[i12 + 1] ^ jArr3[i16];
        long j19 = jArr3[i12 + 2] ^ jArr3[i18];
        long j21 = jArr3[i21];
        jArr[6] = jArr[6] ^ jArr[3];
        jArr[7] = jArr[7] ^ jArr[4];
        jArr[8] = jArr[8] ^ jArr[5];
        mul128_no_simd_gf2x(jArr4, 0, j13, j14, j17, j18);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j15, j19);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j16, j21) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j15 ^ j16, j19 ^ j21);
        long j22 = jArr[6];
        long j23 = jArr[0] ^ j22;
        long j24 = jArr4[0];
        jArr[3] = j23 ^ j24;
        long j25 = jArr[7];
        long j26 = j25 ^ jArr[1];
        long j27 = jArr4[1];
        jArr[4] = j26 ^ j27;
        long j28 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j28;
        long j29 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j29;
        long j31 = jArr[8];
        jArr[5] = ((j31 ^ jArr[2]) ^ j28) ^ j24;
        long j32 = jArr[9];
        jArr[6] = j22 ^ ((j32 ^ j29) ^ j27);
        long j33 = jArr[10] ^ j28;
        long j34 = jArr4[6];
        jArr[7] = (j33 ^ j34) ^ j25;
        jArr[8] = j31 ^ (jArr[11] ^ j29);
        jArr[9] = j32 ^ (jArr[12] ^ j34);
        mul128_no_simd_gf2x_xor(jArr, 5, j13 ^ j15, j14 ^ j16, j17 ^ j19, j18 ^ j21, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul416_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, long[] jArr5) {
        mul192_no_simd_gf2x(jArr4, 0, jArr2, i11, jArr3, i12);
        int i13 = i11 + 3;
        int i14 = i11 + 4;
        int i15 = i12 + 3;
        int i16 = i12 + 4;
        mul128_no_simd_gf2x(jArr4, 6, jArr2[i13], jArr2[i14], jArr3[i15], jArr3[i16]);
        int i17 = i11 + 5;
        int i18 = i12 + 5;
        MUL64_NO_SIMD_GF2X(jArr4, 10, jArr2[i17], jArr3[i18]);
        int i19 = i11 + 6;
        int i21 = i12 + 6;
        long jMUL32_NO_SIMD_GF2X = MUL32_NO_SIMD_GF2X(jArr2[i19], jArr3[i21]) ^ jArr4[11];
        jArr4[12] = jMUL32_NO_SIMD_GF2X;
        jArr4[11] = jMUL32_NO_SIMD_GF2X ^ jArr4[10];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 11, jArr2[i19] ^ jArr2[i17], jArr3[i21] ^ jArr3[i18]);
        long j11 = jArr4[8] ^ jArr4[10];
        jArr4[8] = j11;
        long j12 = jArr4[11] ^ jArr4[9];
        jArr4[11] = j12;
        jArr4[10] = jArr4[12] ^ j11;
        long j13 = jArr4[6];
        long j14 = j11 ^ j13;
        jArr4[8] = j14;
        long j15 = jArr4[7];
        jArr4[9] = j12 ^ j15;
        jArr4[6] = jArr4[3] ^ j13;
        jArr4[7] = jArr4[4] ^ j15;
        jArr4[8] = j14 ^ jArr4[5];
        mul128_no_simd_gf2x_xor(jArr4, 8, jArr2[i17] ^ jArr2[i13], jArr2[i19] ^ jArr2[i14], jArr3[i18] ^ jArr3[i15], jArr3[i21] ^ jArr3[i16], jArr5);
        jArr[0] = jArr[0] ^ jArr4[0];
        jArr[1] = jArr[1] ^ jArr4[1];
        jArr[2] = jArr[2] ^ jArr4[2];
        long j16 = jArr[3];
        long j17 = jArr4[6];
        jArr[3] = j16 ^ (jArr4[0] ^ j17);
        long j18 = jArr[4];
        long j19 = jArr4[7];
        jArr[4] = j18 ^ (jArr4[1] ^ j19);
        long j21 = jArr[5];
        long j22 = jArr4[8];
        jArr[5] = j21 ^ (jArr4[2] ^ j22);
        long j23 = jArr[6];
        long j24 = jArr4[9];
        jArr[6] = j23 ^ (j17 ^ j24);
        long j25 = jArr[7];
        long j26 = jArr4[10];
        jArr[7] = j25 ^ (j19 ^ j26);
        long j27 = jArr[8];
        long j28 = jArr4[11];
        jArr[8] = j27 ^ (j22 ^ j28);
        long j29 = jArr[9];
        long j31 = jArr4[12];
        jArr[9] = j29 ^ (j24 ^ j31);
        jArr[10] = jArr[10] ^ j26;
        jArr[11] = jArr[11] ^ j28;
        jArr[12] = jArr[12] ^ j31;
        long j32 = jArr2[i13] ^ jArr2[i11];
        long j33 = jArr2[i14] ^ jArr2[i11 + 1];
        long j34 = jArr2[i11 + 2] ^ jArr2[i17];
        long j35 = jArr2[i19];
        long j36 = jArr3[i12] ^ jArr3[i15];
        long j37 = jArr3[i12 + 1] ^ jArr3[i16];
        long j38 = jArr3[i12 + 2] ^ jArr3[i18];
        long j39 = jArr3[i21];
        mul128_no_simd_gf2x(jArr4, 0, j32, j33, j36, j37);
        MUL64_NO_SIMD_GF2X(jArr4, 4, j34, j38);
        long jMUL32_NO_SIMD_GF2X2 = MUL32_NO_SIMD_GF2X(j35, j39) ^ jArr4[5];
        jArr4[6] = jMUL32_NO_SIMD_GF2X2;
        jArr4[5] = jMUL32_NO_SIMD_GF2X2 ^ jArr4[4];
        MUL64_NO_SIMD_GF2X_XOR(jArr4, 5, j34 ^ j35, j38 ^ j39);
        long j41 = jArr[3];
        long j42 = jArr4[0];
        jArr[3] = j41 ^ j42;
        long j43 = jArr[4];
        long j44 = jArr4[1];
        jArr[4] = j43 ^ j44;
        long j45 = jArr4[2] ^ jArr4[4];
        jArr4[2] = j45;
        long j46 = jArr4[3] ^ jArr4[5];
        jArr4[3] = j46;
        jArr[5] = jArr[5] ^ (j42 ^ j45);
        jArr[6] = jArr[6] ^ (j46 ^ j44);
        long j47 = jArr[7];
        long j48 = jArr4[6];
        jArr[7] = (j45 ^ j48) ^ j47;
        jArr[8] = jArr[8] ^ j46;
        jArr[9] = jArr[9] ^ j48;
        mul128_no_simd_gf2x_xor(jArr, 5, j32 ^ j34, j33 ^ j35, j36 ^ j38, j37 ^ j39, jArr4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, long[] jArr5, long[] jArr6) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr, 0, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i11 + 2;
        int i16 = i11 + 3;
        int i17 = i12 + 2;
        int i18 = i12 + 3;
        mul128_no_simd_gf2x(jArr, 4, jArr2[i15], jArr2[i16], jArr3[i17], jArr3[i18]);
        long j11 = jArr[4] ^ jArr[2];
        jArr[4] = j11;
        long j12 = jArr[5] ^ jArr[3];
        jArr[5] = j12;
        jArr[2] = jArr[0] ^ j11;
        jArr[3] = jArr[1] ^ j12;
        jArr[4] = j11 ^ jArr[6];
        jArr[5] = j12 ^ jArr[7];
        mul128_no_simd_gf2x_xor(jArr, 2, jArr2[i15] ^ jArr2[i11], jArr2[i13] ^ jArr2[i16], jArr3[i12] ^ jArr3[i17], jArr3[i14] ^ jArr3[i18], jArr6);
        int i19 = i11 + 4;
        int i21 = i12 + 4;
        mul288_no_simd_gf2x(jArr, 8, jArr2, i19, jArr3, i21, jArr6);
        long j13 = jArr[8] ^ jArr[4];
        jArr[8] = j13;
        long j14 = jArr[9] ^ jArr[5];
        jArr[9] = j14;
        long j15 = jArr[10] ^ jArr[6];
        jArr[10] = j15;
        long j16 = jArr[11] ^ jArr[7];
        jArr[11] = j16;
        jArr[4] = j13 ^ jArr[0];
        jArr[5] = j14 ^ jArr[1];
        jArr[6] = j15 ^ jArr[2];
        jArr[7] = j16 ^ jArr[3];
        long j17 = jArr[12];
        jArr[8] = j13 ^ j17;
        jArr[9] = j14 ^ jArr[13];
        jArr[10] = j15 ^ jArr[14];
        jArr[11] = j16 ^ jArr[15];
        jArr[12] = j17 ^ jArr[16];
        jArr4[0] = jArr2[i11] ^ jArr2[i19];
        jArr4[1] = jArr2[i13] ^ jArr2[i11 + 5];
        jArr4[2] = jArr2[i15] ^ jArr2[i11 + 6];
        jArr4[3] = jArr2[i16] ^ jArr2[i11 + 7];
        jArr4[4] = jArr2[i11 + 8];
        jArr5[0] = jArr3[i12] ^ jArr3[i21];
        jArr5[1] = jArr3[i14] ^ jArr3[i12 + 5];
        jArr5[2] = jArr3[i17] ^ jArr3[i12 + 6];
        jArr5[3] = jArr3[i18] ^ jArr3[i12 + 7];
        jArr5[4] = jArr3[i12 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void mul544_no_simd_gf2x_xor(long[] jArr, long[] jArr2, int i11, long[] jArr3, int i12, long[] jArr4, long[] jArr5, long[] jArr6, long[] jArr7) {
        int i13 = i11 + 1;
        int i14 = i12 + 1;
        mul128_no_simd_gf2x(jArr6, 0, jArr2[i11], jArr2[i13], jArr3[i12], jArr3[i14]);
        int i15 = i11 + 2;
        int i16 = i11 + 3;
        int i17 = i12 + 2;
        int i18 = i12 + 3;
        mul128_no_simd_gf2x(jArr6, 4, jArr2[i15], jArr2[i16], jArr3[i17], jArr3[i18]);
        long j11 = jArr6[4] ^ jArr6[2];
        jArr6[4] = j11;
        long j12 = jArr6[5] ^ jArr6[3];
        jArr6[5] = j12;
        jArr6[2] = jArr6[0] ^ j11;
        jArr6[3] = jArr6[1] ^ j12;
        jArr6[4] = j11 ^ jArr6[6];
        jArr6[5] = j12 ^ jArr6[7];
        mul128_no_simd_gf2x_xor(jArr6, 2, jArr2[i15] ^ jArr2[i11], jArr2[i13] ^ jArr2[i16], jArr3[i12] ^ jArr3[i17], jArr3[i14] ^ jArr3[i18], jArr7);
        int i19 = i11 + 4;
        int i21 = i12 + 4;
        mul288_no_simd_gf2x(jArr6, 8, jArr2, i19, jArr3, i21, jArr7);
        long j13 = jArr6[8] ^ jArr6[4];
        jArr6[8] = j13;
        long j14 = jArr6[9] ^ jArr6[5];
        jArr6[9] = j14;
        long j15 = jArr6[10] ^ jArr6[6];
        jArr6[10] = j15;
        long j16 = jArr6[11] ^ jArr6[7];
        jArr6[11] = j16;
        jArr[0] = jArr[0] ^ jArr6[0];
        jArr[1] = jArr[1] ^ jArr6[1];
        jArr[2] = jArr[2] ^ jArr6[2];
        jArr[3] = jArr[3] ^ jArr6[3];
        jArr[4] = jArr[4] ^ (j13 ^ jArr6[0]);
        jArr[5] = jArr[5] ^ (j14 ^ jArr6[1]);
        jArr[6] = jArr[6] ^ (j15 ^ jArr6[2]);
        jArr[7] = jArr[7] ^ (j16 ^ jArr6[3]);
        long j17 = jArr[8];
        long j18 = jArr6[12];
        jArr[8] = j17 ^ (j13 ^ j18);
        long j19 = jArr[9];
        long j21 = jArr6[13];
        jArr[9] = j19 ^ (j14 ^ j21);
        long j22 = jArr[10];
        long j23 = jArr6[14];
        jArr[10] = j22 ^ (j15 ^ j23);
        long j24 = jArr[11];
        long j25 = jArr6[15];
        jArr[11] = j24 ^ (j16 ^ j25);
        long j26 = jArr[12];
        long j27 = jArr6[16];
        jArr[12] = j26 ^ (j18 ^ j27);
        jArr[13] = jArr[13] ^ j21;
        jArr[14] = jArr[14] ^ j23;
        jArr[15] = jArr[15] ^ j25;
        jArr[16] = jArr[16] ^ j27;
        jArr4[0] = jArr2[i11] ^ jArr2[i19];
        jArr4[1] = jArr2[i13] ^ jArr2[i11 + 5];
        jArr4[2] = jArr2[i15] ^ jArr2[i11 + 6];
        jArr4[3] = jArr2[i16] ^ jArr2[i11 + 7];
        jArr4[4] = jArr2[i11 + 8];
        jArr5[0] = jArr3[i12] ^ jArr3[i21];
        jArr5[1] = jArr3[i14] ^ jArr3[i12 + 5];
        jArr5[2] = jArr3[i17] ^ jArr3[i12 + 6];
        jArr5[3] = jArr3[i18] ^ jArr3[i12 + 7];
        jArr5[4] = jArr3[i12 + 8];
        mul288_no_simd_gf2x_xor(jArr, 4, jArr4, 0, jArr5, 0, jArr6);
    }

    public abstract void mul_gf2x(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void mul_gf2x_xor(Pointer pointer, Pointer pointer2, Pointer pointer3);

    public abstract void sqr_gf2x(long[] jArr, long[] jArr2, int i11);

    private static void mul128_no_simd_gf2x(long[] jArr, int i11, long[] jArr2, int i12, long[] jArr3, int i13) {
        MUL64_NO_SIMD_GF2X(jArr, i11, jArr2[i12], jArr3[i13]);
        int i14 = i11 + 2;
        int i15 = i12 + 1;
        int i16 = i13 + 1;
        MUL64_NO_SIMD_GF2X(jArr, i14, jArr2[i15], jArr3[i16]);
        long j11 = jArr[i14];
        int i17 = i11 + 1;
        long j12 = j11 ^ jArr[i17];
        jArr[i14] = j12;
        jArr[i17] = j12 ^ jArr[i11];
        jArr[i14] = jArr[i14] ^ jArr[i11 + 3];
        MUL64_NO_SIMD_GF2X_XOR(jArr, i17, jArr2[i12] ^ jArr2[i15], jArr3[i13] ^ jArr3[i16]);
    }
}
