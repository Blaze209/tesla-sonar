package org.bouncycastle.util.io;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class LimitedBuffer extends OutputStream {
    private final byte[] buf;
    private int count = 0;

    public LimitedBuffer(int i11) {
        this.buf = new byte[i11];
    }

    public int copyTo(byte[] bArr, int i11) {
        System.arraycopy(this.buf, 0, bArr, i11, this.count);
        return this.count;
    }

    public int limit() {
        return this.buf.length;
    }

    public void reset() {
        this.count = 0;
    }

    public int size() {
        return this.count;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        byte[] bArr = this.buf;
        int i12 = this.count;
        this.count = i12 + 1;
        bArr[i12] = (byte) i11;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        System.arraycopy(bArr, 0, this.buf, this.count, bArr.length);
        this.count += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        System.arraycopy(bArr, i11, this.buf, this.count, i12);
        this.count += i12;
    }
}
