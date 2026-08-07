package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class ASN1OutputStream {

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    private OutputStream f98508os;

    ASN1OutputStream(OutputStream outputStream) {
        this.f98508os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    static int getLengthOfDL(int i11) {
        if (i11 < 128) {
            return 1;
        }
        int i12 = 2;
        while (true) {
            i11 >>>= 8;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    static int getLengthOfEncodingDL(boolean z11, int i11) {
        return (z11 ? 1 : 0) + getLengthOfDL(i11) + i11;
    }

    static int getLengthOfIdentifier(int i11) {
        if (i11 < 31) {
            return 1;
        }
        int i12 = 2;
        while (true) {
            i11 >>>= 7;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public void close() throws IOException {
        this.f98508os.close();
    }

    public void flush() throws IOException {
        this.f98508os.flush();
    }

    void flushInternal() {
    }

    DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.f98508os);
    }

    DLOutputStream getDLSubStream() {
        return new DLOutputStream(this.f98508os);
    }

    final void write(int i11) throws IOException {
        this.f98508os.write(i11);
    }

    final void writeDL(int i11) throws IOException {
        if (i11 < 128) {
            write(i11);
            return;
        }
        int i12 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i13 = i12 - 1;
            bArr[i13] = (byte) i11;
            i11 >>>= 8;
            if (i11 == 0) {
                int i14 = i12 - 2;
                bArr[i14] = (byte) ((5 - i13) | 128);
                write(bArr, i14, 6 - i13);
                return;
            }
            i12 = i13;
        }
    }

    void writeElements(ASN1Encodable[] aSN1EncodableArr) {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().encode(this, true);
        }
    }

    final void writeEncodingDL(boolean z11, int i11, byte b11) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(1);
        write(b11);
    }

    final void writeEncodingIL(boolean z11, int i11, ASN1Encodable[] aSN1EncodableArr) throws IOException {
        writeIdentifier(z11, i11);
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    final void writeIdentifier(boolean z11, int i11) throws IOException {
        if (z11) {
            write(i11);
        }
    }

    public final void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Encodable.toASN1Primitive(), true);
        flushInternal();
    }

    void writePrimitive(ASN1Primitive aSN1Primitive, boolean z11) {
        aSN1Primitive.encode(this, z11);
    }

    void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.encode(this, true);
        }
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        if (str.equals("DER")) {
            return new DEROutputStream(outputStream);
        }
        return str.equals("DL") ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    final void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f98508os.write(bArr, i11, i12);
    }

    final void writeEncodingDL(boolean z11, int i11, byte b11, byte[] bArr, int i12, int i13) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(i13 + 1);
        write(b11);
        write(bArr, i12, i13);
    }

    final void writeIdentifier(boolean z11, int i11, int i12) throws IOException {
        if (z11) {
            if (i12 < 31) {
                write(i11 | i12);
                return;
            }
            byte[] bArr = new byte[6];
            int i13 = 5;
            bArr[5] = (byte) (i12 & 127);
            while (i12 > 127) {
                i12 >>>= 7;
                i13--;
                bArr[i13] = (byte) ((i12 & 127) | 128);
            }
            int i14 = i13 - 1;
            bArr[i14] = (byte) (31 | i11);
            write(bArr, i14, 6 - i14);
        }
    }

    public final void writeObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        writePrimitive(aSN1Primitive, true);
        flushInternal();
    }

    final void writeEncodingDL(boolean z11, int i11, int i12, byte[] bArr) throws IOException {
        writeIdentifier(z11, i11, i12);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    final void writeEncodingDL(boolean z11, int i11, byte[] bArr) {
        writeIdentifier(z11, i11);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    final void writeEncodingDL(boolean z11, int i11, byte[] bArr, int i12, int i13) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(i13);
        write(bArr, i12, i13);
    }

    final void writeEncodingDL(boolean z11, int i11, byte[] bArr, int i12, int i13, byte b11) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(i13 + 1);
        write(bArr, i12, i13);
        write(b11);
    }
}
