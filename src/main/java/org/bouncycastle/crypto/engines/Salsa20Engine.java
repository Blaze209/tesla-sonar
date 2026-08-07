package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes9.dex */
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
    protected int[] f98699x;

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
        int iRotateLeft = iArr[15];
        int iRotateLeft2 = i31;
        int iRotateLeft3 = i29;
        int iRotateLeft4 = i27;
        int iRotateLeft5 = i26;
        int iRotateLeft6 = i25;
        int i32 = i24;
        int i33 = i22;
        int i34 = i21;
        int i35 = i18;
        int iRotateLeft7 = i17;
        int i36 = i16;
        int i37 = i15;
        int i38 = i14;
        int i39 = i13;
        int iRotateLeft8 = i12;
        int i41 = i11;
        while (true) {
            char c15 = c11;
            if (i41 <= 0) {
                char c16 = c12;
                char c17 = c13;
                char c18 = c14;
                iArr2[0] = iRotateLeft8 + iArr[0];
                iArr2[1] = i39 + iArr[1];
                iArr2[2] = i38 + iArr[2];
                iArr2[c15] = i37 + iArr[c15];
                iArr2[c16] = i36 + iArr[c16];
                iArr2[c17] = iRotateLeft7 + iArr[c17];
                iArr2[c18] = i35 + iArr[c18];
                iArr2[7] = i34 + iArr[7];
                iArr2[8] = i33 + iArr[8];
                iArr2[9] = i32 + iArr[9];
                iArr2[10] = iRotateLeft6 + iArr[10];
                iArr2[11] = iRotateLeft5 + iArr[11];
                iArr2[12] = iRotateLeft4 + iArr[12];
                iArr2[13] = iRotateLeft3 + iArr[13];
                iArr2[14] = iRotateLeft2 + iArr[14];
                iArr2[15] = iRotateLeft + iArr[15];
                return;
            }
            int iRotateLeft9 = Integers.rotateLeft(iRotateLeft8 + iRotateLeft4, i19) ^ i36;
            int iRotateLeft10 = i33 ^ Integers.rotateLeft(iRotateLeft9 + iRotateLeft8, i23);
            char c19 = c12;
            int iRotateLeft11 = iRotateLeft4 ^ Integers.rotateLeft(iRotateLeft10 + iRotateLeft9, i28);
            char c21 = c13;
            char c22 = c14;
            int iRotateLeft12 = iRotateLeft8 ^ Integers.rotateLeft(iRotateLeft11 + iRotateLeft10, 18);
            int iRotateLeft13 = i32 ^ Integers.rotateLeft(iRotateLeft7 + i39, i19);
            int iRotateLeft14 = iRotateLeft3 ^ Integers.rotateLeft(iRotateLeft13 + iRotateLeft7, i23);
            int iRotateLeft15 = Integers.rotateLeft(iRotateLeft14 + iRotateLeft13, i28) ^ i39;
            int iRotateLeft16 = Integers.rotateLeft(iRotateLeft15 + iRotateLeft14, 18) ^ iRotateLeft7;
            int iRotateLeft17 = iRotateLeft2 ^ Integers.rotateLeft(iRotateLeft6 + i35, 7);
            int iRotateLeft18 = i38 ^ Integers.rotateLeft(iRotateLeft17 + iRotateLeft6, 9);
            int iRotateLeft19 = i35 ^ Integers.rotateLeft(iRotateLeft18 + iRotateLeft17, 13);
            int iRotateLeft20 = iRotateLeft6 ^ Integers.rotateLeft(iRotateLeft19 + iRotateLeft18, 18);
            int iRotateLeft21 = i37 ^ Integers.rotateLeft(iRotateLeft + iRotateLeft5, 7);
            int iRotateLeft22 = i34 ^ Integers.rotateLeft(iRotateLeft21 + iRotateLeft, 9);
            int iRotateLeft23 = iRotateLeft5 ^ Integers.rotateLeft(iRotateLeft22 + iRotateLeft21, 13);
            int iRotateLeft24 = iRotateLeft ^ Integers.rotateLeft(iRotateLeft23 + iRotateLeft22, 18);
            int iRotateLeft25 = iRotateLeft15 ^ Integers.rotateLeft(iRotateLeft12 + iRotateLeft21, 7);
            int iRotateLeft26 = Integers.rotateLeft(iRotateLeft25 + iRotateLeft12, 9) ^ iRotateLeft18;
            int iRotateLeft27 = iRotateLeft21 ^ Integers.rotateLeft(iRotateLeft26 + iRotateLeft25, 13);
            iRotateLeft8 = iRotateLeft12 ^ Integers.rotateLeft(iRotateLeft27 + iRotateLeft26, 18);
            int iRotateLeft28 = Integers.rotateLeft(iRotateLeft16 + iRotateLeft9, 7) ^ iRotateLeft19;
            int iRotateLeft29 = Integers.rotateLeft(iRotateLeft28 + iRotateLeft16, 9) ^ iRotateLeft22;
            int iRotateLeft30 = iRotateLeft9 ^ Integers.rotateLeft(iRotateLeft29 + iRotateLeft28, 13);
            iRotateLeft7 = iRotateLeft16 ^ Integers.rotateLeft(iRotateLeft30 + iRotateLeft29, 18);
            iRotateLeft5 = iRotateLeft23 ^ Integers.rotateLeft(iRotateLeft20 + iRotateLeft13, 7);
            int iRotateLeft31 = Integers.rotateLeft(iRotateLeft5 + iRotateLeft20, 9) ^ iRotateLeft10;
            int iRotateLeft32 = Integers.rotateLeft(iRotateLeft31 + iRotateLeft5, 13) ^ iRotateLeft13;
            iRotateLeft6 = iRotateLeft20 ^ Integers.rotateLeft(iRotateLeft32 + iRotateLeft31, 18);
            iRotateLeft4 = iRotateLeft11 ^ Integers.rotateLeft(iRotateLeft24 + iRotateLeft17, 7);
            iRotateLeft3 = iRotateLeft14 ^ Integers.rotateLeft(iRotateLeft4 + iRotateLeft24, 9);
            iRotateLeft2 = iRotateLeft17 ^ Integers.rotateLeft(iRotateLeft3 + iRotateLeft4, 13);
            iRotateLeft = iRotateLeft24 ^ Integers.rotateLeft(iRotateLeft2 + iRotateLeft3, 18);
            i41 -= 2;
            i33 = iRotateLeft31;
            i39 = iRotateLeft25;
            i35 = iRotateLeft28;
            i36 = iRotateLeft30;
            i34 = iRotateLeft29;
            i32 = iRotateLeft32;
            c11 = c15;
            c12 = c19;
            c13 = c21;
            c14 = c22;
            i19 = 7;
            i38 = iRotateLeft26;
            i37 = iRotateLeft27;
            i23 = 9;
            i28 = 13;
        }
    }

    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[8] + 1;
        iArr[8] = i11;
        if (i11 == 0) {
            iArr[9] = iArr[9] + 1;
        }
    }

    protected void generateKeyStream(byte[] bArr) {
        salsaCore(this.rounds, this.engineState, this.f98699x);
        Pack.intToLittleEndian(this.f98699x, bArr, 0);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
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

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        return (getCounter() * 64) + ((long) this.index);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
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
            byte[] key = ((KeyParameter) parameters).getKey();
            setKey(key, iv2);
            CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length * 8, cipherParameters, Utils.getPurpose(z11)));
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

    @Override // org.bouncycastle.crypto.StreamCipher
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

    @Override // org.bouncycastle.crypto.StreamCipher
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

    @Override // org.bouncycastle.crypto.StreamCipher
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

    @Override // org.bouncycastle.crypto.SkippingCipher
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

    @Override // org.bouncycastle.crypto.SkippingCipher
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
        this.f98699x = new int[16];
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
}
