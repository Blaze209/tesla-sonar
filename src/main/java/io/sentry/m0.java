package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public interface m0 extends Closeable {

    public enum a {
        UNKNOWN,
        CONNECTED,
        DISCONNECTED,
        NO_PERMISSION
    }

    public interface b {
        void B(a aVar);
    }

    String X();

    a q0();

    boolean s3(b bVar);

    void z1(b bVar);
}
