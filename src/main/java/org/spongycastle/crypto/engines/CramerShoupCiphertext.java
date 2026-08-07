package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes10.dex */
public class CramerShoupCiphertext {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    BigInteger f99476e;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    BigInteger f99477u1;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    BigInteger f99478u2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    BigInteger f99479v;

    public CramerShoupCiphertext() {
    }

    public BigInteger getE() {
        return this.f99476e;
    }

    public BigInteger getU1() {
        return this.f99477u1;
    }

    public BigInteger getU2() {
        return this.f99478u2;
    }

    public BigInteger getV() {
        return this.f99479v;
    }

    public void setE(BigInteger bigInteger) {
        this.f99476e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f99477u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f99478u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f99479v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f99477u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f99478u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f99476e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f99479v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i11 = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i11, length2);
        int i12 = i11 + length2;
        Pack.intToBigEndian(length3, bArr, i12);
        int i13 = i12 + 4;
        System.arraycopy(byteArray3, 0, bArr, i13, length3);
        int i14 = i13 + length3;
        Pack.intToBigEndian(length4, bArr, i14);
        System.arraycopy(byteArray4, 0, bArr, i14 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.f99477u1.toString());
        stringBuffer.append("\nu2: " + this.f99478u2.toString());
        stringBuffer.append("\ne: " + this.f99476e.toString());
        stringBuffer.append("\nv: " + this.f99479v.toString());
        return stringBuffer.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f99477u1 = bigInteger;
        this.f99478u2 = bigInteger2;
        this.f99476e = bigInteger3;
        this.f99479v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i11 = 4 + iBigEndianToInt;
        this.f99477u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i11));
        int i12 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i11) + i12;
        this.f99478u2 = new BigInteger(Arrays.copyOfRange(bArr, i12, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i13 = iBigEndianToInt2 + 4;
        int i14 = iBigEndianToInt3 + i13;
        this.f99476e = new BigInteger(Arrays.copyOfRange(bArr, i13, i14));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i14);
        int i15 = i14 + 4;
        this.f99479v = new BigInteger(Arrays.copyOfRange(bArr, i15, iBigEndianToInt4 + i15));
    }
}
