package um;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public interface e extends Closeable, m, tk.d, am.a {
    boolean J3();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    boolean isClosed();

    p o3();

    int v();

    m z();
}
