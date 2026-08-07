package f90;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: f90.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lf90/d;", "", "Lf90/b;", "colorsLight", "colorsDark", "Lf90/c;", "shape", "Lf90/e;", "typography", "<init>", "(Lf90/b;Lf90/b;Lf90/c;Lf90/e;)V", "a", "(Lf90/b;Lf90/b;Lf90/c;Lf90/e;)Lf90/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lf90/b;", "c", "()Lf90/b;", "b", "Lf90/c;", DateTokenConverter.CONVERTER_KEY, "()Lf90/c;", "Lf90/e;", "e", "()Lf90/e;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PrimaryButtonStyle {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f64601e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PrimaryButtonColors colorsLight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PrimaryButtonColors colorsDark;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PrimaryButtonShape shape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final PrimaryButtonTypography typography;

    public PrimaryButtonStyle(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        s.k(colorsLight, "colorsLight");
        s.k(colorsDark, "colorsDark");
        s.k(shape, "shape");
        s.k(typography, "typography");
        this.colorsLight = colorsLight;
        this.colorsDark = colorsDark;
        this.shape = shape;
        this.typography = typography;
    }

    public final PrimaryButtonStyle a(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
        s.k(colorsLight, "colorsLight");
        s.k(colorsDark, "colorsDark");
        s.k(shape, "shape");
        s.k(typography, "typography");
        return new PrimaryButtonStyle(colorsLight, colorsDark, shape, typography);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PrimaryButtonColors getColorsDark() {
        return this.colorsDark;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final PrimaryButtonColors getColorsLight() {
        return this.colorsLight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PrimaryButtonShape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final PrimaryButtonTypography getTypography() {
        return this.typography;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonStyle)) {
            return false;
        }
        PrimaryButtonStyle primaryButtonStyle = (PrimaryButtonStyle) other;
        return s.f(this.colorsLight, primaryButtonStyle.colorsLight) && s.f(this.colorsDark, primaryButtonStyle.colorsDark) && s.f(this.shape, primaryButtonStyle.shape) && s.f(this.typography, primaryButtonStyle.typography);
    }

    public int hashCode() {
        return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
    }

    public String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shape=" + this.shape + ", typography=" + this.typography + ")";
    }
}
