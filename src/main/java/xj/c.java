package xj;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f123594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f123595b;

    private c(@NonNull InputStream inputStream, long j11) {
        super(inputStream);
        this.f123594a = j11;
    }

    private int c(int i11) throws IOException {
        if (i11 >= 0) {
            this.f123595b += i11;
            return i11;
        }
        if (this.f123594a - ((long) this.f123595b) <= 0) {
            return i11;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f123594a + ", but read: " + this.f123595b);
    }

    @NonNull
    public static InputStream n(@NonNull InputStream inputStream, long j11) {
        return new c(inputStream, j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f123594a - ((long) this.f123595b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int i11;
        i11 = super.read();
        c(i11 >= 0 ? 1 : -1);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) {
        return c(super.read(bArr, i11, i12));
    }
}
