package net.time4j;

import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements Serializable {
    private static final long serialVersionUID = -4124961309622141228L;
    private final long days;
    private final h0 time;

    k(long j11, h0 h0Var) {
        this.days = j11;
        this.time = h0Var;
    }

    public long a() {
        return this.days;
    }

    public h0 b() {
        return this.time;
    }
}
