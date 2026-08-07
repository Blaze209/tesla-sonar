package f30;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f30.o, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0018\u001aB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lf30/o;", "Landroid/os/Parcelable;", "", "publishableKey", "stripeAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "c", "b", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentConfiguration implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static PaymentConfiguration f64159d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publishableKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String stripeAccountId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<PaymentConfiguration> CREATOR = new b();

    /* JADX INFO: renamed from: f30.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf30/o$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf30/o;", "c", "(Landroid/content/Context;)Lf30/o;", "a", "", "publishableKey", "stripeAccountId", "Ljn0/h0;", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "instance", "Lf30/o;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PaymentConfiguration c(Context context) {
            PaymentConfiguration paymentConfigurationA = new c(context).a();
            if (paymentConfigurationA == null) {
                throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
            }
            PaymentConfiguration.f64159d = paymentConfigurationA;
            return paymentConfigurationA;
        }

        public final PaymentConfiguration a(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            PaymentConfiguration paymentConfiguration = PaymentConfiguration.f64159d;
            return paymentConfiguration == null ? c(context) : paymentConfiguration;
        }

        public final void b(Context context, String publishableKey, String stripeAccountId) {
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
            PaymentConfiguration.f64159d = new PaymentConfiguration(publishableKey, stripeAccountId);
            new c(context).b(publishableKey, stripeAccountId);
            u.c(context, null, 2, null).b();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: f30.o$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PaymentConfiguration> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentConfiguration createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new PaymentConfiguration(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentConfiguration[] newArray(int i11) {
            return new PaymentConfiguration[i11];
        }
    }

    /* JADX INFO: renamed from: f30.o$c */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Lf30/o$c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "publishableKey", "stripeAccountId", "Ljn0/h0;", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "Lf30/o;", "a", "()Lf30/o;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "prefs", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f64162b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f64163c = PaymentConfiguration.class.getCanonicalName();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SharedPreferences prefs;

        /* JADX INFO: renamed from: f30.o$c$a */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lf30/o$c$a;", "", "<init>", "()V", "", "KEY_ACCOUNT_ID", "Ljava/lang/String;", "KEY_PUBLISHABLE_KEY", "kotlin.jvm.PlatformType", "NAME", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public c(Context context) {
            p013kotlin.jvm.internal.s.k(context, "context");
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f64163c, 0);
            p013kotlin.jvm.internal.s.j(sharedPreferences, "getSharedPreferences(...)");
            this.prefs = sharedPreferences;
        }

        public final /* synthetic */ PaymentConfiguration a() {
            String string = this.prefs.getString("key_publishable_key", null);
            if (string != null) {
                return new PaymentConfiguration(string, this.prefs.getString("key_account_id", null));
            }
            return null;
        }

        public final /* synthetic */ void b(String publishableKey, String stripeAccountId) {
            p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
            this.prefs.edit().putString("key_publishable_key", publishableKey).putString("key_account_id", stripeAccountId).apply();
        }
    }

    public PaymentConfiguration(String publishableKey, String str) {
        p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        o30.a.INSTANCE.a().b(publishableKey);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentConfiguration)) {
            return false;
        }
        PaymentConfiguration paymentConfiguration = (PaymentConfiguration) other;
        return p013kotlin.jvm.internal.s.f(this.publishableKey, paymentConfiguration.publishableKey) && p013kotlin.jvm.internal.s.f(this.stripeAccountId, paymentConfiguration.stripeAccountId);
    }

    public int hashCode() {
        int iHashCode = this.publishableKey.hashCode() * 31;
        String str = this.stripeAccountId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PaymentConfiguration(publishableKey=" + this.publishableKey + ", stripeAccountId=" + this.stripeAccountId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.publishableKey);
        parcel.writeString(this.stripeAccountId);
    }
}
