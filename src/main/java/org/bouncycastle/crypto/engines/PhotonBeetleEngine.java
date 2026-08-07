package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes9.dex */
public class PhotonBeetleEngine implements AEADCipher {
    private byte[] A;
    private byte[] K;
    private final int LAST_THREE_BITS_OFFSET;
    private byte[] N;
    private final int RATE_INBYTES;
    private final int RATE_INBYTES_HALF;
    private final int STATE_INBYTES;
    private byte[] T;
    private boolean encrypted;
    private boolean forEncryption;
    private boolean initialised;
    private boolean input_empty;
    private byte[] state;
    private byte[][] state_2d;
    private final ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final ByteArrayOutputStream message = new ByteArrayOutputStream();
    private final int CRYPTO_KEYBYTES = 16;
    private final int CRYPTO_NPUBBYTES = 16;
    private final int TAG_INBYTES = 16;
    private final int ROUND = 12;
    private final int D = 8;
    private final int Dq = 3;
    private final int Dr = 7;
    private final int DSquare = 64;
    private final int S = 4;
    private final int S_1 = 3;
    private final byte[][] RC = {new byte[]{1, 3, 7, 14, 13, 11, 6, 12, 9, 2, 5, 10}, new byte[]{0, 2, 6, 15, 12, 10, 7, 13, 8, 3, 4, 11}, new byte[]{2, 0, 4, 13, 14, 8, 5, 15, 10, 1, 6, 9}, new byte[]{6, 4, 0, 9, 10, 12, 1, 11, 14, 5, 2, 13}, new byte[]{14, 12, 8, 1, 2, 4, 9, 3, 6, 13, 10, 5}, new byte[]{15, 13, 9, 0, 3, 5, 8, 2, 7, 12, 11, 4}, new byte[]{13, 15, 11, 2, 1, 7, 10, 0, 5, 14, 9, 6}, new byte[]{9, 11, 15, 6, 5, 3, 14, 4, 1, 10, 13, 2}};
    private final byte[][] MixColMatrix = {new byte[]{2, 4, 2, 11, 2, 8, 5, 6}, new byte[]{12, 9, 8, 13, 7, 7, 5, 2}, new byte[]{4, 4, 13, 13, 9, 4, 13, 9}, new byte[]{1, 6, 5, 1, 12, 13, 15, 14}, new byte[]{15, 12, 9, 13, 14, 5, 14, 13}, new byte[]{9, 14, 5, 15, 4, 12, 9, 6}, new byte[]{12, 2, 2, 10, 3, 1, 1, 14}, new byte[]{15, 1, 13, 10, 5, 10, 2, 3}};
    private final byte[] sbox = {12, 5, 6, 11, 9, 0, 10, 13, 3, 14, 15, 8, 4, 7, 1, 2};

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.PhotonBeetleEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters;

