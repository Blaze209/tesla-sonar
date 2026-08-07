package q50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p026y50.h;

/* JADX INFO: renamed from: q50.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Jb\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b)\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\n\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b'\u0010+R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010 ¨\u0006."}, d2 = {"Lq50/b;", "", "", "hideStripeLogo", "forceHideStripeLogo", "allowBackNavigation", "Ly50/h;", "theme", "isTestMode", "allowElevation", "isContentScrolled", "", AnalyticsAttribute.Error, "<init>", "(ZZZLy50/h;ZZZLjava/lang/Throwable;)V", "Lq50/c;", "update", "a", "(Lq50/c;)Lq50/b;", "b", "(ZZZLy50/h;ZZZLjava/lang/Throwable;)Lq50/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "g", "()Z", "f", "c", DateTokenConverter.CONVERTER_KEY, "Ly50/h;", "h", "()Ly50/h;", "e", "j", "getAllowElevation", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", IntegerTokenConverter.CONVERTER_KEY, "isElevated", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TopAppBarState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hideStripeLogo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean forceHideStripeLogo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowBackNavigation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final h theme;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTestMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowElevation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isContentScrolled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable error;

    public TopAppBarState() {
        this(false, false, false, null, false, false, false, null, 255, null);
    }

    public static /* synthetic */ TopAppBarState c(TopAppBarState topAppBarState, boolean z11, boolean z12, boolean z13, h hVar, boolean z14, boolean z15, boolean z16, Throwable th2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = topAppBarState.hideStripeLogo;
        }
        if ((i11 & 2) != 0) {
            z12 = topAppBarState.forceHideStripeLogo;
        }
        if ((i11 & 4) != 0) {
            z13 = topAppBarState.allowBackNavigation;
        }
        if ((i11 & 8) != 0) {
            hVar = topAppBarState.theme;
        }
        if ((i11 & 16) != 0) {
            z14 = topAppBarState.isTestMode;
        }
        if ((i11 & 32) != 0) {
            z15 = topAppBarState.allowElevation;
        }
        if ((i11 & 64) != 0) {
            z16 = topAppBarState.isContentScrolled;
        }
        if ((i11 & 128) != 0) {
            th2 = topAppBarState.error;
        }
        boolean z17 = z16;
        Throwable th3 = th2;
        boolean z18 = z14;
        boolean z19 = z15;
        return topAppBarState.b(z11, z12, z13, hVar, z18, z19, z17, th3);
    }

    public final TopAppBarState a(TopAppBarStateUpdate update) {
        s.k(update, "update");
        Boolean hideStripeLogo = update.getHideStripeLogo();
        boolean zBooleanValue = hideStripeLogo != null ? hideStripeLogo.booleanValue() : this.hideStripeLogo;
        boolean allowBackNavigation = update.getAllowBackNavigation();
        boolean allowElevation = update.getAllowElevation();
        Throwable error = update.getError();
        if (error == null) {
            error = this.error;
        }
        return c(this, zBooleanValue, false, allowBackNavigation, null, false, allowElevation, false, error, 88, null);
    }

    public final TopAppBarState b(boolean hideStripeLogo, boolean forceHideStripeLogo, boolean allowBackNavigation, h theme, boolean isTestMode, boolean allowElevation, boolean isContentScrolled, Throwable error) {
        s.k(theme, "theme");
        return new TopAppBarState(hideStripeLogo, forceHideStripeLogo, allowBackNavigation, theme, isTestMode, allowElevation, isContentScrolled, error);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAllowBackNavigation() {
        return this.allowBackNavigation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarState)) {
            return false;
        }
        TopAppBarState topAppBarState = (TopAppBarState) other;
        return this.hideStripeLogo == topAppBarState.hideStripeLogo && this.forceHideStripeLogo == topAppBarState.forceHideStripeLogo && this.allowBackNavigation == topAppBarState.allowBackNavigation && this.theme == topAppBarState.theme && this.isTestMode == topAppBarState.isTestMode && this.allowElevation == topAppBarState.allowElevation && this.isContentScrolled == topAppBarState.isContentScrolled && s.f(this.error, topAppBarState.error);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getForceHideStripeLogo() {
        return this.forceHideStripeLogo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getHideStripeLogo() {
        return this.hideStripeLogo;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.hideStripeLogo) * 31) + Boolean.hashCode(this.forceHideStripeLogo)) * 31) + Boolean.hashCode(this.allowBackNavigation)) * 31) + this.theme.hashCode()) * 31) + Boolean.hashCode(this.isTestMode)) * 31) + Boolean.hashCode(this.allowElevation)) * 31) + Boolean.hashCode(this.isContentScrolled)) * 31;
        Throwable th2 = this.error;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    public final boolean i() {
        return this.allowElevation && this.isContentScrolled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    public String toString() {
        return "TopAppBarState(hideStripeLogo=" + this.hideStripeLogo + ", forceHideStripeLogo=" + this.forceHideStripeLogo + ", allowBackNavigation=" + this.allowBackNavigation + ", theme=" + this.theme + ", isTestMode=" + this.isTestMode + ", allowElevation=" + this.allowElevation + ", isContentScrolled=" + this.isContentScrolled + ", error=" + this.error + ")";
    }

    public TopAppBarState(boolean z11, boolean z12, boolean z13, h theme, boolean z14, boolean z15, boolean z16, Throwable th2) {
        s.k(theme, "theme");
        this.hideStripeLogo = z11;
        this.forceHideStripeLogo = z12;
        this.allowBackNavigation = z13;
        this.theme = theme;
        this.isTestMode = z14;
        this.allowElevation = z15;
        this.isContentScrolled = z16;
        this.error = th2;
    }

    public /* synthetic */ TopAppBarState(boolean z11, boolean z12, boolean z13, h hVar, boolean z14, boolean z15, boolean z16, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? h.INSTANCE.a() : hVar, (i11 & 16) != 0 ? false : z14, (i11 & 32) != 0 ? true : z15, (i11 & 64) != 0 ? false : z16, (i11 & 128) != 0 ? null : th2);
    }
}
