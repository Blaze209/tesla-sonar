package p026y50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextStyle;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: y50.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b(\u0010\u001e¨\u0006*"}, d2 = {"Ly50/e;", "", "Li4/r0;", "headingXLarge", "headingXLargeSubdued", "headingLarge", "headingMedium", "bodyMediumEmphasized", "bodyMedium", "bodySmall", "labelLargeEmphasized", "labelLarge", "labelMediumEmphasized", "labelMedium", "labelSmall", "<init>", "(Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;Li4/r0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li4/r0;", "e", "()Li4/r0;", "b", "f", "c", DateTokenConverter.CONVERTER_KEY, "getHeadingMedium", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinancialConnectionsTypography {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headingXLarge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headingXLargeSubdued;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headingLarge;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle headingMedium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodyMediumEmphasized;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodyMedium;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle bodySmall;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelLargeEmphasized;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelLarge;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelMediumEmphasized;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelMedium;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle labelSmall;

    public FinancialConnectionsTypography(TextStyle headingXLarge, TextStyle headingXLargeSubdued, TextStyle headingLarge, TextStyle headingMedium, TextStyle bodyMediumEmphasized, TextStyle bodyMedium, TextStyle bodySmall, TextStyle labelLargeEmphasized, TextStyle labelLarge, TextStyle labelMediumEmphasized, TextStyle labelMedium, TextStyle labelSmall) {
        s.k(headingXLarge, "headingXLarge");
        s.k(headingXLargeSubdued, "headingXLargeSubdued");
        s.k(headingLarge, "headingLarge");
        s.k(headingMedium, "headingMedium");
        s.k(bodyMediumEmphasized, "bodyMediumEmphasized");
        s.k(bodyMedium, "bodyMedium");
        s.k(bodySmall, "bodySmall");
        s.k(labelLargeEmphasized, "labelLargeEmphasized");
        s.k(labelLarge, "labelLarge");
        s.k(labelMediumEmphasized, "labelMediumEmphasized");
        s.k(labelMedium, "labelMedium");
        s.k(labelSmall, "labelSmall");
        this.headingXLarge = headingXLarge;
        this.headingXLargeSubdued = headingXLargeSubdued;
        this.headingLarge = headingLarge;
        this.headingMedium = headingMedium;
        this.bodyMediumEmphasized = bodyMediumEmphasized;
        this.bodyMedium = bodyMedium;
        this.bodySmall = bodySmall;
        this.labelLargeEmphasized = labelLargeEmphasized;
        this.labelLarge = labelLarge;
        this.labelMediumEmphasized = labelMediumEmphasized;
        this.labelMedium = labelMedium;
        this.labelSmall = labelSmall;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextStyle getBodyMedium() {
        return this.bodyMedium;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextStyle getBodyMediumEmphasized() {
        return this.bodyMediumEmphasized;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextStyle getBodySmall() {
        return this.bodySmall;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextStyle getHeadingLarge() {
        return this.headingLarge;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextStyle getHeadingXLarge() {
        return this.headingXLarge;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsTypography)) {
            return false;
        }
        FinancialConnectionsTypography financialConnectionsTypography = (FinancialConnectionsTypography) other;
        return s.f(this.headingXLarge, financialConnectionsTypography.headingXLarge) && s.f(this.headingXLargeSubdued, financialConnectionsTypography.headingXLargeSubdued) && s.f(this.headingLarge, financialConnectionsTypography.headingLarge) && s.f(this.headingMedium, financialConnectionsTypography.headingMedium) && s.f(this.bodyMediumEmphasized, financialConnectionsTypography.bodyMediumEmphasized) && s.f(this.bodyMedium, financialConnectionsTypography.bodyMedium) && s.f(this.bodySmall, financialConnectionsTypography.bodySmall) && s.f(this.labelLargeEmphasized, financialConnectionsTypography.labelLargeEmphasized) && s.f(this.labelLarge, financialConnectionsTypography.labelLarge) && s.f(this.labelMediumEmphasized, financialConnectionsTypography.labelMediumEmphasized) && s.f(this.labelMedium, financialConnectionsTypography.labelMedium) && s.f(this.labelSmall, financialConnectionsTypography.labelSmall);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextStyle getHeadingXLargeSubdued() {
        return this.headingXLargeSubdued;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextStyle getLabelLarge() {
        return this.labelLarge;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextStyle getLabelLargeEmphasized() {
        return this.labelLargeEmphasized;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.headingXLarge.hashCode() * 31) + this.headingXLargeSubdued.hashCode()) * 31) + this.headingLarge.hashCode()) * 31) + this.headingMedium.hashCode()) * 31) + this.bodyMediumEmphasized.hashCode()) * 31) + this.bodyMedium.hashCode()) * 31) + this.bodySmall.hashCode()) * 31) + this.labelLargeEmphasized.hashCode()) * 31) + this.labelLarge.hashCode()) * 31) + this.labelMediumEmphasized.hashCode()) * 31) + this.labelMedium.hashCode()) * 31) + this.labelSmall.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final TextStyle getLabelMedium() {
        return this.labelMedium;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextStyle getLabelMediumEmphasized() {
        return this.labelMediumEmphasized;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextStyle getLabelSmall() {
        return this.labelSmall;
    }

    public String toString() {
        return "FinancialConnectionsTypography(headingXLarge=" + this.headingXLarge + ", headingXLargeSubdued=" + this.headingXLargeSubdued + ", headingLarge=" + this.headingLarge + ", headingMedium=" + this.headingMedium + ", bodyMediumEmphasized=" + this.bodyMediumEmphasized + ", bodyMedium=" + this.bodyMedium + ", bodySmall=" + this.bodySmall + ", labelLargeEmphasized=" + this.labelLargeEmphasized + ", labelLarge=" + this.labelLarge + ", labelMediumEmphasized=" + this.labelMediumEmphasized + ", labelMedium=" + this.labelMedium + ", labelSmall=" + this.labelSmall + ")";
    }
}
