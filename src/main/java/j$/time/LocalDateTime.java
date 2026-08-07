package j$.time;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.nearby.messages.Strategy;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.l, j$.time.temporal.m, j$.time.chrono.d, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f81966c = E(LocalDate.MIN, LocalTime.MIN);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f81967d = E(LocalDate.MAX, LocalTime.MAX);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f81968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalTime f81969b;

    @Override // j$.time.chrono.d
    public final j$.time.chrono.i A(ZoneId zoneId) {
        return ZonedDateTime.B(this, zoneId, null);
    }

    public static LocalDateTime E(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, InquiryField.DateField.TYPE);
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    public static LocalDateTime J(long j11, int i11, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j12 = i11;
        j$.time.temporal.a.NANO_OF_SECOND.R(j12);
        long totalSeconds = j11 + ((long) zoneOffset.getTotalSeconds());
        long j13 = Strategy.TTL_SECONDS_MAX;
        return new LocalDateTime(LocalDate.ofEpochDay(Math.floorDiv(totalSeconds, j13)), LocalTime.E((((long) ((int) Math.floorMod(totalSeconds, j13))) * 1000000000) + j12));
    }

    public static LocalDateTime w(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (!(temporalAccessor instanceof ZonedDateTime)) {
            if (temporalAccessor instanceof OffsetDateTime) {
                return ((OffsetDateTime) temporalAccessor).toLocalDateTime();
            }
            try {
                return new LocalDateTime(LocalDate.B(temporalAccessor), LocalTime.w(temporalAccessor));
            } catch (DateTimeException e11) {
                throw new DateTimeException("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e11);
            }
        }
        return ((ZonedDateTime) temporalAccessor).f81988a;
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.f81968a = localDate;
        this.f81969b = localTime;
    }

    public final LocalDateTime U(LocalDate localDate, LocalTime localTime) {
        return (this.f81968a == localDate && this.f81969b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.s(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.isDateBased() || aVar.S();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).S() ? this.f81969b.j(pVar) : this.f81968a.j(pVar);
        }
        return pVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).S() ? this.f81969b.e(pVar) : this.f81968a.e(pVar);
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).S() ? this.f81969b.i(pVar) : this.f81968a.i(pVar);
        }
        return pVar.J(this);
    }

    @Override // j$.time.chrono.d
    public final ChronoLocalDate toLocalDate() {
        return this.f81968a;
    }

    @Override // j$.time.chrono.d
    public final LocalTime toLocalTime() {
        return this.f81969b;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime k(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return U((LocalDate) mVar, this.f81969b);
        }
        if (mVar instanceof LocalTime) {
            return U(this.f81968a, (LocalTime) mVar);
        }
        if (mVar instanceof LocalDateTime) {
            return (LocalDateTime) mVar;
        }
        return (LocalDateTime) mVar.c(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).S()) {
                return U(this.f81968a, this.f81969b.d(j11, pVar));
            }
            return U(this.f81968a.d(j11, pVar), this.f81969b);
        }
        return (LocalDateTime) pVar.P(this, j11);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime g(long j11, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (LocalDateTime) rVar.s(this, j11);
        }
        switch (g.f82162a[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return S(this.f81968a, 0L, 0L, 0L, j11);
            case 2:
                LocalDateTime localDateTimeU = U(this.f81968a.W(j11 / 86400000000L), this.f81969b);
                return localDateTimeU.S(localDateTimeU.f81968a, 0L, 0L, 0L, (j11 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimeU2 = U(this.f81968a.W(j11 / CoreConstants.MILLIS_IN_ONE_DAY), this.f81969b);
                return localDateTimeU2.S(localDateTimeU2.f81968a, 0L, 0L, 0L, (j11 % CoreConstants.MILLIS_IN_ONE_DAY) * 1000000);
            case 4:
                return R(j11);
            case 5:
                return S(this.f81968a, 0L, j11, 0L, 0L);
            case 6:
                return S(this.f81968a, j11, 0L, 0L, 0L);
            case 7:
                LocalDateTime localDateTimeU3 = U(this.f81968a.W(j11 / 256), this.f81969b);
                return localDateTimeU3.S(localDateTimeU3.f81968a, (j11 % 256) * 12, 0L, 0L, 0L);
            default:
                return U(this.f81968a.g(j11, rVar), this.f81969b);
        }
    }

    public final LocalDateTime R(long j11) {
        return S(this.f81968a, 0L, 0L, j11, 0L);
    }

    @Override // j$.time.temporal.l
    public final j$.time.chrono.d a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    public final LocalDateTime S(LocalDate localDate, long j11, long j12, long j13, long j14) {
        if ((j11 | j12 | j13 | j14) == 0) {
            return U(localDate, this.f81969b);
        }
        long j15 = 1;
        long jV = this.f81969b.V();
        long j16 = ((((j11 % 24) * 3600000000000L) + ((j12 % 1440) * 60000000000L) + ((j13 % 86400) * 1000000000) + (j14 % 86400000000000L)) * j15) + jV;
        long jFloorDiv = Math.floorDiv(j16, 86400000000000L) + (((j11 / 24) + (j12 / 1440) + (j13 / 86400) + (j14 / 86400000000000L)) * j15);
        long jFloorMod = Math.floorMod(j16, 86400000000000L);
        return U(localDate.W(jFloorDiv), jFloorMod == jV ? this.f81969b : LocalTime.E(jFloorMod));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82219f) {
            return this.f81968a;
        }
        return super.b(temporalQuery);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.d, java.lang.Comparable
    /* JADX INFO: renamed from: I */
    public final int compareTo(j$.time.chrono.d dVar) {
        if (dVar instanceof LocalDateTime) {
            return s((LocalDateTime) dVar);
        }
        return super.compareTo(dVar);
    }

    public final int s(LocalDateTime localDateTime) {
        int iS = this.f81968a.s(localDateTime.f81968a);
        return iS == 0 ? this.f81969b.compareTo(localDateTime.f81969b) : iS;
    }

    public final boolean B(j$.time.chrono.d dVar) {
        if (dVar instanceof LocalDateTime) {
            return s((LocalDateTime) dVar) < 0;
        }
        long epochDay = this.f81968a.toEpochDay();
        long epochDay2 = dVar.toLocalDate().toEpochDay();
        if (epochDay >= epochDay2) {
            return epochDay == epochDay2 && this.f81969b.V() < dVar.toLocalTime().V();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f81968a.equals(localDateTime.f81968a) && this.f81969b.equals(localDateTime.f81969b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f81968a.hashCode() ^ this.f81969b.hashCode();
    }

    public final String toString() {
        return this.f81968a.toString() + "T" + this.f81969b.toString();
    }

    private Object writeReplace() {
        return new o((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
