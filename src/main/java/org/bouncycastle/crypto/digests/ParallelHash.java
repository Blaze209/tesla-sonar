package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes9.dex */
public class ParallelHash implements Xof, Digest {
    private static final byte[] N_PARALLEL_HASH = Strings.toByteArray("ParallelHash");
    private final int B;
    private final int bitLength;
    private int bufOff;
    private final byte[] buffer;
    private final CSHAKEDigest compressor;
    private final byte[] compressorBuffer;
    private final CSHAKEDigest cshake;
    private boolean firstOutput;
    private int nCount;
    private final int outputLength;
    private final CryptoServicePurpose purpose;

    public ParallelHash(int i11, byte[] bArr, int i12) {
        this(i11, bArr, i12, i11 * 2, CryptoServicePurpose.ANY);
    }

    private void compress() {
        compress(this.buffer, 0, this.bufOff);
        this.bufOff = 0;
    }

    private void wrapUp(int i11) {
        if (this.bufOff != 0) {
            compress();
        }
        byte[] bArrRightEncode = XofUtils.rightEncode(this.nCount);
        byte[] bArrRightEncode2 = XofUtils.rightEncode(i11 * 8);
        this.cshake.update(bArrRightEncode, 0, bArrRightEncode.length);
        this.cshake.update(bArrRightEncode2, 0, bArrRightEncode2.length);
        this.firstOutput = false;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        if (this.firstOutput) {
            wrapUp(this.outputLength);
        }
        int iDoFinal = this.cshake.doFinal(bArr, i11, getDigestSize());
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i11, int i12) {
        if (this.firstOutput) {
            wrapUp(0);
        }
        return this.cshake.doOutput(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "ParallelHash" + this.cshake.getAlgorithmName().substring(6);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.cshake.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.cshake.reset();
        Arrays.clear(this.buffer);
        byte[] bArrLeftEncode = XofUtils.leftEncode(this.B);
        this.cshake.update(bArrLeftEncode, 0, bArrLeftEncode.length);
        this.nCount = 0;
        this.bufOff = 0;
        this.firstOutput = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b11) {
        byte[] bArr = this.buffer;
        int i11 = this.bufOff;
        int i12 = i11 + 1;
        this.bufOff = i12;
        bArr[i11] = b11;
        if (i12 == bArr.length) {
            compress();
        }
    }

    public ParallelHash(int i11, byte[] bArr, int i12, int i13) {
        this(i11, bArr, i12, i13, CryptoServicePurpose.ANY);
    }

    private void compress(byte[] bArr, int i11, int i12) {
        this.compressor.update(bArr, i11, i12);
        CSHAKEDigest cSHAKEDigest = this.compressor;
        byte[] bArr2 = this.compressorBuffer;
        cSHAKEDigest.doFinal(bArr2, 0, bArr2.length);
        CSHAKEDigest cSHAKEDigest2 = this.cshake;
        byte[] bArr3 = this.compressorBuffer;
        cSHAKEDigest2.update(bArr3, 0, bArr3.length);
        this.nCount++;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i11, int i12) {
        if (this.firstOutput) {
            wrapUp(this.outputLength);
        }
        int iDoFinal = this.cshake.doFinal(bArr, i11, i12);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        int iMax = Math.max(0, i12);
        if (this.bufOff != 0) {
            while (i13 < iMax) {
                int i14 = this.bufOff;
                byte[] bArr2 = this.buffer;
                if (i14 == bArr2.length) {
                    break;
                }
                this.bufOff = i14 + 1;
                bArr2[i14] = bArr[i13 + i11];
                i13++;
            }
            if (this.bufOff == this.buffer.length) {
                compress();
            }
        }
        if (i13 < iMax) {
            while (true) {
                int i15 = iMax - i13;
                int i16 = this.B;
                if (i15 < i16) {
                    break;
                }
                compress(bArr, i11 + i13, i16);
                i13 += this.B;
            }
        }
        while (i13 < iMax) {
            update(bArr[i13 + i11]);
            i13++;
        }
    }

    public ParallelHash(int i11, byte[] bArr, int i12, int i13, CryptoServicePurpose cryptoServicePurpose) {
        this.cshake = new CSHAKEDigest(i11, N_PARALLEL_HASH, bArr);
        this.compressor = new CSHAKEDigest(i11, new byte[0], new byte[0]);
        this.bitLength = i11;
        this.B = i12;
        this.outputLength = (i13 + 7) / 8;
        this.buffer = new byte[i12];
        this.compressorBuffer = new byte[(i11 * 2) / 8];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i11, cryptoServicePurpose));
        reset();
    }

    public ParallelHash(ParallelHash parallelHash) {
        this.cshake = new CSHAKEDigest(parallelHash.cshake);
        this.compressor = new CSHAKEDigest(parallelHash.compressor);
        int i11 = parallelHash.bitLength;
        this.bitLength = i11;
        this.B = parallelHash.B;
        this.outputLength = parallelHash.outputLength;
        this.buffer = Arrays.clone(parallelHash.buffer);
        this.compressorBuffer = Arrays.clone(parallelHash.compressorBuffer);
        CryptoServicePurpose cryptoServicePurpose = parallelHash.purpose;
        this.purpose = cryptoServicePurpose;
        this.firstOutput = parallelHash.firstOutput;
        this.nCount = parallelHash.nCount;
        this.bufOff = parallelHash.bufOff;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, i11, cryptoServicePurpose));
    }
}
