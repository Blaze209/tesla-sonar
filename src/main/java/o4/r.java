package o4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lo4/r;", "", "", "value", "k", "(I)I", "", "o", "(I)Ljava/lang/String;", "n", "other", "", "l", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f96461c = k(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f96462d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f96463e = k(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f96464f = k(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f96465g = k(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f96466h = k(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f96467i = k(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f96468j = k(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f96469k = k(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: o4.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lo4/r$a;", "", "<init>", "()V", "Lo4/r;", "Unspecified", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "getUnspecified-eUduSuo$annotations", "Default", "a", "getDefault-eUduSuo$annotations", "None", "e", "getNone-eUduSuo$annotations", "Go", "c", "getGo-eUduSuo$annotations", "Search", "g", "getSearch-eUduSuo$annotations", "Send", "h", "getSend-eUduSuo$annotations", "Previous", "f", "getPrevious-eUduSuo$annotations", "Next", DateTokenConverter.CONVERTER_KEY, "getNext-eUduSuo$annotations", "Done", "b", "getDone-eUduSuo$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return r.f96462d;
        }

        public final int b() {
            return r.f96469k;
        }

        public final int c() {
            return r.f96464f;
        }

        public final int d() {
            return r.f96468j;
        }

        public final int e() {
            return r.f96463e;
        }

        public final int f() {
            return r.f96467i;
        }

        public final int g() {
            return r.f96465g;
        }

        public final int h() {
            return r.f96466h;
        }

        public final int i() {
            return r.f96461c;
        }

        private Companion() {
        }
    }

    private /* synthetic */ r(int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ r j(int i11) {
        return new r(i11);
    }

    public static boolean l(int i11, Object obj) {
        return (obj instanceof r) && i11 == ((r) obj).getValue();
    }

    public static final boolean m(int i11, int i12) {
        return i11 == i12;
    }

    public static int n(int i11) {
        return Integer.hashCode(i11);
    }

    public static String o(int i11) {
        if (m(i11, f96461c)) {
            return "Unspecified";
        }
        if (m(i11, f96463e)) {
            return "None";
        }
        if (m(i11, f96462d)) {
            return "Default";
        }
        if (m(i11, f96464f)) {
            return "Go";
        }
        if (m(i11, f96465g)) {
            return "Search";
        }
        if (m(i11, f96466h)) {
            return "Send";
        }
        if (m(i11, f96467i)) {
            return "Previous";
        }
        if (m(i11, f96468j)) {
            return "Next";
        }
        return m(i11, f96469k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.value, obj);
    }

    public int hashCode() {
        return n(this.value);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return o(this.value);
    }

    private static int k(int i11) {
        return i11;
    }
}
