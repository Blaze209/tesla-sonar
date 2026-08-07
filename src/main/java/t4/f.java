package t4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0004\u000e\u0019\u001a\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0017\u0010\u0015\u001a\u00020\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0017\u0010\u0018\u001a\u00020\u00168Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Lt4/f;", "", "", "mask", DateTokenConverter.CONVERTER_KEY, "(I)I", "", "k", "(I)Ljava/lang/String;", "j", "other", "", "e", "(ILjava/lang/Object;)Z", "a", "I", "Lt4/f$b;", "g", "strategy", "Lt4/f$c;", "h", "strictness", "Lt4/f$d;", IntegerTokenConverter.CONVERTER_KEY, "wordBreak", "b", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f112296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f112297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f112298e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f112299f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* JADX INFO: renamed from: t4.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lt4/f$a;", "", "<init>", "()V", "Lt4/f;", "Simple", "I", "a", "()I", "getSimple-rAG3T2k$annotations", "Unspecified", "b", "getUnspecified-rAG3T2k$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return f.f112296c;
        }

        public final int b() {
            return f.f112299f;
        }

        private Companion() {
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        int iC = companion.c();
        c.Companion companion2 = c.INSTANCE;
        int iC2 = companion2.c();
        d.Companion companion3 = d.INSTANCE;
        f112296c = d(g.e(iC, iC2, companion3.a()));
        f112297d = d(g.e(companion.a(), companion2.b(), companion3.b()));
        f112298e = d(g.e(companion.b(), companion2.d(), companion3.a()));
        f112299f = d(0);
    }

    private /* synthetic */ f(int i11) {
        this.mask = i11;
    }

    public static final /* synthetic */ f c(int i11) {
        return new f(i11);
    }

    public static boolean e(int i11, Object obj) {
        return (obj instanceof f) && i11 == ((f) obj).getMask();
    }

    public static final boolean f(int i11, int i12) {
        return i11 == i12;
    }

    public static final int g(int i11) {
        return b.d(g.f(i11));
    }

    public static final int h(int i11) {
        return c.e(g.g(i11));
    }

    public static final int i(int i11) {
        return d.c(g.h(i11));
    }

    public static int j(int i11) {
        return Integer.hashCode(i11);
    }

    public static String k(int i11) {
        return "LineBreak(strategy=" + ((Object) b.f(g(i11))) + ", strictness=" + ((Object) c.g(h(i11))) + ", wordBreak=" + ((Object) d.e(i(i11))) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return e(this.mask, obj);
    }

    public int hashCode() {
        return j(this.mask);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ int getMask() {
        return this.mask;
    }

    public String toString() {
        return k(this.mask);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lt4/f$b;", "", "", "value", DateTokenConverter.CONVERTER_KEY, "(I)I", "", "f", "(I)Ljava/lang/String;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f112302b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f112303c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f112304d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f112305e = d(0);

        /* JADX INFO: renamed from: t4.f$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lt4/f$b$a;", "", "<init>", "()V", "Lt4/f$b;", "Simple", "I", "c", "()I", "HighQuality", "b", "Balanced", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f112304d;
            }

            public final int b() {
                return b.f112303c;
            }

            public final int c() {
                return b.f112302b;
            }

            private Companion() {
            }
        }

        public static final boolean e(int i11, int i12) {
            return i11 == i12;
        }

        public static String f(int i11) {
            if (e(i11, f112302b)) {
                return "Strategy.Simple";
            }
            if (e(i11, f112303c)) {
                return "Strategy.HighQuality";
            }
            if (e(i11, f112304d)) {
                return "Strategy.Balanced";
            }
            return e(i11, f112305e) ? "Strategy.Unspecified" : "Invalid";
        }

        public static int d(int i11) {
            return i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lt4/f$c;", "", "", "value", "e", "(I)I", "", "g", "(I)Ljava/lang/String;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f112307b = e(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f112308c = e(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f112309d = e(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f112310e = e(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f112311f = e(0);

        /* JADX INFO: renamed from: t4.f$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lt4/f$c$a;", "", "<init>", "()V", "Lt4/f$c;", "Default", "I", "a", "()I", "Loose", "b", ReactProgressBarViewManager.DEFAULT_STYLE, "c", "Strict", DateTokenConverter.CONVERTER_KEY, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f112307b;
            }

            public final int b() {
                return c.f112308c;
            }

            public final int c() {
                return c.f112309d;
            }

            public final int d() {
                return c.f112310e;
            }

            private Companion() {
            }
        }

        public static final boolean f(int i11, int i12) {
            return i11 == i12;
        }

        public static String g(int i11) {
            if (f(i11, f112307b)) {
                return "Strictness.None";
            }
            if (f(i11, f112308c)) {
                return "Strictness.Loose";
            }
            if (f(i11, f112309d)) {
                return "Strictness.Normal";
            }
            if (f(i11, f112310e)) {
                return "Strictness.Strict";
            }
            return f(i11, f112311f) ? "Strictness.Unspecified" : "Invalid";
        }

        public static int e(int i11) {
            return i11;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lt4/f$d;", "", "", "value", "c", "(I)I", "", "e", "(I)Ljava/lang/String;", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f112313b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f112314c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f112315d = c(0);

        /* JADX INFO: renamed from: t4.f$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lt4/f$d$a;", "", "<init>", "()V", "Lt4/f$d;", "Default", "I", "a", "()I", "Phrase", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f112313b;
            }

            public final int b() {
                return d.f112314c;
            }

            private Companion() {
            }
        }

        public static final boolean d(int i11, int i12) {
            return i11 == i12;
        }

        public static String e(int i11) {
            if (d(i11, f112313b)) {
                return "WordBreak.None";
            }
            if (d(i11, f112314c)) {
                return "WordBreak.Phrase";
            }
            return d(i11, f112315d) ? "WordBreak.Unspecified" : "Invalid";
        }

        public static int c(int i11) {
            return i11;
        }
    }

    private static int d(int i11) {
        return i11;
    }
}
