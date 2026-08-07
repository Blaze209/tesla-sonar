package of;

import android.os.Parcel;
import android.os.Parcelable;
import be.AnalyticsConfiguration;
import ce.k;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B7\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\u0017\u0010%¨\u0006&"}, d2 = {"Lof/f;", "Lce/k;", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "Lbe/b;", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/Amount;", "amount", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;Lbe/b;Lcom/adyen/checkout/components/core/Amount;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/Locale;", "e", "()Ljava/util/Locale;", "b", "Lme/c;", DateTokenConverter.CONVERTER_KEY, "()Lme/c;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "Lbe/b;", "()Lbe/b;", "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f implements k {
    public static final Parcelable.Creator<f> CREATOR = new b();

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lof/f$a;", "Lce/g;", "Lof/f;", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;)V", "j", "()Lof/f;", "voucher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ce.g<f, a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locale shopperLocale, Environment environment, String clientKey) {
            super(shopperLocale, environment, clientKey);
            s.k(shopperLocale, "shopperLocale");
            s.k(environment, "environment");
            s.k(clientKey, "clientKey");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ce.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public f b() {
            return new f(getShopperLocale(), getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), getClientKey(), getAnalyticsConfiguration(), getAmount(), null);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new f((Locale) parcel.readSerializable(), (Environment) parcel.readParcelable(f.class.getClassLoader()), parcel.readString(), (AnalyticsConfiguration) parcel.readParcelable(f.class.getClassLoader()), (Amount) parcel.readParcelable(f.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f[] newArray(int i11) {
            return new f[i11];
        }
    }

    public /* synthetic */ f(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount);
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeSerializable(this.shopperLocale);
        parcel.writeParcelable(this.environment, flags);
        parcel.writeString(this.clientKey);
        parcel.writeParcelable(this.analyticsConfiguration, flags);
        parcel.writeParcelable(this.amount, flags);
    }

    private f(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
    }
}
