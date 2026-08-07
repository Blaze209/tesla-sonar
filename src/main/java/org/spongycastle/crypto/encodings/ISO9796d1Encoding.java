package org.spongycastle.crypto.encodings;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;

/* JADX INFO: loaded from: classes10.dex */
public class ISO9796d1Encoding implements AsymmetricBlockCipher {
    private int bitSize;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private BigInteger modulus;
    private int padBits = 0;
    private static final BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static final BigInteger SIX = BigInteger.valueOf(6);
    private static byte[] shadows = {14, 3, 5, 8, 9, 4, 2, 15, 0, 13, 11, 6, 7, 10, 12, 1};
    private static byte[] inverse = {8, 15, 6, 1, 5, 2, 11, 12, 3, 4, 13, 10, 14, 9, 0, 7};

    public ISO9796d1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this.engine = asymmetricBlockCipher;
    }

    private static byte[] convertOutputDecryptOnly(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    private byte[] decodeBlock(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i11, i12);
        int i13 = (this.bitSize + 13) / 16;
        BigInteger bigInteger = new BigInteger(1, bArrProcessBlock);
        BigInteger bigInteger2 = SIXTEEN;
        BigInteger bigIntegerMod = bigInteger.mod(bigInteger2);
        BigInteger bigInteger3 = SIX;
        if (!bigIntegerMod.equals(bigInteger3)) {
            if (!this.modulus.subtract(bigInteger).mod(bigInteger2).equals(bigInteger3)) {
                throw new InvalidCipherTextException("resulting integer iS or (modulus - iS) is not congruent to 6 mod 16");
            }
            bigInteger = this.modulus.subtract(bigInteger);
        }
        byte[] bArrConvertOutputDecryptOnly = convertOutputDecryptOnly(bigInteger);
        if ((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & 15) != 6) {
            throw new InvalidCipherTextException("invalid forcing byte in block");
        }
        bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] = (byte) (((bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 1] & 255) >>> 4) | (inverse[(bArrConvertOutputDecryptOnly[bArrConvertOutputDecryptOnly.length - 2] & 255) >> 4] << 4));
        byte[] bArr2 = shadows;
        byte b11 = bArrConvertOutputDecryptOnly[1];
        byte b12 = (byte) (bArr2[b11 & 15] | (bArr2[(b11 & 255) >>> 4] << 4));
        bArrConvertOutputDecryptOnly[0] = b12;
        int i14 = 1;
        int i15 = 0;
        boolean z11 = false;
        for (int length = bArrConvertOutputDecryptOnly.length - 1; length >= bArrConvertOutputDecryptOnly.length - (i13 * 2); length -= 2) {
            byte[] bArr3 = shadows;
            byte b13 = bArrConvertOutputDecryptOnly[length];
            int i16 = bArr3[b13 & 15] | (bArr3[(b13 & 255) >>> 4] << 4);
            int i17 = length - 1;
            byte b14 = bArrConvertOutputDecryptOnly[i17];
            if (((b14 ^ i16) & 255) != 0) {
                if (z11) {
                    throw new InvalidCipherTextException("invalid tsums in block");
                }
                i14 = (b14 ^ i16) & 255;
                z11 = true;
                i15 = i17;
            }
        }
        bArrConvertOutputDecryptOnly[i15] = 0;
        int length2 = (bArrConvertOutputDecryptOnly.length - i15) / 2;
        byte[] bArr4 = new byte[length2];
        for (int i18 = 0; i18 < length2; i18++) {
            bArr4[i18] = bArrConvertOutputDecryptOnly[(i18 * 2) + i15 + 1];
        }
        this.padBits = i14 - 1;
        return bArr4;
    }

    private byte[] encodeBlock(byte[] bArr, int i11, int i12) {
        int i13 = this.bitSize;
        int i14 = (i13 + 7) / 8;
        byte[] bArr2 = new byte[i14];
        int i15 = 1;
        int i16 = this.padBits + 1;
        int i17 = (i13 + 13) / 16;
        int i18 = 0;
        while (i18 < i17) {
            if (i18 > i17 - i12) {
                int i19 = i17 - i18;
                System.arraycopy(bArr, (i11 + i12) - i19, bArr2, i14 - i17, i19);
            } else {
                System.arraycopy(bArr, i11, bArr2, i14 - (i18 + i12), i12);
            }
            i18 += i12;
        }
        for (int i21 = i14 - (i17 * 2); i21 != i14; i21 += 2) {
            byte b11 = bArr2[(i14 - i17) + (i21 / 2)];
            byte[] bArr3 = shadows;
            bArr2[i21] = (byte) (bArr3[b11 & 15] | (bArr3[(b11 & 255) >>> 4] << 4));
            bArr2[i21 + 1] = b11;
        }
        int i22 = i14 - (i12 * 2);
        bArr2[i22] = (byte) (bArr2[i22] ^ i16);
        int i23 = i14 - 1;
        bArr2[i23] = (byte) ((bArr2[i23] << 4) | 6);
        int i24 = 8 - ((this.bitSize - 1) % 8);
        if (i24 != 8) {
            byte b12 = (byte) (bArr2[0] & (255 >>> i24));
            bArr2[0] = b12;
            bArr2[0] = (byte) ((128 >>> i24) | b12);
            i15 = 0;
        } else {
            bArr2[0] = 0;
            bArr2[1] = (byte) (bArr2[1] | 128);
        }
        return this.engine.processBlock(bArr2, i15, i14 - i15);
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize + 1) / 2 : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize + 1) / 2;
    }

    public int getPadBits() {
        return this.padBits;
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        RSAKeyParameters rSAKeyParameters = cipherParameters instanceof ParametersWithRandom ? (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters() : (RSAKeyParameters) cipherParameters;
        this.engine.init(z11, cipherParameters);
        BigInteger modulus = rSAKeyParameters.getModulus();
        this.modulus = modulus;
        this.bitSize = modulus.bitLength();
        this.forEncryption = z11;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        return this.forEncryption ? encodeBlock(bArr, i11, i12) : decodeBlock(bArr, i11, i12);
    }

    public void setPadBits(int i11) {
        if (i11 > 7) {
            throw new IllegalArgumentException("padBits > 7");
        }
        this.padBits = i11;
    }
}
