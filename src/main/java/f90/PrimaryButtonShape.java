package f90;

import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: f90.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf90/c;", "", "", "cornerRadius", "borderStrokeWidth", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "b", "()F", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PrimaryButtonShape {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cornerRadius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float borderStrokeWidth;

    public PrimaryButtonShape(float f11, float f12) {
        this.cornerRadius = f11;
        this.borderStrokeWidth = f12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBorderStrokeWidth() {
        return this.borderStrokeWidth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonShape)) {
            return false;
        }
        PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) other;
        return Float.compare(this.cornerRadius, primaryButtonShape.cornerRadius) == 0 && Float.compare(this.borderStrokeWidth, primaryButtonShape.borderStrokeWidth) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.cornerRadius) * 31) + Float.hashCode(this.borderStrokeWidth);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + this.cornerRadius + ", borderStrokeWidth=" + this.borderStrokeWidth + ")";
    }
}
