package so;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: so.j, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001d"}, d2 = {"Lso/j;", "", "Lso/k;", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(Lso/k;Lso/k;Lso/k;Lso/k;)V", "()V", "", "e", "()Z", "f", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lso/k;", "c", "()Lso/k;", "b", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComputedBorderRadius {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CornerRadii topLeft;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CornerRadii topRight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CornerRadii bottomLeft;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final CornerRadii bottomRight;

    public ComputedBorderRadius(CornerRadii topLeft, CornerRadii topRight, CornerRadii bottomLeft, CornerRadii bottomRight) {
        s.k(topLeft, "topLeft");
        s.k(topRight, "topRight");
        s.k(bottomLeft, "bottomLeft");
        s.k(bottomRight, "bottomRight");
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CornerRadii getBottomLeft() {
        return this.bottomLeft;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CornerRadii getBottomRight() {
        return this.bottomRight;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CornerRadii getTopLeft() {
        return this.topLeft;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CornerRadii getTopRight() {
        return this.topRight;
    }

    public final boolean e() {
        return this.topLeft.getHorizontal() > BitmapDescriptorFactory.HUE_RED || this.topLeft.getVertical() > BitmapDescriptorFactory.HUE_RED || this.topRight.getHorizontal() > BitmapDescriptorFactory.HUE_RED || this.topRight.getVertical() > BitmapDescriptorFactory.HUE_RED || this.bottomLeft.getHorizontal() > BitmapDescriptorFactory.HUE_RED || this.bottomLeft.getVertical() > BitmapDescriptorFactory.HUE_RED || this.bottomRight.getHorizontal() > BitmapDescriptorFactory.HUE_RED;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComputedBorderRadius)) {
            return false;
        }
        ComputedBorderRadius computedBorderRadius = (ComputedBorderRadius) other;
        return s.f(this.topLeft, computedBorderRadius.topLeft) && s.f(this.topRight, computedBorderRadius.topRight) && s.f(this.bottomLeft, computedBorderRadius.bottomLeft) && s.f(this.bottomRight, computedBorderRadius.bottomRight);
    }

    public final boolean f() {
        return s.f(this.topLeft, this.topRight) && s.f(this.topLeft, this.bottomLeft) && s.f(this.topLeft, this.bottomRight);
    }

    public int hashCode() {
        return (((((this.topLeft.hashCode() * 31) + this.topRight.hashCode()) * 31) + this.bottomLeft.hashCode()) * 31) + this.bottomRight.hashCode();
    }

    public String toString() {
        return "ComputedBorderRadius(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ")";
    }

    public ComputedBorderRadius() {
        this(new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), new CornerRadii(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
    }
}
