package io.sentry.transport;

import io.sentry.h0;
import io.sentry.p5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes9.dex */
public interface q extends Closeable {
    void a(boolean z11);

    void a0(p5 p5Var, h0 h0Var);

    void b(long j11);

    default boolean k() {
        return true;
    }

    a0 q();

    default void x3(p5 p5Var) {
        a0(p5Var, new h0());
    }
}
