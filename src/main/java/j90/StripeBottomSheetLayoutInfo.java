package j90;

import k3.g4;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: j90.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lj90/d;", "", "Lk3/g4;", "sheetShape", "Lk3/p1;", "sheetBackgroundColor", "scrimColor", "<init>", "(Lk3/g4;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk3/g4;", "c", "()Lk3/g4;", "b", "J", "()J", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StripeBottomSheetLayoutInfo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83137d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g4 sheetShape;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long sheetBackgroundColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long scrimColor;

    public /* synthetic */ StripeBottomSheetLayoutInfo(g4 g4Var, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(g4Var, j11, j12);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getScrimColor() {
        return this.scrimColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getSheetBackgroundColor() {
        return this.sheetBackgroundColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g4 getSheetShape() {
        return this.sheetShape;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeBottomSheetLayoutInfo)) {
            return false;
        }
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo = (StripeBottomSheetLayoutInfo) other;
        return s.f(this.sheetShape, stripeBottomSheetLayoutInfo.sheetShape) && p1.r(this.sheetBackgroundColor, stripeBottomSheetLayoutInfo.sheetBackgroundColor) && p1.r(this.scrimColor, stripeBottomSheetLayoutInfo.scrimColor);
    }

    public int hashCode() {
        return (((this.sheetShape.hashCode() * 31) + p1.x(this.sheetBackgroundColor)) * 31) + p1.x(this.scrimColor);
    }

    public String toString() {
        return "StripeBottomSheetLayoutInfo(sheetShape=" + this.sheetShape + ", sheetBackgroundColor=" + p1.y(this.sheetBackgroundColor) + ", scrimColor=" + p1.y(this.scrimColor) + ")";
    }

    private StripeBottomSheetLayoutInfo(g4 sheetShape, long j11, long j12) {
        s.k(sheetShape, "sheetShape");
        this.sheetShape = sheetShape;
        this.sheetBackgroundColor = j11;
        this.scrimColor = j12;
    }
}
