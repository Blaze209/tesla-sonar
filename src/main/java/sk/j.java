package sk;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;
import pk.p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends OutputStream {
    public abstract PooledByteBuffer c();

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws X {
        try {
            super.close();
        } catch (IOException e11) {
            p.a(e11);
        }
    }

    public abstract int size();
}
