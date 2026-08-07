package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class TlsStreamCipher implements TlsCipher {
    protected TlsContext context;
    protected StreamCipher decryptCipher;
    protected StreamCipher encryptCipher;
    protected TlsMac readMac;
    protected boolean usesNonce;
    protected TlsMac writeMac;

    public TlsStreamCipher(TlsContext tlsContext, StreamCipher streamCipher, StreamCipher streamCipher2, Digest digest, Digest digest2, int i11, boolean z11) throws TlsFatalAlert {
        boolean zIsServer = tlsContext.isServer();
        this.context = tlsContext;
        this.usesNonce = z11;
        this.encryptCipher = streamCipher;
        this.decryptCipher = streamCipher2;
        int digestSize = (i11 * 2) + digest.getDigestSize() + digest2.getDigestSize();
        byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
        TlsMac tlsMac = new TlsMac(tlsContext, digest, bArrCalculateKeyBlock, 0, digest.getDigestSize());
        int digestSize2 = digest.getDigestSize();
        TlsMac tlsMac2 = new TlsMac(tlsContext, digest2, bArrCalculateKeyBlock, digestSize2, digest2.getDigestSize());
        int digestSize3 = digestSize2 + digest2.getDigestSize();
        CipherParameters keyParameter = new KeyParameter(bArrCalculateKeyBlock, digestSize3, i11);
        int i12 = digestSize3 + i11;
        CipherParameters keyParameter2 = new KeyParameter(bArrCalculateKeyBlock, i12, i11);
        if (i12 + i11 != digestSize) {
            throw new TlsFatalAlert((short) 80);
        }
        if (zIsServer) {
            this.writeMac = tlsMac2;
            this.readMac = tlsMac;
            this.encryptCipher = streamCipher2;
            this.decryptCipher = streamCipher;
            keyParameter2 = keyParameter;
            keyParameter = keyParameter2;
        } else {
            this.writeMac = tlsMac;
            this.readMac = tlsMac2;
            this.encryptCipher = streamCipher;
            this.decryptCipher = streamCipher2;
        }
        if (z11) {
            byte[] bArr = new byte[8];
            ParametersWithIV parametersWithIV = new ParametersWithIV(keyParameter, bArr);
            keyParameter2 = new ParametersWithIV(keyParameter2, bArr);
            keyParameter = parametersWithIV;
        }
        this.encryptCipher.init(true, keyParameter);
        this.decryptCipher.init(false, keyParameter2);
    }

    protected void checkMAC(long j11, short s11, byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) throws TlsFatalAlert {
        if (!Arrays.constantTimeAreEqual(Arrays.copyOfRange(bArr, i11, i12), this.readMac.calculateMac(j11, s11, bArr2, i13, i14))) {
            throw new TlsFatalAlert((short) 20);
        }
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) throws TlsFatalAlert {
        if (this.usesNonce) {
            updateIV(this.decryptCipher, false, j11);
        }
        int size = this.readMac.getSize();
        if (i12 < size) {
            throw new TlsFatalAlert((short) 50);
        }
        int i13 = i12 - size;
        byte[] bArr2 = new byte[i12];
        this.decryptCipher.processBytes(bArr, i11, i12, bArr2, 0);
        checkMAC(j11, s11, bArr2, i13, i12, bArr2, 0, i13);
        return Arrays.copyOfRange(bArr2, 0, i13);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        if (this.usesNonce) {
            updateIV(this.encryptCipher, true, j11);
        }
        byte[] bArr2 = new byte[i12 + this.writeMac.getSize()];
        this.encryptCipher.processBytes(bArr, i11, i12, bArr2, 0);
        byte[] bArrCalculateMac = this.writeMac.calculateMac(j11, s11, bArr, i11, i12);
        this.encryptCipher.processBytes(bArrCalculateMac, 0, bArrCalculateMac.length, bArr2, i12);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i11) {
        return i11 - this.writeMac.getSize();
    }

    protected void updateIV(StreamCipher streamCipher, boolean z11, long j11) {
        byte[] bArr = new byte[8];
        TlsUtils.writeUint64(j11, bArr, 0);
        streamCipher.init(z11, new ParametersWithIV(null, bArr));
    }
}
