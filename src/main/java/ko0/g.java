package ko0;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import j$.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import lo0.b0;
import lo0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0017\fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B-\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lko0/g;", "", "j$/time/LocalTime", "value", "<init>", "(Lj$/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "b", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "a", "(Lko0/g;)I", "Lj$/time/LocalTime;", "getValue$kotlinx_datetime", "()Lj$/time/LocalTime;", "Companion", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p(with = qo0.g.class)
public final class g implements Comparable<g> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f86444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g f86445c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LocalTime value;

    /* JADX INFO: renamed from: ko0.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lko0/g$a;", "", "<init>", "()V", "", "input", "Llo0/n;", "Lko0/g;", "format", "a", "(Ljava/lang/CharSequence;Llo0/n;)Lko0/g;", "Lro0/d;", "serializer", "()Lro0/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ g b(Companion companion, CharSequence charSequence, n nVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                nVar = h.a();
            }
            return companion.a(charSequence, nVar);
        }

        public final g a(CharSequence input, n<g> format) {
            s.k(input, "input");
            s.k(format, "format");
            if (format != b.f86447a.a()) {
                return format.a(input);
            }
            try {
                return new g(LocalTime.parse(input));
            } catch (DateTimeParseException e11) {
                throw new DateTimeFormatException(e11);
            }
        }

        public final ro0.d<g> serializer() {
            return qo0.g.f105814a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lko0/g$b;", "", "<init>", "()V", "Llo0/n;", "Lko0/g;", "a", "()Llo0/n;", "ISO", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f86447a = new b();

        private b() {
        }

        public final n<g> a() {
            return b0.b();
        }
    }

    static {
        LocalTime MIN = LocalTime.MIN;
        s.j(MIN, "MIN");
        f86444b = new g(MIN);
        LocalTime MAX = LocalTime.MAX;
        s.j(MAX, "MAX");
        f86445c = new g(MAX);
    }

    public g(LocalTime value) {
        s.k(value, "value");
        this.value = value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g other) {
        s.k(other, "other");
        return this.value.compareTo(other.value);
    }

    public final int b() {
        return this.value.toSecondOfDay();
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof g) && s.f(this.value, ((g) other).value);
        }
        return true;
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
    public g(int i11, int i12, int i13, int i14) {
        try {
            LocalTime localTimeOf = LocalTime.of(i11, i12, i13, i14);
            s.h(localTimeOf);
            this(localTimeOf);
        } catch (DateTimeException e11) {
            throw new IllegalArgumentException(e11);
        }
    }
}
