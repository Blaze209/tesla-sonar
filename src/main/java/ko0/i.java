package ko0;

import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import lo0.n;
import lo0.p0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0010\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0017"}, d2 = {"Lko0/i;", "", "j$/time/ZoneOffset", "zoneOffset", "<init>", "(Lj$/time/ZoneOffset;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "a", "Lj$/time/ZoneOffset;", "getZoneOffset$kotlinx_datetime", "()Lj$/time/ZoneOffset;", "totalSeconds", "Companion", "b", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p(with = qo0.j.class)
public final class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f86448b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ZoneOffset zoneOffset;

    /* JADX INFO: renamed from: ko0.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lko0/i$a;", "", "<init>", "()V", "", "input", "Llo0/n;", "Lko0/i;", "format", "a", "(Ljava/lang/CharSequence;Llo0/n;)Lko0/i;", "Lro0/d;", "serializer", "()Lro0/d;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ i b(Companion companion, CharSequence charSequence, n nVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                nVar = l.a();
            }
            return companion.a(charSequence, nVar);
        }

        public final i a(CharSequence input, n<i> format) {
            s.k(input, "input");
            s.k(format, "format");
            b bVar = b.f86450a;
            if (format == bVar.b()) {
                DateTimeFormatter dateTimeFormatterH = k.h();
                s.j(dateTimeFormatterH, "access$getIsoFormat(...)");
                return k.i(input, dateTimeFormatterH);
            }
            if (format == bVar.c()) {
                DateTimeFormatter dateTimeFormatterG = k.g();
                s.j(dateTimeFormatterG, "access$getIsoBasicFormat(...)");
                return k.i(input, dateTimeFormatterG);
            }
            if (format != bVar.a()) {
                return format.a(input);
            }
            DateTimeFormatter dateTimeFormatterF = k.f();
            s.j(dateTimeFormatterF, "access$getFourDigitsFormat(...)");
            return k.i(input, dateTimeFormatterF);
        }

        public final ro0.d<i> serializer() {
            return qo0.j.f105824a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\r"}, d2 = {"Lko0/i$b;", "", "<init>", "()V", "Llo0/n;", "Lko0/i;", "b", "()Llo0/n;", "ISO", "c", "ISO_BASIC", "a", "FOUR_DIGITS", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f86450a = new b();

        private b() {
        }

        public final n<i> a() {
            return p0.b();
        }

        public final n<i> b() {
            return p0.c();
        }

        public final n<i> c() {
            return p0.d();
        }
    }

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        s.j(UTC, "UTC");
        f86448b = new i(UTC);
    }

    public i(ZoneOffset zoneOffset) {
        s.k(zoneOffset, "zoneOffset");
        this.zoneOffset = zoneOffset;
    }

    public final int a() {
        return this.zoneOffset.getTotalSeconds();
    }

    public boolean equals(Object other) {
        return (other instanceof i) && s.f(this.zoneOffset, ((i) other).zoneOffset);
    }

    public int hashCode() {
        return this.zoneOffset.hashCode();
    }

    public String toString() {
        String string = this.zoneOffset.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
