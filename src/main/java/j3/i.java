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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0001(B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010)\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010+R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010)\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010+R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010)\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010+R\u001a\u00107\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010+R\u001a\u0010:\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010+R \u0010?\u001a\u00020;8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b>\u0010-\u001a\u0004\b<\u0010=R\u001a\u0010C\u001a\u00020\u001a8FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010-\u001a\u0004\b@\u0010AR\u0017\u0010E\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bD\u0010=R\u0017\u0010G\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bF\u0010=R\u0017\u0010I\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010=R\u0017\u0010K\u001a\u00020\t8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bJ\u0010=\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lj3/i;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Lj3/g;", "offset", "u", "(J)Lj3/i;", "translateX", "translateY", "t", "(FF)Lj3/i;", "other", "q", "(Lj3/i;)Lj3/i;", "otherLeft", "otherTop", "otherRight", "otherBottom", "p", "(FFFF)Lj3/i;", "", "s", "(Lj3/i;)Z", "b", "(J)Z", "", "toString", "()Ljava/lang/String;", "c", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, IntegerTokenConverter.CONVERTER_KEY, "()F", "getLeft$annotations", "()V", "l", "getTop$annotations", "j", "getRight$annotations", DateTokenConverter.CONVERTER_KEY, "e", "getBottom$annotations", "o", "getWidth$annotations", Snapshot.WIDTH, "h", "getHeight$annotations", Snapshot.HEIGHT, "Lj3/m;", "k", "()J", "getSize-NH-jbRc$annotations", "size", "r", "()Z", "isEmpty$annotations", "isEmpty", "m", "topLeft", "n", "topRight", "g", "center", "f", "bottomRight", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final i f82443f = new i(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float bottom;

    /* JADX INFO: renamed from: j3.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj3/i$a;", "", "<init>", "()V", "Lj3/i;", "Zero", "Lj3/i;", "a", "()Lj3/i;", "getZero$annotations", "ui-geometry_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f82443f;
        }

        private Companion() {
        }
    }

    public i(float f11, float f12, float f13, float f14) {
        this.left = f11;
        this.top = f12;
        this.right = f13;
        this.bottom = f14;
    }

    public static /* synthetic */ i d(i iVar, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = iVar.left;
        }
        if ((i11 & 2) != 0) {
            f12 = iVar.top;
        }
        if ((i11 & 4) != 0) {
            f13 = iVar.right;
        }
        if ((i11 & 8) != 0) {
            f14 = iVar.bottom;
        }
        return iVar.c(f11, f12, f13, f14);
    }

    public final boolean b(long offset) {
        return g.m(offset) >= this.left && g.m(offset) < this.right && g.n(offset) >= this.top && g.n(offset) < this.bottom;
    }

    public final i c(float left, float top, float right, float bottom) {
        return new i(left, top, right, bottom);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return Float.compare(this.left, iVar.left) == 0 && Float.compare(this.top, iVar.top) == 0 && Float.compare(this.right, iVar.right) == 0 && Float.compare(this.bottom, iVar.bottom) == 0;
    }

    public final long f() {
        return h.a(this.right, this.bottom);
    }

    public final long g() {
        return h.a(this.left + (o() / 2.0f), this.top + (h() / 2.0f));
    }

    public final float h() {
        return this.bottom - this.top;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final long k() {
        return n.a(o(), h());
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final long m() {
        return h.a(this.left, this.top);
    }

    public final long n() {
        return h.a(this.right, this.top);
    }

    public final float o() {
        return this.right - this.left;
    }

    public final i p(float otherLeft, float otherTop, float otherRight, float otherBottom) {
        return new i(Math.max(this.left, otherLeft), Math.max(this.top, otherTop), Math.min(this.right, otherRight), Math.min(this.bottom, otherBottom));
    }

    public final i q(i other) {
        return new i(Math.max(this.left, other.left), Math.max(this.top, other.top), Math.min(this.right, other.right), Math.min(this.bottom, other.bottom));
    }

    public final boolean r() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean s(i other) {
        return this.right > other.left && other.right > this.left && this.bottom > other.top && other.bottom > this.top;
    }

    public final i t(float translateX, float translateY) {
        return new i(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.left, 1) + ", " + c.a(this.top, 1) + ", " + c.a(this.right, 1) + ", " + c.a(this.bottom, 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final i u(long offset) {
        return new i(this.left + g.m(offset), this.top + g.n(offset), this.right + g.m(offset), this.bottom + g.n(offset));
    }
}
