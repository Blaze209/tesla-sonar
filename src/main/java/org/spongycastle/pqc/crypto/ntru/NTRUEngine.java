package org.spongycastle.pqc.crypto.ntru;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class NTRUEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NTRUEncryptionParameters params;
    private NTRUEncryptionPrivateKeyParameters privKey;
    private NTRUEncryptionPublicKeyParameters pubKey;
    private SecureRandom random;

    private IntegerPolynomial MGF(byte[] bArr, int i11, int i12, boolean z11) {
        Digest digest = this.params.hashAlg;
        int digestSize = digest.getDigestSize();
        byte[] bArrCalcHash = new byte[i12 * digestSize];
        if (z11) {
            bArr = calcHash(digest, bArr);
        }
        int i13 = 0;
        while (i13 < i12) {
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i13);
            System.arraycopy(calcHash(digest), 0, bArrCalcHash, i13 * digestSize, digestSize);
            i13++;
        }
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i11);
        loop1: while (true) {
            int i14 = 0;
            for (int i15 = 0; i15 != bArrCalcHash.length; i15++) {
                int i16 = bArrCalcHash[i15] & 255;
                if (i16 < 243) {
                    for (int i17 = 0; i17 < 4; i17++) {
                        int i18 = i16 % 3;
                        integerPolynomial.coeffs[i14] = i18 - 1;
                        i14++;
                        if (i14 == i11) {
                            break loop1;
                        }
                        i16 = (i16 - i18) / 3;
                    }
                    integerPolynomial.coeffs[i14] = i16 - 1;
                    i14++;
                    if (i14 == i11) {
                        break loop1;
                    }
                }
            }
            if (i14 >= i11) {
                break;
            }
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i13);
            bArrCalcHash = calcHash(digest);
            i13++;
        }
        return integerPolynomial;
    }

    private byte[] buildSData(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[bArr.length + i11 + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    private byte[] calcHash(Digest digest) {
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] copyOf(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        if (i11 >= bArr.length) {
            i11 = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    private byte[] decrypt(byte[] bArr, NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters) throws InvalidCipherTextException {
        Polynomial polynomial = nTRUEncryptionPrivateKeyParameters.f99815t;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPrivateKeyParameters.f99813fp;
        IntegerPolynomial integerPolynomial2 = nTRUEncryptionPrivateKeyParameters.f99814h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i11 = nTRUEncryptionParameters.N;
        int i12 = nTRUEncryptionParameters.f99812q;
        int i13 = nTRUEncryptionParameters.f99807db;
        int i14 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i15 = nTRUEncryptionParameters.f99810dm0;
        int i16 = nTRUEncryptionParameters.pkLen;
        int i17 = nTRUEncryptionParameters.minCallsMask;
        boolean z11 = nTRUEncryptionParameters.hashSeed;
        byte[] bArr2 = nTRUEncryptionParameters.oid;
        if (i14 > 255) {
            throw new DataLengthException("maxMsgLenBytes values bigger than 255 are not supported");
        }
        int i18 = i13 / 8;
        IntegerPolynomial integerPolynomialFromBinary = IntegerPolynomial.fromBinary(bArr, i11, i12);
        IntegerPolynomial integerPolynomialDecrypt = decrypt(integerPolynomialFromBinary, polynomial, integerPolynomial);
        if (integerPolynomialDecrypt.count(-1) < i15) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal -1");
        }
        if (integerPolynomialDecrypt.count(0) < i15) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 0");
        }
        if (integerPolynomialDecrypt.count(1) < i15) {
            throw new InvalidCipherTextException("Less than dm0 coefficients equal 1");
        }
        IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) integerPolynomialFromBinary.clone();
        integerPolynomial3.sub(integerPolynomialDecrypt);
        integerPolynomial3.modPositive(i12);
        IntegerPolynomial integerPolynomial4 = (IntegerPolynomial) integerPolynomial3.clone();
        integerPolynomial4.modPositive(4);
        integerPolynomialDecrypt.sub(MGF(integerPolynomial4.toBinary(4), i11, i17, z11));
        integerPolynomialDecrypt.mod3();
        byte[] binary3Sves = integerPolynomialDecrypt.toBinary3Sves();
        byte[] bArr3 = new byte[i18];
        System.arraycopy(binary3Sves, 0, bArr3, 0, i18);
        int i19 = binary3Sves[i18] & 255;
        if (i19 > i14) {
            throw new InvalidCipherTextException("Message too long: " + i19 + ">" + i14);
        }
        byte[] bArr4 = new byte[i19];
        int i21 = i18 + 1;
        System.arraycopy(binary3Sves, i21, bArr4, 0, i19);
        int i22 = i21 + i19;
        int length = binary3Sves.length - i22;
        byte[] bArr5 = new byte[length];
        System.arraycopy(binary3Sves, i22, bArr5, 0, length);
        if (!Arrays.constantTimeAreEqual(bArr5, new byte[length])) {
            throw new InvalidCipherTextException("The message is not followed by zeroes");
        }
        IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr2, bArr4, i19, bArr3, copyOf(integerPolynomial2.toBinary(i12), i16 / 8)), bArr4).mult(integerPolynomial2);
        integerPolynomialMult.modPositive(i12);
        if (integerPolynomialMult.equals(integerPolynomial3)) {
            return bArr4;
        }
        throw new InvalidCipherTextException("Invalid message encoding");
    }

    private byte[] encrypt(byte[] bArr, NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters) {
        byte[] bArr2 = bArr;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPublicKeyParameters.f99816h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i11 = nTRUEncryptionParameters.N;
        int i12 = nTRUEncryptionParameters.f99812q;
        int i13 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i14 = nTRUEncryptionParameters.f99807db;
        int i15 = nTRUEncryptionParameters.bufferLenBits;
        int i16 = nTRUEncryptionParameters.f99810dm0;
        int i17 = nTRUEncryptionParameters.pkLen;
        int i18 = nTRUEncryptionParameters.minCallsMask;
        boolean z11 = nTRUEncryptionParameters.hashSeed;
        byte[] bArr3 = nTRUEncryptionParameters.oid;
        int length = bArr2.length;
        if (i13 > 255) {
            throw new IllegalArgumentException("llen values bigger than 1 are not supported");
        }
        if (length > i13) {
            throw new DataLengthException("Message too long: " + length + ">" + i13);
        }
        while (true) {
            int i19 = i14 / 8;
            byte[] bArr4 = new byte[i19];
            byte[] bArr5 = bArr3;
            this.random.nextBytes(bArr4);
            int i21 = (i13 + 1) - length;
            int i22 = i14;
            int i23 = i15;
            byte[] bArr6 = new byte[i23 / 8];
            int i24 = i17;
            System.arraycopy(bArr4, 0, bArr6, 0, i19);
            bArr6[i19] = (byte) length;
            int i25 = i19 + 1;
            System.arraycopy(bArr2, 0, bArr6, i25, bArr2.length);
            System.arraycopy(new byte[i21], 0, bArr6, i25 + bArr2.length, i21);
            IntegerPolynomial integerPolynomialFromBinary3Sves = IntegerPolynomial.fromBinary3Sves(bArr6, i11);
            length = length;
            bArr3 = bArr5;
            IntegerPolynomial integerPolynomialMult = generateBlindingPoly(buildSData(bArr3, bArr2, length, bArr4, copyOf(integerPolynomial.toBinary(i12), i24 / 8)), bArr6).mult(integerPolynomial, i12);
            IntegerPolynomial integerPolynomial2 = (IntegerPolynomial) integerPolynomialMult.clone();
            integerPolynomial2.modPositive(4);
            integerPolynomialFromBinary3Sves.add(MGF(integerPolynomial2.toBinary(4), i11, i18, z11));
            integerPolynomialFromBinary3Sves.mod3();
            if (integerPolynomialFromBinary3Sves.count(-1) >= i16 && integerPolynomialFromBinary3Sves.count(0) >= i16 && integerPolynomialFromBinary3Sves.count(1) >= i16) {
                integerPolynomialMult.add(integerPolynomialFromBinary3Sves, i12);
                integerPolynomialMult.ensurePositive(i12);
                return integerPolynomialMult.toBinary(i12);
            }
            bArr2 = bArr;
            i14 = i22;
            i15 = i23;
            i17 = i24;
        }
    }

    private int[] generateBlindingCoeffs(IndexGenerator indexGenerator, int i11) {
        int[] iArr = new int[this.params.N];
        for (int i12 = -1; i12 <= 1; i12 += 2) {
            int i13 = 0;
            while (i13 < i11) {
                int iNextIndex = indexGenerator.nextIndex();
                if (iArr[iNextIndex] == 0) {
                    iArr[iNextIndex] = i12;
                    i13++;
                }
            }
        }
        return iArr;
    }

    private Polynomial generateBlindingPoly(byte[] bArr, byte[] bArr2) {
        IndexGenerator indexGenerator = new IndexGenerator(bArr, this.params);
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters.polyType == 1) {
            return new ProductFormPolynomial(new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, nTRUEncryptionParameters.dr1)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr2)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr3)));
        }
        int i11 = nTRUEncryptionParameters.f99811dr;
        boolean z11 = nTRUEncryptionParameters.sparse;
        int[] iArrGenerateBlindingCoeffs = generateBlindingCoeffs(indexGenerator, i11);
        return z11 ? new SparseTernaryPolynomial(iArrGenerateBlindingCoeffs) : new DenseTernaryPolynomial(iArrGenerateBlindingCoeffs);
    }

    private int log2(int i11) {
        if (i11 == 2048) {
            return 11;
        }
        throw new IllegalStateException("log2 not fully implemented");
    }

    private void putInt(Digest digest, int i11) {
        digest.update((byte) (i11 >> 24));
        digest.update((byte) (i11 >> 16));
        digest.update((byte) (i11 >> 8));
        digest.update((byte) i11);
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.params.maxMsgLenBytes;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        return ((nTRUEncryptionParameters.N * log2(nTRUEncryptionParameters.f99812q)) + 7) / 8;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (!z11) {
            NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) cipherParameters;
            this.privKey = nTRUEncryptionPrivateKeyParameters;
            this.params = nTRUEncryptionPrivateKeyParameters.getParameters();
            return;
        }
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.pubKey = (NTRUEncryptionPublicKeyParameters) parametersWithRandom.getParameters();
        } else {
            this.random = new SecureRandom();
            this.pubKey = (NTRUEncryptionPublicKeyParameters) cipherParameters;
        }
        this.params = this.pubKey.getParameters();
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return this.forEncryption ? encrypt(bArr2, this.pubKey) : decrypt(bArr2, this.privKey);
    }

    private byte[] calcHash(Digest digest, byte[] bArr) {
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, 0);
        return bArr2;
    }

    protected IntegerPolynomial encrypt(IntegerPolynomial integerPolynomial, TernaryPolynomial ternaryPolynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial integerPolynomialMult = ternaryPolynomial.mult(integerPolynomial2, this.params.f99812q);
        integerPolynomialMult.add(integerPolynomial, this.params.f99812q);
        integerPolynomialMult.ensurePositive(this.params.f99812q);
        return integerPolynomialMult;
    }

    protected IntegerPolynomial decrypt(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial integerPolynomialMult;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters.fastFp) {
            integerPolynomialMult = polynomial.mult(integerPolynomial, nTRUEncryptionParameters.f99812q);
            integerPolynomialMult.mult(3);
            integerPolynomialMult.add(integerPolynomial);
        } else {
            integerPolynomialMult = polynomial.mult(integerPolynomial, nTRUEncryptionParameters.f99812q);
        }
        integerPolynomialMult.center0(this.params.f99812q);
        integerPolynomialMult.mod3();
        if (!this.params.fastFp) {
            integerPolynomialMult = new DenseTernaryPolynomial(integerPolynomialMult).mult(integerPolynomial2, 3);
        }
        integerPolynomialMult.center0(3);
        return integerPolynomialMult;
    }
}
