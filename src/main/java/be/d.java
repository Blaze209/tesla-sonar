package be;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import ce.k;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jn0.h0;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001\u0018BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0013\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b1\u00102R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b.\u00109\u0012\u0004\b:\u0010\u0015R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010<¨\u0006?"}, d2 = {"Lbe/d;", "Lce/k;", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "Ljava/util/Locale;", "shopperLocale", "Lcom/adyen/checkout/components/core/Amount;", "amount", "Lbe/b;", "analyticsConfiguration", "Lkotlin/Function1;", "Ljn0/h0;", "configurationBlock", "<init>", "(Lme/c;Ljava/lang/String;Ljava/util/Locale;Lcom/adyen/checkout/components/core/Amount;Lbe/b;Lwn0/l;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "j", "()V", Action.KEY_ATTRIBUTE, "configuration", "b", "(Ljava/lang/String;Lce/k;)V", "a", "(Lce/k;)V", "T", "g", "(Ljava/lang/String;)Lce/k;", "Ljava/lang/Class;", "configClass", "c", "(Ljava/lang/Class;)Lce/k;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lme/c;", "h", "()Lme/c;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/Locale;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/Locale;", DateTokenConverter.CONVERTER_KEY, "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "e", "Lbe/b;", "()Lbe/b;", "Lwn0/l;", "getConfigurationBlock$annotations", "", "Ljava/util/Map;", "availableConfigurations", "CREATOR", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements k {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Environment environment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String clientKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Locale shopperLocale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Amount amount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsConfiguration analyticsConfiguration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<d, h0> configurationBlock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, k> availableConfigurations;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbe/d;", "Ljn0/h0;", "a", "(Lbe/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f17050c = new a();

        a() {
            super(1);
        }

        public final void a(d dVar) {
            s.k(dVar, "$this$null");
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: be.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lbe/d$b;", "Landroid/os/Parcelable$Creator;", "Lbe/d;", "<init>", "()V", "Landroid/os/Parcel;", "source", "a", "(Landroid/os/Parcel;)Lbe/d;", "", "size", "", "b", "(I)[Lbe/d;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<d> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel source) {
            s.k(source, "source");
            return new d(source, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int size) {
            return new d[size];
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private final void j() {
        Locale shopperLocale = getShopperLocale();
        if (shopperLocale == null || re.b.a(shopperLocale)) {
            return;
        }
        throw new CheckoutException("Invalid shopper locale: " + getShopperLocale() + ".", null, 2, null);
    }

    public final void a(k configuration) {
        s.k(configuration, "configuration");
        Map<String, k> map = this.availableConfigurations;
        String name = configuration.getClass().getName();
        s.j(name, "getName(...)");
        map.put(name, configuration);
    }

    public final void b(String key, k configuration) {
        s.k(key, "key");
        s.k(configuration, "configuration");
        this.availableConfigurations.put(key, configuration);
    }

    public final <T extends k> T c(Class<T> configClass) {
        s.k(configClass, "configClass");
        k kVar = this.availableConfigurations.get(configClass.getName());
        if (kVar instanceof k) {
            return (T) kVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public Amount getAmount() {
        return this.amount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public String getClientKey() {
        return this.clientKey;
    }

    public final <T extends k> T g(String key) {
        s.k(key, "key");
        k kVar = this.availableConfigurations.get(key);
        if (kVar instanceof k) {
            return (T) kVar;
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public Environment getEnvironment() {
        return this.environment;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public Locale getShopperLocale() {
        return this.shopperLocale;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeSerializable(getShopperLocale());
        dest.writeParcelable(getEnvironment(), flags);
        dest.writeString(getClientKey());
        dest.writeParcelable(getAmount(), flags);
        dest.writeParcelable(getAnalyticsConfiguration(), flags);
        dest.writeInt(this.availableConfigurations.size());
        for (Map.Entry<String, k> entry : this.availableConfigurations.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeSerializable(entry.getValue().getClass());
            dest.writeParcelable(entry.getValue(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Environment environment, String clientKey, Locale locale, Amount amount, AnalyticsConfiguration analyticsConfiguration, l<? super d, h0> configurationBlock) {
        s.k(environment, "environment");
        s.k(clientKey, "clientKey");
        s.k(configurationBlock, "configurationBlock");
        this.environment = environment;
        this.clientKey = clientKey;
        this.shopperLocale = locale;
        this.amount = amount;
        this.analyticsConfiguration = analyticsConfiguration;
        this.configurationBlock = configurationBlock;
        this.availableConfigurations = new LinkedHashMap();
        configurationBlock.invoke(this);
        j();
    }

    public /* synthetic */ d(Environment environment, String str, Locale locale, Amount amount, AnalyticsConfiguration analyticsConfiguration, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(environment, str, (i11 & 4) != 0 ? null : locale, (i11 & 8) != 0 ? null : amount, (i11 & 16) != 0 ? null : analyticsConfiguration, (i11 & 32) != 0 ? a.f17050c : lVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"ParcelClassLoader"})
    private d(Parcel parcel) {
        Serializable serializable = parcel.readSerializable();
        Locale locale = serializable instanceof Locale ? (Locale) serializable : null;
        Parcelable parcelable = parcel.readParcelable(Environment.class.getClassLoader());
        if (parcelable != null) {
            Environment environment = (Environment) parcelable;
            String string = parcel.readString();
            if (string != null) {
                Amount amount = (Amount) parcel.readParcelable(Amount.class.getClassLoader());
                AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(Amount.class.getClassLoader());
                s.h(string);
                this(environment, string, locale, amount, analyticsConfiguration, null, 32, null);
                int i11 = parcel.readInt();
                for (int i12 = 0; i12 < i11; i12++) {
                    String string2 = parcel.readString();
                    if (string2 != null) {
                        s.j(string2, "requireNotNull(...)");
                        Serializable serializable2 = parcel.readSerializable();
                        s.i(serializable2, "null cannot be cast to non-null type java.lang.Class<com.adyen.checkout.components.core.internal.Configuration>");
                        Parcelable parcelable2 = parcel.readParcelable(((Class) serializable2).getClassLoader());
                        if (parcelable2 != null) {
                            s.j(parcelable2, "requireNotNull(...)");
                            this.availableConfigurations.put(string2, (k) parcelable2);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
