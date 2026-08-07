package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.d0;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.l, j$.time.temporal.m, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f82182b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82183a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f82183a - ((q) obj).f82183a;
    }

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.l(j$.time.temporal.a.YEAR, 4, 10, d0.EXCEEDS_PAD);
        dateTimeFormatterBuilder.toFormatter();
    }

    public static q s(int i11) {
        j$.time.temporal.a.YEAR.R(i11);
        return new q(i11);
    }

    public q(int i11) {
        this.f82183a = i11;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return pVar == j$.time.temporal.a.YEAR || pVar == j$.time.temporal.a.YEAR_OF_ERA || pVar == j$.time.temporal.a.ERA;
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.t.f(1L, this.f82183a <= 0 ? 1000000000L : 999999999L);
        }
        return super.j(pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int e(j$.time.temporal.p pVar) {
        return j(pVar).a(i(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.J(this);
        }
        int i11 = p.f82180a[((j$.time.temporal.a) pVar).ordinal()];
        if (i11 == 1) {
            int i12 = this.f82183a;
            if (i12 < 1) {
                i12 = 1 - i12;
            }
            return i12;
        }
        if (i11 == 2) {
            return this.f82183a;
        }
        if (i11 == 3) {
            return this.f82183a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (q) localDate.c(this);
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final q d(long j11, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (q) pVar.P(this, j11);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        aVar.R(j11);
        int i11 = p.f82180a[aVar.ordinal()];
        if (i11 == 1) {
            if (this.f82183a < 1) {
                j11 = 1 - j11;
            }
            return s((int) j11);
        }
        if (i11 == 2) {
            return s((int) j11);
        }
        if (i11 == 3) {
            return i(j$.time.temporal.a.ERA) == j11 ? this : s(1 - this.f82183a);
        }
        throw new j$.time.temporal.s(c.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.l
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final q g(long j11, j$.time.temporal.r rVar) {
        if (!(rVar instanceof ChronoUnit)) {
            return (q) rVar.s(this, j11);
        }
        int i11 = p.f82181b[((ChronoUnit) rVar).ordinal()];
        if (i11 == 1) {
            return B(j11);
        }
        if (i11 == 2) {
            return B(Math.multiplyExact(j11, 10));
        }
        if (i11 == 3) {
            return B(Math.multiplyExact(j11, 100));
        }
        if (i11 == 4) {
            return B(Math.multiplyExact(j11, 1000));
        }
        if (i11 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return d(Math.addExact(i(aVar), j11), aVar);
        }
        throw new j$.time.temporal.s("Unsupported unit: " + rVar);
    }

    public final q B(long j11) {
        if (j11 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return s(aVar.f82197b.a(((long) this.f82183a) + j11, aVar));
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
            return ChronoUnit.YEARS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l c(j$.time.temporal.l lVar) {
        if (!j$.time.chrono.l.n(lVar).equals(j$.time.chrono.s.f82037c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return lVar.d(this.f82183a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && this.f82183a == ((q) obj).f82183a;
    }

    public final int hashCode() {
        return this.f82183a;
    }

    public final String toString() {
        return Integer.toString(this.f82183a);
    }

    private Object writeReplace() {
        return new o((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
