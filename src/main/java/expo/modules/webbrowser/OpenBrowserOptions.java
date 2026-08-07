package expo.modules.webbrowser;

import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003Jd\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\t\u0010=\u001a\u00020\u0006HÖ\u0001R(\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0015\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0015\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R$\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010\u0010\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"¨\u0006>"}, d2 = {"Lexpo/modules/webbrowser/OpenBrowserOptions;", "Lexpo/modules/kotlin/records/Record;", "toolbarColor", "", "secondaryToolbarColor", "browserPackage", "", "showTitle", "", "enableDefaultShareMenuItem", "enableBarCollapsing", "showInRecents", "shouldCreateTask", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZZZZ)V", "getToolbarColor$annotations", "()V", "getToolbarColor", "()Ljava/lang/Integer;", "setToolbarColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSecondaryToolbarColor$annotations", "getSecondaryToolbarColor", "setSecondaryToolbarColor", "getBrowserPackage$annotations", "getBrowserPackage", "()Ljava/lang/String;", "setBrowserPackage", "(Ljava/lang/String;)V", "getShowTitle$annotations", "getShowTitle", "()Z", "setShowTitle", "(Z)V", "getEnableDefaultShareMenuItem$annotations", "getEnableDefaultShareMenuItem", "setEnableDefaultShareMenuItem", "getEnableBarCollapsing$annotations", "getEnableBarCollapsing", "setEnableBarCollapsing", "getShowInRecents$annotations", "getShowInRecents", "setShowInRecents", "getShouldCreateTask$annotations", "getShouldCreateTask", "setShouldCreateTask", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZZZZ)Lexpo/modules/webbrowser/OpenBrowserOptions;", "equals", "other", "", "hashCode", "toString", "expo-web-browser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OpenBrowserOptions implements Record {
    private String browserPackage;
    private boolean enableBarCollapsing;
    private boolean enableDefaultShareMenuItem;
    private Integer secondaryToolbarColor;
    private boolean shouldCreateTask;
    private boolean showInRecents;
    private boolean showTitle;
    private Integer toolbarColor;

    public OpenBrowserOptions() {
        this(null, null, null, false, false, false, false, false, 255, null);
    }

    public static /* synthetic */ OpenBrowserOptions copy$default(OpenBrowserOptions openBrowserOptions, Integer num, Integer num2, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = openBrowserOptions.toolbarColor;
        }
        if ((i11 & 2) != 0) {
            num2 = openBrowserOptions.secondaryToolbarColor;
        }
        if ((i11 & 4) != 0) {
            str = openBrowserOptions.browserPackage;
        }
        if ((i11 & 8) != 0) {
            z11 = openBrowserOptions.showTitle;
        }
        if ((i11 & 16) != 0) {
            z12 = openBrowserOptions.enableDefaultShareMenuItem;
        }
        if ((i11 & 32) != 0) {
            z13 = openBrowserOptions.enableBarCollapsing;
        }
        if ((i11 & 64) != 0) {
            z14 = openBrowserOptions.showInRecents;
        }
        if ((i11 & 128) != 0) {
            z15 = openBrowserOptions.shouldCreateTask;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        boolean z18 = z12;
        boolean z19 = z13;
        return openBrowserOptions.copy(num, num2, str, z11, z18, z19, z16, z17);
    }

    @Field
    public static /* synthetic */ void getBrowserPackage$annotations() {
    }

    @Field
    public static /* synthetic */ void getEnableBarCollapsing$annotations() {
    }

    @Field
    public static /* synthetic */ void getEnableDefaultShareMenuItem$annotations() {
    }

    @Field
    public static /* synthetic */ void getSecondaryToolbarColor$annotations() {
    }

    @Field(key = "createTask")
    public static /* synthetic */ void getShouldCreateTask$annotations() {
    }

    @Field
    public static /* synthetic */ void getShowInRecents$annotations() {
    }

    @Field
    public static /* synthetic */ void getShowTitle$annotations() {
    }

    @Field
    public static /* synthetic */ void getToolbarColor$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getToolbarColor() {
        return this.toolbarColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSecondaryToolbarColor() {
        return this.secondaryToolbarColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnableDefaultShareMenuItem() {
        return this.enableDefaultShareMenuItem;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEnableBarCollapsing() {
        return this.enableBarCollapsing;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowInRecents() {
        return this.showInRecents;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShouldCreateTask() {
        return this.shouldCreateTask;
    }

    public final OpenBrowserOptions copy(Integer toolbarColor, Integer secondaryToolbarColor, String browserPackage, boolean showTitle, boolean enableDefaultShareMenuItem, boolean enableBarCollapsing, boolean showInRecents, boolean shouldCreateTask) {
        return new OpenBrowserOptions(toolbarColor, secondaryToolbarColor, browserPackage, showTitle, enableDefaultShareMenuItem, enableBarCollapsing, showInRecents, shouldCreateTask);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenBrowserOptions)) {
            return false;
        }
        OpenBrowserOptions openBrowserOptions = (OpenBrowserOptions) other;
        return s.f(this.toolbarColor, openBrowserOptions.toolbarColor) && s.f(this.secondaryToolbarColor, openBrowserOptions.secondaryToolbarColor) && s.f(this.browserPackage, openBrowserOptions.browserPackage) && this.showTitle == openBrowserOptions.showTitle && this.enableDefaultShareMenuItem == openBrowserOptions.enableDefaultShareMenuItem && this.enableBarCollapsing == openBrowserOptions.enableBarCollapsing && this.showInRecents == openBrowserOptions.showInRecents && this.shouldCreateTask == openBrowserOptions.shouldCreateTask;
    }

    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    public final boolean getEnableBarCollapsing() {
        return this.enableBarCollapsing;
    }

    public final boolean getEnableDefaultShareMenuItem() {
        return this.enableDefaultShareMenuItem;
    }

    public final Integer getSecondaryToolbarColor() {
        return this.secondaryToolbarColor;
    }

    public final boolean getShouldCreateTask() {
        return this.shouldCreateTask;
    }

    public final boolean getShowInRecents() {
        return this.showInRecents;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final Integer getToolbarColor() {
        return this.toolbarColor;
    }

    public int hashCode() {
        Integer num = this.toolbarColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.secondaryToolbarColor;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.browserPackage;
        return ((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.showTitle)) * 31) + Boolean.hashCode(this.enableDefaultShareMenuItem)) * 31) + Boolean.hashCode(this.enableBarCollapsing)) * 31) + Boolean.hashCode(this.showInRecents)) * 31) + Boolean.hashCode(this.shouldCreateTask);
    }

    public final void setBrowserPackage(String str) {
        this.browserPackage = str;
    }

    public final void setEnableBarCollapsing(boolean z11) {
        this.enableBarCollapsing = z11;
    }

    public final void setEnableDefaultShareMenuItem(boolean z11) {
        this.enableDefaultShareMenuItem = z11;
    }

    public final void setSecondaryToolbarColor(Integer num) {
        this.secondaryToolbarColor = num;
    }

    public final void setShouldCreateTask(boolean z11) {
        this.shouldCreateTask = z11;
    }

    public final void setShowInRecents(boolean z11) {
        this.showInRecents = z11;
    }

    public final void setShowTitle(boolean z11) {
        this.showTitle = z11;
    }

    public final void setToolbarColor(Integer num) {
        this.toolbarColor = num;
    }

    public String toString() {
        return "OpenBrowserOptions(toolbarColor=" + this.toolbarColor + ", secondaryToolbarColor=" + this.secondaryToolbarColor + ", browserPackage=" + this.browserPackage + ", showTitle=" + this.showTitle + ", enableDefaultShareMenuItem=" + this.enableDefaultShareMenuItem + ", enableBarCollapsing=" + this.enableBarCollapsing + ", showInRecents=" + this.showInRecents + ", shouldCreateTask=" + this.shouldCreateTask + ")";
    }

    public OpenBrowserOptions(Integer num, Integer num2, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.toolbarColor = num;
        this.secondaryToolbarColor = num2;
        this.browserPackage = str;
        this.showTitle = z11;
        this.enableDefaultShareMenuItem = z12;
        this.enableBarCollapsing = z13;
        this.showInRecents = z14;
        this.shouldCreateTask = z15;
    }

    public /* synthetic */ OpenBrowserOptions(Integer num, Integer num2, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? false : z14, (i11 & 128) != 0 ? true : z15);
    }
}
