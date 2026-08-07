package org.bouncycastle.pqc.crypto.gemss;

/* JADX INFO: loaded from: classes10.dex */
abstract class Rem_GF2n {

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected int f99076ki;
    protected int ki64;
    protected long mask;

    public static class REM192_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private final int f99077k3;
        private final int k364;
        private final int ki_k3;

        REM192_SPECIALIZED_TRINOMIAL_GF2X(int i11, int i12, int i13, int i14, long j11) {
            this.f99077k3 = i11;
            this.f99076ki = i12;
            this.ki64 = i13;
            this.k364 = i14;
            this.mask = j11;
            this.ki_k3 = i12 - i11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[2];
            int i12 = this.f99076ki;
            long j12 = jArr2[3];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[4];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = (j14 >>> i12) ^ (jArr2[5] << i13);
            long j17 = jArr2[1] ^ j15;
            int i14 = this.k364;
            int i15 = this.f99077k3;
            jArr[i11 + 1] = (j17 ^ (j13 >>> i14)) ^ (j15 << i15);
            jArr[i11 + 2] = (((j15 >>> i14) ^ (jArr2[2] ^ j16)) ^ (j16 << i15)) & this.mask;
            long j18 = j13 ^ (j16 >>> this.ki_k3);
            jArr[i11] = (j18 << i15) ^ (jArr2[0] ^ j18);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[2];
            int i12 = this.f99076ki;
            long j12 = jArr2[3];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[4];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = (j14 >>> i12) ^ (jArr2[5] << i13);
            int i14 = i11 + 1;
            long j17 = jArr[i14];
            long j18 = jArr2[1] ^ j15;
            int i15 = this.k364;
            int i16 = this.f99077k3;
            jArr[i14] = j17 ^ ((j18 ^ (j13 >>> i15)) ^ (j15 << i16));
            int i17 = i11 + 2;
            jArr[i17] = ((((j15 >>> i15) ^ (jArr2[2] ^ j16)) ^ (j16 << i16)) & this.mask) ^ jArr[i17];
            long j19 = j13 ^ (j16 >>> this.ki_k3);
            jArr[i11] = ((j19 << i16) ^ (jArr2[0] ^ j19)) ^ jArr[i11];
        }
    }

    public static class REM288_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private final int f99078k3;
        private final int k364;
        private final int k364ki;
        private final int k3_ki;

        public REM288_SPECIALIZED_TRINOMIAL_GF2X(int i11, int i12, int i13, int i14, long j11) {
            this.f99078k3 = i11;
            this.f99076ki = i12;
            this.ki64 = i13;
            this.k364 = i14;
            this.mask = j11;
            this.k364ki = i14 + i12;
            this.k3_ki = i11 - i12;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[5];
            int i12 = this.f99076ki;
            long j12 = jArr2[6];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = (j12 >>> i12) ^ (jArr2[7] << i13);
            long j15 = jArr2[2] ^ j14;
            int i14 = this.k364;
            int i15 = this.f99078k3;
            jArr[i11 + 2] = (j15 ^ (j13 >>> i14)) ^ (j14 << i15);
            long j16 = (jArr2[7] >>> i12) ^ (jArr2[8] << i13);
            jArr[i11 + 3] = ((j14 >>> i14) ^ (jArr2[3] ^ j16)) ^ (j16 << i15);
            long j17 = jArr2[8] >>> i12;
            long j18 = jArr2[4];
            long j19 = (((j18 >>> i12) ^ (jArr2[5] << i13)) ^ (j16 >>> this.k364ki)) ^ (j17 << this.k3_ki);
            long j21 = j17 << i15;
            jArr[i11 + 4] = (j21 ^ ((j16 >>> i14) ^ (j18 ^ j17))) & this.mask;
            jArr[i11] = (jArr2[0] ^ j19) ^ (j19 << i15);
            jArr[i11 + 1] = ((j13 << i15) ^ (jArr2[1] ^ j13)) ^ (j19 >>> i14);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[5];
            int i12 = this.f99076ki;
            long j12 = jArr2[6];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = (j12 >>> i12) ^ (jArr2[7] << i13);
            int i14 = i11 + 2;
            long j15 = jArr[i14];
            long j16 = jArr2[2] ^ j14;
            int i15 = this.k364;
            int i16 = this.f99078k3;
            jArr[i14] = j15 ^ ((j16 ^ (j13 >>> i15)) ^ (j14 << i16));
            long j17 = (jArr2[7] >>> i12) ^ (jArr2[8] << i13);
            int i17 = i11 + 3;
            jArr[i17] = (((jArr2[3] ^ j17) ^ (j14 >>> i15)) ^ (j17 << i16)) ^ jArr[i17];
            long j18 = jArr2[8] >>> i12;
            int i18 = i11 + 4;
            jArr[i18] = ((((jArr2[4] ^ j18) ^ (j17 >>> i15)) ^ (j18 << i16)) & this.mask) ^ jArr[i18];
            long j19 = (((jArr2[4] >>> i12) ^ (jArr2[5] << i13)) ^ (j17 >>> this.k364ki)) ^ (j18 << this.k3_ki);
            jArr[i11] = jArr[i11] ^ ((jArr2[0] ^ j19) ^ (j19 << i16));
            int i19 = i11 + 1;
            jArr[i19] = ((j19 >>> i15) ^ ((jArr2[1] ^ j13) ^ (j13 << i16))) ^ jArr[i19];
        }
    }

    public static class REM384_SPECIALIZED358_TRINOMIAL_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private final int f99079k3;
        private final int k364;
        private final int k364ki;
        private final int k3_ki;

        public REM384_SPECIALIZED358_TRINOMIAL_GF2X(int i11, int i12, int i13, int i14, long j11) {
            this.f99079k3 = i11;
            this.f99076ki = i12;
            this.ki64 = i13;
            this.k364 = i14;
            this.mask = j11;
            this.k364ki = i14 + i12;
            this.k3_ki = i11 - i12;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[6];
            int i12 = this.f99076ki;
            long j12 = jArr2[7];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = (j12 >>> i12) ^ (jArr2[8] << i13);
            long j15 = jArr2[2] ^ j14;
            int i14 = this.k364;
            int i15 = this.f99079k3;
            jArr[i11 + 2] = (j15 ^ (j13 >>> i14)) ^ (j14 << i15);
            long j16 = (jArr2[8] >>> i12) ^ (jArr2[9] << i13);
            jArr[i11 + 3] = ((j14 >>> i14) ^ (jArr2[3] ^ j16)) ^ (j16 << i15);
            long j17 = (jArr2[9] >>> i12) ^ (jArr2[10] << i13);
            jArr[i11 + 4] = ((j16 >>> i14) ^ (jArr2[4] ^ j17)) ^ (j17 << i15);
            long j18 = (jArr2[10] >>> i12) ^ (jArr2[11] << i13);
            long j19 = jArr2[5];
            long j21 = (((j19 >>> i12) ^ (jArr2[6] << i13)) ^ (j17 >>> this.k364ki)) ^ (j18 << this.k3_ki);
            jArr[i11 + 5] = ((j17 >>> i14) ^ (j19 ^ j18)) & this.mask;
            jArr[i11] = (jArr2[0] ^ j21) ^ (j21 << i15);
            jArr[i11 + 1] = (j13 << i15) ^ ((jArr2[1] ^ j13) ^ (j21 >>> i14));
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[6];
            int i12 = this.f99076ki;
            long j12 = jArr2[7];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = (j12 >>> i12) ^ (jArr2[8] << i13);
            int i14 = i11 + 2;
            long j15 = jArr[i14];
            long j16 = jArr2[2] ^ j14;
            int i15 = this.k364;
            int i16 = this.f99079k3;
            jArr[i14] = j15 ^ ((j16 ^ (j13 >>> i15)) ^ (j14 << i16));
            long j17 = (jArr2[8] >>> i12) ^ (jArr2[9] << i13);
            int i17 = i11 + 3;
            jArr[i17] = (((jArr2[3] ^ j17) ^ (j14 >>> i15)) ^ (j17 << i16)) ^ jArr[i17];
            long j18 = (jArr2[9] >>> i12) ^ (jArr2[10] << i13);
            int i18 = i11 + 4;
            jArr[i18] = (((jArr2[4] ^ j18) ^ (j17 >>> i15)) ^ (j18 << i16)) ^ jArr[i18];
            long j19 = (jArr2[10] >>> i12) ^ (jArr2[11] << i13);
            int i19 = i11 + 5;
            jArr[i19] = (((jArr2[5] ^ j19) ^ (j18 >>> i15)) & this.mask) ^ jArr[i19];
            long j21 = (((jArr2[5] >>> i12) ^ (jArr2[6] << i13)) ^ (j18 >>> this.k364ki)) ^ (j19 << this.k3_ki);
            jArr[i11] = jArr[i11] ^ ((jArr2[0] ^ j21) ^ (j21 << i16));
            int i21 = i11 + 1;
            jArr[i21] = (((j21 >>> i15) ^ (jArr2[1] ^ j13)) ^ (j13 << i16)) ^ jArr[i21];
        }
    }

    public static class REM384_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private final int f99080k3;
        private final int k364;
        private final int k364ki;
        private final int k3_ki;

        public REM384_SPECIALIZED_TRINOMIAL_GF2X(int i11, int i12, int i13, int i14, long j11) {
            this.f99080k3 = i11;
            this.f99076ki = i12;
            this.ki64 = i13;
            this.k364 = i14;
            this.mask = j11;
            this.k364ki = i14 + i12;
            this.k3_ki = i11 - i12;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[7];
            int i12 = this.f99076ki;
            long j12 = jArr2[8];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[9];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = jArr2[10];
            long j17 = (j14 >>> i12) ^ (j16 << i13);
            long j18 = (j16 >>> i12) ^ (jArr2[11] << i13);
            long j19 = jArr2[5] >>> i12;
            long j21 = jArr2[6];
            int i14 = this.k364ki;
            int i15 = this.k3_ki;
            long j22 = ((j19 ^ (j21 << i13)) ^ (j15 >>> i14)) ^ (j17 << i15);
            long j23 = (((j21 >>> i12) ^ (j11 << i13)) ^ (j17 >>> i14)) ^ (j18 << i15);
            jArr[i11] = jArr2[0] ^ j22;
            long j24 = jArr2[1] ^ j23;
            int i16 = this.f99080k3;
            jArr[i11 + 1] = j24 ^ (j22 << i16);
            long j25 = jArr2[2] ^ j13;
            int i17 = this.k364;
            jArr[i11 + 2] = (j25 ^ (j22 >>> i17)) ^ (j23 << i16);
            jArr[i11 + 3] = ((j23 >>> i17) ^ (jArr2[3] ^ j15)) ^ (j13 << i16);
            jArr[i11 + 4] = ((jArr2[4] ^ j17) ^ (j13 >>> i17)) ^ (j15 << i16);
            jArr[i11 + 5] = ((jArr2[5] ^ j18) ^ (j15 >>> i17)) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[7];
            int i12 = this.f99076ki;
            long j12 = jArr2[8];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[9];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = jArr2[10];
            long j17 = (j14 >>> i12) ^ (j16 << i13);
            long j18 = (j16 >>> i12) ^ (jArr2[11] << i13);
            long j19 = jArr2[5] >>> i12;
            long j21 = jArr2[6];
            int i14 = this.k364ki;
            int i15 = this.k3_ki;
            long j22 = ((j19 ^ (j21 << i13)) ^ (j15 >>> i14)) ^ (j17 << i15);
            long j23 = (((j21 >>> i12) ^ (j11 << i13)) ^ (j17 >>> i14)) ^ (j18 << i15);
            jArr[i11] = jArr[i11] ^ (jArr2[0] ^ j22);
            int i16 = i11 + 1;
            long j24 = jArr[i16];
            long j25 = jArr2[1] ^ j23;
            int i17 = this.f99080k3;
            jArr[i16] = j24 ^ (j25 ^ (j22 << i17));
            int i18 = i11 + 2;
            long j26 = jArr[i18];
            long j27 = jArr2[2] ^ j13;
            int i19 = this.k364;
            jArr[i18] = j26 ^ ((j27 ^ (j22 >>> i19)) ^ (j23 << i17));
            int i21 = i11 + 3;
            jArr[i21] = (((jArr2[3] ^ j15) ^ (j23 >>> i19)) ^ (j13 << i17)) ^ jArr[i21];
            int i22 = i11 + 4;
            jArr[i22] = jArr[i22] ^ (((j13 >>> i19) ^ (j17 ^ jArr2[4])) ^ (j15 << i17));
            int i23 = i11 + 5;
            jArr[i23] = jArr[i23] ^ (((jArr2[5] ^ j18) ^ (j15 >>> i19)) & this.mask);
        }
    }

    public static class REM384_TRINOMIAL_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private final int f99081k3;
        private final int k364;
        private final int ki_k3;

        public REM384_TRINOMIAL_GF2X(int i11, int i12, int i13, int i14, long j11) {
            this.f99081k3 = i11;
            this.f99076ki = i12;
            this.ki64 = i13;
            this.k364 = i14;
            this.mask = j11;
            this.ki_k3 = i12 - i11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[5];
            int i12 = this.f99076ki;
            long j12 = jArr2[6];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[7];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = jArr2[8];
            long j17 = (j14 >>> i12) ^ (j16 << i13);
            long j18 = jArr2[9];
            long j19 = (j16 >>> i12) ^ (j18 << i13);
            long j21 = jArr2[10];
            long j22 = (j18 >>> i12) ^ (j21 << i13);
            long j23 = (j21 >>> i12) ^ (jArr2[11] << i13);
            long j24 = j13 ^ (j23 >>> this.ki_k3);
            long j25 = jArr2[0] ^ j24;
            int i14 = this.f99081k3;
            jArr[i11] = j25 ^ (j24 << i14);
            long j26 = jArr2[1] ^ j15;
            int i15 = this.k364;
            jArr[i11 + 1] = (j26 ^ (j13 >>> i15)) ^ (j15 << i14);
            jArr[i11 + 2] = ((jArr2[2] ^ j17) ^ (j15 >>> i15)) ^ (j17 << i14);
            jArr[i11 + 3] = ((jArr2[3] ^ j19) ^ (j17 >>> i15)) ^ (j19 << i14);
            jArr[i11 + 4] = ((jArr2[4] ^ j22) ^ (j19 >>> i15)) ^ (j22 << i14);
            jArr[i11 + 5] = ((j23 << i14) ^ ((jArr2[5] ^ j23) ^ (j22 >>> i15))) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[5];
            int i12 = this.f99076ki;
            long j12 = jArr2[6];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[7];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = jArr2[8];
            long j17 = (j14 >>> i12) ^ (j16 << i13);
            long j18 = jArr2[9];
            long j19 = (j16 >>> i12) ^ (j18 << i13);
            long j21 = jArr2[10];
            long j22 = (j18 >>> i12) ^ (j21 << i13);
            long j23 = (j21 >>> i12) ^ (jArr2[11] << i13);
            long j24 = j13 ^ (j23 >>> this.ki_k3);
            long j25 = jArr[i11];
            long j26 = jArr2[0] ^ j24;
            int i14 = this.f99081k3;
            jArr[i11] = j25 ^ (j26 ^ (j24 << i14));
            int i15 = i11 + 1;
            long j27 = jArr[i15];
            long j28 = jArr2[1] ^ j15;
            int i16 = this.k364;
            jArr[i15] = j27 ^ ((j28 ^ (j13 >>> i16)) ^ (j15 << i14));
            int i17 = i11 + 2;
            jArr[i17] = jArr[i17] ^ (((jArr2[2] ^ j17) ^ (j15 >>> i16)) ^ (j17 << i14));
            int i18 = i11 + 3;
            jArr[i18] = jArr[i18] ^ (((jArr2[3] ^ j19) ^ (j17 >>> i16)) ^ (j19 << i14));
            int i19 = i11 + 4;
            jArr[i19] = jArr[i19] ^ (((jArr2[4] ^ j22) ^ (j19 >>> i16)) ^ (j22 << i14));
            int i21 = i11 + 5;
            jArr[i21] = (((j23 << i14) ^ ((jArr2[5] ^ j23) ^ (j22 >>> i16))) & this.mask) ^ jArr[i21];
        }
    }

    public static class REM402_SPECIALIZED_TRINOMIAL_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private final int f99082k3;
        private final int k364;

        public REM402_SPECIALIZED_TRINOMIAL_GF2X(int i11, int i12, int i13, int i14, long j11) {
            this.f99082k3 = i11;
            this.f99076ki = i12;
            this.ki64 = i13;
            this.k364 = i14;
            this.mask = j11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[9];
            int i12 = this.f99076ki;
            long j12 = jArr2[10];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[11];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = jArr2[12];
            long j17 = (j14 >>> i12) ^ (j16 << i13);
            long j18 = j16 >>> i12;
            long j19 = ((j13 >>> 39) ^ (j15 << 25)) ^ (jArr2[6] >>> i12);
            long j21 = jArr2[7];
            long j22 = j19 ^ (j21 << i13);
            long j23 = jArr2[8];
            long j24 = (((j15 >>> 39) ^ (j17 << 25)) ^ (j21 >>> i12)) ^ (j23 << i13);
            long j25 = (((j17 >>> 39) ^ (j18 << 25)) ^ (j23 >>> i12)) ^ (j11 << i13);
            jArr[i11] = jArr2[0] ^ j22;
            jArr[i11 + 1] = jArr2[1] ^ j24;
            long j26 = jArr2[2] ^ j25;
            int i14 = this.f99082k3;
            jArr[i11 + 2] = j26 ^ (j22 << i14);
            long j27 = jArr2[3] ^ j13;
            int i15 = this.k364;
            jArr[i11 + 3] = (j27 ^ (j22 >>> i15)) ^ (j24 << i14);
            jArr[i11 + 4] = ((j15 ^ jArr2[4]) ^ (j24 >>> i15)) ^ (j25 << i14);
            jArr[i11 + 5] = ((j25 >>> i15) ^ (jArr2[5] ^ j17)) ^ (j13 << i14);
            jArr[i11 + 6] = ((jArr2[6] ^ j18) ^ (j13 >>> i15)) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[9];
            int i12 = this.f99076ki;
            long j12 = jArr2[10];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[11];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = jArr2[12];
            long j17 = (j14 >>> i12) ^ (j16 << i13);
            long j18 = j16 >>> i12;
            long j19 = ((j13 >>> 39) ^ (j15 << 25)) ^ (jArr2[6] >>> i12);
            long j21 = jArr2[7];
            long j22 = j19 ^ (j21 << i13);
            long j23 = jArr2[8];
            long j24 = (((j15 >>> 39) ^ (j17 << 25)) ^ (j21 >>> i12)) ^ (j23 << i13);
            long j25 = (((j17 >>> 39) ^ (j18 << 25)) ^ (j23 >>> i12)) ^ (j11 << i13);
            jArr[i11] = jArr[i11] ^ (jArr2[0] ^ j22);
            int i14 = i11 + 1;
            jArr[i14] = jArr[i14] ^ (jArr2[1] ^ j24);
            int i15 = i11 + 2;
            long j26 = jArr[i15];
            long j27 = jArr2[2] ^ j25;
            int i16 = this.f99082k3;
            jArr[i15] = j26 ^ (j27 ^ (j22 << i16));
            int i17 = i11 + 3;
            long j28 = jArr[i17];
            long j29 = jArr2[3] ^ j13;
            int i18 = this.k364;
            jArr[i17] = j28 ^ ((j29 ^ (j22 >>> i18)) ^ (j24 << i16));
            int i19 = i11 + 4;
            jArr[i19] = (((jArr2[4] ^ j15) ^ (j24 >>> i18)) ^ (j25 << i16)) ^ jArr[i19];
            int i21 = i11 + 5;
            jArr[i21] = (((j25 >>> i18) ^ (j17 ^ jArr2[5])) ^ (j13 << i16)) ^ jArr[i21];
            int i22 = i11 + 6;
            jArr[i22] = jArr[i22] ^ (((j13 >>> i18) ^ (jArr2[6] ^ j18)) & this.mask);
        }
    }

    public static class REM544_PENTANOMIAL_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private final int f99083k1;
        private final int k164;

        /* JADX INFO: renamed from: k2, reason: collision with root package name */
        private final int f99084k2;
        private final int k264;

        /* JADX INFO: renamed from: k3, reason: collision with root package name */
        private final int f99085k3;
        private final int k364;
        private final int ki_k1;
        private final int ki_k2;
        private final int ki_k3;

        public REM544_PENTANOMIAL_GF2X(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j11) {
            this.f99083k1 = i11;
            this.f99084k2 = i12;
            this.f99085k3 = i13;
            this.f99076ki = i14;
            this.ki64 = i15;
            this.k164 = i16;
            this.k264 = i17;
            this.k364 = i18;
            this.mask = j11;
            this.ki_k3 = i14 - i13;
            this.ki_k2 = i14 - i12;
            this.ki_k1 = i14 - i11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[16];
            int i12 = this.f99076ki;
            long j12 = j11 >>> i12;
            long j13 = jArr2[8] >>> i12;
            long j14 = jArr2[9];
            int i13 = this.ki64;
            long j15 = j13 ^ (j14 << i13);
            long j16 = (j14 >>> i12) ^ (jArr2[10] << i13);
            long j17 = jArr2[1] ^ j16;
            int i14 = this.k164;
            int i15 = this.f99083k1;
            int i16 = this.k264;
            int i17 = this.f99084k2;
            long j18 = (((j17 ^ (j15 >>> i14)) ^ (j16 << i15)) ^ (j15 >>> i16)) ^ (j16 << i17);
            int i18 = this.k364;
            long j19 = j18 ^ (j15 >>> i18);
            int i19 = this.f99085k3;
            jArr[i11 + 1] = j19 ^ (j16 << i19);
            long j21 = j15 ^ (((j12 >>> this.ki_k3) ^ (j12 >>> this.ki_k2)) ^ (j12 >>> this.ki_k1));
            jArr[i11] = (j21 << i19) ^ (((jArr2[0] ^ j21) ^ (j21 << i15)) ^ (j21 << i17));
            long j22 = (jArr2[10] >>> i12) ^ (jArr2[11] << i13);
            jArr[i11 + 2] = ((((((jArr2[2] ^ j22) ^ (j16 >>> i14)) ^ (j22 << i15)) ^ (j16 >>> i16)) ^ (j22 << i17)) ^ (j16 >>> i18)) ^ (j22 << i19);
            long j23 = (jArr2[11] >>> i12) ^ (jArr2[12] << i13);
            jArr[i11 + 3] = ((((((jArr2[3] ^ j23) ^ (j22 >>> i14)) ^ (j23 << i15)) ^ (j22 >>> i16)) ^ (j23 << i17)) ^ (j22 >>> i18)) ^ (j23 << i19);
            long j24 = (jArr2[12] >>> i12) ^ (jArr2[13] << i13);
            jArr[i11 + 4] = ((((((jArr2[4] ^ j24) ^ (j23 >>> i14)) ^ (j24 << i15)) ^ (j23 >>> i16)) ^ (j24 << i17)) ^ (j23 >>> i18)) ^ (j24 << i19);
            long j25 = (jArr2[13] >>> i12) ^ (jArr2[14] << i13);
            jArr[i11 + 5] = ((((((jArr2[5] ^ j25) ^ (j24 >>> i14)) ^ (j25 << i15)) ^ (j24 >>> i16)) ^ (j25 << i17)) ^ (j24 >>> i18)) ^ (j25 << i19);
            long j26 = (jArr2[14] >>> i12) ^ (jArr2[15] << i13);
            jArr[i11 + 6] = ((((((jArr2[6] ^ j26) ^ (j25 >>> i14)) ^ (j26 << i15)) ^ (j25 >>> i16)) ^ (j26 << i17)) ^ (j25 >>> i18)) ^ (j26 << i19);
            long j27 = (jArr2[15] >>> i12) ^ (jArr2[16] << i13);
            jArr[i11 + 7] = ((j26 >>> i18) ^ (((((jArr2[7] ^ j27) ^ (j26 >>> i14)) ^ (j27 << i15)) ^ (j26 >>> i16)) ^ (j27 << i17))) ^ (j27 << i19);
            jArr[i11 + 8] = ((j12 << i19) ^ ((((((jArr2[8] ^ j12) ^ (j27 >>> i14)) ^ (j12 << i15)) ^ (j27 >>> i16)) ^ (j12 << i17)) ^ (j27 >>> i18))) & this.mask;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[16];
            int i12 = this.f99076ki;
            long j12 = j11 >>> i12;
            long j13 = jArr2[8] >>> i12;
            long j14 = jArr2[9];
            int i13 = this.ki64;
            long j15 = j13 ^ (j14 << i13);
            long j16 = (j14 >>> i12) ^ (jArr2[10] << i13);
            int i14 = i11 + 1;
            long j17 = jArr[i14];
            long j18 = jArr2[1] ^ j16;
            int i15 = this.k164;
            int i16 = this.f99083k1;
            int i17 = this.k264;
            long j19 = ((j18 ^ (j15 >>> i15)) ^ (j16 << i16)) ^ (j15 >>> i17);
            int i18 = this.f99084k2;
            long j21 = j19 ^ (j16 << i18);
            int i19 = this.k364;
            long j22 = j21 ^ (j15 >>> i19);
            int i21 = this.f99085k3;
            jArr[i14] = j17 ^ (j22 ^ (j16 << i21));
            long j23 = j15 ^ (((j12 >>> this.ki_k3) ^ (j12 >>> this.ki_k2)) ^ (j12 >>> this.ki_k1));
            jArr[i11] = ((j23 << i21) ^ (((jArr2[0] ^ j23) ^ (j23 << i16)) ^ (j23 << i18))) ^ jArr[i11];
            long j24 = (jArr2[10] >>> i12) ^ (jArr2[11] << i13);
            int i22 = i11 + 2;
            jArr[i22] = (((((((jArr2[2] ^ j24) ^ (j16 >>> i15)) ^ (j24 << i16)) ^ (j16 >>> i17)) ^ (j24 << i18)) ^ (j16 >>> i19)) ^ (j24 << i21)) ^ jArr[i22];
            long j25 = (jArr2[11] >>> i12) ^ (jArr2[12] << i13);
            int i23 = i11 + 3;
            jArr[i23] = (((((((jArr2[3] ^ j25) ^ (j24 >>> i15)) ^ (j25 << i16)) ^ (j24 >>> i17)) ^ (j25 << i18)) ^ (j24 >>> i19)) ^ (j25 << i21)) ^ jArr[i23];
            long j26 = (jArr2[12] >>> i12) ^ (jArr2[13] << i13);
            int i24 = i11 + 4;
            jArr[i24] = (((((((jArr2[4] ^ j26) ^ (j25 >>> i15)) ^ (j26 << i16)) ^ (j25 >>> i17)) ^ (j26 << i18)) ^ (j25 >>> i19)) ^ (j26 << i21)) ^ jArr[i24];
            long j27 = (jArr2[13] >>> i12) ^ (jArr2[14] << i13);
            int i25 = i11 + 5;
            jArr[i25] = (((((((jArr2[5] ^ j27) ^ (j26 >>> i15)) ^ (j27 << i16)) ^ (j26 >>> i17)) ^ (j27 << i18)) ^ (j26 >>> i19)) ^ (j27 << i21)) ^ jArr[i25];
            long j28 = (jArr2[14] >>> i12) ^ (jArr2[15] << i13);
            int i26 = i11 + 6;
            jArr[i26] = (((((((jArr2[6] ^ j28) ^ (j27 >>> i15)) ^ (j28 << i16)) ^ (j27 >>> i17)) ^ (j28 << i18)) ^ (j27 >>> i19)) ^ (j28 << i21)) ^ jArr[i26];
            long j29 = (jArr2[15] >>> i12) ^ (jArr2[16] << i13);
            int i27 = i11 + 7;
            jArr[i27] = (((j28 >>> i19) ^ (((((jArr2[7] ^ j29) ^ (j28 >>> i15)) ^ (j29 << i16)) ^ (j28 >>> i17)) ^ (j29 << i18))) ^ (j29 << i21)) ^ jArr[i27];
            int i28 = i11 + 8;
            jArr[i28] = (((j12 << i21) ^ ((j29 >>> i19) ^ (((j29 >>> i17) ^ (((jArr2[8] ^ j12) ^ (j29 >>> i15)) ^ (j12 << i16))) ^ (j12 << i18)))) & this.mask) ^ jArr[i28];
        }
    }

    public static class REM544_PENTANOMIAL_K3_IS_128_GF2X extends Rem_GF2n {

        /* JADX INFO: renamed from: k1, reason: collision with root package name */
        private final int f99086k1;
        private final int k164;

        /* JADX INFO: renamed from: k2, reason: collision with root package name */
        private final int f99087k2;
        private final int k264;

        public REM544_PENTANOMIAL_K3_IS_128_GF2X(int i11, int i12, int i13, int i14, int i15, int i16, long j11) {
            this.f99086k1 = i11;
            this.f99087k2 = i12;
            this.f99076ki = i13;
            this.ki64 = i14;
            this.k164 = i15;
            this.k264 = i16;
            this.mask = j11;
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[10];
            int i12 = this.f99076ki;
            long j12 = jArr2[11];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[12];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = (j14 >>> i12) ^ (jArr2[13] << i13);
            long j17 = (jArr2[4] ^ j16) ^ j13;
            int i14 = this.k164;
            int i15 = this.f99086k1;
            int i16 = this.k264;
            int i17 = this.f99087k2;
            jArr[i11 + 4] = (((j17 ^ (j15 >>> i14)) ^ (j16 << i15)) ^ (j15 >>> i16)) ^ (j16 << i17);
            long j18 = (jArr2[13] >>> i12) ^ (jArr2[14] << i13);
            jArr[i11 + 5] = (((((jArr2[5] ^ j18) ^ j15) ^ (j16 >>> i14)) ^ (j18 << i15)) ^ (j16 >>> i16)) ^ (j18 << i17);
            long j19 = (jArr2[14] >>> i12) ^ (jArr2[15] << i13);
            jArr[i11 + 6] = (((((jArr2[6] ^ j19) ^ j16) ^ (j18 >>> i14)) ^ (j19 << i15)) ^ (j18 >>> i16)) ^ (j19 << i17);
            long j21 = (jArr2[15] >>> i12) ^ (jArr2[16] << i13);
            jArr[i11 + 7] = (((((jArr2[7] ^ j21) ^ j18) ^ (j19 >>> i14)) ^ (j21 << i15)) ^ (j19 >>> i16)) ^ (j21 << i17);
            long j22 = jArr2[16] >>> i12;
            jArr[i11 + 8] = ((((((jArr2[8] ^ j22) ^ j19) ^ (j21 >>> i14)) ^ (j22 << i15)) ^ (j21 >>> i16)) ^ (j22 << i17)) & this.mask;
            long j23 = (jArr2[8] ^ j19) >>> i12;
            long j24 = jArr2[9];
            long j25 = (j23 ^ ((j24 ^ j21) << i13)) ^ (jArr2[16] >>> i16);
            long j26 = ((j24 ^ j21) >>> i12) ^ ((jArr2[10] ^ j22) << i13);
            jArr[i11] = ((jArr2[0] ^ j25) ^ (j25 << i15)) ^ (j25 << i17);
            jArr[i11 + 1] = ((((jArr2[1] ^ j26) ^ (j25 >>> i14)) ^ (j26 << i15)) ^ (j25 >>> i16)) ^ (j26 << i17);
            jArr[i11 + 2] = (((((jArr2[2] ^ j13) ^ j25) ^ (j26 >>> i14)) ^ (j13 << i15)) ^ (j26 >>> i16)) ^ (j13 << i17);
            jArr[i11 + 3] = ((j13 >>> i16) ^ (((j26 ^ (jArr2[3] ^ j15)) ^ (j13 >>> i14)) ^ (j15 << i15))) ^ (j15 << i17);
        }

        @Override // org.bouncycastle.pqc.crypto.gemss.Rem_GF2n
        public void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2) {
            long j11 = jArr2[10];
            int i12 = this.f99076ki;
            long j12 = jArr2[11];
            int i13 = this.ki64;
            long j13 = (j11 >>> i12) ^ (j12 << i13);
            long j14 = jArr2[12];
            long j15 = (j12 >>> i12) ^ (j14 << i13);
            long j16 = (j14 >>> i12) ^ (jArr2[13] << i13);
            int i14 = i11 + 4;
            long j17 = jArr[i14];
            long j18 = (jArr2[4] ^ j16) ^ j13;
            int i15 = this.k164;
            int i16 = this.f99086k1;
            long j19 = (j18 ^ (j15 >>> i15)) ^ (j16 << i16);
            int i17 = this.k264;
            long j21 = j19 ^ (j15 >>> i17);
            int i18 = this.f99087k2;
            jArr[i14] = j17 ^ (j21 ^ (j16 << i18));
            long j22 = (jArr2[13] >>> i12) ^ (jArr2[14] << i13);
            int i19 = i11 + 5;
            jArr[i19] = jArr[i19] ^ ((((((jArr2[5] ^ j22) ^ j15) ^ (j16 >>> i15)) ^ (j22 << i16)) ^ (j16 >>> i17)) ^ (j22 << i18));
            long j23 = (jArr2[14] >>> i12) ^ (jArr2[15] << i13);
            int i21 = i11 + 6;
            jArr[i21] = jArr[i21] ^ ((((((jArr2[6] ^ j23) ^ j16) ^ (j22 >>> i15)) ^ (j23 << i16)) ^ (j22 >>> i17)) ^ (j23 << i18));
            long j24 = (jArr2[15] >>> i12) ^ (jArr2[16] << i13);
            int i22 = i11 + 7;
            jArr[i22] = jArr[i22] ^ ((((((jArr2[7] ^ j24) ^ j22) ^ (j23 >>> i15)) ^ (j24 << i16)) ^ (j23 >>> i17)) ^ (j24 << i18));
            long j25 = jArr2[16] >>> i12;
            int i23 = i11 + 8;
            jArr[i23] = jArr[i23] ^ (((((((jArr2[8] ^ j25) ^ j23) ^ (j24 >>> i15)) ^ (j25 << i16)) ^ (j24 >>> i17)) ^ (j25 << i18)) & this.mask);
            long j26 = (jArr2[8] ^ j23) >>> i12;
            long j27 = jArr2[9];
            long j28 = (j26 ^ ((j27 ^ j24) << i13)) ^ (jArr2[16] >>> i17);
            long j29 = ((j24 ^ j27) >>> i12) ^ ((j25 ^ jArr2[10]) << i13);
            jArr[i11] = jArr[i11] ^ (((jArr2[0] ^ j28) ^ (j28 << i16)) ^ (j28 << i18));
            int i24 = i11 + 1;
            jArr[i24] = jArr[i24] ^ (((((jArr2[1] ^ j29) ^ (j28 >>> i15)) ^ (j29 << i16)) ^ (j28 >>> i17)) ^ (j29 << i18));
            int i25 = i11 + 2;
            jArr[i25] = (((((j28 ^ (jArr2[2] ^ j13)) ^ (j29 >>> i15)) ^ (j13 << i16)) ^ (j29 >>> i17)) ^ (j13 << i18)) ^ jArr[i25];
            int i26 = i11 + 3;
            jArr[i26] = ((j15 << i18) ^ ((((j29 ^ (jArr2[3] ^ j15)) ^ (j13 >>> i15)) ^ (j15 << i16)) ^ (j13 >>> i17))) ^ jArr[i26];
        }
    }

    Rem_GF2n() {
    }

    public abstract void rem_gf2n(long[] jArr, int i11, long[] jArr2);

    public abstract void rem_gf2n_xor(long[] jArr, int i11, long[] jArr2);
}
