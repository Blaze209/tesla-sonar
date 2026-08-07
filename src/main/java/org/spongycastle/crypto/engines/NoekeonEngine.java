package org.spongycastle.crypto.engines;

import com.plaid.internal.EnumC4419g;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes10.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int genericSize = 16;
    private static final int[] nullVector = {0, 0, 0, 0};
    private static final int[] roundConstants = {128, 27, 54, 108, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 171, 77, 154, 47, 94, 188, 99, EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, 151, 53, 106, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE};
    private boolean _forEncryption;
    private int[] state = new int[4];
    private int[] subKeys = new int[4];
    private int[] decryptKeys = new int[4];
    private boolean _initialised = false;

    private int bytesToIntBig(byte[] bArr, int i11) {
        int i12 = ((bArr[i11 + 1] & 255) << 16) | (bArr[i11] << 24);
        return (bArr[i11 + 3] & 255) | i12 | ((bArr[i11 + 2] & 255) << 8);
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.state[0] = bytesToIntBig(bArr, i11);
        this.state[1] = bytesToIntBig(bArr, i11 + 4);
        this.state[2] = bytesToIntBig(bArr, i11 + 8);
        this.state[3] = bytesToIntBig(bArr, i11 + 12);
        int[] iArr = this.subKeys;
        System.arraycopy(iArr, 0, this.decryptKeys, 0, iArr.length);
        theta(this.decryptKeys, nullVector);
        int i13 = 16;
        while (i13 > 0) {
            theta(this.state, this.decryptKeys);
            int[] iArr2 = this.state;
            iArr2[0] = iArr2[0] ^ roundConstants[i13];
            pi1(iArr2);
            gamma(this.state);
            pi2(this.state);
            i13--;
        }
        theta(this.state, this.decryptKeys);
        int[] iArr3 = this.state;
        int i14 = roundConstants[i13] ^ iArr3[0];
        iArr3[0] = i14;
        intToBytesBig(i14, bArr2, i12);
        intToBytesBig(this.state[1], bArr2, i12 + 4);
        intToBytesBig(this.state[2], bArr2, i12 + 8);
        intToBytesBig(this.state[3], bArr2, i12 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.state[0] = bytesToIntBig(bArr, i11);
        this.state[1] = bytesToIntBig(bArr, i11 + 4);
        this.state[2] = bytesToIntBig(bArr, i11 + 8);
        this.state[3] = bytesToIntBig(bArr, i11 + 12);
        int i13 = 0;
        while (i13 < 16) {
            int[] iArr = this.state;
            iArr[0] = iArr[0] ^ roundConstants[i13];
            theta(iArr, this.subKeys);
            pi1(this.state);
            gamma(this.state);
            pi2(this.state);
            i13++;
        }
        int[] iArr2 = this.state;
        iArr2[0] = roundConstants[i13] ^ iArr2[0];
        theta(iArr2, this.subKeys);
        intToBytesBig(this.state[0], bArr2, i12);
        intToBytesBig(this.state[1], bArr2, i12 + 4);
        intToBytesBig(this.state[2], bArr2, i12 + 8);
        intToBytesBig(this.state[3], bArr2, i12 + 12);
        return 16;
    }

    private void gamma(int[] iArr) {
        int i11 = iArr[1];
        int i12 = iArr[3];
        int i13 = ~i12;
        int i14 = iArr[2];
        int i15 = i11 ^ (i13 & (~i14));
        iArr[1] = i15;
        int i16 = iArr[0] ^ (i14 & i15);
        iArr[0] = i16;
        iArr[3] = i16;
        iArr[0] = i12;
        int i17 = ((i12 ^ i15) ^ i16) ^ i14;
        iArr[2] = i17;
        int i18 = i15 ^ ((~i16) & (~i17));
        iArr[1] = i18;
        iArr[0] = (i17 & i18) ^ i12;
    }

    private void intToBytesBig(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 24);
        bArr[i12 + 1] = (byte) (i11 >>> 16);
        bArr[i12 + 2] = (byte) (i11 >>> 8);
        bArr[i12 + 3] = (byte) i11;
    }

    private void pi1(int[] iArr) {
        iArr[1] = rotl(iArr[1], 1);
        iArr[2] = rotl(iArr[2], 5);
        iArr[3] = rotl(iArr[3], 2);
    }

    private void pi2(int[] iArr) {
        iArr[1] = rotl(iArr[1], 31);
        iArr[2] = rotl(iArr[2], 27);
        iArr[3] = rotl(iArr[3], 30);
    }

    private int rotl(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    private void setKey(byte[] bArr) {
        this.subKeys[0] = bytesToIntBig(bArr, 0);
        this.subKeys[1] = bytesToIntBig(bArr, 4);
        this.subKeys[2] = bytesToIntBig(bArr, 8);
        this.subKeys[3] = bytesToIntBig(bArr, 12);
    }

    private void theta(int[] iArr, int[] iArr2) {
        int i11 = iArr[0] ^ iArr[2];
        int iRotl = i11 ^ (rotl(i11, 8) ^ rotl(i11, 24));
        iArr[1] = iArr[1] ^ iRotl;
        iArr[3] = iRotl ^ iArr[3];
        for (int i12 = 0; i12 < 4; i12++) {
            iArr[i12] = iArr[i12] ^ iArr2[i12];
        }
        int i13 = iArr[1] ^ iArr[3];
        int iRotl2 = i13 ^ (rotl(i13, 8) ^ rotl(i13, 24));
        iArr[0] = iArr[0] ^ iRotl2;
        iArr[2] = iRotl2 ^ iArr[2];
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this._forEncryption = z11;
            this._initialised = true;
            setKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (!this._initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i11 + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + 16 <= bArr2.length) {
            return this._forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
        }
        throw new OutputLengthException("output buffer too short");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
