package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f82040c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.l
    public final String m() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String p() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate G() {
        return new x(LocalDate.B(LocalDate.T(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate K(int i11, int i12, int i13) {
        return new x(LocalDate.of(i11, i12, i13));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate q(int i11, int i12) {
        return new x(LocalDate.U(i11, i12));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate l(long j11) {
        return new x(LocalDate.ofEpochDay(j11));
    }

    @Override // j$.time.chrono.l
    public final ChronoLocalDate C(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof x) {
            return (x) temporalAccessor;
        }
        return new x(LocalDate.B(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final List v() {
        y[] yVarArr = y.f82047e;
        return j$.time.b.c((y[]) Arrays.copyOf(yVarArr, yVarArr.length));
    }

    @Override // j$.time.chrono.l
    public final boolean Q(long j11) {
        return s.f82037c.Q(j11);
    }

    private v() {
    }

    @Override // j$.time.chrono.l
    public final int y(m mVar, int i11) {
        if (!(mVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        y yVar = (y) mVar;
        int year = (yVar.f82049b.getYear() + i11) - 1;
        if (i11 != 1 && (year < -999999999 || year > 999999999 || year < yVar.f82049b.getYear() || mVar != y.l(LocalDate.of(year, 1, 1)))) {
            throw new DateTimeException("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // j$.time.chrono.l
    public final m x(int i11) {
        return y.n(i11);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.t u(j$.time.temporal.a aVar) {
        switch (u.f82039a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.s("Unsupported field: " + aVar);
            case 5:
                y[] yVarArr = y.f82047e;
                int year = yVarArr[yVarArr.length - 1].f82049b.getYear();
                int year2 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS - yVarArr[yVarArr.length - 1].f82049b.getYear();
                int year3 = yVarArr[0].f82049b.getYear();
                int i11 = 1;
                while (true) {
                    y[] yVarArr2 = y.f82047e;
                    if (i11 >= yVarArr2.length) {
                        return j$.time.temporal.t.g(1L, year2, 999999999 - year);
                    }
                    y yVar = yVarArr2[i11];
                    year2 = Math.min(year2, (yVar.f82049b.getYear() - year3) + 1);
                    year3 = yVar.f82049b.getYear();
                    i11++;
                }
                break;
            case 6:
                y yVar2 = y.f82046d;
                long j11 = j$.time.temporal.a.DAY_OF_YEAR.f82197b.f82223c;
                long jMin = j11;
                for (y yVar3 : y.f82047e) {
                    long jMin2 = Math.min(jMin, (yVar3.f82049b.O() - yVar3.f82049b.J()) + 1);
                    jMin = yVar3.m() != null ? Math.min(jMin2, yVar3.m().f82049b.J() - 1) : jMin2;
                }
                return j$.time.temporal.t.g(1L, jMin, j$.time.temporal.a.DAY_OF_YEAR.f82197b.f82224d);
            case 7:
                return j$.time.temporal.t.f(x.f82042d.getYear(), 999999999L);
            case 8:
                long j12 = y.f82046d.f82048a;
                y[] yVarArr3 = y.f82047e;
                return j$.time.temporal.t.f(j12, yVarArr3[yVarArr3.length - 1].f82048a);
            default:
                return aVar.f82197b;
        }
    }

    @Override // j$.time.chrono.a, j$.time.chrono.l
    public final ChronoLocalDate M(Map map, j$.time.format.c0 c0Var) {
        return (x) super.M(map, c0Var);
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate P(Map map, j$.time.format.c0 c0Var) {
        x xVarR;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l11 = (Long) map.get(aVar);
        y yVarN = l11 != null ? y.n(u(aVar).a(l11.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l12 = (Long) map.get(aVar2);
        int iA = l12 != null ? u(aVar2).a(l12.longValue(), aVar2) : 0;
        if (yVarN == null && l12 != null && !map.containsKey(j$.time.temporal.a.YEAR) && c0Var != j$.time.format.c0.STRICT) {
            y[] yVarArr = y.f82047e;
            yVarN = ((y[]) Arrays.copyOf(yVarArr, yVarArr.length))[((y[]) Arrays.copyOf(yVarArr, yVarArr.length)).length - 1];
        }
        if (l12 != null && yVarN != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        return new x(LocalDate.of((yVarN.f82049b.getYear() + iA) - 1, 1, 1)).J(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).J(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int iA2 = u(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = u(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (c0Var != j$.time.format.c0.SMART) {
                        LocalDate localDate = x.f82042d;
                        LocalDate localDateOf = LocalDate.of((yVarN.f82049b.getYear() + iA) - 1, iA2, iA3);
                        if (localDateOf.P(yVarN.f82049b) || yVarN != y.l(localDateOf)) {
                            throw new DateTimeException("year, month, and day not valid for Era");
                        }
                        return new x(yVarN, iA, localDateOf);
                    }
                    if (iA < 1) {
                        throw new DateTimeException("Invalid YearOfEra: " + iA);
                    }
                    int year = (yVarN.f82049b.getYear() + iA) - 1;
                    try {
                        xVarR = new x(LocalDate.of(year, iA2, iA3));
                    } catch (DateTimeException unused) {
                        xVarR = new x(LocalDate.of(year, iA2, 1)).R(new j$.time.e(3));
                    }
                    if (xVarR.f82044b == yVarN || xVarR.e(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return xVarR;
                    }
                    throw new DateTimeException("Invalid YearOfEra for Era: " + yVarN + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (c0Var == j$.time.format.c0.LENIENT) {
                    return new x(LocalDate.U((yVarN.f82049b.getYear() + iA) - 1, 1)).J(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int iA4 = u(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                LocalDate localDate2 = x.f82042d;
                LocalDate localDateU = iA == 1 ? LocalDate.U(yVarN.f82049b.getYear(), (yVarN.f82049b.J() + iA4) - 1) : LocalDate.U((yVarN.f82049b.getYear() + iA) - 1, iA4);
                if (localDateU.P(yVarN.f82049b) || yVarN != y.l(localDateU)) {
                    throw new DateTimeException("Invalid parameters");
                }
                return new x(yVarN, iA, localDateU);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final i N(Instant instant, ZoneId zoneId) {
        return k.B(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
