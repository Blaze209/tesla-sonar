package vk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f119526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f119527b;

    public a(InputStream inputStream, int i11) {
        super(inputStream);
        inputStream.getClass();
        if (i11 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f119526a = i11;
        this.f119527b = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f119526a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i11);
            this.f119527b = this.f119526a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f119526a == 0) {
            return -1;
        }
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.f119526a--;
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f119527b == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f119526a = this.f119527b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j11, this.f119526a));
        this.f119526a = (int) (((long) this.f119526a) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f119526a;
        if (i13 == 0) {
            return -1;
        }
        int i14 = ((FilterInputStream) this).in.read(bArr, i11, Math.min(i12, i13));
        if (i14 > 0) {
            this.f119526a -= i14;
        }
        return i14;
    }
}
