package v3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, d2 = {"Lv3/k0;", "", "", "value", "f", "(I)I", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/lang/String;", "h", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f117711b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f117712c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f117713d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f117714e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f117715f = f(4);

    /* JADX INFO: renamed from: v3.k0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lv3/k0$a;", "", "<init>", "()V", "Lv3/k0;", "Unknown", "I", "e", "()I", "Touch", DateTokenConverter.CONVERTER_KEY, "Mouse", "b", "Stylus", "c", "Eraser", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return k0.f117715f;
        }

        public final int b() {
            return k0.f117713d;
        }

        public final int c() {
            return k0.f117714e;
        }

        public final int d() {
            return k0.f117712c;
        }

        public final int e() {
            return k0.f117711b;
        }

        private Companion() {
        }
    }

    public static final boolean g(int i11, int i12) {
        return i11 == i12;
    }

    public static int h(int i11) {
        return Integer.hashCode(i11);
    }

    public static String i(int i11) {
        if (i11 == 1) {
            return "Touch";
        }
        if (i11 == 2) {
            return "Mouse";
        }
        if (i11 != 3) {
            return i11 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    private static int f(int i11) {
        return i11;
    }
}
