package org.spongycastle.crypto.digests;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.EnumC4419g;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Memoable;

/* JADX INFO: loaded from: classes10.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, EnumC4419g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 135, 184, 1, 79, 54, 166, EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 121, 111, 145, 82, 96, 188, 155, 142, 163, 12, 123, 53, 29, 224, EnumC4419g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 194, 46, 75, EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 87, 21, 119, 55, EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 159, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 74, EnumC4419g.SDK_ASSET_ICON_QUESTION_VALUE, 88, EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, 41, 10, 177, 160, 107, 133, 189, 93, 16, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, 62, 5, 103, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 39, 65, 139, 167, 125, 149, EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 124, 102, EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE, 23, 71, 158, EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, 45, 191, 7, 173, 90, 131, 51, 99, 2, 170, 113, 200, 25, 73, EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 91, 136, 154, 38, 50, 176, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 15, EnumC4419g.SDK_ASSET_ICON_PAUSE_VALUE, 128, 190, EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE, 52, 72, 255, 122, 144, 95, 32, 104, 26, 174, 180, 84, 147, 34, 100, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 115, 18, 64, 8, 195, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 161, 141, 61, 151, 0, EnumC4419g.SDK_ASSET_ICON_COMMENT_VALUE, 43, 118, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, 27, 181, 175, 106, 80, 69, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 48, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 63, 85, 162, EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 101, 186, 47, 192, EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE, 28, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 77, 146, 117, 6, 138, 178, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 14, 31, 98, EnumC4419g.SDK_ASSET_ICON_OVERRIDE_VALUE, 168, 150, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 197, 37, 89, 132, 114, 57, 76, 94, 120, 56, 140, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 165, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, 97, 179, 33, 156, 30, 67, EnumC4419g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 4, 81, 153, 109, 13, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 126, 36, 59, 171, EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, 17, 143, 78, 183, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 60, EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 148, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, 185, 19, 44, 211, EnumC4419g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 110, 196, 3, 86, 68, 127, 169, 42, 187, 193, 83, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 11, 157, 108, 49, 116, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 70, 172, 137, 20, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, 22, 58, 105, 9, 112, 182, EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, 66, 152, 164, 40, 92, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 134};
    private static final long[] C0 = new long[256];
    private static final long[] C1 = new long[256];
    private static final long[] C2 = new long[256];
    private static final long[] C3 = new long[256];
    private static final long[] C4 = new long[256];
    private static final long[] C5 = new long[256];
    private static final long[] C6 = new long[256];
    private static final long[] C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.spongycastle.crypto.digests.WhirlpoolDigest] */
    public WhirlpoolDigest() {
        ?? obj = new Object();
        obj._rc = new long[11];
        obj._buffer = new byte[64];
        obj._bufferPos = 0;
        obj._bitCount = new short[32];
        obj._hash = new long[8];
        obj._K = new long[8];
        obj._L = new long[8];
        obj._block = new long[8];
        obj._state = new long[8];
        int i11 = 0;
        WhirlpoolDigest whirlpoolDigest = obj;
        while (i11 < 256) {
            int i12 = SBOX[i11];
            int iMaskWithReductionPolynomial = whirlpoolDigest.maskWithReductionPolynomial(i12 << 1);
            int iMaskWithReductionPolynomial2 = whirlpoolDigest.maskWithReductionPolynomial(iMaskWithReductionPolynomial << 1);
            int i13 = iMaskWithReductionPolynomial2 ^ i12;
            int iMaskWithReductionPolynomial3 = whirlpoolDigest.maskWithReductionPolynomial(iMaskWithReductionPolynomial2 << 1);
            int i14 = iMaskWithReductionPolynomial3 ^ i12;
            C0[i11] = whirlpoolDigest.packIntoLong(i12, i12, iMaskWithReductionPolynomial2, i12, iMaskWithReductionPolynomial3, i13, iMaskWithReductionPolynomial, i14);
            C1[i11] = packIntoLong(i14, i12, i12, iMaskWithReductionPolynomial2, i12, iMaskWithReductionPolynomial3, i13, iMaskWithReductionPolynomial);
            C2[i11] = packIntoLong(iMaskWithReductionPolynomial, i14, i12, i12, iMaskWithReductionPolynomial2, i12, iMaskWithReductionPolynomial3, i13);
            C3[i11] = packIntoLong(i13, iMaskWithReductionPolynomial, i14, i12, i12, iMaskWithReductionPolynomial2, i12, iMaskWithReductionPolynomial3);
            C4[i11] = packIntoLong(iMaskWithReductionPolynomial3, i13, iMaskWithReductionPolynomial, i14, i12, i12, iMaskWithReductionPolynomial2, i12);
            C5[i11] = packIntoLong(i12, iMaskWithReductionPolynomial3, i13, iMaskWithReductionPolynomial, i14, i12, i12, iMaskWithReductionPolynomial2);
            C6[i11] = packIntoLong(iMaskWithReductionPolynomial2, i12, iMaskWithReductionPolynomial3, i13, iMaskWithReductionPolynomial, i14, i12, i12);
            WhirlpoolDigest whirlpoolDigest2 = this;
            C7[i11] = whirlpoolDigest2.packIntoLong(i12, iMaskWithReductionPolynomial2, i12, iMaskWithReductionPolynomial3, i13, iMaskWithReductionPolynomial, i14, i12);
            i11++;
            whirlpoolDigest = whirlpoolDigest2;
        }
        whirlpoolDigest._rc[0] = 0;
        for (int i15 = 1; i15 <= 10; i15++) {
            int i16 = (i15 - 1) * 8;
            whirlpoolDigest._rc[i15] = (((((((C0[i16] & (-72057594037927936L)) ^ (C1[i16 + 1] & 71776119061217280L)) ^ (C2[i16 + 2] & 280375465082880L)) ^ (C3[i16 + 3] & 1095216660480L)) ^ (C4[i16 + 4] & 4278190080L)) ^ (C5[i16 + 5] & 16711680)) ^ (C6[i16 + 6] & 65280)) ^ (C7[i16 + 7] & 255);
        }
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i11) {
        return (((long) bArr[i11 + 7]) & 255) | ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
    }

    private void convertLongToByteArray(long j11, byte[] bArr, int i11) {
        for (int i12 = 0; i12 < 8; i12++) {
            bArr[i11 + i12] = (byte) ((j11 >> (56 - (i12 * 8))) & 255);
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = (byte) (this._bitCount[i11] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] bArrCopyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i11 = this._bufferPos;
        int i12 = i11 + 1;
        this._bufferPos = i12;
        bArr[i11] = (byte) (bArr[i11] | 128);
        if (i12 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(bArrCopyBitLength, 0, this._buffer, 32, bArrCopyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i11 = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i12 = (sArr[length] & 255) + EIGHT[length] + i11;
            i11 = i12 >>> 8;
            sArr[length] = (short) (i12 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i11) {
        return ((long) i11) >= 256 ? i11 ^ 285 : i11;
    }

    private long packIntoLong(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        return (((((((((long) i12) << 48) ^ (((long) i11) << 56)) ^ (((long) i13) << 40)) ^ (((long) i14) << 32)) ^ (((long) i15) << 24)) ^ (((long) i16) << 16)) ^ (((long) i17) << 8)) ^ ((long) i18);
    }

    private void processFilledBuffer(byte[] bArr, int i11) {
        for (int i12 = 0; i12 < this._state.length; i12++) {
            this._block[i12] = bytesToLongFromBuffer(this._buffer, i12 * 8);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.spongycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.spongycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        finish();
        for (int i12 = 0; i12 < 8; i12++) {
            convertLongToByteArray(this._hash[i12], bArr, (i12 * 8) + i11);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.spongycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.spongycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.spongycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    protected void processBlock() {
        char c11;
        char c12;
        for (int i11 = 0; i11 < 8; i11++) {
            long[] jArr = this._state;
            long j11 = this._block[i11];
            long[] jArr2 = this._K;
            long j12 = this._hash[i11];
            jArr2[i11] = j12;
            jArr[i11] = j11 ^ j12;
        }
        for (int i12 = 1; i12 <= 10; i12++) {
            int i13 = 0;
            while (true) {
                c11 = ' ';
                c12 = CoreConstants.LEFT_PARENTHESIS_CHAR;
                if (i13 >= 8) {
                    break;
                }
                long[] jArr3 = this._L;
                jArr3[i13] = 0;
                long[] jArr4 = C0;
                long[] jArr5 = this._K;
                long j13 = jArr4[((int) (jArr5[i13 & 7] >>> 56)) & 255];
                jArr3[i13] = j13;
                long j14 = C1[((int) (jArr5[(i13 - 1) & 7] >>> 48)) & 255] ^ j13;
                jArr3[i13] = j14;
                long j15 = j14 ^ C2[((int) (jArr5[(i13 - 2) & 7] >>> 40)) & 255];
                jArr3[i13] = j15;
                long j16 = j15 ^ C3[((int) (jArr5[(i13 - 3) & 7] >>> 32)) & 255];
                jArr3[i13] = j16;
                long j17 = j16 ^ C4[((int) (jArr5[(i13 - 4) & 7] >>> 24)) & 255];
                jArr3[i13] = j17;
                long j18 = j17 ^ C5[((int) (jArr5[(i13 - 5) & 7] >>> 16)) & 255];
                jArr3[i13] = j18;
                long j19 = j18 ^ C6[((int) (jArr5[(i13 - 6) & 7] >>> 8)) & 255];
                jArr3[i13] = j19;
                jArr3[i13] = j19 ^ C7[((int) jArr5[(i13 - 7) & 7]) & 255];
                i13++;
            }
            long[] jArr6 = this._L;
            long[] jArr7 = this._K;
            System.arraycopy(jArr6, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i12];
            int i14 = 0;
            while (i14 < 8) {
                long[] jArr9 = this._L;
                long j21 = this._K[i14];
                jArr9[i14] = j21;
                long[] jArr10 = C0;
                long[] jArr11 = this._state;
                char c13 = c11;
                char c14 = c12;
                long j22 = j21 ^ jArr10[((int) (jArr11[i14 & 7] >>> 56)) & 255];
                jArr9[i14] = j22;
                long j23 = j22 ^ C1[((int) (jArr11[(i14 - 1) & 7] >>> 48)) & 255];
                jArr9[i14] = j23;
                long j24 = j23 ^ C2[((int) (jArr11[(i14 - 2) & 7] >>> c14)) & 255];
                jArr9[i14] = j24;
                long j25 = j24 ^ C3[((int) (jArr11[(i14 - 3) & 7] >>> c13)) & 255];
                jArr9[i14] = j25;
                long j26 = j25 ^ C4[((int) (jArr11[(i14 - 4) & 7] >>> 24)) & 255];
                jArr9[i14] = j26;
                long j27 = j26 ^ C5[((int) (jArr11[(i14 - 5) & 7] >>> 16)) & 255];
                jArr9[i14] = j27;
                long j28 = j27 ^ C6[((int) (jArr11[(i14 - 6) & 7] >>> 8)) & 255];
                jArr9[i14] = j28;
                jArr9[i14] = j28 ^ C7[((int) jArr11[(i14 - 7) & 7]) & 255];
                i14++;
                c12 = c14;
                c11 = c13;
            }
            long[] jArr12 = this._L;
            long[] jArr13 = this._state;
            System.arraycopy(jArr12, 0, jArr13, 0, jArr13.length);
        }
        for (int i15 = 0; i15 < 8; i15++) {
            long[] jArr14 = this._hash;
            jArr14[i15] = jArr14[i15] ^ (this._state[i15] ^ this._block[i15]);
        }
    }

    @Override // org.spongycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte b11) {
        byte[] bArr = this._buffer;
        int i11 = this._bufferPos;
        bArr[i11] = b11;
        int i12 = i11 + 1;
        this._bufferPos = i12;
        if (i12 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    @Override // org.spongycastle.crypto.Digest
    public void update(byte[] bArr, int i11, int i12) {
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }

    @Override // org.spongycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        reset(whirlpoolDigest);
    }
}
