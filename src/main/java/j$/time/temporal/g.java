package j$.time.temporal;

import com.plaid.internal.EnumC4419g;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f82199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f82200b;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f82200b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final t E() {
                return t.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.DAY_OF_YEAR) || !temporalAccessor.h(a.MONTH_OF_YEAR) || !temporalAccessor.h(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.f82203a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.f82037c);
            }

            @Override // j$.time.temporal.p
            public final t w(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                long jI = temporalAccessor.i(g.QUARTER_OF_YEAR);
                if (jI == 1) {
                    return j$.time.chrono.s.f82037c.Q(temporalAccessor.i(a.YEAR)) ? t.f(1L, 91L) : t.f(1L, 90L);
                }
                if (jI == 2) {
                    return t.f(1L, 91L);
                }
                if (jI == 3 || jI == 4) {
                    return t.f(1L, 92L);
                }
                return E();
            }

            @Override // j$.time.temporal.p
            public final long J(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.e(a.DAY_OF_YEAR) - g.f82199a[((temporalAccessor.e(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.s.f82037c.Q(temporalAccessor.i(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final l P(l lVar, long j11) {
                long J = J(lVar);
                E().b(j11, this);
                a aVar = a.DAY_OF_YEAR;
                return lVar.d((j11 - J) + lVar.i(aVar), aVar);
            }

            @Override // j$.time.temporal.p
            public final TemporalAccessor B(Map map, b0 b0Var, c0 c0Var) {
                long jSubtractExact;
                LocalDate localDatePlusMonths;
                a aVar = a.YEAR;
                Long l11 = (Long) map.get(aVar);
                p pVar = g.QUARTER_OF_YEAR;
                Long l12 = (Long) map.get(pVar);
                if (l11 == null || l12 == null) {
                    return null;
                }
                int iA = aVar.f82197b.a(l11.longValue(), aVar);
                long jLongValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                g gVar2 = i.f82203a;
                if (!j$.time.chrono.l.n(b0Var).equals(j$.time.chrono.s.f82037c)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (c0Var == c0.LENIENT) {
                    localDatePlusMonths = LocalDate.of(iA, 1, 1).plusMonths(Math.multiplyExact(Math.subtractExact(l12.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iA, ((pVar.E().a(l12.longValue(), pVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (c0Var == c0.STRICT) {
                            w(localDateOf).b(jLongValue, this);
                        } else {
                            E().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDatePlusMonths = localDateOf;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(pVar);
                return localDatePlusMonths.W(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final t E() {
                return t.f(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.f82203a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.f82037c);
            }

            @Override // j$.time.temporal.p
            public final long J(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.i(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final t w(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: QuarterOfYear");
                }
                return E();
            }

            @Override // j$.time.temporal.p
            public final l P(l lVar, long j11) {
                long J = J(lVar);
                E().b(j11, this);
                a aVar = a.MONTH_OF_YEAR;
                return lVar.d(((j11 - J) * 3) + lVar.i(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final t E() {
                return t.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.f82203a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.f82037c);
            }

            @Override // j$.time.temporal.p
            public final t w(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return g.U(LocalDate.B(temporalAccessor));
                }
                throw new s("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final long J(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.R(LocalDate.B(temporalAccessor));
            }

            @Override // j$.time.temporal.p
            public final l P(l lVar, long j11) {
                E().b(j11, this);
                return lVar.g(Math.subtractExact(j11, J(lVar)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.p
            public final TemporalAccessor B(Map map, b0 b0Var, c0 c0Var) {
                LocalDate localDateD;
                long j11;
                long j12;
                p pVar = g.WEEK_BASED_YEAR;
                Long l11 = (Long) map.get(pVar);
                a aVar = a.DAY_OF_WEEK;
                Long l12 = (Long) map.get(aVar);
                if (l11 == null || l12 == null) {
                    return null;
                }
                int iA = pVar.E().a(l11.longValue(), pVar);
                long jLongValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                g gVar4 = i.f82203a;
                if (!j$.time.chrono.l.n(b0Var).equals(j$.time.chrono.s.f82037c)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (c0Var == c0.LENIENT) {
                    long jLongValue2 = l12.longValue();
                    if (jLongValue2 > 7) {
                        long j13 = jLongValue2 - 1;
                        j11 = 1;
                        localDateOf = localDateOf.X(j13 / 7);
                        j12 = j13 % 7;
                    } else {
                        j11 = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.X(Math.subtractExact(jLongValue2, 7L) / 7);
                            j12 = (jLongValue2 + 6) % 7;
                        }
                        localDateD = localDateOf.X(Math.subtractExact(jLongValue, j11)).d(jLongValue2, aVar);
                    }
                    jLongValue2 = j12 + j11;
                    localDateD = localDateOf.X(Math.subtractExact(jLongValue, j11)).d(jLongValue2, aVar);
                } else {
                    int iA2 = aVar.f82197b.a(l12.longValue(), aVar);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (c0Var == c0.STRICT) {
                            g.U(localDateOf).b(jLongValue, this);
                        } else {
                            E().b(jLongValue, this);
                        }
                    }
                    localDateD = localDateOf.X(jLongValue - 1).d(iA2, aVar);
                }
                map.remove(this);
                map.remove(pVar);
                map.remove(aVar);
                return localDateD;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final t E() {
                return a.YEAR.f82197b;
            }

            @Override // j$.time.temporal.p
            public final boolean s(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.h(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.f82203a;
                return j$.time.chrono.l.n(temporalAccessor).equals(j$.time.chrono.s.f82037c);
            }

            @Override // j$.time.temporal.p
            public final long J(TemporalAccessor temporalAccessor) {
                if (s(temporalAccessor)) {
                    return g.S(LocalDate.B(temporalAccessor));
                }
                throw new s("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final t w(TemporalAccessor temporalAccessor) {
                if (!s(temporalAccessor)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                return E();
            }

            @Override // j$.time.temporal.p
            public final l P(l lVar, long j11) {
                if (!s(lVar)) {
                    throw new s("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f82197b.a(j11, g.WEEK_BASED_YEAR);
                LocalDate localDateB = LocalDate.B(lVar);
                a aVar = a.DAY_OF_WEEK;
                int iE = localDateB.e(aVar);
                int iR = g.R(localDateB);
                if (iR == 53 && g.T(iA) == 52) {
                    iR = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return lVar.k(localDateOf.W(((iR - 1) * 7) + (iE - localDateOf.e(aVar))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f82200b = new g[]{gVar, gVar2, gVar3, gVar4};
        f82199a = new int[]{0, 90, 181, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 0, 91, 182, EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE};
    }

    public static t U(LocalDate localDate) {
        return t.f(1L, T(S(localDate)));
    }

    public static int T(int i11) {
        LocalDate localDateOf = LocalDate.of(i11, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.t()) ? 53 : 52;
        }
        return 53;
    }

    public static int R(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iJ = localDate.J() - 1;
        int i11 = (3 - iOrdinal) + iJ;
        int i12 = i11 - ((i11 / 7) * 7);
        int i13 = i12 - 3;
        if (i13 < -3) {
            i13 = i12 + 4;
        }
        if (iJ >= i13) {
            int i14 = ((iJ - i13) / 7) + 1;
            if (i14 != 53 || i13 == -3 || (i13 == -2 && localDate.t())) {
                return i14;
            }
            return 1;
        }
        if (localDate.J() != 180) {
            localDate = LocalDate.U(localDate.f81963a, 180);
        }
        return (int) U(localDate.Y(-1L)).f82224d;
    }

    public static int S(LocalDate localDate) {
        int year = localDate.getYear();
        int iJ = localDate.J();
        if (iJ <= 3) {
            return iJ - localDate.getDayOfWeek().ordinal() < -2 ? year - 1 : year;
        }
        if (iJ >= 363) {
            return ((iJ - 363) - (localDate.t() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
