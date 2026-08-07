package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Longs;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class AsconEngine implements AEADCipher {
    private final int ASCON_AEAD_RATE;
    private final long ASCON_IV;
    private final int CRYPTO_ABYTES;
    private final int CRYPTO_KEYBYTES;
    private long K0;
    private long K1;
    private long K2;
    private long N0;
    private long N1;
    private final String algorithmName;
    private final AsconParameters asconParameters;
    private byte[] initialAssociatedText;
    private final byte[] m_buf;
    private final int m_bufferSizeDecrypt;
    private byte[] mac;

    /* JADX INFO: renamed from: nr, reason: collision with root package name */
    private final int f98653nr;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private long f98654x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f98655x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f98656x2;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private long f98657x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private long f98658x4;
    private State m_state = State.Uninitialized;
    private int m_bufPos = 0;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.AsconEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State = iArr;
            try {
                iArr[State.DecInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncInit.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecAad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncAad.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncFinal.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecData.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.EncData.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[State.DecFinal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[AsconParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters = iArr2;
            try {
                iArr2[AsconParameters.ascon80pq.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128a.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[AsconParameters.ascon128.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public enum AsconParameters {
        ascon80pq,
        ascon128a,
        ascon128
    }

    private enum State {
        Uninitialized,
        EncInit,
        EncAad,
        EncData,
        EncFinal,
        DecInit,
        DecAad,
        DecData,
        DecFinal
    }

    public AsconEngine(AsconParameters asconParameters) {
        String str;
        this.asconParameters = asconParameters;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[asconParameters.ordinal()];
        if (i11 == 1) {
            this.CRYPTO_KEYBYTES = 20;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 8;
            this.ASCON_IV = -6899501409222262784L;
            str = "Ascon-80pq AEAD";
        } else if (i11 == 2) {
            this.CRYPTO_KEYBYTES = 16;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 16;
            this.ASCON_IV = -9187330011336540160L;
            str = "Ascon-128a AEAD";
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException("invalid parameter setting for ASCON AEAD");
            }
            this.CRYPTO_KEYBYTES = 16;
            this.CRYPTO_ABYTES = 16;
            this.ASCON_AEAD_RATE = 8;
            this.ASCON_IV = -9205344418435956736L;
            str = "Ascon-128 AEAD";
        }
        this.algorithmName = str;
        int i12 = this.ASCON_AEAD_RATE;
        this.f98653nr = i12 == 8 ? 6 : 8;
        int i13 = i12 + this.CRYPTO_ABYTES;
        this.m_bufferSizeDecrypt = i13;
        this.m_buf = new byte[i13];
    }

    private void P(int i11) {
        if (i11 >= 8) {
            if (i11 == 12) {
                ROUND(240L);
                ROUND(225L);
                ROUND(210L);
                ROUND(195L);
            }
            ROUND(180L);
            ROUND(165L);
        }
        ROUND(150L);
        ROUND(135L);
        ROUND(120L);
        ROUND(105L);
        ROUND(90L);
        ROUND(75L);
    }

    private long PAD(int i11) {
        return 128 << (56 - (i11 << 3));
    }

    private void ROUND(long j11) {
        long j12 = this.f98654x0;
        long j13 = this.f98655x1;
        long j14 = this.f98656x2;
        long j15 = this.f98657x3;
        long j16 = this.f98658x4;
        long j17 = ((((j12 ^ j13) ^ j14) ^ j15) ^ j11) ^ ((((j12 ^ j14) ^ j16) ^ j11) & j13);
        long j18 = ((((j12 ^ j14) ^ j15) ^ j16) ^ j11) ^ (((j13 ^ j14) ^ j11) & (j13 ^ j15));
        long j19 = (((j13 ^ j14) ^ j16) ^ j11) ^ (j15 & j16);
        long j21 = ((j14 ^ (j12 ^ j13)) ^ j11) ^ ((~j12) & (j15 ^ j16));
        long j22 = ((j12 ^ j16) & j13) ^ ((j13 ^ j15) ^ j16);
        this.f98654x0 = Longs.rotateRight(j17, 28) ^ (Longs.rotateRight(j17, 19) ^ j17);
        this.f98655x1 = (Longs.rotateRight(j18, 39) ^ j18) ^ Longs.rotateRight(j18, 61);
        this.f98656x2 = ~(Longs.rotateRight(j19, 6) ^ (Longs.rotateRight(j19, 1) ^ j19));
        this.f98657x3 = (Longs.rotateRight(j21, 10) ^ j21) ^ Longs.rotateRight(j21, 17);
        this.f98658x4 = Longs.rotateRight(j22, 41) ^ (Longs.rotateRight(j22, 7) ^ j22);
    }

    private void ascon_aeadinit() {
        long j11 = this.ASCON_IV;
        this.f98654x0 = j11;
        if (this.CRYPTO_KEYBYTES == 20) {
            this.f98654x0 = j11 ^ this.K0;
        }
        this.f98655x1 = this.K1;
        this.f98656x2 = this.K2;
        this.f98657x3 = this.N0;
        this.f98658x4 = this.N1;
        P(12);
        if (this.CRYPTO_KEYBYTES == 20) {
            this.f98656x2 ^= this.K0;
        }
        this.f98657x3 ^= this.K1;
        this.f98658x4 ^= this.K2;
    }

    private void checkAAD() {
        State state;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i11 == 1) {
            state = State.DecAad;
        } else {
            if (i11 != 2) {
                if (i11 == 3 || i11 == 4) {
                    return;
                }
                if (i11 != 5) {
                    throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
                }
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            }
            state = State.EncAad;
        }
        this.m_state = state;
    }

    private boolean checkData() {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 3:
                finishAAD(State.DecData);
                return false;
            case 2:
            case 4:
                finishAAD(State.EncData);
                return true;
            case 5:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 6:
                return false;
            case 7:
                return true;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
    }

    private void finishAAD(State state) {
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i11 == 3 || i11 == 4) {
            byte[] bArr = this.m_buf;
            int i12 = this.m_bufPos;
            bArr[i12] = -128;
            if (i12 >= 8) {
                this.f98654x0 ^= Pack.bigEndianToLong(bArr, 0);
                this.f98655x1 = (((-1) << (56 - ((this.m_bufPos - 8) << 3))) & Pack.bigEndianToLong(this.m_buf, 8)) ^ this.f98655x1;
            } else {
                this.f98654x0 = (((-1) << (56 - (this.m_bufPos << 3))) & Pack.bigEndianToLong(bArr, 0)) ^ this.f98654x0;
            }
            P(this.f98653nr);
        }
        this.f98658x4 ^= 1;
        this.m_bufPos = 0;
        this.m_state = state;
    }

    private void finishData(State state) {
        long j11;
        long j12;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$AsconParameters[this.asconParameters.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                this.f98656x2 ^= this.K1;
                j11 = this.f98657x3;
                j12 = this.K2;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                this.f98655x1 ^= this.K1;
                this.f98656x2 ^= this.K2;
            }
            P(12);
            this.f98657x3 ^= this.K1;
            this.f98658x4 ^= this.K2;
            this.m_state = state;
        }
        long j13 = this.f98655x1;
        long j14 = this.K0 << 32;
        long j15 = this.K1;
        this.f98655x1 = j13 ^ (j14 | (j15 >> 32));
        long j16 = this.f98656x2;
        long j17 = j15 << 32;
        long j18 = this.K2;
        this.f98656x2 = j16 ^ (j17 | (j18 >> 32));
        j11 = this.f98657x3;
        j12 = j18 << 32;
        this.f98657x3 = j11 ^ j12;
        P(12);
        this.f98657x3 ^= this.K1;
        this.f98658x4 ^= this.K2;
        this.m_state = state;
    }

    private void processBufferAAD(byte[] bArr, int i11) {
        this.f98654x0 ^= Pack.bigEndianToLong(bArr, i11);
        if (this.ASCON_AEAD_RATE == 16) {
            this.f98655x1 = Pack.bigEndianToLong(bArr, i11 + 8) ^ this.f98655x1;
        }
        P(this.f98653nr);
    }

    private void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.ASCON_AEAD_RATE + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        long jBigEndianToLong = Pack.bigEndianToLong(bArr, i11);
        Pack.longToBigEndian(this.f98654x0 ^ jBigEndianToLong, bArr2, i12);
        this.f98654x0 = jBigEndianToLong;
        if (this.ASCON_AEAD_RATE == 16) {
            long jBigEndianToLong2 = Pack.bigEndianToLong(bArr, i11 + 8);
            Pack.longToBigEndian(this.f98655x1 ^ jBigEndianToLong2, bArr2, i12 + 8);
            this.f98655x1 = jBigEndianToLong2;
        }
        P(this.f98653nr);
    }

    private void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.ASCON_AEAD_RATE + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        long jBigEndianToLong = this.f98654x0 ^ Pack.bigEndianToLong(bArr, i11);
        this.f98654x0 = jBigEndianToLong;
        Pack.longToBigEndian(jBigEndianToLong, bArr2, i12);
        if (this.ASCON_AEAD_RATE == 16) {
            long jBigEndianToLong2 = Pack.bigEndianToLong(bArr, i11 + 8) ^ this.f98655x1;
            this.f98655x1 = jBigEndianToLong2;
            Pack.longToBigEndian(jBigEndianToLong2, bArr2, i12 + 8);
        }
        P(this.f98653nr);
    }

    private void processFinalDecrypt(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i12 >= 8) {
            long jBigEndianToLong = Pack.bigEndianToLong(bArr, i11);
            long j11 = this.f98654x0 ^ jBigEndianToLong;
            this.f98654x0 = j11;
            Pack.longToBigEndian(j11, bArr2, i13);
            this.f98654x0 = jBigEndianToLong;
            int i14 = i11 + 8;
            int i15 = i13 + 8;
            int i16 = i12 - 8;
            this.f98655x1 ^= PAD(i16);
            if (i16 != 0) {
                long jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i14, i16);
                long j12 = this.f98655x1 ^ jLittleEndianToLong_High;
                this.f98655x1 = j12;
                Pack.longToLittleEndian_High(j12, bArr2, i15, i16);
                this.f98655x1 = jLittleEndianToLong_High ^ (this.f98655x1 & ((-1) >>> (i16 << 3)));
            }
        } else {
            this.f98654x0 ^= PAD(i12);
            if (i12 != 0) {
                long jLittleEndianToLong_High2 = Pack.littleEndianToLong_High(bArr, i11, i12);
                long j13 = this.f98654x0 ^ jLittleEndianToLong_High2;
                this.f98654x0 = j13;
                Pack.longToLittleEndian_High(j13, bArr2, i13, i12);
                this.f98654x0 = jLittleEndianToLong_High2 ^ (this.f98654x0 & ((-1) >>> (i12 << 3)));
            }
        }
        finishData(State.DecFinal);
    }

    private void processFinalEncrypt(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        long jLittleEndianToLong_High;
        if (i12 >= 8) {
            long jBigEndianToLong = this.f98654x0 ^ Pack.bigEndianToLong(bArr, i11);
            this.f98654x0 = jBigEndianToLong;
            Pack.longToBigEndian(jBigEndianToLong, bArr2, i13);
            int i14 = i11 + 8;
            i13 += 8;
            i12 -= 8;
            long jPAD = this.f98655x1 ^ PAD(i12);
            this.f98655x1 = jPAD;
            if (i12 != 0) {
                jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i14, i12) ^ jPAD;
                this.f98655x1 = jLittleEndianToLong_High;
                Pack.longToLittleEndian_High(jLittleEndianToLong_High, bArr2, i13, i12);
            }
        } else {
            long jPAD2 = this.f98654x0 ^ PAD(i12);
            this.f98654x0 = jPAD2;
            if (i12 != 0) {
                jLittleEndianToLong_High = Pack.littleEndianToLong_High(bArr, i11, i12) ^ jPAD2;
                this.f98654x0 = jLittleEndianToLong_High;
                Pack.longToLittleEndian_High(jLittleEndianToLong_High, bArr2, i13, i12);
            }
        }
        finishData(State.EncFinal);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException {
        if (checkData()) {
            int i12 = this.m_bufPos;
            int i13 = this.CRYPTO_ABYTES + i12;
            if (i11 + i13 > bArr.length) {
                throw new OutputLengthException("output buffer too short");
            }
            processFinalEncrypt(this.m_buf, 0, i12, bArr, i11);
            byte[] bArr2 = new byte[this.CRYPTO_ABYTES];
            this.mac = bArr2;
            Pack.longToBigEndian(this.f98657x3, bArr2, 0);
            Pack.longToBigEndian(this.f98658x4, this.mac, 8);
            System.arraycopy(this.mac, 0, bArr, this.m_bufPos + i11, this.CRYPTO_ABYTES);
            reset(false);
            return i13;
        }
        int i14 = this.m_bufPos;
        int i15 = this.CRYPTO_ABYTES;
        if (i14 < i15) {
            throw new InvalidCipherTextException("data too short");
        }
        int i16 = i14 - i15;
        this.m_bufPos = i16;
        if (i11 + i16 > bArr.length) {
            throw new OutputLengthException("output buffer too short");
        }
        processFinalDecrypt(this.m_buf, 0, i16, bArr, i11);
        this.f98657x3 ^= Pack.bigEndianToLong(this.m_buf, this.m_bufPos);
        long jBigEndianToLong = this.f98658x4 ^ Pack.bigEndianToLong(this.m_buf, this.m_bufPos + 8);
        this.f98658x4 = jBigEndianToLong;
        if ((jBigEndianToLong | this.f98657x3) == 0) {
            reset(true);
            return i16;
        }
        throw new InvalidCipherTextException("mac check in " + getAlgorithmName() + " failed");
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public String getAlgorithmVersion() {
        return "v1.2";
    }

    public int getIVBytesSize() {
        return this.CRYPTO_ABYTES;
    }

    public int getKeyBytesSize() {
        return this.CRYPTO_KEYBYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int iMax = Math.max(0, i11);
        int i12 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()];
        if (i12 == 1 || i12 == 3) {
            return Math.max(0, iMax - this.CRYPTO_ABYTES);
        }
        if (i12 != 5) {
            if (i12 != 6) {
                if (i12 != 7) {
                    if (i12 != 8) {
                        return iMax + this.CRYPTO_ABYTES;
                    }
                }
            }
            return Math.max(0, (iMax + this.m_bufPos) - this.CRYPTO_ABYTES);
        }
        return iMax + this.m_bufPos + this.CRYPTO_ABYTES;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r1 != 8) goto L18;
     */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getUpdateOutputSize(int r4) {
        /*
            r3 = this;
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            int[] r1 = org.bouncycastle.crypto.engines.AsconEngine.AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State
            org.bouncycastle.crypto.engines.AsconEngine$State r2 = r3.m_state
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L26
            r2 = 3
            if (r1 == r2) goto L26
            r2 = 5
            if (r1 == r2) goto L2e
            r2 = 6
            if (r1 == r2) goto L23
            r2 = 7
            if (r1 == r2) goto L2e
            r2 = 8
            if (r1 == r2) goto L23
            goto L31
        L23:
            int r1 = r3.m_bufPos
            int r4 = r4 + r1
        L26:
            int r1 = r3.CRYPTO_ABYTES
            int r4 = r4 - r1
            int r4 = java.lang.Math.max(r0, r4)
            goto L31
        L2e:
            int r0 = r3.m_bufPos
            int r4 = r4 + r0
        L31:
            int r0 = r3.ASCON_AEAD_RATE
            int r0 = r4 % r0
            int r4 = r4 - r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.AsconEngine.getUpdateOutputSize(int):int");
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        KeyParameter key;
        byte[] iv2;
        long jBigEndianToLong;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.CRYPTO_ABYTES * 8) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to Ascon");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            key = (KeyParameter) parametersWithIV.getParameters();
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException("Ascon Init parameters must include a key");
        }
        if (iv2 == null || iv2.length != this.CRYPTO_ABYTES) {
            throw new IllegalArgumentException(this.asconParameters + " requires exactly " + this.CRYPTO_ABYTES + " bytes of IV");
        }
        byte[] key2 = key.getKey();
        if (key2.length != this.CRYPTO_KEYBYTES) {
            throw new IllegalArgumentException(this.asconParameters + " key must be " + this.CRYPTO_KEYBYTES + " bytes long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        this.N0 = Pack.bigEndianToLong(iv2, 0);
        this.N1 = Pack.bigEndianToLong(iv2, 8);
        int i11 = this.CRYPTO_KEYBYTES;
        if (i11 == 16) {
            this.K1 = Pack.bigEndianToLong(key2, 0);
            jBigEndianToLong = Pack.bigEndianToLong(key2, 8);
        } else {
            if (i11 != 20) {
                throw new IllegalStateException();
            }
            this.K0 = Pack.bigEndianToInt(key2, 0);
            this.K1 = Pack.bigEndianToLong(key2, 4);
            jBigEndianToLong = Pack.bigEndianToLong(key2, 12);
        }
        this.K2 = jBigEndianToLong;
        this.m_state = z11 ? State.EncInit : State.DecInit;
        reset(true);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) {
        checkAAD();
        byte[] bArr = this.m_buf;
        int i11 = this.m_bufPos;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this.m_bufPos = i12;
        if (i12 == this.ASCON_AEAD_RATE) {
            processBufferAAD(bArr, 0);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 <= 0) {
            return;
        }
        checkAAD();
        int i13 = this.m_bufPos;
        if (i13 > 0) {
            int i14 = this.ASCON_AEAD_RATE - i13;
            if (i12 < i14) {
                System.arraycopy(bArr, i11, this.m_buf, i13, i12);
                this.m_bufPos += i12;
                return;
            } else {
                System.arraycopy(bArr, i11, this.m_buf, i13, i14);
                i11 += i14;
                i12 -= i14;
                processBufferAAD(this.m_buf, 0);
            }
        }
        while (i12 >= this.ASCON_AEAD_RATE) {
            processBufferAAD(bArr, i11);
            int i15 = this.ASCON_AEAD_RATE;
            i11 += i15;
            i12 -= i15;
        }
        System.arraycopy(bArr, i11, this.m_buf, 0, i12);
        this.m_bufPos = i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        return processBytes(new byte[]{b11}, 0, 1, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14;
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (checkData()) {
            int i15 = this.m_bufPos;
            if (i15 > 0) {
                int i16 = this.ASCON_AEAD_RATE - i15;
                if (i12 < i16) {
                    System.arraycopy(bArr, i11, this.m_buf, i15, i12);
                    this.m_bufPos += i12;
                    return 0;
                }
                System.arraycopy(bArr, i11, this.m_buf, i15, i16);
                i11 += i16;
                i12 -= i16;
                processBufferEncrypt(this.m_buf, 0, bArr2, i13);
                i14 = this.ASCON_AEAD_RATE;
            } else {
                i14 = 0;
            }
            while (i12 >= this.ASCON_AEAD_RATE) {
                processBufferEncrypt(bArr, i11, bArr2, i13 + i14);
                int i17 = this.ASCON_AEAD_RATE;
                i11 += i17;
                i12 -= i17;
                i14 += i17;
            }
            System.arraycopy(bArr, i11, this.m_buf, 0, i12);
            this.m_bufPos = i12;
            return i14;
        }
        int i18 = this.m_bufferSizeDecrypt;
        int i19 = this.m_bufPos;
        int i21 = i18 - i19;
        if (i12 < i21) {
            System.arraycopy(bArr, i11, this.m_buf, i19, i12);
            this.m_bufPos += i12;
            return 0;
        }
        int i22 = 0;
        do {
            int i23 = this.m_bufPos;
            int i24 = this.ASCON_AEAD_RATE;
            if (i23 < i24) {
                int i25 = i24 - i23;
                System.arraycopy(bArr, i11, this.m_buf, i23, i25);
                i11 += i25;
                i12 -= i25;
                processBufferDecrypt(this.m_buf, 0, bArr2, i13 + i22);
                i14 = i22 + this.ASCON_AEAD_RATE;
                while (i12 >= this.m_bufferSizeDecrypt) {
                    processBufferDecrypt(bArr, i11, bArr2, i13 + i14);
                    int i26 = this.ASCON_AEAD_RATE;
                    i11 += i26;
                    i12 -= i26;
                    i14 += i26;
                }
                System.arraycopy(bArr, i11, this.m_buf, 0, i12);
                this.m_bufPos = i12;
                return i14;
            }
            processBufferDecrypt(this.m_buf, 0, bArr2, i13 + i22);
            int i27 = this.m_bufPos;
            int i28 = this.ASCON_AEAD_RATE;
            int i29 = i27 - i28;
            this.m_bufPos = i29;
            byte[] bArr3 = this.m_buf;
            System.arraycopy(bArr3, i28, bArr3, 0, i29);
            int i31 = this.ASCON_AEAD_RATE;
            i22 += i31;
            i21 += i31;
        } while (i12 >= i21);
        System.arraycopy(bArr, i11, this.m_buf, this.m_bufPos, i12);
        this.m_bufPos += i12;
        return i22;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z11) {
        if (z11) {
            this.mac = null;
        }
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$AsconEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                break;
            case 3:
            case 6:
            case 8:
                this.m_state = State.DecInit;
                break;
            case 4:
            case 5:
            case 7:
                this.m_state = State.EncFinal;
                return;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
        ascon_aeadinit();
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }
}
