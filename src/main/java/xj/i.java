package xj;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class i extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f123610a;

    public i(@NonNull InputStream inputStream) {
        super(inputStream);
        this.f123610a = Integer.MIN_VALUE;
    }

    private long c(long j11) {
        int i11 = this.f123610a;
        if (i11 == 0) {
            return -1L;
        }
        return (i11 == Integer.MIN_VALUE || j11 <= ((long) i11)) ? j11 : i11;
    }

    private void n(long j11) {
        int i11 = this.f123610a;
        if (i11 == Integer.MIN_VALUE || j11 == -1) {
            return;
        }
        this.f123610a = (int) (((long) i11) - j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i11 = this.f123610a;
        return i11 == Integer.MIN_VALUE ? super.available() : Math.min(i11, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        super.mark(i11);
        this.f123610a = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (c(1L) == -1) {
            return -1;
        }
        int i11 = super.read();
        n(1L);
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f123610a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        long jC = c(j11);
        if (jC == -1) {
            return 0L;
        }
        long jSkip = super.skip(jC);
        n(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int iC = (int) c(i12);
        if (iC == -1) {
            return -1;
        }
        int i13 = super.read(bArr, i11, iC);
        n(i13);
        return i13;
    }
}
