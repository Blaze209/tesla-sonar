package b10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: b10.b, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b \u0010\u0012R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001f\u0010\u0012¨\u0006\""}, d2 = {"Lb10/b;", "", "", "x", "y", Snapshot.WIDTH, Snapshot.HEIGHT, "absoluteX", "absoluteY", "", "target", "parentScrollViewTarget", "<init>", "(DDDDDDII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "g", "()D", "b", "h", "c", "f", DateTokenConverter.CONVERTER_KEY, "e", "I", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FocusedInputLayoutChangedEventData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double absoluteX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double absoluteY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int target;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int parentScrollViewTarget;

    public FocusedInputLayoutChangedEventData(double d11, double d12, double d13, double d14, double d15, double d16, int i11, int i12) {
        this.x = d11;
        this.y = d12;
        this.width = d13;
        this.height = d14;
        this.absoluteX = d15;
        this.absoluteY = d16;
        this.target = i11;
        this.parentScrollViewTarget = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAbsoluteX() {
        return this.absoluteX;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getAbsoluteY() {
        return this.absoluteY;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getParentScrollViewTarget() {
        return this.parentScrollViewTarget;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FocusedInputLayoutChangedEventData)) {
            return false;
        }
        FocusedInputLayoutChangedEventData focusedInputLayoutChangedEventData = (FocusedInputLayoutChangedEventData) other;
        return Double.compare(this.x, focusedInputLayoutChangedEventData.x) == 0 && Double.compare(this.y, focusedInputLayoutChangedEventData.y) == 0 && Double.compare(this.width, focusedInputLayoutChangedEventData.width) == 0 && Double.compare(this.height, focusedInputLayoutChangedEventData.height) == 0 && Double.compare(this.absoluteX, focusedInputLayoutChangedEventData.absoluteX) == 0 && Double.compare(this.absoluteY, focusedInputLayoutChangedEventData.absoluteY) == 0 && this.target == focusedInputLayoutChangedEventData.target && this.parentScrollViewTarget == focusedInputLayoutChangedEventData.parentScrollViewTarget;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return (((((((((((((Double.hashCode(this.x) * 31) + Double.hashCode(this.y)) * 31) + Double.hashCode(this.width)) * 31) + Double.hashCode(this.height)) * 31) + Double.hashCode(this.absoluteX)) * 31) + Double.hashCode(this.absoluteY)) * 31) + Integer.hashCode(this.target)) * 31) + Integer.hashCode(this.parentScrollViewTarget);
    }

    public String toString() {
        return "FocusedInputLayoutChangedEventData(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", absoluteX=" + this.absoluteX + ", absoluteY=" + this.absoluteY + ", target=" + this.target + ", parentScrollViewTarget=" + this.parentScrollViewTarget + ")";
    }
}
