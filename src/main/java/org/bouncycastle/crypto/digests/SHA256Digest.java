package org.bouncycastle.crypto.digests;

import com.adyen.checkout.components.core.Address;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.SavableDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public class SHA256Digest extends GeneralDigest implements SavableDigest {
    private static final int DIGEST_LENGTH = 32;
    static final int[] K = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int[] X;
    private int xOff;

    public SHA256Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private static int Ch(int i11, int i12, int i13) {
        return ((~i11) & i13) ^ (i12 & i11);
    }

    private static int Maj(int i11, int i12, int i13) {
        return ((i11 ^ i12) & i13) | (i11 & i12);
    }

    private static int Sum0(int i11) {
        return ((i11 << 10) | (i11 >>> 22)) ^ (((i11 >>> 2) | (i11 << 30)) ^ ((i11 >>> 13) | (i11 << 19)));
    }

    private static int Sum1(int i11) {
        return ((i11 << 7) | (i11 >>> 25)) ^ (((i11 >>> 6) | (i11 << 26)) ^ ((i11 >>> 11) | (i11 << 21)));
    }

    private static int Theta0(int i11) {
        return (i11 >>> 3) ^ (((i11 >>> 7) | (i11 << 25)) ^ ((i11 >>> 18) | (i11 << 14)));
    }

    private static int Theta1(int i11) {
        return (i11 >>> 10) ^ (((i11 >>> 17) | (i11 << 15)) ^ ((i11 >>> 19) | (i11 << 13)));
    }

    private void copyIn(SHA256Digest sHA256Digest) {
        super.copyIn((GeneralDigest) sHA256Digest);
        this.H1 = sHA256Digest.H1;
        this.H2 = sHA256Digest.H2;
        this.H3 = sHA256Digest.H3;
        this.H4 = sHA256Digest.H4;
        this.H5 = sHA256Digest.H5;
        this.H6 = sHA256Digest.H6;
        this.H7 = sHA256Digest.H7;
        this.H8 = sHA256Digest.H8;
        int[] iArr = sHA256Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA256Digest.xOff;
    }

    public static SavableDigest newInstance() {
        return new SHA256Digest();
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA256Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i11) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i11);
        Pack.intToBigEndian(this.H2, bArr, i11 + 4);
        Pack.intToBigEndian(this.H3, bArr, i11 + 8);
        Pack.intToBigEndian(this.H4, bArr, i11 + 12);
        Pack.intToBigEndian(this.H5, bArr, i11 + 16);
        Pack.intToBigEndian(this.H6, bArr, i11 + 20);
        Pack.intToBigEndian(this.H7, bArr, i11 + 24);
        Pack.intToBigEndian(this.H8, bArr, i11 + 28);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-256";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest
    public byte[] getEncodedState() {
        int i11 = this.xOff * 4;
        byte[] bArr = new byte[i11 + 53];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.H6, bArr, 36);
        Pack.intToBigEndian(this.H7, bArr, 40);
        Pack.intToBigEndian(this.H8, bArr, 44);
        Pack.intToBigEndian(this.xOff, bArr, 48);
        for (int i12 = 0; i12 != this.xOff; i12++) {
            Pack.intToBigEndian(this.X[i12], bArr, (i12 * 4) + 52);
        }
        bArr[i11 + 52] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processBlock() {
        for (int i11 = 16; i11 <= 63; i11++) {
            int[] iArr = this.X;
            int iTheta1 = Theta1(iArr[i11 - 2]);
            int[] iArr2 = this.X;
            iArr[i11] = iTheta1 + iArr2[i11 - 7] + Theta0(iArr2[i11 - 15]) + this.X[i11 - 16];
        }
        int iSum0 = this.H1;
        int iSum1 = this.H2;
        int iSum2 = this.H3;
        int iSum3 = this.H4;
        int i12 = this.H5;
        int i13 = this.H6;
        int i14 = this.H7;
        int i15 = this.H8;
        int i16 = 0;
        for (int i17 = 0; i17 < 8; i17++) {
            int iSum4 = Sum1(i12) + Ch(i12, i13, i14);
            int[] iArr3 = K;
            int i18 = i15 + iSum4 + iArr3[i16] + this.X[i16];
            int i19 = iSum3 + i18;
            int iSum5 = i18 + Sum0(iSum0) + Maj(iSum0, iSum1, iSum2);
            int i21 = i16 + 1;
            int iSum6 = i14 + Sum1(i19) + Ch(i19, i12, i13) + iArr3[i21] + this.X[i21];
            int i22 = iSum2 + iSum6;
            int iSum7 = iSum6 + Sum0(iSum5) + Maj(iSum5, iSum0, iSum1);
            int i23 = i16 + 2;
            int iSum8 = i13 + Sum1(i22) + Ch(i22, i19, i12) + iArr3[i23] + this.X[i23];
            int i24 = iSum1 + iSum8;
            int iSum9 = iSum8 + Sum0(iSum7) + Maj(iSum7, iSum5, iSum0);
            int i25 = i16 + 3;
            int iSum10 = i12 + Sum1(i24) + Ch(i24, i22, i19) + iArr3[i25] + this.X[i25];
            int i26 = iSum0 + iSum10;
            int iSum11 = iSum10 + Sum0(iSum9) + Maj(iSum9, iSum7, iSum5);
            int i27 = i16 + 4;
            int iSum12 = i19 + Sum1(i26) + Ch(i26, i24, i22) + iArr3[i27] + this.X[i27];
            i15 = iSum5 + iSum12;
            iSum3 = iSum12 + Sum0(iSum11) + Maj(iSum11, iSum9, iSum7);
            int i28 = i16 + 5;
            int iSum13 = i22 + Sum1(i15) + Ch(i15, i26, i24) + iArr3[i28] + this.X[i28];
            i14 = iSum7 + iSum13;
            iSum2 = iSum13 + Sum0(iSum3) + Maj(iSum3, iSum11, iSum9);
            int i29 = i16 + 6;
            int iSum14 = i24 + Sum1(i14) + Ch(i14, i15, i26) + iArr3[i29] + this.X[i29];
            i13 = iSum9 + iSum14;
            iSum1 = iSum14 + Sum0(iSum2) + Maj(iSum2, iSum3, iSum11);
            int i31 = i16 + 7;
            int iSum15 = i26 + Sum1(i13) + Ch(i13, i14, i15) + iArr3[i31] + this.X[i31];
            i12 = iSum11 + iSum15;
            iSum0 = iSum15 + Sum0(iSum1) + Maj(iSum1, iSum2, iSum3);
            i16 += 8;
        }
        this.H1 += iSum0;
        this.H2 += iSum1;
        this.H3 += iSum2;
        this.H4 += iSum3;
        this.H5 += i12;
        this.H6 += i13;
        this.H7 += i14;
        this.H8 += i15;
        this.xOff = 0;
        for (int i32 = 0; i32 < 16; i32++) {
            this.X[i32] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processLength(long j11) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j11 >>> 32);
        iArr[15] = (int) j11;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    protected void processWord(byte[] bArr, int i11) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i11);
        int i12 = this.xOff + 1;
        this.xOff = i12;
        if (i12 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1779033703;
        this.H2 = -1150833019;
        this.H3 = 1013904242;
        this.H4 = -1521486534;
        this.H5 = 1359893119;
        this.H6 = -1694144372;
        this.H7 = 528734635;
        this.H8 = 1541459225;
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

    public SHA256Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[64];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    public static SavableDigest newInstance(CryptoServicePurpose cryptoServicePurpose) {
        return new SHA256Digest(cryptoServicePurpose);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((SHA256Digest) memoable);
    }

    public SHA256Digest(SHA256Digest sHA256Digest) {
        super(sHA256Digest);
        this.X = new int[64];
        copyIn(sHA256Digest);
    }

    public static SavableDigest newInstance(Digest digest) {
        if (digest instanceof SHA256Digest) {
            return new SHA256Digest((SHA256Digest) digest);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("receiver digest not available for input type ");
        sb2.append(digest != null ? digest.getClass().getName() : Address.ADDRESS_NULL_PLACEHOLDER);
        throw new IllegalArgumentException(sb2.toString());
    }

    public SHA256Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[64];
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.H6 = Pack.bigEndianToInt(bArr, 36);
        this.H7 = Pack.bigEndianToInt(bArr, 40);
        this.H8 = Pack.bigEndianToInt(bArr, 44);
        this.xOff = Pack.bigEndianToInt(bArr, 48);
        for (int i11 = 0; i11 != this.xOff; i11++) {
            this.X[i11] = Pack.bigEndianToInt(bArr, (i11 * 4) + 52);
        }
    }

    public static SavableDigest newInstance(byte[] bArr) {
        return new SHA256Digest(bArr);
    }
}
