package bo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0002*\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000bH\u0086\u0004¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u000bH\u0086\u0004¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001a\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001d\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u0016\u001a\u0019\u0010!\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\u0018\u001a\u0019\u0010\"\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001b\u001a\u0019\u0010#\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b#\u0010\u001e\u001a!\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b$\u0010%\u001a!\u0010&\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'\u001a!\u0010(\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b(\u0010)\u001a!\u0010*\u001a\u00020\u001c*\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+\u001a1\u00100\u001a\u00028\u0000\"\u000e\b\u0000\u0010-*\b\u0012\u0004\u0012\u00028\u00000,*\u00028\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0007¢\u0006\u0004\b0\u00101\u001a\u001f\u00103\u001a\u00020\u0000*\u00020\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000002¢\u0006\u0004\b3\u00104\u001a\u001f\u00105\u001a\u00020\u000b*\u00020\u000b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b02¢\u0006\u0004\b5\u00106¨\u00067"}, d2 = {"", "to", "Lbo0/h;", "s", "(II)Lbo0/h;", "t", "(Lbo0/h;)Lbo0/h;", "step", "u", "(Lbo0/h;I)Lbo0/h;", "Lbo0/k;", "", "v", "(Lbo0/k;J)Lbo0/k;", "Lbo0/j;", "w", "(II)Lbo0/j;", "Lbo0/m;", "x", "(JJ)Lbo0/m;", "minimumValue", "f", "(II)I", "g", "(JJ)J", "", "e", "(FF)F", "", DateTokenConverter.CONVERTER_KEY, "(DD)D", "maximumValue", "j", "k", IntegerTokenConverter.CONVERTER_KEY, "h", "n", "(III)I", "p", "(JJJ)J", "m", "(FFF)F", "l", "(DDD)D", "", "T", "Lbo0/e;", "range", "r", "(Ljava/lang/Comparable;Lbo0/e;)Ljava/lang/Comparable;", "Lbo0/f;", "o", "(ILbo0/f;)I", "q", "(JLbo0/f;)J", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class p extends o {
    public static double d(double d11, double d12) {
        return d11 < d12 ? d12 : d11;
    }

    public static float e(float f11, float f12) {
        return f11 < f12 ? f12 : f11;
    }

    public static int f(int i11, int i12) {
        return i11 < i12 ? i12 : i11;
    }

    public static long g(long j11, long j12) {
        return j11 < j12 ? j12 : j11;
    }

    public static double h(double d11, double d12) {
        return d11 > d12 ? d12 : d11;
    }

    public static float i(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    public static int j(int i11, int i12) {
        return i11 > i12 ? i12 : i11;
    }

    public static long k(long j11, long j12) {
        return j11 > j12 ? j12 : j11;
    }

    public static double l(double d11, double d12, double d13) {
        if (d12 <= d13) {
            if (d11 < d12) {
                return d12;
            }
            return d11 > d13 ? d13 : d11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d13 + " is less than minimum " + d12 + CoreConstants.DOT);
    }

    public static float m(float f11, float f12, float f13) {
        if (f12 <= f13) {
            if (f11 < f12) {
                return f12;
            }
            return f11 > f13 ? f13 : f11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f13 + " is less than minimum " + f12 + CoreConstants.DOT);
    }

    public static int n(int i11, int i12, int i13) {
        if (i12 <= i13) {
            if (i11 < i12) {
                return i12;
            }
            return i11 > i13 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + CoreConstants.DOT);
    }

    public static int o(int i11, f<Integer> range) {
        s.k(range, "range");
        if (range instanceof e) {
            return ((Number) r(Integer.valueOf(i11), (e) range)).intValue();
        }
        if (!range.isEmpty()) {
            if (i11 < ((Number) range.getStart()).intValue()) {
                return ((Number) range.getStart()).intValue();
            }
            return i11 > ((Number) range.e()).intValue() ? ((Number) range.e()).intValue() : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + CoreConstants.DOT);
    }

    public static long p(long j11, long j12, long j13) {
        if (j12 <= j13) {
            if (j11 < j12) {
                return j12;
            }
            return j11 > j13 ? j13 : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j13 + " is less than minimum " + j12 + CoreConstants.DOT);
    }

    public static long q(long j11, f<Long> range) {
        s.k(range, "range");
        if (range instanceof e) {
            return ((Number) r(Long.valueOf(j11), (e) range)).longValue();
        }
        if (!range.isEmpty()) {
            if (j11 < ((Number) range.getStart()).longValue()) {
                return ((Number) range.getStart()).longValue();
            }
            return j11 > ((Number) range.e()).longValue() ? ((Number) range.e()).longValue() : j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + CoreConstants.DOT);
    }

    public static <T extends Comparable<? super T>> T r(T t11, e<T> range) {
        s.k(t11, "<this>");
        s.k(range, "range");
        if (!range.isEmpty()) {
            if (!range.b(t11, range.getStart()) || range.b(range.getStart(), t11)) {
                return (!range.b(range.e(), t11) || range.b(t11, range.e())) ? t11 : range.e();
            }
            return range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + CoreConstants.DOT);
    }

    public static h s(int i11, int i12) {
        return h.INSTANCE.a(i11, i12, -1);
    }

    public static h t(h hVar) {
        s.k(hVar, "<this>");
        return h.INSTANCE.a(hVar.getLast(), hVar.getFirst(), -hVar.getStep());
    }

    public static h u(h hVar, int i11) {
        s.k(hVar, "<this>");
        o.a(i11 > 0, Integer.valueOf(i11));
        h.Companion aVar = h.INSTANCE;
        int iH = hVar.getFirst();
        int i12 = hVar.getLast();
        if (hVar.getStep() <= 0) {
            i11 = -i11;
        }
        return aVar.a(iH, i12, i11);
    }

    public static k v(k kVar, long j11) {
        s.k(kVar, "<this>");
        o.a(j11 > 0, Long.valueOf(j11));
        k.Companion aVar = k.INSTANCE;
        long jH = kVar.getFirst();
        long jI = kVar.getLast();
        if (kVar.getStep() <= 0) {
            j11 = -j11;
        }
        return aVar.a(jH, jI, j11);
    }

    public static j w(int i11, int i12) {
        return i12 <= Integer.MIN_VALUE ? j.INSTANCE.a() : new j(i11, i12 - 1);
    }

    public static m x(long j11, long j12) {
        return j12 <= Long.MIN_VALUE ? m.INSTANCE.a() : new m(j11, j12 - 1);
    }
}
