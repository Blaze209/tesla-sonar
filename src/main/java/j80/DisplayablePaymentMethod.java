package j80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: j80.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\"\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b&\u0010)¨\u0006*"}, d2 = {"Lj80/e;", "", "", "Lcom/stripe/android/model/PaymentMethodCode;", "code", "Lx30/c;", "displayName", "", "iconResource", "lightThemeIconUrl", "darkThemeIconUrl", "", "iconRequiresTinting", "subtitle", "Lkotlin/Function0;", "Ljn0/h0;", "onClick", "<init>", "(Ljava/lang/String;Lx30/c;ILjava/lang/String;Ljava/lang/String;ZLx30/c;Lwn0/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lx30/c;", "c", "()Lx30/c;", "I", "e", DateTokenConverter.CONVERTER_KEY, "f", "Z", "()Z", "g", "h", "Lwn0/a;", "()Lwn0/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DisplayablePaymentMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c displayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lightThemeIconUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String darkThemeIconUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean iconRequiresTinting;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final x30.c subtitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.a<h0> onClick;

    public DisplayablePaymentMethod(String code, x30.c displayName, int i11, String str, String str2, boolean z11, x30.c cVar, wn0.a<h0> onClick) {
        p013kotlin.jvm.internal.s.k(code, "code");
        p013kotlin.jvm.internal.s.k(displayName, "displayName");
        p013kotlin.jvm.internal.s.k(onClick, "onClick");
        this.code = code;
        this.displayName = displayName;
        this.iconResource = i11;
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.iconRequiresTinting = z11;
        this.subtitle = cVar;
        this.onClick = onClick;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDarkThemeIconUrl() {
        return this.darkThemeIconUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final x30.c getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIconRequiresTinting() {
        return this.iconRequiresTinting;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getIconResource() {
        return this.iconResource;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayablePaymentMethod)) {
            return false;
        }
        DisplayablePaymentMethod displayablePaymentMethod = (DisplayablePaymentMethod) other;
        return p013kotlin.jvm.internal.s.f(this.code, displayablePaymentMethod.code) && p013kotlin.jvm.internal.s.f(this.displayName, displayablePaymentMethod.displayName) && this.iconResource == displayablePaymentMethod.iconResource && p013kotlin.jvm.internal.s.f(this.lightThemeIconUrl, displayablePaymentMethod.lightThemeIconUrl) && p013kotlin.jvm.internal.s.f(this.darkThemeIconUrl, displayablePaymentMethod.darkThemeIconUrl) && this.iconRequiresTinting == displayablePaymentMethod.iconRequiresTinting && p013kotlin.jvm.internal.s.f(this.subtitle, displayablePaymentMethod.subtitle) && p013kotlin.jvm.internal.s.f(this.onClick, displayablePaymentMethod.onClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLightThemeIconUrl() {
        return this.lightThemeIconUrl;
    }

    public final wn0.a<h0> g() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final x30.c getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iHashCode = ((((this.code.hashCode() * 31) + this.displayName.hashCode()) * 31) + Integer.hashCode(this.iconResource)) * 31;
        String str = this.lightThemeIconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkThemeIconUrl;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.iconRequiresTinting)) * 31;
        x30.c cVar = this.subtitle;
        return ((iHashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "DisplayablePaymentMethod(code=" + this.code + ", displayName=" + this.displayName + ", iconResource=" + this.iconResource + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", iconRequiresTinting=" + this.iconRequiresTinting + ", subtitle=" + this.subtitle + ", onClick=" + this.onClick + ")";
    }
}
