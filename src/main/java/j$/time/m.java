package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f82171c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f82172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f82173b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        if (this.f82173b.equals(mVar.f82173b)) {
            return this.f82172a.compareTo(mVar.f82172a);
        }
        int iCompare = Long.compare(this.f82172a.V() - (((long) this.f82173b.getTotalSeconds()) * 1000000000), mVar.f82172a.V() - (((long) mVar.f82173b.getTotalSeconds()) * 1000000000));
        return iCompare == 0 ? this.f82172a.compareTo(mVar.f82172a) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        ZoneOffset zoneOffset = ZoneOffset.f81985g;
        localTime.getClass();
        new m(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f81984f;
        localTime2.getClass();
        new m(localTime2, zoneOffset2);
    }

    public m(LocalTime localTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localTime, "time");
        this.f82172a = localTime;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f82173b = zoneOffset;
    }

    public final m w(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.f82172a == localTime && this.f82173b.equals(zoneOffset)) ? this : new m(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).S() || pVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f82172a.j(pVar);
            }
            return ((j$.time.temporal.a) pVar).f82197b;
        }
        return pVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f82173b.getTotalSeconds();
            }
            return this.f82172a.i(pVar);
        }
        return pVar.J(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (m) localDate.c(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
                return w(this.f82172a, ZoneOffset.ofTotalSeconds(aVar.f82197b.a(j11, aVar)));
            }
            return w(this.f82172a.d(j11, pVar), this.f82173b);
        }
        return (m) pVar.P(this, j11);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final m g(long j11, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            return w(this.f82172a.g(j11, rVar), this.f82173b);
        }
        return (m) rVar.s(this, j11);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82217d || temporalQuery == j$.time.temporal.q.f82218e) {
            return this.f82173b;
        }
        if (((temporalQuery == j$.time.temporal.q.f82214a) || (temporalQuery == j$.time.temporal.q.f82215b)) || temporalQuery == j$.time.temporal.q.f82219f) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.q.f82220g) {
            return this.f82172a;
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        return lVar.d(this.f82172a.V(), j$.time.temporal.a.NANO_OF_DAY).d(this.f82173b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f82172a.equals(mVar.f82172a) && this.f82173b.equals(mVar.f82173b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f82172a.hashCode() ^ this.f82173b.hashCode();
    }

    public final String toString() {
        return this.f82172a.toString() + this.f82173b.toString();
    }

    private Object writeReplace() {
        return new o((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
