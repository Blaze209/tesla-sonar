package dd;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import be.AnalyticsConfiguration;
import ce.g;
import ce.k;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.e;
import me.Environment;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013Bc\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012*\u0010\u000f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\fj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b!\u0010,R8\u0010\u000f\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00010\fj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-¨\u0006."}, d2 = {"Ldd/b;", "Lce/k;", "Ljava/util/Locale;", "shopperLocale", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "Lbe/b;", "analyticsConfiguration", "Lcom/adyen/checkout/components/core/Amount;", "amount", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lkotlin/collections/HashMap;", "availableActionConfigs", "<init>", "(Ljava/util/Locale;Lme/c;Ljava/lang/String;Lbe/b;Lcom/adyen/checkout/components/core/Amount;Ljava/util/HashMap;)V", "", "a", "()Ljava/util/List;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Locale;", "f", "()Ljava/util/Locale;", "b", "Lme/c;", "e", "()Lme/c;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "Lbe/b;", "()Lbe/b;", "Lcom/adyen/checkout/components/core/Amount;", "()Lcom/adyen/checkout/components/core/Amount;", "Ljava/util/HashMap;", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements k {
    public static final Parcelable.Creator<b> CREATOR = new C1231b();

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
    private final HashMap<Class<?>, k> availableActionConfigs;

    /* JADX INFO: renamed from: dd.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C1231b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            Locale locale = (Locale) parcel.readSerializable();
            Environment environment = (Environment) parcel.readParcelable(b.class.getClassLoader());
            String string = parcel.readString();
            AnalyticsConfiguration analyticsConfiguration = (AnalyticsConfiguration) parcel.readParcelable(b.class.getClassLoader());
            Amount amount = (Amount) parcel.readParcelable(b.class.getClassLoader());
            int i11 = parcel.readInt();
            HashMap map = new HashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                map.put(parcel.readSerializable(), parcel.readParcelable(b.class.getClassLoader()));
            }
            return new b(locale, environment, string, analyticsConfiguration, amount, map, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public /* synthetic */ b(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, HashMap map, DefaultConstructorMarker defaultConstructorMarker) {
        this(locale, environment, str, analyticsConfiguration, amount, map);
    }

    public final List<k> a() {
        Collection<k> collectionValues = this.availableActionConfigs.values();
        s.j(collectionValues, "<get-values>(...)");
        return v.m1(collectionValues);
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
        HashMap<Class<?>, k> map = this.availableActionConfigs;
        parcel.writeInt(map.size());
        for (Map.Entry<Class<?>, k> entry : map.entrySet()) {
            parcel.writeSerializable(entry.getKey());
            parcel.writeParcelable(entry.getValue(), flags);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR>\u0010\u0017\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0012\u0004\u0012\u00020\u0011`\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ldd/b$a;", "Lce/g;", "Ldd/b;", "", "Lme/c;", AnalyticsAttribute.Environment, "", "clientKey", "<init>", "(Lme/c;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lme/c;Ljava/lang/String;)V", "j", "()Ldd/b;", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lce/k;", "Lkotlin/collections/HashMap;", "f", "Ljava/util/HashMap;", "getAvailableActionConfigs", "()Ljava/util/HashMap;", "availableActionConfigs", "action-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends g<b, a> {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final HashMap<Class<?>, k> availableActionConfigs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Environment environment, String clientKey) {
            super(environment, clientKey);
            s.k(environment, "environment");
            s.k(clientKey, "clientKey");
            this.availableActionConfigs = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ce.g
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b b() {
            return new b(getShopperLocale(), getEnvironment(), getClientKey(), getAnalyticsConfiguration(), getAmount(), this.availableActionConfigs, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @e
        public a(Context context, Environment environment, String clientKey) {
            super(context, environment, clientKey);
            s.k(context, "context");
            s.k(environment, "environment");
            s.k(clientKey, "clientKey");
            this.availableActionConfigs = new HashMap<>();
        }
    }

    private b(Locale locale, Environment environment, String str, AnalyticsConfiguration analyticsConfiguration, Amount amount, HashMap<Class<?>, k> map) {
        this.shopperLocale = locale;
        this.environment = environment;
        this.clientKey = str;
        this.analyticsConfiguration = analyticsConfiguration;
        this.amount = amount;
        this.availableActionConfigs = map;
    }
}
