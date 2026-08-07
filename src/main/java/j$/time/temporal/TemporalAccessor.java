package j$.time.temporal;

import j$.time.DateTimeException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {
    boolean h(p pVar);

    long i(p pVar);

    default t j(p pVar) {
        if (!(pVar instanceof a)) {
            Objects.requireNonNull(pVar, "field");
            return pVar.w(this);
        }
        if (h(pVar)) {
            return ((a) pVar).f82197b;
        }
        throw new s(j$.time.c.a("Unsupported field: ", pVar));
    }

    default int e(p pVar) {
        t tVarJ = j(pVar);
        if (!tVarJ.d()) {
            throw new s("Invalid field " + pVar + " for get() method, use getLong() instead");
        }
        long jI = i(pVar);
        if (tVarJ.e(jI)) {
            return (int) jI;
        }
        throw new DateTimeException("Invalid value for " + pVar + " (valid values " + tVarJ + "): " + jI);
    }

    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == q.f82214a || temporalQuery == q.f82215b || temporalQuery == q.f82216c) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }
}
