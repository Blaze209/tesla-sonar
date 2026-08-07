package org.bouncycastle.jcajce.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.io.InvalidCipherTextIOException;

/* JADX INFO: loaded from: classes9.dex */
public class CipherInputStream extends FilterInputStream {
    private byte[] buf;
    private int bufOff;
    private final Cipher cipher;
    private boolean finalized;
    private final byte[] inputBuffer;
    private int maxBuf;

    public CipherInputStream(InputStream inputStream, Cipher cipher) {
        super(inputStream);
        this.inputBuffer = new byte[512];
        this.finalized = false;
        this.cipher = cipher;
    }

    private byte[] finaliseCipher() throws InvalidCipherTextIOException {
        try {
            if (this.finalized) {
                return null;
            }
            this.finalized = true;
            return this.cipher.doFinal();
        } catch (GeneralSecurityException e11) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e11);
        }
    }

    private int nextChunk() throws IOException {
        if (this.finalized) {
            return -1;
        }
        this.bufOff = 0;
        this.maxBuf = 0;
        while (true) {
            int i11 = this.maxBuf;
            if (i11 != 0) {
                return i11;
            }
            int i12 = ((FilterInputStream) this).in.read(this.inputBuffer);
            if (i12 == -1) {
                byte[] bArrFinaliseCipher = finaliseCipher();
                this.buf = bArrFinaliseCipher;
                if (bArrFinaliseCipher == null || bArrFinaliseCipher.length == 0) {
                    return -1;
                }
                int length = bArrFinaliseCipher.length;
                this.maxBuf = length;
                return length;
            }
            byte[] bArrUpdate = this.cipher.update(this.inputBuffer, 0, i12);
            this.buf = bArrUpdate;
            if (bArrUpdate != null) {
                this.maxBuf = bArrUpdate.length;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.maxBuf - this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InvalidCipherTextIOException {
        try {
            ((FilterInputStream) this).in.close();
            if (!this.finalized) {
                finaliseCipher();
            }
            this.bufOff = 0;
            this.maxBuf = 0;
        } catch (Throwable th2) {
            if (!this.finalized) {
                finaliseCipher();
            }
            throw th2;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        byte[] bArr = this.buf;
        int i11 = this.bufOff;
        this.bufOff = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j11, available());
        this.bufOff += iMin;
        return iMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (this.bufOff >= this.maxBuf && nextChunk() < 0) {
            return -1;
        }
        int iMin = Math.min(i12, available());
        System.arraycopy(this.buf, this.bufOff, bArr, i11, iMin);
        this.bufOff += iMin;
        return iMin;
    }
}
