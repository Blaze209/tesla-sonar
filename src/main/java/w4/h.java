package w4;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lw4/h;", "", "", "value", "g", "(F)F", "other", "", "f", "(FF)I", "", "k", "(F)Ljava/lang/String;", "j", "(F)I", "", "", "h", "(FLjava/lang/Object;)Z", "a", Gender.FEMALE, "getValue", "()F", "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f120718c = g(BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f120719d = g(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f120720e = g(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float value;

    /* JADX INFO: renamed from: w4.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lw4/h$a;", "", "<init>", "()V", "Lw4/h;", "Hairline", Gender.FEMALE, "a", "()F", "getHairline-D9Ej5fM$annotations", "Infinity", "b", "getInfinity-D9Ej5fM$annotations", "Unspecified", "c", "getUnspecified-D9Ej5fM$annotations", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return h.f120718c;
        }

        public final float b() {
            return h.f120719d;
        }

        public final float c() {
            return h.f120720e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ h(float f11) {
        this.value = f11;
    }

    public static final /* synthetic */ h d(float f11) {
        return new h(f11);
    }

    public static int f(float f11, float f12) {
        return Float.compare(f11, f12);
    }

    public static boolean h(float f11, Object obj) {
        return (obj instanceof h) && Float.compare(f11, ((h) obj).getValue()) == 0;
    }

    public static final boolean i(float f11, float f12) {
        return Float.compare(f11, f12) == 0;
    }

    public static int j(float f11) {
        return Float.hashCode(f11);
    }

    public static String k(float f11) {
        if (Float.isNaN(f11)) {
            return "Dp.Unspecified";
        }
        return f11 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return e(hVar.getValue());
    }

    public int e(float f11) {
        return f(this.value, f11);
    }

    public boolean equals(Object obj) {
        return h(this.value, obj);
    }

    public int hashCode() {
        return j(this.value);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ float getValue() {
        return this.value;
    }

    public String toString() {
        return k(this.value);
    }

    public static float g(float f11) {
        return f11;
    }
}
