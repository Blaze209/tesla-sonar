package p026y50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y50.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u001d\u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b6\u0010'R\u001d\u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b2\u0010'R\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b9\u0010'R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b,\u0010'R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b*\u0010'R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b:\u0010'R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b(\u0010'R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b0\u0010'R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010%\u001a\u0004\b4\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006="}, d2 = {"Ly50/b;", "", "Lk3/p1;", "textDefault", "textSubdued", "textDisabled", "textWhite", "textBrand", "textCritical", "iconDefault", "iconWhite", "iconBrand", "iconCaution", "iconBackground", "buttonPrimary", "buttonSecondary", "backgroundSurface", AppStateModule.APP_STATE_BACKGROUND, "backgroundOffset", "backgroundBrand", "backgroundCaution", "border", "borderBrand", "contentOnBrand", "<init>", "(JJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "p", "()J", "b", "r", "c", "q", DateTokenConverter.CONVERTER_KEY, "s", "e", "n", "f", "o", "g", "l", "h", "m", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "getButtonSecondary-0d7_KjU", "getBackgroundBrand-0d7_KjU", "t", "u", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FinancialConnectionsColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textDefault;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textSubdued;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textDisabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textWhite;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textBrand;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textCritical;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long iconDefault;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long iconWhite;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long iconBrand;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long iconCaution;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long iconBackground;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long buttonPrimary;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long buttonSecondary;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backgroundSurface;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backgroundOffset;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backgroundBrand;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final long backgroundCaution;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long border;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long borderBrand;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final long contentOnBrand;

    public /* synthetic */ FinancialConnectionsColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, j24, j25, j26, j27, j28, j29, j31, j32, j33);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBackgroundCaution() {
        return this.backgroundCaution;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBackgroundOffset() {
        return this.backgroundOffset;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBackgroundSurface() {
        return this.backgroundSurface;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getBorder() {
        return this.border;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsColors)) {
            return false;
        }
        FinancialConnectionsColors financialConnectionsColors = (FinancialConnectionsColors) other;
        return p1.r(this.textDefault, financialConnectionsColors.textDefault) && p1.r(this.textSubdued, financialConnectionsColors.textSubdued) && p1.r(this.textDisabled, financialConnectionsColors.textDisabled) && p1.r(this.textWhite, financialConnectionsColors.textWhite) && p1.r(this.textBrand, financialConnectionsColors.textBrand) && p1.r(this.textCritical, financialConnectionsColors.textCritical) && p1.r(this.iconDefault, financialConnectionsColors.iconDefault) && p1.r(this.iconWhite, financialConnectionsColors.iconWhite) && p1.r(this.iconBrand, financialConnectionsColors.iconBrand) && p1.r(this.iconCaution, financialConnectionsColors.iconCaution) && p1.r(this.iconBackground, financialConnectionsColors.iconBackground) && p1.r(this.buttonPrimary, financialConnectionsColors.buttonPrimary) && p1.r(this.buttonSecondary, financialConnectionsColors.buttonSecondary) && p1.r(this.backgroundSurface, financialConnectionsColors.backgroundSurface) && p1.r(this.background, financialConnectionsColors.background) && p1.r(this.backgroundOffset, financialConnectionsColors.backgroundOffset) && p1.r(this.backgroundBrand, financialConnectionsColors.backgroundBrand) && p1.r(this.backgroundCaution, financialConnectionsColors.backgroundCaution) && p1.r(this.border, financialConnectionsColors.border) && p1.r(this.borderBrand, financialConnectionsColors.borderBrand) && p1.r(this.contentOnBrand, financialConnectionsColors.contentOnBrand);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getBorderBrand() {
        return this.borderBrand;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getButtonPrimary() {
        return this.buttonPrimary;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getContentOnBrand() {
        return this.contentOnBrand;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((p1.x(this.textDefault) * 31) + p1.x(this.textSubdued)) * 31) + p1.x(this.textDisabled)) * 31) + p1.x(this.textWhite)) * 31) + p1.x(this.textBrand)) * 31) + p1.x(this.textCritical)) * 31) + p1.x(this.iconDefault)) * 31) + p1.x(this.iconWhite)) * 31) + p1.x(this.iconBrand)) * 31) + p1.x(this.iconCaution)) * 31) + p1.x(this.iconBackground)) * 31) + p1.x(this.buttonPrimary)) * 31) + p1.x(this.buttonSecondary)) * 31) + p1.x(this.backgroundSurface)) * 31) + p1.x(this.background)) * 31) + p1.x(this.backgroundOffset)) * 31) + p1.x(this.backgroundBrand)) * 31) + p1.x(this.backgroundCaution)) * 31) + p1.x(this.border)) * 31) + p1.x(this.borderBrand)) * 31) + p1.x(this.contentOnBrand);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getIconBackground() {
        return this.iconBackground;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getIconBrand() {
        return this.iconBrand;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getIconCaution() {
        return this.iconCaution;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getIconDefault() {
        return this.iconDefault;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getIconWhite() {
        return this.iconWhite;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getTextBrand() {
        return this.textBrand;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getTextCritical() {
        return this.textCritical;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getTextDefault() {
        return this.textDefault;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getTextDisabled() {
        return this.textDisabled;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getTextSubdued() {
        return this.textSubdued;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getTextWhite() {
        return this.textWhite;
    }

    public String toString() {
        return "FinancialConnectionsColors(textDefault=" + p1.y(this.textDefault) + ", textSubdued=" + p1.y(this.textSubdued) + ", textDisabled=" + p1.y(this.textDisabled) + ", textWhite=" + p1.y(this.textWhite) + ", textBrand=" + p1.y(this.textBrand) + ", textCritical=" + p1.y(this.textCritical) + ", iconDefault=" + p1.y(this.iconDefault) + ", iconWhite=" + p1.y(this.iconWhite) + ", iconBrand=" + p1.y(this.iconBrand) + ", iconCaution=" + p1.y(this.iconCaution) + ", iconBackground=" + p1.y(this.iconBackground) + ", buttonPrimary=" + p1.y(this.buttonPrimary) + ", buttonSecondary=" + p1.y(this.buttonSecondary) + ", backgroundSurface=" + p1.y(this.backgroundSurface) + ", background=" + p1.y(this.background) + ", backgroundOffset=" + p1.y(this.backgroundOffset) + ", backgroundBrand=" + p1.y(this.backgroundBrand) + ", backgroundCaution=" + p1.y(this.backgroundCaution) + ", border=" + p1.y(this.border) + ", borderBrand=" + p1.y(this.borderBrand) + ", contentOnBrand=" + p1.y(this.contentOnBrand) + ")";
    }

    private FinancialConnectionsColors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j31, long j32, long j33) {
        this.textDefault = j11;
        this.textSubdued = j12;
        this.textDisabled = j13;
        this.textWhite = j14;
        this.textBrand = j15;
        this.textCritical = j16;
        this.iconDefault = j17;
        this.iconWhite = j18;
        this.iconBrand = j19;
        this.iconCaution = j21;
        this.iconBackground = j22;
        this.buttonPrimary = j23;
        this.buttonSecondary = j24;
        this.backgroundSurface = j25;
        this.background = j26;
        this.backgroundOffset = j27;
        this.backgroundBrand = j28;
        this.backgroundCaution = j29;
        this.border = j31;
        this.borderBrand = j32;
        this.contentOnBrand = j33;
    }
}
