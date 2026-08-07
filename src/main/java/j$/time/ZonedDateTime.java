package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.l, j$.time.chrono.i, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f81988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f81989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneId f81990c;

    public static ZonedDateTime B(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarS = zoneId.s();
        List listF = fVarS.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarS.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.R(Duration.w(bVar.f82249d.getTotalSeconds() - bVar.f82248c.getTotalSeconds(), 0).getSeconds());
            zoneOffset = bVar.f82249d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime w(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return s(instant.getEpochSecond(), instant.getNano(), zoneId);
    }

    public static ZonedDateTime s(long j11, int i11, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.s().d(Instant.ofEpochSecond(j11, i11));
        return new ZonedDateTime(LocalDateTime.J(j11, i11, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.f81988a = localDateTime;
        this.f81989b = zoneOffset;
        this.f81990c = zoneId;
    }

    public final ZonedDateTime J(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.f81989b) || !this.f81990c.s().f(this.f81988a).contains(zoneOffset)) ? this : new ZonedDateTime(this.f81988a, this.f81990c, zoneOffset);
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
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).f82197b;
            }
            return this.f81988a.j(pVar);
        }
        return pVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = u.f82242a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 1) {
                throw new j$.time.temporal.s("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i11 == 2) {
                return this.f81989b.getTotalSeconds();
            }
            return this.f81988a.e(pVar);
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i11 = u.f82242a[((j$.time.temporal.a) pVar).ordinal()];
            if (i11 == 1) {
                return toEpochSecond();
            }
            if (i11 == 2) {
                return this.f81989b.getTotalSeconds();
            }
            return this.f81988a.i(pVar);
        }
        return pVar.J(this);
    }

    @Override // j$.time.chrono.i
    public final ZoneOffset getOffset() {
        return this.f81989b;
    }

    @Override // j$.time.chrono.i
    public final ZoneId getZone() {
        return this.f81990c;
    }

    @Override // j$.time.chrono.i
    public final j$.time.chrono.i z(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f81990c.equals(zoneId) ? this : B(this.f81988a, zoneId, this.f81989b);
    }

    @Override // j$.time.chrono.i
    public final j$.time.chrono.d toLocalDateTime() {
        return this.f81988a;
    }

    @Override // j$.time.chrono.i
    public LocalDate toLocalDate() {
        return this.f81988a.f81968a;
    }

    @Override // j$.time.chrono.i
    public final LocalTime toLocalTime() {
        return this.f81988a.f81969b;
    }

    @Override // j$.time.chrono.i
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime k(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return B(LocalDateTime.E((LocalDate) mVar, this.f81988a.f81969b), this.f81990c, this.f81989b);
        }
        if (mVar instanceof LocalTime) {
            return B(LocalDateTime.E(this.f81988a.f81968a, (LocalTime) mVar), this.f81990c, this.f81989b);
        }
        if (mVar instanceof LocalDateTime) {
            return B((LocalDateTime) mVar, this.f81990c, this.f81989b);
        }
        if (mVar instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) mVar;
            return B(offsetDateTime.toLocalDateTime(), this.f81990c, offsetDateTime.f81980b);
        }
        if (mVar instanceof Instant) {
            Instant instant = (Instant) mVar;
            return s(instant.getEpochSecond(), instant.getNano(), this.f81990c);
        }
        if (mVar instanceof ZoneOffset) {
            return J((ZoneOffset) mVar);
        }
        return (ZonedDateTime) mVar.c(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i11 = u.f82242a[aVar.ordinal()];
            if (i11 == 1) {
                return s(j11, this.f81988a.f81969b.f81975d, this.f81990c);
            }
            if (i11 != 2) {
                return B(this.f81988a.d(j11, pVar), this.f81990c, this.f81989b);
            }
            return J(ZoneOffset.ofTotalSeconds(aVar.f82197b.a(j11, aVar)));
        }
        return (ZonedDateTime) pVar.P(this, j11);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime g(long j11, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) rVar;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return B(this.f81988a.g(j11, rVar), this.f81990c, this.f81989b);
            }
            LocalDateTime localDateTimeP = this.f81988a.g(j11, rVar);
            ZoneOffset zoneOffset = this.f81989b;
            ZoneId zoneId = this.f81990c;
            Objects.requireNonNull(localDateTimeP, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.s().f(localDateTimeP).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTimeP, zoneId, zoneOffset);
            }
            return s(localDateTimeP.r(zoneOffset), localDateTimeP.f81969b.f81975d, zoneId);
        }
        return (ZonedDateTime) rVar.s(this, j11);
    }

    @Override // j$.time.temporal.l
    public final j$.time.chrono.i a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82219f) {
            return toLocalDate();
        }
        return super.b(temporalQuery);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f81988a.equals(zonedDateTime.f81988a) && this.f81989b.equals(zonedDateTime.f81989b) && this.f81990c.equals(zonedDateTime.f81990c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f81988a.hashCode() ^ this.f81989b.hashCode()) ^ Integer.rotateLeft(this.f81990c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f81988a.toString() + this.f81989b.toString();
        ZoneOffset zoneOffset = this.f81989b;
        ZoneId zoneId = this.f81990c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new o((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
