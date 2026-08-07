package j$.time;

import com.google.android.gms.nearby.messages.Strategy;
import com.plaid.internal.EnumC4419g;
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
public final class LocalDate implements j$.time.temporal.l, j$.time.temporal.m, ChronoLocalDate, Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f81964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f81965c;
    public static final LocalDate MIN = of(-999999999, 1, 1);
    public static final LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public static LocalDate of(int i11, int i12, int i13) {
        j$.time.temporal.a.YEAR.R(i11);
        j$.time.temporal.a.MONTH_OF_YEAR.R(i12);
        j$.time.temporal.a.DAY_OF_MONTH.R(i13);
        return w(i11, i12, i13);
    }

    public static LocalDate U(int i11, int i12) {
        long j11 = i11;
        j$.time.temporal.a.YEAR.R(j11);
        j$.time.temporal.a.DAY_OF_YEAR.R(i12);
        boolean zQ = j$.time.chrono.s.f82037c.Q(j11);
        if (i12 == 366 && !zQ) {
            throw new DateTimeException("Invalid date 'DayOfYear 366' as '" + i11 + "' is not a leap year");
        }
        Month monthE = Month.E(((i12 - 1) / 31) + 1);
        if (i12 > (monthE.w(zQ) + monthE.s(zQ)) - 1) {
            monthE = Month.f81976a[((((int) 1) + 12) + monthE.ordinal()) % 12];
        }
        return new LocalDate(i11, monthE.getValue(), (i12 - monthE.s(zQ)) + 1);
    }

    public static LocalDate ofEpochDay(long j11) {
        long j12;
        j$.time.temporal.a.EPOCH_DAY.R(j11);
        long j13 = 719468 + j11;
        if (j13 < 0) {
            long j14 = ((j11 + 719469) / 146097) - 1;
            j12 = j14 * 400;
            j13 += (-j14) * 146097;
        } else {
            j12 = 0;
        }
        long j15 = ((j13 * 400) + 591) / 146097;
        long j16 = j13 - ((j15 / 400) + (((j15 / 4) + (j15 * 365)) - (j15 / 100)));
        if (j16 < 0) {
            j15--;
            j16 = j13 - ((j15 / 400) + (((j15 / 4) + (365 * j15)) - (j15 / 100)));
        }
        int i11 = (int) j16;
        int i12 = ((i11 * 5) + 2) / 153;
        int i13 = ((i12 + 2) % 12) + 1;
        int i14 = (i11 - (((i12 * EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE) + 5) / 10)) + 1;
        long j17 = j15 + j12 + ((long) (i12 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.f82197b.a(j17, aVar), i13, i14);
    }

    public static LocalDate B(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalDate localDate = (LocalDate) temporalAccessor.b(j$.time.temporal.q.f82219f);
        if (localDate != null) {
            return localDate;
        }
        throw new DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalDate parse(CharSequence charSequence) {
        return parse(charSequence, DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static LocalDate parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDate) dateTimeFormatter.parse(charSequence, new e(0));
    }

    public static LocalDate w(int i11, int i12, int i13) {
        int i14 = 28;
        if (i13 > 28) {
            if (i12 != 2) {
                i14 = (i12 == 4 || i12 == 6 || i12 == 9 || i12 == 11) ? 30 : 31;
            } else if (j$.time.chrono.s.f82037c.Q(i11)) {
                i14 = 29;
            }
            if (i13 > i14) {
                if (i13 == 29) {
                    throw new DateTimeException("Invalid date 'February 29' as '" + i11 + "' is not a leap year");
                }
                throw new DateTimeException("Invalid date '" + Month.E(i12).name() + " " + i13 + "'");
            }
        }
        return new LocalDate(i11, i12, i13);
    }

    public static LocalDate Z(int i11, int i12, int i13) {
        if (i12 == 2) {
            i13 = Math.min(i13, j$.time.chrono.s.f82037c.Q((long) i11) ? 29 : 28);
        } else if (i12 == 4 || i12 == 6 || i12 == 9 || i12 == 11) {
            i13 = Math.min(i13, 30);
        }
        return new LocalDate(i11, i12, i13);
    }

    public LocalDate(int i11, int i12, int i13) {
        this.f81963a = i11;
        this.f81964b = (short) i12;
        this.f81965c = (short) i13;
    }

    public static LocalDate T(a aVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        ZoneId zoneId = aVar.f81992a;
        Objects.requireNonNull(instantOfEpochMilli, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ofEpochDay(Math.floorDiv(instantOfEpochMilli.getEpochSecond() + ((long) zoneId.s().d(instantOfEpochMilli).getTotalSeconds()), Strategy.TTL_SECONDS_MAX));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.w(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        int i11 = f.f82055a[aVar.ordinal()];
        if (i11 == 1) {
            return j$.time.temporal.t.f(1L, R());
        }
        if (i11 == 2) {
            return j$.time.temporal.t.f(1L, O());
        }
        if (i11 == 3) {
            return j$.time.temporal.t.f(1L, (getMonth() != Month.FEBRUARY || t()) ? 5L : 4L);
        }
        if (i11 != 4) {
            return aVar.f82197b;
        }
        return getYear() <= 0 ? j$.time.temporal.t.f(1L, 1000000000L) : j$.time.temporal.t.f(1L, 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return E(pVar);
        }
        return super.e(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.EPOCH_DAY) {
                return toEpochDay();
            }
            if (pVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return E(pVar);
            }
            return ((((long) this.f81963a) * 12) + ((long) this.f81964b)) - 1;
        }
        return pVar.J(this);
    }

    public final int E(j$.time.temporal.p pVar) {
        switch (f.f82055a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f81965c;
            case 2:
                return J();
            case 3:
                return ((this.f81965c - 1) / 7) + 1;
            case 4:
                int i11 = this.f81963a;
                return i11 >= 1 ? i11 : 1 - i11;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.f81965c - 1) % 7) + 1;
            case 7:
                return ((J() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.s("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((J() - 1) / 7) + 1;
            case 10:
                return this.f81964b;
            case 11:
                throw new j$.time.temporal.s("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f81963a;
            case 13:
                return this.f81963a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.l getChronology() {
        return j$.time.chrono.s.f82037c;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.m H() {
        return getYear() >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    public int getYear() {
        return this.f81963a;
    }

    public int getMonthValue() {
        return this.f81964b;
    }

    public Month getMonth() {
        return Month.E(this.f81964b);
    }

    public int getDayOfMonth() {
        return this.f81965c;
    }

    public final int J() {
        return (getMonth().s(t()) + this.f81965c) - 1;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.s(((int) Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean t() {
        return j$.time.chrono.s.f82037c.Q(this.f81963a);
    }

    public final int R() {
        short s11 = this.f81964b;
        if (s11 != 2) {
            return (s11 == 4 || s11 == 6 || s11 == 9 || s11 == 11) ? 30 : 31;
        }
        return t() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int O() {
        return t() ? 366 : 365;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate k(j$.time.temporal.m mVar) {
        if (mVar instanceof LocalDate) {
            return (LocalDate) mVar;
        }
        return (LocalDate) mVar.c(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j11, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (LocalDate) pVar.P(this, j11);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.R(j11);
        switch (f.f82055a[aVar.ordinal()]) {
            case 1:
                int i11 = (int) j11;
                if (this.f81965c != i11) {
                    return of(this.f81963a, this.f81964b, i11);
                }
                return this;
            case 2:
                int i12 = (int) j11;
                if (J() != i12) {
                    return U(this.f81963a, i12);
                }
                return this;
            case 3:
                return X(j11 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f81963a < 1) {
                    j11 = 1 - j11;
                }
                return c0((int) j11);
            case 5:
                return W(j11 - ((long) getDayOfWeek().getValue()));
            case 6:
                return W(j11 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return W(j11 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j11);
            case 9:
                return X(j11 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i13 = (int) j11;
                if (this.f81964b != i13) {
                    j$.time.temporal.a.MONTH_OF_YEAR.R(i13);
                    return Z(this.f81963a, i13, this.f81965c);
                }
                return this;
            case 11:
                return plusMonths(j11 - (((((long) this.f81963a) * 12) + ((long) this.f81964b)) - 1));
            case 12:
                return c0((int) j11);
            case 13:
                if (i(j$.time.temporal.a.ERA) != j11) {
                    return c0(1 - this.f81963a);
                }
                return this;
            default:
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
    }

    public final LocalDate c0(int i11) {
        if (this.f81963a == i11) {
            return this;
        }
        j$.time.temporal.a.YEAR.R(i11);
        return Z(i11, this.f81964b, this.f81965c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(j$.time.temporal.o oVar) {
        if (oVar != null) {
            n nVar = (n) oVar;
            return plusMonths((((long) nVar.f82175a) * 12) + ((long) nVar.f82176b)).W(nVar.f82177c);
        }
        Objects.requireNonNull(oVar, "amountToAdd");
        return (LocalDate) ((n) oVar).s(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDate g(long j11, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (LocalDate) rVar.s(this, j11);
        }
        switch (f.f82056b[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return W(j11);
            case 2:
                return X(j11);
            case 3:
                return plusMonths(j11);
            case 4:
                return Y(j11);
            case 5:
                return Y(Math.multiplyExact(j11, 10));
            case 6:
                return Y(Math.multiplyExact(j11, 100));
            case 7:
                return Y(Math.multiplyExact(j11, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(Math.addExact(i(aVar), j11), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public final LocalDate Y(long j11) {
        if (j11 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Z(aVar.f82197b.a(((long) this.f81963a) + j11, aVar), this.f81964b, this.f81965c);
    }

    public LocalDate plusMonths(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (((long) this.f81963a) * 12) + ((long) (this.f81964b - 1)) + j11;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j13 = 12;
        return Z(aVar.f82197b.a(Math.floorDiv(j12, j13), aVar), ((int) Math.floorMod(j12, j13)) + 1, this.f81965c);
    }

    public final LocalDate X(long j11) {
        return W(Math.multiplyExact(j11, 7));
    }

    public final LocalDate W(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = ((long) this.f81965c) + j11;
        if (j12 > 0) {
            if (j12 <= 28) {
                return new LocalDate(this.f81963a, this.f81964b, (int) j12);
            }
            if (j12 <= 59) {
                long jR = R();
                if (j12 <= jR) {
                    return new LocalDate(this.f81963a, this.f81964b, (int) j12);
                }
                short s11 = this.f81964b;
                if (s11 < 12) {
                    return new LocalDate(this.f81963a, s11 + 1, (int) (j12 - jR));
                }
                j$.time.temporal.a.YEAR.R(this.f81963a + 1);
                return new LocalDate(this.f81963a + 1, 1, (int) (j12 - jR));
            }
        }
        return ofEpochDay(Math.addExact(toEpochDay(), j11));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDate a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.q.f82219f ? this : super.b(temporalQuery);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.d F(LocalTime localTime) {
        return LocalDateTime.E(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j11;
        long j12 = this.f81963a;
        long j13 = this.f81964b;
        long j14 = 365 * j12;
        if (j12 >= 0) {
            j11 = ((j12 + 399) / 400) + (((3 + j12) / 4) - ((99 + j12) / 100)) + j14;
        } else {
            j11 = j14 - ((j12 / (-400)) + ((j12 / (-4)) - (j12 / (-100))));
        }
        long j15 = (((367 * j13) - 362) / 12) + j11 + ((long) (this.f81965c - 1));
        if (j13 > 2) {
            j15 = !t() ? j15 - 2 : j15 - 1;
        }
        return j15 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return s((LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    public final int s(LocalDate localDate) {
        int i11 = this.f81963a - localDate.f81963a;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f81964b - localDate.f81964b;
        return i12 == 0 ? this.f81965c - localDate.f81965c : i12;
    }

    public final boolean P(ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof LocalDate) {
            return s((LocalDate) chronoLocalDate) < 0;
        }
        return toEpochDay() < chronoLocalDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && s((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i11 = this.f81963a;
        return (((i11 << 11) + (this.f81964b << 6)) + this.f81965c) ^ (i11 & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public String toString() {
        int i11 = this.f81963a;
        short s11 = this.f81964b;
        short s12 = this.f81965c;
        int iAbs = Math.abs(i11);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i11 > 9999) {
                sb2.append('+');
            }
            sb2.append(i11);
        } else if (i11 < 0) {
            sb2.append(i11 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i11 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        sb2.append(s12 < 10 ? "-0" : "-");
        sb2.append((int) s12);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new o((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
