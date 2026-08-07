package f90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.p1;
import p009i2.Colors;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: f90.i, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJm\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Lf90/i;", "", "Lk3/p1;", "component", "componentBorder", "componentDivider", "onComponent", "subtitle", "textCursor", "placeholderText", "appBarIcon", "Li2/r;", "materialColors", "<init>", "(JJJJJJJJLi2/r;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JJJJJJJJLi2/r;)Lf90/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", DateTokenConverter.CONVERTER_KEY, "()J", "b", "e", "c", "f", "h", "j", "k", "g", IntegerTokenConverter.CONVERTER_KEY, "Li2/r;", "()Li2/r;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StripeColors {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f64639j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long component;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long componentBorder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long componentDivider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onComponent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long subtitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textCursor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long placeholderText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long appBarIcon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Colors materialColors;

    public /* synthetic */ StripeColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, Colors rVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, rVar);
    }

    public final StripeColors a(long component, long componentBorder, long componentDivider, long onComponent, long subtitle, long textCursor, long placeholderText, long appBarIcon, Colors materialColors) {
        s.k(materialColors, "materialColors");
        return new StripeColors(component, componentBorder, componentDivider, onComponent, subtitle, textCursor, placeholderText, appBarIcon, materialColors, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getAppBarIcon() {
        return this.appBarIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getComponent() {
        return this.component;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getComponentBorder() {
        return this.componentBorder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StripeColors)) {
            return false;
        }
        StripeColors stripeColors = (StripeColors) other;
        return p1.r(this.component, stripeColors.component) && p1.r(this.componentBorder, stripeColors.componentBorder) && p1.r(this.componentDivider, stripeColors.componentDivider) && p1.r(this.onComponent, stripeColors.onComponent) && p1.r(this.subtitle, stripeColors.subtitle) && p1.r(this.textCursor, stripeColors.textCursor) && p1.r(this.placeholderText, stripeColors.placeholderText) && p1.r(this.appBarIcon, stripeColors.appBarIcon) && s.f(this.materialColors, stripeColors.materialColors);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getComponentDivider() {
        return this.componentDivider;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Colors getMaterialColors() {
        return this.materialColors;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getOnComponent() {
        return this.onComponent;
    }

    public int hashCode() {
        return (((((((((((((((p1.x(this.component) * 31) + p1.x(this.componentBorder)) * 31) + p1.x(this.componentDivider)) * 31) + p1.x(this.onComponent)) * 31) + p1.x(this.subtitle)) * 31) + p1.x(this.textCursor)) * 31) + p1.x(this.placeholderText)) * 31) + p1.x(this.appBarIcon)) * 31) + this.materialColors.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getPlaceholderText() {
        return this.placeholderText;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getTextCursor() {
        return this.textCursor;
    }

    public String toString() {
        return "StripeColors(component=" + p1.y(this.component) + ", componentBorder=" + p1.y(this.componentBorder) + ", componentDivider=" + p1.y(this.componentDivider) + ", onComponent=" + p1.y(this.onComponent) + ", subtitle=" + p1.y(this.subtitle) + ", textCursor=" + p1.y(this.textCursor) + ", placeholderText=" + p1.y(this.placeholderText) + ", appBarIcon=" + p1.y(this.appBarIcon) + ", materialColors=" + this.materialColors + ")";
    }

    private StripeColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, Colors materialColors) {
        s.k(materialColors, "materialColors");
        this.component = j11;
        this.componentBorder = j12;
        this.componentDivider = j13;
        this.onComponent = j14;
        this.subtitle = j15;
        this.textCursor = j16;
        this.placeholderText = j17;
        this.appBarIcon = j18;
        this.materialColors = materialColors;
    }
}
