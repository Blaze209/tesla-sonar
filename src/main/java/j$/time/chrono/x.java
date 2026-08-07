package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDate f82042d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient LocalDate f82043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient y f82044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f82045c;

    @Override // j$.time.chrono.ChronoLocalDate
    public final d F(LocalTime localTime) {
        return new f(this, localTime);
    }

    public x(LocalDate localDate) {
        if (localDate.P(f82042d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        y yVarL = y.l(localDate);
        this.f82044b = yVarL;
        this.f82045c = (localDate.getYear() - yVarL.f82049b.getYear()) + 1;
        this.f82043a = localDate;
    }

    public x(y yVar, int i11, LocalDate localDate) {
        if (localDate.P(f82042d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f82044b = yVar;
        this.f82045c = i11;
        this.f82043a = localDate;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l getChronology() {
        return v.f82040c;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        v.f82040c.getClass();
        return this.f82043a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m H() {
        return this.f82044b;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int O() {
        int iO;
        y yVarM = this.f82044b.m();
        if (yVarM != null && yVarM.f82049b.getYear() == this.f82043a.getYear()) {
            iO = yVarM.f82049b.J() - 1;
        } else {
            iO = this.f82043a.O();
        }
        return this.f82045c == 1 ? iO - (this.f82044b.f82049b.J() - 1) : iO;
    }

    @Override // j$.time.chrono.ChronoLocalDate, j$.time.temporal.TemporalAccessor
    public final boolean h(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || pVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || pVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).isDateBased();
        }
        return pVar != null && pVar.s(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t j(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.w(this);
        }
        if (!h(pVar)) {
            throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i11 = w.f82041a[aVar.ordinal()];
        if (i11 == 1) {
            return j$.time.temporal.t.f(1L, this.f82043a.R());
        }
        if (i11 == 2) {
            return j$.time.temporal.t.f(1L, O());
        }
        if (i11 != 3) {
            return v.f82040c.u(aVar);
        }
        int year = this.f82044b.f82049b.getYear();
        y yVarM = this.f82044b.m();
        return yVarM != null ? j$.time.temporal.t.f(1L, (yVarM.f82049b.getYear() - year) + 1) : j$.time.temporal.t.f(1L, 999999999 - year);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.J(this);
        }
        switch (w.f82041a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 2:
                return this.f82045c == 1 ? (this.f82043a.J() - this.f82044b.f82049b.J()) + 1 : this.f82043a.J();
            case 3:
                return this.f82045c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
            case 8:
                return this.f82044b.f82048a;
            default:
                return this.f82043a.i(pVar);
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final x d(long j11, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            if (i(aVar) == j11) {
                return this;
            }
            int[] iArr = w.f82041a;
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 3 || i11 == 8 || i11 == 9) {
                v vVar = v.f82040c;
                int iA = vVar.u(aVar).a(j11, aVar);
                int i12 = iArr[aVar.ordinal()];
                if (i12 == 3) {
                    return S(this.f82043a.c0(vVar.y(this.f82044b, iA)));
                }
                if (i12 == 8) {
                    return S(this.f82043a.c0(vVar.y(y.n(iA), this.f82045c)));
                }
                if (i12 == 9) {
                    return S(this.f82043a.c0(iA));
                }
            }
            return S(this.f82043a.d(j11, pVar));
        }
        return (x) super.d(j11, pVar);
    }

    public final x R(j$.time.e eVar) {
        return (x) super.k(eVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (x) super.k(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate k(j$.time.temporal.m mVar) {
        return (x) super.k(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(j$.time.temporal.o oVar) {
        return (x) super.L(oVar);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate E(long j11) {
        return S(this.f82043a.Y(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate B(long j11) {
        return S(this.f82043a.plusMonths(j11));
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate w(long j11) {
        return S(this.f82043a.W(j11));
    }

    public final x J(long j11, ChronoUnit chronoUnit) {
        return (x) super.g(j11, (j$.time.temporal.r) chronoUnit);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate g(long j11, j$.time.temporal.r rVar) {
        return (x) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l g(long j11, j$.time.temporal.r rVar) {
        return (x) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate a(long j11, j$.time.temporal.r rVar) {
        return (x) super.a(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return (x) super.a(j11, rVar);
    }

    public final x S(LocalDate localDate) {
        return localDate.equals(this.f82043a) ? this : new x(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f82043a.toEpochDay();
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f82043a.equals(((x) obj).f82043a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 4, this);
    }
}
