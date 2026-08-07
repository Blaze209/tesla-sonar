package me;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.URL;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: me.c, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001e"}, d2 = {"Lme/c;", "Landroid/os/Parcelable;", "Ljava/net/URL;", "checkoutShopperBaseUrl", "checkoutAnalyticsBaseUrl", "<init>", "(Ljava/net/URL;Ljava/net/URL;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/net/URL;", "b", "()Ljava/net/URL;", "c", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Environment implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final URL checkoutShopperBaseUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final URL checkoutAnalyticsBaseUrl;
    public static final Parcelable.Creator<Environment> CREATOR = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Environment f91841d = new Environment(new URL("https://checkoutshopper-test.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-test.adyen.com/checkoutanalytics/"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Environment f91842e = new Environment(new URL("https://checkoutshopper-live.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live.adyen.com/checkoutanalytics/"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Environment f91843f = new Environment(new URL("https://checkoutshopper-live-us.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-us.adyen.com/checkoutanalytics/"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Environment f91844g = new Environment(new URL("https://checkoutshopper-live-au.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-au.adyen.com/checkoutanalytics/"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Environment f91845h = new Environment(new URL("https://checkoutshopper-live-in.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-in.adyen.com/checkoutanalytics/"));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Environment f91846i = new Environment(new URL("https://checkoutshopper-live-apse.adyen.com/checkoutshopper/"), new URL("https://checkoutanalytics-live-apse.adyen.com/checkoutanalytics/"));

    /* JADX INFO: renamed from: me.c$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Environment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Environment createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new Environment((URL) parcel.readSerializable(), (URL) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Environment[] newArray(int i11) {
            return new Environment[i11];
        }
    }

    public Environment(URL checkoutShopperBaseUrl, URL checkoutAnalyticsBaseUrl) {
        s.k(checkoutShopperBaseUrl, "checkoutShopperBaseUrl");
        s.k(checkoutAnalyticsBaseUrl, "checkoutAnalyticsBaseUrl");
        this.checkoutShopperBaseUrl = checkoutShopperBaseUrl;
        this.checkoutAnalyticsBaseUrl = checkoutAnalyticsBaseUrl;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final URL getCheckoutAnalyticsBaseUrl() {
        return this.checkoutAnalyticsBaseUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final URL getCheckoutShopperBaseUrl() {
        return this.checkoutShopperBaseUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Environment)) {
            return false;
        }
        Environment environment = (Environment) other;
        return s.f(this.checkoutShopperBaseUrl, environment.checkoutShopperBaseUrl) && s.f(this.checkoutAnalyticsBaseUrl, environment.checkoutAnalyticsBaseUrl);
    }

    public int hashCode() {
        return (this.checkoutShopperBaseUrl.hashCode() * 31) + this.checkoutAnalyticsBaseUrl.hashCode();
    }

    public String toString() {
        return "Environment(checkoutShopperBaseUrl=" + this.checkoutShopperBaseUrl + ", checkoutAnalyticsBaseUrl=" + this.checkoutAnalyticsBaseUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeSerializable(this.checkoutShopperBaseUrl);
        parcel.writeSerializable(this.checkoutAnalyticsBaseUrl);
    }
}
