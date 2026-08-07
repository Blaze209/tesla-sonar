package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class ASN1OutputStream {

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    private OutputStream f99346os;

    private class ImplicitOutputStream extends ASN1OutputStream {
        private boolean first;

        public ImplicitOutputStream(OutputStream outputStream) {
            super(outputStream);
            this.first = true;
        }

        @Override // org.spongycastle.asn1.ASN1OutputStream
        public void write(int i11) {
            if (this.first) {
                this.first = false;
            } else {
                super.write(i11);
            }
        }
    }

    public ASN1OutputStream(OutputStream outputStream) {
        this.f99346os = outputStream;
    }

    public void close() throws IOException {
        this.f99346os.close();
    }

    public void flush() throws IOException {
        this.f99346os.flush();
    }

    ASN1OutputStream getDERSubStream() {
        return new DEROutputStream(this.f99346os);
    }

    ASN1OutputStream getDLSubStream() {
        return new DLOutputStream(this.f99346os);
    }

    void write(int i11) {
        this.f99346os.write(i11);
    }

    void writeEncoded(int i11, byte[] bArr) {
        write(i11);
        writeLength(bArr.length);
        write(bArr);
    }

    void writeImplicitObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            throw new IOException("null object detected");
        }
        aSN1Primitive.encode(new ImplicitOutputStream(this.f99346os));
    }

    void writeLength(int i11) {
        if (i11 <= 127) {
            write((byte) i11);
            return;
        }
        int i12 = i11;
        int i13 = 1;
        while (true) {
            i12 >>>= 8;
            if (i12 == 0) {
                break;
            } else {
                i13++;
            }
        }
        write((byte) (i13 | 128));
        for (int i14 = (i13 - 1) * 8; i14 >= 0; i14 -= 8) {
            write((byte) (i11 >> i14));
        }
    }

    protected void writeNull() throws IOException {
        this.f99346os.write(5);
        this.f99346os.write(0);
    }

    public void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException("null object detected");
        }
        aSN1Encodable.toASN1Primitive().encode(this);
    }

    void writeTag(int i11, int i12) throws IOException {
        if (i12 < 31) {
            write(i11 | i12);
            return;
        }
        write(i11 | 31);
        if (i12 < 128) {
            write(i12);
            return;
        }
        byte[] bArr = new byte[5];
        int i13 = 4;
        bArr[4] = (byte) (i12 & 127);
        do {
            i12 >>= 7;
            i13--;
            bArr[i13] = (byte) ((i12 & 127) | 128);
        } while (i12 > 127);
        write(bArr, i13, 5 - i13);
    }

    void write(byte[] bArr) {
        this.f99346os.write(bArr);
    }

    void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f99346os.write(bArr, i11, i12);
    }

    void writeEncoded(int i11, int i12, byte[] bArr) throws IOException {
        writeTag(i11, i12);
        writeLength(bArr.length);
        write(bArr);
    }
}
