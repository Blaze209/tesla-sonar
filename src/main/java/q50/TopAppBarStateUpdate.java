package q50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: q50.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\""}, d2 = {"Lq50/c;", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "pane", "", "allowBackNavigation", "", AnalyticsAttribute.Error, "hideStripeLogo", "allowElevation", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/Throwable;Ljava/lang/Boolean;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "e", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "Z", "()Z", "c", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TopAppBarStateUpdate {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final FinancialConnectionsSessionManifest.Pane pane;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowBackNavigation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Throwable error;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hideStripeLogo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowElevation;

    public TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane pane, boolean z11, Throwable th2, Boolean bool, boolean z12) {
        s.k(pane, "pane");
        this.pane = pane;
        this.allowBackNavigation = z11;
        this.error = th2;
        this.hideStripeLogo = bool;
        this.allowElevation = z12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowBackNavigation() {
        return this.allowBackNavigation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowElevation() {
        return this.allowElevation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getHideStripeLogo() {
        return this.hideStripeLogo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return this.pane;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarStateUpdate)) {
            return false;
        }
        TopAppBarStateUpdate topAppBarStateUpdate = (TopAppBarStateUpdate) other;
        return this.pane == topAppBarStateUpdate.pane && this.allowBackNavigation == topAppBarStateUpdate.allowBackNavigation && s.f(this.error, topAppBarStateUpdate.error) && s.f(this.hideStripeLogo, topAppBarStateUpdate.hideStripeLogo) && this.allowElevation == topAppBarStateUpdate.allowElevation;
    }

    public int hashCode() {
        int iHashCode = ((this.pane.hashCode() * 31) + Boolean.hashCode(this.allowBackNavigation)) * 31;
        Throwable th2 = this.error;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        Boolean bool = this.hideStripeLogo;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.allowElevation);
    }

    public String toString() {
        return "TopAppBarStateUpdate(pane=" + this.pane + ", allowBackNavigation=" + this.allowBackNavigation + ", error=" + this.error + ", hideStripeLogo=" + this.hideStripeLogo + ", allowElevation=" + this.allowElevation + ")";
    }

    public /* synthetic */ TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane pane, boolean z11, Throwable th2, Boolean bool, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(pane, z11, th2, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? true : z12);
    }
}
