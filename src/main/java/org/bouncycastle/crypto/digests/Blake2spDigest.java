package org.bouncycastle.crypto.digests;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class Blake2spDigest implements ExtendedDigest {
    private int depth;
    private int digestLength;
    private int fanout;
    private long innerHashLength;
    private Blake2sDigest root;
    private int bufferPos = 0;
    private int keyLength = 0;
    private int nodeOffset = 0;
    private Blake2sDigest[] S = new Blake2sDigest[8];
    private byte[] salt = null;
    private byte[] key = null;
    private final int BLAKE2S_BLOCKBYTES = 64;
    private final int BLAKE2S_KEYBYTES = 32;
    private final int BLAKE2S_OUTBYTES = 32;
    private final int PARALLELISM_DEGREE = 8;
    private final byte[] singleByte = new byte[1];
    private byte[] param = new byte[32];
    private byte[] buffer = new byte[512];

    public Blake2spDigest(byte[] bArr) {
        init(bArr);
    }

    private void init(byte[] bArr) {
        int i11;
        if (bArr != null && bArr.length > 0) {
            int length = bArr.length;
            this.keyLength = length;
            if (length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            this.key = Arrays.clone(bArr);
        }
        this.bufferPos = 0;
        this.digestLength = 32;
        this.fanout = 8;
        this.depth = 2;
        this.innerHashLength = 32L;
        byte[] bArr2 = this.param;
        bArr2[0] = (byte) 32;
        bArr2[1] = (byte) this.keyLength;
        bArr2[2] = (byte) 8;
        bArr2[3] = (byte) 2;
        Pack.intToLittleEndian(0, bArr2, 8);
        byte[] bArr3 = this.param;
        bArr3[14] = 1;
        bArr3[15] = (byte) this.innerHashLength;
        this.root = new Blake2sDigest((byte[]) null, this.param);
        Pack.intToLittleEndian(this.nodeOffset, this.param, 8);
        this.param[14] = 0;
        for (int i12 = 0; i12 < 8; i12++) {
            Pack.intToLittleEndian(i12, this.param, 8);
            this.S[i12] = new Blake2sDigest((byte[]) null, this.param);
        }
        this.root.setAsLastNode();
        this.S[7].setAsLastNode();
        if (bArr == null || (i11 = this.keyLength) <= 0) {
            return;
        }
        byte[] bArr4 = new byte[64];
        System.arraycopy(bArr, 0, bArr4, 0, i11);
        for (int i13 = 0; i13 < 8; i13++) {
            this.S[i13].update(bArr4, 0, 64);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 32);
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = this.bufferPos;
            int i14 = i12 * 64;
            if (i13 > i14) {
                int i15 = i13 - i14;
                if (i15 > 64) {
                    i15 = 64;
                }
                this.S[i12].update(this.buffer, i14, i15);
            }
            this.S[i12].doFinal(bArr2[i12], 0);
        }
        for (int i16 = 0; i16 < 8; i16++) {
            this.root.update(bArr2[i16], 0, 32);
        }
        int iDoFinal = this.root.doFinal(bArr, i11);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "BLAKE2sp";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.digestLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.bufferPos = 0;
        this.digestLength = 32;
        this.root.reset();
        for (int i11 = 0; i11 < 8; i11++) {
            this.S[i11].reset();
        }
        this.root.setAsLastNode();
        this.S[7].setAsLastNode();
        byte[] bArr = this.key;
        if (bArr != null) {
            byte[] bArr2 = new byte[64];
            System.arraycopy(bArr, 0, bArr2, 0, this.keyLength);
            for (int i12 = 0; i12 < 8; i12++) {
                this.S[i12].update(bArr2, 0, 64);
            }
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b11) {
        byte[] bArr = this.singleByte;
        bArr[0] = b11;
        update(bArr, 0, 1);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = this.bufferPos;
        int i14 = 512 - i13;
        if (i13 != 0 && i12 >= i14) {
            System.arraycopy(bArr, i11, this.buffer, i13, i14);
            for (int i15 = 0; i15 < 8; i15++) {
                this.S[i15].update(this.buffer, i15 * 64, 64);
            }
            i11 += i14;
            i12 -= i14;
            i13 = 0;
        }
        for (int i16 = 0; i16 < 8; i16++) {
            int i17 = (i16 * 64) + i11;
            for (int i18 = i12; i18 >= 512; i18 -= 512) {
                this.S[i16].update(bArr, i17, 64);
                i17 += 512;
            }
        }
        int i19 = i12 % 512;
        int i21 = i11 + (i12 - i19);
        if (i19 > 0) {
            System.arraycopy(bArr, i21, this.buffer, i13, i19);
        }
        this.bufferPos = i13 + i19;
    }
}
