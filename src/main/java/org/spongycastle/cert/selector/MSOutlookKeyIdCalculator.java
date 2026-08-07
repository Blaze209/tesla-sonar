package org.spongycastle.cert.selector;

import java.io.IOException;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
class MSOutlookKeyIdCalculator {

    private static class SHA1Digest extends GeneralDigest {
        private static final int DIGEST_LENGTH = 20;
        private static final int Y1 = 1518500249;
        private static final int Y2 = 1859775393;
        private static final int Y3 = -1894007588;
        private static final int Y4 = -899497514;
        private int H1;
        private int H2;
        private int H3;
        private int H4;
        private int H5;
        private int[] X = new int[80];
        private int xOff;

        public SHA1Digest() {
            reset();
        }

        private int f(int i11, int i12, int i13) {
            return ((~i11) & i13) | (i12 & i11);
        }

        private int g(int i11, int i12, int i13) {
            return (i11 & (i12 | i13)) | (i12 & i13);
        }

        private int h(int i11, int i12, int i13) {
            return (i11 ^ i12) ^ i13;
        }

        public int doFinal(byte[] bArr, int i11) {
            finish();
            Pack.intToBigEndian(this.H1, bArr, i11);
            Pack.intToBigEndian(this.H2, bArr, i11 + 4);
            Pack.intToBigEndian(this.H3, bArr, i11 + 8);
            Pack.intToBigEndian(this.H4, bArr, i11 + 12);
            Pack.intToBigEndian(this.H5, bArr, i11 + 16);
            reset();
            return 20;
        }

        public String getAlgorithmName() {
            return "SHA-1";
        }

