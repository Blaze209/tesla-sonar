package i70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i70.r, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001d"}, d2 = {"Li70/r;", "", "", "authUrl", "returnUrl", "", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "referrer", "forceInAppWebView", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", DateTokenConverter.CONVERTER_KEY, "c", "Z", "f", "()Z", "e", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final /* data */ class WebAuthParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String authUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String returnUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldCancelSource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldCancelIntentOnUserNavigation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String referrer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean forceInAppWebView;

    public WebAuthParams(String authUrl, String str, boolean z11, boolean z12, String str2, boolean z13) {
        p013kotlin.jvm.internal.s.k(authUrl, "authUrl");
        this.authUrl = authUrl;
        this.returnUrl = str;
        this.shouldCancelSource = z11;
        this.shouldCancelIntentOnUserNavigation = z12;
        this.referrer = str2;
        this.forceInAppWebView = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthUrl() {
        return this.authUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getForceInAppWebView() {
        return this.forceInAppWebView;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldCancelIntentOnUserNavigation() {
        return this.shouldCancelIntentOnUserNavigation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebAuthParams)) {
            return false;
        }
        WebAuthParams webAuthParams = (WebAuthParams) other;
        return p013kotlin.jvm.internal.s.f(this.authUrl, webAuthParams.authUrl) && p013kotlin.jvm.internal.s.f(this.returnUrl, webAuthParams.returnUrl) && this.shouldCancelSource == webAuthParams.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == webAuthParams.shouldCancelIntentOnUserNavigation && p013kotlin.jvm.internal.s.f(this.referrer, webAuthParams.referrer) && this.forceInAppWebView == webAuthParams.forceInAppWebView;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getShouldCancelSource() {
        return this.shouldCancelSource;
    }

    public int hashCode() {
        int iHashCode = this.authUrl.hashCode() * 31;
        String str = this.returnUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldCancelSource)) * 31) + Boolean.hashCode(this.shouldCancelIntentOnUserNavigation)) * 31;
        String str2 = this.referrer;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceInAppWebView);
    }

    public String toString() {
        return "WebAuthParams(authUrl=" + this.authUrl + ", returnUrl=" + this.returnUrl + ", shouldCancelSource=" + this.shouldCancelSource + ", shouldCancelIntentOnUserNavigation=" + this.shouldCancelIntentOnUserNavigation + ", referrer=" + this.referrer + ", forceInAppWebView=" + this.forceInAppWebView + ")";
    }

    public /* synthetic */ WebAuthParams(String str, String str2, boolean z11, boolean z12, String str3, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? false : z13);
    }
}
