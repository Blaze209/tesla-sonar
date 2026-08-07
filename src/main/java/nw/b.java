package nw;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.OutputStream;
import lw.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f95480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f95481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    h f95482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f95483d = -1;

    public b(OutputStream outputStream, h hVar, l lVar) {
        this.f95480a = outputStream;
        this.f95482c = hVar;
        this.f95481b = lVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long j11 = this.f95483d;
        if (j11 != -1) {
            this.f95482c.r(j11);
        }
        this.f95482c.w(this.f95481b.c());
        try {
            this.f95480a.close();
        } catch (IOException e11) {
            this.f95482c.x(this.f95481b.c());
            d.d(this.f95482c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.f95480a.flush();
        } catch (IOException e11) {
            this.f95482c.x(this.f95481b.c());
            d.d(this.f95482c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        try {
            this.f95480a.write(i11);
            long j11 = this.f95483d + 1;
            this.f95483d = j11;
            this.f95482c.r(j11);
        } catch (IOException e11) {
            this.f95482c.x(this.f95481b.c());
            d.d(this.f95482c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.f95480a.write(bArr);
            long length = this.f95483d + ((long) bArr.length);
            this.f95483d = length;
            this.f95482c.r(length);
        } catch (IOException e11) {
            this.f95482c.x(this.f95481b.c());
            d.d(this.f95482c);
            throw e11;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        try {
            this.f95480a.write(bArr, i11, i12);
            long j11 = this.f95483d + ((long) i12);
            this.f95483d = j11;
            this.f95482c.r(j11);
        } catch (IOException e11) {
            this.f95482c.x(this.f95481b.c());
            d.d(this.f95482c);
            throw e11;
        }
    }
}
