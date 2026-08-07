package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoLocalDate extends j$.time.temporal.l, j$.time.temporal.m, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    l getChronology();

    int hashCode();

    String toString();

    default d F(LocalTime localTime) {
        return new f(this, localTime);
    }

    default m H() {
        return getChronology().x(e(j$.time.temporal.a.ERA));
    }

    default boolean t() {
        return getChronology().Q(i(j$.time.temporal.a.YEAR));
    }

    default int O() {
        return t() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate k(j$.time.temporal.m mVar) {
        return c.s(getChronology(), mVar.c(this));
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
        return c.s(getChronology(), pVar.P(this, j11));
    }

    default ChronoLocalDate L(j$.time.temporal.o oVar) {
        return c.s(getChronology(), oVar.s(this));
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate g(long j11, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
        return c.s(getChronology(), rVar.s(this, j11));
    }

    @Override // j$.time.temporal.l
    default ChronoLocalDate a(long j11, j$.time.temporal.r rVar) {
        return c.s(getChronology(), super.a(j11, rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82214a || temporalQuery == j$.time.temporal.q.f82218e || temporalQuery == j$.time.temporal.q.f82217d || temporalQuery == j$.time.temporal.q.f82220g) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return getChronology();
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.DAYS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    default j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(toEpochDay(), j$.time.temporal.a.EPOCH_DAY);
    }

    default long toEpochDay() {
        return i(j$.time.temporal.a.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(toEpochDay(), chronoLocalDate.toEpochDay());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((a) getChronology()).m().compareTo(chronoLocalDate.getChronology().m());
    }
}
