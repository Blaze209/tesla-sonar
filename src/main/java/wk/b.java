package wk;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    @pk.d
    default long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @pk.d
    long nowNanos();
}
