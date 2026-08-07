package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class HQCEngine {
    private int K_BYTE;
    private int K_BYTE_64;
    private int N1N2_BYTE;
    private int N1N2_BYTE_64;
    private int N1_BYTE;
    private int N1_BYTE_64;
    private int N_BYTE;
    private int N_BYTE_64;
    private long RED_MASK;
    private int delta;
    private int fft;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f99088g;
    private int[] generatorPoly;
    private GF2PolynomialCalculator gfCalculator;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f99089k;
    private int mulParam;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f99090n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f99091n1;
    private int n1n2;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private int f99092n2;
    private int rejectionThreshold;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f99093w;

    /* JADX INFO: renamed from: we, reason: collision with root package name */
    private int f99094we;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private int f99095wr;
    private int SEED_SIZE = 40;
    private byte G_FCT_DOMAIN = 3;
    private byte H_FCT_DOMAIN = 4;
    private byte K_FCT_DOMAIN = 5;
    private int GF_POLY_WT = 5;
    private int GF_POLY_M2 = 4;
    private int SALT_SIZE_BYTES = 16;
    private int SALT_SIZE_64 = 2;
    private int SHA512_BYTES = 64;

    public HQCEngine(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int[] iArr) {
        this.f99090n = i11;
        this.f99089k = i14;
        this.delta = i16;
        this.f99093w = i17;
        this.f99095wr = i18;
        this.f99094we = i19;
        this.f99091n1 = i12;
        this.f99092n2 = i13;
        int i23 = i12 * i13;
        this.n1n2 = i23;
        this.generatorPoly = iArr;
        this.f99088g = i15;
        this.rejectionThreshold = i21;
        this.fft = i22;
        this.mulParam = (int) Math.ceil(i13 / 128);
        this.N_BYTE = Utils.getByteSizeFromBitSize(i11);
        this.K_BYTE = i14;
        this.N_BYTE_64 = Utils.getByte64SizeFromBitSize(i11);
        this.K_BYTE_64 = Utils.getByteSizeFromBitSize(i14);
        this.N1_BYTE_64 = Utils.getByteSizeFromBitSize(i12);
        this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(i23);
        this.N1N2_BYTE = Utils.getByteSizeFromBitSize(i23);
        this.N1_BYTE = Utils.getByteSizeFromBitSize(i12);
        long j11 = (1 << ((int) (((long) i11) % 64))) - 1;
        this.RED_MASK = j11;
        this.gfCalculator = new GF2PolynomialCalculator(this.N_BYTE_64, i11, j11);
    }

    private void decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, long[] jArr) {
        long[] jArr2 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr2, bArr3);
        int i11 = this.N1N2_BYTE_64;
        long[] jArr3 = new long[i11];
        Utils.fromByteArrayToLongArray(jArr3, bArr4);
        long[] jArr4 = new long[this.N_BYTE_64];
        System.arraycopy(jArr3, 0, jArr4, 0, i11);
        long[] jArr5 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr5, jArr, jArr2);
        GF2PolynomialCalculator.addLongs(jArr5, jArr5, jArr4);
        int i12 = this.f99091n1;
        byte[] bArr5 = new byte[i12];
        ReedMuller.decode(bArr5, jArr5, i12, this.mulParam);
        ReedSolomon.decode(bArr2, bArr5, this.f99091n1, this.fft, this.delta, this.f99089k, this.f99088g);
        System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
    }

    private void encrypt(byte[] bArr, long[] jArr, long[] jArr2, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr4, this.SEED_SIZE);
        int i11 = this.N_BYTE_64;
        long[] jArr3 = new long[i11];
        long[] jArr4 = new long[i11];
        long[] jArr5 = new long[i11];
        generateRandomFixedWeight(jArr4, keccakRandomGenerator, this.f99095wr);
        generateRandomFixedWeight(jArr5, keccakRandomGenerator, this.f99095wr);
        generateRandomFixedWeight(jArr3, keccakRandomGenerator, this.f99094we);
        long[] jArr6 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr6, jArr5, jArr2);
        GF2PolynomialCalculator.addLongs(jArr6, jArr6, jArr4);
        Utils.fromLongArrayToByteArray(bArr, jArr6);
        int i12 = this.f99091n1;
        byte[] bArr5 = new byte[i12];
        int i13 = this.N1N2_BYTE_64;
        long[] jArr7 = new long[i13];
        long[] jArr8 = new long[this.N_BYTE_64];
        ReedSolomon.encode(bArr5, bArr3, this.K_BYTE * 8, i12, this.f99089k, this.f99088g, this.generatorPoly);
        ReedMuller.encode(jArr7, bArr5, this.f99091n1, this.mulParam);
        System.arraycopy(jArr7, 0, jArr8, 0, i13);
        long[] jArr9 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr9, bArr2);
        long[] jArr10 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr10, jArr5, jArr9);
        GF2PolynomialCalculator.addLongs(jArr10, jArr10, jArr8);
        GF2PolynomialCalculator.addLongs(jArr10, jArr10, jArr3);
        int i14 = this.n1n2;
        int i15 = this.f99090n;
        int i16 = this.N1N2_BYTE_64;
        Utils.resizeArray(jArr, i14, jArr10, i15, i16, i16);
    }

    private void extractCiphertexts(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        System.arraycopy(bArr5, 0, bArr, 0, bArr.length);
        System.arraycopy(bArr5, bArr.length, bArr2, 0, bArr2.length);
        System.arraycopy(bArr5, bArr.length + bArr2.length, bArr3, 0, bArr3.length);
        System.arraycopy(bArr5, bArr.length + bArr2.length + bArr3.length, bArr4, 0, bArr4.length);
    }

    private void extractKeysFromSecretKeys(long[] jArr, long[] jArr2, byte[] bArr, byte[] bArr2) {
        int i11 = this.SEED_SIZE;
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr3, i11);
        generateRandomFixedWeight(jArr, keccakRandomGenerator, this.f99093w);
        generateRandomFixedWeight(jArr2, keccakRandomGenerator, this.f99093w);
        System.arraycopy(bArr2, this.SEED_SIZE, bArr, 0, bArr.length);
    }

    private void extractPublicKeys(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i11 = this.SEED_SIZE;
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.seedExpanderInit(bArr3, i11);
        long[] jArr2 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr2, keccakRandomGenerator);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
        System.arraycopy(bArr2, 40, bArr, 0, bArr.length);
    }

    private void generateRandomFixedWeight(long[] jArr, KeccakRandomGenerator keccakRandomGenerator, int i11) {
        int i12 = this.f99095wr;
        int[] iArr = new int[i12];
        byte[] bArr = new byte[i12 * 4];
        int[] iArr2 = new int[i12];
        int[] iArr3 = new int[i12];
        long[] jArr2 = new long[i12];
        keccakRandomGenerator.expandSeed(bArr, i11 * 4);
        Pack.littleEndianToInt(bArr, 0, iArr, 0, i12);
        for (int i13 = 0; i13 < i11; i13++) {
            iArr2[i13] = (int) (((long) i13) + ((((long) iArr[i13]) & 4294967295L) % ((long) (this.f99090n - i13))));
        }
        for (int i14 = i11 - 1; i14 >= 0; i14--) {
            int i15 = 0;
            for (int i16 = i14 + 1; i16 < i11; i16++) {
                if (iArr2[i16] == iArr2[i14]) {
                    i15 = 1;
                }
            }
            int i17 = -i15;
            iArr2[i14] = ((~i17) & iArr2[i14]) ^ (i17 & i14);
        }
        for (int i18 = 0; i18 < i11; i18++) {
            iArr3[i18] = iArr2[i18] >>> 6;
            jArr2[i18] = 1 << (iArr2[i18] & 63);
        }
        for (int i19 = 0; i19 < this.N_BYTE_64; i19++) {
            long j11 = 0;
            for (int i21 = 0; i21 < i11; i21++) {
                int i22 = i19 - iArr3[i21];
                j11 |= ((long) (-(((i22 | (-i22)) >>> 31) ^ 1))) & jArr2[i21];
            }
            jArr[i19] = j11 | jArr[i19];
        }
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.N_BYTE_64;
        long[] jArr = new long[i11];
        byte[] bArr4 = new byte[this.N_BYTE + 40];
        extractKeysFromSecretKeys(new long[i11], jArr, bArr4, bArr3);
        byte[] bArr5 = new byte[this.N_BYTE];
        byte[] bArr6 = new byte[this.N1N2_BYTE];
        byte[] bArr7 = new byte[this.SHA512_BYTES];
        byte[] bArr8 = new byte[this.SALT_SIZE_BYTES];
        extractCiphertexts(bArr5, bArr6, bArr7, bArr8, bArr2);
        int i12 = this.f99089k;
        byte[] bArr9 = new byte[i12];
        decrypt(bArr9, bArr9, bArr5, bArr6, jArr);
        byte[] bArr10 = new byte[this.SHA512_BYTES];
        int i13 = this.K_BYTE + this.SALT_SIZE_BYTES + this.SEED_SIZE;
        byte[] bArr11 = new byte[i13];
        System.arraycopy(bArr9, 0, bArr11, 0, i12);
        System.arraycopy(bArr4, 0, bArr11, this.K_BYTE, this.SEED_SIZE);
        System.arraycopy(bArr8, 0, bArr11, this.K_BYTE + this.SEED_SIZE, this.SALT_SIZE_BYTES);
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.SHAKE256_512_ds(bArr10, bArr11, i13, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr2 = new long[this.N_BYTE_64];
        byte[] bArr12 = new byte[this.N_BYTE];
        extractPublicKeys(jArr2, bArr12, bArr4);
        byte[] bArr13 = new byte[this.N_BYTE];
        byte[] bArr14 = new byte[this.N1N2_BYTE];
        long[] jArr3 = new long[this.N1N2_BYTE_64];
        encrypt(bArr13, jArr3, jArr2, bArr12, bArr9, bArr10);
        Utils.fromLongArrayToByteArray(bArr14, jArr3);
        byte[] bArr15 = new byte[this.SHA512_BYTES];
        keccakRandomGenerator.SHAKE256_512_ds(bArr15, bArr9, i12, new byte[]{this.H_FCT_DOMAIN});
        byte[] bArr16 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
        byte[] bArrConcatenate = Arrays.concatenate(Arrays.concatenate(bArr9, bArr5), bArr6);
        keccakRandomGenerator.SHAKE256_512_ds(bArr, bArrConcatenate, bArrConcatenate.length, new byte[]{this.K_FCT_DOMAIN});
        boolean zAreEqual = Arrays.areEqual(bArr5, bArr13);
        if (!Arrays.areEqual(bArr6, bArr14)) {
            zAreEqual = false;
        }
        if (!Arrays.areEqual(bArr7, bArr15)) {
            zAreEqual = false;
        }
        if (zAreEqual) {
            return;
        }
        for (int i14 = 0; i14 < getSessionKeySize(); i14++) {
            bArr[i14] = 0;
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        int i11 = this.K_BYTE;
        byte[] bArr8 = new byte[i11];
        byte[] bArr9 = new byte[this.SEED_SIZE];
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.randomGeneratorInit(bArr6, null, bArr6.length, 0);
        keccakRandomGenerator.squeeze(bArr9, 40);
        keccakRandomGenerator.squeeze(new byte[this.SEED_SIZE], 40);
        keccakRandomGenerator.squeeze(bArr8, this.K_BYTE);
        byte[] bArr10 = new byte[this.SHA512_BYTES];
        int i12 = this.K_BYTE + this.SEED_SIZE;
        int i13 = this.SALT_SIZE_BYTES;
        int i14 = i12 + i13;
        byte[] bArr11 = new byte[i14];
        keccakRandomGenerator.squeeze(bArr7, i13);
        System.arraycopy(bArr8, 0, bArr11, 0, i11);
        System.arraycopy(bArr5, 0, bArr11, this.K_BYTE, this.SEED_SIZE);
        System.arraycopy(bArr7, 0, bArr11, this.K_BYTE + this.SEED_SIZE, this.SALT_SIZE_BYTES);
        KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr10, bArr11, i14, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr = new long[this.N_BYTE_64];
        byte[] bArr12 = new byte[this.N_BYTE];
        extractPublicKeys(jArr, bArr12, bArr5);
        long[] jArr2 = new long[this.N1N2_BYTE_64];
        encrypt(bArr, jArr2, jArr, bArr12, bArr8, bArr10);
        Utils.fromLongArrayToByteArray(bArr2, jArr2);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr4, bArr8, i11, new byte[]{this.H_FCT_DOMAIN});
        byte[] bArr13 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
        byte[] bArrConcatenate = Arrays.concatenate(Arrays.concatenate(bArr8, bArr), bArr2);
        keccakRandomGenerator2.SHAKE256_512_ds(bArr3, bArrConcatenate, bArrConcatenate.length, new byte[]{this.K_FCT_DOMAIN});
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i11 = this.SEED_SIZE;
        byte[] bArr4 = new byte[i11];
        KeccakRandomGenerator keccakRandomGenerator = new KeccakRandomGenerator(256);
        keccakRandomGenerator.randomGeneratorInit(bArr3, null, bArr3.length, 0);
        keccakRandomGenerator.squeeze(bArr4, 40);
        KeccakRandomGenerator keccakRandomGenerator2 = new KeccakRandomGenerator(256);
        keccakRandomGenerator2.seedExpanderInit(bArr4, i11);
        int i12 = this.N_BYTE_64;
        long[] jArr = new long[i12];
        long[] jArr2 = new long[i12];
        generateRandomFixedWeight(jArr, keccakRandomGenerator2, this.f99093w);
        generateRandomFixedWeight(jArr2, keccakRandomGenerator2, this.f99093w);
        int i13 = this.SEED_SIZE;
        byte[] bArr5 = new byte[i13];
        keccakRandomGenerator.squeeze(bArr5, 40);
        KeccakRandomGenerator keccakRandomGenerator3 = new KeccakRandomGenerator(256);
        keccakRandomGenerator3.seedExpanderInit(bArr5, i13);
        long[] jArr3 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr3, keccakRandomGenerator3);
        long[] jArr4 = new long[this.N_BYTE_64];
        this.gfCalculator.multLongs(jArr4, jArr2, jArr3);
        GF2PolynomialCalculator.addLongs(jArr4, jArr4, jArr);
        byte[] bArr6 = new byte[this.N_BYTE];
        Utils.fromLongArrayToByteArray(bArr6, jArr4);
        byte[] bArrConcatenate = Arrays.concatenate(bArr5, bArr6);
        byte[] bArrConcatenate2 = Arrays.concatenate(bArr4, bArrConcatenate);
        System.arraycopy(bArrConcatenate, 0, bArr, 0, bArrConcatenate.length);
        System.arraycopy(bArrConcatenate2, 0, bArr2, 0, bArrConcatenate2.length);
    }

    void generatePublicKeyH(long[] jArr, KeccakRandomGenerator keccakRandomGenerator) {
        int i11 = this.N_BYTE;
        byte[] bArr = new byte[i11];
        keccakRandomGenerator.expandSeed(bArr, i11);
        long[] jArr2 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr2, bArr);
        int i12 = this.N_BYTE_64 - 1;
        jArr2[i12] = jArr2[i12] & Utils.bitMask(this.f99090n, 64L);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
    }

    int getSessionKeySize() {
        return this.SHA512_BYTES;
    }
}
