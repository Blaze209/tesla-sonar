package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class RFC3394WrapEngine implements Wrapper {
    private static final byte[] DEFAULT_IV = {-90, -90, -90, -90, -90, -90, -90, -90};
    private final BlockCipher engine;
    private boolean forWrapping;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private final byte[] f98697iv;
    private KeyParameter param;
    private final boolean wrapCipherMode;

    public RFC3394WrapEngine(BlockCipher blockCipher) {
        this(blockCipher, false);
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return this.engine.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forWrapping = z11;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        if (cipherParameters instanceof KeyParameter) {
            this.param = (KeyParameter) cipherParameters;
            System.arraycopy(DEFAULT_IV, 0, this.f98697iv, 0, 8);
        } else if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] iv2 = parametersWithIV.getIV();
            if (iv2.length != 8) {
                throw new IllegalArgumentException("IV not equal to 8");
            }
            this.param = (KeyParameter) parametersWithIV.getParameters();
            System.arraycopy(iv2, 0, this.f98697iv, 0, 8);
        }
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i11, int i12) throws InvalidCipherTextException {
        byte[] bArr2;
        if (this.forWrapping) {
            throw new IllegalStateException("not set for unwrapping");
        }
        if (i12 < 16) {
            throw new InvalidCipherTextException("unwrap data too short");
        }
        int i13 = i12 / 8;
        if (i13 * 8 != i12) {
            throw new InvalidCipherTextException("unwrap data must be a multiple of 8 bytes");
        }
        int i14 = 1;
        this.engine.init(!this.wrapCipherMode, this.param);
        byte[] bArr3 = this.f98697iv;
        byte[] bArr4 = new byte[i12 - bArr3.length];
        byte[] bArr5 = new byte[bArr3.length];
        byte[] bArr6 = new byte[bArr3.length + 8];
        int i15 = i13 - 1;
        if (i15 == 1) {
            this.engine.processBlock(bArr, i11, bArr6, 0);
            System.arraycopy(bArr6, 0, bArr5, 0, this.f98697iv.length);
            System.arraycopy(bArr6, this.f98697iv.length, bArr4, 0, 8);
        } else {
            System.arraycopy(bArr, i11, bArr5, 0, bArr3.length);
            byte[] bArr7 = this.f98697iv;
            System.arraycopy(bArr, bArr7.length + i11, bArr4, 0, i12 - bArr7.length);
            for (int i16 = 5; i16 >= 0; i16--) {
                int i17 = i15;
                while (i17 >= i14) {
                    System.arraycopy(bArr5, 0, bArr6, 0, this.f98697iv.length);
                    int i18 = (i17 - 1) * 8;
                    System.arraycopy(bArr4, i18, bArr6, this.f98697iv.length, 8);
                    int i19 = (i15 * i16) + i17;
                    int i21 = i14;
                    while (i19 != 0) {
                        int i22 = i14;
                        int length = this.f98697iv.length - i21;
                        bArr6[length] = (byte) (bArr6[length] ^ ((byte) i19));
                        i19 >>>= 8;
                        i21++;
                        i14 = i22;
                    }
                    this.engine.processBlock(bArr6, 0, bArr6, 0);
                    System.arraycopy(bArr6, 0, bArr5, 0, 8);
                    System.arraycopy(bArr6, 8, bArr4, i18, 8);
                    i17--;
                    i14 = i14;
                }
            }
        }
        if (i15 != i14) {
            if (!Arrays.constantTimeAreEqual(bArr5, this.f98697iv)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        } else if (!Arrays.constantTimeAreEqual(bArr5, this.f98697iv)) {
            System.arraycopy(bArr, i11, bArr5, 0, this.f98697iv.length);
            byte[] bArr8 = this.f98697iv;
            System.arraycopy(bArr, i11 + bArr8.length, bArr4, 0, i12 - bArr8.length);
            int i23 = 5;
            while (true) {
                bArr2 = this.f98697iv;
                if (i23 < 0) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr6, 0, bArr2.length);
                System.arraycopy(bArr4, 0, bArr6, this.f98697iv.length, 8);
                int i24 = (i15 * i23) + 1;
                int i25 = 1;
                while (i24 != 0) {
                    int length2 = this.f98697iv.length - i25;
                    bArr6[length2] = (byte) (((byte) i24) ^ bArr6[length2]);
                    i24 >>>= 8;
                    i25++;
                }
                this.engine.processBlock(bArr6, 0, bArr6, 0);
                System.arraycopy(bArr6, 0, bArr5, 0, 8);
                System.arraycopy(bArr6, 8, bArr4, 0, 8);
                i23--;
            }
            if (!Arrays.constantTimeAreEqual(bArr5, bArr2)) {
                throw new InvalidCipherTextException("checksum failed");
            }
        }
        return bArr4;
    }

    @Override // org.bouncycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (!this.forWrapping) {
            throw new IllegalStateException("not set for wrapping");
        }
        if (i12 < 8) {
            throw new DataLengthException("wrap data must be at least 8 bytes");
        }
        int i13 = i12 / 8;
        if (i13 * 8 != i12) {
            throw new DataLengthException("wrap data must be a multiple of 8 bytes");
        }
        this.engine.init(this.wrapCipherMode, this.param);
        byte[] bArr2 = this.f98697iv;
        byte[] bArr3 = new byte[bArr2.length + i12];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i11, bArr3, this.f98697iv.length, i12);
        if (i13 == 1) {
            this.engine.processBlock(bArr3, 0, bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[this.f98697iv.length + 8];
        for (int i14 = 0; i14 != 6; i14++) {
            for (int i15 = 1; i15 <= i13; i15++) {
                System.arraycopy(bArr3, 0, bArr4, 0, this.f98697iv.length);
                int i16 = i15 * 8;
                System.arraycopy(bArr3, i16, bArr4, this.f98697iv.length, 8);
                this.engine.processBlock(bArr4, 0, bArr4, 0);
                int i17 = (i13 * i14) + i15;
                int i18 = 1;
                while (i17 != 0) {
                    int length = this.f98697iv.length - i18;
                    bArr4[length] = (byte) (((byte) i17) ^ bArr4[length]);
                    i17 >>>= 8;
                    i18++;
                }
                System.arraycopy(bArr4, 0, bArr3, 0, 8);
                System.arraycopy(bArr4, 8, bArr3, i16, 8);
            }
        }
        return bArr3;
    }

    public RFC3394WrapEngine(BlockCipher blockCipher, boolean z11) {
        this.f98697iv = new byte[8];
        this.param = null;
        this.forWrapping = true;
        this.engine = blockCipher;
        this.wrapCipherMode = !z11;
    }
}
