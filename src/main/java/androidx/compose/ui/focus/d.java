package androidx.compose.ui.focus;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/d;", "", "", "value", "j", "(I)I", "", "n", "(I)Ljava/lang/String;", "m", "other", "", "k", "(ILjava/lang/Object;)Z", "a", "I", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f5353c = j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f5354d = j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f5355e = j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f5356f = j(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f5357g = j(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f5358h = j(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f5359i = j(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f5360j = j(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR&\u0010\u0013\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/d$a;", "", "<init>", "()V", "Landroidx/compose/ui/focus/d;", "Next", "I", "e", "()I", "Previous", "f", "Left", DateTokenConverter.CONVERTER_KEY, "Right", "g", "Up", "h", "Down", "a", "Enter", "b", "getEnter-dhqQ-8s$annotations", "Exit", "c", "getExit-dhqQ-8s$annotations", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return d.f5358h;
        }

        public final int b() {
            return d.f5359i;
        }

        public final int c() {
            return d.f5360j;
        }

        public final int d() {
            return d.f5355e;
        }

        public final int e() {
            return d.f5353c;
        }

        public final int f() {
            return d.f5354d;
        }

        public final int g() {
            return d.f5356f;
        }

        public final int h() {
            return d.f5357g;
        }

        private Companion() {
        }
    }

    private /* synthetic */ d(int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ d i(int i11) {
        return new d(i11);
    }

    public static int j(int i11) {
        return i11;
    }

    public static boolean k(int i11, Object obj) {
        return (obj instanceof d) && i11 == ((d) obj).getValue();
    }

    public static final boolean l(int i11, int i12) {
        return i11 == i12;
    }

    public static int m(int i11) {
        return Integer.hashCode(i11);
    }

    public static String n(int i11) {
        if (l(i11, f5353c)) {
            return "Next";
        }
        if (l(i11, f5354d)) {
            return "Previous";
        }
        if (l(i11, f5355e)) {
            return "Left";
        }
        if (l(i11, f5356f)) {
            return "Right";
        }
        if (l(i11, f5357g)) {
            return "Up";
        }
        if (l(i11, f5358h)) {
            return "Down";
        }
        if (l(i11, f5359i)) {
            return "Enter";
        }
        return l(i11, f5360j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return k(this.value, obj);
    }

    public int hashCode() {
        return m(this.value);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public String toString() {
        return n(this.value);
    }
}
