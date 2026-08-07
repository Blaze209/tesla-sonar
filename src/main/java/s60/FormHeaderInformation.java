package s60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import x30.c;

/* JADX INFO: renamed from: s60.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJP\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Ls60/a;", "", "Lx30/c;", "displayName", "", "shouldShowIcon", "", "iconResource", "", "lightThemeIconUrl", "darkThemeIconUrl", "iconRequiresTinting", "<init>", "(Lx30/c;ZILjava/lang/String;Ljava/lang/String;Z)V", "a", "(Lx30/c;ZILjava/lang/String;Ljava/lang/String;Z)Ls60/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lx30/c;", DateTokenConverter.CONVERTER_KEY, "()Lx30/c;", "b", "Z", "h", "()Z", "c", "I", "f", "Ljava/lang/String;", "g", "e", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class FormHeaderInformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c displayName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldShowIcon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResource;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lightThemeIconUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String darkThemeIconUrl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean iconRequiresTinting;

    public FormHeaderInformation(c displayName, boolean z11, int i11, String str, String str2, boolean z12) {
        s.k(displayName, "displayName");
        this.displayName = displayName;
        this.shouldShowIcon = z11;
        this.iconResource = i11;
        this.lightThemeIconUrl = str;
        this.darkThemeIconUrl = str2;
        this.iconRequiresTinting = z12;
    }

    public static /* synthetic */ FormHeaderInformation b(FormHeaderInformation formHeaderInformation, c cVar, boolean z11, int i11, String str, String str2, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            cVar = formHeaderInformation.displayName;
        }
        if ((i12 & 2) != 0) {
            z11 = formHeaderInformation.shouldShowIcon;
        }
        if ((i12 & 4) != 0) {
            i11 = formHeaderInformation.iconResource;
        }
        if ((i12 & 8) != 0) {
            str = formHeaderInformation.lightThemeIconUrl;
        }
        if ((i12 & 16) != 0) {
            str2 = formHeaderInformation.darkThemeIconUrl;
        }
        if ((i12 & 32) != 0) {
            z12 = formHeaderInformation.iconRequiresTinting;
        }
        String str3 = str2;
        boolean z13 = z12;
        return formHeaderInformation.a(cVar, z11, i11, str, str3, z13);
    }

    public final FormHeaderInformation a(c displayName, boolean shouldShowIcon, int iconResource, String lightThemeIconUrl, String darkThemeIconUrl, boolean iconRequiresTinting) {
        s.k(displayName, "displayName");
        return new FormHeaderInformation(displayName, shouldShowIcon, iconResource, lightThemeIconUrl, darkThemeIconUrl, iconRequiresTinting);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDarkThemeIconUrl() {
        return this.darkThemeIconUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIconRequiresTinting() {
        return this.iconRequiresTinting;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormHeaderInformation)) {
            return false;
        }
        FormHeaderInformation formHeaderInformation = (FormHeaderInformation) other;
        return s.f(this.displayName, formHeaderInformation.displayName) && this.shouldShowIcon == formHeaderInformation.shouldShowIcon && this.iconResource == formHeaderInformation.iconResource && s.f(this.lightThemeIconUrl, formHeaderInformation.lightThemeIconUrl) && s.f(this.darkThemeIconUrl, formHeaderInformation.darkThemeIconUrl) && this.iconRequiresTinting == formHeaderInformation.iconRequiresTinting;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getIconResource() {
        return this.iconResource;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLightThemeIconUrl() {
        return this.lightThemeIconUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShouldShowIcon() {
        return this.shouldShowIcon;
    }

    public int hashCode() {
        int iHashCode = ((((this.displayName.hashCode() * 31) + Boolean.hashCode(this.shouldShowIcon)) * 31) + Integer.hashCode(this.iconResource)) * 31;
        String str = this.lightThemeIconUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.darkThemeIconUrl;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.iconRequiresTinting);
    }

    public String toString() {
        return "FormHeaderInformation(displayName=" + this.displayName + ", shouldShowIcon=" + this.shouldShowIcon + ", iconResource=" + this.iconResource + ", lightThemeIconUrl=" + this.lightThemeIconUrl + ", darkThemeIconUrl=" + this.darkThemeIconUrl + ", iconRequiresTinting=" + this.iconRequiresTinting + ")";
    }
}
