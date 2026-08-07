package bl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u001a"}, d2 = {"Lbl0/u;", "", "", "name", "", "major", "minor", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "I", "getMajor", "c", "getMinor", DateTokenConverter.CONVERTER_KEY, "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final u f17717e = new u("HTTP", 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u f17718f = new u("HTTP", 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u f17719g = new u("HTTP", 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u f17720h = new u("SPDY", 3, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final u f17721i = new u("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int major;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minor;

    /* JADX INFO: renamed from: bl0.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lbl0/u$a;", "", "<init>", "()V", "Lbl0/u;", "HTTP_2_0", "Lbl0/u;", "c", "()Lbl0/u;", "HTTP_1_1", "b", "HTTP_1_0", "a", "SPDY_3", "e", "QUIC", DateTokenConverter.CONVERTER_KEY, "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f17719g;
        }

        public final u b() {
            return u.f17718f;
        }

        public final u c() {
            return u.f17717e;
        }

        public final u d() {
            return u.f17721i;
        }

        public final u e() {
            return u.f17720h;
        }

        private Companion() {
        }
    }

    public u(String name, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.name = name;
        this.major = i11;
        this.minor = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return p013kotlin.jvm.internal.s.f(this.name, uVar.name) && this.major == uVar.major && this.minor == uVar.minor;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.major)) * 31) + Integer.hashCode(this.minor);
    }

    public String toString() {
        return this.name + '/' + this.major + CoreConstants.DOT + this.minor;
    }
}
