package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f81993a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f81994b = new ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m().compareTo(((l) obj).m());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static l w(l lVar, String str) {
        String strP;
        l lVar2 = (l) f81993a.putIfAbsent(str, lVar);
        if (lVar2 == null && (strP = lVar.p()) != null) {
            f81994b.putIfAbsent(strP, lVar);
        }
        return lVar2;
    }

    @Override // j$.time.chrono.l
    public ChronoLocalDate M(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return l(((Long) map.remove(aVar)).longValue());
        }
        E(map, c0Var);
        ChronoLocalDate chronoLocalDateP = P(map, c0Var);
        if (chronoLocalDateP != null) {
            return chronoLocalDateP;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return J(map, c0Var);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(aVar5)) {
                    j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                    if (map.containsKey(aVar6)) {
                        int iA = u(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                        if (c0Var == j$.time.format.c0.LENIENT) {
                            return B(K(iA, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                        }
                        int iA2 = u(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                        ChronoLocalDate chronoLocalDateK = K(iA, iA2, 1).g((u(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.r) ChronoUnit.DAYS).k(new j$.time.temporal.n(DayOfWeek.s(u(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                        if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateK.e(aVar3) == iA2) {
                            return chronoLocalDateK;
                        }
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iA3 = u(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (c0Var == j$.time.format.c0.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return K(iA3, 1, 1).g(jSubtractExact, (j$.time.temporal.r) ChronoUnit.MONTHS).g(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.r) ChronoUnit.WEEKS).g(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.r) ChronoUnit.DAYS);
                    }
                    int iA4 = u(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    ChronoLocalDate chronoLocalDateG = K(iA3, iA4, 1).g((u(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((u(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (j$.time.temporal.r) ChronoUnit.DAYS);
                    if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateG.e(aVar3) == iA4) {
                        return chronoLocalDateG;
                    }
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (!map.containsKey(aVar7)) {
            j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(aVar8)) {
                return null;
            }
            j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(aVar9)) {
                j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
                if (!map.containsKey(aVar10)) {
                    return null;
                }
                int iA5 = u(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                if (c0Var == j$.time.format.c0.LENIENT) {
                    return B(q(iA5, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
                }
                ChronoLocalDate chronoLocalDateK2 = q(iA5, 1).g((u(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.r) ChronoUnit.DAYS).k(new j$.time.temporal.n(DayOfWeek.s(u(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
                if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateK2.e(aVar2) == iA5) {
                    return chronoLocalDateK2;
                }
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            int iA6 = u(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (c0Var == j$.time.format.c0.LENIENT) {
                return q(iA6, 1).g(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.r) ChronoUnit.WEEKS).g(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.r) ChronoUnit.DAYS);
            }
            ChronoLocalDate chronoLocalDateG2 = q(iA6, 1).g((u(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((u(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.r) ChronoUnit.DAYS);
            if (c0Var != j$.time.format.c0.STRICT || chronoLocalDateG2.e(aVar2) == iA6) {
                return chronoLocalDateG2;
            }
            throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        int iA7 = u(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (c0Var == j$.time.format.c0.LENIENT) {
            return q(iA7, 1).g(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.r) ChronoUnit.DAYS);
        }
        return q(iA7, u(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
    }

    public void E(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l11 = (Long) map.remove(aVar);
        if (l11 != null) {
            if (c0Var != j$.time.format.c0.LENIENT) {
                aVar.R(l11.longValue());
            }
            ChronoLocalDate chronoLocalDateD = G().d(1L, (j$.time.temporal.p) j$.time.temporal.a.DAY_OF_MONTH).d(l11.longValue(), (j$.time.temporal.p) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            s(map, aVar2, chronoLocalDateD.e(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            s(map, aVar3, chronoLocalDateD.e(aVar3));
        }
    }

    public ChronoLocalDate P(Map map, j$.time.format.c0 c0Var) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l11 = (Long) map.remove(aVar);
        if (l11 != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l12 = (Long) map.remove(aVar2);
            if (c0Var != j$.time.format.c0.LENIENT) {
                intExact = u(aVar).a(l11.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l11.longValue());
            }
            if (l12 != null) {
                s(map, j$.time.temporal.a.YEAR, y(x(u(aVar2).a(l12.longValue(), aVar2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                s(map, aVar3, y(q(u(aVar3).a(((Long) map.get(aVar3)).longValue(), aVar3), 1).H(), intExact));
                return null;
            }
            if (c0Var == j$.time.format.c0.STRICT) {
                map.put(aVar, l11);
                return null;
            }
            List listV = v();
            if (listV.isEmpty()) {
                s(map, aVar3, intExact);
                return null;
            }
            s(map, aVar3, y((m) listV.get(listV.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar4)) {
            return null;
        }
        u(aVar4).b(((Long) map.get(aVar4)).longValue(), aVar4);
        return null;
    }

    public ChronoLocalDate J(Map map, j$.time.format.c0 c0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = u(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (c0Var == j$.time.format.c0.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return K(iA, 1, 1).g(jSubtractExact, (j$.time.temporal.r) ChronoUnit.MONTHS).g(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.r) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = u(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = u(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (c0Var != j$.time.format.c0.SMART) {
            return K(iA, iA2, iA3);
        }
        try {
            return K(iA, iA2, iA3);
        } catch (DateTimeException unused) {
            return K(iA, iA2, 1).k(new j$.time.e(3));
        }
    }

    public static ChronoLocalDate B(ChronoLocalDate chronoLocalDate, long j11, long j12, long j13) {
        long j14;
        ChronoLocalDate chronoLocalDateG = chronoLocalDate.g(j11, (j$.time.temporal.r) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate chronoLocalDateG2 = chronoLocalDateG.g(j12, (j$.time.temporal.r) chronoUnit);
        if (j13 > 7) {
            long j15 = j13 - 1;
            chronoLocalDateG2 = chronoLocalDateG2.g(j15 / 7, (j$.time.temporal.r) chronoUnit);
            j14 = j15 % 7;
        } else {
            if (j13 < 1) {
                chronoLocalDateG2 = chronoLocalDateG2.g(Math.subtractExact(j13, 7L) / 7, (j$.time.temporal.r) chronoUnit);
                j14 = (j13 + 6) % 7;
            }
            return chronoLocalDateG2.k(new j$.time.temporal.n(DayOfWeek.s((int) j13).getValue(), 0));
        }
        j13 = j14 + 1;
        return chronoLocalDateG2.k(new j$.time.temporal.n(DayOfWeek.s((int) j13).getValue(), 0));
    }

    public static void s(Map map, j$.time.temporal.a aVar, long j11) {
        Long l11 = (Long) map.get(aVar);
        if (l11 != null && l11.longValue() != j11) {
            throw new DateTimeException("Conflict found: " + aVar + " " + l11 + " differs from " + aVar + " " + j11);
        }
        map.put(aVar, Long.valueOf(j11));
    }

    @Override // j$.time.chrono.l
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && m().compareTo(((a) obj).m()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ m().hashCode();
    }

    @Override // j$.time.chrono.l
    public final String toString() {
        return m();
    }
}
