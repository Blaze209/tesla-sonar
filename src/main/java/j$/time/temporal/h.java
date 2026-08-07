package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum h implements r {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82202a;

    static {
        Duration.w(31556952L, 0);
        Duration.w(7889238L, 0);
    }

    h(String str) {
        this.f82202a = str;
    }

    @Override // j$.time.temporal.r
    public final l s(l lVar, long j11) {
        int i11 = b.f82198a[ordinal()];
        if (i11 == 1) {
            g gVar = i.f82205c;
            return lVar.d(Math.addExact(lVar.e(gVar), j11), gVar);
        }
        if (i11 == 2) {
            return lVar.g(j11 / 4, ChronoUnit.YEARS).g((j11 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f82202a;
    }
}
