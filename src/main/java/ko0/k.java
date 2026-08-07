package ko0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import j$.time.DateTimeException;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import jn0.m;
import kotlinx.datetime.DateTimeFormatException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\b\u0010\u001a1\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"#\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"#\u0010\u0014\u001a\n \r*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"", "hours", "minutes", "seconds", "Lko0/i;", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lko0/i;", "", "input", "j$/time/format/DateTimeFormatter", "format", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/CharSequence;Lj$/time/format/DateTimeFormatter;)Lko0/i;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "h", "()Lj$/time/format/DateTimeFormatter;", "isoFormat", "b", "g", "isoBasicFormat", "c", "f", "fourDigitsFormat", "kotlinx-datetime"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lazy f86451a = m.b(c.f86456c);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f86452b = m.b(b.f86455c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f86453c = m.b(a.f86454c);

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "b", "()Lj$/time/format/DateTimeFormatter;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<DateTimeFormatter> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f86454c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "b", "()Lj$/time/format/DateTimeFormatter;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements wn0.a<DateTimeFormatter> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f86455c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"j$/time/format/DateTimeFormatter", "kotlin.jvm.PlatformType", "b", "()Lj$/time/format/DateTimeFormatter;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements wn0.a<DateTimeFormatter> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f86456c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    }

    public static final i a(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                s.j(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                return new i(zoneOffsetOfHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                s.j(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                return new i(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            s.j(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
            return new i(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter f() {
        return (DateTimeFormatter) f86453c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter g() {
        return (DateTimeFormatter) f86452b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateTimeFormatter h() {
        return (DateTimeFormatter) f86451a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i i(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        try {
            return new i((ZoneOffset) dateTimeFormatter.parse(charSequence, new TemporalQuery() { // from class: ko0.j
                @Override // j$.time.temporal.TemporalQuery
                public final Object queryFrom(TemporalAccessor temporalAccessor) {
                    return ZoneOffset.from(temporalAccessor);
                }
            }));
        } catch (DateTimeException e11) {
            throw new DateTimeFormatException(e11);
        }
    }
}