        static {
            int[] iArr = new int[PhotonBeetleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters = iArr;
            try {
                iArr[PhotonBeetleParameters.pb32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[PhotonBeetleParameters.pb128.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum PhotonBeetleParameters {
        pb32,
        pb128
    }

    public PhotonBeetleEngine(PhotonBeetleParameters photonBeetleParameters) {
        int i11;
        int i12;
        int i13 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$PhotonBeetleEngine$PhotonBeetleParameters[photonBeetleParameters.ordinal()];
        if (i13 != 1) {
            i11 = i13 != 2 ? 0 : 128;
            i12 = i11;
        } else {
            i11 = 32;
            i12 = 224;
        }
        int i14 = i11 + 7;
        this.RATE_INBYTES = i14 >>> 3;
        this.RATE_INBYTES_HALF = i14 >>> 4;
        int i15 = i11 + i12;
        int i16 = (i15 + 7) >>> 3;
        this.STATE_INBYTES = i16;
        this.LAST_THREE_BITS_OFFSET = (i15 - ((i16 - 1) << 3)) - 3;
        this.initialised = false;
    }

    private void PHOTON_Permutation() {
        for (int i11 = 0; i11 < 64; i11++) {
            this.state_2d[i11 >>> 3][i11 & 7] = (byte) (((this.state[i11 >> 1] & 255) >>> ((i11 & 1) * 4)) & 15);
        }
        for (int i12 = 0; i12 < 12; i12++) {
            for (int i13 = 0; i13 < 8; i13++) {
                byte[] bArr = this.state_2d[i13];
                bArr[0] = (byte) (bArr[0] ^ this.RC[i13][i12]);
            }
            for (int i14 = 0; i14 < 8; i14++) {
                for (int i15 = 0; i15 < 8; i15++) {
                    byte[] bArr2 = this.state_2d[i14];
                    bArr2[i15] = this.sbox[bArr2[i15]];
                }
            }
            for (int i16 = 1; i16 < 8; i16++) {
                System.arraycopy(this.state_2d[i16], 0, this.state, 0, 8);
                int i17 = 8 - i16;
                System.arraycopy(this.state, i16, this.state_2d[i16], 0, i17);
                System.arraycopy(this.state, 0, this.state_2d[i16], i17, i16);
            }
            for (int i18 = 0; i18 < 8; i18++) {
                for (int i19 = 0; i19 < 8; i19++) {
                    byte b11 = 0;
                    for (int i21 = 0; i21 < 8; i21++) {
                        int i22 = this.MixColMatrix[i19][i21];
                        byte b12 = this.state_2d[i21][i18];
                        int i23 = 0;
                        for (int i24 = 0; i24 < 4; i24++) {
                            if (((b12 >>> i24) & 1) != 0) {
                                i23 ^= i22;
                            }
                            int i25 = (i22 >>> 3) & 1;
                            i22 <<= 1;
                            if (i25 != 0) {
                                i22 ^= 3;
                            }
                        }
                        b11 = (byte) (b11 ^ (i23 & 15));
                    }
                    this.state[i19] = b11;
                }
                for (int i26 = 0; i26 < 8; i26++) {
                    this.state_2d[i26][i18] = this.state[i26];
                }
            }
        }
        for (int i27 = 0; i27 < 64; i27 += 2) {
            byte[] bArr3 = this.state_2d[i27 >>> 3];
            this.state[i27 >>> 1] = (byte) (((bArr3[(i27 + 1) & 7] & 15) << 4) | (bArr3[i27 & 7] & 15));
        }
    }

    private void XOR(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            byte[] bArr2 = this.state;
            bArr2[i13] = (byte) (bArr[i11] ^ bArr2[i13]);
            i13++;
            i11++;
        }
    }

    private void rhoohr(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        int i14;
        int i15 = 0;
        byte[] bArr3 = this.state_2d[0];
        int iMin = Math.min(i13, this.RATE_INBYTES_HALF);
        int i16 = 0;
        while (true) {
            i14 = this.RATE_INBYTES_HALF;
            if (i16 >= i14 - 1) {
                break;
            }
            byte[] bArr4 = this.state;
            int i17 = i16 + 1;
            bArr3[i16] = (byte) (((bArr4[i17] & 1) << 7) | ((bArr4[i16] & 255) >>> 1));
            i16 = i17;
        }
        byte[] bArr5 = this.state;
        bArr3[i14 - 1] = (byte) (((bArr5[i16] & 255) >>> 1) | ((bArr5[0] & 1) << 7));
        while (i15 < iMin) {
            bArr[i15 + i11] = (byte) (bArr2[i15 + i12] ^ this.state[this.RATE_INBYTES_HALF + i15]);
            i15++;
        }
        while (i15 < i13) {
            bArr[i15 + i11] = (byte) (bArr2[i15 + i12] ^ bArr3[i15 - this.RATE_INBYTES_HALF]);
            i15++;
        }
        if (this.forEncryption) {
            XOR(bArr2, i12, i13);
        } else {
            XOR(bArr, i12, i13);
        }
    }

    private byte select(boolean z11, boolean z12, byte b11, byte b12) {
        if (z11 && z12) {
            return (byte) 1;
        }
        if (z11) {
            return (byte) 2;
        }
        return z12 ? b11 : b12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) {
        PhotonBeetleEngine photonBeetleEngine;
        byte[] bArr2;
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        int size = this.message.size();
        boolean z11 = this.forEncryption;
        int i12 = size - (z11 ? 0 : 16);
        if ((z11 && i12 + 16 + i11 > bArr.length) || (!z11 && i12 + i11 > bArr.length)) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] byteArray = this.message.toByteArray();
        byte[] byteArray2 = this.aadData.toByteArray();
        this.A = byteArray2;
        int length = byteArray2.length;
        if (length != 0 || i12 != 0) {
            this.input_empty = false;
        }
        byte bSelect = select(i12 != 0, length % this.RATE_INBYTES == 0, (byte) 3, (byte) 4);
        byte bSelect2 = select(length != 0, i12 % this.RATE_INBYTES == 0, (byte) 5, (byte) 6);
        if (length != 0) {
            int i13 = this.RATE_INBYTES;
            int i14 = ((length + i13) - 1) / i13;
            int i15 = 0;
            while (true) {
                int i16 = i14 - 1;
                PHOTON_Permutation();
                if (i15 >= i16) {
                    break;
                }
                byte[] bArr3 = this.A;
                int i17 = this.RATE_INBYTES;
                XOR(bArr3, i15 * i17, i17);
                i15++;
            }
            int i18 = this.RATE_INBYTES;
            int i19 = length - (i15 * i18);
            XOR(this.A, i15 * i18, i19);
            if (i19 < this.RATE_INBYTES) {
                byte[] bArr4 = this.state;
                bArr4[i19] = (byte) (bArr4[i19] ^ 1);
            }
            byte[] bArr5 = this.state;
            int i21 = this.STATE_INBYTES - 1;
            bArr5[i21] = (byte) ((bSelect << this.LAST_THREE_BITS_OFFSET) ^ bArr5[i21]);
        }
        if (i12 != 0) {
            int i22 = this.RATE_INBYTES;
            int i23 = ((i12 + i22) - 1) / i22;
            int i24 = 0;
            while (i24 < i23 - 1) {
                PHOTON_Permutation();
                int i25 = this.RATE_INBYTES;
                rhoohr(bArr, i11 + (i24 * i25), byteArray, i24 * i25, i25);
                i24++;
            }
            photonBeetleEngine = this;
            bArr2 = bArr;
            PHOTON_Permutation();
            int i26 = photonBeetleEngine.RATE_INBYTES;
            int i27 = i12 - (i24 * i26);
            photonBeetleEngine.rhoohr(bArr2, i11 + (i24 * i26), byteArray, i24 * i26, i27);
            if (i27 < photonBeetleEngine.RATE_INBYTES) {
                byte[] bArr6 = photonBeetleEngine.state;
                bArr6[i27] = (byte) (bArr6[i27] ^ 1);
            }
            byte[] bArr7 = photonBeetleEngine.state;
            int i28 = photonBeetleEngine.STATE_INBYTES - 1;
            bArr7[i28] = (byte) (bArr7[i28] ^ (bSelect2 << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
        } else {
            photonBeetleEngine = this;
            bArr2 = bArr;
        }
        int i29 = i11 + i12;
        if (photonBeetleEngine.input_empty) {
            byte[] bArr8 = photonBeetleEngine.state;
            int i31 = photonBeetleEngine.STATE_INBYTES - 1;
            bArr8[i31] = (byte) (bArr8[i31] ^ (1 << photonBeetleEngine.LAST_THREE_BITS_OFFSET));
        }
        PHOTON_Permutation();
        byte[] bArr9 = new byte[16];
        photonBeetleEngine.T = bArr9;
        System.arraycopy(photonBeetleEngine.state, 0, bArr9, 0, 16);
        if (photonBeetleEngine.forEncryption) {
            System.arraycopy(photonBeetleEngine.T, 0, bArr2, i29, 16);
            i12 += 16;
        } else {
            for (int i32 = 0; i32 < 16; i32++) {
                if (photonBeetleEngine.T[i32] != byteArray[i12 + i32]) {
                    throw new IllegalArgumentException("Mac does not match");
                }
            }
        }
        reset(false);
        return i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return "Photon-Beetle AEAD";
    }

    public int getBlockSize() {
        return this.RATE_INBYTES;
    }

    public int getIVBytesSize() {
        return 16;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.T;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        return i11 + 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        return i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Photon-Beetle AEAD init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        this.N = iv2;
        if (iv2 == null || iv2.length != 16) {
            throw new IllegalArgumentException("Photon-Beetle AEAD requires exactly 16 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Photon-Beetle AEAD init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        this.K = key;
        if (key.length != 16) {
            throw new IllegalArgumentException("Photon-Beetle AEAD key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        this.state = new byte[this.STATE_INBYTES];
        this.state_2d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 8, 8);
        this.T = new byte[16];
        this.initialised = true;
        reset(false);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) {
        this.aadData.write(b11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.aadData.write(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        return processBytes(new byte[]{b11}, 0, 1, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.message.write(bArr, i11, i12);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        reset(true);
    }

    private void reset(boolean z11) {
        if (z11) {
            this.T = null;
        }
        this.input_empty = true;
        this.aadData.reset();
        this.message.reset();
        byte[] bArr = this.K;
        System.arraycopy(bArr, 0, this.state, 0, bArr.length);
        byte[] bArr2 = this.N;
        System.arraycopy(bArr2, 0, this.state, this.K.length, bArr2.length);
        this.encrypted = false;
    }
}
