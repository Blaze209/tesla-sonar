package j3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u0018BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b$\u0010#R\u001d\u0010\n\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001e\u0010#R\u001d\u0010\u000b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u001c\u0010#R\u0011\u0010&\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0011\u0010'\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lj3/k;", "", "", "left", "top", "right", "bottom", "Lj3/a;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "e", "()F", "b", "g", "c", "f", DateTokenConverter.CONVERTER_KEY, "J", "h", "()J", IntegerTokenConverter.CONVERTER_KEY, "j", Snapshot.WIDTH, Snapshot.HEIGHT, "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final k f82449j = l.c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a.INSTANCE.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long topLeftCornerRadius;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long topRightCornerRadius;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long bottomRightCornerRadius;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long bottomLeftCornerRadius;

    public /* synthetic */ k(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, j11, j12, j13, j14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBottomLeftCornerRadius() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBottomRightCornerRadius() {
        return this.bottomRightCornerRadius;
    }

    public final float d() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return Float.compare(this.left, kVar.left) == 0 && Float.compare(this.top, kVar.top) == 0 && Float.compare(this.right, kVar.right) == 0 && Float.compare(this.bottom, kVar.bottom) == 0 && a.c(this.topLeftCornerRadius, kVar.topLeftCornerRadius) && a.c(this.topRightCornerRadius, kVar.topRightCornerRadius) && a.c(this.bottomRightCornerRadius, kVar.bottomRightCornerRadius) && a.c(this.bottomLeftCornerRadius, kVar.bottomLeftCornerRadius);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTopLeftCornerRadius() {
        return this.topLeftCornerRadius;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + a.f(this.topLeftCornerRadius)) * 31) + a.f(this.topRightCornerRadius)) * 31) + a.f(this.bottomRightCornerRadius)) * 31) + a.f(this.bottomLeftCornerRadius);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTopRightCornerRadius() {
        return this.topRightCornerRadius;
    }

    public final float j() {
        return this.right - this.left;
    }

    public String toString() {
        long j11 = this.topLeftCornerRadius;
        long j12 = this.topRightCornerRadius;
        long j13 = this.bottomRightCornerRadius;
        long j14 = this.bottomLeftCornerRadius;
        String str = c.a(this.left, 1) + ", " + c.a(this.top, 1) + ", " + c.a(this.right, 1) + ", " + c.a(this.bottom, 1);
        if (!a.c(j11, j12) || !a.c(j12, j13) || !a.c(j13, j14)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) a.g(j11)) + ", topRight=" + ((Object) a.g(j12)) + ", bottomRight=" + ((Object) a.g(j13)) + ", bottomLeft=" + ((Object) a.g(j14)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        if (a.d(j11) == a.e(j11)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(a.d(j11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(a.d(j11), 1) + ", y=" + c.a(a.e(j11), 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private k(float f11, float f12, float f13, float f14, long j11, long j12, long j13, long j14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
        this.topLeftCornerRadius = j11;
        this.topRightCornerRadius = j12;
        this.bottomRightCornerRadius = j13;
        this.bottomLeftCornerRadius = j14;
    }
}
