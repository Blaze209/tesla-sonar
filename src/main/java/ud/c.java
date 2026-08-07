package ud;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import be.AnalyticsConfiguration;
import ce.k;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cBI\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b \u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001c\u0010.R\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b,\u00100¨\u00061"}, d2 = {"Lud/c;", "Lce/k;", "Lce/h;", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "Lbe/b;", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/Amount;", "amount", "", "isSubmitButtonVisible", "Ldd/b;", "genericActionConfiguration", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;Lbe/b;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/Boolean;Ldd/b;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Locale;", "g", "()Ljava/util/Locale;", "b", "Lme/c;", "e", "()Lme/c;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Lbe/b;", "()Lbe/b;", "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ldd/b;", "()Ldd/b;", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements k, ce.h {
    public static final Parcelable.Creator<c> CREATOR = new b();

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
    private final Boolean isSubmitButtonVisible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final dd.b genericActionConfiguration;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B!\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lud/c$a;", "Led/a;", "Lud/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "<init>", "(Landroid/content/Context;Lme/c;Ljava/lang/String;)V", "", "isSubmitButtonVisible", "l", "(Z)Lud/c$a;", "k", "()Lud/c;", "g", "Ljava/lang/Boolean;", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ed.a<c, a> {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private Boolean isSubmitButtonVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @jn0.e
        public a(Context context, Environment environment, String clientKey) {
            super(context, environment, clientKey);
            s.k(context, "context");
            s.k(environment, "environment");
            s.k(clientKey, "clientKey");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ce.g
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c(getShopperLocale(), getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.isSubmitButtonVisible, getGenericActionConfigurationBuilder().a(), null);
        }

        public a l(boolean isSubmitButtonVisible) {
            this.isSubmitButtonVisible = Boolean.valueOf(isSubmitButtonVisible);
            return this;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            s.k(parcel, "parcel");
            Locale locale = (Locale) parcel.readSerializable();
            Environment environment = (Environment) parcel.readParcelable(c.class.getClassLoader());
            String string = parcel.readString();
            AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(c.class.getClassLoader());
            Amount amount = (Amount) parcel.readParcelable(c.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new c(locale, environment, string, analyticsConfiguration, amount, boolValueOf, (dd.b) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public /* synthetic */ c(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, dd.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, bool, bVar);
    }

    @Override // ce.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public Boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public String getClientKey() {
        return this.clientKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public Environment getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final dd.b getGenericActionConfiguration() {
        return this.genericActionConfiguration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        ?? BooleanValue;
        s.k(parcel, "out");
        parcel.writeSerializable(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
        parcel.writeParcelable(this.analyticsConfiguration, flags);
        parcel.writeParcelable(this.amount, flags);
        Boolean bool = this.isSubmitButtonVisible;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeParcelable(this.genericActionConfiguration, flags);
    }

    private c(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, Boolean bool, dd.b bVar) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.isSubmitButtonVisible = bool;
        this.genericActionConfiguration = bVar;
    }
}
