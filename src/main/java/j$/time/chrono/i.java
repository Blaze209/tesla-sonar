package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;

/* JADX INFO: loaded from: classes2.dex */
public interface i extends j$.time.temporal.l, Comparable {
    ZoneOffset getOffset();

    ZoneId getZone();

    d toLocalDateTime();

    i z(ZoneId zoneId);

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return toLocalDateTime().j(pVar);
            }
            return ((j$.time.temporal.a) pVar).f82197b;
        }
        return pVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = h.f82012a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i11 == 2) {
                return getOffset().getTotalSeconds();
            }
            return toLocalDateTime().e(pVar);
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = h.f82012a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 1) {
                return toEpochSecond();
            }
            if (i11 == 2) {
                return getOffset().getTotalSeconds();
            }
            return toLocalDateTime().i(pVar);
        }
        return pVar.J(this);
    }

    default ChronoLocalDate toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    default LocalTime toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    default l getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.l
    default i k(j$.time.temporal.m mVar) {
        return k.s(getChronology(), mVar.c(this));
    }

    @Override // j$.time.temporal.l
    default i a(long j11, j$.time.temporal.r rVar) {
        return k.s(getChronology(), super.a(j11, rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82218e || temporalQuery == j$.time.temporal.q.f82214a) {
            return getZone();
        }
        if (temporalQuery == j$.time.temporal.q.f82217d) {
            return getOffset();
        }
        if (temporalQuery == j$.time.temporal.q.f82220g) {
            return toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return getChronology();
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    default long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) getOffset().getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    default int compareTo(i iVar) {
        int iCompare = Long.compare(toEpochSecond(), iVar.toEpochSecond());
        return (iCompare == 0 && (iCompare = toLocalTime().f81975d - iVar.toLocalTime().f81975d) == 0 && (iCompare = toLocalDateTime().compareTo(iVar.toLocalDateTime())) == 0 && (iCompare = getZone().m().compareTo(iVar.getZone().m())) == 0) ? ((a) getChronology()).m().compareTo(iVar.getChronology().m()) : iCompare;
    }
}
