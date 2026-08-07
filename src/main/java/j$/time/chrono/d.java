package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface d extends j$.time.temporal.l, j$.time.temporal.m, Comparable {
    i A(ZoneId zoneId);

    ChronoLocalDate toLocalDate();

    LocalTime toLocalTime();

    default l getChronology() {
        return toLocalDate().getChronology();
    }

    @Override // j$.time.temporal.l
    default d a(long j11, j$.time.temporal.r rVar) {
        return f.s(getChronology(), super.a(j11, rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82214a || temporalQuery == j$.time.temporal.q.f82218e || temporalQuery == j$.time.temporal.q.f82217d) {
            return null;
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

    @Override // j$.time.temporal.m
    default j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(toLocalDate().toEpochDay(), j$.time.temporal.a.EPOCH_DAY).d(toLocalTime().V(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long r(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) zoneOffset.getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    default int compareTo(d dVar) {
        int iCompareTo = toLocalDate().compareTo(dVar.toLocalDate());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(dVar.toLocalTime())) == 0) ? ((a) getChronology()).m().compareTo(dVar.getChronology().m()) : iCompareTo;
    }
}
