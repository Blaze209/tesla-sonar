package nw;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import lw.h;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f95474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f95475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f95476c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f95478e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f95477d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f95479f = -1;

    public a(InputStream inputStream, h hVar, l lVar) {
        this.f95476c = lVar;
        this.f95474a = inputStream;
        this.f95475b = hVar;
        this.f95478e = hVar.e();
    }

    private void c(long j11) {
        long j12 = this.f95477d;
        if (j12 == -1) {
            this.f95477d = j11;
        } else {
            this.f95477d = j12 + j11;
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f95474a.available();
        } catch (IOException e11) {
            this.f95475b.x(this.f95476c.c());
            d.d(this.f95475b);
            throw e11;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        long jC = this.f95476c.c();
        if (this.f95479f == -1) {
            this.f95479f = jC;
        }
        try {
            this.f95474a.close();
            long j11 = this.f95477d;
            if (j11 != -1) {
                this.f95475b.v(j11);
            }
            long j12 = this.f95478e;
            if (j12 != -1) {
                this.f95475b.y(j12);
            }
            this.f95475b.x(this.f95479f);
            this.f95475b.b();
        } catch (IOException e11) {
            this.f95475b.x(this.f95476c.c());
            d.d(this.f95475b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f95474a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f95474a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int i11 = this.f95474a.read();
            long jC = this.f95476c.c();
            if (this.f95478e == -1) {
                this.f95478e = jC;
            }
            if (i11 != -1 || this.f95479f != -1) {
                c(1L);
                this.f95475b.v(this.f95477d);
                return i11;
            }
            this.f95479f = jC;
            this.f95475b.x(jC);
            this.f95475b.b();
            return i11;
        } catch (IOException e11) {
            this.f95475b.x(this.f95476c.c());
            d.d(this.f95475b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
            this.f95474a.reset();
        } catch (IOException e11) {
            this.f95475b.x(this.f95476c.c());
            d.d(this.f95475b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        try {
            long jSkip = this.f95474a.skip(j11);
            long jC = this.f95476c.c();
            if (this.f95478e == -1) {
                this.f95478e = jC;
            }
            if (jSkip == 0 && j11 != 0 && this.f95479f == -1) {
                this.f95479f = jC;
                this.f95475b.x(jC);
                return jSkip;
            }
            c(jSkip);
            this.f95475b.v(this.f95477d);
            return jSkip;
        } catch (IOException e11) {
            this.f95475b.x(this.f95476c.c());
            d.d(this.f95475b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            int i13 = this.f95474a.read(bArr, i11, i12);
            long jC = this.f95476c.c();
            if (this.f95478e == -1) {
                this.f95478e = jC;
            }
            if (i13 == -1 && this.f95479f == -1) {
                this.f95479f = jC;
                this.f95475b.x(jC);
                this.f95475b.b();
                return i13;
            }
            c(i13);
            this.f95475b.v(this.f95477d);
            return i13;
        } catch (IOException e11) {
            this.f95475b.x(this.f95476c.c());
            d.d(this.f95475b);
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int i11 = this.f95474a.read(bArr);
            long jC = this.f95476c.c();
            if (this.f95478e == -1) {
                this.f95478e = jC;
            }
            if (i11 == -1 && this.f95479f == -1) {
                this.f95479f = jC;
                this.f95475b.x(jC);
                this.f95475b.b();
                return i11;
            }
            c(i11);
            this.f95475b.v(this.f95477d);
            return i11;
        } catch (IOException e11) {
            this.f95475b.x(this.f95476c.c());
            d.d(this.f95475b);
            throw e11;
        }
    }
}
