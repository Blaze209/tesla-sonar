package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class BEROctetStringGenerator extends BERGenerator {
    public BEROctetStringGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new BufferedBEROctetStream(bArr);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i11, boolean z11) throws IOException {
        super(outputStream, i11, z11);
        writeBERHeader(36);
    }

    private class BufferedBEROctetStream extends OutputStream {
        private byte[] _buf;
        private DEROutputStream _derOut;
        private int _off = 0;

        BufferedBEROctetStream(byte[] bArr) {
            this._buf = bArr;
            this._derOut = new DEROutputStream(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i11 = this._off;
            if (i11 != 0) {
                byte[] bArr = new byte[i11];
                System.arraycopy(this._buf, 0, bArr, 0, i11);
                DEROctetString.encode(this._derOut, bArr);
            }
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            byte[] bArr = this._buf;
            int i12 = this._off;
            int i13 = i12 + 1;
            this._off = i13;
            bArr[i12] = (byte) i11;
            if (i13 == bArr.length) {
                DEROctetString.encode(this._derOut, bArr);
                this._off = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) {
            while (i12 > 0) {
                int iMin = Math.min(i12, this._buf.length - this._off);
                System.arraycopy(bArr, i11, this._buf, this._off, iMin);
                int i13 = this._off + iMin;
                this._off = i13;
                byte[] bArr2 = this._buf;
                if (i13 < bArr2.length) {
                    return;
                }
                DEROctetString.encode(this._derOut, bArr2);
                this._off = 0;
                i11 += iMin;
                i12 -= iMin;
            }
        }
    }
}
