package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum ChronoUnit implements r {
    NANOS("Nanos", Duration.B(1)),
    MICROS("Micros", Duration.B(1000)),
    MILLIS("Millis", Duration.B(1000000)),
    SECONDS("Seconds", Duration.w(1, 0)),
    MINUTES("Minutes", Duration.w(60, 0)),
    HOURS("Hours", Duration.w(3600, 0)),
    HALF_DAYS("HalfDays", Duration.w(43200, 0)),
    DAYS("Days", Duration.w(86400, 0)),
    WEEKS("Weeks", Duration.w(604800, 0)),
    MONTHS("Months", Duration.w(2629746, 0)),
    YEARS("Years", Duration.w(31556952, 0)),
    DECADES("Decades", Duration.w(315569520, 0)),
    CENTURIES("Centuries", Duration.w(3155695200L, 0)),
    MILLENNIA("Millennia", Duration.w(31556952000L, 0)),
    ERAS("Eras", Duration.w(31556952000000000L, 0)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Duration f82194b;

    ChronoUnit(String str, Duration duration) {
        this.f82193a = str;
        this.f82194b = duration;
    }

    public Duration getDuration() {
        return this.f82194b;
    }

    @Override // j$.time.temporal.r
    public final l s(l lVar, long j11) {
        return lVar.g(j11, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f82193a;
    }
}
