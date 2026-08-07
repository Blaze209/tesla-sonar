package j$.time.temporal;

import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface p {
    t E();

    long J(TemporalAccessor temporalAccessor);

    l P(l lVar, long j11);

    boolean isDateBased();

    boolean s(TemporalAccessor temporalAccessor);

    t w(TemporalAccessor temporalAccessor);

    default TemporalAccessor B(Map map, b0 b0Var, c0 c0Var) {
        return null;
    }
}
