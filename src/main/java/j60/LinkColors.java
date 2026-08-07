package j60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import k3.p1;
import p009i2.Colors;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: j60.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJE\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lj60/b;", "", "Lk3/p1;", "buttonLabel", "actionLabelLight", "errorText", "errorComponentBackground", "Li2/r;", "materialColors", "<init>", "(JJJJLi2/r;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(JJJJLi2/r;)Lj60/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", DateTokenConverter.CONVERTER_KEY, "()J", "b", "c", "f", "e", "Li2/r;", "g", "()Li2/r;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LinkColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long buttonLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long actionLabelLight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorComponentBackground;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Colors materialColors;

    public /* synthetic */ LinkColors(long j11, long j12, long j13, long j14, Colors colors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, colors);
    }

    public static /* synthetic */ LinkColors b(LinkColors linkColors, long j11, long j12, long j13, long j14, Colors colors, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = linkColors.buttonLabel;
        }
        long j15 = j11;
        if ((i11 & 2) != 0) {
            j12 = linkColors.actionLabelLight;
        }
        return linkColors.a(j15, j12, (i11 & 4) != 0 ? linkColors.errorText : j13, (i11 & 8) != 0 ? linkColors.errorComponentBackground : j14, (i11 & 16) != 0 ? linkColors.materialColors : colors);
    }

    public final LinkColors a(long buttonLabel, long actionLabelLight, long errorText, long errorComponentBackground, Colors materialColors) {
        s.k(materialColors, "materialColors");
        return new LinkColors(buttonLabel, actionLabelLight, errorText, errorComponentBackground, materialColors, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getActionLabelLight() {
        return this.actionLabelLight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getButtonLabel() {
        return this.buttonLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getErrorComponentBackground() {
        return this.errorComponentBackground;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkColors)) {
            return false;
        }
        LinkColors linkColors = (LinkColors) other;
        return p1.r(this.buttonLabel, linkColors.buttonLabel) && p1.r(this.actionLabelLight, linkColors.actionLabelLight) && p1.r(this.errorText, linkColors.errorText) && p1.r(this.errorComponentBackground, linkColors.errorComponentBackground) && s.f(this.materialColors, linkColors.materialColors);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getErrorText() {
        return this.errorText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Colors getMaterialColors() {
        return this.materialColors;
    }

    public int hashCode() {
        return (((((((p1.x(this.buttonLabel) * 31) + p1.x(this.actionLabelLight)) * 31) + p1.x(this.errorText)) * 31) + p1.x(this.errorComponentBackground)) * 31) + this.materialColors.hashCode();
    }

    public String toString() {
        return "LinkColors(buttonLabel=" + p1.y(this.buttonLabel) + ", actionLabelLight=" + p1.y(this.actionLabelLight) + ", errorText=" + p1.y(this.errorText) + ", errorComponentBackground=" + p1.y(this.errorComponentBackground) + ", materialColors=" + this.materialColors + ")";
    }

    private LinkColors(long j11, long j12, long j13, long j14, Colors materialColors) {
        s.k(materialColors, "materialColors");
        this.buttonLabel = j11;
        this.actionLabelLight = j12;
        this.errorText = j13;
        this.errorComponentBackground = j14;
        this.materialColors = materialColors;
    }
}
