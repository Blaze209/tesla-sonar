package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class SparkleEngine implements AEADCipher {
    private static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    private final int CAP_MASK;
    private final int KEY_BYTES;
    private final int KEY_WORDS;
    private final int RATE_BYTES;
    private final int RATE_WORDS;
    private final int SCHWAEMM_KEY_LEN;
    private final int SCHWAEMM_NONCE_LEN;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private final int TAG_BYTES;
    private final int TAG_WORDS;
    private final int _A0;
    private final int _A1;
    private final int _M2;
    private final int _M3;
    private String algorithmName;
    private boolean encrypted;
    private byte[] initialAssociatedText;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f98700k;
    private final byte[] m_buf;
    private final int m_bufferSizeDecrypt;
    private final int[] npub;
    private final int[] state;
    private byte[] tag;
    private State m_state = State.Uninitialized;
    private int m_bufPos = 0;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.SparkleEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters;
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State = iArr;
            try {
                iArr[State.DecInit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecAad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecData.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.DecFinal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncData.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncFinal.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncInit.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[State.EncAad.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[SparkleParameters.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters = iArr2;
            try {
                iArr2[SparkleParameters.SCHWAEMM128_128.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_128.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM192_192.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[SparkleParameters.SCHWAEMM256_256.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
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

    /* JADX WARN: Code duplicated, block: B:19:0x0095  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    public SparkleEngine(SparkleParameters sparkleParameters) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$SparkleParameters[sparkleParameters.ordinal()];
        int i16 = 256;
        int i17 = 128;
        if (i15 != 1) {
            i11 = KyberEngine.KyberPolyBytes;
            if (i15 != 2) {
                if (i15 == 3) {
                    i16 = 192;
                    this.SCHWAEMM_KEY_LEN = 192;
                    this.SCHWAEMM_NONCE_LEN = 192;
                    this.SPARKLE_STEPS_SLIM = 7;
                    this.SPARKLE_STEPS_BIG = 11;
                    this.algorithmName = "SCHWAEMM192-192";
                } else {
                    if (i15 != 4) {
                        throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
                    }
                    this.SCHWAEMM_KEY_LEN = 256;
                    this.SCHWAEMM_NONCE_LEN = 256;
                    this.SPARKLE_STEPS_SLIM = 8;
                    this.SPARKLE_STEPS_BIG = 12;
                    this.algorithmName = "SCHWAEMM256-256";
                    i11 = 512;
                }
                i17 = i16;
            } else {
                this.SCHWAEMM_KEY_LEN = 128;
                this.SCHWAEMM_NONCE_LEN = 256;
                this.SPARKLE_STEPS_SLIM = 7;
                this.SPARKLE_STEPS_BIG = 11;
                this.algorithmName = "SCHWAEMM256-128";
            }
            int i18 = this.SCHWAEMM_KEY_LEN;
            int i19 = i18 >>> 5;
            this.KEY_WORDS = i19;
            this.KEY_BYTES = i18 >>> 3;
            this.TAG_WORDS = i16 >>> 5;
            int i21 = i16 >>> 3;
            this.TAG_BYTES = i21;
            int i22 = i11 >>> 5;
            this.STATE_WORDS = i22;
            int i23 = this.SCHWAEMM_NONCE_LEN;
            i12 = i23 >>> 5;
            this.RATE_WORDS = i12;
            int i24 = i23 >>> 3;
            this.RATE_BYTES = i24;
            int i25 = i17 >>> 6;
            i13 = i17 >>> 5;
            if (i12 > i13) {
                i14 = i13 - 1;
            } else {
                i14 = -1;
            }
            this.CAP_MASK = i14;
            int i26 = 1 << i25;
            this._A0 = i26 << 24;
            this._A1 = (i26 ^ 1) << 24;
            this._M2 = (i26 ^ 2) << 24;
            this._M3 = (3 ^ i26) << 24;
            this.state = new int[i22];
            this.f98700k = new int[i19];
            this.npub = new int[i12];
            int i27 = i24 + i21;
            this.m_bufferSizeDecrypt = i27;
            this.m_buf = new byte[i27];
        }
        this.SCHWAEMM_KEY_LEN = 128;
        this.SCHWAEMM_NONCE_LEN = 128;
        this.SPARKLE_STEPS_SLIM = 7;
        this.SPARKLE_STEPS_BIG = 10;
        this.algorithmName = "SCHWAEMM128-128";
        i11 = 256;
        i16 = 128;
        int i110 = this.SCHWAEMM_KEY_LEN;
        int i111 = i110 >>> 5;
        this.KEY_WORDS = i111;
        this.KEY_BYTES = i110 >>> 3;
        this.TAG_WORDS = i16 >>> 5;
        int i28 = i16 >>> 3;
        this.TAG_BYTES = i28;
        int i29 = i11 >>> 5;
        this.STATE_WORDS = i29;
        int i210 = this.SCHWAEMM_NONCE_LEN;
        i12 = i210 >>> 5;
        this.RATE_WORDS = i12;
        int i211 = i210 >>> 3;
        this.RATE_BYTES = i211;
        int i212 = i17 >>> 6;
        i13 = i17 >>> 5;
        if (i12 > i13) {
            i14 = i13 - 1;
        } else {
            i14 = -1;
        }
        this.CAP_MASK = i14;
        int i213 = 1 << i212;
        this._A0 = i213 << 24;
        this._A1 = (i213 ^ 1) << 24;
        this._M2 = (i213 ^ 2) << 24;
        this._M3 = (3 ^ i213) << 24;
        this.state = new int[i29];
        this.f98700k = new int[i111];
        this.npub = new int[i12];
        int i214 = i211 + i28;
        this.m_bufferSizeDecrypt = i214;
        this.m_buf = new byte[i214];
    }

    private static int ELL(int i11) {
        return (i11 & 65535) ^ Integers.rotateRight(i11, 16);
    }

    private void checkAAD() {
        State state;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i11 == 1) {
            state = State.DecAad;
        } else {
            if (i11 == 2) {
                return;
            }
            if (i11 == 6) {
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            }
            if (i11 != 7) {
                if (i11 == 8) {
                    return;
                }
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            }
            state = State.EncAad;
        }
        this.m_state = state;
    }

    private boolean checkData() {
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                finishAAD(State.DecData);
                return false;
            case 3:
                return false;
            case 4:
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
            case 5:
                return true;
            case 6:
                throw new IllegalStateException(getAlgorithmName() + " cannot be reused for encryption");
            case 7:
            case 8:
                finishAAD(State.EncData);
                return true;
        }
    }

    private void finishAAD(State state) {
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()];
        if (i11 == 2 || i11 == 8) {
            processFinalAAD();
        }
        this.m_bufPos = 0;
        this.m_state = state;
    }

    private void processBufferAAD(byte[] bArr, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = this.RATE_WORDS;
            if (i12 >= i13 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i14 = (i13 / 2) + i12;
            int[] iArr = this.state;
            int i15 = iArr[i12];
            int i16 = iArr[i14];
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i12 * 4) + i11);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, (i14 * 4) + i11);
            int[] iArr2 = this.state;
            int i17 = this.RATE_WORDS;
            iArr2[i12] = (iLittleEndianToInt ^ i16) ^ iArr2[i17 + i12];
            iArr2[i14] = ((i16 ^ i15) ^ iLittleEndianToInt2) ^ iArr2[i17 + (this.CAP_MASK & i14)];
            i12++;
        }
    }

    private void processBufferDecrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (i12 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i13 = 0;
        while (true) {
            int i14 = this.RATE_WORDS;
            if (i13 >= i14 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i15 = (i14 / 2) + i13;
            int[] iArr = this.state;
            int i16 = iArr[i13];
            int i17 = iArr[i15];
            int i18 = i13 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i11 + i18);
            int i19 = i15 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i11 + i19);
            int[] iArr2 = this.state;
            int i21 = this.RATE_WORDS;
            iArr2[i13] = ((i16 ^ i17) ^ iLittleEndianToInt) ^ iArr2[i21 + i13];
            iArr2[i15] = (i16 ^ iLittleEndianToInt2) ^ iArr2[i21 + (this.CAP_MASK & i15)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i16, bArr2, i12 + i18);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i17, bArr2, i12 + i19);
            i13++;
        }
    }

    private void processBufferEncrypt(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (i12 > bArr2.length - this.RATE_BYTES) {
            throw new OutputLengthException("output buffer too short");
        }
        int i13 = 0;
        while (true) {
            int i14 = this.RATE_WORDS;
            if (i13 >= i14 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i15 = (i14 / 2) + i13;
            int[] iArr = this.state;
            int i16 = iArr[i13];
            int i17 = iArr[i15];
            int i18 = i13 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i11 + i18);
            int i19 = i15 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i11 + i19);
            int[] iArr2 = this.state;
            int i21 = this.RATE_WORDS;
            iArr2[i13] = (i17 ^ iLittleEndianToInt) ^ iArr2[i21 + i13];
            iArr2[i15] = ((i16 ^ i17) ^ iLittleEndianToInt2) ^ iArr2[i21 + (this.CAP_MASK & i15)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i16, bArr2, i12 + i18);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i17, bArr2, i12 + i19);
            i13++;
        }
    }

    private void processFinalAAD() {
        int i11 = this.m_bufPos;
        int i12 = 0;
        if (i11 < this.RATE_BYTES) {
            int[] iArr = this.state;
            int i13 = this.STATE_WORDS - 1;
            iArr[i13] = iArr[i13] ^ this._A0;
            this.m_buf[i11] = -128;
            while (true) {
                int i14 = this.m_bufPos + 1;
                this.m_bufPos = i14;
                if (i14 >= this.RATE_BYTES) {
                    break;
                } else {
                    this.m_buf[i14] = 0;
                }
            }
        } else {
            int[] iArr2 = this.state;
            int i15 = this.STATE_WORDS - 1;
            iArr2[i15] = iArr2[i15] ^ this._A1;
        }
        while (true) {
            int i16 = this.RATE_WORDS;
            if (i12 >= i16 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i17 = (i16 / 2) + i12;
            int[] iArr3 = this.state;
            int i18 = iArr3[i12];
            int i19 = iArr3[i17];
            int iLittleEndianToInt = Pack.littleEndianToInt(this.m_buf, i12 * 4);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(this.m_buf, i17 * 4);
            int[] iArr4 = this.state;
            int i21 = this.RATE_WORDS;
            iArr4[i12] = (iLittleEndianToInt ^ i19) ^ iArr4[i21 + i12];
            iArr4[i17] = ((i19 ^ i18) ^ iLittleEndianToInt2) ^ iArr4[i21 + (this.CAP_MASK & i17)];
            i12++;
        }
    }

    private static void sparkle_opt(int[] iArr, int i11) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i11);
        } else if (length == 12) {
            sparkle_opt12(iArr, i11);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i11);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i11) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i11);
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i11) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i11);
    }

    static void sparkle_opt8(int[] iArr, int i11) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        char c11 = 2;
        int i14 = iArr[2];
        char c12 = 3;
        int i15 = iArr[3];
        char c13 = 4;
        int i16 = iArr[4];
        char c14 = 5;
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = iArr[7];
        int i21 = 0;
        while (i21 < i11) {
            int[] iArr2 = RCON;
            int i22 = i13 ^ iArr2[i21 & 7];
            int i23 = i15 ^ i21;
            int i24 = iArr2[0];
            char c15 = c11;
            int iRotateRight = i12 + Integers.rotateRight(i22, 31);
            char c16 = c12;
            int iRotateRight2 = i22 ^ Integers.rotateRight(iRotateRight, 24);
            char c17 = c13;
            int iRotateRight3 = (iRotateRight ^ i24) + Integers.rotateRight(iRotateRight2, 17);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i25 = (iRotateRight3 ^ i24) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i25, 31);
            int iRotateRight6 = (i25 ^ i24) + Integers.rotateRight(iRotateRight5, 24);
            char c18 = c14;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i26 = iRotateRight6 ^ i24;
            int i27 = iArr2[1];
            int iRotateRight8 = i14 + Integers.rotateRight(i23, 31);
            int iRotateRight9 = i23 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = (iRotateRight8 ^ i27) + Integers.rotateRight(iRotateRight9, 17);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i28 = (iRotateRight10 ^ i27) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i28, 31);
            int iRotateRight13 = (i28 ^ i27) + Integers.rotateRight(iRotateRight12, 24);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i29 = iRotateRight13 ^ i27;
            int i31 = iArr2[c15];
            int iRotateRight15 = i16 + Integers.rotateRight(i17, 31);
            int iRotateRight16 = i17 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = (iRotateRight15 ^ i31) + Integers.rotateRight(iRotateRight16, 17);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i32 = (iRotateRight17 ^ i31) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i32, 31);
            int iRotateRight20 = (i32 ^ i31) + Integers.rotateRight(iRotateRight19, 24);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i33 = iArr2[c16];
            int iRotateRight22 = i18 + Integers.rotateRight(i19, 31);
            int iRotateRight23 = i19 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = (iRotateRight22 ^ i33) + Integers.rotateRight(iRotateRight23, 17);
            int iRotateRight25 = Integers.rotateRight(iRotateRight24, 17) ^ iRotateRight23;
            int i34 = (iRotateRight24 ^ i33) + iRotateRight25;
            int iRotateRight26 = Integers.rotateRight(i34, 31) ^ iRotateRight25;
            int iRotateRight27 = (i34 ^ i33) + Integers.rotateRight(iRotateRight26, 24);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i35 = iRotateRight27 ^ i33;
            int iELL = ELL(i26 ^ i29);
            int iELL2 = ELL(iRotateRight7 ^ iRotateRight14);
            int i36 = (i35 ^ i29) ^ iELL2;
            int i37 = (iRotateRight28 ^ iRotateRight14) ^ iELL;
            int i38 = iELL ^ (iRotateRight21 ^ iRotateRight7);
            i21++;
            i17 = iRotateRight7;
            i13 = i37;
            i18 = i29;
            i19 = iRotateRight14;
            i15 = i38;
            i14 = ((iRotateRight20 ^ i31) ^ i26) ^ iELL2;
            c11 = c15;
            c13 = c17;
            c14 = c18;
            i16 = i26;
            i12 = i36;
            c12 = c16;
        }
        iArr[0] = i12;
        iArr[1] = i13;
        iArr[c11] = i14;
        iArr[c12] = i15;
        iArr[c13] = i16;
        iArr[c14] = i17;
        iArr[6] = i18;
        iArr[7] = i19;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) throws InvalidCipherTextException {
        int i12;
        int i13;
        boolean zCheckData = checkData();
        int i14 = this.m_bufPos;
        int i15 = this.TAG_BYTES;
        if (zCheckData) {
            i12 = i14 + i15;
        } else {
            if (i14 < i15) {
                throw new InvalidCipherTextException("data too short");
            }
            i12 = i14 - i15;
            this.m_bufPos = i12;
        }
        if (i11 > bArr.length - i12) {
            throw new OutputLengthException("output buffer too short");
        }
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i16 = this.STATE_WORDS - 1;
            iArr[i16] = iArr[i16] ^ (this.m_bufPos < this.RATE_BYTES ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i17 = 0;
            while (true) {
                i13 = this.m_bufPos;
                if (i17 >= i13) {
                    break;
                }
                int i18 = i17 >>> 2;
                iArr2[i18] = iArr2[i18] | ((this.m_buf[i17] & 255) << ((i17 & 3) << 3));
                i17++;
            }
            if (i13 < this.RATE_BYTES) {
                if (!zCheckData) {
                    int i19 = (i13 & 3) << 3;
                    int i21 = i13 >>> 2;
                    int i22 = iArr2[i21];
                    int[] iArr3 = this.state;
                    iArr2[i21] = ((iArr3[i13 >>> 2] >>> i19) << i19) | i22;
                    int i23 = (i13 >>> 2) + 1;
                    System.arraycopy(iArr3, i23, iArr2, i23, this.RATE_WORDS - i23);
                }
                int i24 = this.m_bufPos;
                int i25 = i24 >>> 2;
                iArr2[i25] = (128 << ((i24 & 3) << 3)) ^ iArr2[i25];
            }
            int i26 = 0;
            while (true) {
                int i27 = this.RATE_WORDS;
                if (i26 >= i27 / 2) {
                    break;
                }
                int i28 = (i27 / 2) + i26;
                int[] iArr4 = this.state;
                int i29 = iArr4[i26];
                int i31 = iArr4[i28];
                if (zCheckData) {
                    iArr4[i26] = (iArr2[i26] ^ i31) ^ iArr4[i27 + i26];
                    iArr4[i28] = iArr4[i27 + (this.CAP_MASK & i28)] ^ ((i29 ^ i31) ^ iArr2[i28]);
                } else {
                    iArr4[i26] = ((i29 ^ i31) ^ iArr2[i26]) ^ iArr4[i27 + i26];
                    iArr4[i28] = iArr4[i27 + (this.CAP_MASK & i28)] ^ (iArr2[i28] ^ i29);
                }
                iArr2[i26] = iArr2[i26] ^ i29;
                iArr2[i28] = iArr2[i28] ^ i31;
                i26++;
            }
            int i32 = 0;
            while (i32 < this.m_bufPos) {
                bArr[i11] = (byte) (iArr2[i32 >>> 2] >>> ((i32 & 3) << 3));
                i32++;
                i11++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i33 = 0; i33 < this.KEY_WORDS; i33++) {
            int[] iArr5 = this.state;
            int i34 = this.RATE_WORDS + i33;
            iArr5[i34] = iArr5[i34] ^ this.f98700k[i33];
        }
        byte[] bArr2 = new byte[this.TAG_BYTES];
        this.tag = bArr2;
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, bArr2, 0);
        if (zCheckData) {
            System.arraycopy(this.tag, 0, bArr, i11, this.TAG_BYTES);
        } else if (!Arrays.constantTimeAreEqual(this.TAG_BYTES, this.tag, 0, this.m_buf, this.m_bufPos)) {
            throw new InvalidCipherTextException(this.algorithmName + " mac does not match");
        }
        reset(!zCheckData);
        return i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public int getIVBytesSize() {
        return this.RATE_BYTES;
    }

    public int getKeyBytesSize() {
        return this.KEY_BYTES;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.tag;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i11) {
        int iMax = Math.max(0, i11);
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 2:
                return Math.max(0, iMax - this.TAG_BYTES);
            case 3:
            case 4:
                return Math.max(0, (iMax + this.m_bufPos) - this.TAG_BYTES);
            case 5:
            case 6:
                return iMax + this.m_bufPos + this.TAG_BYTES;
            default:
                return iMax + this.TAG_BYTES;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i11) {
        int i12;
        int iMax = Math.max(0, i11) - 1;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 3:
            case 4:
                iMax += this.m_bufPos;
            case 1:
            case 2:
                i12 = iMax - this.TAG_BYTES;
                iMax = Math.max(0, i12);
                break;
            case 5:
            case 6:
                i12 = iMax + this.m_bufPos;
                iMax = Math.max(0, i12);
                break;
        }
        return iMax - (iMax % this.RATE_BYTES);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        KeyParameter key;
        byte[] iv2;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            key = aEADParameters.getKey();
            iv2 = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize != this.TAG_BYTES * 8) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to Sparkle");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            CipherParameters parameters = parametersWithIV.getParameters();
            key = parameters instanceof KeyParameter ? (KeyParameter) parameters : null;
            iv2 = parametersWithIV.getIV();
            this.initialAssociatedText = null;
        }
        if (key == null) {
            throw new IllegalArgumentException("Sparkle init parameters must include a key");
        }
        int i11 = this.KEY_WORDS * 4;
        if (i11 != key.getKeyLength()) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i11 + " bytes of key");
        }
        int i12 = this.RATE_WORDS * 4;
        if (iv2 == null || i12 != iv2.length) {
            throw new IllegalArgumentException(this.algorithmName + " requires exactly " + i12 + " bytes of IV");
        }
        Pack.littleEndianToInt(key.getKey(), 0, this.f98700k);
        Pack.littleEndianToInt(iv2, 0, this.npub);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        this.m_state = z11 ? State.EncInit : State.DecInit;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) {
        checkAAD();
        if (this.m_bufPos == this.RATE_BYTES) {
            processBufferAAD(this.m_buf, 0);
            this.m_bufPos = 0;
        }
        byte[] bArr = this.m_buf;
        int i11 = this.m_bufPos;
        this.m_bufPos = i11 + 1;
        bArr[i11] = b11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (i11 > bArr.length - i12) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 <= 0) {
            return;
        }
        checkAAD();
        int i13 = this.m_bufPos;
        if (i13 > 0) {
            int i14 = this.RATE_BYTES - i13;
            if (i12 <= i14) {
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
        while (i12 > this.RATE_BYTES) {
            processBufferAAD(bArr, i11);
            int i15 = this.RATE_BYTES;
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
        int i15;
        if (i11 > bArr.length - i12) {
            throw new DataLengthException("input buffer too short");
        }
        if (checkData()) {
            int i16 = this.m_bufPos;
            if (i16 > 0) {
                int i17 = this.RATE_BYTES - i16;
                if (i12 <= i17) {
                    System.arraycopy(bArr, i11, this.m_buf, i16, i12);
                    this.m_bufPos += i12;
                    return 0;
                }
                System.arraycopy(bArr, i11, this.m_buf, i16, i17);
                i11 += i17;
                i12 -= i17;
                processBufferEncrypt(this.m_buf, 0, bArr2, i13);
                i15 = this.RATE_BYTES;
            } else {
                i15 = 0;
            }
            while (i12 > this.RATE_BYTES) {
                processBufferEncrypt(bArr, i11, bArr2, i13 + i15);
                int i18 = this.RATE_BYTES;
                i11 += i18;
                i12 -= i18;
                i15 += i18;
            }
            System.arraycopy(bArr, i11, this.m_buf, 0, i12);
            this.m_bufPos = i12;
            return i15;
        }
        int i19 = this.m_bufferSizeDecrypt;
        int i21 = this.m_bufPos;
        int i22 = i19 - i21;
        if (i12 <= i22) {
            System.arraycopy(bArr, i11, this.m_buf, i21, i12);
            this.m_bufPos += i12;
            return 0;
        }
        if (i21 > this.RATE_BYTES) {
            processBufferDecrypt(this.m_buf, 0, bArr2, i13);
            int i23 = this.m_bufPos;
            int i24 = this.RATE_BYTES;
            int i25 = i23 - i24;
            this.m_bufPos = i25;
            byte[] bArr3 = this.m_buf;
            System.arraycopy(bArr3, i24, bArr3, 0, i25);
            i14 = this.RATE_BYTES;
            if (i12 <= i22 + i14) {
                System.arraycopy(bArr, i11, this.m_buf, this.m_bufPos, i12);
                this.m_bufPos += i12;
                return i14;
            }
        } else {
            i14 = 0;
        }
        int i26 = this.RATE_BYTES;
        int i27 = this.m_bufPos;
        int i28 = i26 - i27;
        System.arraycopy(bArr, i11, this.m_buf, i27, i28);
        i11 += i28;
        i12 -= i28;
        processBufferDecrypt(this.m_buf, 0, bArr2, i13 + i14);
        i15 = i14 + this.RATE_BYTES;
        while (i12 > this.m_bufferSizeDecrypt) {
            processBufferDecrypt(bArr, i11, bArr2, i13 + i15);
            int i29 = this.RATE_BYTES;
            i11 += i29;
            i12 -= i29;
            i15 += i29;
        }
        System.arraycopy(bArr, i11, this.m_buf, 0, i12);
        this.m_bufPos = i12;
        return i15;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    private void reset(boolean z11) {
        if (z11) {
            this.tag = null;
        }
        Arrays.clear(this.m_buf);
        this.m_bufPos = 0;
        this.encrypted = false;
        switch (AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$SparkleEngine$State[this.m_state.ordinal()]) {
            case 1:
            case 7:
                break;
            case 2:
            case 3:
            case 4:
                this.m_state = State.DecInit;
                break;
            case 5:
            case 6:
            case 8:
                this.m_state = State.EncFinal;
                return;
            default:
                throw new IllegalStateException(getAlgorithmName() + " needs to be initialized");
        }
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.f98700k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        byte[] bArr = this.initialAssociatedText;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    static void sparkle_opt12(int[] iArr, int i11) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char c11 = 4;
        int i16 = iArr[4];
        char c12 = 5;
        int i17 = iArr[5];
        char c13 = 6;
        int i18 = iArr[6];
        char c14 = 7;
        int i19 = iArr[7];
        int i21 = iArr[8];
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = 0;
        int i26 = i22;
        while (i25 < i11) {
            int[] iArr2 = RCON;
            int i27 = i13 ^ iArr2[i25 & 7];
            int i28 = i15 ^ i25;
            int i29 = iArr2[0];
            char c15 = c11;
            int iRotateRight = i12 + Integers.rotateRight(i27, 31);
            char c16 = c12;
            int iRotateRight2 = i27 ^ Integers.rotateRight(iRotateRight, 24);
            char c17 = c13;
            int iRotateRight3 = (iRotateRight ^ i29) + Integers.rotateRight(iRotateRight2, 17);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i31 = (iRotateRight3 ^ i29) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i31, 31);
            int iRotateRight6 = (i31 ^ i29) + Integers.rotateRight(iRotateRight5, 24);
            char c18 = c14;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i32 = iRotateRight6 ^ i29;
            int i33 = iArr2[1];
            int iRotateRight8 = i14 + Integers.rotateRight(i28, 31);
            int iRotateRight9 = i28 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = (iRotateRight8 ^ i33) + Integers.rotateRight(iRotateRight9, 17);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i34 = (iRotateRight10 ^ i33) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i34, 31);
            int iRotateRight13 = (i34 ^ i33) + Integers.rotateRight(iRotateRight12, 24);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i35 = iRotateRight13 ^ i33;
            int i36 = iArr2[2];
            int iRotateRight15 = i16 + Integers.rotateRight(i17, 31);
            int iRotateRight16 = i17 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = (iRotateRight15 ^ i36) + Integers.rotateRight(iRotateRight16, 17);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i37 = (iRotateRight17 ^ i36) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i37, 31);
            int iRotateRight20 = (i37 ^ i36) + Integers.rotateRight(iRotateRight19, 24);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i38 = iRotateRight20 ^ i36;
            int i39 = iArr2[3];
            int iRotateRight22 = i18 + Integers.rotateRight(i19, 31);
            int iRotateRight23 = i19 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = (iRotateRight22 ^ i39) + Integers.rotateRight(iRotateRight23, 17);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i41 = (iRotateRight24 ^ i39) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i41, 31);
            int iRotateRight27 = (i41 ^ i39) + Integers.rotateRight(iRotateRight26, 24);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i42 = iRotateRight27 ^ i39;
            int i43 = iArr2[c15];
            int iRotateRight29 = i21 + Integers.rotateRight(i26, 31);
            int iRotateRight30 = i26 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = (iRotateRight29 ^ i43) + Integers.rotateRight(iRotateRight30, 17);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i44 = (iRotateRight31 ^ i43) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i44, 31);
            int iRotateRight34 = (i44 ^ i43) + Integers.rotateRight(iRotateRight33, 24);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i45 = iRotateRight34 ^ i43;
            int i46 = iArr2[c16];
            int iRotateRight36 = i23 + Integers.rotateRight(i24, 31);
            int iRotateRight37 = i24 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = (iRotateRight36 ^ i46) + Integers.rotateRight(iRotateRight37, 17);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i47 = (iRotateRight38 ^ i46) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i47, 31);
            int iRotateRight41 = (i47 ^ i46) + Integers.rotateRight(iRotateRight40, 24);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i48 = iRotateRight41 ^ i46;
            int iELL = ELL((i32 ^ i35) ^ i38);
            int iELL2 = ELL((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21);
            int i49 = (i45 ^ i35) ^ iELL2;
            int i51 = (iRotateRight35 ^ iRotateRight14) ^ iELL;
            int i52 = (iRotateRight42 ^ iRotateRight21) ^ iELL;
            int i53 = iELL ^ (iRotateRight28 ^ iRotateRight7);
            i25++;
            i19 = iRotateRight7;
            i21 = i35;
            i14 = (i48 ^ i38) ^ iELL2;
            i23 = i38;
            i16 = (i42 ^ i32) ^ iELL2;
            c11 = c15;
            c14 = c18;
            i13 = i51;
            i18 = i32;
            i26 = iRotateRight14;
            i12 = i49;
            c13 = c17;
            i15 = i52;
            i24 = iRotateRight21;
            i17 = i53;
            c12 = c16;
        }
        iArr[0] = i12;
        iArr[1] = i13;
        iArr[2] = i14;
        iArr[3] = i15;
        iArr[c11] = i16;
        iArr[c12] = i17;
        iArr[c13] = i18;
        iArr[c14] = i19;
        iArr[8] = i21;
        iArr[9] = i26;
        iArr[10] = i23;
        iArr[11] = i24;
    }

    static void sparkle_opt16(int[] iArr, int i11) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        char c11 = 6;
        int i18 = iArr[6];
        char c12 = 7;
        int i19 = iArr[7];
        int i21 = iArr[8];
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = iArr[12];
        int i26 = iArr[13];
        int i27 = iArr[14];
        int i28 = i24;
        int i29 = i26;
        int i31 = iArr[15];
        int i32 = 0;
        int i33 = i22;
        while (i32 < i11) {
            int[] iArr2 = RCON;
            int i34 = i13 ^ iArr2[i32 & 7];
            int i35 = i15 ^ i32;
            int i36 = iArr2[0];
            char c13 = c11;
            int iRotateRight = i12 + Integers.rotateRight(i34, 31);
            char c14 = c12;
            int iRotateRight2 = i34 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = (iRotateRight ^ i36) + Integers.rotateRight(iRotateRight2, 17);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i37 = (iRotateRight3 ^ i36) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i37, 31);
            int iRotateRight6 = (i37 ^ i36) + Integers.rotateRight(iRotateRight5, 24);
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i38 = iRotateRight6 ^ i36;
            int i39 = iArr2[1];
            int iRotateRight8 = i14 + Integers.rotateRight(i35, 31);
            int iRotateRight9 = i35 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = (iRotateRight8 ^ i39) + Integers.rotateRight(iRotateRight9, 17);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i41 = (iRotateRight10 ^ i39) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i41, 31);
            int iRotateRight13 = (i41 ^ i39) + Integers.rotateRight(iRotateRight12, 24);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i42 = iRotateRight13 ^ i39;
            int i43 = iArr2[2];
            int iRotateRight15 = i16 + Integers.rotateRight(i17, 31);
            int iRotateRight16 = i17 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = (iRotateRight15 ^ i43) + Integers.rotateRight(iRotateRight16, 17);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i44 = (iRotateRight17 ^ i43) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i44, 31);
            int iRotateRight20 = (i44 ^ i43) + Integers.rotateRight(iRotateRight19, 24);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i45 = iRotateRight20 ^ i43;
            int i46 = iArr2[3];
            int iRotateRight22 = i18 + Integers.rotateRight(i19, 31);
            int iRotateRight23 = i19 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = (iRotateRight22 ^ i46) + Integers.rotateRight(iRotateRight23, 17);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i47 = (iRotateRight24 ^ i46) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i47, 31);
            int iRotateRight27 = (i47 ^ i46) + Integers.rotateRight(iRotateRight26, 24);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i48 = i46 ^ iRotateRight27;
            int i49 = iArr2[4];
            int iRotateRight29 = i21 + Integers.rotateRight(i33, 31);
            int iRotateRight30 = i33 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = (iRotateRight29 ^ i49) + Integers.rotateRight(iRotateRight30, 17);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i51 = (iRotateRight31 ^ i49) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i51, 31);
            int iRotateRight34 = (i51 ^ i49) + Integers.rotateRight(iRotateRight33, 24);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i52 = iRotateRight34 ^ i49;
            int i53 = iArr2[5];
            int iRotateRight36 = i23 + Integers.rotateRight(i28, 31);
            int iRotateRight37 = i28 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = (iRotateRight36 ^ i53) + Integers.rotateRight(iRotateRight37, 17);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i54 = (iRotateRight38 ^ i53) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i54, 31);
            int iRotateRight41 = (i54 ^ i53) + Integers.rotateRight(iRotateRight40, 24);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i55 = iRotateRight41 ^ i53;
            int i56 = iArr2[c13];
            int iRotateRight43 = i25 + Integers.rotateRight(i29, 31);
            int iRotateRight44 = i29 ^ Integers.rotateRight(iRotateRight43, 24);
            int iRotateRight45 = (iRotateRight43 ^ i56) + Integers.rotateRight(iRotateRight44, 17);
            int iRotateRight46 = iRotateRight44 ^ Integers.rotateRight(iRotateRight45, 17);
            int i57 = (iRotateRight45 ^ i56) + iRotateRight46;
            int iRotateRight47 = iRotateRight46 ^ Integers.rotateRight(i57, 31);
            int iRotateRight48 = (i57 ^ i56) + Integers.rotateRight(iRotateRight47, 24);
            int iRotateRight49 = iRotateRight47 ^ Integers.rotateRight(iRotateRight48, 16);
            int i58 = iRotateRight48 ^ i56;
            int i59 = iArr2[c14];
            int iRotateRight50 = i27 + Integers.rotateRight(i31, 31);
            int iRotateRight51 = i31 ^ Integers.rotateRight(iRotateRight50, 24);
            int iRotateRight52 = (iRotateRight50 ^ i59) + Integers.rotateRight(iRotateRight51, 17);
            int iRotateRight53 = iRotateRight51 ^ Integers.rotateRight(iRotateRight52, 17);
            int i61 = (iRotateRight52 ^ i59) + iRotateRight53;
            int iRotateRight54 = iRotateRight53 ^ Integers.rotateRight(i61, 31);
            int iRotateRight55 = (i61 ^ i59) + Integers.rotateRight(iRotateRight54, 24);
            int iRotateRight56 = iRotateRight54 ^ Integers.rotateRight(iRotateRight55, 16);
            int i62 = iRotateRight55 ^ i59;
            int iELL = ELL(((i38 ^ i42) ^ i45) ^ i48);
            int iELL2 = ELL(((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21) ^ iRotateRight28);
            int i63 = iRotateRight14 ^ iRotateRight42;
            int i64 = (i55 ^ i42) ^ iELL2;
            int i65 = (i58 ^ i45) ^ iELL2;
            int i66 = (iRotateRight21 ^ iRotateRight49) ^ iELL;
            int i67 = (i62 ^ i48) ^ iELL2;
            int i68 = (i38 ^ i52) ^ iELL2;
            i19 = (iRotateRight7 ^ iRotateRight35) ^ iELL;
            i32++;
            i17 = (iRotateRight56 ^ iRotateRight28) ^ iELL;
            i33 = iRotateRight7;
            i13 = i63 ^ iELL;
            i23 = i42;
            i14 = i65;
            i29 = iRotateRight21;
            i18 = i68;
            i12 = i64;
            i28 = iRotateRight14;
            i27 = i48;
            i15 = i66;
            c11 = c13;
            i21 = i38;
            i25 = i45;
            i16 = i67;
            i31 = iRotateRight28;
            c12 = c14;
        }
        iArr[0] = i12;
        iArr[1] = i13;
        iArr[2] = i14;
        iArr[3] = i15;
        iArr[4] = i16;
        iArr[5] = i17;
        iArr[c11] = i18;
        iArr[c12] = i19;
        iArr[8] = i21;
        iArr[9] = i33;
        iArr[10] = i23;
        iArr[11] = i28;
        iArr[12] = i25;
        iArr[13] = i29;
        iArr[14] = i27;
        iArr[15] = i31;
    }
}
