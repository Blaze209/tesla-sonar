package hd;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import be.AnalyticsConfiguration;
import ce.g;
import ce.k;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.threeds2.customization.UiCustomization;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import jn0.e;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aBK\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u001e\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b\u001a\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b)\u0010$¨\u0006-"}, d2 = {"Lhd/b;", "Lce/k;", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "Lbe/b;", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/Amount;", "amount", "Lcom/adyen/threeds2/customization/UiCustomization;", "uiCustomization", "threeDSRequestorAppURL", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;Lbe/b;Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/threeds2/customization/UiCustomization;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Locale;", "e", "()Ljava/util/Locale;", "b", "Lme/c;", DateTokenConverter.CONVERTER_KEY, "()Lme/c;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "Lbe/b;", "()Lbe/b;", "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "f", "Lcom/adyen/threeds2/customization/UiCustomization;", "g", "()Lcom/adyen/threeds2/customization/UiCustomization;", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements k {
    public static final Parcelable.Creator<b> CREATOR = new C1524b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Locale shopperLocale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Environment environment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String clientKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsConfiguration analyticsConfiguration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Amount amount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final UiCustomization uiCustomization;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String threeDSRequestorAppURL;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhd/b$a;", "Lce/g;", "Lhd/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "<init>", "(Landroid/content/Context;Lme/c;Ljava/lang/String;)V", "j", "()Lhd/b;", "Lcom/adyen/threeds2/customization/UiCustomization;", "f", "Lcom/adyen/threeds2/customization/UiCustomization;", "uiCustomization", "g", "Ljava/lang/String;", "threeDSRequestorAppURL", "3ds2_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends g<b, a> {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private UiCustomization uiCustomization;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private String threeDSRequestorAppURL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public a(Context context, Environment environment, String clientKey) {
            super(context, environment, clientKey);
            s.k(context, "context");
            s.k(environment, "environment");
            s.k(clientKey, "clientKey");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ce.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b b() {
            return new b(getShopperLocale(), getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.uiCustomization, this.threeDSRequestorAppURL, null);
        }
    }

    /* JADX INFO: renamed from: hd.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1524b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new b((Locale) parcel.readSerializable(), (Environment) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), (AnalyticsConfiguration) parcel.readParcelable(b.class.getClassLoader()), (Amount) parcel.readParcelable(b.class.getClassLoader()), (UiCustomization) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public /* synthetic */ b(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, UiCustomization uiCustomization, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, uiCustomization, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getClientKey() {
        return this.clientKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public Environment getEnvironment() {
        return this.environment;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getThreeDSRequestorAppURL() {
        return this.threeDSRequestorAppURL;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final UiCustomization getUiCustomization() {
        return this.uiCustomization;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeSerializable(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
        parcel.writeParcelable(this.analyticsConfiguration, flags);
        parcel.writeParcelable(this.amount, flags);
        parcel.writeParcelable(this.uiCustomization, flags);
        parcel.writeString(this.threeDSRequestorAppURL);
    }

    private b(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, UiCustomization uiCustomization, String str2) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.uiCustomization = uiCustomization;
        this.threeDSRequestorAppURL = str2;
    }
}
