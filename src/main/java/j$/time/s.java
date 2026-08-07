package j$.time;

import ch.qos.logback.core.CoreConstants;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.d0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f82186c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82188b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        int i11 = this.f82187a - sVar.f82187a;
        return i11 == 0 ? this.f82188b - sVar.f82188b : i11;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.l(j$.time.temporal.a.YEAR, 4, 10, d0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.d(CoreConstants.DASH_CHAR);
        dateTimeFormatterBuilder.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        dateTimeFormatterBuilder.toFormatter();
    }

    public s(int i11, int i12) {
        this.f82187a = i11;
        this.f82188b = i12;
    }

    public final s J(int i11, int i12) {
        return (this.f82187a == i11 && this.f82188b == i12) ? this : new s(i11, i12);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.PROLEPTIC_MONTH || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.f(1L, this.f82187a <= 0 ? 1000000000L : 999999999L);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        return j(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        int i11;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.J(this);
        }
        int i12 = r.f82184a[((j$.time.temporal.a) pVar).ordinal()];
        if (i12 == 1) {
            i11 = this.f82188b;
        } else {
            if (i12 == 2) {
                return s();
            }
            if (i12 == 3) {
                int i13 = this.f82187a;
                if (i13 < 1) {
                    i13 = 1 - i13;
                }
                return i13;
            }
            if (i12 != 4) {
                if (i12 == 5) {
                    return this.f82187a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
            }
            i11 = this.f82187a;
        }
        return i11;
    }

    public final long s() {
        return ((((long) this.f82187a) * 12) + ((long) this.f82188b)) - 1;
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (s) localDate.c(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final s d(long j11, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (s) pVar.P(this, j11);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.R(j11);
        int i11 = r.f82184a[aVar.ordinal()];
        if (i11 == 1) {
            int i12 = (int) j11;
            j$.time.temporal.a.MONTH_OF_YEAR.R(i12);
            return J(this.f82187a, i12);
        }
        if (i11 == 2) {
            return B(j11 - s());
        }
        if (i11 == 3) {
            if (this.f82187a < 1) {
                j11 = 1 - j11;
            }
            int i13 = (int) j11;
            j$.time.temporal.a.YEAR.R(i13);
            return J(i13, this.f82188b);
        }
        if (i11 == 4) {
            int i14 = (int) j11;
            j$.time.temporal.a.YEAR.R(i14);
            return J(i14, this.f82188b);
        }
        if (i11 != 5) {
            throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
        }
        if (i(j$.time.temporal.a.ERA) == j11) {
            return this;
        }
        int i15 = 1 - this.f82187a;
        j$.time.temporal.a.YEAR.R(i15);
        return J(i15, this.f82188b);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final s g(long j11, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (s) rVar.s(this, j11);
        }
        switch (r.f82185b[((ChronoUnit) rVar).ordinal()]) {
            case 1:
                return B(j11);
            case 2:
                return E(j11);
            case 3:
                return E(Math.multiplyExact(j11, 10));
            case 4:
                return E(Math.multiplyExact(j11, 100));
            case 5:
                return E(Math.multiplyExact(j11, 1000));
            case 6:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(Math.addExact(i(aVar), j11), aVar);
            default:
                throw new j$.time.temporal.s("Unsupported unit: " + rVar);
        }
    }

    public final s E(long j11) {
        if (j11 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return J(aVar.f82197b.a(((long) this.f82187a) + j11, aVar), this.f82188b);
    }

    public final s B(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (((long) this.f82187a) * 12) + ((long) (this.f82188b - 1)) + j11;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j13 = 12;
        return J(aVar.f82197b.a(Math.floorDiv(j12, j13), aVar), ((int) Math.floorMod(j12, j13)) + 1);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return j11 == Long.MIN_VALUE ? g(Long.MAX_VALUE, rVar).g(1L, rVar) : g(-j11, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.q.f82215b) {
            return j$.time.chrono.s.f82037c;
        }
        if (temporalQuery == j$.time.temporal.q.f82216c) {
            return ChronoUnit.MONTHS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.l.n(lVar).equals(j$.time.chrono.s.f82037c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return lVar.d(s(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f82187a == sVar.f82187a && this.f82188b == sVar.f82188b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f82187a ^ (this.f82188b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f82187a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i11 = this.f82187a;
            if (i11 < 0) {
                sb2.append(i11 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i11 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f82187a);
        }
        sb2.append(this.f82188b < 10 ? "-0" : "-");
        sb2.append(this.f82188b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new o((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
