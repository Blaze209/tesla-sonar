package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f81978c = 0;
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f81979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f81980b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int iCompare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.f81980b.equals(offsetDateTime2.f81980b)) {
            iCompare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            iCompare = Long.compare(this.f81979a.r(this.f81980b), offsetDateTime2.f81979a.r(offsetDateTime2.f81980b));
            if (iCompare == 0) {
                iCompare = this.f81979a.f81969b.f81975d - offsetDateTime2.f81979a.f81969b.f81975d;
            }
        }
        return iCompare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f81966c;
        ZoneOffset zoneOffset = ZoneOffset.f81985g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.f81967d;
        ZoneOffset zoneOffset2 = ZoneOffset.f81984f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime s(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset zoneOffsetD = zoneId.s().d(instant);
        return new OffsetDateTime(LocalDateTime.J(instant.getEpochSecond(), instant.getNano(), zoneOffsetD), zoneOffsetD);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f81979a = localDateTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f81980b = zoneOffset;
    }

    public final OffsetDateTime B(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.f81979a == localDateTime && this.f81980b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.INSTANT_SECONDS && pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f81979a.j(pVar);
            }
            return ((j$.time.temporal.a) pVar).f82197b;
        }
        return pVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = l.f82170a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i11 == 2) {
                return this.f81980b.getTotalSeconds();
            }
            return this.f81979a.e(pVar);
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = l.f82170a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 1) {
                return this.f81979a.r(this.f81980b);
            }
            if (i11 == 2) {
                return this.f81980b.getTotalSeconds();
            }
            return this.f81979a.i(pVar);
        }
        return pVar.J(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.f81979a;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        if (localDate != null) {
            return B(this.f81979a.k(localDate), this.f81980b);
        }
        return (OffsetDateTime) localDate.c(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i11 = l.f82170a[aVar.ordinal()];
            if (i11 == 1) {
                return s(Instant.ofEpochSecond(j11, this.f81979a.f81969b.f81975d), this.f81980b);
            }
            if (i11 == 2) {
                return B(this.f81979a, ZoneOffset.ofTotalSeconds(aVar.f82197b.a(j11, aVar)));
            }
            return B(this.f81979a.d(j11, pVar), this.f81980b);
        }
        return (OffsetDateTime) pVar.P(this, j11);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime g(long j11, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            return B(this.f81979a.g(j11, rVar), this.f81980b);
        }
        return (OffsetDateTime) rVar.s(this, j11);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82217d || temporalQuery == j$.time.temporal.q.f82218e) {
            return this.f81980b;
        }
        if (temporalQuery == j$.time.temporal.q.f82214a) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.f82219f) {
            return this.f81979a.f81968a;
        }
        if (temporalQuery == j$.time.temporal.q.f82220g) {
            return this.f81979a.f81969b;
        }
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return j$.time.chrono.s.f82037c;
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(this.f81979a.f81968a.toEpochDay(), j$.time.temporal.a.EPOCH_DAY).d(this.f81979a.f81969b.V(), j$.time.temporal.a.NANO_OF_DAY).d(this.f81980b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.f81979a.equals(offsetDateTime.f81979a) && this.f81980b.equals(offsetDateTime.f81980b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f81979a.hashCode() ^ this.f81980b.hashCode();
    }

    public final String toString() {
        return this.f81979a.toString() + this.f81980b.toString();
    }

    private Object writeReplace() {
        return new o((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
