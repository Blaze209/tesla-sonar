package org.spongycastle.crypto.tls;

import java.security.SecureRandom;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class TlsBlockCipher implements TlsCipher {
    protected TlsContext context;
    protected BlockCipher decryptCipher;
    protected BlockCipher encryptCipher;
    protected boolean encryptThenMAC;
    protected byte[] randomData = new byte[256];
    protected TlsMac readMac;
    protected boolean useExplicitIV;
    protected TlsMac writeMac;

    public TlsBlockCipher(TlsContext tlsContext, BlockCipher blockCipher, BlockCipher blockCipher2, Digest digest, Digest digest2, int i11) throws TlsFatalAlert {
        byte[] bArrCopyOfRange;
        byte[] bArrCopyOfRange2;
        ParametersWithIV parametersWithIV;
        ParametersWithIV parametersWithIV2;
        this.context = tlsContext;
        tlsContext.getNonceRandomGenerator().nextBytes(this.randomData);
        this.useExplicitIV = TlsUtils.isTLSv11(tlsContext);
        this.encryptThenMAC = tlsContext.getSecurityParameters().encryptThenMAC;
        int digestSize = (i11 * 2) + digest.getDigestSize() + digest2.getDigestSize();
        digestSize = this.useExplicitIV ? digestSize : digestSize + blockCipher.getBlockSize() + blockCipher2.getBlockSize();
        byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
        TlsMac tlsMac = new TlsMac(tlsContext, digest, bArrCalculateKeyBlock, 0, digest.getDigestSize());
        int digestSize2 = digest.getDigestSize();
        TlsMac tlsMac2 = new TlsMac(tlsContext, digest2, bArrCalculateKeyBlock, digestSize2, digest2.getDigestSize());
        int digestSize3 = digestSize2 + digest2.getDigestSize();
        KeyParameter keyParameter = new KeyParameter(bArrCalculateKeyBlock, digestSize3, i11);
        int i12 = digestSize3 + i11;
        KeyParameter keyParameter2 = new KeyParameter(bArrCalculateKeyBlock, i12, i11);
        int blockSize = i12 + i11;
        if (this.useExplicitIV) {
            bArrCopyOfRange = new byte[blockCipher.getBlockSize()];
            bArrCopyOfRange2 = new byte[blockCipher2.getBlockSize()];
        } else {
            bArrCopyOfRange = Arrays.copyOfRange(bArrCalculateKeyBlock, blockSize, blockCipher.getBlockSize() + blockSize);
            int blockSize2 = blockSize + blockCipher.getBlockSize();
            bArrCopyOfRange2 = Arrays.copyOfRange(bArrCalculateKeyBlock, blockSize2, blockCipher2.getBlockSize() + blockSize2);
            blockSize = blockSize2 + blockCipher2.getBlockSize();
        }
        if (blockSize != digestSize) {
            throw new TlsFatalAlert((short) 80);
        }
        if (tlsContext.isServer()) {
            this.writeMac = tlsMac2;
            this.readMac = tlsMac;
            this.encryptCipher = blockCipher2;
            this.decryptCipher = blockCipher;
            parametersWithIV = new ParametersWithIV(keyParameter2, bArrCopyOfRange2);
            parametersWithIV2 = new ParametersWithIV(keyParameter, bArrCopyOfRange);
        } else {
            this.writeMac = tlsMac;
            this.readMac = tlsMac2;
            this.encryptCipher = blockCipher;
            this.decryptCipher = blockCipher2;
            parametersWithIV = new ParametersWithIV(keyParameter, bArrCopyOfRange);
            parametersWithIV2 = new ParametersWithIV(keyParameter2, bArrCopyOfRange2);
        }
        this.encryptCipher.init(true, parametersWithIV);
        this.decryptCipher.init(false, parametersWithIV2);
    }

    protected int checkPaddingConstantTime(byte[] bArr, int i11, int i12, int i13, int i14) {
        byte b11;
        int i15;
        int i16 = i11 + i12;
        byte b12 = bArr[i16 - 1];
        int i17 = (b12 & 255) + 1;
        if ((!TlsUtils.isSSL(this.context) || i17 <= i13) && i14 + i17 <= i12) {
            int i18 = i16 - i17;
            b11 = 0;
            while (true) {
                int i19 = i18 + 1;
                b11 = (byte) ((bArr[i18] ^ b12) | b11);
                if (i19 >= i16) {
                    break;
                }
                i18 = i19;
            }
            i15 = i17;
            if (b11 != 0) {
                i17 = 0;
            }
        } else {
            i15 = 0;
            b11 = 0;
            i17 = 0;
        }
        byte[] bArr2 = this.randomData;
        while (i15 < 256) {
            b11 = (byte) ((bArr2[i15] ^ b12) | b11);
            i15++;
        }
        bArr2[0] = (byte) (bArr2[0] ^ b11);
        return i17;
    }

    protected int chooseExtraPadBlocks(SecureRandom secureRandom, int i11) {
        return Math.min(lowestBitSet(secureRandom.nextInt()), i11);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) throws TlsFatalAlert {
        int i13;
        int i14;
        byte[] bArr2;
        int blockSize = this.decryptCipher.getBlockSize();
        int size = this.readMac.getSize();
        int iMax = this.encryptThenMAC ? blockSize + size : Math.max(blockSize, size + 1);
        if (this.useExplicitIV) {
            iMax += blockSize;
        }
        if (i12 < iMax) {
            throw new TlsFatalAlert((short) 50);
        }
        boolean z11 = this.encryptThenMAC;
        int i15 = z11 ? i12 - size : i12;
        if (i15 % blockSize != 0) {
            throw new TlsFatalAlert((short) 21);
        }
        if (z11) {
            int i16 = i11 + i12;
            i13 = i11;
            if (!Arrays.constantTimeAreEqual(this.readMac.calculateMac(j11, s11, bArr, i13, i12 - size), Arrays.copyOfRange(bArr, i16 - size, i16))) {
                throw new TlsFatalAlert((short) 20);
            }
        } else {
            i13 = i11;
        }
        if (this.useExplicitIV) {
            this.decryptCipher.init(false, new ParametersWithIV(null, bArr, i13, blockSize));
            i15 -= blockSize;
            i14 = i13 + blockSize;
        } else {
            i14 = i13;
        }
        int i17 = i15;
        for (int i18 = 0; i18 < i17; i18 += blockSize) {
            int i19 = i14 + i18;
            this.decryptCipher.processBlock(bArr, i19, bArr, i19);
        }
        int iCheckPaddingConstantTime = checkPaddingConstantTime(bArr, i14, i17, blockSize, this.encryptThenMAC ? 0 : size);
        boolean z12 = iCheckPaddingConstantTime == 0;
        int i21 = i17 - iCheckPaddingConstantTime;
        if (this.encryptThenMAC) {
            bArr2 = bArr;
        } else {
            int i22 = i21 - size;
            int i23 = i14 + i22;
            bArr2 = bArr;
            int i24 = i14;
            i14 = i24;
            z12 |= !Arrays.constantTimeAreEqual(this.readMac.calculateMacConstantTime(j11, s11, bArr2, i24, i22, i17 - size, this.randomData), Arrays.copyOfRange(bArr, i23, i23 + size));
            i21 = i22;
        }
        if (z12) {
            throw new TlsFatalAlert((short) 20);
        }
        return Arrays.copyOfRange(bArr2, i14, i21 + i14);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        int i13;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        ProtocolVersion serverVersion = this.context.getServerVersion();
        int iChooseExtraPadBlocks = (blockSize - 1) - ((!this.encryptThenMAC ? i12 + size : i12) % blockSize);
        if (!serverVersion.isDTLS() && !serverVersion.isSSL()) {
            iChooseExtraPadBlocks += chooseExtraPadBlocks(this.context.getSecureRandom(), (255 - iChooseExtraPadBlocks) / blockSize) * blockSize;
        }
        int i14 = iChooseExtraPadBlocks;
        int i15 = size + i12 + i14 + 1;
        boolean z11 = this.useExplicitIV;
        if (z11) {
            i15 += blockSize;
        }
        byte[] bArr2 = new byte[i15];
        if (z11) {
            byte[] bArr3 = new byte[blockSize];
            this.context.getNonceRandomGenerator().nextBytes(bArr3);
            this.encryptCipher.init(true, new ParametersWithIV(null, bArr3));
            System.arraycopy(bArr3, 0, bArr2, 0, blockSize);
            i13 = blockSize;
        } else {
            i13 = 0;
        }
        System.arraycopy(bArr, i11, bArr2, i13, i12);
        int length = i13 + i12;
        if (!this.encryptThenMAC) {
            byte[] bArrCalculateMac = this.writeMac.calculateMac(j11, s11, bArr, i11, i12);
            System.arraycopy(bArrCalculateMac, 0, bArr2, length, bArrCalculateMac.length);
            length += bArrCalculateMac.length;
        }
        int i16 = 0;
        while (i16 <= i14) {
            bArr2[length] = (byte) i14;
            i16++;
            length++;
        }
        while (i13 < length) {
            this.encryptCipher.processBlock(bArr2, i13, bArr2, i13);
            i13 += blockSize;
        }
        if (this.encryptThenMAC) {
            int i17 = length;
            byte[] bArrCalculateMac2 = this.writeMac.calculateMac(j11, s11, bArr2, 0, i17);
            System.arraycopy(bArrCalculateMac2, 0, bArr2, i17, bArrCalculateMac2.length);
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i11) {
        int i12;
        int blockSize = this.encryptCipher.getBlockSize();
        int size = this.writeMac.getSize();
        if (this.useExplicitIV) {
            i11 -= blockSize;
        }
        if (this.encryptThenMAC) {
            int i13 = i11 - size;
            i12 = i13 - (i13 % blockSize);
        } else {
            i12 = (i11 - (i11 % blockSize)) - size;
        }
        return i12 - 1;
    }

    public TlsMac getReadMac() {
        return this.readMac;
    }

    public TlsMac getWriteMac() {
        return this.writeMac;
    }

    protected int lowestBitSet(int i11) {
        if (i11 == 0) {
            return 32;
        }
        int i12 = 0;
        while ((i11 & 1) == 0) {
            i12++;
            i11 >>= 1;
        }
        return i12;
    }
}
