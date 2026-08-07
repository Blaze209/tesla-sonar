package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.google.android.gms.common.internal.ImagesContract;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.List;
import mi0.UiComponentScreen;
import oi0.CtaCardPage;
import oi0.n5;
import oi0.w4;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001\u001cBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB)\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ`\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b+\u0010.R\"\u0010\t\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b/\u0010.\"\u0004\b0\u00101R\"\u0010\n\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010.\"\u0004\b4\u00101R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010.R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "Loi0/w4;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "ctaCard", ImagesContract.URL, "", "autoCompleteOnDismiss", "shown", "showing", "hideWhenTappedOutside", "Lmi0/g;", AnalyticsContext.Screen, "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLmi0/g;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;Ljava/lang/String;ZZZZLmi0/g;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;", "c", "e", "Z", "()Z", "w1", "y0", "(Z)V", "f", "H2", "d1", "g", "D0", "h", "Lmi0/g;", "getScreen", "()Lmi0/g;", IntegerTokenConverter.CONVERTER_KEY, "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CreatePersonaSheetComponent implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CreatePersonaSheet.CardCtaPage ctaCard;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean autoCompleteOnDismiss;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean shown;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean showing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hideWhenTappedOutside;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final UiComponentScreen screen;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CreatePersonaSheetComponent> CREATOR = new b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/a$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreatePersonaSheetComponent a(CreatePersonaSheet config) {
            CreatePersonaSheet.Pages pages;
            CreatePersonaSheet.CardCtaPage ctaCard;
            CreatePersonaSheet.Attributes attributes;
            String url;
            Boolean autoCompleteOnDismiss;
            s.k(config, "config");
            CreatePersonaSheet.Attributes attributes2 = config.getAttributes();
            if (attributes2 == null || (pages = attributes2.getPages()) == null || (ctaCard = pages.getCtaCard()) == null || (attributes = config.getAttributes()) == null || (url = attributes.getUrl()) == null) {
                return null;
            }
            CreatePersonaSheet.Attributes attributes3 = config.getAttributes();
            return new CreatePersonaSheetComponent(config, ctaCard, url, (attributes3 == null || (autoCompleteOnDismiss = attributes3.getAutoCompleteOnDismiss()) == null) ? false : autoCompleteOnDismiss.booleanValue());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.a$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CreatePersonaSheetComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CreatePersonaSheetComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            CreatePersonaSheet.CardCtaPage cardCtaPage = (CreatePersonaSheet.CardCtaPage) parcel.readParcelable(CreatePersonaSheetComponent.class.getClassLoader());
            String string2 = parcel.readString();
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            if (parcel.readInt() == 0) {
                z12 = z11;
            }
            return new CreatePersonaSheetComponent(string, cardCtaPage, string2, z11, z12, z12, parcel.readInt() != 0, UiComponentScreen.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreatePersonaSheetComponent[] newArray(int i11) {
            return new CreatePersonaSheetComponent[i11];
        }
    }

    public CreatePersonaSheetComponent(String name, CreatePersonaSheet.CardCtaPage ctaCard, String url, boolean z11, boolean z12, boolean z13, boolean z14, UiComponentScreen screen) {
        s.k(name, "name");
        s.k(ctaCard, "ctaCard");
        s.k(url, "url");
        s.k(screen, "screen");
        this.name = name;
        this.ctaCard = ctaCard;
        this.url = url;
        this.autoCompleteOnDismiss = z11;
        this.shown = z12;
        this.showing = z13;
        this.hideWhenTappedOutside = z14;
        this.screen = screen;
    }

    public static /* synthetic */ CreatePersonaSheetComponent b(CreatePersonaSheetComponent createPersonaSheetComponent, String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z11, boolean z12, boolean z13, boolean z14, UiComponentScreen uiComponentScreen, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = createPersonaSheetComponent.name;
        }
        if ((i11 & 2) != 0) {
            cardCtaPage = createPersonaSheetComponent.ctaCard;
        }
        if ((i11 & 4) != 0) {
            str2 = createPersonaSheetComponent.url;
        }
        if ((i11 & 8) != 0) {
            z11 = createPersonaSheetComponent.autoCompleteOnDismiss;
        }
        if ((i11 & 16) != 0) {
            z12 = createPersonaSheetComponent.shown;
        }
        if ((i11 & 32) != 0) {
            z13 = createPersonaSheetComponent.showing;
        }
        if ((i11 & 64) != 0) {
            z14 = createPersonaSheetComponent.hideWhenTappedOutside;
        }
        if ((i11 & 128) != 0) {
            uiComponentScreen = createPersonaSheetComponent.screen;
        }
        boolean z15 = z14;
        UiComponentScreen uiComponentScreen2 = uiComponentScreen;
        boolean z16 = z12;
        boolean z17 = z13;
        return createPersonaSheetComponent.a(str, cardCtaPage, str2, z11, z16, z17, z15, uiComponentScreen2);
    }

    @Override // oi0.w4
    /* JADX INFO: renamed from: D0, reason: from getter */
    public boolean getHideWhenTappedOutside() {
        return this.hideWhenTappedOutside;
    }

    @Override // oi0.w4
    /* JADX INFO: renamed from: H2, reason: from getter */
    public boolean getShowing() {
        return this.showing;
    }

    public final CreatePersonaSheetComponent a(String name, CreatePersonaSheet.CardCtaPage ctaCard, String url, boolean autoCompleteOnDismiss, boolean shown, boolean showing, boolean hideWhenTappedOutside, UiComponentScreen screen) {
        s.k(name, "name");
        s.k(ctaCard, "ctaCard");
        s.k(url, "url");
        s.k(screen, "screen");
        return new CreatePersonaSheetComponent(name, ctaCard, url, autoCompleteOnDismiss, shown, showing, hideWhenTappedOutside, screen);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutoCompleteOnDismiss() {
        return this.autoCompleteOnDismiss;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CreatePersonaSheet.CardCtaPage getCtaCard() {
        return this.ctaCard;
    }

    @Override // oi0.w4
    public void d1(boolean z11) {
        this.showing = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePersonaSheetComponent)) {
            return false;
        }
        CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) other;
        return s.f(this.name, createPersonaSheetComponent.name) && s.f(this.ctaCard, createPersonaSheetComponent.ctaCard) && s.f(this.url, createPersonaSheetComponent.url) && this.autoCompleteOnDismiss == createPersonaSheetComponent.autoCompleteOnDismiss && this.shown == createPersonaSheetComponent.shown && this.showing == createPersonaSheetComponent.showing && this.hideWhenTappedOutside == createPersonaSheetComponent.hideWhenTappedOutside && s.f(this.screen, createPersonaSheetComponent.screen);
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    @Override // oi0.w4
    public UiComponentScreen getScreen() {
        return this.screen;
    }

    public int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + this.ctaCard.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.autoCompleteOnDismiss)) * 31) + Boolean.hashCode(this.shown)) * 31) + Boolean.hashCode(this.showing)) * 31) + Boolean.hashCode(this.hideWhenTappedOutside)) * 31) + this.screen.hashCode();
    }

    public String toString() {
        return "CreatePersonaSheetComponent(name=" + this.name + ", ctaCard=" + this.ctaCard + ", url=" + this.url + ", autoCompleteOnDismiss=" + this.autoCompleteOnDismiss + ", shown=" + this.shown + ", showing=" + this.showing + ", hideWhenTappedOutside=" + this.hideWhenTappedOutside + ", screen=" + this.screen + ")";
    }

    @Override // oi0.w4
    /* JADX INFO: renamed from: w1, reason: from getter */
    public boolean getShown() {
        return this.shown;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.ctaCard, flags);
        dest.writeString(this.url);
        dest.writeInt(this.autoCompleteOnDismiss ? 1 : 0);
        dest.writeInt(this.shown ? 1 : 0);
        dest.writeInt(this.showing ? 1 : 0);
        dest.writeInt(this.hideWhenTappedOutside ? 1 : 0);
        this.screen.writeToParcel(dest, flags);
    }

    @Override // oi0.w4
    public void y0(boolean z11) {
        this.shown = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreatePersonaSheetComponent(String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z11, boolean z12, boolean z13, boolean z14, UiComponentScreen uiComponentScreen, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        z12 = (i11 & 16) != 0 ? false : z12;
        z13 = (i11 & 32) != 0 ? false : z13;
        z14 = (i11 & 64) != 0 ? false : z14;
        if ((i11 & 128) != 0) {
            List<UiComponentConfig> components = cardCtaPage.getUiStep().getConfig().getComponents();
            List<n5> listH = components != null ? g.h(components) : null;
            List<UiComponentConfig> components2 = cardCtaPage.getUiStep().getConfig().getComponents();
            uiComponentScreen = mi0.c.a(new CtaCardPage(listH, components2 == null ? v.m() : components2, cardCtaPage.getUiStep().getStyles()));
        }
        this(str, cardCtaPage, str2, z11, z12, z13, z14, uiComponentScreen);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreatePersonaSheetComponent(CreatePersonaSheet config, CreatePersonaSheet.CardCtaPage ctaCard, String url, boolean z11) {
        this(config.getName(), ctaCard, url, z11, false, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        s.k(config, "config");
        s.k(ctaCard, "ctaCard");
        s.k(url, "url");
    }
}
