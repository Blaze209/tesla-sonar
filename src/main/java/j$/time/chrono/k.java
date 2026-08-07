package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements i, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient f f82017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ZoneOffset f82018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient ZoneId f82019c;

    public static k w(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, fVar);
        }
        j$.time.zone.f fVarS = zoneId.s();
        LocalDateTime localDateTimeW = LocalDateTime.w(fVar);
        List listF = fVarS.f(localDateTimeW);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            fVar = fVar;
        } else {
            Object objE = fVarS.e(localDateTimeW);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            fVar = fVar.B(fVar.f82003a, 0L, 0L, Duration.w(bVar.f82249d.getTotalSeconds() - bVar.f82248c.getTotalSeconds(), 0).getSeconds(), 0L);
            zoneOffset = bVar.f82249d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, fVar);
    }

    public static k B(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.s().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new k(zoneId, zoneOffsetD, (f) lVar.D(LocalDateTime.J(instant.getEpochSecond(), instant.getNano(), zoneOffsetD)));
    }

    public static k s(l lVar, j$.time.temporal.l lVar2) {
        k kVar = (k) lVar2;
        if (lVar.equals(kVar.getChronology())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.m() + ", actual: " + kVar.getChronology().m());
    }

    public k(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "dateTime");
        this.f82017a = fVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f82018b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f82019c = zoneId;
    }

    @Override // j$.time.chrono.i
    public final ZoneOffset getOffset() {
        return this.f82018b;
    }

    public final int hashCode() {
        return (this.f82017a.hashCode() ^ this.f82018b.hashCode()) ^ Integer.rotateLeft(this.f82019c.hashCode(), 3);
    }

    @Override // j$.time.chrono.i
    public final d toLocalDateTime() {
        return this.f82017a;
    }

    public final String toString() {
        String str = this.f82017a.toString() + this.f82018b.toString();
        ZoneOffset zoneOffset = this.f82018b;
        ZoneId zoneId = this.f82019c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.chrono.i
    public final ZoneId getZone() {
        return this.f82019c;
    }

    @Override // j$.time.chrono.i
    public final i z(ZoneId zoneId) {
        return w(zoneId, this.f82018b, this.f82017a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return true;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i11 = j.f82015a[aVar.ordinal()];
            if (i11 == 1) {
                return g(j11 - toEpochSecond(), ChronoUnit.SECONDS);
            }
            if (i11 == 2) {
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(aVar.f82197b.a(j11, aVar));
                f fVar = this.f82017a;
                return B(getChronology(), Instant.ofEpochSecond(fVar.r(zoneOffsetOfTotalSeconds), fVar.f82004b.f81975d), this.f82019c);
            }
            return w(this.f82019c, this.f82018b, this.f82017a.d(j11, pVar));
        }
        return s(getChronology(), pVar.P(this, j11));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final k g(long j11, j$.time.temporal.r rVar) {
        if (rVar instanceof ChronoUnit) {
            return (k) k(this.f82017a.g(j11, rVar));
        }
        return s(getChronology(), rVar.s(this, j11));
    }

    private Object writeReplace() {
        return new e0((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && compareTo((i) obj) == 0;
    }
}
