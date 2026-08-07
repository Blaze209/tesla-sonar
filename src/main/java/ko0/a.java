package ko0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import okhttp3.internal.http2.Http2Connection;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \r2\u00020\u0001:\u0005\u000e\b\u000b\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lko0/a;", "", "<init>", "()V", "", "value", "", "unit", "b", "(ILjava/lang/String;)Ljava/lang/String;", "", "c", "(JLjava/lang/String;)Ljava/lang/String;", "Companion", "a", DateTokenConverter.CONVERTER_KEY, "e", "Lko0/a$b;", "Lko0/a$e;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p(with = qo0.b.class)
public abstract class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e f86414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f86415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f86416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f86417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e f86418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e f86419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f86420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f86421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f86422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final d f86423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final d f86424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final d f86425l;

    /* JADX INFO: renamed from: ko0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lko0/a$a;", "", "<init>", "()V", "Lro0/d;", "Lko0/a;", "serializer", "()Lro0/d;", "Lko0/a$c;", "DAY", "Lko0/a$c;", "a", "()Lko0/a$c;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return a.f86420g;
        }

        public final ro0.d<a> serializer() {
            return qo0.b.f105803a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b7\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003Z>\b\u0007\u0010\u000e\"\u00020\u00042\u00020\u0004B0\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\"\b\b\u0012\u001e\b\u000bB\u001a\b\t\u0012\f\b\n\u0012\b\b\fJ\u0004\b\b(\u000b\u0012\b\b\f\u0012\u0004\b\b(\rZ>\b\u0007\u0010\u0012\"\u00020\u000f2\u00020\u000fB0\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0010\u0012\"\b\b\u0012\u001e\b\u000bB\u001a\b\t\u0012\f\b\n\u0012\b\b\fJ\u0004\b\b(\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011\u0082\u0001\u0002\u0004\u000f¨\u0006\u0015"}, d2 = {"Lko0/a$b;", "Lko0/a;", "<init>", "()V", "Lko0/a$c;", "Ljn0/e;", "message", "Use DateTimeUnit.DayBased", "replaceWith", "Ljn0/r;", "imports", "kotlinx.datetime.DateTimeUnit", "expression", "DateTimeUnit.DayBased", "DayBased", "Lko0/a$d;", "Use DateTimeUnit.MonthBased", "DateTimeUnit.MonthBased", "MonthBased", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p(with = qo0.a.class)
    public static abstract class b extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: ko0.a$b$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lko0/a$b$a;", "", "<init>", "()V", "Lro0/d;", "Lko0/a$b;", "serializer", "()Lro0/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<b> serializer() {
                return qo0.a.f105800a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, d2 = {"Lko0/a$c;", "Lko0/a$b;", "", "days", "<init>", "(I)V", "scalar", "e", "(I)Lko0/a$c;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "m", "I", DateTokenConverter.CONVERTER_KEY, "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p(with = qo0.d.class)
    public static final class c extends b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final int days;

        /* JADX INFO: renamed from: ko0.a$c$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lko0/a$c$a;", "", "<init>", "()V", "Lro0/d;", "Lko0/a$c;", "serializer", "()Lro0/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<c> serializer() {
                return qo0.d.f105806a;
            }

            private Companion() {
            }
        }

        public c(int i11) {
            super(null);
            this.days = i11;
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("Unit duration must be positive, but was " + i11 + " days.").toString());
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getDays() {
            return this.days;
        }

        public c e(int scalar) {
            return new c(mo0.b.b(this.days, scalar));
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof c) && this.days == ((c) other).days;
            }
            return true;
        }

        public int hashCode() {
            return this.days ^ 65536;
        }

        public String toString() {
            int i11 = this.days;
            return i11 % 7 == 0 ? b(i11 / 7, "WEEK") : b(i11, "DAY");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0018"}, d2 = {"Lko0/a$d;", "Lko0/a$b;", "", "months", "<init>", "(I)V", "scalar", "e", "(I)Lko0/a$d;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "m", "I", DateTokenConverter.CONVERTER_KEY, "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p(with = qo0.h.class)
    public static final class d extends b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final int months;

        /* JADX INFO: renamed from: ko0.a$d$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lko0/a$d$a;", "", "<init>", "()V", "Lro0/d;", "Lko0/a$d;", "serializer", "()Lro0/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<d> serializer() {
                return qo0.h.f105816a;
            }

            private Companion() {
            }
        }

        public d(int i11) {
            super(null);
            this.months = i11;
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("Unit duration must be positive, but was " + i11 + " months.").toString());
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getMonths() {
            return this.months;
        }

        public d e(int scalar) {
            return new d(mo0.b.b(this.months, scalar));
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof d) && this.months == ((d) other).months;
            }
            return true;
        }

        public int hashCode() {
            return this.months ^ 131072;
        }

        public String toString() {
            int i11 = this.months;
            if (i11 % 1200 == 0) {
                return b(i11 / 1200, "CENTURY");
            }
            if (i11 % 12 == 0) {
                return b(i11 / 12, "YEAR");
            }
            return i11 % 3 == 0 ? b(i11 / 3, "QUARTER") : b(i11, "MONTH");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, d2 = {"Lko0/a$e;", "Lko0/a;", "", "nanoseconds", "<init>", "(J)V", "", "scalar", "e", "(I)Lko0/a$e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "m", "J", DateTokenConverter.CONVERTER_KEY, "()J", "n", "Ljava/lang/String;", "unitName", "o", "unitScale", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @p(with = qo0.i.class)
    public static final class e extends a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final long nanoseconds;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String unitName;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final long unitScale;

        /* JADX INFO: renamed from: ko0.a$e$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lko0/a$e$a;", "", "<init>", "()V", "Lro0/d;", "Lko0/a$e;", "serializer", "()Lro0/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ro0.d<e> serializer() {
                return qo0.i.f105820a;
            }

            private Companion() {
            }
        }

        public e(long j11) {
            super(null);
            this.nanoseconds = j11;
            if (j11 <= 0) {
                throw new IllegalArgumentException(("Unit duration must be positive, but was " + j11 + " ns.").toString());
            }
            if (j11 % 3600000000000L == 0) {
                this.unitName = "HOUR";
                this.unitScale = j11 / 3600000000000L;
                return;
            }
            if (j11 % 60000000000L == 0) {
                this.unitName = "MINUTE";
                this.unitScale = j11 / 60000000000L;
                return;
            }
            long j12 = Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            if (j11 % j12 == 0) {
                this.unitName = "SECOND";
                this.unitScale = j11 / j12;
                return;
            }
            long j13 = 1000000;
            if (j11 % j13 == 0) {
                this.unitName = "MILLISECOND";
                this.unitScale = j11 / j13;
                return;
            }
            long j14 = 1000;
            if (j11 % j14 == 0) {
                this.unitName = "MICROSECOND";
                this.unitScale = j11 / j14;
            } else {
                this.unitName = "NANOSECOND";
                this.unitScale = j11;
            }
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getNanoseconds() {
            return this.nanoseconds;
        }

        public e e(int scalar) {
            return new e(mo0.b.c(this.nanoseconds, scalar));
        }

        public boolean equals(Object other) {
            if (this != other) {
                return (other instanceof e) && this.nanoseconds == ((e) other).nanoseconds;
            }
            return true;
        }

        public int hashCode() {
            long j11 = this.nanoseconds;
            return ((int) (j11 >> 32)) ^ ((int) j11);
        }

        public String toString() {
            return c(this.unitScale, this.unitName);
        }
    }

    static {
        e eVar = new e(1L);
        f86414a = eVar;
        e eVarE = eVar.e(1000);
        f86415b = eVarE;
        e eVarE2 = eVarE.e(1000);
        f86416c = eVarE2;
        e eVarE3 = eVarE2.e(1000);
        f86417d = eVarE3;
        e eVarE4 = eVarE3.e(60);
        f86418e = eVarE4;
        f86419f = eVarE4.e(60);
        c cVar = new c(1);
        f86420g = cVar;
        f86421h = cVar.e(7);
        d dVar = new d(1);
        f86422i = dVar;
        f86423j = dVar.e(3);
        d dVarE = dVar.e(12);
        f86424k = dVarE;
        f86425l = dVarE.e(100);
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    protected final String b(int value, String unit) {
        s.k(unit, "unit");
        if (value == 1) {
            return unit;
        }
        return value + CoreConstants.DASH_CHAR + unit;
    }

    protected final String c(long value, String unit) {
        s.k(unit, "unit");
        if (value == 1) {
            return unit;
        }
        return value + CoreConstants.DASH_CHAR + unit;
    }

    private a() {
    }
}
