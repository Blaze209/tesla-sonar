package e3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00042\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Le3/n;", "", "", "dataType", "b", "(I)I", "", "e", "(I)Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "other", "", "c", "(ILjava/lang/Object;)Z", "a", "I", "getDataType", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f61600c = b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f61601d = b(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f61602e = b(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f61603f = b(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f61604g = b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int dataType;

    /* JADX INFO: renamed from: e3.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Le3/n$a;", "", "<init>", "()V", "Le3/n;", "Text", "I", "a", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return n.f61600c;
        }

        private Companion() {
        }
    }

    public static boolean c(int i11, Object obj) {
        return (obj instanceof n) && i11 == ((n) obj).getDataType();
    }

    public static int d(int i11) {
        return Integer.hashCode(i11);
    }

    public static String e(int i11) {
        return "ContentDataType(dataType=" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.dataType, obj);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ int getDataType() {
        return this.dataType;
    }

    public int hashCode() {
        return d(this.dataType);
    }

    public String toString() {
        return e(this.dataType);
    }

    public static int b(int i11) {
        return i11;
    }
}
