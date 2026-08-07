package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
class LazyEncodedSequence extends ASN1Sequence {
    private byte[] encoded;

    LazyEncodedSequence(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'encoded' cannot be null");
        }
        this.encoded = bArr;
    }

    private synchronized void force() {
        if (this.encoded != null) {
            ASN1InputStream aSN1InputStream = new ASN1InputStream(this.encoded, true);
            try {
                ASN1EncodableVector vector = aSN1InputStream.readVector();
                aSN1InputStream.close();
                this.elements = vector.takeElements();
                this.encoded = null;
            } catch (IOException e11) {
                throw new ASN1ParsingException("malformed ASN.1: " + e11, e11);
            }
        }
    }

    private synchronized byte[] getContents() {
        return this.encoded;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    void encode(ASN1OutputStream aSN1OutputStream, boolean z11) {
        byte[] contents = getContents();
        if (contents != null) {
            aSN1OutputStream.writeEncodingDL(z11, 48, contents);
        } else {
            super.toDLObject().encode(aSN1OutputStream, z11);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    int encodedLength(boolean z11) {
        byte[] contents = getContents();
        return contents != null ? ASN1OutputStream.getLengthOfEncodingDL(z11, contents.length) : super.toDLObject().encodedLength(z11);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Encodable getObjectAt(int i11) {
        force();
        return super.getObjectAt(i11);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public Enumeration getObjects() {
        byte[] contents = getContents();
        return contents != null ? new LazyConstructionEnumeration(contents) : super.getObjects();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        force();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.util.Iterable, java.lang.Iterable
    public Iterator<ASN1Encodable> iterator() {
        force();
        return super.iterator();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public int size() {
        force();
        return super.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1BitString toASN1BitString() {
        return ((ASN1Sequence) toDLObject()).toASN1BitString();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1External toASN1External() {
        return ((ASN1Sequence) toDLObject()).toASN1External();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1OctetString toASN1OctetString() {
        return ((ASN1Sequence) toDLObject()).toASN1OctetString();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1Set toASN1Set() {
        return ((ASN1Sequence) toDLObject()).toASN1Set();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public ASN1Encodable[] toArray() {
        force();
        return super.toArray();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    ASN1Encodable[] toArrayInternal() {
        force();
        return super.toArrayInternal();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDERObject() {
        force();
        return super.toDERObject();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    ASN1Primitive toDLObject() {
        force();
        return super.toDLObject();
    }
}
