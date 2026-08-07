package f90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import k3.g4;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: f90.k, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lf90/k;", "", "", "cornerRadius", "borderStrokeWidth", "<init>", "(FF)V", "a", "(FF)Lf90/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "()F", "b", "c", "Lk3/g4;", "e", "()Lk3/g4;", "roundedCornerShape", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StripeShapes {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f64651c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cornerRadius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float borderStrokeWidth;

    public StripeShapes(float f11, float f12) {
        this.cornerRadius = f11;
        this.borderStrokeWidth = f12;
    }

    public static /* synthetic */ StripeShapes b(StripeShapes stripeShapes, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = stripeShapes.cornerRadius;
        }
        if ((i11 & 2) != 0) {
            f12 = stripeShapes.borderStrokeWidth;
        }
        return stripeShapes.a(f11, f12);
    }

    public final StripeShapes a(float cornerRadius, float borderStrokeWidth) {
        return new StripeShapes(cornerRadius, borderStrokeWidth);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final g4 e() {
        return a2.g.c(w4.h.g(this.cornerRadius));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeShapes)) {
            return false;
        }
        StripeShapes stripeShapes = (StripeShapes) other;
        return Float.compare(this.cornerRadius, stripeShapes.cornerRadius) == 0 && Float.compare(this.borderStrokeWidth, stripeShapes.borderStrokeWidth) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.borderStrokeWidth);
    }

    public String toString() {
        return "StripeShapes(cornerRadius=" + this.cornerRadius + ", borderStrokeWidth=" + this.borderStrokeWidth + ")";
    }
}
