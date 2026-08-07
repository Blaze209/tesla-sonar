package ss;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f111655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f111656b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f111660f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f111658d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f111659e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f111657c = new byte[1];

    public j(i iVar, l lVar) {
        this.f111655a = iVar;
        this.f111656b = lVar;
    }

    private void c() {
        if (this.f111658d) {
            return;
        }
        this.f111655a.j(this.f111656b);
        this.f111658d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f111659e) {
            return;
        }
        this.f111655a.close();
        this.f111659e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f111657c) == -1) {
            return -1;
        }
        return this.f111657c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        ts.a.g(!this.f111659e);
        c();
        int i13 = this.f111655a.read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        this.f111660f += (long) i13;
        return i13;
    }
}
