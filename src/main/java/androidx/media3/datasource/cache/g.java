package androidx.media3.datasource.cache;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
final class g extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9238a;

    public g(OutputStream outputStream) {
        super(outputStream);
    }

    public void c(OutputStream outputStream) {
        s7.a.h(this.f9238a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f9238a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f9238a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            q0.C1(th);
        }
    }

    public g(OutputStream outputStream, int i11) {
        super(outputStream, i11);
    }
}
