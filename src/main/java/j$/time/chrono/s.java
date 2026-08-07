package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f82037c = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m x(int i11) {
        if (i11 == 0) {
            return t.BCE;
        }
        if (i11 == 1) {
            return t.CE;
        }
        throw new DateTimeException("Invalid era: " + i11);
    }

    @Override // j$.time.chrono.l
    public final String m() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String p() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate G() {
        return LocalDate.B(LocalDate.T(new j$.time.a(ZoneId.systemDefault())));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate K(int i11, int i12, int i13) {
        return LocalDate.of(i11, i12, i13);
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate q(int i11, int i12) {
        return LocalDate.U(i11, i12);
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate l(long j11) {
        return LocalDate.ofEpochDay(j11);
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate C(TemporalAccessor temporalAccessor) {
        return LocalDate.B(temporalAccessor);
    }

    private s() {
    }

    @Override // j$.time.chrono.l
    public final d D(LocalDateTime localDateTime) {
        return LocalDateTime.w(localDateTime);
    }

    @Override // j$.time.chrono.l
    public final i N(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.w(instant, zoneId);
    }

    @Override // j$.time.chrono.l
    public final boolean Q(long j11) {
        if ((3 & j11) == 0) {
            return j11 % 100 != 0 || j11 % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.l
    public final int y(m mVar, int i11) {
        if (mVar instanceof t) {
            return mVar == t.CE ? i11 : 1 - i11;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.l
    public final List v() {
        return j$.time.b.c(t.values());
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final ChronoLocalDate M(Map map, j$.time.format.c0 c0Var) {
        return (LocalDate) super.M(map, c0Var);
    }

    @Override // j$.time.chrono.a
    public final void E(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l11 = (Long) map.remove(aVar);
        if (l11 != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.R(l11.longValue());
            }
            long j11 = 12;
            a.s(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l11.longValue(), j11)) + 1);
            a.s(map, j$.time.temporal.a.YEAR, Math.floorDiv(l11.longValue(), j11));
        }
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate P(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l11 = (Long) map.remove(aVar);
        if (l11 != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.R(l11.longValue());
            }
            Long l12 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l12 != null) {
                if (l12.longValue() == 1) {
                    a.s(map, j$.time.temporal.a.YEAR, l11.longValue());
                    return null;
                }
                if (l12.longValue() == 0) {
                    a.s(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l11.longValue()));
                    return null;
                }
                throw new DateTimeException("Invalid value for era: " + l12);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l13 = (Long) map.get(aVar2);
            if (c0Var != j$.time.format.c0.STRICT) {
                a.s(map, aVar2, (l13 == null || l13.longValue() > 0) ? l11.longValue() : Math.subtractExact(1L, l11.longValue()));
                return null;
            }
            if (l13 != null) {
                long jLongValue = l13.longValue();
                long jLongValue2 = l11.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                a.s(map, aVar2, jLongValue2);
                return null;
            }
            map.put(aVar, l11);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.R(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate J(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = aVar.f82197b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z11 = true;
        if (c0Var == j$.time.format.c0.LENIENT) {
            return LocalDate.of(iA, 1, 1).plusMonths(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).W(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = aVar2.f82197b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = aVar3.f82197b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (c0Var == j$.time.format.c0.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j11 = iA;
                int i11 = j$.time.q.f82182b;
                if ((3 & j11) != 0 || (j11 % 100 == 0 && j11 % 400 != 0)) {
                    z11 = false;
                }
                iA3 = Math.min(iA3, month.w(z11));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.t u(j$.time.temporal.a aVar) {
        return aVar.f82197b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
