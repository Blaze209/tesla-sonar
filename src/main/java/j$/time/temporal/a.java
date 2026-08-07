package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum a implements p {
    NANO_OF_SECOND("NanoOfSecond", t.f(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", t.f(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", t.f(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", t.f(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", t.f(0, 999)),
    MILLI_OF_DAY("MilliOfDay", t.f(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", t.f(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", t.f(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", t.f(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", t.f(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", t.f(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", t.f(1, 12)),
    HOUR_OF_DAY("HourOfDay", t.f(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", t.f(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", t.f(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", t.f(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", t.f(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", t.f(1, 7)),
    DAY_OF_MONTH("DayOfMonth", t.g(1, 28, 31), 0),
    DAY_OF_YEAR("DayOfYear", t.g(1, 365, 366)),
    EPOCH_DAY("EpochDay", t.f(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", t.g(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", t.f(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", t.f(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", t.f(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", t.g(1, 999999999, 1000000000)),
    YEAR("Year", t.f(-999999999, 999999999), 0),
    ERA("Era", t.f(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", t.f(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", t.f(-64800, 64800));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f82197b;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    a(String str, t tVar) {
        this.f82196a = str;
        this.f82197b = tVar;
    }

    a(String str, t tVar, int i11) {
        this.f82196a = str;
        this.f82197b = tVar;
    }

    @Override // j$.time.temporal.p
    public final t E() {
        return this.f82197b;
    }

    public final void R(long j11) {
        this.f82197b.b(j11, this);
    }

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean S() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.p
    public final boolean s(TemporalAccessor temporalAccessor) {
        return temporalAccessor.h(this);
    }

    @Override // j$.time.temporal.p
    public final t w(TemporalAccessor temporalAccessor) {
        return temporalAccessor.j(this);
    }

    @Override // j$.time.temporal.p
    public final long J(TemporalAccessor temporalAccessor) {
        return temporalAccessor.i(this);
    }

    @Override // j$.time.temporal.p
    public final l P(l lVar, long j11) {
        return lVar.d(j11, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f82196a;
    }
}
