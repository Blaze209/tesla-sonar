package org.spongycastle.crypto.tls;

import org.spongycastle.crypto.Digest;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class TlsNullCipher implements TlsCipher {
    protected TlsContext context;
    protected TlsMac readMac;
    protected TlsMac writeMac;

    public TlsNullCipher(TlsContext tlsContext) {
        this.context = tlsContext;
        this.writeMac = null;
        this.readMac = null;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] decodeCiphertext(long j11, short s11, byte[] bArr, int i11, int i12) throws TlsFatalAlert {
        TlsMac tlsMac = this.readMac;
        if (tlsMac == null) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }
        int size = tlsMac.getSize();
        if (i12 < size) {
            throw new TlsFatalAlert((short) 50);
        }
        int i13 = i12 - size;
        int i14 = i11 + i13;
        if (Arrays.constantTimeAreEqual(Arrays.copyOfRange(bArr, i14, i12 + i11), this.readMac.calculateMac(j11, s11, bArr, i11, i13))) {
            return Arrays.copyOfRange(bArr, i11, i14);
        }
        throw new TlsFatalAlert((short) 20);
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public byte[] encodePlaintext(long j11, short s11, byte[] bArr, int i11, int i12) {
        TlsMac tlsMac = this.writeMac;
        if (tlsMac == null) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }
        byte[] bArrCalculateMac = tlsMac.calculateMac(j11, s11, bArr, i11, i12);
        byte[] bArr2 = new byte[i12 + bArrCalculateMac.length];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        System.arraycopy(bArrCalculateMac, 0, bArr2, i12, bArrCalculateMac.length);
        return bArr2;
    }

    @Override // org.spongycastle.crypto.tls.TlsCipher
    public int getPlaintextLimit(int i11) {
        TlsMac tlsMac = this.writeMac;
        return tlsMac != null ? i11 - tlsMac.getSize() : i11;
    }

    public TlsNullCipher(TlsContext tlsContext, Digest digest, Digest digest2) throws TlsFatalAlert {
        TlsContext tlsContext2;
        TlsMac tlsMac;
        TlsMac tlsMac2;
        if ((digest == null) == (digest2 == null)) {
            this.context = tlsContext;
            if (digest != null) {
                int digestSize = digest.getDigestSize() + digest2.getDigestSize();
                byte[] bArrCalculateKeyBlock = TlsUtils.calculateKeyBlock(tlsContext, digestSize);
                tlsContext2 = tlsContext;
                TlsMac tlsMac3 = new TlsMac(tlsContext2, digest, bArrCalculateKeyBlock, 0, digest.getDigestSize());
                int digestSize2 = digest.getDigestSize();
                TlsMac tlsMac4 = new TlsMac(tlsContext2, digest2, bArrCalculateKeyBlock, digestSize2, digest2.getDigestSize());
                if (digestSize2 + digest2.getDigestSize() != digestSize) {
                    throw new TlsFatalAlert((short) 80);
                }
                tlsMac = tlsMac3;
                tlsMac2 = tlsMac4;
            } else {
                tlsContext2 = tlsContext;
                tlsMac = null;
                tlsMac2 = null;
            }
            if (tlsContext2.isServer()) {
                this.writeMac = tlsMac2;
                this.readMac = tlsMac;
                return;
            } else {
                this.writeMac = tlsMac;
                this.readMac = tlsMac2;
                return;
            }
        }
        throw new TlsFatalAlert((short) 80);
    }
}
