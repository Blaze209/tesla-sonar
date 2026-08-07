package k3;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lk3/d3;", "", "", "value", "c", "(I)I", "", "f", "(I)Ljava/lang/String;", "e", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f84755b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f84756c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f84757d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f84758e = c(3);

    /* JADX INFO: renamed from: k3.d3$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lk3/d3$a;", "", "<init>", "()V", "Lk3/d3;", "None", "I", "b", "()I", "Low", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d3.f84756c;
        }

        public final int b() {
            return d3.f84755b;
        }

        private Companion() {
        }
    }

    public static final boolean d(int i11, int i12) {
        return i11 == i12;
    }

    public static int e(int i11) {
        return Integer.hashCode(i11);
    }

    public static String f(int i11) {
        if (d(i11, f84755b)) {
            return "None";
        }
        if (d(i11, f84756c)) {
            return "Low";
        }
        if (d(i11, f84757d)) {
            return "Medium";
        }
        return d(i11, f84758e) ? "High" : "Unknown";
    }

    public static int c(int i11) {
        return i11;
    }
}
