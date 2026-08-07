package ko0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import j$.time.DateTimeException;
import j$.time.Instant;
import kotlinx.datetime.DateTimeFormatException;
import lo0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lko0/c;", "", "j$/time/Instant", "value", "<init>", "(Lj$/time/Instant;)V", "other", "", "c", "(Lko0/c;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lj$/time/Instant;", "getValue$kotlinx_datetime", "()Lj$/time/Instant;", "", DateTokenConverter.CONVERTER_KEY, "()J", "epochSeconds", "Companion", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p(with = qo0.e.class)
public final class c implements Comparable<c> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f86432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f86433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f86434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f86435e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Instant value;

    /* JADX INFO: renamed from: ko0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0018HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lko0/c$a;", "", "<init>", "()V", "", "input", "Llo0/n;", "Llo0/j;", "format", "Lko0/c;", "e", "(Ljava/lang/CharSequence;Llo0/n;)Lko0/c;", "", "isoString", "f", "(Ljava/lang/String;)Lko0/c;", "", "epochSeconds", "nanosecondAdjustment", "b", "(JJ)Lko0/c;", "", "a", "(JI)Lko0/c;", "Lro0/d;", "serializer", "()Lro0/d;", "MIN", "Lko0/c;", DateTokenConverter.CONVERTER_KEY, "()Lko0/c;", "MAX", "c", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c g(Companion companion, CharSequence charSequence, n nVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                nVar = lo0.j.b.f90540a.a();
            }
            return companion.e(charSequence, nVar);
        }

        public final c a(long epochSeconds, int nanosecondAdjustment) {
            return b(epochSeconds, nanosecondAdjustment);
        }

        public final c b(long epochSeconds, long nanosecondAdjustment) throws Exception {
            try {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(epochSeconds, nanosecondAdjustment);
                s.j(instantOfEpochSecond, "ofEpochSecond(...)");
                return new c(instantOfEpochSecond);
            } catch (Exception e11) {
                if ((e11 instanceof ArithmeticException) || (e11 instanceof DateTimeException)) {
                    return epochSeconds > 0 ? c() : d();
                }
                throw e11;
            }
        }

        public final c c() {
            return c.f86435e;
        }

        public final c d() {
            return c.f86434d;
        }

        public final c e(CharSequence input, n<lo0.j> format) {
            s.k(input, "input");
            s.k(format, "format");
            try {
                return format.a(input).c();
            } catch (IllegalArgumentException e11) {
                throw new DateTimeFormatException("Failed to parse an instant from '" + ((Object) input) + CoreConstants.SINGLE_QUOTE_CHAR, e11);
            }
        }

        @jn0.e
        public final /* synthetic */ c f(String isoString) {
            s.k(isoString, "isoString");
            return g(this, isoString, null, 2, null);
        }

        public final ro0.d<c> serializer() {
            return qo0.e.f105810a;
        }

        private Companion() {
        }
    }

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        s.j(instantOfEpochSecond, "ofEpochSecond(...)");
        f86432b = new c(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        s.j(instantOfEpochSecond2, "ofEpochSecond(...)");
        f86433c = new c(instantOfEpochSecond2);
        Instant MIN = Instant.MIN;
        s.j(MIN, "MIN");
        f86434d = new c(MIN);
        Instant MAX = Instant.MAX;
        s.j(MAX, "MAX");
        f86435e = new c(MAX);
    }

    public c(Instant value) {
        s.k(value, "value");
        this.value = value;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(c other) {
        s.k(other, "other");
        return this.value.compareTo(other.value);
    }

    public final long d() {
        return this.value.getEpochSecond();
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof c) && s.f(this.value, ((c) other).value);
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
}
