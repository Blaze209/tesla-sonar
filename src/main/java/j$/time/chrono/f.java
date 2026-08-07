package j$.time.chrono;

import ch.qos.logback.core.CoreConstants;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements d, j$.time.temporal.l, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient ChronoLocalDate f82003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient LocalTime f82004b;

    public static f s(l lVar, j$.time.temporal.l lVar2) {
        f fVar = (f) lVar2;
        if (lVar.equals(fVar.getChronology())) {
            return fVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + lVar.m() + ", actual: " + fVar.getChronology().m());
    }

    public f(ChronoLocalDate chronoLocalDate, LocalTime localTime) {
        Objects.requireNonNull(localTime, "time");
        this.f82003a = chronoLocalDate;
        this.f82004b = localTime;
    }

    public final f J(j$.time.temporal.l lVar, LocalTime localTime) {
        ChronoLocalDate chronoLocalDate = this.f82003a;
        return (chronoLocalDate == lVar && this.f82004b == localTime) ? this : new f(c.s(chronoLocalDate.getChronology(), lVar), localTime);
    }

    public final int hashCode() {
        return this.f82003a.hashCode() ^ this.f82004b.hashCode();
    }

    @Override // j$.time.chrono.d
    public final ChronoLocalDate toLocalDate() {
        return this.f82003a;
    }

    public final String toString() {
        return this.f82003a.toString() + "T" + this.f82004b.toString();
    }

    @Override // j$.time.chrono.d
    public final LocalTime toLocalTime() {
        return this.f82004b;
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
            return (((j$.time.temporal.a) pVar).S() ? this.f82004b : this.f82003a).j(pVar);
        }
        return pVar.w(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).S() ? this.f82004b.e(pVar) : this.f82003a.e(pVar);
        }
        return j(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).S() ? this.f82004b.i(pVar) : this.f82003a.i(pVar);
        }
        return pVar.J(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        if (localDate != null) {
            return J(localDate, this.f82004b);
        }
        return s(this.f82003a.getChronology(), (f) localDate.c(this));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final f d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).S()) {
                return J(this.f82003a, this.f82004b.d(j11, pVar));
            }
            return J(this.f82003a.d(j11, pVar), this.f82004b);
        }
        return s(this.f82003a.getChronology(), pVar.P(this, j11));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final f g(long j11, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return s(this.f82003a.getChronology(), rVar.s(this, j11));
        }
        switch (e.f82000a[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return B(this.f82003a, 0L, 0L, 0L, j11);
            case 2:
                f fVarJ = J(this.f82003a.g(j11 / 86400000000L, (j$.time.temporal.r) ChronoUnit.DAYS), this.f82004b);
                return fVarJ.B(fVarJ.f82003a, 0L, 0L, 0L, (j11 % 86400000000L) * 1000);
            case 3:
                f fVarJ2 = J(this.f82003a.g(j11 / CoreConstants.MILLIS_IN_ONE_DAY, (j$.time.temporal.r) ChronoUnit.DAYS), this.f82004b);
                return fVarJ2.B(fVarJ2.f82003a, 0L, 0L, 0L, (j11 % CoreConstants.MILLIS_IN_ONE_DAY) * 1000000);
            case 4:
                return B(this.f82003a, 0L, 0L, j11, 0L);
            case 5:
                return B(this.f82003a, 0L, j11, 0L, 0L);
            case 6:
                return B(this.f82003a, j11, 0L, 0L, 0L);
            case 7:
                f fVarJ3 = J(this.f82003a.g(j11 / 256, (j$.time.temporal.r) ChronoUnit.DAYS), this.f82004b);
                return fVarJ3.B(fVarJ3.f82003a, (j11 % 256) * 12, 0L, 0L, 0L);
            default:
                return J(this.f82003a.g(j11, rVar), this.f82004b);
        }
    }

    public final f B(ChronoLocalDate chronoLocalDate, long j11, long j12, long j13, long j14) {
        if ((j11 | j12 | j13 | j14) == 0) {
            return J(chronoLocalDate, this.f82004b);
        }
        long j15 = j11 / 24;
        long j16 = ((j11 % 24) * 3600000000000L) + ((j12 % 1440) * 60000000000L) + ((j13 % 86400) * 1000000000) + (j14 % 86400000000000L);
        long jV = this.f82004b.V();
        long j17 = j16 + jV;
        long jFloorDiv = Math.floorDiv(j17, 86400000000000L) + j15 + (j12 / 1440) + (j13 / 86400) + (j14 / 86400000000000L);
        long jFloorMod = Math.floorMod(j17, 86400000000000L);
        return J(chronoLocalDate.g(jFloorDiv, (j$.time.temporal.r) ChronoUnit.DAYS), jFloorMod == jV ? this.f82004b : LocalTime.E(jFloorMod));
    }

    @Override // j$.time.chrono.d
    public final i A(ZoneId zoneId) {
        return k.w(zoneId, null, this);
    }

    private Object writeReplace() {
        return new e0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && compareTo((d) obj) == 0;
    }
}
