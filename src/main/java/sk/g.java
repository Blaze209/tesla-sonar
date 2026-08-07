package sk;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class g extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f111322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f111323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tk.h<byte[]> f111324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f111325d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111326e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f111327f = false;

    public g(InputStream inputStream, byte[] bArr, tk.h<byte[]> hVar) {
        this.f111322a = (InputStream) pk.k.g(inputStream);
        this.f111323b = (byte[]) pk.k.g(bArr);
        this.f111324c = (tk.h) pk.k.g(hVar);
    }

    private boolean c() throws IOException {
        if (this.f111326e < this.f111325d) {
            return true;
        }
        int i11 = this.f111322a.read(this.f111323b);
        if (i11 <= 0) {
            return false;
        }
        this.f111325d = i11;
        this.f111326e = 0;
        return true;
    }

    private void n() throws IOException {
        if (this.f111327f) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        pk.k.i(this.f111326e <= this.f111325d);
        n();
        return (this.f111325d - this.f111326e) + this.f111322a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f111327f) {
            return;
        }
        this.f111327f = true;
        this.f111324c.a(this.f111323b);
        super.close();
    }

    protected void finalize() throws Throwable {
        if (!this.f111327f) {
            qk.a.m("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        pk.k.i(this.f111326e <= this.f111325d);
        n();
        if (!c()) {
            return -1;
        }
        byte[] bArr = this.f111323b;
        int i11 = this.f111326e;
        this.f111326e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        pk.k.i(this.f111326e <= this.f111325d);
        n();
        int i11 = this.f111325d;
        int i12 = this.f111326e;
        long j12 = i11 - i12;
        if (j12 >= j11) {
            this.f111326e = (int) (((long) i12) + j11);
            return j11;
        }
        this.f111326e = i11;
        return j12 + this.f111322a.skip(j11 - j12);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        pk.k.i(this.f111326e <= this.f111325d);
        n();
        if (!c()) {
            return -1;
        }
        int iMin = Math.min(this.f111325d - this.f111326e, i12);
        System.arraycopy(this.f111323b, this.f111326e, bArr, i11, iMin);
        this.f111326e += iMin;
        return iMin;
    }
}
