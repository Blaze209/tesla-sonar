package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.MaxBytesExceededException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes10.dex */
public class Salsa20Engine implements SkippingStreamCipher {
    public static final int DEFAULT_ROUNDS = 20;
    private static final int STATE_SIZE = 16;
    private static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
    protected static final byte[] tau = Strings.toByteArray("expand 16-byte k");
    private int cW0;
    private int cW1;
    private int cW2;
    protected int[] engineState;
    private int index;
    private boolean initialised;
    private byte[] keyStream;
    protected int rounds;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int[] f99496x;

    public Salsa20Engine() {
        this(20);
    }

    private boolean limitExceeded() {
        int i11 = this.cW0 + 1;
        this.cW0 = i11;
        if (i11 == 0) {
            int i12 = this.cW1 + 1;
            this.cW1 = i12;
            if (i12 == 0) {
                int i13 = this.cW2 + 1;
                this.cW2 = i13;
                if ((i13 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void resetLimitCounter() {
        this.cW0 = 0;
        this.cW1 = 0;
        this.cW2 = 0;
    }

    protected static int rotl(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    public static void salsaCore(int i11, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i11 % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        char c11 = 3;
        int i15 = iArr[3];
        char c12 = 4;
        int i16 = iArr[4];
        char c13 = 5;
        int i17 = iArr[5];
        char c14 = 6;
        int i18 = iArr[6];
        int i19 = 7;
        int i21 = iArr[7];
        int i22 = iArr[8];
        int i23 = 9;
        int i24 = iArr[9];
        int i25 = iArr[10];
        int i26 = iArr[11];
        int i27 = iArr[12];
        int i28 = 13;
        int i29 = iArr[13];
        int i31 = iArr[14];
        int iRotl = iArr[15];
        int iRotl2 = i31;
        int iRotl3 = i29;
        int iRotl4 = i27;
        int iRotl5 = i26;
        int iRotl6 = i25;
        int i32 = i24;
        int i33 = i22;
        int i34 = i21;
        int i35 = i18;
        int iRotl7 = i17;
        int i36 = i16;
        int i37 = i15;
        int i38 = i14;
        int i39 = i13;
        int iRotl8 = i12;
        int i41 = i11;
        while (i41 > 0) {
            char c15 = c11;
            int iRotl9 = rotl(iRotl8 + iRotl4, i19) ^ i36;
            int iRotl10 = i33 ^ rotl(iRotl9 + iRotl8, i23);
            char c16 = c12;
            int iRotl11 = iRotl4 ^ rotl(iRotl10 + iRotl9, i28);
            char c17 = c13;
            char c18 = c14;
            int iRotl12 = iRotl8 ^ rotl(iRotl11 + iRotl10, 18);
            int iRotl13 = i32 ^ rotl(iRotl7 + i39, i19);
            int iRotl14 = iRotl3 ^ rotl(iRotl13 + iRotl7, i23);
            int iRotl15 = rotl(iRotl14 + iRotl13, i28) ^ i39;
            int iRotl16 = rotl(iRotl15 + iRotl14, 18) ^ iRotl7;
            int iRotl17 = iRotl2 ^ rotl(iRotl6 + i35, 7);
            int iRotl18 = i38 ^ rotl(iRotl17 + iRotl6, 9);
            int iRotl19 = i35 ^ rotl(iRotl18 + iRotl17, 13);
            int iRotl20 = iRotl6 ^ rotl(iRotl19 + iRotl18, 18);
            int iRotl21 = i37 ^ rotl(iRotl + iRotl5, 7);
            int iRotl22 = i34 ^ rotl(iRotl21 + iRotl, 9);
            int iRotl23 = iRotl5 ^ rotl(iRotl22 + iRotl21, 13);
            int iRotl24 = iRotl ^ rotl(iRotl23 + iRotl22, 18);
            int iRotl25 = iRotl15 ^ rotl(iRotl12 + iRotl21, 7);
            int iRotl26 = rotl(iRotl25 + iRotl12, 9) ^ iRotl18;
            int iRotl27 = iRotl21 ^ rotl(iRotl26 + iRotl25, 13);
            iRotl8 = iRotl12 ^ rotl(iRotl27 + iRotl26, 18);
            int iRotl28 = rotl(iRotl16 + iRotl9, 7) ^ iRotl19;
            int iRotl29 = rotl(iRotl28 + iRotl16, 9) ^ iRotl22;
            int iRotl30 = iRotl9 ^ rotl(iRotl29 + iRotl28, 13);
            iRotl7 = iRotl16 ^ rotl(iRotl30 + iRotl29, 18);
            iRotl5 = iRotl23 ^ rotl(iRotl20 + iRotl13, 7);
            int iRotl31 = rotl(iRotl5 + iRotl20, 9) ^ iRotl10;
            int iRotl32 = rotl(iRotl31 + iRotl5, 13) ^ iRotl13;
            iRotl6 = iRotl20 ^ rotl(iRotl32 + iRotl31, 18);
            iRotl4 = iRotl11 ^ rotl(iRotl24 + iRotl17, 7);
            iRotl3 = iRotl14 ^ rotl(iRotl4 + iRotl24, 9);
            iRotl2 = iRotl17 ^ rotl(iRotl3 + iRotl4, 13);
            iRotl = iRotl24 ^ rotl(iRotl2 + iRotl3, 18);
            i41 -= 2;
            i33 = iRotl31;
            i39 = iRotl25;
            i35 = iRotl28;
            i36 = iRotl30;
            i34 = iRotl29;
            i32 = iRotl32;
            c11 = c15;
            c12 = c16;
            c13 = c17;
            c14 = c18;
            i19 = 7;
            i38 = iRotl26;
            i37 = iRotl27;
            i23 = 9;
            i28 = 13;
        }
        char c19 = c11;
        char c21 = c12;
        char c22 = c13;
        char c23 = c14;
        iArr2[0] = iRotl8 + iArr[0];
        iArr2[1] = i39 + iArr[1];
        iArr2[2] = i38 + iArr[2];
        iArr2[c19] = i37 + iArr[c19];
        iArr2[c21] = i36 + iArr[c21];
        iArr2[c22] = iRotl7 + iArr[c22];
        iArr2[c23] = i35 + iArr[c23];
        iArr2[7] = i34 + iArr[7];
        iArr2[8] = i33 + iArr[8];
        iArr2[9] = i32 + iArr[9];
        iArr2[10] = iRotl6 + iArr[10];
        iArr2[11] = iRotl5 + iArr[11];
        iArr2[12] = iRotl4 + iArr[12];
        iArr2[13] = iRotl3 + iArr[13];
        iArr2[14] = iRotl2 + iArr[14];
        iArr2[15] = iRotl + iArr[15];
    }

    protected void advanceCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 > 0) {
            int[] iArr = this.engineState;
            iArr[9] = iArr[9] + i11;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[8];
        int i14 = i12 + i13;
        iArr2[8] = i14;
        if (i13 == 0 || i14 >= i13) {
            return;
        }
        iArr2[9] = iArr2[9] + 1;
    }

    protected void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f99496x);
        Pack.intToLittleEndian(this.f99496x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        if (this.rounds == 20) {
            return "Salsa20";
        }
        return "Salsa20/" + this.rounds;
    }

    protected long getCounter() {
        int[] iArr = this.engineState;
        return (((long) iArr[9]) << 32) | (((long) iArr[8]) & 4294967295L);
    }

    protected int getNonceSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + ((long) this.index);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != getNonceSize()) {
            throw new IllegalArgumentException(getAlgorithmName() + " requires exactly " + getNonceSize() + " bytes of IV");
        }
        CipherParameters parameters = parametersWithIV.getParameters();
        if (parameters == null) {
            if (!this.initialised) {
                throw new IllegalStateException(getAlgorithmName() + " KeyParameter can not be null for first initialisation");
            }
            setKey(null, iv2);
        } else {
            if (!(parameters instanceof KeyParameter)) {
                throw new IllegalArgumentException(getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            setKey(((KeyParameter) parameters).getKey(), iv2);
        }
        reset();
        this.initialised = true;
    }

    protected void packTauOrSigma(int i11, int[] iArr, int i12) {
        int i13 = (i11 - 16) / 4;
        int[] iArr2 = TAU_SIGMA;
        iArr[i12] = iArr2[i13];
        iArr[i12 + 1] = iArr2[i13 + 1];
        iArr[i12 + 2] = iArr2[i13 + 2];
        iArr[i12 + 3] = iArr2[i13 + 3];
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        if (limitExceeded(i12)) {
            throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] bArr3 = this.keyStream;
            int i15 = this.index;
            bArr2[i14 + i13] = (byte) (bArr3[i15] ^ bArr[i14 + i11]);
            int i16 = (i15 + 1) & 63;
            this.index = i16;
            if (i16 == 0) {
                advanceCounter();
                generateKeyStream(this.keyStream);
            }
        }
        return i12;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 0;
        resetLimitCounter();
        resetCounter();
        generateKeyStream(this.keyStream);
    }

    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[9] = 0;
        iArr[8] = 0;
    }

    protected void retreatCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 != 0) {
            int[] iArr = this.engineState;
            int i13 = iArr[9];
            if ((((long) i13) & 4294967295L) < (((long) i11) & 4294967295L)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            iArr[9] = i13 - i11;
        }
        int[] iArr2 = this.engineState;
        int i14 = iArr2[8];
        if ((((long) i14) & 4294967295L) >= (4294967295L & ((long) i12))) {
            iArr2[8] = i14 - i12;
            return;
        }
        int i15 = iArr2[9];
        if (i15 == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        iArr2[9] = i15 - 1;
        iArr2[8] = i14 - i12;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        if (limitExceeded()) {
            throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
        }
        byte[] bArr = this.keyStream;
        int i11 = this.index;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        int i12 = (i11 + 1) & 63;
        this.index = i12;
        if (i12 == 0) {
            advanceCounter();
            generateKeyStream(this.keyStream);
        }
        return b12;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j11) {
        reset();
        return skip(j11);
    }

    protected void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            int length = (bArr.length - 16) / 4;
            int[] iArr = this.engineState;
            int[] iArr2 = TAU_SIGMA;
            iArr[0] = iArr2[length];
            iArr[5] = iArr2[length + 1];
            iArr[10] = iArr2[length + 2];
            iArr[15] = iArr2[length + 3];
            Pack.littleEndianToInt(bArr, 0, iArr, 1, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 11, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 6, 2);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j11) {
        long j12;
        if (j11 >= 0) {
            if (j11 >= 64) {
                long j13 = j11 / 64;
                advanceCounter(j13);
                j12 = j11 - (j13 * 64);
            } else {
                j12 = j11;
            }
            int i11 = this.index;
            int i12 = (((int) j12) + i11) & 63;
            this.index = i12;
            if (i12 < i11) {
                advanceCounter();
            }
        } else {
            long j14 = -j11;
            if (j14 >= 64) {
                long j15 = j14 / 64;
                retreatCounter(j15);
                j14 -= j15 * 64;
            }
            for (long j16 = 0; j16 < j14; j16++) {
                if (this.index == 0) {
                    retreatCounter();
                }
                this.index = (this.index - 1) & 63;
            }
        }
        generateKeyStream(this.keyStream);
        return j11;
    }

    public Salsa20Engine(int i11) {
        this.index = 0;
        this.engineState = new int[16];
        this.f99496x = new int[16];
        this.keyStream = new byte[64];
        this.initialised = false;
        if (i11 <= 0 || (i11 & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.rounds = i11;
    }

    private boolean limitExceeded(int i11) {
        int i12 = this.cW0 + i11;
        this.cW0 = i12;
        if (i12 < i11 && i12 >= 0) {
            int i13 = this.cW1 + 1;
            this.cW1 = i13;
            if (i13 == 0) {
                int i14 = this.cW2 + 1;
                this.cW2 = i14;
                if ((i14 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[8] + 1;
        iArr[8] = i11;
        if (i11 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void retreatCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[8];
        if (i11 == 0 && iArr[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i12 = i11 - 1;
        iArr[8] = i12;
        if (i12 == -1) {
            iArr[9] = iArr[9] - 1;
        }
    }
}
