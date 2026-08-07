package pk;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class c extends FilterOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103127a;

    public c(OutputStream outputStream) {
        super(outputStream);
        this.f103127a = 0L;
    }

    public long c() {
        return this.f103127a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
        this.f103127a += (long) i12;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11);
        this.f103127a++;
    }
}
