package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends TemporalAccessor, j$.time.temporal.m {
    int getValue();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int e(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ERA) {
            return getValue();
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
        return pVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.ERAS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.m
    default j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
