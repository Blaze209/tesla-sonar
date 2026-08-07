package lo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.nearby.messages.Strategy;
import kotlinx.datetime.DateTimeFormatException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b3\u0018\u0000 E2\u00020\u0001:\u0002\u000f\u0015B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R/\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR/\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR/\u0010\"\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR/\u0010%\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR/\u0010)\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR/\u0010-\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u0016\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR/\u00101\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR/\u00105\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR/\u00109\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u0010\u0016\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR/\u0010=\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u0016\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001aR/\u0010A\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b>\u0010\u001a*\u0004\b?\u0010@R(\u0010D\u001a\u0004\u0018\u00010\u00132\b\u0010B\u001a\u0004\u0018\u00010\u00138F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0018\"\u0004\bC\u0010\u001a¨\u0006F"}, d2 = {"Llo0/j;", "", "Llo0/k;", "contents", "<init>", "(Llo0/k;)V", "Lko0/i;", "e", "()Lko0/i;", "Lko0/g;", DateTokenConverter.CONVERTER_KEY, "()Lko0/g;", "Lko0/c;", "c", "()Lko0/c;", "a", "Llo0/k;", "getContents$kotlinx_datetime", "()Llo0/k;", "", "<set-?>", "b", "Llo0/m0;", "getMonthNumber", "()Ljava/lang/Integer;", "setMonthNumber", "(Ljava/lang/Integer;)V", "monthNumber", "getDayOfMonth", "setDayOfMonth", "dayOfMonth", "Llo0/j0;", "getDayOfYear", "setDayOfYear", "dayOfYear", "getHour", "setHour", "hour", "f", "getHourOfAmPm", "setHourOfAmPm", "hourOfAmPm", "g", "getMinute", "setMinute", "minute", "h", "getSecond", "setSecond", "second", IntegerTokenConverter.CONVERTER_KEY, "getOffsetHours", "setOffsetHours", "offsetHours", "j", "getOffsetMinutesOfHour", "setOffsetMinutesOfHour", "offsetMinutesOfHour", "k", "getOffsetSecondsOfMinute", "setOffsetSecondsOfMinute", "offsetSecondsOfMinute", "setYear", "getYear$delegate", "(Llo0/j;)Ljava/lang/Object;", "year", "value", "setNanosecond", "nanosecond", "l", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lo0.k contents;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m0 monthNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 dayOfMonth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j0 dayOfYear;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m0 hour;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m0 hourOfAmPm;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m0 minute;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m0 second;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final m0 offsetHours;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final m0 offsetMinutesOfHour;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final m0 offsetSecondsOfMinute;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ co0.m<Object>[] f90528m = {p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "dayOfYear", "getDayOfYear()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "hour", "getHour()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "minute", "getMinute()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "second", "getSecond()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0)), p013kotlin.jvm.internal.o0.f(new p013kotlin.jvm.internal.z(j.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0))};

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lo0.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Llo0/j$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Llo0/o$b;", "Ljn0/h0;", "block", "Llo0/n;", "Llo0/j;", "a", "(Lwn0/l;)Llo0/n;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n<j> a(wn0.l<? super o.b, jn0.h0> block) {
            p013kotlin.jvm.internal.s.k(block, "block");
            lo0.l.a aVar = new lo0.l.a(new no0.d());
            block.invoke(aVar);
            return new lo0.l(aVar.x());
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Llo0/j$b;", "", "<init>", "()V", "Llo0/n;", "Llo0/j;", "b", "Llo0/n;", "a", "()Llo0/n;", "ISO_DATE_TIME_OFFSET", "c", "getRFC_1123", "RFC_1123", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f90540a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final n<j> ISO_DATE_TIME_OFFSET;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final n<j> RFC_1123;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f90543c = new a();

            /* JADX INFO: renamed from: lo0.j$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class C1913a extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C1913a f90544c = new C1913a();

                C1913a() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    p.b(alternativeParsing, 't');
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: lo0.j$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class C1914b extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C1914b f90545c = new C1914b();

                C1914b() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    p.b(alternativeParsing, 'T');
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class c extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final c f90546c = new c();

                c() {
                    super(1);
                }

                public final void a(o.b optional) {
                    p013kotlin.jvm.internal.s.k(optional, "$this$optional");
                    p.b(optional, CoreConstants.DOT);
                    optional.f(1, 9);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class d extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final d f90547c = new d();

                d() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    o.d.a.a(alternativeParsing, null, 1, null);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class e extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final e f90548c = new e();

                e() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    alternativeParsing.o(ko0.i.b.f86450a.b());
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            a() {
                super(1);
            }

            public final void a(o.b Format) {
                p013kotlin.jvm.internal.s.k(Format, "$this$Format");
                Format.b(z.b());
                p.a(Format, new wn0.l[]{C1913a.f90544c}, C1914b.f90545c);
                o.c.a.a(Format, null, 1, null);
                p.b(Format, CoreConstants.COLON_CHAR);
                o.c.a.b(Format, null, 1, null);
                p.b(Format, CoreConstants.COLON_CHAR);
                o.c.a.c(Format, null, 1, null);
                p.d(Format, null, c.f90546c, 1, null);
                p.a(Format, new wn0.l[]{d.f90547c}, e.f90548c);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                a(bVar);
                return jn0.h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: lo0.j$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
        static final class C1915b extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1915b f90549c = new C1915b();

            /* JADX INFO: renamed from: lo0.j$b$b$a */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class a extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final a f90550c = new a();

                a() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: lo0.j$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class C1916b extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C1916b f90551c = new C1916b();

                C1916b() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    alternativeParsing.c(s.INSTANCE.a());
                    alternativeParsing.d(", ");
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: lo0.j$b$b$c */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class c extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final c f90552c = new c();

                c() {
                    super(1);
                }

                public final void a(o.b optional) {
                    p013kotlin.jvm.internal.s.k(optional, "$this$optional");
                    p.b(optional, CoreConstants.COLON_CHAR);
                    o.c.a.c(optional, null, 1, null);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: lo0.j$b$b$d */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class d extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final d f90553c = new d();

                d() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    alternativeParsing.d("UT");
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: lo0.j$b$b$e */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class e extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final e f90554c = new e();

                e() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    alternativeParsing.d("Z");
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: lo0.j$b$b$f */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
            static final class f extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final f f90555c = new f();

                /* JADX INFO: renamed from: lo0.j$b$b$f$a */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llo0/o$b;", "Ljn0/h0;", "a", "(Llo0/o$b;)V"}, k = 3, mv = {1, 9, 0})
                static final class a extends p013kotlin.jvm.internal.u implements wn0.l<o.b, jn0.h0> {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final a f90556c = new a();

                    a() {
                        super(1);
                    }

                    public final void a(o.b optional) {
                        p013kotlin.jvm.internal.s.k(optional, "$this$optional");
                        optional.o(ko0.i.b.f86450a.a());
                    }

                    @Override // wn0.l
                    public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                        a(bVar);
                        return jn0.h0.f84049a;
                    }
                }

                f() {
                    super(1);
                }

                public final void a(o.b alternativeParsing) {
                    p013kotlin.jvm.internal.s.k(alternativeParsing, "$this$alternativeParsing");
                    p.c(alternativeParsing, "GMT", a.f90556c);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            C1915b() {
                super(1);
            }

            public final void a(o.b Format) {
                p013kotlin.jvm.internal.s.k(Format, "$this$Format");
                p.a(Format, new wn0.l[]{a.f90550c}, C1916b.f90551c);
                Format.p(h0.NONE);
                p.b(Format, ' ');
                Format.m(f0.INSTANCE.a());
                p.b(Format, ' ');
                o.a.C1918a.c(Format, null, 1, null);
                p.b(Format, ' ');
                o.c.a.a(Format, null, 1, null);
                p.b(Format, CoreConstants.COLON_CHAR);
                o.c.a.b(Format, null, 1, null);
                p.d(Format, null, c.f90552c, 1, null);
                Format.d(" ");
                p.a(Format, new wn0.l[]{d.f90553c, e.f90554c}, f.f90555c);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(o.b bVar) {
                a(bVar);
                return jn0.h0.f84049a;
            }
        }

        static {
            Companion companion = j.INSTANCE;
            ISO_DATE_TIME_OFFSET = companion.a(a.f90543c);
            RFC_1123 = companion.a(C1915b.f90549c);
        }

        private b() {
        }

        public final n<j> a() {
            return ISO_DATE_TIME_OFFSET;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Integer a() {
        return this.contents.getTime().getNanosecond();
    }

    public final Integer b() {
        return this.contents.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField.TYPE java.lang.String().getYear();
    }

    public final ko0.c c() {
        ko0.i iVarE = e();
        ko0.g gVarD = d();
        v vVarA = this.contents.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField.TYPE java.lang.String().copy();
        vVarA.C(Integer.valueOf(((Number) z.d(vVarA.getYear(), "year")).intValue() % 10000));
        try {
            Integer numB = b();
            p013kotlin.jvm.internal.s.h(numB);
            long jA = mo0.b.a(mo0.b.c(numB.intValue() / 10000, 315569520000L), ((((long) vVarA.c().h()) * ((long) Strategy.TTL_SECONDS_MAX)) + ((long) gVarD.b())) - ((long) iVarE.a()));
            ko0.c.Companion aVar = ko0.c.INSTANCE;
            if (jA < aVar.d().d() || jA > aVar.c().d()) {
                throw new DateTimeFormatException("The parsed date is outside the range representable by Instant");
            }
            Integer numA = a();
            return aVar.a(jA, numA != null ? numA.intValue() : 0);
        } catch (ArithmeticException e11) {
            throw new DateTimeFormatException("The parsed date is outside the range representable by Instant", e11);
        }
    }

    public final ko0.g d() {
        return this.contents.getTime().f();
    }

    public final ko0.i e() {
        return this.contents.getOffset().b();
    }

    public j(lo0.k contents) {
        p013kotlin.jvm.internal.s.k(contents, "contents");
        this.contents = contents;
        contents.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField.TYPE java.lang.String();
        this.monthNumber = new m0(new p013kotlin.jvm.internal.x(contents.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField.TYPE java.lang.String()) { // from class: lo0.j.h
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((v) this.receiver).getMonthNumber();
            }
        });
        this.dayOfMonth = new m0(new p013kotlin.jvm.internal.x(contents.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField.TYPE java.lang.String()) { // from class: lo0.j.c
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((v) this.receiver).getDayOfMonth();
            }
        });
        this.dayOfYear = new j0(new p013kotlin.jvm.internal.x(contents.getCom.withpersona.sdk2.inquiry.network.dto.InquiryField.DateField.TYPE java.lang.String()) { // from class: lo0.j.d
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((v) this.receiver).getDayOfYear();
            }
        });
        this.hour = new m0(new p013kotlin.jvm.internal.x(contents.getTime()) { // from class: lo0.j.e
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((w) this.receiver).getHour();
            }
        });
        this.hourOfAmPm = new m0(new p013kotlin.jvm.internal.x(contents.getTime()) { // from class: lo0.j.f
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((w) this.receiver).getHourOfAmPm();
            }
        });
        contents.getTime();
        this.minute = new m0(new p013kotlin.jvm.internal.x(contents.getTime()) { // from class: lo0.j.g
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((w) this.receiver).getMinute();
            }
        });
        this.second = new m0(new p013kotlin.jvm.internal.x(contents.getTime()) { // from class: lo0.j.l
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((w) this.receiver).getSecond();
            }
        });
        contents.getOffset();
        this.offsetHours = new m0(new p013kotlin.jvm.internal.x(contents.getOffset()) { // from class: lo0.j.i
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((x) this.receiver).getTotalHoursAbs();
            }
        });
        this.offsetMinutesOfHour = new m0(new p013kotlin.jvm.internal.x(contents.getOffset()) { // from class: lo0.j.j
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((x) this.receiver).getMinutesOfHour();
            }
        });
        this.offsetSecondsOfMinute = new m0(new p013kotlin.jvm.internal.x(contents.getOffset()) { // from class: lo0.j.k
            @Override // p013kotlin.jvm.internal.x, co0.n
            public Object get() {
                return ((x) this.receiver).getSecondsOfMinute();
            }
        });
    }

    public /* synthetic */ j(lo0.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            kVar = new lo0.k(null, null, null, null, 15, null);
        }
        this(kVar);
    }
}
