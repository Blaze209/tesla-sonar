package io.sentry.cache;

import io.sentry.h0;
import io.sentry.p5;

/* JADX INFO: loaded from: classes9.dex */
public interface g extends Iterable<p5> {
    void M1(p5 p5Var);

    @Deprecated
    void W2(p5 p5Var, h0 h0Var);

    default boolean f3(p5 p5Var, h0 h0Var) {
        W2(p5Var, h0Var);
        return true;
    }
}
