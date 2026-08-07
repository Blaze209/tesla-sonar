package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class KyberEngine {
    private static final int KyberEta2 = 2;
    private static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    private static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private KyberIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    /* JADX WARN: Code duplicated, block: B:16:0x0069  */
    /* JADX WARN: Code duplicated, block: B:18:0x0071  */
    public KyberEngine(int i11, boolean z11) {
        int i12;
        Symmetric shakeSymmetric;
        this.KyberK = i11;
        if (i11 != 2) {
            if (i11 == 3) {
                this.KyberEta1 = 2;
            } else {
                if (i11 != 4) {
                    throw new IllegalArgumentException("K: " + i11 + " is not supported for Crystals Kyber");
                }
                this.KyberEta1 = 2;
                this.KyberPolyCompressedBytes = 160;
                i12 = i11 * 352;
            }
            this.KyberPolyVecCompressedBytes = i12;
            this.sessionKeyLength = 32;
            int i13 = i11 * KyberPolyBytes;
            this.KyberPolyVecBytes = i13;
            int i14 = i13 + 32;
            this.KyberIndCpaPublicKeyBytes = i14;
            this.KyberIndCpaSecretKeyBytes = i13;
            int i15 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
            this.KyberIndCpaBytes = i15;
            this.KyberPublicKeyBytes = i14;
            int i16 = i13 + i14 + 64;
            this.KyberSecretKeyBytes = i16;
            this.KyberCipherTextBytes = i15;
            this.CryptoBytes = 32;
            this.CryptoSecretKeyBytes = i16;
            this.CryptoPublicKeyBytes = i14;
            this.CryptoCipherTextBytes = i15;
            if (z11) {
                shakeSymmetric = new Symmetric.AesSymmetric();
            } else {
                shakeSymmetric = new Symmetric.ShakeSymmetric();
            }
            this.symmetric = shakeSymmetric;
            this.indCpa = new KyberIndCpa(this);
        }
        this.KyberEta1 = 3;
        this.KyberPolyCompressedBytes = 128;
        i12 = i11 * 320;
        this.KyberPolyVecCompressedBytes = i12;
        this.sessionKeyLength = 32;
        int i17 = i11 * KyberPolyBytes;
        this.KyberPolyVecBytes = i17;
        int i18 = i17 + 32;
        this.KyberIndCpaPublicKeyBytes = i18;
        this.KyberIndCpaSecretKeyBytes = i17;
        int i19 = this.KyberPolyVecCompressedBytes + this.KyberPolyCompressedBytes;
        this.KyberIndCpaBytes = i19;
        this.KyberPublicKeyBytes = i18;
        int i110 = i17 + i18 + 64;
        this.KyberSecretKeyBytes = i110;
        this.KyberCipherTextBytes = i19;
        this.CryptoBytes = 32;
        this.CryptoSecretKeyBytes = i110;
        this.CryptoPublicKeyBytes = i18;
        this.CryptoCipherTextBytes = i19;
        if (z11) {
            shakeSymmetric = new Symmetric.AesSymmetric();
        } else {
            shakeSymmetric = new Symmetric.ShakeSymmetric();
        }
        this.symmetric = shakeSymmetric;
        this.indCpa = new KyberIndCpa(this);
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i11, boolean z11) {
        if (z11) {
            System.arraycopy(bArr2, 0, bArr, 0, i11);
        } else {
            System.arraycopy(bArr, 0, bArr, 0, i11);
        }
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    public byte[][] generateKemKeyPair() {
        byte[][] bArrGenerateKeyPair = this.indCpa.generateKeyPair();
        int i11 = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr = new byte[i11];
        System.arraycopy(bArrGenerateKeyPair[1], 0, bArr, 0, i11);
        byte[] bArr2 = new byte[32];
        this.symmetric.hash_h(bArr2, bArrGenerateKeyPair[0], 0);
        byte[] bArr3 = new byte[32];
        this.random.nextBytes(bArr3);
        int i12 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr4 = new byte[i12];
        System.arraycopy(bArrGenerateKeyPair[0], 0, bArr4, 0, i12);
        int i13 = i12 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr4, 0, i13), Arrays.copyOfRange(bArr4, i13, i12), bArr, bArr2, bArr3};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public void getRandomBytes(byte[] bArr) {
        this.random.nextBytes(bArr);
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public byte[] kemDecrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, this.KyberIndCpaSecretKeyBytes, bArr2.length);
        System.arraycopy(this.indCpa.decrypt(bArr, bArr2), 0, bArr3, 0, 32);
        System.arraycopy(bArr2, this.KyberSecretKeyBytes - 64, bArr3, 32, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        boolean z11 = !Arrays.constantTimeAreEqual(bArr, this.indCpa.encrypt(Arrays.copyOfRange(bArr3, 0, 32), bArrCopyOfRange, Arrays.copyOfRange(bArr4, 32, 64)));
        this.symmetric.hash_h(bArr4, bArr, 32);
        int i11 = this.KyberSecretKeyBytes;
        cmov(bArr4, Arrays.copyOfRange(bArr2, i11 - 32, i11), 32, z11);
        return Arrays.copyOfRange(bArr4, 0, this.sessionKeyLength);
    }

    public byte[][] kemEncrypt(byte[] bArr) {
        if (bArr.length != this.KyberIndCpaPublicKeyBytes) {
            throw new IllegalArgumentException("Input validation Error: Type check failed for ml-kem encapsulation");
        }
        PolyVec polyVec = new PolyVec(this);
        if (!Arrays.areEqual(this.indCpa.packPublicKey(polyVec, this.indCpa.unpackPublicKey(polyVec, bArr)), bArr)) {
            throw new IllegalArgumentException("Input validation: Modulus check failed for ml-kem encapsulation");
        }
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        this.random.nextBytes(bArr4);
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        this.symmetric.hash_h(bArr2, bArr, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] bArrEncrypt = this.indCpa.encrypt(Arrays.copyOfRange(bArr2, 0, 32), bArr, Arrays.copyOfRange(bArr3, 32, 64));
        int i11 = this.sessionKeyLength;
        byte[] bArr5 = new byte[i11];
        System.arraycopy(bArr3, 0, bArr5, 0, i11);
        return new byte[][]{bArr5, bArrEncrypt};
    }
}
