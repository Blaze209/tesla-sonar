package ko0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.Month;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import lo0.n;
import lo0.z;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0015\"B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0015\u0010!\u001a\u00060\u001dj\u0002`\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0015\u0010'\u001a\u00060#j\u0002`$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lko0/d;", "", "j$/time/LocalDate", "value", "<init>", "(Lj$/time/LocalDate;)V", "", "year", "monthNumber", "dayOfMonth", "(III)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lko0/d;)I", "h", "Lj$/time/LocalDate;", "f", "()Lj$/time/LocalDate;", "g", "e", "j$/time/Month", "Lkotlinx/datetime/Month;", DateTokenConverter.CONVERTER_KEY, "()Lj$/time/Month;", "month", "b", "j$/time/DayOfWeek", "Lkotlinx/datetime/DayOfWeek;", "c", "()Lj$/time/DayOfWeek;", "dayOfWeek", "Companion", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p(with = qo0.f.class)
public final class d implements Comparable<d> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f86437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f86438c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LocalDate value;

    /* JADX INFO: renamed from: ko0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lko0/d$a;", "", "<init>", "()V", "", "input", "Llo0/n;", "Lko0/d;", "format", "a", "(Ljava/lang/CharSequence;Llo0/n;)Lko0/d;", "Lro0/d;", "serializer", "()Lro0/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d b(Companion companion, CharSequence charSequence, n nVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                nVar = f.a();
            }
            return companion.a(charSequence, nVar);
        }

        public final d a(CharSequence input, n<d> format) {
            s.k(input, "input");
            s.k(format, "format");
            if (format != b.f86440a.a()) {
                return format.a(input);
            }
            try {
                return new d(LocalDate.parse(mo0.d.d(input.toString())));
            } catch (DateTimeParseException e11) {
                throw new DateTimeFormatException(e11);
            }
        }

        public final ro0.d<d> serializer() {
            return qo0.f.f105812a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lko0/d$b;", "", "<init>", "()V", "Llo0/n;", "Lko0/d;", "b", "Llo0/n;", "getISO_BASIC", "()Llo0/n;", "ISO_BASIC", "a", "ISO", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f86440a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final n<d> ISO_BASIC = z.c();

        private b() {
        }

        public final n<d> a() {
            return z.b();
        }
    }

    static {
        LocalDate MIN = LocalDate.MIN;
        s.j(MIN, "MIN");
        f86437b = new d(MIN);
        LocalDate MAX = LocalDate.MAX;
        s.j(MAX, "MAX");
        f86438c = new d(MAX);
    }

    public d(LocalDate value) {
        s.k(value, "value");
        this.value = value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d other) {
        s.k(other, "other");
        return this.value.compareTo((ChronoLocalDate) other.value);
    }

    public final int b() {
        return this.value.getDayOfMonth();
    }

    public final DayOfWeek c() {
        DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        s.j(dayOfWeek, "getDayOfWeek(...)");
        return dayOfWeek;
    }

    public final Month d() {
        Month month = this.value.getMonth();
        s.j(month, "getMonth(...)");
        return month;
    }

    public final int e() {
        return this.value.getMonthValue();
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof d) && s.f(this.value, ((d) other).value);
        }
        return true;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getValue() {
        return this.value;
    }

    public final int g() {
        return this.value.getYear();
    }

    public final int h() {
        return mo0.c.a(this.value.toEpochDay());
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        String string = this.value.toString();
        s.j(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(int i11, int i12, int i13) {
        try {
            LocalDate localDateOf = LocalDate.of(i11, i12, i13);
            s.h(localDateOf);
            this(localDateOf);
        } catch (DateTimeException e11) {
            throw new IllegalArgumentException(e11);
        }
    }
}
