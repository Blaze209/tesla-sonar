package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
class RainbowDRBG extends SecureRandom {
    private Digest hashAlgo;
    private byte[] key;
    private byte[] seed;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f99140v;

    public RainbowDRBG(byte[] bArr, Digest digest) {
        this.seed = bArr;
        this.hashAlgo = digest;
        init(256);
    }

    private void AES256_CTR_DRBG_Update(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 15; i12 >= 0; i12--) {
                byte b11 = bArr3[i12];
                if ((b11 & 255) != 255) {
                    bArr3[i12] = (byte) (b11 + 1);
                    break;
                }
                bArr3[i12] = 0;
            }
            AES256_ECB(bArr2, bArr3, bArr4, i11 * 16);
        }
        if (bArr != null) {
            for (int i13 = 0; i13 < 48; i13++) {
                bArr4[i13] = (byte) (bArr4[i13] ^ bArr[i13]);
            }
        }
        System.arraycopy(bArr4, 0, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, 32, bArr3, 0, bArr3.length);
    }

    private void AES256_ECB(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        try {
            AESEngine aESEngine = new AESEngine();
            aESEngine.init(true, new KeyParameter(bArr));
            for (int i12 = 0; i12 != bArr2.length; i12 += 16) {
                aESEngine.processBlock(bArr2, i12, bArr3, i11 + i12);
            }
        } catch (Throwable th2) {
            throw new IllegalStateException("drbg failure: " + th2.getMessage(), th2);
        }
    }

    private void init(int i11) {
        byte[] bArr = this.seed;
        if (bArr.length >= 48) {
            randombytes_init(bArr, i11);
        } else {
            randombytes_init(Arrays.concatenate(this.seed, RainbowUtil.hash(this.hashAlgo, bArr, 48 - bArr.length)), i11);
        }
    }

    private void randombytes_init(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[48];
        System.arraycopy(bArr, 0, bArr2, 0, 48);
        byte[] bArr3 = new byte[32];
        this.key = bArr3;
        byte[] bArr4 = new byte[16];
        this.f99140v = bArr4;
        AES256_CTR_DRBG_Update(bArr2, bArr3, bArr4);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int length = bArr.length;
        int i11 = 0;
        while (length > 0) {
            for (int i12 = 15; i12 >= 0; i12--) {
                byte[] bArr3 = this.f99140v;
                byte b11 = bArr3[i12];
                if ((b11 & 255) != 255) {
                    bArr3[i12] = (byte) (b11 + 1);
                    break;
                }
                bArr3[i12] = 0;
            }
            AES256_ECB(this.key, this.f99140v, bArr2, 0);
            if (length > 15) {
                System.arraycopy(bArr2, 0, bArr, i11, 16);
                i11 += 16;
                length -= 16;
            } else {
                System.arraycopy(bArr2, 0, bArr, i11, length);
                length = 0;
            }
        }
        AES256_CTR_DRBG_Update(null, this.key, this.f99140v);
    }
}
