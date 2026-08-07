package j$.time;

import com.google.android.gms.nearby.messages.Strategy;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.l, j$.time.temporal.m, Comparable<Instant>, Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81962b;
    public static final Instant EPOCH = new Instant(0, 0);
    public static final Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static Instant now() {
        a.f81991b.getClass();
        return ofEpochMilli(System.currentTimeMillis());
    }

    public static Instant ofEpochSecond(long j11, long j12) {
        return s(Math.addExact(j11, Math.floorDiv(j12, 1000000000L)), (int) Math.floorMod(j12, 1000000000L));
    }

    public static Instant ofEpochMilli(long j11) {
        long j12 = 1000;
        return s(Math.floorDiv(j11, j12), ((int) Math.floorMod(j11, j12)) * 1000000);
    }

    public static Instant w(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof Instant) {
            return (Instant) temporalAccessor;
        }
        Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.i(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.e(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (DateTimeException e11) {
            throw new DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e11);
        }
    }

    public static Instant s(long j11, int i11) {
        if ((((long) i11) | j11) == 0) {
            return EPOCH;
        }
        if (j11 < -31557014167219200L || j11 > 31556889864403199L) {
            throw new DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j11, i11);
    }

    public Instant(long j11, int i11) {
        this.f81961a = j11;
        this.f81962b = i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.NANO_OF_SECOND || pVar == j$.time.temporal.a.MICRO_OF_SECOND || pVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return super.j(pVar).a(pVar.J(this), pVar);
        }
        int i11 = d.f82052a[((j$.time.temporal.a) pVar).ordinal()];
        if (i11 == 1) {
            return this.f81962b;
        }
        if (i11 == 2) {
            return this.f81962b / 1000;
        }
        if (i11 == 3) {
            return this.f81962b / 1000000;
        }
        if (i11 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f82197b.a(this.f81961a, aVar);
        }
        throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        int i11;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.J(this);
        }
        int i12 = d.f82052a[((j$.time.temporal.a) pVar).ordinal()];
        if (i12 == 1) {
            i11 = this.f81962b;
        } else if (i12 == 2) {
            i11 = this.f81962b / 1000;
        } else {
            if (i12 != 3) {
                if (i12 == 4) {
                    return this.f81961a;
                }
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
            }
            i11 = this.f81962b / 1000000;
        }
        return i11;
    }

    public long getEpochSecond() {
        return this.f81961a;
    }

    public int getNano() {
        return this.f81962b;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (Instant) localDate.c(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l d(long j11, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (Instant) pVar.P(this, j11);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.R(j11);
        int i11 = d.f82052a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                int i12 = ((int) j11) * 1000;
                if (i12 != this.f81962b) {
                    return s(this.f81961a, i12);
                }
            } else if (i11 == 3) {
                int i13 = ((int) j11) * 1000000;
                if (i13 != this.f81962b) {
                    return s(this.f81961a, i13);
                }
            } else {
                if (i11 != 4) {
                    throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
                }
                if (j11 != this.f81961a) {
                    return s(j11, this.f81962b);
                }
            }
        } else if (j11 != this.f81962b) {
            return s(this.f81961a, (int) j11);
        }
        return this;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final Instant g(long j11, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (Instant) rVar.s(this, j11);
        }
        switch (d.f82053b[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return B(0L, j11);
            case 2:
                return B(j11 / 1000000, (j11 % 1000000) * 1000);
            case 3:
                return plusMillis(j11);
            case 4:
                return B(j11, 0L);
            case 5:
                return B(Math.multiplyExact(j11, 60), 0L);
            case 6:
                return B(Math.multiplyExact(j11, 3600), 0L);
            case 7:
                return B(Math.multiplyExact(j11, 43200), 0L);
            case 8:
                return B(Math.multiplyExact(j11, Strategy.TTL_SECONDS_MAX), 0L);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public Instant plusMillis(long j11) {
        return B(j11 / 1000, (j11 % 1000) * 1000000);
    }

    public final Instant B(long j11, long j12) {
        if ((j11 | j12) == 0) {
            return this;
        }
        return ofEpochSecond(Math.addExact(Math.addExact(this.f81961a, j11), j12 / 1000000000), ((long) this.f81962b) + (j12 % 1000000000));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.NANOS;
        }
        if (temporalQuery == j$.time.temporal.q.f82215b || temporalQuery == j$.time.temporal.q.f82214a || temporalQuery == j$.time.temporal.q.f82218e || temporalQuery == j$.time.temporal.q.f82217d || temporalQuery == j$.time.temporal.q.f82219f || temporalQuery == j$.time.temporal.q.f82220g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(this.f81961a, j$.time.temporal.a.INSTANT_SECONDS).d(this.f81962b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.s(this, zoneOffset);
    }

    public ZonedDateTime atZone(ZoneId zoneId) {
        return ZonedDateTime.w(this, zoneId);
    }

    public long toEpochMilli() {
        long j11 = this.f81961a;
        return (j11 >= 0 || this.f81962b <= 0) ? Math.addExact(Math.multiplyExact(j11, 1000), this.f81962b / 1000000) : Math.addExact(Math.multiplyExact(j11 + 1, 1000), (this.f81962b / 1000000) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(Instant instant) {
        int iCompare = Long.compare(this.f81961a, instant.f81961a);
        return iCompare != 0 ? iCompare : this.f81962b - instant.f81962b;
    }

    public boolean isAfter(Instant instant) {
        return compareTo(instant) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f81961a == instant.f81961a && this.f81962b == instant.f81962b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f81961a;
        return (this.f81962b * 51) + ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return DateTimeFormatter.f82058h.format(this);
    }

    private Object writeReplace() {
        return new o((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
