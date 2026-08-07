package org.spongycastle.asn1;

import java.io.IOException;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ASN1ApplicationSpecific extends ASN1Primitive {
    protected final boolean isConstructed;
    protected final byte[] octets;
    protected final int tag;

    ASN1ApplicationSpecific(boolean z11, int i11, byte[] bArr) {
        this.isConstructed = z11;
        this.tag = i11;
        this.octets = Arrays.clone(bArr);
    }

    public static ASN1ApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e11) {
            throw new IllegalArgumentException("Failed to construct object from byte[]: " + e11.getMessage());
        }
    }

    protected static int getLengthOfHeader(byte[] bArr) {
        byte b11 = bArr[1];
        int i11 = b11 & 255;
        if (i11 == 128 || i11 <= 127) {
            return 2;
        }
        int i12 = b11 & 127;
        if (i12 <= 4) {
            return i12 + 2;
        }
        throw new IllegalStateException("DER length more than 4 bytes: " + i12);
    }

    private byte[] replaceTagNumber(int i11, byte[] bArr) {
        int i12;
        if ((bArr[0] & 31) == 31) {
            byte b11 = bArr[1];
            int i13 = b11 & 255;
            if ((b11 & 127) == 0) {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
            i12 = 2;
            while (i13 >= 0 && (i13 & 128) != 0) {
                i13 = bArr[i12] & 255;
                i12++;
            }
        } else {
            i12 = 1;
        }
        int length = bArr.length - i12;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i12, bArr2, 1, length);
        bArr2[0] = (byte) i11;
        return bArr2;
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1ApplicationSpecific)) {
            return false;
        }
        ASN1ApplicationSpecific aSN1ApplicationSpecific = (ASN1ApplicationSpecific) aSN1Primitive;
        return this.isConstructed == aSN1ApplicationSpecific.isConstructed && this.tag == aSN1ApplicationSpecific.tag && Arrays.areEqual(this.octets, aSN1ApplicationSpecific.octets);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    int encodedLength() {
        return StreamUtil.calculateTagLength(this.tag) + StreamUtil.calculateBodyLength(this.octets.length) + this.octets.length;
    }

    public int getApplicationTag() {
        return this.tag;
    }

    public byte[] getContents() {
        return Arrays.clone(this.octets);
    }

    public ASN1Primitive getObject() {
        return ASN1Primitive.fromByteArray(getContents());
    }

    @Override // org.spongycastle.asn1.ASN1Primitive, org.spongycastle.asn1.ASN1Object
    public int hashCode() {
        boolean z11 = this.isConstructed;
        return ((z11 ? 1 : 0) ^ this.tag) ^ Arrays.hashCode(this.octets);
    }

    @Override // org.spongycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return this.isConstructed;
    }

    public ASN1Primitive getObject(int i11) throws IOException {
        if (i11 >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] encoded = getEncoded();
        byte[] bArrReplaceTagNumber = replaceTagNumber(i11, encoded);
        if ((encoded[0] & 32) != 0) {
            bArrReplaceTagNumber[0] = (byte) (bArrReplaceTagNumber[0] | 32);
        }
        return ASN1Primitive.fromByteArray(bArrReplaceTagNumber);
    }
}
