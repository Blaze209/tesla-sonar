package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.format.b0;
import j$.time.format.c0;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum j implements p {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f82208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient t f82209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f82210c;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j11) {
        this.f82208a = str;
        this.f82209b = t.f((-365243219162L) + j11, 365241780471L + j11);
        this.f82210c = j11;
    }

    @Override // j$.time.temporal.p
    public final t E() {
        return this.f82209b;
    }

    @Override // j$.time.temporal.p
    public final l P(l lVar, long j11) {
        if (!this.f82209b.e(j11)) {
            throw new DateTimeException("Invalid value: " + this.f82208a + " " + j11);
        }
        return lVar.d(Math.subtractExact(j11, this.f82210c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final boolean s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final t w(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.h(a.EPOCH_DAY)) {
            return this.f82209b;
        }
        throw new DateTimeException("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final long J(TemporalAccessor temporalAccessor) {
        return temporalAccessor.i(a.EPOCH_DAY) + this.f82210c;
    }

    @Override // j$.time.temporal.p
    public final TemporalAccessor B(Map map, b0 b0Var, c0 c0Var) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.l lVarN = j$.time.chrono.l.n(b0Var);
        c0 c0Var2 = c0.LENIENT;
        long j11 = this.f82210c;
        if (c0Var == c0Var2) {
            return lVarN.l(Math.subtractExact(jLongValue, j11));
        }
        this.f82209b.b(jLongValue, this);
        return lVarN.l(jLongValue - j11);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f82208a;
    }
}
