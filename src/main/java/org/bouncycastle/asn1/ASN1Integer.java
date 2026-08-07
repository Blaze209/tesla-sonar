package org.bouncycastle.asn1;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
public class ASN1Integer extends ASN1Primitive {
    static final int SIGN_EXT_SIGNED = -1;
    static final int SIGN_EXT_UNSIGNED = 255;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Integer.class, 2) { // from class: org.bouncycastle.asn1.ASN1Integer.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Integer.createPrimitive(dEROctetString.getOctets());
        }
    };
    private final byte[] bytes;
    private final int start;

    public ASN1Integer(long j11) {
        this.bytes = BigInteger.valueOf(j11).toByteArray();
        this.start = 0;
    }

    static ASN1Integer createPrimitive(byte[] bArr) {
        return new ASN1Integer(bArr, false);
    }

    public static ASN1Integer getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Integer)) {
            return (ASN1Integer) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (ASN1Integer) TYPE.fromByteArray((byte[]) obj);
        } catch (Exception e11) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e11.toString());
        }
    }

    static int intValue(byte[] bArr, int i11, int i12) {
        int length = bArr.length;
        int iMax = Math.max(i11, length - 4);
        int i13 = i12 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i13;
            }
            i13 = (i13 << 8) | (bArr[iMax] & 255);
        }
    }

    static boolean isMalformed(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || Properties.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static long longValue(byte[] bArr, int i11, int i12) {
        int length = bArr.length;
        int iMax = Math.max(i11, length - 8);
        long j11 = i12 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j11;
            }
            j11 = (j11 << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    static int signBytesToSkip(byte[] bArr) {
        int length = bArr.length - 1;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (bArr[i11] != (bArr[i12] >> 7)) {
                break;
            }
            i11 = i12;
        }
        return i11;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1Integer) {
            return Arrays.areEqual(this.bytes, ((ASN1Integer) aSN1Primitive).bytes);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) {
        aSN1OutputStream.writeEncodingDL(z11, 2, this.bytes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.bytes.length);
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean hasValue(int i11) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i12 = this.start;
        return length - i12 <= 4 && intValue(bArr, i12, -1) == i11;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i11 = this.start;
        int i12 = length - i11;
        if (i12 > 4 || (i12 == 4 && (bArr[i11] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return intValue(bArr, i11, 255);
    }

    public int intValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i11 = this.start;
        if (length - i11 <= 4) {
            return intValue(bArr, i11, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long longValueExact() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i11 = this.start;
        if (length - i11 <= 8) {
            return longValue(bArr, i11, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public String toString() {
        return getValue().toString();
    }

    public ASN1Integer(BigInteger bigInteger) {
        this.bytes = bigInteger.toByteArray();
        this.start = 0;
    }

    public static ASN1Integer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1Integer) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }

    public boolean hasValue(long j11) {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        int i11 = this.start;
        return length - i11 <= 8 && longValue(bArr, i11, -1) == j11;
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public boolean hasValue(BigInteger bigInteger) {
        return bigInteger != null && intValue(this.bytes, this.start, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    ASN1Integer(byte[] bArr, boolean z11) {
        if (isMalformed(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.bytes = z11 ? Arrays.clone(bArr) : bArr;
        this.start = signBytesToSkip(bArr);
    }
}
