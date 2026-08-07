package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends c {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient o f82032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient int f82033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f82034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f82035d;

    @Override // j$.time.chrono.ChronoLocalDate
    public final d F(LocalTime localTime) {
        return new f(this, localTime);
    }

    public q(o oVar, int i11, int i12, int i13) {
        oVar.U(i11, i12, i13);
        this.f82032a = oVar;
        this.f82033b = i11;
        this.f82034c = i12;
        this.f82035d = i13;
    }

    public q(o oVar, long j11) {
        int i11 = (int) j11;
        oVar.R();
        if (i11 < oVar.f82024e || i11 >= oVar.f82025f) {
            throw new DateTimeException("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(oVar.f82023d, i11);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {oVar.T(iBinarySearch), ((oVar.f82026g + iBinarySearch) % 12) + 1, (i11 - oVar.f82023d[iBinarySearch]) + 1};
        this.f82032a = oVar;
        this.f82033b = iArr[0];
        this.f82034c = iArr[1];
        this.f82035d = iArr[2];
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final l getChronology() {
        return this.f82032a;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final m H() {
        return r.AH;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int O() {
        return this.f82032a.X(this.f82033b, 12);
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
        int i11 = p.f82031a[aVar.ordinal()];
        if (i11 == 1) {
            return j$.time.temporal.t.f(1L, this.f82032a.V(this.f82033b, this.f82034c));
        }
        if (i11 != 2) {
            return i11 != 3 ? this.f82032a.u(aVar) : j$.time.temporal.t.f(1L, 5L);
        }
        return j$.time.temporal.t.f(1L, O());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long i(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.J(this);
        }
        switch (p.f82031a[((j$.time.temporal.a) pVar).ordinal()]) {
            case 1:
                return this.f82035d;
            case 2:
                return J();
            case 3:
                return ((this.f82035d - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(toEpochDay() + 3, 7)) + 1;
            case 5:
                return ((this.f82035d - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return toEpochDay();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return this.f82034c;
            case 10:
                return ((((long) this.f82033b) * 12) + ((long) this.f82034c)) - 1;
            case 11:
                return this.f82033b;
            case 12:
                return this.f82033b;
            case 13:
                return this.f82033b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final q d(long j11, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return (q) super.d(j11, pVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        this.f82032a.u(aVar).b(j11, aVar);
        int i11 = (int) j11;
        switch (p.f82031a[aVar.ordinal()]) {
            case 1:
                return S(this.f82033b, this.f82034c, i11);
            case 2:
                return w(Math.min(i11, O()) - J());
            case 3:
                return w((j11 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return w(j11 - ((long) (((int) Math.floorMod(toEpochDay() + 3, 7)) + 1)));
            case 5:
                return w(j11 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return w(j11 - i(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new q(this.f82032a, j11);
            case 8:
                return w((j11 - i(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return S(this.f82033b, i11, this.f82035d);
            case 10:
                return B(j11 - (((((long) this.f82033b) * 12) + ((long) this.f82034c)) - 1));
            case 11:
                if (this.f82033b < 1) {
                    i11 = 1 - i11;
                }
                return S(i11, this.f82034c, this.f82035d);
            case 12:
                return S(i11, this.f82034c, this.f82035d);
            case 13:
                return S(1 - this.f82033b, this.f82034c, this.f82035d);
            default:
                throw new j$.time.temporal.s(j$.time.c.a("Unsupported field: ", pVar));
        }
    }

    public final q S(int i11, int i12, int i13) {
        int iV = this.f82032a.V(i11, i12);
        if (i13 > iV) {
            i13 = iV;
        }
        return new q(this.f82032a, i11, i12, i13);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    /* JADX INFO: renamed from: f */
    public final j$.time.temporal.l k(LocalDate localDate) {
        return (q) super.k(localDate);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate k(j$.time.temporal.m mVar) {
        return (q) super.k(mVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final ChronoLocalDate L(j$.time.temporal.o oVar) {
        return (q) super.L(oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final long toEpochDay() {
        return this.f82032a.U(this.f82033b, this.f82034c, this.f82035d);
    }

    public final int J() {
        return this.f82032a.X(this.f82033b, this.f82034c - 1) + this.f82035d;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean t() {
        return this.f82032a.Q(this.f82033b);
    }

    @Override // j$.time.chrono.c
    public final ChronoLocalDate E(long j11) {
        return j11 == 0 ? this : S(Math.addExact(this.f82033b, (int) j11), this.f82034c, this.f82035d);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final q B(long j11) {
        if (j11 == 0) {
            return this;
        }
        long j12 = (((long) this.f82033b) * 12) + ((long) (this.f82034c - 1)) + j11;
        o oVar = this.f82032a;
        long jFloorDiv = Math.floorDiv(j12, 12L);
        if (jFloorDiv >= oVar.T(0) && jFloorDiv <= oVar.T(oVar.f82023d.length - 1) - 1) {
            return S((int) jFloorDiv, ((int) Math.floorMod(j12, 12L)) + 1, this.f82035d);
        }
        throw new DateTimeException("Invalid Hijrah year: " + jFloorDiv);
    }

    @Override // j$.time.chrono.c
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final q w(long j11) {
        return new q(this.f82032a, toEpochDay() + j11);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate g(long j11, j$.time.temporal.r rVar) {
        return (q) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l g(long j11, j$.time.temporal.r rVar) {
        return (q) super.g(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final ChronoLocalDate a(long j11, j$.time.temporal.r rVar) {
        return (q) super.a(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate, j$.time.temporal.l
    public final j$.time.temporal.l a(long j11, j$.time.temporal.r rVar) {
        return (q) super.a(j11, rVar);
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f82033b == qVar.f82033b && this.f82034c == qVar.f82034c && this.f82035d == qVar.f82035d && this.f82032a.equals(qVar.f82032a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.c, j$.time.chrono.ChronoLocalDate
    public final int hashCode() {
        int i11 = this.f82033b;
        int i12 = this.f82034c;
        int i13 = this.f82035d;
        this.f82032a.getClass();
        return (((i11 << 11) + (i12 << 6)) + i13) ^ ((i11 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new e0((byte) 6, this);
    }
}
