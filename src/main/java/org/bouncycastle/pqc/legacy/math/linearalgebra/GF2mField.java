package org.bouncycastle.pqc.legacy.math.linearalgebra;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes10.dex */
public class GF2mField {
    private int degree;
    private int polynomial;

    public GF2mField(int i11) {
        this.degree = 0;
        if (i11 >= 32) {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
        this.degree = i11;
        this.polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i11);
    }

    private static String polyToString(int i11) {
        if (i11 == 0) {
            return WebrtcBuildVersion.maint_version;
        }
        String str = ((byte) (i11 & 1)) == 1 ? "1" : "";
        int i12 = i11 >>> 1;
        int i13 = 1;
        while (i12 != 0) {
            if (((byte) (i12 & 1)) == 1) {
                str = str + "+x^" + i13;
            }
            i12 >>>= 1;
            i13++;
        }
        return str;
    }

    public int add(int i11, int i12) {
        return i11 ^ i12;
    }

    public String elementToStr(int i11) {
        StringBuilder sb2;
        String str;
        String string = "";
        for (int i12 = 0; i12 < this.degree; i12++) {
            if ((((byte) i11) & 1) == 0) {
                sb2 = new StringBuilder();
                str = WebrtcBuildVersion.maint_version;
            } else {
                sb2 = new StringBuilder();
                str = "1";
            }
            sb2.append(str);
            sb2.append(string);
            string = sb2.toString();
            i11 >>>= 1;
        }
        return string;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i11, int i12) {
        if (i12 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i12 < 0) {
            i11 = inverse(i11);
            i12 = -i12;
        }
        int iMult = 1;
        while (i12 != 0) {
            if ((i12 & 1) == 1) {
                iMult = mult(iMult, i11);
            }
            i11 = mult(i11, i11);
            i12 >>>= 1;
        }
        return iMult;
    }

    public int getDegree() {
        return this.degree;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.polynomial);
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(CryptoServicesRegistrar.getSecureRandom());
    }

    public int hashCode() {
        return this.polynomial;
    }

    public int inverse(int i11) {
        return exp(i11, (1 << this.degree) - 2);
    }

    public boolean isElementOfThisField(int i11) {
        int i12 = this.degree;
        if (i12 == 31) {
            return i11 >= 0;
        }
        return i11 >= 0 && i11 < (1 << i12);
    }

    public int mult(int i11, int i12) {
        return PolynomialRingGF2.modMultiply(i11, i12, this.polynomial);
    }

    public int sqRoot(int i11) {
        for (int i12 = 1; i12 < this.degree; i12++) {
            i11 = mult(i11, i11);
        }
        return i11;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.degree + ") = GF(2)[X]/<" + polyToString(this.polynomial) + "> ";
    }

    public GF2mField(int i11, int i12) {
        this.degree = 0;
        if (i11 != PolynomialRingGF2.degree(i12)) {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!PolynomialRingGF2.isIrreducible(i12)) {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        }
        this.degree = i11;
        this.polynomial = i12;
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
        int i11 = 0;
        while (iNextInt == 0 && i11 < 1048576) {
            iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
            i11++;
        }
        if (i11 == 1048576) {
            return 1;
        }
        return iNextInt;
    }

    public GF2mField(GF2mField gF2mField) {
        this.degree = 0;
        this.degree = gF2mField.degree;
        this.polynomial = gF2mField.polynomial;
    }

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr);
        this.polynomial = iOS2IP;
        if (!PolynomialRingGF2.isIrreducible(iOS2IP)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.degree = PolynomialRingGF2.degree(this.polynomial);
    }
}
