package org.bouncycastle.crypto.macs;

import okhttp3.internal.http2.Http2Connection;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f98722h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f98723h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private int f98724h2;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f98725h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private int f98726h4;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f98727k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private int f98728k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private int f98729k2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f98730k3;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f98731r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f98732r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private int f98733r2;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f98734r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private int f98735r4;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f98736s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    private int f98737s2;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f98738s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private int f98739s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i11, int i12) {
        return (((long) i11) & 4294967295L) * ((long) i12);
    }

    private void processBlock() {
        int i11 = this.currentBlockOffset;
        if (i11 < 16) {
            this.currentBlock[i11] = 1;
            for (int i12 = i11 + 1; i12 < 16; i12++) {
                this.currentBlock[i12] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j11 = jLittleEndianToInt & 4294967295L;
        long jLittleEndianToInt2 = ((long) Pack.littleEndianToInt(this.currentBlock, 4)) & 4294967295L;
        long jLittleEndianToInt3 = ((long) Pack.littleEndianToInt(this.currentBlock, 8)) & 4294967295L;
        long jLittleEndianToInt4 = 4294967295L & ((long) Pack.littleEndianToInt(this.currentBlock, 12));
        int i13 = (int) (((long) this.f98722h0) + (jLittleEndianToInt & 67108863));
        this.f98722h0 = i13;
        this.f98723h1 = (int) (((long) this.f98723h1) + ((((jLittleEndianToInt2 << 32) | j11) >>> 26) & 67108863));
        this.f98724h2 = (int) (((long) this.f98724h2) + (((jLittleEndianToInt2 | (jLittleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f98725h3 = (int) (((long) this.f98725h3) + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i14 = (int) (((long) this.f98726h4) + (jLittleEndianToInt4 >>> 8));
        this.f98726h4 = i14;
        if (this.currentBlockOffset == 16) {
            this.f98726h4 = i14 + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        long jMul32x32_64 = mul32x32_64(i13, this.f98731r0) + mul32x32_64(this.f98723h1, this.f98739s4) + mul32x32_64(this.f98724h2, this.f98738s3) + mul32x32_64(this.f98725h3, this.f98737s2) + mul32x32_64(this.f98726h4, this.f98736s1);
        long jMul32x32_65 = mul32x32_64(this.f98722h0, this.f98732r1) + mul32x32_64(this.f98723h1, this.f98731r0) + mul32x32_64(this.f98724h2, this.f98739s4) + mul32x32_64(this.f98725h3, this.f98738s3) + mul32x32_64(this.f98726h4, this.f98737s2);
        long jMul32x32_66 = mul32x32_64(this.f98722h0, this.f98733r2) + mul32x32_64(this.f98723h1, this.f98732r1) + mul32x32_64(this.f98724h2, this.f98731r0) + mul32x32_64(this.f98725h3, this.f98739s4) + mul32x32_64(this.f98726h4, this.f98738s3);
        long jMul32x32_67 = mul32x32_64(this.f98722h0, this.f98734r3) + mul32x32_64(this.f98723h1, this.f98733r2) + mul32x32_64(this.f98724h2, this.f98732r1) + mul32x32_64(this.f98725h3, this.f98731r0) + mul32x32_64(this.f98726h4, this.f98739s4);
        long jMul32x32_68 = mul32x32_64(this.f98722h0, this.f98735r4) + mul32x32_64(this.f98723h1, this.f98734r3) + mul32x32_64(this.f98724h2, this.f98733r2) + mul32x32_64(this.f98725h3, this.f98732r1) + mul32x32_64(this.f98726h4, this.f98731r0);
        long j12 = jMul32x32_65 + (jMul32x32_64 >>> 26);
        long j13 = jMul32x32_66 + (j12 >>> 26);
        this.f98724h2 = ((int) j13) & 67108863;
        long j14 = jMul32x32_67 + (j13 >>> 26);
        this.f98725h3 = ((int) j14) & 67108863;
        long j15 = jMul32x32_68 + (j14 >>> 26);
        this.f98726h4 = ((int) j15) & 67108863;
        int i15 = (((int) jMul32x32_64) & 67108863) + (((int) (j15 >>> 26)) * 5);
        this.f98723h1 = (((int) j12) & 67108863) + (i15 >>> 26);
        this.f98722h0 = i15 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i11 = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f98731r0 = 67108863 & iLittleEndianToInt;
        int i12 = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.f98732r1 = i12;
        int i13 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.f98733r2 = i13;
        int i14 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.f98734r3 = i14;
        int i15 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.f98735r4 = i15;
        this.f98736s1 = i12 * 5;
        this.f98737s2 = i13 * 5;
        this.f98738s3 = i14 * 5;
        this.f98739s4 = i15 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i11 = 0;
            bArr = bArr3;
        }
        this.f98727k0 = Pack.littleEndianToInt(bArr, i11);
        this.f98728k1 = Pack.littleEndianToInt(bArr, i11 + 4);
        this.f98729k2 = Pack.littleEndianToInt(bArr, i11 + 8);
        this.f98730k3 = Pack.littleEndianToInt(bArr, i11 + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        if (i11 + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i12 = this.f98723h1;
        int i13 = this.f98722h0;
        int i14 = i12 + (i13 >>> 26);
        int i15 = this.f98724h2 + (i14 >>> 26);
        int i16 = this.f98725h3 + (i15 >>> 26);
        int i17 = i15 & 67108863;
        int i18 = this.f98726h4 + (i16 >>> 26);
        int i19 = i16 & 67108863;
        int i21 = (i13 & 67108863) + ((i18 >>> 26) * 5);
        int i22 = i18 & 67108863;
        int i23 = (i14 & 67108863) + (i21 >>> 26);
        int i24 = i21 & 67108863;
        int i25 = i24 + 5;
        int i26 = (i25 >>> 26) + i23;
        int i27 = (i26 >>> 26) + i17;
        int i28 = (i27 >>> 26) + i19;
        int i29 = 67108863 & i28;
        int i31 = ((i28 >>> 26) + i22) - 67108864;
        int i32 = (i31 >>> 31) - 1;
        int i33 = ~i32;
        int i34 = (i24 & i33) | (i25 & 67108863 & i32);
        this.f98722h0 = i34;
        int i35 = (i23 & i33) | (i26 & 67108863 & i32);
        this.f98723h1 = i35;
        int i36 = (i17 & i33) | (i27 & 67108863 & i32);
        this.f98724h2 = i36;
        int i37 = (i29 & i32) | (i19 & i33);
        this.f98725h3 = i37;
        int i38 = (i22 & i33) | (i31 & i32);
        this.f98726h4 = i38;
        long j11 = (((long) (i34 | (i35 << 26))) & 4294967295L) + (((long) this.f98727k0) & 4294967295L);
        long j12 = (((long) ((i35 >>> 6) | (i36 << 20))) & 4294967295L) + (((long) this.f98728k1) & 4294967295L);
        long j13 = (((long) ((i36 >>> 12) | (i37 << 14))) & 4294967295L) + (((long) this.f98729k2) & 4294967295L);
        long j14 = (((long) ((i37 >>> 18) | (i38 << 8))) & 4294967295L) + (4294967295L & ((long) this.f98730k3));
        Pack.intToLittleEndian((int) j11, bArr, i11);
        long j15 = j12 + (j11 >>> 32);
        Pack.intToLittleEndian((int) j15, bArr, i11 + 4);
        long j16 = j13 + (j15 >>> 32);
        Pack.intToLittleEndian((int) j16, bArr, i11 + 8);
        Pack.intToLittleEndian((int) (j14 + (j16 >>> 32)), bArr, i11 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        byte[] iv2;
        if (this.cipher == null) {
            iv2 = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv2 = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), iv2);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f98726h4 = 0;
        this.f98725h3 = 0;
        this.f98724h2 = 0;
        this.f98723h1 = 0;
        this.f98722h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b11) {
        byte[] bArr = this.singleByte;
        bArr[0] = b11;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i12 > i13) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i12 - i13, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i13 + i11, this.currentBlock, this.currentBlockOffset, iMin);
            i13 += iMin;
            this.currentBlockOffset += iMin;
        }
    }
}
