package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes9.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    DefiniteLengthInputStream(InputStream inputStream, int i11, int i12) {
        super(inputStream, i12);
        if (i11 <= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative lengths not allowed");
            }
            setParentEofDetect(true);
        }
        this._originalLength = i11;
        this._remaining = i11;
    }

    int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int i11 = this._in.read();
        if (i11 >= 0) {
            int i12 = this._remaining - 1;
            this._remaining = i12;
            if (i12 == 0) {
                setParentEofDetect(true);
            }
            return i11;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    void readAllIntoByteArray(byte[] bArr) throws IOException {
        int i11 = this._remaining;
        if (i11 != bArr.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i11 == 0) {
            return;
        }
        int limit = getLimit();
        int i12 = this._remaining;
        if (i12 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        int fully = i12 - Streams.readFully(this._in, bArr, 0, bArr.length);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    byte[] toByteArray() throws IOException {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        int limit = getLimit();
        int i11 = this._remaining;
        if (i11 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        byte[] bArr = new byte[i11];
        int fully = i11 - Streams.readFully(this._in, bArr, 0, i11);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this._remaining;
        if (i13 == 0) {
            return -1;
        }
        int i14 = this._in.read(bArr, i11, Math.min(i12, i13));
        if (i14 >= 0) {
            int i15 = this._remaining - i14;
            this._remaining = i15;
            if (i15 == 0) {
                setParentEofDetect(true);
            }
            return i14;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }
}
