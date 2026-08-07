package t4;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: t4.h, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0012\u0014\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lt4/h;", "", "Lt4/h$a;", "alignment", "Lt4/h$c;", "trim", "<init>", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", Gender.FEMALE, "b", "()F", "I", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineHeightStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final LineHeightStyle f112317d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int trim;

    /* JADX INFO: renamed from: t4.h$a */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\r"}, d2 = {"Lt4/h$a;", "", "", "topRatio", "c", "(F)F", "", "f", "(F)Ljava/lang/String;", "", "e", "(F)I", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final float f112321b = c(BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f112322c = c(0.5f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f112323d = c(-1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f112324e = c(1.0f);

        /* JADX INFO: renamed from: t4.h$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lt4/h$a$a;", "", "<init>", "()V", "Lt4/h$a;", "Center", Gender.FEMALE, "a", "()F", "Proportional", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.f112322c;
            }

            public final float b() {
                return a.f112323d;
            }

            private Companion() {
            }
        }

        public static float c(float f11) {
            if ((BitmapDescriptorFactory.HUE_RED > f11 || f11 > 1.0f) && f11 != -1.0f) {
                throw new IllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f11;
        }

        public static final boolean d(float f11, float f12) {
            return Float.compare(f11, f12) == 0;
        }

        public static int e(float f11) {
            return Float.hashCode(f11);
        }

        public static String f(float f11) {
            if (f11 == f112321b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f11 == f112322c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f11 == f112323d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f11 == f112324e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: t4.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt4/h$b;", "", "<init>", "()V", "Lt4/h;", "Default", "Lt4/h;", "a", "()Lt4/h;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LineHeightStyle a() {
            return LineHeightStyle.f112317d;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        f112317d = new LineHeightStyle(a.INSTANCE.b(), c.INSTANCE.a(), defaultConstructorMarker);
    }

    public /* synthetic */ LineHeightStyle(float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, i11);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTrim() {
        return this.trim;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return a.d(this.alignment, lineHeightStyle.alignment) && c.d(this.trim, lineHeightStyle.trim);
    }

    public int hashCode() {
        return (a.e(this.alignment) * 31) + c.e(this.trim);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.f(this.alignment)) + ", trim=" + ((Object) c.h(this.trim)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private LineHeightStyle(float f11, int i11) {
        this.alignment = f11;
        this.trim = i11;
    }

    /* JADX INFO: renamed from: t4.h$c */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000f"}, d2 = {"Lt4/h$c;", "", "", "value", "c", "(I)I", "", "h", "(I)Ljava/lang/String;", "", "f", "(I)Z", "g", "e", "a", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @vn0.b
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f112326b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f112327c = c(16);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f112328d = c(17);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f112329e = c(0);

        /* JADX INFO: renamed from: t4.h$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lt4/h$c$a;", "", "<init>", "()V", "Lt4/h$c;", "Both", "I", "a", "()I", "None", "b", "", "FlagTrimBottom", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f112328d;
            }

            public final int b() {
                return c.f112329e;
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

        public static final boolean f(int i11) {
            return (i11 & 1) > 0;
        }

        public static final boolean g(int i11) {
            return (i11 & 16) > 0;
        }

        public static String h(int i11) {
            if (i11 == f112326b) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i11 == f112327c) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i11 == f112328d) {
                return "LineHeightStyle.Trim.Both";
            }
            return i11 == f112329e ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        private static int c(int i11) {
            return i11;
        }
    }
}
