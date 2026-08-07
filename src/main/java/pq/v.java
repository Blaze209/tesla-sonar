package pq;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
abstract class v implements Closeable {

    interface a {
        a a(Context context);

        v build();
    }

    v() {
    }

    abstract xq.d c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        c().close();
    }

    abstract u n();
}
