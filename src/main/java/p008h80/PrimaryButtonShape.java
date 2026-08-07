package p008h80;

import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w4.h;

/* JADX INFO: renamed from: h80.m0, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Lh80/m0;", "", "Lw4/h;", "cornerRadius", "borderStrokeWidth", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "b", "()F", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PrimaryButtonShape {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float cornerRadius;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float borderStrokeWidth;

    public /* synthetic */ PrimaryButtonShape(float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12);
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
        return h.i(this.cornerRadius, primaryButtonShape.cornerRadius) && h.i(this.borderStrokeWidth, primaryButtonShape.borderStrokeWidth);
    }

    public int hashCode() {
        return (h.j(this.cornerRadius) * 31) + h.j(this.borderStrokeWidth);
    }

    public String toString() {
        return "PrimaryButtonShape(cornerRadius=" + h.k(this.cornerRadius) + ", borderStrokeWidth=" + h.k(this.borderStrokeWidth) + ")";
    }

    private PrimaryButtonShape(float f11, float f12) {
        this.cornerRadius = f11;
        this.borderStrokeWidth = f12;
    }

    public /* synthetic */ PrimaryButtonShape(float f11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? h.INSTANCE.c() : f11, (i11 & 2) != 0 ? h.INSTANCE.c() : f12, null);
    }
}
