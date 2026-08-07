package v7;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class h extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f118095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f118096b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f118100f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f118098d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f118099e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f118097c = new byte[1];

    public h(androidx.media3.datasource.a aVar, j jVar) {
        this.f118095a = aVar;
        this.f118096b = jVar;
    }

    private void c() {
        if (this.f118098d) {
            return;
        }
        this.f118095a.j(this.f118096b);
        this.f118098d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f118099e) {
            return;
        }
        this.f118095a.close();
        this.f118099e = true;
    }

    public void n() {
        c();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f118097c) == -1) {
            return -1;
        }
        return this.f118097c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        s7.a.h(!this.f118099e);
        c();
        int i13 = this.f118095a.read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        this.f118100f += (long) i13;
        return i13;
    }
}
