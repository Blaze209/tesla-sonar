package f90;

import ezvcard.property.Gender;
import p009i2.Shapes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: f90.j, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lf90/j;", "", "Lw4/h;", "borderStrokeWidth", "Li2/c2;", "material", "<init>", "(FLi2/c2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", Gender.FEMALE, "getBorderStrokeWidth-D9Ej5fM", "()F", "b", "Li2/c2;", "()Li2/c2;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StripeComposeShapes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float borderStrokeWidth;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shapes material;

    public /* synthetic */ StripeComposeShapes(float f11, Shapes shapes, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, shapes);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Shapes getMaterial() {
        return this.material;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeComposeShapes)) {
            return false;
        }
        StripeComposeShapes stripeComposeShapes = (StripeComposeShapes) other;
        return w4.h.i(this.borderStrokeWidth, stripeComposeShapes.borderStrokeWidth) && s.f(this.material, stripeComposeShapes.material);
    }

    public int hashCode() {
        return (w4.h.j(this.borderStrokeWidth) * 31) + this.material.hashCode();
    }

    public String toString() {
        return "StripeComposeShapes(borderStrokeWidth=" + w4.h.k(this.borderStrokeWidth) + ", material=" + this.material + ")";
    }

    private StripeComposeShapes(float f11, Shapes material) {
        s.k(material, "material");
        this.borderStrokeWidth = f11;
        this.material = material;
    }
}
