package p014n4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import vn0.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Ln4/c0;", "", "", "value", "f", "(I)I", "", "l", "(I)Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "other", "", "g", "(ILjava/lang/Object;)Z", "a", "I", "k", "(I)Z", "isWeightOn", "j", "isStyleOn", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@b
public final class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f92889c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f92890d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f92891e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f92892f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: n4.c0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Ln4/c0$a;", "", "<init>", "()V", "Ln4/c0;", "None", "I", "b", "()I", "All", "a", "Weight", DateTokenConverter.CONVERTER_KEY, "Style", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return c0.f92890d;
        }

        public final int b() {
            return c0.f92889c;
        }

        public final int c() {
            return c0.f92892f;
        }

        public final int d() {
            return c0.f92891e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ c0(int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ c0 e(int i11) {
        return new c0(i11);
    }

    public static boolean g(int i11, Object obj) {
        return (obj instanceof c0) && i11 == ((c0) obj).getValue();
    }

    public static final boolean h(int i11, int i12) {
        return i11 == i12;
    }

    public static int i(int i11) {
        return Integer.hashCode(i11);
    }

    public static final boolean j(int i11) {
        return h(i11, f92890d) || h(i11, f92892f);
    }

    public static final boolean k(int i11) {
        return h(i11, f92890d) || h(i11, f92891e);
    }

    public static String l(int i11) {
        if (h(i11, f92889c)) {
            return "None";
        }
        if (h(i11, f92890d)) {
            return "All";
        }
        if (h(i11, f92891e)) {
            return "Weight";
        }
        return h(i11, f92892f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.value, obj);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return l(this.value);
    }

    public static int f(int i11) {
        return i11;
    }
}
