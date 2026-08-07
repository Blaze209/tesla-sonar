package t4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lt4/a;", "", "", "multiplier", "c", "(F)F", "", "g", "(F)Ljava/lang/String;", "", "f", "(F)I", "other", "", DateTokenConverter.CONVERTER_KEY, "(FLjava/lang/Object;)Z", "a", Gender.FEMALE, "getMultiplier", "()F", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f112283c = c(0.5f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f112284d = c(-0.5f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f112285e = c(BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float multiplier;

    /* JADX INFO: renamed from: t4.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lt4/a$a;", "", "<init>", "()V", "Lt4/a;", "None", Gender.FEMALE, "a", "()F", "getNone-y9eOQZs$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return a.f112285e;
        }

        private Companion() {
        }
    }

    private /* synthetic */ a(float f11) {
        this.multiplier = f11;
    }

    public static final /* synthetic */ a b(float f11) {
        return new a(f11);
    }

    public static boolean d(float f11, Object obj) {
        return (obj instanceof a) && Float.compare(f11, ((a) obj).getMultiplier()) == 0;
    }

    public static final boolean e(float f11, float f12) {
        return Float.compare(f11, f12) == 0;
    }

    public static int f(float f11) {
        return Float.hashCode(f11);
    }

    public static String g(float f11) {
        return "BaselineShift(multiplier=" + f11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return d(this.multiplier, obj);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return f(this.multiplier);
    }

    public String toString() {
        return g(this.multiplier);
    }

    public static float c(float f11) {
        return f11;
    }
}