        public int getDigestSize() {
            return 20;
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processBlock() {
            for (int i11 = 16; i11 < 80; i11++) {
                int[] iArr = this.X;
                int i12 = ((iArr[i11 - 3] ^ iArr[i11 - 8]) ^ iArr[i11 - 14]) ^ iArr[i11 - 16];
                iArr[i11] = (i12 >>> 31) | (i12 << 1);
            }
            int iH = this.H1;
            int iH2 = this.H2;
            int i13 = this.H3;
            int i14 = this.H4;
            int i15 = this.H5;
            int i16 = 0;
            for (int i17 = 0; i17 < 4; i17++) {
                int iF = i15 + ((iH << 5) | (iH >>> 27)) + f(iH2, i13, i14) + this.X[i16] + Y1;
                int i18 = (iH2 >>> 2) | (iH2 << 30);
                int iF2 = i14 + ((iF << 5) | (iF >>> 27)) + f(iH, i18, i13) + this.X[i16 + 1] + Y1;
                int i19 = (iH >>> 2) | (iH << 30);
                int iF3 = i13 + ((iF2 << 5) | (iF2 >>> 27)) + f(iF, i19, i18) + this.X[i16 + 2] + Y1;
                i15 = (iF >>> 2) | (iF << 30);
                int i21 = i16 + 4;
                iH2 = i18 + ((iF3 << 5) | (iF3 >>> 27)) + f(iF2, i15, i19) + this.X[i16 + 3] + Y1;
                i14 = (iF2 >>> 2) | (iF2 << 30);
                i16 += 5;
                iH = i19 + ((iH2 << 5) | (iH2 >>> 27)) + f(iF3, i14, i15) + this.X[i21] + Y1;
                i13 = (iF3 >>> 2) | (iF3 << 30);
            }
            for (int i22 = 0; i22 < 4; i22++) {
                int iH3 = i15 + ((iH << 5) | (iH >>> 27)) + h(iH2, i13, i14) + this.X[i16] + Y2;
                int i23 = (iH2 >>> 2) | (iH2 << 30);
                int iH4 = i14 + ((iH3 << 5) | (iH3 >>> 27)) + h(iH, i23, i13) + this.X[i16 + 1] + Y2;
                int i24 = (iH >>> 2) | (iH << 30);
                int iH5 = i13 + ((iH4 << 5) | (iH4 >>> 27)) + h(iH3, i24, i23) + this.X[i16 + 2] + Y2;
                i15 = (iH3 >>> 2) | (iH3 << 30);
                int i25 = i16 + 4;
                iH2 = i23 + ((iH5 << 5) | (iH5 >>> 27)) + h(iH4, i15, i24) + this.X[i16 + 3] + Y2;
                i14 = (iH4 >>> 2) | (iH4 << 30);
                i16 += 5;
                iH = i24 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH5, i14, i15) + this.X[i25] + Y2;
                i13 = (iH5 >>> 2) | (iH5 << 30);
            }
            for (int i26 = 0; i26 < 4; i26++) {
                int iG = i15 + ((iH << 5) | (iH >>> 27)) + g(iH2, i13, i14) + this.X[i16] + Y3;
                int i27 = (iH2 >>> 2) | (iH2 << 30);
                int iG2 = i14 + ((iG << 5) | (iG >>> 27)) + g(iH, i27, i13) + this.X[i16 + 1] + Y3;
                int i28 = (iH >>> 2) | (iH << 30);
                int iG3 = i13 + ((iG2 << 5) | (iG2 >>> 27)) + g(iG, i28, i27) + this.X[i16 + 2] + Y3;
                i15 = (iG >>> 2) | (iG << 30);
                int i29 = i16 + 4;
                iH2 = i27 + ((iG3 << 5) | (iG3 >>> 27)) + g(iG2, i15, i28) + this.X[i16 + 3] + Y3;
                i14 = (iG2 >>> 2) | (iG2 << 30);
                i16 += 5;
                iH = i28 + ((iH2 << 5) | (iH2 >>> 27)) + g(iG3, i14, i15) + this.X[i29] + Y3;
                i13 = (iG3 >>> 2) | (iG3 << 30);
            }
            for (int i31 = 0; i31 <= 3; i31++) {
                int iH6 = i15 + ((iH << 5) | (iH >>> 27)) + h(iH2, i13, i14) + this.X[i16] + Y4;
                int i32 = (iH2 >>> 2) | (iH2 << 30);
                int iH7 = i14 + ((iH6 << 5) | (iH6 >>> 27)) + h(iH, i32, i13) + this.X[i16 + 1] + Y4;
                int i33 = (iH >>> 2) | (iH << 30);
                int iH8 = i13 + ((iH7 << 5) | (iH7 >>> 27)) + h(iH6, i33, i32) + this.X[i16 + 2] + Y4;
                i15 = (iH6 >>> 2) | (iH6 << 30);
                int i34 = i16 + 4;
                iH2 = i32 + ((iH8 << 5) | (iH8 >>> 27)) + h(iH7, i15, i33) + this.X[i16 + 3] + Y4;
                i14 = (iH7 >>> 2) | (iH7 << 30);
                i16 += 5;
                iH = i33 + ((iH2 << 5) | (iH2 >>> 27)) + h(iH8, i14, i15) + this.X[i34] + Y4;
                i13 = (iH8 >>> 2) | (iH8 << 30);
            }
            this.H1 += iH;
            this.H2 += iH2;
            this.H3 += i13;
            this.H4 += i14;
            this.H5 += i15;
            this.xOff = 0;
            for (int i35 = 0; i35 < 16; i35++) {
                this.X[i35] = 0;
            }
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processLength(long j11) {
            if (this.xOff > 14) {
                processBlock();
            }
            int[] iArr = this.X;
            iArr[14] = (int) (j11 >>> 32);
            iArr[15] = (int) j11;
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        protected void processWord(byte[] bArr, int i11) {
            int i12 = (bArr[i11 + 3] & 255) | (bArr[i11] << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
            int[] iArr = this.X;
            int i13 = this.xOff;
            iArr[i13] = i12;
            int i14 = i13 + 1;
            this.xOff = i14;
            if (i14 == 16) {
                processBlock();
            }
        }

        @Override // org.spongycastle.cert.selector.MSOutlookKeyIdCalculator.GeneralDigest
        public void reset() {
            super.reset();
            this.H1 = 1732584193;
            this.H2 = -271733879;
            this.H3 = -1732584194;
            this.H4 = 271733878;
            this.H5 = -1009589776;
            this.xOff = 0;
            int i11 = 0;
            while (true) {
                int[] iArr = this.X;
                if (i11 == iArr.length) {
                    return;
                }
                iArr[i11] = 0;
                i11++;
            }
        }
    }

    MSOutlookKeyIdCalculator() {
    }

    static byte[] calculateKeyId(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        SHA1Digest sHA1Digest = new SHA1Digest();
        byte[] bArr = new byte[sHA1Digest.getDigestSize()];
        try {
            byte[] encoded = subjectPublicKeyInfo.getEncoded("DER");
            sHA1Digest.update(encoded, 0, encoded.length);
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    private static abstract class GeneralDigest {
        private static final int BYTE_LENGTH = 64;
        private long byteCount;
        private byte[] xBuf;
        private int xBufOff;

        protected GeneralDigest() {
            this.xBuf = new byte[4];
            this.xBufOff = 0;
        }

        protected void copyIn(GeneralDigest generalDigest) {
            byte[] bArr = generalDigest.xBuf;
            System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
            this.xBufOff = generalDigest.xBufOff;
            this.byteCount = generalDigest.byteCount;
        }

        public void finish() {
            long j11 = this.byteCount << 3;
            update((byte) -128);
            while (this.xBufOff != 0) {
                update((byte) 0);
            }
            processLength(j11);
            processBlock();
        }

        protected abstract void processBlock();

        protected abstract void processLength(long j11);

        protected abstract void processWord(byte[] bArr, int i11);

        public void reset() {
            this.byteCount = 0L;
            this.xBufOff = 0;
            int i11 = 0;
            while (true) {
                byte[] bArr = this.xBuf;
                if (i11 >= bArr.length) {
                    return;
                }
                bArr[i11] = 0;
                i11++;
            }
        }

        public void update(byte b11) {
            byte[] bArr = this.xBuf;
            int i11 = this.xBufOff;
            int i12 = i11 + 1;
            this.xBufOff = i12;
            bArr[i11] = b11;
            if (i12 == bArr.length) {
                processWord(bArr, 0);
                this.xBufOff = 0;
            }
            this.byteCount++;
        }

        protected GeneralDigest(GeneralDigest generalDigest) {
            this.xBuf = new byte[generalDigest.xBuf.length];
            copyIn(generalDigest);
        }

        public void update(byte[] bArr, int i11, int i12) {
            while (this.xBufOff != 0 && i12 > 0) {
                update(bArr[i11]);
                i11++;
                i12--;
            }
            while (i12 > this.xBuf.length) {
                processWord(bArr, i11);
                byte[] bArr2 = this.xBuf;
                i11 += bArr2.length;
                i12 -= bArr2.length;
                this.byteCount += (long) bArr2.length;
            }
            while (i12 > 0) {
                update(bArr[i11]);
                i11++;
                i12--;
            }
        }
    }
}
