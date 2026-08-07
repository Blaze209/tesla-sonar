package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
class IndefiniteLengthInputStream extends LimitedInputStream {
    private int _b1;
    private int _b2;
    private boolean _eofOn00;
    private boolean _eofReached;

    IndefiniteLengthInputStream(InputStream inputStream, int i11) throws IOException {
        super(inputStream, i11);
        this._eofReached = false;
        this._eofOn00 = true;
        this._b1 = inputStream.read();
        int i12 = inputStream.read();
        this._b2 = i12;
        if (i12 < 0) {
            throw new EOFException();
        }
        checkForEof();
    }

    private boolean checkForEof() {
        if (!this._eofReached && this._eofOn00 && this._b1 == 0 && this._b2 == 0) {
            this._eofReached = true;
            setParentEofDetect(true);
        }
        return this._eofReached;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (checkForEof()) {
            return -1;
        }
        int i11 = this._in.read();
        if (i11 < 0) {
            throw new EOFException();
        }
        int i12 = this._b1;
        this._b1 = this._b2;
        this._b2 = i11;
        return i12;
    }

    void setEofOn00(boolean z11) {
        this._eofOn00 = z11;
        checkForEof();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (this._eofOn00 || i12 < 3) {
            return super.read(bArr, i11, i12);
        }
        if (this._eofReached) {
            return -1;
        }
        int i13 = this._in.read(bArr, i11 + 2, i12 - 2);
        if (i13 < 0) {
            throw new EOFException();
        }
        bArr[i11] = (byte) this._b1;
        bArr[i11 + 1] = (byte) this._b2;
        this._b1 = this._in.read();
        int i14 = this._in.read();
        this._b2 = i14;
        if (i14 >= 0) {
            return i13 + 2;
        }
        throw new EOFException();
    }
}
