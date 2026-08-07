package org.bouncycastle.crypto.hpke;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class AEAD {
    private final short aeadId;
    private final byte[] baseNonce;
    private AEADCipher cipher;
    private final byte[] key;
    private long seq = 0;

    public AEAD(short s11, byte[] bArr, byte[] bArr2) {
        AEADCipher gCMBlockCipher;
        this.key = bArr;
        this.baseNonce = bArr2;
        this.aeadId = s11;
        if (s11 == 1 || s11 == 2) {
            gCMBlockCipher = new GCMBlockCipher(new AESEngine());
        } else if (s11 != 3) {
            return;
        } else {
            gCMBlockCipher = new ChaCha20Poly1305();
        }
        this.cipher = gCMBlockCipher;
    }

    private byte[] ComputeNonce() {
        byte[] bArrLongToBigEndian = Pack.longToBigEndian(this.seq);
        byte[] bArr = this.baseNonce;
        int length = bArr.length;
        byte[] bArrClone = Arrays.clone(bArr);
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = (length - 8) + i11;
            bArrClone[i12] = (byte) (bArrClone[i12] ^ bArrLongToBigEndian[i11]);
        }
        return bArrClone;
    }

    public byte[] open(byte[] bArr, byte[] bArr2) {
        return open(bArr, bArr2, 0, bArr2.length);
    }

    public byte[] seal(byte[] bArr, byte[] bArr2) {
        return seal(bArr, bArr2, 0, bArr2.length);
    }

    public byte[] open(byte[] bArr, byte[] bArr2, int i11, int i12) {
        if (i11 < 0 || i11 > bArr2.length) {
            throw new IndexOutOfBoundsException("Invalid offset");
        }
        if (i11 + i12 > bArr2.length) {
            throw new IndexOutOfBoundsException("Invalid length");
        }
        short s11 = this.aeadId;
        if (s11 != 1 && s11 != 2 && s11 != 3) {
            throw new IllegalStateException("Export only mode, cannot be used to seal/open");
        }
        this.cipher.init(false, new ParametersWithIV(new KeyParameter(this.key), ComputeNonce()));
        this.cipher.processAADBytes(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[this.cipher.getOutputSize(i12)];
        this.cipher.doFinal(bArr3, this.cipher.processBytes(bArr2, i11, i12, bArr3, 0));
        this.seq++;
        return bArr3;
    }

    public byte[] seal(byte[] bArr, byte[] bArr2, int i11, int i12) {
        if (i11 < 0 || i11 > bArr2.length) {
            throw new IndexOutOfBoundsException("Invalid offset");
        }
        if (i11 + i12 > bArr2.length) {
            throw new IndexOutOfBoundsException("Invalid length");
        }
        short s11 = this.aeadId;
        if (s11 != 1 && s11 != 2 && s11 != 3) {
            throw new IllegalStateException("Export only mode, cannot be used to seal/open");
        }
        this.cipher.init(true, new ParametersWithIV(new KeyParameter(this.key), ComputeNonce()));
        this.cipher.processAADBytes(bArr, 0, bArr.length);
        byte[] bArr3 = new byte[this.cipher.getOutputSize(i12)];
        this.cipher.doFinal(bArr3, this.cipher.processBytes(bArr2, i11, i12, bArr3, 0));
        this.seq++;
        return bArr3;
    }
}
