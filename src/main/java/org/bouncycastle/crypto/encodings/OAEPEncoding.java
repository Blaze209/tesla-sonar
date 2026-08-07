package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private final byte[] defHash;
    private final AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private final Digest mgf1Hash;
    private final int mgf1NoMemoLimit;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, DigestFactory.createSHA1(), null);
    }

    private static int getMGF1NoMemoLimit(Digest digest) {
        if ((digest instanceof Memoable) && (digest instanceof ExtendedDigest)) {
            return ((ExtendedDigest) digest).getByteLength() - 1;
        }
        return Integer.MAX_VALUE;
    }

    private void maskGeneratorFunction1(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15;
        int digestSize = this.mgf1Hash.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        int i16 = i14 + i13;
        int i17 = i16 - digestSize;
        this.mgf1Hash.update(bArr, i11, i12);
        if (i12 > this.mgf1NoMemoLimit) {
            Memoable memoable = (Memoable) this.mgf1Hash;
            Memoable memoableCopy = memoable.copy();
            i15 = 0;
            while (i13 < i17) {
                Pack.intToBigEndian(i15, bArr4, 0);
                this.mgf1Hash.update(bArr4, 0, 4);
                this.mgf1Hash.doFinal(bArr3, 0);
                memoable.reset(memoableCopy);
                Bytes.xorTo(digestSize, bArr3, 0, bArr2, i13);
                i13 += digestSize;
                i15++;
            }
        } else {
            int i18 = i13;
            int i19 = 0;
            while (i18 < i17) {
                Pack.intToBigEndian(i19, bArr4, 0);
                this.mgf1Hash.update(bArr4, 0, 4);
                this.mgf1Hash.doFinal(bArr3, 0);
                this.mgf1Hash.update(bArr, i11, i12);
                Bytes.xorTo(digestSize, bArr3, 0, bArr2, i18);
                i18 += digestSize;
                i19++;
            }
            i15 = i19;
            i13 = i18;
        }
        Pack.intToBigEndian(i15, bArr4, 0);
        this.mgf1Hash.update(bArr4, 0, 4);
        this.mgf1Hash.doFinal(bArr3, 0);
        Bytes.xorTo(i16 - i13, bArr3, 0, bArr2, i13);
    }

    public byte[] decodeBlock(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        byte[] bArr2;
        int outputBlockSize = getOutputBlockSize();
        int outputBlockSize2 = this.engine.getOutputBlockSize();
        byte[] bArr3 = new byte[outputBlockSize2];
        byte[] bArrProcessBlock = this.engine.processBlock(bArr, i11, i12);
        int length = ((outputBlockSize2 - bArrProcessBlock.length) | outputBlockSize) >> 31;
        int iMin = Math.min(outputBlockSize2, bArrProcessBlock.length);
        System.arraycopy(bArrProcessBlock, 0, bArr3, outputBlockSize2 - iMin, iMin);
        Arrays.fill(bArrProcessBlock, (byte) 0);
        this.mgf1Hash.reset();
        byte[] bArr4 = this.defHash;
        maskGeneratorFunction1(bArr3, bArr4.length, outputBlockSize2 - bArr4.length, bArr3, 0, bArr4.length);
        byte[] bArr5 = this.defHash;
        maskGeneratorFunction1(bArr3, 0, bArr5.length, bArr3, bArr5.length, outputBlockSize2 - bArr5.length);
        int i13 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i13 == bArr2.length) {
                break;
            }
            length |= bArr3[bArr2.length + i13] ^ bArr2[i13];
            i13++;
        }
        int i14 = -1;
        for (int length2 = bArr2.length * 2; length2 != outputBlockSize2; length2++) {
            i14 += (((-(bArr3[length2] & 255)) & i14) >> 31) & length2;
        }
        if (((i14 >> 31) | length | (bArr3[i14 + 1] ^ 1)) != 0) {
            Arrays.fill(bArr3, (byte) 0);
            throw new InvalidCipherTextException("data wrong");
        }
        int i15 = i14 + 2;
        int i16 = outputBlockSize2 - i15;
        byte[] bArr6 = new byte[i16];
        System.arraycopy(bArr3, i15, bArr6, 0, i16);
        Arrays.fill(bArr3, (byte) 0);
        return bArr6;
    }

    public byte[] encodeBlock(byte[] bArr, int i11, int i12) {
        int inputBlockSize = getInputBlockSize();
        if (i12 > inputBlockSize) {
            throw new DataLengthException("input data too long");
        }
        int length = inputBlockSize + 1 + (this.defHash.length * 2);
        byte[] bArr2 = new byte[length];
        int i13 = length - i12;
        System.arraycopy(bArr, i11, bArr2, i13, i12);
        bArr2[i13 - 1] = 1;
        byte[] bArr3 = this.defHash;
        System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length2 = this.defHash.length;
        byte[] bArr4 = new byte[length2];
        this.random.nextBytes(bArr4);
        System.arraycopy(bArr4, 0, bArr2, 0, this.defHash.length);
        this.mgf1Hash.reset();
        byte[] bArr5 = this.defHash;
        maskGeneratorFunction1(bArr4, 0, length2, bArr2, bArr5.length, length - bArr5.length);
        byte[] bArr6 = this.defHash;
        maskGeneratorFunction1(bArr2, bArr6.length, length - bArr6.length, bArr2, 0, bArr6.length);
        return this.engine.processBlock(bArr2, 0, length);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.random = z11 ? CryptoServicesRegistrar.getSecureRandom(cipherParameters instanceof ParametersWithRandom ? ((ParametersWithRandom) cipherParameters).getRandom() : null) : null;
        this.forEncryption = z11;
        this.engine.init(z11, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        return this.forEncryption ? encodeBlock(bArr, i11, i12) : decodeBlock(bArr, i11, i12);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this.engine = asymmetricBlockCipher;
        this.mgf1Hash = digest2;
        this.mgf1NoMemoLimit = getMGF1NoMemoLimit(digest2);
        byte[] bArr2 = new byte[digest.getDigestSize()];
        this.defHash = bArr2;
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(bArr2, 0);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }
}
