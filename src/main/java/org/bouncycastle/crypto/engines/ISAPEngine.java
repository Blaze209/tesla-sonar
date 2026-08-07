package org.bouncycastle.crypto.engines;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class ISAPEngine implements AEADCipher {
    private ISAP_AEAD ISAPAEAD;
    private int ISAP_rH;
    private int ISAP_rH_SZ;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private byte[] f98679ad;
    private String algorithmName;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f98680c;
    private boolean forEncryption;
    private boolean initialised;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f98681k;
    private byte[] mac;
    private byte[] npub;
    final int CRYPTO_KEYBYTES = 16;
    final int CRYPTO_NPUBBYTES = 16;
    final int ISAP_STATE_SZ = 40;
    private ByteArrayOutputStream aadData = new ByteArrayOutputStream();
    private final ByteArrayOutputStream message = new ByteArrayOutputStream();
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: org.bouncycastle.crypto.engines.ISAPEngine$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType;

        static {
            int[] iArr = new int[IsapType.values().length];
            $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType = iArr;
            try {
                iArr[IsapType.ISAP_A_128A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_K_128A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_A_128.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[IsapType.ISAP_K_128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public abstract class ISAPAEAD_A implements ISAP_AEAD {
        protected long ISAP_IV1_64;
        protected long ISAP_IV2_64;
        protected long ISAP_IV3_64;
        protected long[] k64;
        protected long[] npub64;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        protected long f98682t0;

        /* JADX INFO: renamed from: t1, reason: collision with root package name */
        protected long f98683t1;

        /* JADX INFO: renamed from: t2, reason: collision with root package name */
        protected long f98684t2;

        /* JADX INFO: renamed from: t3, reason: collision with root package name */
        protected long f98685t3;

        /* JADX INFO: renamed from: t4, reason: collision with root package name */
        protected long f98686t4;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        protected long f98687x0;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        protected long f98688x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        protected long f98689x2;

        /* JADX INFO: renamed from: x3, reason: collision with root package name */
        protected long f98690x3;

        /* JADX INFO: renamed from: x4, reason: collision with root package name */
        protected long f98691x4;

        public ISAPAEAD_A() {
            ISAPEngine.this.ISAP_rH = 64;
            ISAPEngine.this.ISAP_rH_SZ = (ISAPEngine.this.ISAP_rH + 7) >> 3;
        }

        private long ROTR(long j11, long j12) {
            return (j11 << ((int) (64 - j12))) | (j11 >>> ((int) j12));
        }

        private int getLongSize(int i11) {
            return (i11 >>> 3) + ((i11 & 7) != 0 ? 1 : 0);
        }

        protected void ABSORB_MAC(byte[] bArr, int i11) {
            int length = bArr.length >> 3;
            long[] jArr = new long[length];
            Pack.littleEndianToLong(bArr, 0, jArr, 0, length);
            int i12 = 0;
            while (i11 >= ISAPEngine.this.ISAP_rH_SZ) {
                this.f98687x0 ^= U64BIG(jArr[i12]);
                P12();
                i11 -= ISAPEngine.this.ISAP_rH_SZ;
                i12++;
            }
            for (int i13 = 0; i13 < i11; i13++) {
                this.f98687x0 ^= (((long) bArr[(i12 << 3) + i13]) & 255) << ((7 - i13) << 3);
            }
            this.f98687x0 = (128 << ((7 - i11) << 3)) ^ this.f98687x0;
            P12();
        }

        public void P12() {
            ROUND(240L);
            ROUND(225L);
            ROUND(210L);
            ROUND(195L);
            ROUND(180L);
            ROUND(165L);
            P6();
        }

        protected void P6() {
            ROUND(150L);
            ROUND(135L);
            ROUND(120L);
            ROUND(105L);
            ROUND(90L);
            ROUND(75L);
        }

        protected abstract void PX1();

        protected abstract void PX2();

        protected void ROUND(long j11) {
            long j12 = this.f98687x0;
            long j13 = this.f98688x1;
            long j14 = this.f98689x2;
            long j15 = this.f98690x3;
            long j16 = this.f98691x4;
            long j17 = ((((j12 ^ j13) ^ j14) ^ j15) ^ j11) ^ ((((j12 ^ j14) ^ j16) ^ j11) & j13);
            this.f98682t0 = j17;
            this.f98683t1 = ((((j12 ^ j14) ^ j15) ^ j16) ^ j11) ^ (((j13 ^ j14) ^ j11) & (j13 ^ j15));
            this.f98684t2 = (((j13 ^ j14) ^ j16) ^ j11) ^ (j15 & j16);
            this.f98685t3 = ((j14 ^ (j12 ^ j13)) ^ j11) ^ ((~j12) & (j15 ^ j16));
            this.f98686t4 = ((j12 ^ j16) & j13) ^ ((j13 ^ j15) ^ j16);
            this.f98687x0 = (ROTR(j17, 19L) ^ j17) ^ ROTR(this.f98682t0, 28L);
            long j18 = this.f98683t1;
            this.f98688x1 = (j18 ^ ROTR(j18, 39L)) ^ ROTR(this.f98683t1, 61L);
            long j19 = this.f98684t2;
            this.f98689x2 = ~((j19 ^ ROTR(j19, 1L)) ^ ROTR(this.f98684t2, 6L));
            long j21 = this.f98685t3;
            this.f98690x3 = (j21 ^ ROTR(j21, 10L)) ^ ROTR(this.f98685t3, 17L);
            long j22 = this.f98686t4;
            this.f98691x4 = (j22 ^ ROTR(j22, 7L)) ^ ROTR(this.f98686t4, 41L);
        }

        protected long U64BIG(long j11) {
            return (ROTR(j11, 56L) & 1095216660735L) | (ROTR(j11, 8L) & (-72057589759737856L)) | (ROTR(j11, 24L) & 71776119077928960L) | (ROTR(j11, 40L) & 280375465148160L);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.npub64 = new long[getLongSize(ISAPEngine.this.npub.length)];
            byte[] bArr = ISAPEngine.this.npub;
            long[] jArr = this.npub64;
            Pack.littleEndianToLong(bArr, 0, jArr, 0, jArr.length);
            long[] jArr2 = this.npub64;
            jArr2[0] = U64BIG(jArr2[0]);
            long[] jArr3 = this.npub64;
            jArr3[1] = U64BIG(jArr3[1]);
            this.k64 = new long[getLongSize(ISAPEngine.this.f98681k.length)];
            byte[] bArr2 = ISAPEngine.this.f98681k;
            long[] jArr4 = this.k64;
            Pack.littleEndianToLong(bArr2, 0, jArr4, 0, jArr4.length);
            long[] jArr5 = this.k64;
            jArr5[0] = U64BIG(jArr5[0]);
            long[] jArr6 = this.k64;
            jArr6[1] = U64BIG(jArr6[1]);
            reset();
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void isap_enc(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
            int i15 = i12 >> 3;
            long[] jArr = new long[i15];
            Pack.littleEndianToLong(bArr, i11, jArr, 0, i15);
            long[] jArr2 = new long[i15];
            int i16 = 0;
            while (i12 >= ISAPEngine.this.ISAP_rH_SZ) {
                jArr2[i16] = U64BIG(this.f98687x0) ^ jArr[i16];
                PX1();
                i16++;
                i12 -= ISAPEngine.this.ISAP_rH_SZ;
            }
            Pack.longToLittleEndian(jArr2, 0, i15, bArr2, i13);
            byte[] bArrLongToLittleEndian = Pack.longToLittleEndian(this.f98687x0);
            while (i12 > 0) {
                int i17 = i16 << 3;
                int i18 = ((i17 + i13) + i12) - 1;
                byte b11 = bArrLongToLittleEndian[ISAPEngine.this.ISAP_rH_SZ - i12];
                i12--;
                bArr2[i18] = (byte) (bArr[(i17 + i11) + i12] ^ b11);
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void isap_mac(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
            long[] jArr = this.npub64;
            this.f98687x0 = jArr[0];
            this.f98688x1 = jArr[1];
            this.f98689x2 = this.ISAP_IV1_64;
            this.f98691x4 = 0L;
            this.f98690x3 = 0L;
            P12();
            ABSORB_MAC(bArr, i11);
            this.f98691x4 ^= 1;
            ABSORB_MAC(bArr2, i12);
            Pack.longToLittleEndian(U64BIG(this.f98687x0), bArr3, 0);
            Pack.longToLittleEndian(U64BIG(this.f98688x1), bArr3, 8);
            long j11 = this.f98689x2;
            long j12 = this.f98690x3;
            long j13 = this.f98691x4;
            isap_rk(this.ISAP_IV2_64, bArr3, 16);
            this.f98689x2 = j11;
            this.f98690x3 = j12;
            this.f98691x4 = j13;
            P12();
            Pack.longToLittleEndian(U64BIG(this.f98687x0), bArr3, i13);
            Pack.longToLittleEndian(U64BIG(this.f98688x1), bArr3, i13 + 8);
        }

        public void isap_rk(long j11, byte[] bArr, int i11) {
            long[] jArr = this.k64;
            this.f98687x0 = jArr[0];
            this.f98688x1 = jArr[1];
            this.f98689x2 = j11;
            this.f98691x4 = 0L;
            this.f98690x3 = 0L;
            P12();
            for (int i12 = 0; i12 < (i11 << 3) - 1; i12++) {
                this.f98687x0 ^= (((long) (((bArr[i12 >>> 3] >>> (7 - (i12 & 7))) & 1) << 7)) & 255) << 56;
                PX2();
            }
            this.f98687x0 ^= (((long) bArr[i11 - 1]) & 1) << 63;
            P12();
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            isap_rk(this.ISAP_IV3_64, ISAPEngine.this.npub, 16);
            long[] jArr = this.npub64;
            this.f98690x3 = jArr[0];
            this.f98691x4 = jArr[1];
            PX1();
        }
    }

    private class ISAPAEAD_A_128 extends ISAPAEAD_A {
        public ISAPAEAD_A_128() {
            super();
            this.ISAP_IV1_64 = 108156764298152972L;
            this.ISAP_IV2_64 = 180214358336080908L;
            this.ISAP_IV3_64 = 252271952374008844L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX1() {
            P12();
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX2() {
            P12();
        }
    }

    private class ISAPAEAD_A_128A extends ISAPAEAD_A {
        public ISAPAEAD_A_128A() {
            super();
            this.ISAP_IV1_64 = 108156764297430540L;
            this.ISAP_IV2_64 = 180214358335358476L;
            this.ISAP_IV3_64 = 252271952373286412L;
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX1() {
            P6();
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_A
        protected void PX2() {
            ROUND(75L);
        }
    }

    private abstract class ISAPAEAD_K implements ISAP_AEAD {
        protected short[] ISAP_IV1_16;
        protected short[] ISAP_IV2_16;
        protected short[] ISAP_IV3_16;
        protected short[] iv16;
        protected short[] k16;
        final int ISAP_STATE_SZ_CRYPTO_NPUBBYTES = 24;
        private final int[] KeccakF400RoundConstants = {1, 32898, 32906, 32768, 32907, 1, 32897, 32777, 138, 136, 32777, 10, 32907, 139, 32905, 32771, 32770, 128, 32778, 10};
        protected short[] SX = new short[25];
        protected short[] E = new short[25];
        protected short[] C = new short[5];

        public ISAPAEAD_K() {
            ISAPEngine.this.ISAP_rH = 144;
            ISAPEngine.this.ISAP_rH_SZ = (ISAPEngine.this.ISAP_rH + 7) >> 3;
        }

        private short ROL16(short s11, int i11) {
            int i12 = s11 & 65535;
            return (short) ((i12 >>> (16 - i11)) ^ (i12 << i11));
        }

        private void byteToShort(byte[] bArr, short[] sArr, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                sArr[i12] = Pack.littleEndianToShort(bArr, i12 << 1);
            }
        }

        private void byteToShortXor(byte[] bArr, short[] sArr, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                sArr[i12] = (short) (sArr[i12] ^ Pack.littleEndianToShort(bArr, i12 << 1));
            }
        }

        private void shortToByte(short[] sArr, byte[] bArr, int i11) {
            for (int i12 = 0; i12 < 8; i12++) {
                Pack.shortToLittleEndian(sArr[i12], bArr, (i12 << 1) + i11);
            }
        }

        protected void ABSORB_MAC(short[] sArr, byte[] bArr, int i11, short[] sArr2, short[] sArr3) {
            int i12 = 0;
            int i13 = 0;
            while (i11 > ISAPEngine.this.ISAP_rH_SZ) {
                byteToShortXor(bArr, sArr, ISAPEngine.this.ISAP_rH_SZ >> 1);
                i13 += ISAPEngine.this.ISAP_rH_SZ;
                i11 -= ISAPEngine.this.ISAP_rH_SZ;
                PermuteRoundsHX(sArr, sArr2, sArr3);
            }
            if (i11 == ISAPEngine.this.ISAP_rH_SZ) {
                byteToShortXor(bArr, sArr, ISAPEngine.this.ISAP_rH_SZ >> 1);
                PermuteRoundsHX(sArr, sArr2, sArr3);
                sArr[0] = (short) (sArr[0] ^ 128);
            } else {
                while (i12 < i11) {
                    int i14 = i12 >> 1;
                    sArr[i14] = (short) (((bArr[i13] & 255) << ((i12 & 1) << 3)) ^ sArr[i14]);
                    i12++;
                    i13++;
                }
                int i15 = i11 >> 1;
                sArr[i15] = (short) ((128 << ((i11 & 1) << 3)) ^ sArr[i15]);
            }
            PermuteRoundsHX(sArr, sArr2, sArr3);
        }

        protected abstract void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3);

        protected abstract void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3);

        protected abstract void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3);

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void init() {
            this.k16 = new short[ISAPEngine.this.f98681k.length >> 1];
            byte[] bArr = ISAPEngine.this.f98681k;
            short[] sArr = this.k16;
            byteToShort(bArr, sArr, sArr.length);
            this.iv16 = new short[ISAPEngine.this.npub.length >> 1];
            byte[] bArr2 = ISAPEngine.this.npub;
            short[] sArr2 = this.iv16;
            byteToShort(bArr2, sArr2, sArr2.length);
            reset();
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void isap_enc(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14) {
            int i15;
            while (true) {
                i15 = 0;
                if (i12 < ISAPEngine.this.ISAP_rH_SZ) {
                    break;
                }
                while (i15 < ISAPEngine.this.ISAP_rH_SZ) {
                    bArr2[i13] = (byte) (bArr[i11] ^ (this.SX[i15 >> 1] >>> ((i15 & 1) << 3)));
                    i15++;
                    i13++;
                    i11++;
                }
                i12 -= ISAPEngine.this.ISAP_rH_SZ;
                PermuteRoundsKX(this.SX, this.E, this.C);
            }
            while (i15 < i12) {
                bArr2[i13] = (byte) (bArr[i11] ^ (this.SX[i15 >> 1] >>> ((i15 & 1) << 3)));
                i15++;
                i13++;
                i11++;
            }
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void isap_mac(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
            short[] sArr = new short[25];
            this.SX = sArr;
            System.arraycopy(this.iv16, 0, sArr, 0, 8);
            System.arraycopy(this.ISAP_IV1_16, 0, this.SX, 8, 4);
            PermuteRoundsHX(this.SX, this.E, this.C);
            ABSORB_MAC(this.SX, bArr, i11, this.E, this.C);
            short[] sArr2 = this.SX;
            sArr2[24] = (short) (sArr2[24] ^ 256);
            ABSORB_MAC(sArr2, bArr2, i12, this.E, this.C);
            shortToByte(this.SX, bArr3, i13);
            isap_rk(this.ISAP_IV2_16, bArr3, 16, this.SX, 16, this.C);
            PermuteRoundsHX(this.SX, this.E, this.C);
            shortToByte(this.SX, bArr3, i13);
        }

        public void isap_rk(short[] sArr, byte[] bArr, int i11, short[] sArr2, int i12, short[] sArr3) {
            short[] sArr4 = new short[25];
            short[] sArr5 = new short[25];
            System.arraycopy(this.k16, 0, sArr4, 0, 8);
            System.arraycopy(sArr, 0, sArr4, 8, 4);
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            for (int i13 = 0; i13 < (i11 << 3) - 1; i13++) {
                sArr4[0] = (short) (sArr4[0] ^ (((bArr[i13 >> 3] >>> (7 - (i13 & 7))) & 1) << 7));
                PermuteRoundsBX(sArr4, sArr5, sArr3);
            }
            sArr4[0] = (short) (sArr4[0] ^ ((bArr[i11 - 1] & 1) << 7));
            PermuteRoundsKX(sArr4, sArr5, sArr3);
            System.arraycopy(sArr4, 0, sArr2, 0, i12 == 24 ? 17 : 8);
        }

        protected void prepareThetaX(short[] sArr, short[] sArr2) {
            sArr2[0] = (short) ((((sArr[0] ^ sArr[5]) ^ sArr[10]) ^ sArr[15]) ^ sArr[20]);
            sArr2[1] = (short) ((((sArr[1] ^ sArr[6]) ^ sArr[11]) ^ sArr[16]) ^ sArr[21]);
            sArr2[2] = (short) ((((sArr[2] ^ sArr[7]) ^ sArr[12]) ^ sArr[17]) ^ sArr[22]);
            sArr2[3] = (short) ((((sArr[3] ^ sArr[8]) ^ sArr[13]) ^ sArr[18]) ^ sArr[23]);
            sArr2[4] = (short) (sArr[24] ^ (((sArr[4] ^ sArr[9]) ^ sArr[14]) ^ sArr[19]));
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAP_AEAD
        public void reset() {
            this.SX = new short[25];
            this.E = new short[25];
            this.C = new short[5];
            isap_rk(this.ISAP_IV3_16, ISAPEngine.this.npub, 16, this.SX, 24, this.C);
            System.arraycopy(this.iv16, 0, this.SX, 17, 8);
            PermuteRoundsKX(this.SX, this.E, this.C);
        }

        protected void rounds12X(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        protected void rounds_12_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(12, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(13, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(14, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(15, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(16, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(17, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(18, sArr, sArr2, sArr3);
            thetaRhoPiChiIota(sArr2, sArr, sArr3);
        }

        protected void rounds_4_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(4, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(5, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(6, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(7, sArr2, sArr, sArr3);
            rounds_8_18(sArr, sArr2, sArr3);
        }

        protected void rounds_8_18(short[] sArr, short[] sArr2, short[] sArr3) {
            thetaRhoPiChiIotaPrepareTheta(8, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(9, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(10, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(11, sArr2, sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }

        protected void thetaRhoPiChiIota(short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL17 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL18 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL19 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL110 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s11 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s11;
            short s12 = (short) (sArr[6] ^ sROL17);
            sArr[6] = s12;
            short sROL111 = ROL16(s12, 12);
            short s13 = (short) (sArr[12] ^ sROL18);
            sArr[12] = s13;
            short sROL112 = ROL16(s13, 11);
            short s14 = (short) (sArr[18] ^ sROL19);
            sArr[18] = s14;
            short sROL113 = ROL16(s14, 5);
            short s15 = (short) (sArr[24] ^ sROL110);
            sArr[24] = s15;
            short sROL114 = ROL16(s15, 14);
            sArr2[0] = (short) (this.KeccakF400RoundConstants[19] ^ (((~sROL111) & sROL112) ^ s11));
            sArr2[1] = (short) (((~sROL112) & sROL113) ^ sROL111);
            sArr2[2] = (short) (((~sROL113) & sROL114) ^ sROL112);
            sArr2[3] = (short) (((~sROL114) & s11) ^ sROL113);
            sArr2[4] = (short) (((~s11) & sROL111) ^ sROL114);
            short s16 = (short) (sArr[3] ^ sROL19);
            sArr[3] = s16;
            short sROL115 = ROL16(s16, 12);
            short s17 = (short) (sArr[9] ^ sROL110);
            sArr[9] = s17;
            short sROL116 = ROL16(s17, 4);
            short s18 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s18;
            short sROL117 = ROL16(s18, 3);
            short s19 = (short) (sArr[16] ^ sROL17);
            sArr[16] = s19;
            short sROL118 = ROL16(s19, 13);
            short s21 = (short) (sArr[22] ^ sROL18);
            sArr[22] = s21;
            short sROL119 = ROL16(s21, 13);
            sArr2[5] = (short) (((~sROL116) & sROL117) ^ sROL115);
            sArr2[6] = (short) (((~sROL117) & sROL118) ^ sROL116);
            sArr2[7] = (short) (sROL117 ^ ((~sROL118) & sROL119));
            sArr2[8] = (short) (((~sROL119) & sROL115) ^ sROL118);
            sArr2[9] = (short) (((~sROL115) & sROL116) ^ sROL119);
            short s22 = (short) (sArr[1] ^ sROL17);
            sArr[1] = s22;
            short sROL120 = ROL16(s22, 1);
            short s23 = (short) (sArr[7] ^ sROL18);
            sArr[7] = s23;
            short sROL121 = ROL16(s23, 6);
            short s24 = (short) (sArr[13] ^ sROL19);
            sArr[13] = s24;
            short sROL122 = ROL16(s24, 9);
            short s25 = (short) (sArr[19] ^ sROL110);
            sArr[19] = s25;
            short sROL123 = ROL16(s25, 8);
            short s26 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s26;
            short sROL124 = ROL16(s26, 2);
            sArr2[10] = (short) (((~sROL121) & sROL122) ^ sROL120);
            sArr2[11] = (short) (((~sROL122) & sROL123) ^ sROL121);
            sArr2[12] = (short) (((~sROL123) & sROL124) ^ sROL122);
            sArr2[13] = (short) (((~sROL124) & sROL120) ^ sROL123);
            sArr2[14] = (short) (((~sROL120) & sROL121) ^ sROL124);
            short s27 = (short) (sArr[4] ^ sROL110);
            sArr[4] = s27;
            short sROL125 = ROL16(s27, 11);
            short s28 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s28;
            short sROL126 = ROL16(s28, 4);
            short s29 = (short) (sArr[11] ^ sROL17);
            sArr[11] = s29;
            short sROL127 = ROL16(s29, 10);
            short s31 = (short) (sArr[17] ^ sROL18);
            sArr[17] = s31;
            short sROL128 = ROL16(s31, 15);
            short s32 = (short) (sArr[23] ^ sROL19);
            sArr[23] = s32;
            short sROL129 = ROL16(s32, 8);
            sArr2[15] = (short) (((~sROL126) & sROL127) ^ sROL125);
            sArr2[16] = (short) (((~sROL127) & sROL128) ^ sROL126);
            sArr2[17] = (short) (sROL127 ^ ((~sROL128) & sROL129));
            sArr2[18] = (short) (((~sROL129) & sROL125) ^ sROL128);
            sArr2[19] = (short) ((sROL126 & (~sROL125)) ^ sROL129);
            short s33 = (short) (sArr[2] ^ sROL18);
            sArr[2] = s33;
            short sROL130 = ROL16(s33, 14);
            short s34 = (short) (sArr[8] ^ sROL19);
            sArr[8] = s34;
            short sROL131 = ROL16(s34, 7);
            short s35 = (short) (sArr[14] ^ sROL110);
            sArr[14] = s35;
            short sROL132 = ROL16(s35, 7);
            short s36 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s36;
            short sROL133 = ROL16(s36, 9);
            short s37 = (short) (sROL17 ^ sArr[21]);
            sArr[21] = s37;
            short sROL134 = ROL16(s37, 2);
            sArr2[20] = (short) (((~sROL131) & sROL132) ^ sROL130);
            sArr2[21] = (short) (((~sROL132) & sROL133) ^ sROL131);
            sArr2[22] = (short) (sROL132 ^ ((~sROL133) & sROL134));
            sArr2[23] = (short) (sROL133 ^ ((~sROL134) & sROL130));
            sArr2[24] = (short) (((~sROL130) & sROL131) ^ sROL134);
        }

        protected void thetaRhoPiChiIotaPrepareTheta(int i11, short[] sArr, short[] sArr2, short[] sArr3) {
            short sROL16 = (short) (sArr3[4] ^ ROL16(sArr3[1], 1));
            short sROL17 = (short) (sArr3[0] ^ ROL16(sArr3[2], 1));
            short sROL18 = (short) (sArr3[1] ^ ROL16(sArr3[3], 1));
            short sROL19 = (short) (sArr3[2] ^ ROL16(sArr3[4], 1));
            short sROL110 = (short) (sArr3[3] ^ ROL16(sArr3[0], 1));
            short s11 = (short) (sArr[0] ^ sROL16);
            sArr[0] = s11;
            short s12 = (short) (sArr[6] ^ sROL17);
            sArr[6] = s12;
            short sROL111 = ROL16(s12, 12);
            short s13 = (short) (sArr[12] ^ sROL18);
            sArr[12] = s13;
            short sROL112 = ROL16(s13, 11);
            short s14 = (short) (sArr[18] ^ sROL19);
            sArr[18] = s14;
            short sROL113 = ROL16(s14, 5);
            short s15 = (short) (sArr[24] ^ sROL110);
            sArr[24] = s15;
            short sROL114 = ROL16(s15, 14);
            short s16 = (short) (this.KeccakF400RoundConstants[i11] ^ (((~sROL111) & sROL112) ^ s11));
            sArr2[0] = s16;
            sArr3[0] = s16;
            short s17 = (short) (((~sROL112) & sROL113) ^ sROL111);
            sArr2[1] = s17;
            sArr3[1] = s17;
            short s18 = (short) (((~sROL113) & sROL114) ^ sROL112);
            sArr2[2] = s18;
            sArr3[2] = s18;
            short s19 = (short) (((~sROL114) & s11) ^ sROL113);
            sArr2[3] = s19;
            sArr3[3] = s19;
            short s21 = (short) (((~s11) & sROL111) ^ sROL114);
            sArr2[4] = s21;
            sArr3[4] = s21;
            short s22 = (short) (sArr[3] ^ sROL19);
            sArr[3] = s22;
            short sROL115 = ROL16(s22, 12);
            short s23 = (short) (sArr[9] ^ sROL110);
            sArr[9] = s23;
            short sROL116 = ROL16(s23, 4);
            short s24 = (short) (sArr[10] ^ sROL16);
            sArr[10] = s24;
            short sROL117 = ROL16(s24, 3);
            short s25 = (short) (sArr[16] ^ sROL17);
            sArr[16] = s25;
            short sROL118 = ROL16(s25, 13);
            short s26 = (short) (sArr[22] ^ sROL18);
            sArr[22] = s26;
            short sROL119 = ROL16(s26, 13);
            short s27 = (short) (((~sROL116) & sROL117) ^ sROL115);
            sArr2[5] = s27;
            sArr3[0] = (short) (sArr3[0] ^ s27);
            short s28 = (short) (((~sROL117) & sROL118) ^ sROL116);
            sArr2[6] = s28;
            sArr3[1] = (short) (sArr3[1] ^ s28);
            short s29 = (short) (((~sROL118) & sROL119) ^ sROL117);
            sArr2[7] = s29;
            sArr3[2] = (short) (sArr3[2] ^ s29);
            short s31 = (short) (((~sROL119) & sROL115) ^ sROL118);
            sArr2[8] = s31;
            sArr3[3] = (short) (sArr3[3] ^ s31);
            short s32 = (short) (((~sROL115) & sROL116) ^ sROL119);
            sArr2[9] = s32;
            sArr3[4] = (short) (s32 ^ sArr3[4]);
            short s33 = (short) (sArr[1] ^ sROL17);
            sArr[1] = s33;
            short sROL120 = ROL16(s33, 1);
            short s34 = (short) (sArr[7] ^ sROL18);
            sArr[7] = s34;
            short sROL121 = ROL16(s34, 6);
            short s35 = (short) (sArr[13] ^ sROL19);
            sArr[13] = s35;
            short sROL122 = ROL16(s35, 9);
            short s36 = (short) (sArr[19] ^ sROL110);
            sArr[19] = s36;
            short sROL123 = ROL16(s36, 8);
            short s37 = (short) (sArr[20] ^ sROL16);
            sArr[20] = s37;
            short sROL124 = ROL16(s37, 2);
            short s38 = (short) (((~sROL121) & sROL122) ^ sROL120);
            sArr2[10] = s38;
            sArr3[0] = (short) (sArr3[0] ^ s38);
            short s39 = (short) (((~sROL122) & sROL123) ^ sROL121);
            sArr2[11] = s39;
            sArr3[1] = (short) (sArr3[1] ^ s39);
            short s41 = (short) (((~sROL123) & sROL124) ^ sROL122);
            sArr2[12] = s41;
            sArr3[2] = (short) (s41 ^ sArr3[2]);
            short s42 = (short) (((~sROL124) & sROL120) ^ sROL123);
            sArr2[13] = s42;
            sArr3[3] = (short) (s42 ^ sArr3[3]);
            short s43 = (short) (((~sROL120) & sROL121) ^ sROL124);
            sArr2[14] = s43;
            sArr3[4] = (short) (s43 ^ sArr3[4]);
            short s44 = (short) (sArr[4] ^ sROL110);
            sArr[4] = s44;
            short sROL125 = ROL16(s44, 11);
            short s45 = (short) (sArr[5] ^ sROL16);
            sArr[5] = s45;
            short sROL126 = ROL16(s45, 4);
            short s46 = (short) (sArr[11] ^ sROL17);
            sArr[11] = s46;
            short sROL127 = ROL16(s46, 10);
            short s47 = (short) (sArr[17] ^ sROL18);
            sArr[17] = s47;
            short sROL128 = ROL16(s47, 15);
            short s48 = (short) (sArr[23] ^ sROL19);
            sArr[23] = s48;
            short sROL129 = ROL16(s48, 8);
            short s49 = (short) (((~sROL126) & sROL127) ^ sROL125);
            sArr2[15] = s49;
            sArr3[0] = (short) (sArr3[0] ^ s49);
            short s51 = (short) (((~sROL127) & sROL128) ^ sROL126);
            sArr2[16] = s51;
            sArr3[1] = (short) (sArr3[1] ^ s51);
            short s52 = (short) (sROL127 ^ ((~sROL128) & sROL129));
            sArr2[17] = s52;
            sArr3[2] = (short) (s52 ^ sArr3[2]);
            short s53 = (short) (((~sROL129) & sROL125) ^ sROL128);
            sArr2[18] = s53;
            sArr3[3] = (short) (s53 ^ sArr3[3]);
            short s54 = (short) (((~sROL125) & sROL126) ^ sROL129);
            sArr2[19] = s54;
            sArr3[4] = (short) (s54 ^ sArr3[4]);
            short s55 = (short) (sArr[2] ^ sROL18);
            sArr[2] = s55;
            short sROL130 = ROL16(s55, 14);
            short s56 = (short) (sArr[8] ^ sROL19);
            sArr[8] = s56;
            short sROL131 = ROL16(s56, 7);
            short s57 = (short) (sArr[14] ^ sROL110);
            sArr[14] = s57;
            short sROL132 = ROL16(s57, 7);
            short s58 = (short) (sROL16 ^ sArr[15]);
            sArr[15] = s58;
            short sROL133 = ROL16(s58, 9);
            short s59 = (short) (sROL17 ^ sArr[21]);
            sArr[21] = s59;
            short sROL134 = ROL16(s59, 2);
            short s61 = (short) (((~sROL131) & sROL132) ^ sROL130);
            sArr2[20] = s61;
            sArr3[0] = (short) (s61 ^ sArr3[0]);
            short s62 = (short) (((~sROL132) & sROL133) ^ sROL131);
            sArr2[21] = s62;
            sArr3[1] = (short) (s62 ^ sArr3[1]);
            short s63 = (short) (sROL132 ^ ((~sROL133) & sROL134));
            sArr2[22] = s63;
            sArr3[2] = (short) (s63 ^ sArr3[2]);
            short s64 = (short) (sROL133 ^ ((~sROL134) & sROL130));
            sArr2[23] = s64;
            sArr3[3] = (short) (s64 ^ sArr3[3]);
            short s65 = (short) (((~sROL130) & sROL131) ^ sROL134);
            sArr2[24] = s65;
            sArr3[4] = (short) (s65 ^ sArr3[4]);
        }
    }

    private class ISAPAEAD_K_128 extends ISAPAEAD_K {
        public ISAPAEAD_K_128() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, 3092, 3084};
            this.ISAP_IV2_16 = new short[]{-32766, 400, 3092, 3084};
            this.ISAP_IV3_16 = new short[]{-32765, 400, 3092, 3084};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(0, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(1, sArr2, sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(2, sArr, sArr2, sArr3);
            thetaRhoPiChiIotaPrepareTheta(3, sArr2, sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            rounds12X(sArr, sArr2, sArr3);
        }
    }

    private class ISAPAEAD_K_128A extends ISAPAEAD_K {
        public ISAPAEAD_K_128A() {
            super();
            this.ISAP_IV1_16 = new short[]{-32767, 400, 272, 2056};
            this.ISAP_IV2_16 = new short[]{-32766, 400, 272, 2056};
            this.ISAP_IV3_16 = new short[]{-32765, 400, 272, 2056};
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsBX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            thetaRhoPiChiIotaPrepareTheta(19, sArr, sArr2, sArr3);
            System.arraycopy(sArr2, 0, sArr, 0, sArr2.length);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsHX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_4_18(sArr, sArr2, sArr3);
        }

        @Override // org.bouncycastle.crypto.engines.ISAPEngine.ISAPAEAD_K
        protected void PermuteRoundsKX(short[] sArr, short[] sArr2, short[] sArr3) {
            prepareThetaX(sArr, sArr3);
            rounds_12_18(sArr, sArr2, sArr3);
        }
    }

    private interface ISAP_AEAD {
        void init();

        void isap_enc(byte[] bArr, int i11, int i12, byte[] bArr2, int i13, int i14);

        void isap_mac(byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13);

        void reset();
    }

    public enum IsapType {
        ISAP_A_128A,
        ISAP_K_128A,
        ISAP_A_128,
        ISAP_K_128
    }

    public ISAPEngine(IsapType isapType) {
        String str;
        int i11 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$engines$ISAPEngine$IsapType[isapType.ordinal()];
        if (i11 == 1) {
            this.ISAPAEAD = new ISAPAEAD_A_128A();
            str = "ISAP-A-128A AEAD";
        } else if (i11 == 2) {
            this.ISAPAEAD = new ISAPAEAD_K_128A();
            str = "ISAP-K-128A AEAD";
        } else if (i11 == 3) {
            this.ISAPAEAD = new ISAPAEAD_A_128();
            str = "ISAP-A-128 AEAD";
        } else {
            if (i11 != 4) {
                return;
            }
            this.ISAPAEAD = new ISAPAEAD_K_128();
            str = "ISAP-K-128 AEAD";
        }
        this.algorithmName = str;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i11) {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        if (this.forEncryption) {
            byte[] byteArray = this.message.toByteArray();
            int length = byteArray.length;
            int i12 = i11 + length;
            if (i12 + 16 > bArr.length) {
                throw new OutputLengthException("output buffer is too short");
            }
            this.ISAPAEAD.isap_enc(byteArray, 0, length, bArr, i11, bArr.length);
            this.outputStream.write(bArr, i11, length);
            this.f98679ad = this.aadData.toByteArray();
            byte[] byteArray2 = this.outputStream.toByteArray();
            this.f98680c = byteArray2;
            byte[] bArr2 = new byte[16];
            this.mac = bArr2;
            ISAP_AEAD isap_aead = this.ISAPAEAD;
            byte[] bArr3 = this.f98679ad;
            isap_aead.isap_mac(bArr3, bArr3.length, byteArray2, byteArray2.length, bArr2, 0);
            System.arraycopy(this.mac, 0, bArr, i12, 16);
            return length + 16;
        }
        this.f98679ad = this.aadData.toByteArray();
        byte[] byteArray3 = this.message.toByteArray();
        this.f98680c = byteArray3;
        byte[] bArr4 = new byte[16];
        this.mac = bArr4;
        int length2 = byteArray3.length - bArr4.length;
        if (length2 + i11 > bArr.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        ISAP_AEAD isap_aead2 = this.ISAPAEAD;
        byte[] bArr5 = this.f98679ad;
        isap_aead2.isap_mac(bArr5, bArr5.length, byteArray3, length2, bArr4, 0);
        this.ISAPAEAD.reset();
        for (int i13 = 0; i13 < 16; i13++) {
            if (this.mac[i13] != this.f98680c[length2 + i13]) {
                throw new IllegalArgumentException("Mac does not match");
            }
        }
        this.ISAPAEAD.isap_enc(this.f98680c, 0, length2, bArr, i11, bArr.length);
        return length2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public int getBlockSize() {
        return this.ISAP_rH_SZ;
    }

    public int getIVBytesSize() {
        return 16;
    }

    public int getKeyBytesSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return this.mac;
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
            throw new IllegalArgumentException("ISAP AEAD init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != 16) {
            throw new IllegalArgumentException("ISAP AEAD requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("ISAP AEAD init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("ISAP AEAD key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z11)));
        byte[] bArr = new byte[iv2.length];
        this.npub = bArr;
        this.f98681k = new byte[key.length];
        System.arraycopy(iv2, 0, bArr, 0, iv2.length);
        System.arraycopy(key, 0, this.f98681k, 0, key.length);
        this.ISAPAEAD.init();
        this.initialised = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b11) {
        this.aadData.write(b11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i11, int i12) {
        if (i11 + i12 <= bArr.length) {
            this.aadData.write(bArr, i11, i12);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("input buffer too short");
        sb2.append(this.forEncryption ? "encryption" : "decryption");
        throw new DataLengthException(sb2.toString());
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b11, byte[] bArr, int i11) {
        return processBytes(new byte[]{b11}, 0, 1, bArr, i11);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        if (i11 + i12 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        this.message.write(bArr, i11, i12);
        if (!this.forEncryption || this.message.size() < this.ISAP_rH_SZ) {
            return 0;
        }
        int size = this.message.size();
        int i14 = this.ISAP_rH_SZ;
        int i15 = (size / i14) * i14;
        if (i13 + i15 > bArr2.length) {
            throw new OutputLengthException("output buffer is too short");
        }
        byte[] byteArray = this.message.toByteArray();
        this.ISAPAEAD.isap_enc(byteArray, 0, i15, bArr2, i13, bArr2.length);
        this.outputStream.write(bArr2, i13, i15);
        this.message.reset();
        this.message.write(byteArray, i15, byteArray.length - i15);
        return i15;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        if (!this.initialised) {
            throw new IllegalArgumentException("Need call init function before encryption/decryption");
        }
        this.aadData.reset();
        this.ISAPAEAD.reset();
        this.message.reset();
        this.outputStream.reset();
    }
}
